package dardo.eve.backend.repos;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class IntegrationTestMaterialRepository {

	@Autowired
	private MaterialRepository repo;
	
	@Test
	public void testInject()
	{
		assertNotNull(repo);
	}
	
	@Test
	public void testFindByMaterialTypeIDAndQuantity()
	{
		List<Integer> types = repo.findTypesWithQuantityGreaterThan(34, 10000);
		assertNotNull(types);
	}
}
