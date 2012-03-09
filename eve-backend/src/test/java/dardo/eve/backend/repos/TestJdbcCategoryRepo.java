package dardo.eve.backend.repos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dardo.eve.backend.models.MarketCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class TestJdbcCategoryRepo {

	@Autowired
	private JdbcCategoryRepo repo;

	@Test
	public void testInject()
	{
		assertNotNull(repo);
	}
	
	@Test
	public void testFindBaseMarketCategories()
	{
		List<MarketCategory> c = repo.findBaseMarketCategories();
		assertNotNull(c);
		assertEquals(5, c.size());
	}
	
	@Test
	public void testFindMarketGroupByParentID()
	{
		List<MarketCategory> c = repo.findMarketGroupByParentID(1384);
		assertNotNull(c);
		assertEquals(2, c.size());
	}
}