package com.feicui.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.feicui.model.Users;

public interface UsersService {

	/**
	 * 保存方法
	 * @param user	保存用户对象
	 * @return		如果返回1，保存成功，否则，返回0
	 */
	public int saveUsers(Users user);
	
	/**
	 * 删除用户方法
	 * @param id	要删除的用户的id
	 * @return		如果返回1，删除成功，否则，返回0
	 */
	public int delUsers(int id);
	
	/**
	 * 修改的方法
	 * @param user	要修改的对象
	 * @return		如果返回1，修改成功，否则，返回0
	 */
	public int updateUsers(Users user);
	
	/**
	 * 根据id查询用户
	 * @param id	要查询的用户的id
	 * @return		查询的用户对象
	 */
	public Users findUserById(int id);
	
	/**
	 * 查询所有的用户
	 * @return		所用用户组成的集合
	 */
	public List<Users> findUsersList();
	
	/**
	 * 用户登录方法
	 * @param user	对象中存放用户输入的用户名和密码
	 * @return		登录成功，返回users对象，否则，返回null
	 */
	public Users login(Users user);

	/**
	 * 根据激活码查询用户
	 * @param code
	 * @return
	 */
	public Users findUserByCode(String code);

	/**
	 * 根据用户名查询对象
	 * @param username	查询的用户名
	 * @return			查询的对象
	 */
	public Users findUserByName(String username);
	public int savemoney(Users user);
	public int adduser(Users user);
	
		
}
