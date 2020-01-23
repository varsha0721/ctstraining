package comm.myproject.hibernateonetoonebidirectional.entity;

//import java.awt.Image;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "Album")
public class Album 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "albumname")
	private String albumname;
	@Column(name = "creation date")
	LocalDate creationdate;
	@Column(name = "myimage")
	private String myimage;
	
	public Album(String albumname, LocalDate creationdate, String myimage)
	{
		super();
		this.albumname = albumname;
		this.creationdate = creationdate;
		this.myimage = myimage;
		
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private MyImage myimg;
}

