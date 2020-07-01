package com.verizon.admintool.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alias")
@CrossOrigin(origins = "*")
public class AliasController {

    @GetMapping("/parameternames")
    public String getAllParameterNameAlias() {
        return "[\n" +
                "    {\n" +
                "        \"parameterName\": \"timeout-access\",\n" +
                "        \"alias\": [\n" +
                "            \"authToken\",\n" +
                "            \"authKey\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"parameterName\": \"x-forwarded-for\",\n" +
                "        \"alias\": [\n" +
                "            \"IPAddress\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"parameterName\": \"user\",\n" +
                "        \"alias\": [\n" +
                "            \"USERID\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"parameterName\": \"acct\",\n" +
                "        \"alias\": [\n" +
                "            \"ACCOUNT\"\n" +
                "        ]\n" +
                "    }\n" +
                "]\n";
    }
}
