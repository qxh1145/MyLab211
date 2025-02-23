package week5.shortP109.view;

import week4.Long21.view.Validation;

import java.util.ArrayList;

public abstract class Menu<T> {

    private String title;
    private ArrayList<T> options;
    private boolean isStop;

    public Menu() {
        this.isStop = false;
    }

    public Menu(String title, String[] options) {
        this.title = title;

        this.options = new ArrayList<>();

        for (var option : options) {
            this.options.add((T) option);
        }

        this.isStop = false;
    }

    public void display() {
        System.out.println(this.title);


        for (int i = 0; i < this.options.size(); i++) {
            System.out.println((i + 1) + "." + this.options.get(i));
        }

    }

    public int getSelected() {
        this.display();

        return Validation.getInt("Enter selection: ", 1, this.options.size());
    }

    public abstract void execute(int choice) throws Exception;

    protected void stop() {
        this.isStop = true;
    }

    public void run() throws Exception {
        while (!this.isStop) {
            int choice = getSelected();

            this.execute(choice);

            if (choice > this.options.size()) {
                break;
            }
        }
    }
}
