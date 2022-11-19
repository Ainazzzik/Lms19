import java.util.Objects;

public enum Week {
    ДУЙШОМБУ("Duishombu kunu Java okuim"),
    ШЕЙШЕМБИ("praktika lesson Java");

    private String lessons;

    Week(String lessons) {
        this.lessons = lessons;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Week{" +
                "lessons='" + lessons + '\'' +
                '}'+super.toString();
    }
}
    
