package com.example.jean.retrofitexample.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseApi{

	@SerializedName("data")
	private List<Player> data;

	@SerializedName("success")
	private String success;

	public void setData(List<Player> data){
		this.data = data;
	}

	public List<Player> getData(){
		return data;
	}

	public void setSuccess(String success){
		this.success = success;
	}

	public String getSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"ResponseApi{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}