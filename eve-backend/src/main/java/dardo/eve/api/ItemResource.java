package dardo.eve.api;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import dardo.eve.backend.models.MarketCategory;

@Path("/item")
@Component
public class ItemResource 
{
	
	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MarketCategory> findBaseMarketCategories()
	{
		return Collections.EMPTY_LIST;
	}
}
