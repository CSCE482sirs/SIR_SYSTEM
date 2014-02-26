package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="content_vector")
public class Content_vector 
{
	@Id
	@GeneratedValue
	private Integer cvid;
	@Column(name="pid")
	private Integer pid;
	@Column(name="avid")
	private Integer avid;
	@Column(name="defaults")
	private String defaults;
	public Integer getCvid() {
		return cvid;
	}
	public void setCvid(Integer cvid) {
		this.cvid = cvid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
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
