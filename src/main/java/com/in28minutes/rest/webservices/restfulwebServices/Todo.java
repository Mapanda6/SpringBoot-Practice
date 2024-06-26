package com.in28minutes.rest.webservices.restfulwebServices;

import java.util.Date;
import java.util.Objects;

public class Todo {
	private long id;
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}

	private String username;
	private Date targetDate;
	private String Desc;
	private boolean isDone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
   Todo(long id, String username, Date targetDate, String Desc, boolean isDone){
	   this.id = id;
	   this.username = username;
	   this.targetDate = targetDate;
	   this.Desc = Desc;
	   this.isDone = isDone;
	   
   }
   protected Todo() {
	   
   }
}
