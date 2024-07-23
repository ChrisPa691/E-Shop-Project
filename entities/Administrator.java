package entities;

import java.util.Date;

public abstract class Administrator extends User {
    public Administrator(String name, String username, String telephone, String email, String password,
            Date dateRegistered) {
        super(name, username, telephone, email, password, dateRegistered);
    }

    public void getUserInfo() {
        System.out.println("User Information: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Phone Number: " + this.getTelephone());
        System.out.println("Email: " + this.getEmail());
    }
}
