import javax.persistence.*;

public class Main {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
    }
}
