/**
* @author 石道远
* @version 创建时间：2019年6月9日 上午1:11:08
* 类说明
*/
package com.feicui.dao;

import java.util.List;

import com.feicui.model.Plan;

/**
 *	@author sdy
 *	@date 2019年6月9日 上午1:11:08
 *	@version	
 *	@Description TODO
 */
public interface PlanMapper {
	/**
	 * 保存方法
	 * @param Plan	保存用户对象
	 * @return		如果返回1，保存成功，否则，返回0
	 */
	public int savePlans(Plan Plan);
	
	/**
	 * 删除用户方法
	 * @param id	要删除的用户的id
	 * @return		如果返回1，删除成功，否则，返回0
	 */
	public int delPlans(int id);
	
	/**
	 * 修改的方法
	 * @param Plan	要修改的对象
	 * @return		如果返回1，修改成功，否则，返回0
	 */
	public int updatePlans(Plan Plan);
	
	/**
	 * 根据id查询用户
	 * @param id	要查询的用户的id
	 * @return		查询的用户对象
	 */
	public Plan findPlanById(int id);
	
	/**
	 * 查询所有的用户
	 * @return		所用用户组成的集合
	 */
	public List<Plan> findPlansList(Plan Plan);
	
	/**
	 * 用户登录方法
	 * @param Plan	对象中存放用户输入的用户名和密码
	 * @return		登录成功，返回Plans对象，否则，返回null
	 */

	public Plan findPlanByCode(String code);

	public Plan findPlanByName(String Planname);
	
	public List<Plan> findadminPlansList(Plan plan);
}
