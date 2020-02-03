package comm.myproject.onetomanyunidirectionalmapping.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "comment")
//@NoArgsConstructor
public class Comment 
{
	@Id
	private int id;
	@Column(name = "commenttext")
	private String commenttext;
	@Column(name = "commentdateandtime")
	private LocalDateTime commentdateandtime;
	
	public Comment(String commenttext, LocalDateTime commentdateandtime) 
	{
		super();
		this.commenttext = commenttext;
		this.commentdateandtime = commentdateandtime;
	}

	public Comment() {
		super();
	}
	
}
