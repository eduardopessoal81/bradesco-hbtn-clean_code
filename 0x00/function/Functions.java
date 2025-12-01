import java.util.Date;
import org.springframework.web.bind.annotation.PostMapping;

public class Functions {

    //Faça somente 1 coisa (B)
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    //Somente 1 nível de abstração (A)
    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }

    //Poucos argumentos (A)
    public void saveUserSimple(User user) {
    }

    //No side effects (A)
    public User saveUser(User user){
        if(user.isAdmin){
            user.setRole(user);
        }
        return userRepository.save(user);
    }

    //Evite duplicados, extraindo para novos métodos (B)
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }

    //Dependências simuladas para compilação
    private IncomeRepository inRepo;
    private ExpenseRepository outRepo;
    private UserService userService;
    private UserRepository userRepository;
    private EnvironmentService environmentService;
    private ReleaseService releaseService;
    private VersionService versionService;

    //Classes e interfaces auxiliares fictícias
    static class Income {}
    static class Expense {}

    static class User {
        boolean isAdmin;
        void setRole(User user) {}
    }

    static class Environment {}
    static class Release {}

    interface IncomeRepository { void save(Income income); }
    interface ExpenseRepository { void save(Expense expense); }
    interface UserRepository { User save(User user); }
    interface UserService { User save(User user); }
    interface EnvironmentService { Environment getEnvironment(String version); }
    interface ReleaseService { Release getRelease(String version); }
    interface VersionService { String getVersion(); }
}