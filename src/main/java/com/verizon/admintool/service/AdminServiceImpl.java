package com.verizon.admintool.service;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    List<AdminRule> rules = new ArrayList<>();// Create new List of rules object
    Boolean parserMode = false;

    public AdminServiceImpl() {
        AdminRule adminRule = new AdminRule();//Create AdminRule object
        adminRule.setRuleId(123); // Set values in that object
        adminRule.setRuleName("TV_MOBILE");
        adminRule.setRuleDescription("Home TV with Mobile connection");
        adminRule.setRuleType("HomeCustomer");

        AdminRule adminRule2= new AdminRule(); // adminRule2: AdminRule = new AdminRule();
        adminRule2.setRuleId(456);
        adminRule2.setRuleName("Apple_Phone_Deal");
        adminRule2.setRuleDescription("iPhoneX for new home internet deal");
        rules.add(adminRule);
        rules.add(adminRule2);
    }

    public List<AdminRule> getRules() {
        List<AdminRule> modifiedrules = new ArrayList<>(rules);
        if (this.parserMode) {
            modifiedrules.remove(0);
        }
        return modifiedrules;
    }

    public AdminRule getRule(Integer ruleId) {
        for (AdminRule rule : rules) {
            if (rule.getRuleId() == ruleId) {
                return rule;
            }
        };
        return null;
    }

    public void setParser(AdminRequest adminRequest) {
        this.parserMode = adminRequest.getParser();
    }
}
