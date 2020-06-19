package com.maoc.controller;

import com.maoc.domain.Dealer;
import com.maoc.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dealer")
public class DealerController {
    @Autowired
    private DealerService dealerService;

    @RequestMapping("/province")
    public String findByProvince(String province, Model model){
        List<Dealer> dealers = dealerService.findByProvince(province);
        model.addAttribute("dealers",dealers);
        return "list.jsp";
    }
}
