/**
* @author 石道远
* @version 创建时间：2019年6月9日 上午1:05:10
* 类说明
*/
package com.feicui.model;

import java.sql.Date;

/**
 *	@author sdy
 *	@date 2019年6月9日 上午1:05:10
 *	@version	
 *	@Description TODO
 */
public class Plan {
	private int planid;
	private String planname;
	private String state;
	private String plantime;
	private int userid;
	private String remind;
	private String comment;
	private String jindu;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJindu() {
		return jindu;
	}
	public void setJindu(String jindu) {
		this.jindu = jindu;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPlanid() {
		return planid;
	}
	public void setPlanid(int planid) {
		this.planid = planid;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	public String getPlantime() {
		return plantime;
	}
	public void setPlantime(String plantime) {
		this.plantime = plantime;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getRemind() {
		return remind;
	}
	public void setRemind(String remind) {
		this.remind = remind;
	}
	@Override
	public String toString() {
		return "Plan [planid=" + planid + ", planname=" + planname + ", state="
				+ state + ", plantime=" + plantime + ", userid=" + userid
				+ ", remind=" + remind + ", comment=" + comment + ", jindu="
				+ jindu + ", username=" + username + "]";
	}
	
	
}
