package dardo.eve.api;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import dardo.eve.backend.models.ItemGroup;
import dardo.eve.backend.models.ItemType;
import dardo.eve.backend.repos.ItemGroupRepository;
import dardo.eve.backend.repos.ItemTypeRepository;

@Path("/item")
@Component
public class ItemResource 
{
	@Autowired
	private ItemTypeRepository itemTypeRepository;
	
	@Autowired
	private ItemGroupRepository itemGroupRepository;
	
	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemType> findItemNamesLike(@QueryParam("name") String name)
	{
		Sort sort = new Sort("groupID", "typeName");
		if(!name.isEmpty())
		{
			name = "%".concat(name).concat("%");
			return itemTypeRepository.findByTypeNameLike(name, new PageRequest(1, 20, sort));
		}
		return Collections.EMPTY_LIST;
	}
	
	@GET
	@Path("/group")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemGroup> findItemGroups()
	{
		return itemGroupRepository.findSelectableItemGroups();
	}
	
	@GET
	@Path("/{typeID}")
	@Produces(MediaType.APPLICATION_JSON)
	public ItemType findItemTypeById(@PathParam("typeID") int id)
	{
		return itemTypeRepository.findOne(id);
	}
}
