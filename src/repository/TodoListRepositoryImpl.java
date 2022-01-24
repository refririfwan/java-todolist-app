package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

  public TodoList[] data = new TodoList[10];

  @Override
  public TodoList[] getAll() {
    return data;
  }

  @Override
  public void add(TodoList todoList) {
    // TODO Auto-generated method stub

  }

  @Override
  public void remove(Integer number) {
    // TODO Auto-generated method stub

  }

}
