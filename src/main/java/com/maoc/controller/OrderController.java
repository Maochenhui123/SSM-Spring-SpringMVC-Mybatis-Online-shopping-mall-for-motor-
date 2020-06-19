package com.maoc.controller;

import com.maoc.domain.Item;
import com.maoc.domain.Orders;
import com.maoc.service.InventoryService;
import com.maoc.service.MotorService;
import com.maoc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/order")
@SessionAttributes(value = {"order"})
public class OrderController {

    @Autowired
    OrderService orderService;
    @Autowired
    MotorService motorService;
    @Autowired
    InventoryService inventoryService;

    @RequestMapping("/confirm")
    public String confirm(Orders order, Item item, Model model){
        model.addAttribute("order",order);
        model.addAttribute("item",item);
        return "confirm.jsp";
    }

    @RequestMapping("/insertOrder")
    public String insertOrder(ModelMap map) throws Exception{
        String id = Thread.currentThread().getName() + System.currentTimeMillis();
        Orders order = (Orders) map.get("order");
        order.setOrderId(id);

        orderService.insertOrder(order);
        return "paysuccess.html";
    }


}
