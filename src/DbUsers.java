import java.util.Arrays;

public class DbUsers {

    private User[] dbUsers;
    private int size;



   public DbUsers(){
       dbUsers = new User[0];
       size = 0;
   }
    public void addUser(User user) {
       dbUsers = Arrays.copyOf(dbUsers, dbUsers.length + 1);
        dbUsers[dbUsers.length - 1] = user;
        size = dbUsers.length;

    }

    public User[] getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(User[] dbUsers) {
        this.dbUsers = dbUsers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "Database: " + Arrays.toString(dbUsers) +
                "\nsize : " + size ;
    }


}
