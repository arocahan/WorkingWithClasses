import DataStructures.StackWithArray;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

public class APP {

    public static void main(String[]args) throws FileNotFoundException {

        String [] Brust = new String[]{"grosser Brutmuskel", "kleiner Brustmuskel"};
        Muskelgruppe gruppeBrust = new Muskelgruppe(Brust, 2);

        Muskelgruppe gruppeArme = new Muskelgruppe(new String[]{"Biset", "Tricept"}, 2);
        Muskelgruppe gruppeFullBody = new Muskelgruppe(new String[]{"von Kopf", "bis Füse"}, 10);

        System.out.println(gruppeBrust.enthält("großer Brustmuskel"));

        Fitnessgeraet Crosstrainer = new Fitnessgeraet("Crosstrainer", "Cardio", gruppeBrust, 30, 500);
        Fitnessgeraet Lastzug = new Fitnessgeraet("Lastzug", "Krafttraining", gruppeArme, 30, 500);
        Fitnessgeraet Rudermaschine = new Fitnessgeraet("Rudermaschine", "Cardio", gruppeFullBody, 60, 1300);

        //Trainingseinheiten
        Date date = new Date();
        Trainingseinheit Montag = new Trainingseinheit(10, date, Crosstrainer,10 );

        Trainingseinheit DienstagMitZiel= new TrainingseinheitMitZiel(10, date, Lastzug, 9, 100);


        System.out.println(Montag.zielErreicht(101));
        System.out.println(Montag.erforderlicheTrainingszeit(110));
        System.out.println(Montag.getDauer_des_Trainings());
        Montag.trainieren(11);
        System.out.println(Montag.getDauer_des_Trainings());
        Montag.trainieren();
        System.out.println(Montag.getDauer_des_Trainings());
        System.out.println(Crosstrainer.unterstuetzt(gruppeArme));



        TrainingseinheitMitZiel MontagMitZiel= new TrainingseinheitMitZiel(10, date, Lastzug, 5, 90);
        System.out.println("Würde das Max von kalorie überschritten: " + MontagMitZiel.maxKalorienverbrauch(100));
        //MontagMitZiel.setKalorienZiel(100);
        System.out.println(MontagMitZiel.getKalorienZiel());
        System.out.println(MontagMitZiel.getDauer_des_Trainings());
        System.out.println(MontagMitZiel.getKalorienverbrauch_pro_min());
        System.out.println(MontagMitZiel.getZielerreichungsgrad() + " %");
        System.out.println(((double)(MontagMitZiel.getDauer_des_Trainings()) * (double) MontagMitZiel.getKalorienverbrauch_pro_min()) / (double) MontagMitZiel.getKalorienZiel() * 100);


        MontagMitZiel.trainieren(110);


        //Erzeugen Sie ein Objekt der Klasse TrainingsProgramm. Fügen Sie diesem Trainingsprogramm
        // die bislang erstellten Trainingseinheiten hinzu.


        ArrayList<Trainingseinheit> GroupOfTrainingseinheit = new ArrayList<Trainingseinheit>();
        GroupOfTrainingseinheit.add(Montag);

        TrainingsProgramm MyTrainingsProgramm = new TrainingsProgramm(Montag, new Trainingseinheit[]{MontagMitZiel, DienstagMitZiel}, GroupOfTrainingseinheit);

        System.out.println("Me va a dar un numero " + MyTrainingsProgramm.myTrainingsProgrammsInArray[0].getKalorienverbrauch_pro_min());

        System.out.println(MyTrainingsProgramm.getKalorienZiel());

        MyTrainingsProgramm.addTrainingseinheit(MontagMitZiel);

        System.out.println(MyTrainingsProgramm.getKalorienZiel());

        DoublyLinkedList FirstLinkedList = new DoublyLinkedList();

        Montag.setKalorienZiel(500);
        FirstLinkedList.addFirst(Montag);

        StackOfTraining FirstStackList = new StackOfTraining();
        FirstStackList.PushTraining(DienstagMitZiel);
        FirstStackList.PushTraining(MontagMitZiel);
        FirstStackList.PushTraining(Montag);






        Montag.setKalorienZiel(400);
        FirstLinkedList.addFirst(Montag);

        MontagMitZiel.setKalorienZiel(30);
        FirstLinkedList.addFirst(MontagMitZiel);

        DienstagMitZiel.setKalorienZiel(600);
        FirstLinkedList.addFirst(DienstagMitZiel);

        System.out.println("***************************************");

        System.out.println(FirstLinkedList.getLast().getKalorienZiel());
        System.out.println(FirstLinkedList.getFirst().getKalorienZiel());

        System.out.println(FirstLinkedList.get(2).getKalorienZiel());



        System.out.println("***************************************");

        System.out.println(FirstStackList.PopTraining().getKalorienZiel());


        //Montag.setKalorienZiel(400);
        StackWithArray stackWithArray = new StackWithArray(5);
        stackWithArray.push(DienstagMitZiel);
        stackWithArray.push(MontagMitZiel);
        stackWithArray.push(Montag);
        System.out.println(stackWithArray.pop());




 /*

    Rufen Sie für dieses Objekt in
    einer while-Schleife solange die Methode trainieren(5) auf, bis ein gewünschtes
    Trainingsziel von 800 Kalorien erreicht ist. Es wird also immer in 5-Minuten-Intervallen trainiert bis
    mindestens 800 Kalorien erreicht sind. Geben Sie danach die tatsächlich verbrauchten Kalorien aus.

 */

     /*
        Aufgabe 3


Aufgabe
In dieser Aufgabe werden Sie eine doppelt verkettete Liste zum Speichern von
Trainingseinheiten definieren.

Zudem sollen Sie in der Klasse TrainingsProgramm die
Trainingseinheiten nicht mehr in einer ArrayList speichern, sondern in Ihrer eigenen Liste implementierung.


Anders als in der Vorlesung soll eine doppelt verkettete Liste implementiert werden. Jeder Knoten
hat eine Referenz auf den vorherigen und nächsten Knoten.

Die Liste soll zirkulär sein, d.h. der „letzte“ Knoten verweist wieder auf den „ersten“ Knoten und
umgekehrt. Es ergibt sich ein Ring:
Bei einem Ring gibt es kein „erstes“ und „letztes“ Element. Stattdessen soll intern in der Liste eine
Referenz auf den aktuellen Knoten verweisen:

Hinweis 1: Jeder Knoten speichert eine Referenz auf den nächsten Knoten (next) und auf den
vorherigen Knoten (prev). Zudem speichert jeder Knoten genau eine Trainingseinheit.
Anders als in
der Vorlesung soll keine generische Liste erstellt werden. Also: keinen Typparameter verwenden,
sondern immer Trainingseinheiten speichern.

Hinweis 2: Bei Änderungen an der Liste müssen beide Referenzen (prev und next) verändert
werden – und zwar auch vom Vorgänger-Knoten und Nachfolger-Knoten. Skizzieren Sie sich, wie die
Objekte zusammenhängen. Ohne Skizze ist das Verstehen sehr schwierig!

Hinweis 3: Testen Sie alle Operationen ausgiebig, am Besten mit JUnit.


      */

        LinkedList<String> al = new LinkedList<String>();

        al.add ("Ravi");
        al.add("Vijay");

        /*
        Linked List
        Stack
        Queue
        Binary Tree
        Binary Search Tree


        Heap
        Hashing
        Graph
         */


        }
    }

