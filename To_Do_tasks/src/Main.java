import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        todolist t = new todolist();
        boolean z =true ;
        while (z){
            System.out.println("enter task name ");
            String task_name =x.nextLine();
            System.out.println("enter task priority"+"  "+ "input decimal number from 0 to 100");
            int priority = Integer.parseInt(x.nextLine());
            System.out.println("enter task date ");
            String date =x.nextLine();
            System.out.println("enter completion status (true , false )");
            boolean Completion_status = Boolean.parseBoolean(x.nextLine());
            task t1 =new task(task_name ,date ,priority,Completion_status);
            t.add(t1);
            System.out.println("do you want to add more tasks (yes or no )");
            String r = x.nextLine();
            z=r.equals("yes");

        }
        System.out.println("all tasks are ");
        t.display_all_courst();
        System.out.println("*************************************************************");
        t.display_incompleted_tasks();
    }
}