package service;

public interface TodoListService {

  void showTodoList();

  void addTodoList(String todo);

  boolean removeTodoList(Integer number);
}
