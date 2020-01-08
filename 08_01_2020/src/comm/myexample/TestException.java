package comm.myexample;

public class TestException extends Exception
{
	
}
class MyException
{
	void experience(int a) throws ExperienceException
	{
		if ( a < 2)
		{
			
			throw new ExperienceException("Experience not sufficient");
		}
	}
}
	
