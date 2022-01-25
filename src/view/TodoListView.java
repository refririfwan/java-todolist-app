package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

  private static TodoListService todoListService;

  public TodoListView(TodoListService todoListService) {
    TodoListView.todoListService = todoListService;
  }

  public void showTodoList() {
    while (true) {
      todoListService.showTodoList();

      System.out.println("Menu :");
      System.out.println("1. Add");
      System.out.println("2. Remove");
      System.out.println("x. Exit");

      var input = InputUtil.input("Pilih");

      if (input.equals("1")) {
        addTodoList();
      } else if (input.equals("2")) {
        removeTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Menu not found");
      }
    }
  }

  public void addTodoList() {
    System.out.println("Add New Todo List");

    var todo = InputUtil.input("Todo (Type x for cancel)");

    if (todo.equals("x")) {
      // cancel
    } else {
      todoListService.addTodoList(todo);
    }
  }

  public void removeTodoList() {
    System.out.println("Remove Todo List");

    var number = InputUtil.input("Number want to remove (x for cancel)");

    if (number.equals("x")) {
      // cancel
    } else {
      todoListService.removeTodoList(Integer.valueOf(number));
    }

  }
}