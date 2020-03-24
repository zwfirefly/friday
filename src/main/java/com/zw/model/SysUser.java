package com.zw.model;

import lombok.Data;

@Data
public class SysUser extends BaseModel {
    private String username;
    private String password;
    private String phone;
    private String address;
}
