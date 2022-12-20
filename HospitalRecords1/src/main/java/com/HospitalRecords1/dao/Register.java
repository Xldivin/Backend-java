package com.HospitalRecords1.dao;

import java.util.regex.Pattern;

import org.json.JSONObject;

import com.HospitalRecords1.bean.Member;


public class Register  extends User {


	public Register() {
	}
	
	@SuppressWarnings("static-access")
	public JSONObject signup(Member member) {
		JSONObject jo = new JSONObject();
		boolean b3 = Pattern.matches("^.{10,}$", member.getPassword());
		if (b3 == true) {
			Db server = new Db();
			server.addUser(member);
		    jo.put("result", "User added");
		}else {
			jo.put("result", "password must be 10 characters");
		}
		return jo;
	}
	
	public JSONObject login(String email,String password) {
		JSONObject jo = new JSONObject();
		Member findUser = Db.findUser(email);
		if (findUser == null) {
			jo.put("result", "user not logged");
		}else {
			jo.put("result", "user logged in");
		}
		return jo;
	}
}

