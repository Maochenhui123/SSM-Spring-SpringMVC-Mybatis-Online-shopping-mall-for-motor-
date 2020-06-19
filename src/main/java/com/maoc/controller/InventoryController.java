package com.maoc.controller;


import com.maoc.domain.Inventory;
import com.maoc.domain.Item;
import com.maoc.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @RequestMapping("/findNumber")
    public String findNumberfromdealer(Item item, Model model){

        Inventory inventory = inventoryService.findNumberfromdealer(item);
        model.addAttribute("inven1",inventory);
        return "list.jsp";
    }

    @RequestMapping("/update")
    public String findByNameAndId(Inventory inventory, Model model){
        inventory = inventoryService.findByNameAndId(inventory);
        inventory.setNumber(0);
        inventoryService.updateInventory(inventory);
        inventory = inventoryService.findByNameAndId(inventory);
        model.addAttribute("inven2",inventory);
        return "list.jsp";
    }

}
