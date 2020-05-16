package com.verizon.admintool.service;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface AdminService {
    public List<AdminRule> getRules();

    public AdminRule getRule(Integer ruleId);

    public void setParser(AdminRequest adminRequest);
}
