package com.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {
	static Map<Integer,Message>  messages=new HashMap<>();
	static {
		messages.put(1,new Message(1,"hi", LocalDate.of(2019, 4, 1)));
		messages.put(2,new Message(2,"by", LocalDate.of(2019, 5, 1)));
		messages.put(3,new Message(3,"not free", LocalDate.of(2019, 6, 1)));
		
		
	}
	
	
	public List<Message> getAllMessages()
	{
		Collection<Message> coll=messages.values();
		List<Message>  msglist=new ArrayList<>(coll);
		return msglist;		
	}
	
	public Message getMessageById(int id) {
		
		return messages.get(id);
	
	}
	
	
public Message addMessage(Message m) {
		int sizeofcoll=messages.size();
		int newid=sizeofcoll + 1;
		m.setId(newid);
	messages.put(newid, m);
	return m;
	
	
	}
	
public Message delMessageById(int id) {
	
messages.remove(id);
return getMessageById(id);


}

public Message updateMessageById(Message m) {
	
	messages.put(m.getId(), m);
	return m;

}
	
	
	

}
