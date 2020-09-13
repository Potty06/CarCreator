package com.company;

import java.util.ArrayList;
import java.util.List;

public class Masini implements conversieCai {
    private String marcaInsert;
    private String modelInsert;
    private Integer caiPutere;
    private String culoare;
    private String evacuare;
    private String admisie;


    private List<Options> optiune;


    public Masini() {

    }


    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getEvacuare() {
        return evacuare;
    }

    public void setEvacuare(String evacuare) {
        this.evacuare = evacuare;
    }

    public String getAdmisie() {
        return admisie;
    }

    public void setAdmisie(String admisie) {
        this.admisie = admisie;
    }

    public Masini(String marcaInsert, String modelInsert, Integer caiPutere, String culoare, String evacuare, String admisie) {
        this.marcaInsert = marcaInsert;
        this.modelInsert = modelInsert;
        this.caiPutere = caiPutere;
        this.culoare = culoare;
        this.evacuare = evacuare;
        this.admisie = admisie;
    }

    public Integer getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(Integer caiPutere) {
        this.caiPutere = caiPutere;
    }

    public String getMarcaInsert() {
        return marcaInsert;
    }

    public void setMarcaInsert(String marcaInsert) {
        this.marcaInsert = marcaInsert;
    }

    public String getModelInsert() {
        return modelInsert;
    }

    public void setModelInsert(String modelInsert) {
        this.modelInsert = modelInsert;
    }

    public List<Options> getOptiune() {
        return optiune;
    }

    public void setOptiune(List<Options> optiune) {
        this.optiune = optiune;
    }

    @Override
    public String toString() {
        return   "Marca " + marcaInsert + '\'' +
                ", model " + modelInsert + '\'' +
                ", cai putere " + caiPutere +
                ", culoare " + culoare + '\'' +
                ", evacuare ='" + evacuare + '\'' +
                ", admisie= " + admisie + '\'' +
                ", optiune " + optiune +
                '\n';
    }

    @Override
    public void cpToKw() {
        System.out.println("Valoarea in KW este: " + caiPutere * 0.745);
    }

    public void cpToKw(Integer caiPutere) {
        if (caiPutere < 300) {
            System.out.println("Valoarea in KW este: " + caiPutere * 0.745);
        }
        else {
            System.out.println("Valoarea este prea mare pentrua  fi convertita");
        }
    }
}
//    @Override
//    public void carColour() {
//        System.out.println("Masina are culoarea: " + getOptiune1());
//    }
//
//    @Override
//    public void powerCompare(int putereComparata) {
//        if(getOptiune2() > putereComparata)
//            System.out.println("Masina: " + getMarcaInsert() + " este mai puternica!");
//        else
//            System.out.println("Masina " + getMarcaInsert() + " este mai slaba");
//    }
////
//
//    public void printDetalii() {
//        System.out.println("Masina este " + getMarcaInsert() + " si are " + getModelInsert() + " ani si are culoarea " + getOptiune1()+ " si are " + getOptiune2() + " cai putere") ;
//        if (optiuni != null)
//            for (Optiuni optiune: optiuni) {
//                System.out.println(optiune + " ");
//            }
//    }
//    public void caiPutere() {
//        System.out.println("Masina este foarte puternica, ea are: " + getOptiune2() + " CP");
//    }

