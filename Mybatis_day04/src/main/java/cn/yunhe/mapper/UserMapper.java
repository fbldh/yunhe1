package cn.yunhe.mapper;

import cn.yunhe.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findUserById(Integer id);
    @Select("select * from user u,user_role ur where u.id=ur.uid and rid=#{rid}")
    User findUserAllByRid(Integer rid);
}
