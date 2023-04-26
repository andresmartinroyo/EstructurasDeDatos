/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12Libro;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Cliente {

    private int idNumber;
    private int age;
    private String sex;
    private boolean insuranceStatus;
    private String study;
    private int amount;
    private Cliente pNext;

    public Cliente() {
        this.idNumber = 0;
        this.age = 0;
        this.sex = "";
        this.insuranceStatus = false;
        this.study = "";
        this.amount = 0;
        this.pNext = null;

    }

    public Cliente(int idNumber, int age, String sex, boolean insuranceStatus, String study, int amount) {
        this.idNumber = idNumber;
        this.age = age;
        this.sex = sex;
        this.insuranceStatus = insuranceStatus;
        this.study = study;
        this.amount = amount;
        this.pNext = null;
    }

    //Factura
    public void receipt() {
        JOptionPane.showMessageDialog(null, "***********RECEIPT**********\n"
                + "ID: " + this.getIdNumber() + "\n"
                + "Age: " + this.getAge() + "\n"
                + "Sex: " + this.getSex() + "\n"
                + "Study: " + this.getAmount() + "\n"
                + "Amount: " + this.getAmount()
        );
    }

    //Mostar 
    public void show() {
        JOptionPane.showMessageDialog(null,
                "ID: " + this.getIdNumber() + "\n"
                + "Age: " + this.getAge() + "\n"
                + "Sex: " + this.getSex() + "\n"
                + "Study: " + this.getAmount() + "\n"
                + "Amount: " + this.getAmount()
        );
    }

    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the insuranceStatus
     */
    public boolean isInsuranceStatus() {
        return insuranceStatus;
    }

    /**
     * @param insuranceStatus the insuranceStatus to set
     */
    public void setInsuranceStatus(boolean insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    /**
     * @return the study
     */
    public String getStudy() {
        return study;
    }

    /**
     * @param study the study to set
     */
    public void setStudy(String study) {
        this.study = study;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the pNext
     */
    public Cliente getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Cliente pNext) {
        this.pNext = pNext;
    }

}
