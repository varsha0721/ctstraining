package comm.example;
public class Task
{
	private String taskId;
	private String taskName;
	private String taskDate;
	private Boolean isCompleated;
	public Task()
	{
		super();
	}
	public Task(String taskId, String taskName ,String taskDate, Boolean isCompleated)
	{
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleated = isCompleated;	
	}
	@Override
	public String toString()
	{
		return "taskId" +taskId+ "taskName" + taskName + "taskDate" +taskDate+ "isCompleated" 
	+isCompleated;
	}
	@Override
	public boolean equals(Object object)
	{
		Task theTask = null;
		boolean isEqual=false;
		if (object instanceof Task) 
		{
			theTask = (Task) object;
		}
		if((this.getTaskId()==theTask.getTaskId()) &&
				(this.getTaskName()==theTask.getTaskName()) &&(this.getTaskDate()==theTask.getTaskDate()))
		{
			isEqual=true;
		}
		return isEqual;
	}
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}*/

	public String getTaskId() 
	{
		return taskId;
	}

	public void setTaskIdId(String taskId) 
	{
		this.taskId = taskId;
	}

	public String getTaskName() 
	{
		return taskName;
	}

	public void setTaskName(String taskName) 
	{
		this.taskName = taskName;
	}

	public String getTaskDate() 
	{
		return taskDate;
	}

	public void setTaskDate(String taskDate) 
	{
		this.taskDate = taskDate;
	}

	public Boolean getIsCompleated() 
	{
		return isCompleated;
	}

	public void setIsCompleated(Boolean isCompleated) 
	{
		this.isCompleated = isCompleated;
	}
}
 
