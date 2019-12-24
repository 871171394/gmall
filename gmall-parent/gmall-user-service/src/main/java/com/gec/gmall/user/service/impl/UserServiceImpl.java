package com.gec.gmall.user.service.impl;


import com.gec.gecmall.bean.UmsMember;
import com.gec.gecmall.bean.UmsMemberReceiveAddress;
import com.gec.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.gec.gmall.user.mapper.UserMapper;
import com.gec.gecmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(memberId);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return select;
    }
}
