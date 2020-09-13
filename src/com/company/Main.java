package com.company;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


    public class Main {
        public static  Scanner sc = new Scanner(System.in);
        static Integer cost =0;
        static double power=0;
    public static void main(String[] args) {

        ArrayList<Masini> configuratii = new ArrayList<>();

        Options option1 = new Options("Navigatie");
        Options option2 = new Options("Sistem recunoastere semne de circulatie");
        Options option3 = new Options("Ceasuri de bord digitale");
        Options option4 = new Options("Senzori de parcare");

        HashMap<String, Options> optionMap = new HashMap<>();
        optionMap.put("1", option1);
        optionMap.put("2", option2);
        optionMap.put("3", option3);
        optionMap.put("4", option4);

        String stop = "Da";
        while (stop.equalsIgnoreCase("Da")) {
            Masini masinaNoua = new Masini();
            System.out.println(">>>>>Salut, bine ai venit la ITSS-CAR CREATOR!<<<<<");
            System.out.println("Ce marca te intereseaza?: ");
            masinaNoua.setMarcaInsert(sc.nextLine());
            System.out.println("Ce model ai vrea de la aceasta marca?");
            masinaNoua.setModelInsert(sc.nextLine());
            List<Options> optiuniMasina = new ArrayList<Options>();
            System.out.println("Alege prima extraoptiune: ");
            optiuniMasina.add(optionMap.get(sc.nextLine()));
            System.out.println("Alege a doua extraoptiune: ");
            optiuniMasina.add(optionMap.get(sc.nextLine()));
            System.out.println("Alege a treia extraoptiune: ");
            optiuniMasina.add(optionMap.get(sc.nextLine()));
            System.out.println("Introdu caii putere: ");
            Integer caiPutere = 0;
            try {
                caiPutere = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Trebuie introdus un numar");
                caiPutere = Integer.parseInt(sc.nextLine());
            }
            masinaNoua.setCaiPutere(caiPutere);
            System.out.println("Ce culoare sa fie masina?");
            masinaNoua.setCuloare(sc.nextLine());
            System.out.println("Ce sistem de evacuare sa aibe masina?");
            masinaNoua.setEvacuare(sc.nextLine());
            System.out.println("Cum sa fie sistemul de admisie?");
            masinaNoua.setAdmisie(sc.nextLine());
            System.out.println("Vrei sa mai configurezi inca o masina? \n");
            masinaNoua.setOptiune(optiuniMasina);
            configuratii.add(masinaNoua);
            stop = sc.nextLine();

        }

                                configuratii.forEach(item -> System.out.println(item.toString()));
                                String daMasina = "da";
                                Integer plata = 0;
                                while (daMasina.equalsIgnoreCase("da")) {
                                    cost = 0;
                                    power = 0;
                                    System.out.println("Alege din lista ce masina vrei sa modifici: ");
                                    String brand = sc.nextLine();
                                    for (Masini item : configuratii) {
                                        if (item.getMarcaInsert().equalsIgnoreCase(brand)) {
                                            String daModifica = "da";
                                            while (daModifica.equalsIgnoreCase("Da")) {
                                                System.out.println("Ce doresti sa modifici?");
                                                String modificare = sc.nextLine();
                                                switch (modificare) {
                                                    case "cai putere":
                                                        modificaCaiPutere(item);
                                                        break;
                                                    case "culoare":
                                                        modificaCuloare(item);
                                                        break;
                                                    case "admisie":
                                                        modifcaAdmisie(item);
                                                        break;
                                                    case "evacuare":
                                modificaEvacuare(item);
                                break;
                            default:
                                System.out.println("Acest echipament nu se poate modifica");
                        }
                        System.out.println("Vrei sa mai modifici ceva?");
                        daModifica = sc.nextLine();
                    }
                    plata += cost;
                    System.out.println("Aveti de plata: "+plata + "RON!");
                }
                configuratii.forEach(iteme -> System.out.println(iteme.toString()));

            }
            System.out.println("Vrei sa mai modifici o masina?");
            daMasina = sc.nextLine();
        }


    }

        public static void modificaCaiPutere(Masini item) {
            System.out.println("Ai ales cai putere");
            int caiPutereModificati = Integer.parseInt(sc.nextLine());
            item.setCaiPutere(caiPutereModificati);
            cost += 1500;
            power += 1.5*caiPutereModificati;
            System.out.println("Te-a costat 1500 RON!");
            System.out.println("Pana acum costul total este: " + cost + "RON!");
            System.out.println("Ai crescut puterea cu " + power +" !");
        }

        public static void modificaCuloare(Masini item) {
            System.out.println("Ai ales culoare");
            String culoareModificata = sc.nextLine();
            item.setCuloare(culoareModificata);
            cost += 500;
            System.out.println("Te-a costat 500 RON!");
            System.out.println("Pana acum costul total este: " + cost + "RON!");
        }
        public static void modifcaAdmisie(Masini item) {
            System.out.println("Ai ales admisie");
            String admisieModificata = sc.nextLine();
            item.setAdmisie(admisieModificata);
            cost += 1000;
            System.out.println("Te-a costat 1000 RON!");
            System.out.println("Pana acum costul total este: " + cost + "RON!");
        }
        public static void modificaEvacuare(Masini item) {
            System.out.println("Ai ales evacuare");
            String evacuareModificata = sc.nextLine();
            item.setEvacuare(evacuareModificata);
            cost += 800;
            System.out.println("Te-a costat 800 RON!");
            System.out.println("Pana acum costul total este: " + cost + "RON!");

        }
    }



