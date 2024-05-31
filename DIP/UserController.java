public class UserController {
    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    public User getUser(Long id) {
        return userService.findUserById(id);
    }

    public User createUser(User user) {
        return userService.saveUser(user);
    }
}