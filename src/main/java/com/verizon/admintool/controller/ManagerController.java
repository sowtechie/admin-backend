package com.verizon.admintool.controller;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import com.verizon.admintool.model.UrlStatus;
import com.verizon.admintool.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "*")
public class ManagerController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/groupnames")
    public String getGroupNames() {
        return "[\n" +
                "    {\n" +
                "        \"groupName\": \"Billing\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"groupName\": \"Accounts\"\n" +
                "    }\n" +
                "]\n";
//        return "[\n" +
//                "        {\n" +
//                "            \"text\": \"Order\",\n" +
//                "            \"value\": \"order\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"getgroupnamestext\": \"PaymentNew\",\n" +
//                "            \"value\": \"paymentNew\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"text\": \"Billing\",\n" +
//                "            \"value\": \"Billing\"\n" +
//                "        }\n" +
//                "    ]";
    }

    @GetMapping("/friendlyurls")
    public String getAllFriendlyURLs() {
        return "[\n" +
                "        \"http://verizonwireless.com\",\n" +
                "        \"http://infosys.com\"\n" +
                "    ]";
    }


    @GetMapping("/getRules")
    public List<AdminRule> getRules() {
        return adminService.getRules();
    }

    @GetMapping("/getRule")
    public AdminRule getRule(@RequestParam Integer ruleId) {
        return adminService.getRule(ruleId);
    }
    
    @PostMapping("/rule")
    public String publish(@RequestBody String payload) {
        System.out.println(payload);
        return "Published successfully";
    }


//
//    @DeleteMapping("/deleteRule")
//    public List<AdminRule> deleteRule() {
//        return adminService.getRules();
//    }
}
