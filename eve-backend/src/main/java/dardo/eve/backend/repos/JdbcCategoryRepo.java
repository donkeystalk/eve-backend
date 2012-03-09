package dardo.eve.backend.repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import dardo.eve.backend.models.MarketCategory;
import dardo.eve.backend.utils.ClassPathResourceUtil;

@Repository
public class JdbcCategoryRepo implements CategoryRepo{

	private NamedParameterJdbcTemplate jdbcTemplate;
	
	private static final String FIND_BASE_MARKET_CATEGORIES = ClassPathResourceUtil.getResourceAsString("sql/findBaseMarketCategories.sql");
	private static final String FIND_MARKET_CATEGORIES_BY_PARENT_ID = ClassPathResourceUtil.getResourceAsString("sql/findMarketCategoriesByParentID.sql");

	private static final RowMapper<MarketCategory> MARKET_CATEGORY_ROW_MAPPER = new RowMapper<MarketCategory>() {

		public MarketCategory mapRow(ResultSet rs, int arg1) throws SQLException {
			MarketCategory mc = new MarketCategory();
			mc.setMarketGroupID(rs.getInt("marketGroupID"));
			mc.setMarketGroupName(rs.getString("marketGroupName"));
			mc.setParentGroupID(rs.getInt("parentGroupID"));
			return mc;
		}
	};
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<MarketCategory> findBaseMarketCategories() {
		return jdbcTemplate.getJdbcOperations().query(FIND_BASE_MARKET_CATEGORIES, MARKET_CATEGORY_ROW_MAPPER);
	}

	public List<MarketCategory> findMarketGroupByParentID(int parentID) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("parentGroupID", parentID);
		return jdbcTemplate.query(FIND_MARKET_CATEGORIES_BY_PARENT_ID, params, MARKET_CATEGORY_ROW_MAPPER);
	}

}
