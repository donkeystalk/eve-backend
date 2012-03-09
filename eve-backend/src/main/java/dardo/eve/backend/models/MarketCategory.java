package dardo.eve.backend.models;

public class MarketCategory {
	
	private String marketGroupName;
	
	private int marketGroupID;
	
	private Integer parentGroupID;
	
	public Integer getParentGroupID() {
		return parentGroupID;
	}

	public void setParentGroupID(Integer parentGroupID) {
		this.parentGroupID = parentGroupID;
	}

	public String getMarketGroupName() {
		return marketGroupName;
	}

	public void setMarketGroupName(String marketGroupName) {
		this.marketGroupName = marketGroupName;
	}

	public int getMarketGroupID() {
		return marketGroupID;
	}

	public void setMarketGroupID(int marketGroupID) {
		this.marketGroupID = marketGroupID;
	}
	
}
