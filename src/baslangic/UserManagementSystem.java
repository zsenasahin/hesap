package baslangic;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class UserManagementSystem {
    private static ArrayList<User> users = new ArrayList<>();
    private static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Kayıt Ol");
            System.out.println("2) Giriş Yap");
            System.out.println("3) Listele");
            System.out.println("4) Sil");
            System.out.println("5) Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy read to consume the newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    listUsers();
                    break;
                case 4:
                    deleteUser(scanner);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        }
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();
        users.add(new User(username, password));
        System.out.println("Kayıt başarılı.");
    }

    private static void login(Scanner scanner) {
        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username)) {
                if (user.password.equals(password)) {
                    loggedInUser = user;
                    System.out.println("Giriş başarılı.");
                    return;
                } else {
                    System.out.println("Yanlış şifre!");
                    return;
                }
            }
        }

        System.out.println("Kullanıcı bulunamadı.");
    }

    private static void listUsers() {
        if (users.isEmpty()) {
            System.out.println("Henüz hiç kullanıcı yok.");
        } else {
            System.out.println("Kayıtlı Kullanıcılar:");
            for (User user : users) {
                System.out.println("Kullanıcı adı: " + user.username);
            }
        }
    }

    private static void deleteUser(Scanner scanner) {
        if (loggedInUser == null) {
            System.out.println("Sadece giriş yapan kullanıcı silinebilir.");
            return;
        }

        System.out.println("Silme işlemi için kullanıcı adı ve şifrenizi girin:");
        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                users.remove(user);
                if (user == loggedInUser) {
                    loggedInUser = null;
                }
                System.out.println("Kullanıcı silindi.");
                return;
            }
        }

        System.out.println("Kullanıcı adı veya şifre yanlış. Silme işlemi başarısız.");
    }

}
