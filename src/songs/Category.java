package songs;

import java.util.List;

public class Category {

	boolean available;

	String name;
	int cost;
	List<Level> levels;
	
	public List<Level> getLevel() {
		return levels;
	}
	public void setLevel(List<Level> levels) {
		this.levels = levels;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
