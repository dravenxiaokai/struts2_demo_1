package ren.draven.action;

import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import ren.draven.bean.Person;

public class HelloWorldAction {// ?id=23&name=xxx
	private Integer id;
	private String name;
	private Person person;
	private Date birthday;

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		System.out.println(birthday);
		this.birthday = birthday;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// private String msg;
	// private String userName;
	// private String savepath;

	// public String getMessage() {
	// return msg;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String addUI() {
		// msg = "addUI";
		return "success";
	}

	public String rsa() throws Exception{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		ServletContext servletContext = ServletActionContext.getServletContext();
		request.setAttribute("req", "请求范围属性");
		request.getSession().setAttribute("ses", "会话范围属性");
		servletContext.setAttribute("app", "应用范围属性");
//		HttpServletResponse httpServletResponse = ServletActionContext.getResponse();
		
		return "message";
	}
	
	public String execute() throws Exception {
		// this.msg = "我的第一个struts应用";
		// this.userName = URLEncoder.encode("传智播客","UTF-8");
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("app", "应用范围");//往ServletContext里放app
		ctx.getSession().put("ses", "session范围");//往session里面放ses
		ctx.put("req", "request范围");

		return "message";
//		return "success";
	}

	// public String getUserName() {
	// return userName;
	// }

	// public String add() {
	// return "message";
	// }
	//
	// public String getSavepath() {
	// return savepath;
	// }
	//
	// public void setSavepath(String savepath) {
	// this.savepath = savepath;
	// }
}
