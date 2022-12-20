package com.HospitalRecords1.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.HospitalRecords1.bean.Member;


public class Db {
	public Db() {
	}
	  private static Map<String, Member> users = new LinkedHashMap<>();

	  public static void addUser(Member member) {
	    users.put(member.getEmail(), member);
	  }

	  public static Member findUser(String email) {
	    return users.get(email);
	  }

	  public static List<Member> getUsers() {
	    return new ArrayList<>(users.values());
	  }

}