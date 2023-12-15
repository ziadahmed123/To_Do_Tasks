import java.util.ArrayList;

public class todolist {
    private ArrayList<task>tasks ;
    public todolist(){
        tasks=new ArrayList<>();

    }
    public void add (task task){
        tasks.add(task);
    }
    public void display_all_courst() {
        for (task task : tasks) {
            System.out.println("All Tasks Are  " + task);
        }
    }
    public void display_incompleted_tasks(){
            for(task task :tasks){
                if(!task.isCompletion_status()){
                    System.out.println("tasks need to complete are :  "+task);
                }
            }
        }
    }

