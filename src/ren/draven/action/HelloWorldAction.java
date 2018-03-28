package ren.draven.action;

import java.net.URLEncoder;
import java.util.Date;

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

	public String execute() throws Exception {
		// this.msg = "我的第一个struts应用";
		// this.userName = URLEncoder.encode("传智播客","UTF-8");

		return "success";
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
