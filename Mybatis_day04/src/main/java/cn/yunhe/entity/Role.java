package cn.yunhe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

  private Integer id;
  private String roleName;
  private String roleDesc;
  private List<User> userList;
}
