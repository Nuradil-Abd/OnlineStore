public class User {

    private String firstName, lastName, email, password;
    private Product products;



    public User() {
    }

    public User(String firstName, String lastName, String email, String password, Product products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "     " +
                "\nfirst name: " + firstName +
                "\nlast name: " + lastName +
                "\nemail: " + email +
                "\npassword: " + password +
                "\nproducts: " + products +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~";
    }


}

