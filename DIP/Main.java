public class Main {
    public static void main(String[] args) {
        IUserRepository userRepository = new UserRepositoryImpl();
        IUserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        User user = new User(1L, "Montassar", "Jalloul", "montassarjelloul@example.com", "password123", "http://example.com/image.jpg", "Active");
        userController.createUser(user);

        User retrievedUser = userController.getUser(1L);
        System.out.println("Retrieved User: " + retrievedUser.getPrenom() + " " + retrievedUser.getNom());
    }
}