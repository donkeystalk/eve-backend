package dardo.eve.api;

import java.io.IOException;
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
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.core.InjectParam;

import dardo.eve.backend.models.Message;

@Path("/messages")
public class MessageResource {
	
	private static List<Message> messages = new ArrayList<Message>();
	
	private static final Logger logger = Logger.getLogger(MessageResource.class);
	
	@InjectParam
	private ObjectMapper mapper;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessages()
	{
		try {
			return mapper.writeValueAsString(messages);
		} catch (JsonGenerationException e) {
			logger.error(e);
		} catch (JsonMappingException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		return "{}";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMessage(String msg)
	{
		Message out;
		try {
			out = mapper.readValue(msg, Message.class);
			messages.add(out);
			return Response.ok().build();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.serverError().build();
	}
	
}
