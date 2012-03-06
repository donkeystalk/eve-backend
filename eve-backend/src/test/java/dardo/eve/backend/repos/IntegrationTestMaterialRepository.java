package dardo.eve.backend.repos;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.eve.backend.models.Material;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class IntegrationTestMaterialRepository {

	@Autowired
	private MaterialRepository repo;
	
	@Autowired
	private ItemTypeRepository itemRepo;
	
	@Test
	public void testInject()
	{
		assertNotNull(repo);
		assertNotNull(itemRepo);
	}
	
	@Test
	public void testFindByMaterialTypeIDAndQuantity()
	{
		List<Integer> types = repo.findTypesWithQuantityGreaterThan(34, 10000);
		assertNotNull(types);
	}
	
	@Test
	public void testFindByTypeID()
	{
		int typeId = itemRepo.findOne(20805).getTypeID();
		List<Material> mats = repo.findByTypeID(typeId);
		assertNotNull(mats);
	}
}
