package com.zw.dao;

import com.zw.model.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysUserDao {
    /**
     * 添加系统用户
     * @param sysUser 这个还有问题不能使用
     * @return 返回1表示插入成功，返回0表示插入失败
     */
    @Insert("insert into sys_user(id,username,password,phone,address,status,create_date,update_date,update_num)" +
            " value(#{id},#{username},#{password},#{phone},#{address},#{status},#{createDate},#{updateDate},#{updateNum})")
    int insertSysUser(SysUser sysUser);

    @Select("select * from sys_user t where t.id=#{id}")
    SysUser selectById(String id);

    @Select("select * from sys_user t where t.id={}")
    List<SysUser> selectByCondition();

    @Select("select * from sys_user")
    List<SysUser> selectAll();
}
