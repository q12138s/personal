/**
* @author ʯ��Զ
* @version ����ʱ�䣺2019��6��9�� ����1:11:08
* ��˵��
*/
package com.feicui.dao;

import java.util.List;

import com.feicui.model.Plan;

/**
 *	@author sdy
 *	@date 2019��6��9�� ����1:11:08
 *	@version	
 *	@Description TODO
 */
public interface PlanMapper {
	/**
	 * ���淽��
	 * @param Plan	�����û�����
	 * @return		�������1������ɹ������򣬷���0
	 */
	public int savePlans(Plan Plan);
	
	/**
	 * ɾ���û�����
	 * @param id	Ҫɾ�����û���id
	 * @return		�������1��ɾ���ɹ������򣬷���0
	 */
	public int delPlans(int id);
	
	/**
	 * �޸ĵķ���
	 * @param Plan	Ҫ�޸ĵĶ���
	 * @return		�������1���޸ĳɹ������򣬷���0
	 */
	public int updatePlans(Plan Plan);
	
	/**
	 * ����id��ѯ�û�
	 * @param id	Ҫ��ѯ���û���id
	 * @return		��ѯ���û�����
	 */
	public Plan findPlanById(int id);
	
	/**
	 * ��ѯ���е��û�
	 * @return		�����û���ɵļ���
	 */
	public List<Plan> findPlansList(Plan Plan);
	
	/**
	 * �û���¼����
	 * @param Plan	�����д���û�������û���������
	 * @return		��¼�ɹ�������Plans���󣬷��򣬷���null
	 */

	public Plan findPlanByCode(String code);

	public Plan findPlanByName(String Planname);
	
	public List<Plan> findadminPlansList(Plan plan);
}
