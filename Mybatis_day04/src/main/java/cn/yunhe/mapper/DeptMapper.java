package cn.yunhe.mapper;

import cn.yunhe.entity.Dept;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface DeptMapper {

    @Select("select * from dept where dname=#{dname}")
    @Results({
            @Result(id = true,
                    property = "deptno",
                    column = "deptno"),
            @Result(property = "empList",
                    javaType = List.class,
                    many = @Many(select = "cn.yunhe.mapper.EmpMapper.findEmpByDeptNo",
                            fetchType = FetchType.LAZY),
                    column = "deptno")
    })
    Dept findDeptByDname(String dname);
}
