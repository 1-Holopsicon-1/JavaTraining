package springstart.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class PrimitiveInfo {
    private @Id @GeneratedValue Long id;
    private String message;
}
