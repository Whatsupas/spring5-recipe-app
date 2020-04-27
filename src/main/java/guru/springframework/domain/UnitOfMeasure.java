package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Robertas Tutlys on 2020-04-20
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;
}
