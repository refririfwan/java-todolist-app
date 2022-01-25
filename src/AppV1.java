public class AppV1 {

  public static String[] model = new String[10];

  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) throws Exception {
    // testShowTodoList();
    // testAddTodoList();
    // testRemoveTodoList();
    // testInput();
    // testViewTodoList();
    // testViewAddTodoList();
    // testViewRemoveTodoList();
    viewShowTodoList();
  }

  // Show Todo List
  public static void showTodoList() {
    System.out.println("Todo List");
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  // Unit Test for showTodoList()
  public static void testShowTodoList() {
    model[0] = "Cooking Water";
    model[1] = "Walking On The Ground";
    model[2] = "Climbing Waterfall";
    showTodoList();
  }

  // Add new Todo List
  public static void addTodoList(String todo) {
    // What is model length full ?
    var isFull = true;
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // one or some model length is empty
        isFull = false;
        break;
      }
    }

    // if model length is full, we resize array length 2x more bigger than before
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // Add to position model array equals than null
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  // Unit test for addTodoList()
  public static void testAddTodoList() {
    // testing add 25 new todo
    for (var i = 0; i < 25; i++) {
      addTodoList("Contoh to do ke." + i);
    }

    showTodoList();
  }

  // Delete a Todo List
  public static boolean removeTodoList(Integer number) {
    if ((number - 1) > model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (var i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  // Unit test for removeTodoList()
  public static void testRemoveTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");

    // Testing for remove more than model length
    var result = removeTodoList(20);
    System.out.println(result);

    // Testing for already null
    result = removeTodoList(5);
    System.out.println(result);

    // Testing for truly remove
    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }

  // helper function for input data
  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  // Unit test for input()
  // private static void testInput() {
  // var name = input("Name");
  // System.out.println("Hi " + name);

  // var channel = input("Channel");
  // System.out.println(channel);
  // }

  // Showing Todo List Menu
  public static void viewShowTodoList() {
    while (true) {
      showTodoList();

      System.out.println("Menu :");
      System.out.println("1. Add");
      System.out.println("2. Remove");
      System.out.println("x. Exit");

      var input = input("Plih");

      if (input.equals("1")) {
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Menu not found");
      }
    }
  }

  // Unit test for viewTodoList()
  public static void testViewTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    viewShowTodoList();
  }

  // Showing Add Todo List
  public static void viewAddTodoList() {
    System.out.println("Add New Todo List");

    var todo = input("Todo (Type x for cancel)");

    if (todo.equals("x")) {
      // cancel
    } else {
      addTodoList(todo);
    }
  }

  // Unit test for viewAddTodoList()
  public static void testViewAddTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    viewAddTodoList();

    showTodoList();
  }

  // Showing Delete Todo List
  public static void viewRemoveTodoList() {
    System.out.println("Remove Todo List");

    var number = input("Number want to remove (x for cancel)");

    if (number.equals("x")) {
      // cancel
    } else {
      boolean success = removeTodoList(Integer.valueOf(number));
      if (!success) {
        System.out.println("Failed to remove todo list with number : " + number);
      }
    }
  }

  // Unit test for viewRemoveTodoList()
  public static void testViewRemoveTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    showTodoList();

    viewRemoveTodoList();

    showTodoList();
  }
}
