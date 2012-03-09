package dardo.eve.backend.repos;

import java.util.List;

import dardo.eve.backend.models.MarketCategory;

public interface CategoryRepo {

	List<MarketCategory> findBaseMarketCategories();
	List<MarketCategory> findMarketGroupByParentID(int groupID);
}
