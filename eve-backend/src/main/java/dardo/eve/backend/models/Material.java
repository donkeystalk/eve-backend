package dardo.eve.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="invtypematerials")
public class Material {

	@Id
	private Integer materialTypeID;
	
	@Column
	private Integer quantity;
	
	@Column
	private Integer typeID;

}
