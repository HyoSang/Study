package study.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;
    private String sex;
    private Integer height;
    private Integer weight;
}
