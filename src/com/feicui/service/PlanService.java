/**
* @author 石道远
* @version 创建时间：2019年6月9日 上午1:06:33
* 类说明
*/
package com.feicui.service;

import java.util.List;

import com.feicui.model.Plan;

/**
 *	@author sdy
 *	@date 2019年6月9日 上午1:06:33
 *	@version	
 *	@Description TODO
 */
public interface PlanService {
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
	 * 根据激活码查询用户
	 * @param code
	 * @return
	 */
	public Plan findPlanByCode(String code);

	/**
	 * 根据用户名查询对象
	 * @param Planname	查询的用户名
	 * @return			查询的对象
	 */
	public Plan findPlanByName(String Planname);
	public int addPlan(Plan plan);
	public List<Plan> findadminPlansList(Plan plan);
}
