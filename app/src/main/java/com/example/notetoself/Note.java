package com.example.notetoself;

public class Note {
    private String title;
    private String description;
    private boolean idea;
    private boolean todo;
    private boolean important;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isIdea() {
        return idea;
    }

    public boolean isTodo() {
        return todo;
    }

    public boolean isImportant() {
        return important;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdea(boolean idea) {
        this.idea = idea;
    }

    public void setTodo(boolean todo) {
        this.todo = todo;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }
}
