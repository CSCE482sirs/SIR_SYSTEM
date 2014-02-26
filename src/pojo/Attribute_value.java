package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="attribute_value")
public class Attribute_value 
{
	@Id
	@GeneratedValue
	private Integer avid;
}
