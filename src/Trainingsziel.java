public interface Trainingsziel {
    /*
 Diese Schnittstelle stellt Methoden bereit, um für eine Trainingseinheit oder ein Trainingsprogramm das Kalorienziel festzulegen/abzufragen.
     */

        void setKalorienZiel (int kalorienZiel); // setzt das Trainingsziel in Kalorien
        int getKalorienZiel (); // liefert das gesetzte Trainingsziel in Kalorien

    double getZielerreichungsgrad (); // liefert den Zielerreichungsgrad, also welcher Anteil der angestrebten Kalorien schon erreicht ist.



}
