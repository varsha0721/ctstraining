package comm.myproject.hibernateannotation.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ToDo {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ToDoId;
	@Column(name = "todoname")
	private String todoname;
	@Column(name = "dateandtime")
	private  LocalDateTime dateandtime;
	@Column(name = "uid")
	private String uid;

}
