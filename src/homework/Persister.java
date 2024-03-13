package homework;

public class Persister implements UserSave{

    @Override
    public void userSave(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
