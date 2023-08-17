package cn.yunhe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

  private Integer empno;
  private String ename;
  private double salary;
  private String hiredate;
  private Integer deptno;

}
