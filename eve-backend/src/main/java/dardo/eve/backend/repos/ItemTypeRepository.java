package dardo.eve.backend.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dardo.eve.backend.models.ItemType;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer>{
	
	ItemType findByTypeName(String typeName);
	List<String> findByTypeNameLike(String typeName);
	
}
