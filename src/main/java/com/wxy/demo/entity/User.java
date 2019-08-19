package com.wxy.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author wxy
 * @Date 19-8-19 上午9:59
 * @Description TODO
 **/
@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String userName;

    @Column(columnDefinition = "varchar(255) comment '居住地址'")
    private String homeAddress;

    private Long homeTel;

}