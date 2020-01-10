package comm.example;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student>
{
	private String firstName, lastName;
	private double CGPA = 0;
	private int StudentId;
	
	public Student(int StudentId, String firstName, String lastName, double CGPA )
	{
		this.StudentId = StudentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.CGPA = CGPA;
	}
	public int compareTo(Student st)
	{
		if(CGPA == st.CGPA)
			return 0 ;
		
		else if(CGPA > st.CGPA)
		return 1;
		
		else
			return -1;
	}
}
