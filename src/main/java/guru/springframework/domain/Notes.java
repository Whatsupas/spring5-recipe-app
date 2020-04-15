package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by Robertas Tutlys on 2020-04-15
 */
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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
