package com.yt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yitao on 2016/6/12.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/toadd")
    public String toAdd(){
        return "/admin/add";
    }
    @RequestMapping("/todelete")
    public String toDelete(){
        return "/admin/delete";
    }
}
