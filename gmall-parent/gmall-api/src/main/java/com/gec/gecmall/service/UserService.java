package com.gec.gecmall.service;


import com.gec.gecmall.bean.UmsMember;
import com.gec.gecmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
