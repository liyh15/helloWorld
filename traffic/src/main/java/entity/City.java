package entity;
import java.util.List;
public class City {
	private int id;     //城市编号
	private String name;//城市名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
	
}
