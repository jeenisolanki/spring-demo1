package com.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
	private int sid;
	private String sname;
	private List<Integer> marks = new ArrayList<>();
	private Map<Integer ,String> saddress =new HashMap<>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Map<Integer, String> getSaddress() {
		return saddress;
	}
	public void setSaddress(Map<Integer, String> saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", saddress=" + saddress + "]";
	}
	
	
	

}
