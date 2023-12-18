public abstract class manager_tasks {
    private String name ;
    private String date ;
    private int  priority;
    private boolean completion_status ;

    public manager_tasks(String name, String date, int priority, boolean completion_status) {
        this.name = name;
        this.date = date;
        this.priority = priority;
        this.completion_status = completion_status;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompletion_status() {
        return completion_status;
    }
    public void mark (){
        this.completion_status=true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", priority=" + priority +
                ", completion_status=" + completion_status +
                '}';
    }
}
