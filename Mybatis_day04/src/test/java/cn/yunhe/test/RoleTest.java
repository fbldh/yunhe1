package cn.yunhe.test;

import cn.yunhe.mapper.RoleMapper;
import cn.yunhe.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class RoleTest {
    @Test
    public void testFindRoleById(){
        SqlSession sqlSession = MyBatisUtils.getSessionFactory().openSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        mapper.findRoleById(1).forEach(System.out::println);
        sqlSession.close();
    }
}
