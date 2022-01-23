import java.util.Date;

public class TrainingseinheitMitZiel extends Trainingseinheit implements Trainingsziel {

    private int KalorienZiel = 0;

    //nice to do
    //int tag, int monat, int jahr, int hh, int mm
    public TrainingseinheitMitZiel(int dauer_des_Trainings, Date datum_und_Startzeit_des_Trainings,
                                   Fitnessgeraet welches_Fitnessgerät_verwendet_wurde, int kalorienverbrauch_pro_min, int kalorienZiel) {
        super(dauer_des_Trainings, datum_und_Startzeit_des_Trainings, welches_Fitnessgerät_verwendet_wurde, kalorienverbrauch_pro_min);
        this.KalorienZiel = kalorienZiel;
    }


    public boolean maxKalorienverbrauch(int MaxKalorienverbrauch) {
        if ((getDauer_des_Trainings() * getKalorienverbrauch_pro_min()) > MaxKalorienverbrauch) {
            return true;
        } else {
            return false;
        }
    }//Für eine Trainingseinheit kann somit festgelegt werden, wie hoch der Kalorienverbrauch sein soll.


    @Override
    public void setKalorienZiel(int kalorienZiel) {
        this.KalorienZiel = kalorienZiel;
    }

    @Override
    public int getKalorienZiel() {
        return KalorienZiel;
    }

    @Override
    public double getZielerreichungsgrad() {
        if (this.KalorienZiel > 0) {
            return (((double) this.getDauer_des_Trainings() * (double) this.getKalorienverbrauch_pro_min()) / (double) this.KalorienZiel) * 100;
        } else {
            return 0.0;
        }
    }

    public int trainieren(int minuten) {
        if ((super.trainieren(minuten) * getKalorienverbrauch_pro_min()) > getKalorienZiel()){
            System.out.println("Hurra");
        }
        return minuten;
    }
}/*Methode überschreiben:
        void trainieren (int minuten)  erhöht genauso wie in der Oberklasse die
        Trainingsdauer um die angegebene Anzahl minuten. Zusätzlich gibt diese neu implementierte
        Methode auf der Konsole einmalig „Hurra“ aus, wenn durch das weitere Training das gesetzte
        kalorienZiel erreicht wurde.
        Wichtig: Verwenden Sie in der überschriebenen Methode die vorhandene Funktionalität der
        Oberklasse, indem Sie mit super auf die Methode der Oberklasse (Super – Class) zugreifen.


 */
