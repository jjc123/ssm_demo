package com.ssm.demo.controller;

import com.ssm.demo.entity.Description;
import com.ssm.demo.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 13 on 2018/6/27.
 */
@Controller
@RequestMapping("description")
public class DescriptionControler {

    @Autowired
    private DescriptionService descriptionService;


    /**
     * 信息
     */
    @RequestMapping("infoByRequest")
    public String infoByRequest(Model model) {
        Description description = descriptionService.getLastDescription();
        System.out.println("description:"+description);
        model.addAttribute("description", description);
        return "/description";
    }
}
