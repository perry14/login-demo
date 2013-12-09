package com.struts2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.common.DbConnection;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private HttpServletRequest request;

	public String execute() throws Exception {
		if(username == null || username.equals("") || password == null || password.equals("")){
			request.setAttribute("result", "用户名或密码不能为空!");
			return SUCCESS;
		}
		Connection conn = DbConnection.getConnection();
		String sql = "select password from users where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		if(!rs.next()){
			request.setAttribute("result", "用户名不存在!");
			return SUCCESS;
		}else{
			String pwd = rs.getString(1);
			if(!password.equals(pwd)){
				request.setAttribute("result", "密码错误!");
				return SUCCESS;
			}
		}
		request.setAttribute("result", "登陆成功!");
		return SUCCESS;
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

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;	
	}

}
