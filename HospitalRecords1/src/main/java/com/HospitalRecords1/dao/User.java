package com.HospitalRecords1.dao;

import java.sql.SQLException;

import org.json.JSONObject;

import com.HospitalRecords1.bean.Member;



abstract public class User {
	
	abstract JSONObject signup (Member member)  throws SQLException;
}

