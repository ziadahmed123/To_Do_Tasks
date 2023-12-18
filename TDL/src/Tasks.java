import java.util.ArrayList;

public class Tasks {
    //private manager_tasks m ;
    private ArrayList<manager_tasks> tasks ;
    public Tasks() {
        tasks=new ArrayList<>();
    }
    public void add (manager_tasks task) {
        tasks.add(task);
    }
    public void display_all_courst() {
        for (manager_tasks task : tasks) {
            System.out.println("All Tasks Are  " + task);
        }
    }
    public void display_incompleted_tasks() {
        for (manager_tasks task : tasks) {
            if (!task.isCompletion_status()) {
                System.out.println("tasks need to complete are :  " + task);
            }
        }
    }
}
