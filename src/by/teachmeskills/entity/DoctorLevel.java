package by.teachmeskills.entity;

public enum DoctorLevel {
    INTERN_DOCTOR("Интерн", 10), DOCTOR("Доктор", 7), HEAD_DOCTOR("Зав. отделением", 5);
    private String description;
    private int time;

    DoctorLevel(String description, int time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }
}
