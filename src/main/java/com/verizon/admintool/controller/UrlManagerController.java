package com.verizon.admintool.controller;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import com.verizon.admintool.model.UrlStatus;
import com.verizon.admintool.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "*")
public class UrlManagerController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/parser")
    public String setParser(@RequestBody AdminRequest adminRequest) {
        System.out.println("set parser request is " + adminRequest.getParser());
        adminService.setParser(adminRequest);
        return "success";
    }

    @GetMapping("/urls")
    public String getHeaderStatusses(@RequestParam String status) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get("D:\\code\\Mine\\admin-backend\\src\\main\\resources\\data\\headerStatus.json"), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            System.out.println("error" + e);
        }
        return contentBuilder.toString();
    }

    @GetMapping("/getUrlStatus")
    public List<UrlStatus> getUrlStatus() {
        return adminService.getUrlStatus();
    }

}
