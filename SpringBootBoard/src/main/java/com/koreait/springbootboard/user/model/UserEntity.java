package com.koreait.springbootboard.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntity {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private int gender;
    private String profileimg;
    private String rdt;
    private String mdt;
}
