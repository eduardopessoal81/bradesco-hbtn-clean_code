import java.net.URL;
import java.util.Date;
import java.util.List;

public class Name {

    // Variáveis que falam por si só (A)
    public Date modifiedDate;

    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        return null;
    }

    // Declarações corretas (A)
    public List<Account> accountList;

    // Sem prefixos (B)
    public void deleteUser(Name.User user) {
    }

    // Evite mapa mental (B)
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos (A)
    public class TableRepresent {
    }

    public void saveCar() {
    }

    // Uma palavra por conceito (A)
    public void saveUser() {
    }

    public void saveAccount() {
    }

    public void saveContract() {
    }

    // Use constants, enums instead of magic numbers (B)
    public static final int DAYS_IN_YEAR = 360;
    public static final int HOURS_IN_WEEK = 168;

    // Classes auxiliares fictícias para compilação
    public static class User {}
    public static class Testcase {}
    public static class Account {}
}