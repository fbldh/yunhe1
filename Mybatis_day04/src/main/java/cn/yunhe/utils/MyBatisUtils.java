package cn.yunhe.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    static SqlSessionFactory sessionFactory;
    static {
        try {
            InputStream ips = Resources.getResourceAsStream("SqlMapConfig.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(ips);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static SqlSessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
