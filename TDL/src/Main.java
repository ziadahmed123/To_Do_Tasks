public class Main {
    public static void main(String[] args) {
        set_info s = new set_info("oop","25/11",100,true);
        set_info s2 =new set_info("Data structure","30/12 ",70 ,false);
        Tasks t = new Tasks();
        t.add(s);
        t.add(s2);
        t.display_all_courst();
        t.display_incompleted_tasks();

    }
}