package comm.myproject.hibernateonetoonebidirectional.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Image")
public class MyImage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageid;
	@Column(name = "imageurl")
	private String imageurl;
	@Column(name="album")
	private String album;
	
	public MyImage(String imageurl, String album) 
	{
		super();
		this.imageurl = imageurl;
		this.album = album;
	}
	
	@OneToOne(mappedBy = "myimg", cascade = CascadeType.ALL)
	private Album alb;
}
