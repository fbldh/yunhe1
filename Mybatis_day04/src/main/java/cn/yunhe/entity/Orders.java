package cn.yunhe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

  private Integer id;
  private Integer uid;
  private String ordertime;
  private double money;
  private User user;
}
