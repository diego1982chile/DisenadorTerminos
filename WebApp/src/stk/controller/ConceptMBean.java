package stk.controller;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import stk.domain.Description;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by diego on 26/06/2016.
 */
@ManagedBean
@ViewScoped
public class ConceptMBean implements Serializable {

    public String getPreferido() {
        return preferido;
    }

    public void setPreferido(String preferido) {
        this.preferido = preferido;
    }

    private String preferido;

    private List<SelectItem> selectItems1 = new ArrayList<SelectItem>();
    private List<SelectItem> selectItems2 = new ArrayList<SelectItem>();
    private List<SelectItem> selectItems3 = new ArrayList<SelectItem>();

    private List<SelectItem> selectItems4 = new ArrayList<SelectItem>();

    private List<Description> descriptions = new ArrayList<Description>();

    private String otherTermino;

    //private SelectItem otherSensibilidad;
    private String otherSensibilidad;

    //private SelectItem otherDescriptionType;
    private String otherDescriptionType;


    @PostConstruct
    protected void initialize() {

        selectItems1.add(new SelectItem("Manual", "Manual"));
        selectItems1.add(new SelectItem("Autogenerado", "Autogenerado"));

        selectItems2.add(new SelectItem("Sensible", "Sensible"));
        selectItems2.add(new SelectItem("Insensible", "Insensible"));

        selectItems3.add(new SelectItem("Revisar", "Revisar"));
        selectItems3.add(new SelectItem("Consultar", "Consultar"));

        selectItems4.add(new SelectItem("", "Descriptor (*)"));
        selectItems4.add(new SelectItem("Abreviado", "Abreviado"));
        selectItems4.add(new SelectItem("Sinónimo", "Sinónimo"));
        selectItems4.add(new SelectItem("Mal escrito", "Mal escrito"));

        descriptions.add(new Description(1, "electro", "Propuesto", "Sinónimo", Calendar.getInstance().getTime(), "Insensible", "amauro"));
        descriptions.add(new Description(1, "helectro", "Propuesto", "Mal Escrito", Calendar.getInstance().getTime(), "Insensible", "amauro"));
    }

    public List<SelectItem> getSelectItems1() {
        return selectItems1;
    }

    public List<SelectItem> getSelectItems2() {
        return selectItems2;
    }

    public List<SelectItem> getSelectItems3() {
        return selectItems3;
    }

    public List<SelectItem> getSelectItems4() { return selectItems4; }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public String getMyFormattedDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Description Edited", ((Description) event.getObject()).getTermino());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Description) event.getObject()).getTermino());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getOtherTermino() {
        return otherTermino;
    }

    public void setOtherTermino(String otherTermino) {
        this.otherTermino = otherTermino;
    }

    public String getOtherSensibilidad() {
        return otherSensibilidad;
    }

    public void setOtherSensibilidad(String otherSensibilidad) {
        this.otherSensibilidad = otherSensibilidad;
    }


    public String getOtherDescriptionType() {
        return otherDescriptionType;
    }

    public void setOtherDescriptionType(String otherDescriptionType) {
        this.otherDescriptionType = otherDescriptionType;
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void removeItem(Description item) {
        descriptions.remove(item);
    }

    public void addItem() {
        System.out.println("this.otherTermino="+ this.otherTermino);
        descriptions.add(new Description(3, getOtherTermino(), "Propuesto", getOtherDescriptionType(), Calendar.getInstance().getTime(), getOtherSensibilidad(), "amauro"));
    }

}

