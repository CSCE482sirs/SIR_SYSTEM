package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="attribute_name")
public class Attribute_name 
{
	@Id
	@GeneratedValue
	private Integer anid;
	@Column(name="name")
	private String name;
	@Column(name="weight")
	private float weight;
	@Column(name="avid")
	private Integer avid;
	@Column(name="defaults")
	private String defaults;

	public Integer getAnid() {
		return anid;
	}
	public void setAnid(Integer anid) {
		this.anid = anid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public Integer getAvid() {
		return avid;
	}
	public void setAvid(Integer avid) {
		this.avid = avid;
	}
	public String getDefaults() {
		return defaults;
	}
	public void setDefaults(String defaults) {
		this.defaults = defaults;
	}
	
	
}
