package dardo.eve.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public Integer getMaterialTypeID() {
		return materialTypeID;
	}

	public void setMaterialTypeID(Integer materialTypeID) {
		this.materialTypeID = materialTypeID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

}
