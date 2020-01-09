package comm.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao {
	private List<ToDo> toDoList=null;
	private ToDo toDo;
	{
		toDoList=new ArrayList<ToDo>();
	}
	private ToDo todo1;
	@Override
	public ToDo createToDo(String toDoName) {
		String str[]=UUID.randomUUID().toString().split("-");
		toDo=new ToDo((str[0]+str[1]).toLowerCase(),toDoName);
		toDoList.add(toDo);
		return toDo;
		
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		if(toDoList.isEmpty())
		{
			System.out.println("list is empty");
		}
		return toDoList;
	}

	@Override
	public ToDo findById(String toDoId) {
		// TODO Auto-generated method stub
	
			Iterator<ToDo> iterator=toDoList.iterator();
			
			while(iterator.hasNext())
			{
				toDo=iterator.next();
				if(toDo.getToDoId()==toDoId)
				{
					
					System.out.println(toDo.getToDoId());
					break;
				}
			}
		
		
		return toDo;
	}

	@Override
	public void deleteToDo(String toDoId) {
		if(toDoList.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}
		toDo=findById(toDoId);
		if(toDo==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			toDoList.remove(toDo);
			System.out.println("remoded sucessfully with id: "+toDoId);
		}
		
	}

	@Override
	public void removeAllToDo() {
		toDoList.removeAll(toDoList);
		
	}
	@Override
	public ToDo updateToDo(String toDoId, String toDoName)
	{
		todo1=findById(toDoId);
		int index = toDoList.lastIndexOf(todo1);
		todo1.setToDoName(toDoName);
		toDoList.set(index, todo1);
		return toDo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}