package cuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * La clase CCuenta representa una cuenta bancaria con información sobre el
 * nombre del titular, el número de cuenta, el saldo actual y el tipo de
 * interés. Permite realizar operaciones como ingresar y retirar dinero.
 *
 * @author vazqu
 * @version 1.0, 14/02/2024
 */
public class CCuenta {

    private String nombre; //Nombre del titular de la cuenta
    private String cuenta; //Número de cuenta
    private double saldo; //Saldo actual de la cuenta
    private double tipoInterés; //Ripo de interés aplicado a la cuenta

    //**Metodos Getters y Setters**//
    /**
     * Obtiene el nombre del titular de la cuenta
     *
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     *
     * @param nombre nombre del titular a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta
     *
     * @return el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     *
     * @param cuenta el número de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo acutal de la cuenta
     *
     * @return el saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta
     *
     * @param saldo el saldo actual a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     *
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta
     *
     * @param tipoInterés tipo de interés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    //**Metodos constructores**//
    /**
     * Constructo por defecto de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor mediante parametros de la clase CCuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    //**Metodos**//

    /**
     * Devuelve el saldo actual de la cuenta
     *
     * @return saldo actual
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar
     * @throws Exception Si la cantidad es negativa o si no hay suficiente
     * saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
