package com.gec.gecmall.service.impl;


import com.gec.gecmall.mapper.UserMapper;
import com.gec.gecmall.service.UserService;
import com.gec.gecmall.bean.UmsMember;
import com.gec.gecmall.bean.UmsMemberReceiveAddress;
import com.gec.gecmall.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
