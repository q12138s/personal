package com.feicui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feicui.dao.UsersMapper;
import com.feicui.model.Users;
import com.feicui.service.UsersService;
import com.feicui.utils.MailUtils;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public int saveUsers(Users user) {
		
		
		int num = usersMapper.saveUsers(user);
		
		//发送给用户激活邮件
		try {
			MailUtils.sendMail(user.getEmail(), user.getActivecode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return num;
	}

	@Override
	public int delUsers(int id) {
		return usersMapper.delUsers(id);
	}

	@Override
	public int updateUsers(Users user) {
		return usersMapper.updateUsers(user);
	}

	@Override
	public Users findUserById(int id) {
		return usersMapper.findUserById(id);
	}

	@Override
	public List<Users> findUsersList() {
		return usersMapper.findUsersList();
	}

	@Override
	public Users login(Users user) {
		return usersMapper.login(user);
	}

	@Override
	public Users findUserByCode(String code) {
		return usersMapper.findUserByCode(code);
	}

	@Override
	public Users findUserByName(String username) {
		return usersMapper.findUserByName(username);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.UsersService#savemoney(com.feicui.model.Users)
	 */
	@Override
	public int savemoney(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.savemoney(user);
		
	}



	/* (non-Javadoc)
	 * @see com.feicui.service.UsersService#adduser(com.feicui.model.Users)
	 */
	@Override
	public int adduser(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.saveUsers(user);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.UsersService#selectBookContent(com.feicui.model.BookContent)
	 */

}
