package com.test.materiales.view.beans;

import com.test.materiales.view.utils.ADFUtils;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

public class MensajesBean {
    public MensajesBean() {
    }

    public void saveMessage(ValueChangeEvent valueChangeEvent) 
    {
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        ADFUtils.findOperation("Commit").execute();
    }
}
