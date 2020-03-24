package com.zw.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    private String id;
    private Integer status;
    private Date createDate;
    private Date updateDate;
    private Integer updateNun;
}
