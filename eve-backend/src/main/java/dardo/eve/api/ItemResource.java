package dardo.eve.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import dardo.eve.backend.models.MarketCategory;
import dardo.eve.backend.repos.CategoryRepo;

@Path("/item")
@Component
public class ItemResource 
{
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@GET
	@Path("/marketGroups")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MarketCategory> findBaseMarketCategories()
	{
		return categoryRepo.findBaseMarketCategories();
	}
	
	@GET
	@Path("/marketGroups/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MarketCategory> findMarketCategoriesByParentID(@PathVariable Integer id)
	{
		return categoryRepo.findMarketGroupByParentID(id);
	}
}
