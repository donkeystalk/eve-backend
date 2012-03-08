package dardo.eve.backend.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import dardo.eve.backend.models.ItemType;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer>{
	
	ItemType findByTypeName(String typeName);
	List<ItemType> findByTypeNameLike(String typeName, Pageable pageable);
	List<ItemType> findByGroupID(int groupId);
	
}
