package dardo.eve.backend.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dardo.eve.backend.models.ItemGroup;

public interface ItemGroupRepository extends JpaRepository<ItemGroup, Integer> {

	@Query("select ig from ItemGroup ig where published = 1 and allowManufacture = 1 and categoryID = 9")
	List<ItemGroup> findSelectableItemGroups();
	
}
