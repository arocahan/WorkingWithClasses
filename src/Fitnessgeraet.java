public class Fitnessgeraet {

    private String Geraetename;
    private String Geraetetyp; //(z.B. Cardio, Krafttraining)
    private Muskelgruppe Trainierte_Muskelgruppe; //(Referenz auf ein Objekt der Klasse Muskelgruppe).
    private int Maximal_empfohlene_Trainingsdauer; //in min
    private int Verbrauchte_Kalorien_pro_Stunde; // (Durchschnittswerte)
    private boolean Strom;

    public Fitnessgeraet (String geraetename, String geraetetyp, Muskelgruppe trainierte_Muskelgruppe,
                          int maximal_empfohlene_Trainingsdauer, int verbrauchte_Kalorien_pro_Stunde){
        this.Geraetename = geraetename;
        this.Geraetetyp = geraetetyp;
        this.Trainierte_Muskelgruppe = trainierte_Muskelgruppe;
        this.Maximal_empfohlene_Trainingsdauer = maximal_empfohlene_Trainingsdauer;
        this.Verbrauchte_Kalorien_pro_Stunde = verbrauchte_Kalorien_pro_Stunde;
    }

    //liefert den Kalorienverbrauch für eine Trainingseinheit für die angegebene Zeitspanne (in minuten)
    public int kalorienverbrauch(int minuten){
        return (Verbrauchte_Kalorien_pro_Stunde / 60) * minuten;
    }

    //liefert den Kalorienverbrauch für eine Trainingseinheit für die angegebene Zeitspanne (in stunden und minuten)
    public int kalorienverbrauch (int stunden, int minuten){
        return (Verbrauchte_Kalorien_pro_Stunde * stunden) + (Verbrauchte_Kalorien_pro_Stunde / 60 * minuten);
    }

    public boolean benoetigtStromversorgung (boolean strom){
        if (strom == true){
            return true;
        }else{
            return false;
        }
    } //liefert true, wenn dieses Gerät Strom braucht

    //                            to do
    public boolean unterstuetzt(String muskel){
        if (this.Trainierte_Muskelgruppe.enthält(muskel)){
            return true;
        }else {
            return false;
        }
    }  //liefert true, wenn dieses Gerät den angegebenen muskel unterstützt.

    public boolean unterstuetzt(Muskelgruppe muskelGruppe) {
        if (muskelGruppe == this.Trainierte_Muskelgruppe){
            return true;
        }else {
            return false;
        }
    }//liefert true, wenn dieses Gerät ein eine bestimmte muskelGruppe unterstützt

}
