import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6

    // Create a map valled creditHours 
    MyHashMap<String, Integer> creditHours = new MyHashMap<>();

    // put() the following values
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Check for the following values
    boolean result = creditHours.containsKey("IT-1025");
    System.out.print("Check for IT-1025: ");
    if(result){
      System.out.println("TRUE");
    }
    else{
      System.out.println("FALSE");
    }

    result = creditHours.containsKey("IT-2110");
    System.out.print("Check for IT-2110: ");
    if(result){
      System.out.println("TRUE");
    }
    else{
      System.out.println("FALSE");
    }

    // Print all values in map
    System.out.println("");
    System.out.println("Current values in map:");
    java.util.Set<MyMap.Entry<String, Integer>> entries = creditHours.entrySet();
    for (MyMap.Entry<String, Integer> entry: entries){
      System.out.println(entry.key);
      }

    // Remove IT-2030 and IT-1150
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    // Print all values in map
    System.out.println("");
    System.out.println("Values in map after removal:");
    entries = creditHours.entrySet();

    for (MyMap.Entry<String, Integer> entry: entries){
      System.out.println(entry.key);
      }

  }
}