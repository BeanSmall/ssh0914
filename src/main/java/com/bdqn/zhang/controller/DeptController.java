package com.bdqn.zhang.controller;


import com.bdqn.zhang.pojo.Dept;
import com.bdqn.zhang.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Resource
    private DeptService deptService;

    @RequestMapping("/getById")
    public String getDeptById(Model model){
        Dept dept = deptService.getDeptById();
        model.addAttribute("dept",dept);
        return "main";
    }
}
