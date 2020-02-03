package comm.myproject.onetomanyunidirectionalmapping.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "post")
@AllArgsConstructor
public class Post 
{
	@Id
	private int id;
	@Column(name = "creationdateandtime")
	private LocalDateTime creationdateandtime;
	@Column(name = "createdby")
	private String createdby;
	@OneToMany

	@JoinColumn(name = "id")
	
	private List<Comment> comments;
	public Post(LocalDateTime creationdateandtime, String createdby)
	{
		super();
		this.creationdateandtime = creationdateandtime;
		this.createdby = createdby;	
		
	}
	public Post() {
		super();
	}
	
	public void addComment(Comment coment)
	{
		if(comments==null)
		{
			comments=new ArrayList<Comment>();
		}
		comments.add(coment);
	}
	public Post(int id, LocalDateTime creationdateandtime, String createdby) {
		super();
		this.id = id;
		this.creationdateandtime = creationdateandtime;
		this.createdby = createdby;
		this.comments = comments;
	}
	
}
