public interface IUserService {
    User findUserById(Long id);
    User saveUser(User user);
}