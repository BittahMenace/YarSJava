package lesson33ConsoleMenu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserHub {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    String filepath = "userHub.txt";


    public void createUser() {
        User user = new User();
        System.out.print("Enter login: ");
        user.setLogin(input.next());
        System.out.println("Enter password: ");
        user.setPassword(input.next());
        users.add(user);
    }


    public void showUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    public boolean deleteUser() {
        showUsers();
        System.out.println("\nChoose user by ID: ");
        int userId = input.nextInt();
        for (int i = 0; i < users.size(); i++) {
            if (userId == users.get(i).getId()) {
                users.remove(i);
                return true;
            }

        }
        System.out.println("Cannot find user with this ID " + userId);
        return false;
    }

    public User findUser() {
        return null;
    }


    public void saveData() {
        try {
            // 1 Find file
            FileOutputStream fileOutputStream = new FileOutputStream(filepath);
            // 2 Open file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // 3 Write to tile
            objectOutputStream.writeObject(users);
            // 4 Close file
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + filepath + " not found!!!");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with opening file!!!");
//            e.printStackTrace();
        }
    }

    public void loadData(){
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            users = (ArrayList<User>) objectInputStream.readObject();

            if(users == null){
                users = new ArrayList<>();
            }


        } catch (FileNotFoundException e) {
            System.out.println("File " + filepath + " not found!!!");
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with opening file!!!");
//            e.printStackTrace();
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        }
    }

}
