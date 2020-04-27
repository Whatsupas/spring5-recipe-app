package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Robertas Tutlys on 2020-04-15
 */
@Data
@Entity
public class Notes {

    @Id
    // .IDENTIFY : automatically getting primary key value from database (hibernate executes insert statement to get key value from DB)
    // DB take cares of primary key not hibernate it self
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Recipe recipe;

    @Lob // allows to put string larger than default 255 char
    private String recipeNotes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
