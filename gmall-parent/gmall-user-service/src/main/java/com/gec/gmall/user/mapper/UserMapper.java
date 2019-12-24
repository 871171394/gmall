package com.gec.gmall.user.mapper;


import com.gec.gecmall.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
