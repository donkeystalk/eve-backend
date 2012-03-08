package dardo.eve.backend.repos;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.eve.backend.models.ItemGroup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class IntegrationTestItemGroupRepository {
	
	@Autowired
	private ItemGroupRepository repo;
	
	@Test
	public void testInject()
	{
		assertNotNull(repo);
	}
	
	@Test
	public void testFindSelectableItemGroups()
	{
		List<ItemGroup> igs = repo.findSelectableItemGroups();
		assertNotNull(igs);
	}
}
