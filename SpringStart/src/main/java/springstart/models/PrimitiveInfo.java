package springstart.models;


import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Getter
@Setter
public class PrimitiveInfo {
    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
    private String message;
}
