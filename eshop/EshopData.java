package eshop;

import java.util.ArrayList;
import entities.*;

public class EshopData {

  private static ArrayList<User> users = new ArrayList<User>();

  public static ArrayList<User> getUsers() {
    return users;
  }

  public static void setUsers(ArrayList<User> users) {
    EshopData.users = users;
  }
}