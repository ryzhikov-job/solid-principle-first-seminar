package homework;

public class User{
    private final String name;
    private final UserSave userSave;

    public User(String name, UserSave userSave) {
        this.name = name;
        this.userSave = userSave;
    }

    public String getName() {
        return name;
    }

    public void save() {
        userSave.userSave(this);
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }
}
