package dardo.eve.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="invtypes")
public class ItemType {

	@Id
	private Integer typeID;
	
	@Column
	private String typeName;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="itemType")
	private ItemBlueprint itemBlueprint;

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setItemBlueprint(ItemBlueprint itemBlueprint) {
		this.itemBlueprint = itemBlueprint;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public String getTypeName() {
		return typeName;
	}

	public ItemBlueprint getItemBlueprint() {
		return itemBlueprint;
	}
	
}
