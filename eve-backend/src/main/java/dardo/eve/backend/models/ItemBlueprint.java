package dardo.eve.backend.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="invblueprinttypes")
public class ItemBlueprint {

	@Id
	private Integer blueprintTypeID;

	@OneToOne
	@ForeignKey(name="FK_INV_TYPE")
	@JoinColumn(name="productTypeID")
	private ItemType itemType;

	public Integer getBlueprintTypeID() {
		return blueprintTypeID;
	}

	public void setBlueprintTypeID(Integer blueprintTypeID) {
		this.blueprintTypeID = blueprintTypeID;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	
}
