package dardo.eve.backend.repos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.eve.backend.models.ItemType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class IntegrationTestItemTypeRepository {

	@Autowired
	private ItemTypeRepository repo;
	
	@Test
	public void testInject()
	{
		assertNotNull(repo);
	}
	
	@Test
	public void testFindOneItemType()
	{
		ItemType type = repo.findOne(222);
		assertNotNull(type);
	}

	@Test
	public void testFindByTypeNameEqual()
	{
		ItemType type = repo.findByTypeName("tengu");
		assertNotNull(type);
	}
	
	@Test
	public void testFindTypeNameLike()
	{
		List<String> names = repo.findByTypeNameLike("%ten%");
		assertNotNull(names);
	}
	
}
