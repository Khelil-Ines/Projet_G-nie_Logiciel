public class UserRepositoryImpl implements IUserRepository {
    private Map<Long, User> userDatabase = new HashMap<>();

    @Override
    public User findById(Long id) {
        return userDatabase.get(id);
    }

    @Override
    public User save(User user) {
        userDatabase.put(user.getId(), user);
        return user;
    }
}