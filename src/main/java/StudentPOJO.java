import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "STable")
public class StudentPOJO implements Serializable{

@Id @GeneratedValue
@Column(name = "id")
private int stNo;

@Column(name = "SName")
private String stName;

private String stAddress;

public void setStNo(int stNo){
  this.stNo = stNo;
}

public int getStNo(){
  return this.stNo;
}

public void setStName(String name){
  this.stName = name;
}

public String getStName(){
  return this.stName;
}

public void setStAddress(String addr){
  this.stAddress = addr;
}
public String getStAddress(){
  return this.stAddress;
}

}
