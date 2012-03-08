package dardo.eve.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name="invgroups")
@JsonAutoDetect
public class ItemGroup {

	@Id
	private Integer groupID;
	
	@Column
	private Integer categoryID;
	
	@Column
	private String groupName;
	
	@Column
	private boolean allowManufacture;
	
	@Column
	private boolean published;

	@JsonProperty
	public Integer getGroupID() {
		return groupID;
	}
	
	@JsonProperty
	public Integer getCategoryID() {
		return categoryID;
	}

	@JsonProperty
	public String getGroupName() {
		return groupName;
	}

	public boolean isAllowManufacture() {
		return allowManufacture;
	}

	public boolean isPublished() {
		return published;
	}
	
	
}
