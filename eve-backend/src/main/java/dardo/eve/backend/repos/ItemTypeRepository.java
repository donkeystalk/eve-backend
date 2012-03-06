package dardo.eve.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import dardo.eve.backend.models.ItemType;

public interface ItemTypeRepository extends JpaRepository<ItemType, Integer>{
	
}
