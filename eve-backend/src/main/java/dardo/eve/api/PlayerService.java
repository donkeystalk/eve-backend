package dardo.eve.api;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dardo.eve.backend.repos.PlayerRepo;

@Path("/player")
@Component
public class PlayerService {
	
	@Autowired
	private PlayerRepo playerRepo;
	
	@GET
	@Produces("text/html")
	public String getMessage(@DefaultValue("blah") @QueryParam("msg") String msg){
		return msg + playerRepo.findPlayer();
	}

}
