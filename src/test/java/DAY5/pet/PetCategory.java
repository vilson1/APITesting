package DAY5.pet;

public class PetCategory {
    private long id;
    private  String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
