/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Modulo_Seguridad;

/**
 *
 * @author Alejandra
 */
import javax.persistence.*;

@Entity
@Table(name="Bitacora")

public class Bitacora {
    
@Id @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
private long idBitacora;

@ManyToOne(targetEntity = Operacion.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
private Operacion operacion;

private String fecha;
private String nroComprobante;

    /**
     * @return the idBitacora
     */
    public long getIdBitacora() {
        return idBitacora;
    }

    /**
     * @param idBitacora the idBitacora to set
     */
    public void setIdBitacora(long idBitacora) {
        this.idBitacora = idBitacora;
    }

    /**
     * @return the operacion
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nroComprobante
     */
    public String getNroComprobante() {
        return nroComprobante;
    }

    /**
     * @param nroComprobante the nroComprobante to set
     */
    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }
    
}
