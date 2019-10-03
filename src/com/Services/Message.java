package com.Services;
import javax.ws.rs.GET;
import javax.servlet.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import java.time.LocalDate;

//@Path("/messages")
@XmlRootElement
public class Message {
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		
		return "Hello Jersey shore";
		
		
	}*/
	
	private int id;
	private String msg;
	private LocalDate doc;
	public Message() {
		super();
	}
	public Message(int id, String msg, LocalDate doc) {
		super();
		this.id = id;
		this.msg = msg;
		this.doc = doc;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", msg=" + msg + ", doc=" + doc + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDate getDoc() {
		return doc;
	}
	public void setDoc(LocalDate doc) {
		this.doc = doc;
	}

	

}
