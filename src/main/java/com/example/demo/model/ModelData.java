package com.example.demo.model;
import java.io.FileReader;
import java.io.Serializable;

import javax.json.JsonObject;
import javax.json.stream.JsonParser;

import org.apache.tomcat.util.json.JSONParser;

public class ModelData implements Serializable{

	/**
	 * 
	 */

	private static final long serialVersionUID = -4675086740446209824L;
	
	private int code;
	private String matriz;
	private boolean status;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMatriz() {
		return matriz;
	}
	public void setMatriz(String matriz) {
		this.matriz = matriz;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void toJason() {
		JSONParser parser = new JSONParser("users.json");
		JsonObject users = (JsonObject)parser;
		System.out.println(users.get("1234567890"));
		
	}

}
