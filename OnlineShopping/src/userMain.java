import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class userMain {
    private static  Map<String, String> users = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadUsersData();

        Scanner input = new Scanner(System.in);
        System.out.println("If you are customer enter 1,and 2 for administrator ");
        int number=input.nextInt();
        if(number==2) {
            System.out.println("Enter your userID :");
            String userIDD = input.next();
            File f = new File("D:/cps/account." + userIDD + "txt");
            if (!f.exists()) {
                System.out.println("The userid does not exist.");
            } else {
                Scanner fileScanner = new Scanner(f);
                String storedPassword = fileScanner.nextLine();
                fileScanner.close();

                System.out.print("Enter the password:");
                String enteredPassword = input.next();

                if (enteredPassword.equals(storedPassword)) {
                    System.out.println("Login successful!");
                    performAdminActions();


                } else {
                    System.out.println("Incorrect password. Login failed.");
                }
            }



        }
        else {

            System.out.print("Whether you have an account" + " " + "Enter yes or no");
            String answer = input.next();


            if (answer.equals("no")) {
//                account1 account = new account1();
                System.out.println("Enter your userID");
                String userID = input.next();
                java.io.File file = new java.io.File("D:/cps/account." + userID + "txt");

                if (!file.exists()) {

                    System.out.print("Enter the password");
                    String password = input.next();
                    System.out.println("Enter the password again");
                    String password1 = input.next();
                    while (!password1.equals(password)) {
                        System.out.println("Passwords do not match. Please enter again");
                        password1 = input.next();
                    }

                    FileWriter writer = new FileWriter(file);
                    writer.write(password);
                    writer.close();
                    users.put(userID, password);



                    System.out.println("You have created the account.");
                } else {
                    file.createNewFile();
                    System.out.println("The ID has been created.");
                }
            } else {
                System.out.println("Enter your userID :");
                String userIDD = input.next();
                File f = new File("D:/cps/account." + userIDD + "txt");
                if (!f.exists()) {
                    System.out.println("The userid does not exist.");
                } else {
                    Scanner fileScanner = new Scanner(f);
                    String storedPassword = fileScanner.nextLine();
                    fileScanner.close();

                    System.out.print("Enter the password:");
                    String enteredPassword = input.next();

                    if (enteredPassword.equals(storedPassword)) {
                        System.out.println("Login successful!");
//                        List<product> products = initializeProducts();

                        System.out.println("Welcome to Online Shopping!");
//                        displayProducts(products);
                    } else {
                        System.out.println("Incorrect password. Login failed.");
                    }
                }
            }
        }
        saveUsersData();
    }
    private static void performAdminActions() throws IOException {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose the functions,1 for add users,2 for changeusers ,3 for view all members ,4 for exit");
            int adminChoice = input.nextInt();
            if (adminChoice == 4) {
                System.out.println("Exiting admin panel.");
                break;  // Exit the while loop
            }
            switch (adminChoice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    viewUsers();
                    break;
                case 4:
                    System.out.println("Invalid choice. Exiting admin panel.");
            }
        }
    }

    private static void addUser() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new user ID:");
        String newUserID = input.next();

        if (!users.containsKey(newUserID)) {
            System.out.println("Enter new user password:");
            String newPassword = input.next();
            users.put(newUserID, newPassword);
            java.io.File file = new java.io.File("D:/cps/account." + newUserID + "txt");
            file.createNewFile();


            System.out.println("User added successfully!");
        } else {
            System.out.println("User already exists. Cannot add duplicate user.");
        }
    }

    private static void deleteUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user ID to delete:");
        String userIDToDelete = input.next();

        if (users.containsKey(userIDToDelete)) {
            users.remove(userIDToDelete);
            java.io.File file = new java.io.File("D:/cps/account." +userIDToDelete + "txt");
            file.delete();
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User not found. Deletion failed.");
        }
    }

    private static void viewUsers() {
        System.out.println("Registered Users:");
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println("User ID: " + entry.getKey() + ", Password: " + entry.getValue());
        }
    }



    private static void loadUsersData() throws IOException {
        // Read user data from the file and populate the 'users' map
        File dataFile = new File("D:/cps/user_data.txt");
        if (dataFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        users.put(parts[0], parts[1]);
                    }
                }
            }
        }
    }
    private static void saveUsersData() throws IOException {
        // Write user data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:/cps/user_data.txt"))) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        }
    }}






