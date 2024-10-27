package DAY5.pet;

import java.util.List;

public class Pet {
    public long id;
    public PetCategory category;
    public String name;
    public List<String> photoUrls;
   public List<PetTags> tags;
   public String status;

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}
