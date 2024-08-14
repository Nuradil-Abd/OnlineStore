import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        Product product = new Product();


        User user = new User("nura","abd","Nuradil@gmail.com","Nura123", product);
        User user1 = new User("atai","dfg","Atai@gmail.com","Atai333", product);
        User user2 = new User("kalyk","BNM","Kalyk@gmail.com","Kalyk666", product);

        DbUsers dbUsers = new DbUsers();
        dbUsers.addUser(user);
        dbUsers.addUser(user1);
        dbUsers.addUser(user2);
//        System.out.println(dbUsers);
        System.out.println();


        System.out.println("Welcome!");

        while(true) {

            System.out.println("""
                    
                    Write command
                    1. Register
                    2. Login 
                    3. Exit""");

            String move = scanStr.nextLine();
            if (move.equals("1")){
                dbUsers.addUser(register(dbUsers));
//                System.out.println(dbUsers);
            }
            if (move.equals("2")){
                if(login(dbUsers)){

                }else System.out.println("Try again later! ");
                break;
            }
            if (move.equals("3")) return;

        }
    }

    public static User register(DbUsers dbUsers) {
        Scanner scanStr = new Scanner(System.in);


         User user = new User();


            do {
                System.out.print("Write name: ");
                user.setFirstName(scanStr.nextLine());
            } while (user.getFirstName().isEmpty());
            do {
                System.out.print("\nWrite surname: ");
                user.setLastName(scanStr.nextLine());
            } while (user.getLastName().isEmpty());
            do {
                do {
                    System.out.println("\nMail must contain at least 4 characters + domain @gmail.com");       //   @gmail.com
                    System.out.print("\nWrite gmail: ");
                    user.setEmail(scanStr.nextLine());
                    if(checkBd(dbUsers,user)) System.out.println("I already have an account with this email");

                } while (!isValidEmail(user.getEmail()));
            }while (checkBd(dbUsers,user));
            do {
                System.out.println("\nThe password must contain: at least one capital letter, one number, and at least 4 characters!");
                System.out.print("\nWrite password: ");
                user.setPassword(scanStr.nextLine());
            } while (!isValidPassword(user.getPassword()));

        System.out.println("You have successfully registered !!!");


        return user;

    }

    public static boolean isValidEmail(String email) {
        return email.length() >= 14 && email.endsWith("@gmail.com");
    }

    public static boolean isValidPassword(String password) {
        boolean size = false;
        boolean hasDigit = false;
        boolean hasUppercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (password.length() >= 4){
                size = true;
            }
            if (hasDigit && hasUppercase && size) {
                return true;
            }
        }
        return false;
    }

    public static boolean login(DbUsers dbUsers){
        boolean checkEmail = false;
        boolean checkPassword = false;

        User targetUser = new User();
        Scanner scannerStr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

        System.out.print("\nWrite email: ");
        String email = scannerStr.nextLine();
        System.out.print("Write password: ");
        String password = scannerStr.nextLine();


        for (User dbUser : dbUsers.getDbUsers()) {

        if(email.equals(dbUser.getEmail())){
            checkEmail = true;
        }
        if(password.equals(dbUser.getPassword())){
            checkPassword = true;
            targetUser = dbUser;
        }
        }
        if (checkEmail && checkPassword){
            System.out.println("\nYou have successfully logged in !!! Welcome");
            System.out.println(targetUser);
            i = 4;
        }else {
            System.err.println("Wrong login or password");
            System.out.println();
            }
        }
        return checkPassword;

    }
    public static boolean checkBd(DbUsers dbUsers, User user){
        boolean email = false;

        for (User dbUser : dbUsers.getDbUsers()) {
            if(user.getEmail().equals(dbUser.getEmail())){
                email = true;
            }
        }return email;
    }



}