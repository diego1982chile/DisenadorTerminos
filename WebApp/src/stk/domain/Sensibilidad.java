package stk.domain;

/**
 * Created by diego on 06/07/2016.
 */
public class Sensibilidad {

    private Integer id;
    private String name;

    public Sensibilidad() {
    }

    public Sensibilidad(Integer id, String name) {
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
