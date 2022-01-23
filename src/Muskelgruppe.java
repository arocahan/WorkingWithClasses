public class Muskelgruppe {

      private String [] Muskelgruppe;
      private int Muskelgruppe_Grosse;
    private String Muskel_Name;

    public Muskelgruppe (String [] muskelgruppe, int muskelgruppe_Grosse){
        this.Muskelgruppe = muskelgruppe;
        this.Muskelgruppe_Grosse = muskelgruppe_Grosse;
    }



    public boolean enthält(String muskel){
        for (String x : Muskelgruppe){
            if (muskel == x){
                return true;
            }
        }
        return false;
    }  // liefert true, wenn diese Muskelgruppe den angegebenen muskel enthält.

}
