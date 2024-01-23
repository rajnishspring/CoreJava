package org.test;

public class Hotel {
	
	private String name ;
	private int totalCharge;
	private String type;
	private String reward;
	

	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(int totalCharge) {
		this.totalCharge = totalCharge;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", totalCharge=" + totalCharge + "]";
	}
	
	

}
