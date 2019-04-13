package com.example.jean.retrofitexample.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseApi2{

	@SerializedName("data")
	private List<History> data;

	@SerializedName("success")
	private String success;

	public void setData(List<History> data){
		this.data = data;
	}

	public List<History> getData(){
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
			"ResponseApi2{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}