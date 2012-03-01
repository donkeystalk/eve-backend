package dardo.eve.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import com.sun.jersey.spi.resource.Singleton;

import dardo.eve.backend.models.Message;

@Singleton
@Path("/messages")
public class MessageResource {
	
	private List<Message> messages = new ArrayList<Message>();
	
	private static final Logger logger = Logger.getLogger(MessageResource.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return messages;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMessage(Message msg)
	{
		messages.add(msg);
		return Response.ok().build();
	}
	
}
