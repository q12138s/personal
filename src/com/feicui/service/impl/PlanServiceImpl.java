/**
* @author 石道远
* @version 创建时间：2019年6月9日 上午1:06:47
* 类说明
*/
package com.feicui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feicui.dao.PlanMapper;
import com.feicui.model.Plan;
import com.feicui.service.PlanService;
import com.feicui.utils.MailUtils;

/**
 *	@author sdy
 *	@date 2019年6月9日 上午1:06:47
 *	@version	
 *	@Description TODO
 */
@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	private PlanMapper planMapper;

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#savePlans(com.feicui.model.Plan)
	 */
	@Override
	public int savePlans(Plan Plan) {
		// TODO Auto-generated method stub
		return planMapper.savePlans(Plan);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#delPlans(int)
	 */
	@Override
	public int delPlans(int id) {
		// TODO Auto-generated method stub
		return planMapper.delPlans(id);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#updatePlans(com.feicui.model.Plan)
	 */
	@Override
	public int updatePlans(Plan Plan) {
		// TODO Auto-generated method stub
		return planMapper.updatePlans(Plan);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#findPlanById(int)
	 */
	@Override
	public Plan findPlanById(int id) {
		// TODO Auto-generated method stub
		return planMapper.findPlanById(id);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#findPlansList()
	 */
	@Override
	public List<Plan> findPlansList(Plan Plan) {
		// TODO Auto-generated method stub
		return planMapper.findPlansList(Plan);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#findPlanByCode(java.lang.String)
	 */
	@Override
	public Plan findPlanByCode(String code) {
		// TODO Auto-generated method stub
		return planMapper.findPlanByCode(code);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#findPlanByName(java.lang.String)
	 */
	@Override
	public Plan findPlanByName(String Planname) {
		// TODO Auto-generated method stub
		return planMapper.findPlanByName(Planname);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#addPlan(com.feicui.model.Plan)
	 */
	@Override
	public int addPlan(Plan plan) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#findadminPlansList(com.feicui.model.Plan)
	 */
	@Override
	public List<Plan> findadminPlansList(Plan plan) {
		// TODO Auto-generated method stub
		return planMapper.findadminPlansList(plan);
	}

	/* (non-Javadoc)
	 * @see com.feicui.service.PlanService#addPlan(com.feicui.model.Plan)
	 */


}
