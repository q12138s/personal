package com.feicui.model;
/**
 * 实体类:
 * 	1.属性私有化，提供公共的get和set方法
 *  2.必须要有无参构造
 *  3.属性类型应该为包装类类型
 *  4.类不能使用final修饰
 *  
 *  final,finally,finalize
 *
 */
public class Users {
	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String role;
	private Integer state;
	private String activecode;
	private String updatetime;
	private Double money;
	private String studentname;
	private String studentclass;
	private String studentno;
	private String content;
	private String classgradeid;
	private String classname;
	private String teacher;
	
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassgradeid() {
		return classgradeid;
	}
	public void setClassgradeid(String classgradeid) {
		this.classgradeid = classgradeid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getActivecode() {
		return activecode;
	}
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", email=" + email + ", role=" + role + ", state=" + state + ", activecode=" + activecode
				+ ", updatetime=" + updatetime + ", money=" + money + ", studentname=" + studentname + ", studentclass="
				+ studentclass + ", studentno=" + studentno + ", content=" + content + ", classgradeid=" + classgradeid
				+ ", classname=" + classname + ", teacher=" + teacher + "]";
	}
	
	
}
