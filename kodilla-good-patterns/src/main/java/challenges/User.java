package challenges;

public class User {
    private final String userName;
    private final String userSurName;

    public User(String userName,String userSurName) {
        this.userName = userName;
        this.userSurName =userSurName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurName() {
        return userSurName;
    }
}
