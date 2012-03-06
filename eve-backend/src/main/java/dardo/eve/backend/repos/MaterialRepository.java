package dardo.eve.backend.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dardo.eve.backend.models.ItemType;

public interface MaterialRepository extends JpaRepository<ItemType, Integer>{
	@Query("select mat.typeID from Material mat where materialTypeID = :mat and quantity >= :quantity")
	List<Integer> findTypesWithQuantityGreaterThan(@Param("mat")int materialTypeID, @Param("quantity")int quantity);

}
