package Test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
  public static void main(String[] args) {
    // testShowTodoList();
    // testAddTodoList();
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new TodoList("Learn Java");
    todoListRepository.data[1] = new TodoList("Learn Lombok");
    todoListRepository.data[2] = new TodoList("Learn Jakarta");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.showTodoList();
  }

  public static void testAddTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Learn Java");
    todoListService.addTodoList("Learn Lombok");
    todoListService.addTodoList("Learn Jakarta");

    todoListService.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Learn Java");
    todoListService.addTodoList("Learn Lombok");
    todoListService.addTodoList("Learn Jakarta");

    todoListService.showTodoList();

    todoListService.removeTodoList(5);
    todoListService.showTodoList();
    todoListService.removeTodoList(2);
    todoListService.showTodoList();
    todoListService.removeTodoList(2);
    todoListService.showTodoList();
    todoListService.removeTodoList(2);
    todoListService.showTodoList();
    todoListService.removeTodoList(1);
    todoListService.showTodoList();
  }

}
