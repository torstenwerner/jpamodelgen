import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SomeEntity {
    @Id
    private String K101;

    public String getK101() {
        return K101;
    }

    public void setK101(String k101) {
        K101 = k101;
    }
}
