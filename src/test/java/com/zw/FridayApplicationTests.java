package com.zw;

import com.zw.dao.SysUserDao;
import com.zw.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class FridayApplicationTests {
	@Autowired
	private SysUserDao sysUserDao;

	@Test
	void contextLoads() {
		SysUser sysUser = new SysUser();
		String id = UUID.randomUUID().toString().replace("-","");
		String username = "zwfirefly";
		String password = "11111111";
		String phone = "12345678";
		String address = "测试地点";
		Integer status = 1;
		Date createDate = new Date();
		Date updateDate = new Date();
		Integer updateNum = 0;
		sysUser.setId(id);
		sysUser.setUsername(username);
		sysUser.setPassword(password);
		sysUser.setPhone(phone);
		sysUser.setAddress(address);
		sysUser.setStatus(status);
		sysUser.setCreateDate(createDate);
		sysUser.setUpdateDate(updateDate);
		sysUser.setUpdateNun(updateNum);
		sysUserDao.insertSysUser(sysUser);
	}

	@Test
	public void testSelectById(){
		System.out.println(sysUserDao.selectById("123456789"));
	}
}
