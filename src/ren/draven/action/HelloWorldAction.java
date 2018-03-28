package ren.draven.action;

import java.net.URLEncoder;

public class HelloWorldAction {
	public String getUserName() {
		return userName;
	}

	private String msg;
	private String userName;

	public String getMessage() {
		return msg;
	}

	public String execute() throws Exception {
		this.msg = "我的第一个struts应用";
		this.userName = URLEncoder.encode("传智播客","UTF-8");
		
		return "success";
	}
	public String add() {
		return "message";
	}
}
