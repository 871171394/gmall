package com.gec.gecmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gec.gecmall.bean.UmsMember;
import com.gec.gecmall.bean.UmsMemberReceiveAddress;
import com.gec.gecmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getUmsMember")
    @ResponseBody
    public List<UmsMember> getUmsMember(){
        return userService.getAllUser();
    }

    @RequestMapping("/getReceiveAddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressById(String id){

        return userService.getReceiveAddressByMemberId(id);
    }
}
