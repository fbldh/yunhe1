package cn.yunhe.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer id;
  private String username;
  private String birthday;
  private String sex;
  private String address;

}
