package com.keithcollier.petdemo.controller;

import com.keithcollier.petdemo.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"","/","/index","/index.html","/find"})
        public String listVets(Model model){

        model.addAttribute("owners", ownerService.findAll());
            return "owners/index";
        }

    }
