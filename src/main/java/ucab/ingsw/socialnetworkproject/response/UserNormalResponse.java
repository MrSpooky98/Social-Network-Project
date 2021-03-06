package ucab.ingsw.socialnetworkproject.response;

import lombok.Data;
import lombok.ToString;

//Respuesta enviada para operciones normales
@Data
@ToString
public class UserNormalResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
}
