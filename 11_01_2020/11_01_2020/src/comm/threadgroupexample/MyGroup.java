package comm.threadgroupexample;

public class MyGroup 
{
	public static void main(String [] args)
	{
		ThreadGroup groupNorm = new ThreadGroup("a group with normal priority");
		Thread priorityMAX = new Thread(groupNorm, "a group with normal priority");
		
		priorityMAX.setPriority(Thread.MAX_PRIORITY);
		groupNorm.setMaxPriority(Thread.NORM_PRIORITY);
		
		System.out.println("groups maximum priority" groupNorm.getMaxPriority());
	}

    
}
