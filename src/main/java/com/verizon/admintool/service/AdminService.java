package com.verizon.admintool.service;

import com.verizon.admintool.model.AdminRequest;
import com.verizon.admintool.model.AdminRule;
import com.verizon.admintool.model.UrlStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface AdminService {
    public List<AdminRule> getRules();

    public List<UrlStatus> getUrlStatus();

    public AdminRule getRule(Integer ruleId);

    public void setParser(AdminRequest adminRequest);
}
