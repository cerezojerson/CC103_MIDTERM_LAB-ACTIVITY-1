import java.util.*;
public class Main {

public static void main(String[] args) {


Stack<String> stackName = new Stack<>();


stackName.push("Jerson");

stackName.push("Lowegie");

stackName.push("Curt");

stackName.push("Rhanniel");

stackName.push("Cerezo");

stackName.push("Raga");

stackName.push("Guiling");

stackName.push("Navat");

//stackName.add(8, "Pogi");
//stackName.add(9, "Hello");
//stackName.add(10, "Maganda");

//String Stackname = stackName.remove(4);
//System.out.println("Removed element: " + Stackname);

System.out.println("Top 5 elements:");
for (int i = 0; i < 5; i++) {    System.out.println(stackName.pop());
}

//System.out.println("Elements:" + stackName);

//System.out.println("Empty? " + stackName.isEmpty());
}
  }
  
