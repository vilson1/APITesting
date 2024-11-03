package day6;

import DAY5.pet.PetCategory;
import DAY5.pet.PetTags;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pet {
    @JsonProperty("id")
    private long petID;
    @JsonProperty("category")
    private PetCategory petCategory;
    @JsonProperty("name")
    private String petName;
    @JsonProperty("photoUrls")
    private List<String> url;
    @JsonProperty("tags")
    private List<PetTags> petTags;
    @JsonProperty("status")
    private String petStatus;

}
