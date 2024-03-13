package homework;

public class Main{
    public static void main(String[] args){
        UserSave userSave = new Persister();
        User user = new User("Bob", userSave);
        user.report();
        user.save();
    }
}