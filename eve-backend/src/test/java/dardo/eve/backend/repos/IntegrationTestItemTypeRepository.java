package dardo.eve.backend.repos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.eve.backend.models.ItemBlueprint;
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
	
}
