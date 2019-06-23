package com.feicui.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.feicui.model.Users;

public interface UsersService {

	/**
	 * ���淽��
	 * @param user	�����û�����
	 * @return		�������1������ɹ������򣬷���0
	 */
	public int saveUsers(Users user);
	
	/**
	 * ɾ���û�����
	 * @param id	Ҫɾ�����û���id
	 * @return		�������1��ɾ���ɹ������򣬷���0
	 */
	public int delUsers(int id);
	
	/**
	 * �޸ĵķ���
	 * @param user	Ҫ�޸ĵĶ���
	 * @return		�������1���޸ĳɹ������򣬷���0
	 */
	public int updateUsers(Users user);
	
	/**
	 * ����id��ѯ�û�
	 * @param id	Ҫ��ѯ���û���id
	 * @return		��ѯ���û�����
	 */
	public Users findUserById(int id);
	
	/**
	 * ��ѯ���е��û�
	 * @return		�����û���ɵļ���
	 */
	public List<Users> findUsersList();
	
	/**
	 * �û���¼����
	 * @param user	�����д���û�������û���������
	 * @return		��¼�ɹ�������users���󣬷��򣬷���null
	 */
	public Users login(Users user);

	/**
	 * ���ݼ������ѯ�û�
	 * @param code
	 * @return
	 */
	public Users findUserByCode(String code);

	/**
	 * �����û�����ѯ����
	 * @param username	��ѯ���û���
	 * @return			��ѯ�Ķ���
	 */
	public Users findUserByName(String username);
	public int savemoney(Users user);
	public int adduser(Users user);
	
		
}
