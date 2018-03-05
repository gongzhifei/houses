package com.gzf.house.mapper;

import com.gzf.house.commonm.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();

}
