package cn.yunhe.test;

import cn.yunhe.entity.Dept;
import cn.yunhe.mapper.DeptMapper;
import cn.yunhe.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DeptTest {
    @Test
    public void testFindDeptByDname(){
        SqlSession sqlSession = MyBatisUtils.getSessionFactory().openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.findDeptByDname("销售部");
        System.out.println(dept);
        sqlSession.close();
    }
}
