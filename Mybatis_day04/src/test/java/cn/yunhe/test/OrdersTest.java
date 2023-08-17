package cn.yunhe.test;

import cn.yunhe.entity.Orders;
import cn.yunhe.mapper.OrdersMapper;
import cn.yunhe.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class OrdersTest {
    @Test
    public void testFindUserById(){
        SqlSession sqlSession = MyBatisUtils.getSessionFactory().openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        Orders orders = mapper.findOrdersById(2);
        System.out.println(orders.getMoney());
        sqlSession.close();
    }
}
