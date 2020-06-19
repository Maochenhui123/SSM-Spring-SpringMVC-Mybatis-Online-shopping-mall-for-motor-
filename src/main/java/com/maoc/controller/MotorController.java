package com.maoc.controller;

import com.maoc.dao.DealerDao;
import com.maoc.domain.Dealer;
import com.maoc.domain.Inventory;
import com.maoc.domain.Item;
import com.maoc.domain.Motor;
import com.maoc.service.DealerService;
import com.maoc.service.InventoryService;
import com.maoc.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/motor")
@SessionAttributes(value = {"motor","dealer"})
public class MotorController {

    @Autowired
    MotorService motorService;

    @Autowired
    DealerService dealerService;

    @Autowired
    InventoryService inventoryService;

    @RequestMapping("/findMotorByName")
    public String findMotorByName(Motor motor, Model model){
        motor = motorService.findMotorByName(motor.getName());
        System.out.println(motor);
        model.addAttribute("motor",motor);
        return "info.jsp";
    }

    @RequestMapping("/findFromDealer")
    public String findFromDealer(Dealer dealer,ModelMap map, Model model){
        dealer =dealerService.findByDealerName(dealer.getDealerName());
        Motor motor = (Motor) map.get("motor");

        Item item = new Item();
        item.setDealerName(dealer.getDealerName());
        item.setName(motor.getName());

        Inventory inventory = inventoryService.findNumberfromdealer(item);
        model.addAttribute("dealer",dealer);
        model.addAttribute("inventory",inventory);
        return "balance.jsp";
    }

    @RequestMapping("/purchase")
    public String purchase(){
        return "appointment.jsp";
    }
}
