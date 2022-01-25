package view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListViewTest {
  public static void main(String[] args) {
    // testShowTodoList();
    // testAddTodoList();
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodoList("Learn Java");
    todoListService.addTodoList("Learn Lombok");
    todoListService.addTodoList("Learn Jakarta");

    todoListView.showTodoList();
  }

  public static void testAddTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListView.addTodoList();

    todoListView.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodoList("Learn Java");
    todoListService.addTodoList("Learn Lombok");
    todoListService.addTodoList("Learn Jakarta");

    todoListView.showTodoList();

    todoListView.removeTodoList();
  }

}
