package stk.domain;

/**
 * Created by diego on 06/07/2016.
 */
public class DescriptionType {

    private Integer id;
    private String name;

    public DescriptionType() {
    }

    public DescriptionType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
