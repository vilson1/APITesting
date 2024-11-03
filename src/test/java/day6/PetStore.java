package day6;


import DAY5.pet.PetTags;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PetStore {

    @JsonProperty("tags")
    private List<PetTags> petTags;
    @JsonProperty("status")
    private String petStatus;
}
