package stk.types;

import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.List;

/**
 * Created by diego on 26/06/2016.
 */
public class DynamicField implements Serializable {

    private String label;
    private Object value;
    private boolean required;
    private List<SelectItem> selectItems;
    private List<Object> values;
    private String type;

    public DynamicField() {
    }

    public DynamicField(String label, Object value, boolean required, List<SelectItem> selectItems, List<Object> values) {
        this.label = label;
        this.value = value;
        this.required = required;
        this.selectItems = selectItems;
        this.values = values;
    }

    public DynamicField(String label, Object value, boolean required, List<SelectItem> selectItems, List<Object> values, String type) {
        this.label = label;
        this.value = value;
        this.required = required;
        this.selectItems = selectItems;
        this.values = values;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> selectItems) {
        this.selectItems = selectItems;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

}
