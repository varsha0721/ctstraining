package comm.Example;

import java.util.List;

public interface ToDoService {
	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
	public ToDo updateToDo(String toDoId, String toDoName);
}