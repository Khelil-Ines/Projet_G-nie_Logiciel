public interface IUserRepository {
    User findById(Long id);
    User save(User user);
}