//        configuratii.forEach(item -> item.cpToKw());
//        try {                                           //ce masina ar vrea sa vada ++ tunning increasePower ++ pretelement tunning
//             System.out.println(configuratii.get(1));
//       }
//         catch (IndexOutOfBoundsException e) {
//           System.out.println("Nu exita");
//        }






//        Masini renault = new Masini("Megane", 25000, "rosu", 180);
//
//        Masini mazda = new Masini("CX-5", 47000, "gri", 200);
//
//        Masini honda = new Masini("Civic", 21000, "albastru", 300);
//
//
////    Renault megane = new Renault("Megane", 250, "verde aprins", 250 );  //nu e folosit nicaieri
//
//
//        mazda.cpToKw();    //transforma caii in kW
//
//        ArrayList<Masini> brandList = new ArrayList<Masini>();  //adaugare in lista
//        brandList.add(renault);
//        brandList.add(mazda);
//        brandList.add(honda);
//        System.out.println(brandList);
//        brandList.remove(honda);            //stergere din lista
//        System.out.println(brandList);
//
//        HashMap<String,Masini> brandMap = new HashMap<>();
//        for(Masini masini : brandList) {           //pargurgere lista de masini, afisez informatiile le adauga in HashMap
//            masini.tellInfo();
//            brandMap.put(masini.getNume(), masini);
//        }
//        try {
//        brandMap.get("AlfaRomeo").tellInfo();  //try&catch pt NPE
//        }
//        catch (Exception e) {
//            System.out.println("Se pare ca nu este..");
//        }
//        try {
//        brandList.remove(4);     // try&catch pt IOB
//        }
//        catch (IndexOutOfBoundsException e) {
//            System.out.println("Nu exita");
//        }
//
//    brandList.forEach(item -> item.cpToKw());    //lambda expresion
//
//    brandList.forEach(item -> item.carColour());  //alta lambda expresion..
//
//    mazda.powerCompare(renault.getCaiPutere());         // metoda care lurceaza cu atributele clasei
//
//        renault.addOptiuni(Optiuni.clima);              //clasa model care contine un arrayList
//        renault.addOptiuni(Optiuni.navigatie);
//        renault.addOptiuni(Optiuni.pilotAutormat);
//        for (Optiuni optiune : renault.optiuni) {
//            System.out.println(optiune);
//        }






