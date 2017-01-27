/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina1;

import java.util.Date;

/**
 *
 * @author z0s0xp
 */
public class Nomina {
    private Trabajador worker;
    private Date fechapago;
    private float saldo;

    public Trabajador getWorker() {
        return worker;
    }

    public void setWorker(Trabajador worker) {
        this.worker = worker;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
