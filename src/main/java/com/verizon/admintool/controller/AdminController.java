package com.verizon.admintool.controller;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import com.verizon.admintool.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rules")
@CrossOrigin(origins = {"http://localhost:8085"})
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/getRules")
    public List<AdminRule> getRules() {
        return adminService.getRules();
    }

    @GetMapping("/getRule")
    public AdminRule getRule(@RequestParam Integer ruleId) {
        return adminService.getRule(ruleId);
    }

    @PostMapping("/setParser")
    public String setParser(@RequestBody AdminRequest adminRequest) {
        System.out.println("set parser request is " + adminRequest.getParser());
        adminService.setParser(adminRequest);
        return "success";
    }
//
//    @DeleteMapping("/deleteRule")
//    public List<AdminRule> deleteRule() {
//        return adminService.getRules();
//    }
}
