import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    //prints task in this specific manner
    public void print() {
        int taskNumber = 1;

        for (String task : this.tasks) {
            System.out.println(taskNumber + ": " + task);
            taskNumber++;
        }
    }

    //removes task from list, based on its place on the list
    public void remove(int number) {
        this.tasks.remove(this.tasks.get(number - 1));
    }
}

