package ucab.ingsw.socialnetworkproject.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ToString
public class User  implements Serializable {
    @Id
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private String authToken;
}
