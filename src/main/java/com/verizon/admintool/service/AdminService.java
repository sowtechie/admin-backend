package com.verizon.admintool.service;

import com.verizon.admintool.model.AdminRule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface AdminService {
    public List<AdminRule> getRules(Boolean considerParser);

    public AdminRule getRule(Integer ruleId);
}
