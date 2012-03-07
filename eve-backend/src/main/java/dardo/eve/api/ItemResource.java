package dardo.eve.api;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dardo.eve.backend.repos.ItemTypeRepository;

@Path("/item")
@Component
public class ItemResource 
{
	@Autowired
	private ItemTypeRepository itemTypeRepository;
	
	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> findItemNamesLike(String name)
	{
		return Collections.EMPTY_LIST;
	}
}
