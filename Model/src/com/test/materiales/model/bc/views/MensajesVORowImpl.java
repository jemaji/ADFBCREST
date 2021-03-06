package com.test.materiales.model.bc.views;

import java.sql.Timestamp;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 07 10:40:10 CET 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MensajesVORowImpl extends ViewRowImpl {
    public static final int ENTITY_MENSAJESEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Id,
        CuerpoMensaje,
        FechaLectura,
        FechaCreacion,
        UsuarioCreacion,
        FechaModificacion,
        UsuarioModificacion,
        PeticionesId,
        Sentido,
        Peticiones;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return MensajesVORowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return MensajesVORowImpl.AttributesEnum.firstIndex() + MensajesVORowImpl.AttributesEnum
                                                                                    .staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = MensajesVORowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int CUERPOMENSAJE = AttributesEnum.CuerpoMensaje.index();
    public static final int FECHALECTURA = AttributesEnum.FechaLectura.index();
    public static final int FECHACREACION = AttributesEnum.FechaCreacion.index();
    public static final int USUARIOCREACION = AttributesEnum.UsuarioCreacion.index();
    public static final int FECHAMODIFICACION = AttributesEnum.FechaModificacion.index();
    public static final int USUARIOMODIFICACION = AttributesEnum.UsuarioModificacion.index();
    public static final int PETICIONESID = AttributesEnum.PeticionesId.index();
    public static final int SENTIDO = AttributesEnum.Sentido.index();
    public static final int PETICIONES = AttributesEnum.Peticiones.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MensajesVORowImpl() {
    }

    /**
     * Gets MensajesEO entity object.
     * @return the MensajesEO
     */
    public EntityImpl getMensajesEO() {
        return (EntityImpl) getEntity(ENTITY_MENSAJESEO);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for CUERPO_MENSAJE using the alias name CuerpoMensaje.
     * @return the CUERPO_MENSAJE
     */
    public String getCuerpoMensaje() {
        return (String) getAttributeInternal(CUERPOMENSAJE);
    }

    /**
     * Sets <code>value</code> as attribute value for CUERPO_MENSAJE using the alias name CuerpoMensaje.
     * @param value value to set the CUERPO_MENSAJE
     */
    public void setCuerpoMensaje(String value) {
        setAttributeInternal(CUERPOMENSAJE, value);
    }

    /**
     * Gets the attribute value for FECHA_LECTURA using the alias name FechaLectura.
     * @return the FECHA_LECTURA
     */
    public Timestamp getFechaLectura() {
        return (Timestamp) getAttributeInternal(FECHALECTURA);
    }

    /**
     * Sets <code>value</code> as attribute value for FECHA_LECTURA using the alias name FechaLectura.
     * @param value value to set the FECHA_LECTURA
     */
    public void setFechaLectura(Timestamp value) {
        setAttributeInternal(FECHALECTURA, value);
    }

    /**
     * Gets the attribute value for FECHA_CREACION using the alias name FechaCreacion.
     * @return the FECHA_CREACION
     */
    public Timestamp getFechaCreacion() {
        return (Timestamp) getAttributeInternal(FECHACREACION);
    }

    /**
     * Sets <code>value</code> as attribute value for FECHA_CREACION using the alias name FechaCreacion.
     * @param value value to set the FECHA_CREACION
     */
    public void setFechaCreacion(Timestamp value) {
        setAttributeInternal(FECHACREACION, value);
    }

    /**
     * Gets the attribute value for USUARIO_CREACION using the alias name UsuarioCreacion.
     * @return the USUARIO_CREACION
     */
    public String getUsuarioCreacion() {
        return (String) getAttributeInternal(USUARIOCREACION);
    }

    /**
     * Sets <code>value</code> as attribute value for USUARIO_CREACION using the alias name UsuarioCreacion.
     * @param value value to set the USUARIO_CREACION
     */
    public void setUsuarioCreacion(String value) {
        setAttributeInternal(USUARIOCREACION, value);
    }

    /**
     * Gets the attribute value for FECHA_MODIFICACION using the alias name FechaModificacion.
     * @return the FECHA_MODIFICACION
     */
    public Timestamp getFechaModificacion() {
        return (Timestamp) getAttributeInternal(FECHAMODIFICACION);
    }

    /**
     * Sets <code>value</code> as attribute value for FECHA_MODIFICACION using the alias name FechaModificacion.
     * @param value value to set the FECHA_MODIFICACION
     */
    public void setFechaModificacion(Timestamp value) {
        setAttributeInternal(FECHAMODIFICACION, value);
    }

    /**
     * Gets the attribute value for USUARIO_MODIFICACION using the alias name UsuarioModificacion.
     * @return the USUARIO_MODIFICACION
     */
    public String getUsuarioModificacion() {
        return (String) getAttributeInternal(USUARIOMODIFICACION);
    }

    /**
     * Sets <code>value</code> as attribute value for USUARIO_MODIFICACION using the alias name UsuarioModificacion.
     * @param value value to set the USUARIO_MODIFICACION
     */
    public void setUsuarioModificacion(String value) {
        setAttributeInternal(USUARIOMODIFICACION, value);
    }

    /**
     * Gets the attribute value for PETICIONES_ID using the alias name PeticionesId.
     * @return the PETICIONES_ID
     */
    public Integer getPeticionesId() {
        return (Integer) getAttributeInternal(PETICIONESID);
    }

    /**
     * Sets <code>value</code> as attribute value for PETICIONES_ID using the alias name PeticionesId.
     * @param value value to set the PETICIONES_ID
     */
    public void setPeticionesId(Integer value) {
        setAttributeInternal(PETICIONESID, value);
    }

    /**
     * Gets the attribute value for SENTIDO using the alias name Sentido.
     * @return the SENTIDO
     */
    public String getSentido() {
        return (String) getAttributeInternal(SENTIDO);
    }

    /**
     * Sets <code>value</code> as attribute value for SENTIDO using the alias name Sentido.
     * @param value value to set the SENTIDO
     */
    public void setSentido(String value) {
        setAttributeInternal(SENTIDO, value);
    }

    /**
     * Gets the associated <code>PeticionesVORowImpl</code> using master-detail link Peticiones.
     */
    public PeticionesVORowImpl getPeticiones() {
        return (PeticionesVORowImpl) getAttributeInternal(PETICIONES);
    }

    /**
     * Sets the master-detail link Peticiones between this object and <code>value</code>.
     */
    public void setPeticiones(PeticionesVORowImpl value) {
        setAttributeInternal(PETICIONES, value);
    }
}

