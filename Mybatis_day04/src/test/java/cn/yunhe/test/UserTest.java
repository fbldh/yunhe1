package cn.yunhe.test;

import cn.yunhe.entity.User;
import cn.yunhe.mapper.UserMapper;
import cn.yunhe.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void testFindAll(){
        SqlSession sqlSession = MyBatisUtils.getSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findAll();
        list.forEach(System.out::println);
        sqlSession.close();
    }
}
