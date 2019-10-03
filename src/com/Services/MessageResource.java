package com.Services;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path ("/messages")
public class MessageResource {
MessageService service=new MessageService();

@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public List<Message> getAll()
	{
		return service.getAllMessages();
	}


@Path("/{id}")
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Message getM2 (@PathParam("id")int id)
{
	return service.getMessageById(id);
}


@POST
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})

public Message addM(Message m) {
	
	return service.addMessage(m);
}

@Path("/{id}")
@DELETE
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})

public Message delM(@PathParam("id")int id) {
	return service.delMessageById(id);
}

@PUT
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Message UPDATEM (Message m)
{
	return service.updateMessageById(m);
}

}
