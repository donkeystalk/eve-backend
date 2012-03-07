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
	
	@Column
	private Integer groupID;

	public Integer getGroupID() {
		return groupID;
	}

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getTypeID() {
		return typeID;
	}

	public String getTypeName() {
		return typeName;
	}
	
}
