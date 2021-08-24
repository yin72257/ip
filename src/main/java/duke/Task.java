package duke;

public class Task {

    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        String s = "[" + getStatusIcon() + "] " + getDescription();
        return s;
    }

    public void markedAsDone() {
        isDone = true;
    }
}