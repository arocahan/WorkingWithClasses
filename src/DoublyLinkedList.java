import java.util.AbstractList;

public class DoublyLinkedList {

    private Node first = null;

    private class Node{
       // Node prev; //Referenz auf den vorherigen Knoten
        Trainingseinheit training; //Referenz auf eine Trainingseinheit
        Node next; //Referenz auf den nächsten Knoten

        //public Node(Node prev, Trainingseinheit training, Node next) {
        public Node(Trainingseinheit training, Node next) {
            //this.prev = prev;
            this.training = training;
            this.next = next;
        }
    }

    public void addFirst (Trainingseinheit myTraining){
        /*
        Node n = new Node(null, myTraining, null);
        n.next = first;
        first = n;
         */
        //oder
        //first = new Node(null, myTraining, first);
        first = new Node(myTraining, first);
    }

    public void addLast (Trainingseinheit myTraining){
        Node runPointer = first;
        if (runPointer == null){
        //if (isEmpty()){
            addFirst(myTraining);
        }else{
            //Node n = new Node(null, myTraining, null);
            Node n = new Node(myTraining, null);
            while (runPointer.next != null){
                runPointer = runPointer.next;
            }
            runPointer.next = n;
        }
    }

    public Trainingseinheit getFirst(){
        return first.training;
    }

    public Trainingseinheit getLast(){
        if (first == null){
           //dont know
            return null;
        }else {
            Node runPointer = first;
            while (runPointer.next != null){
                runPointer = runPointer.next;
            }
            return runPointer.training;
        }
    }



    public Trainingseinheit get(int index){
        int counter = 0;
        if (first == null){
            //dont know
            return null;
        }else {
            Node runPointer = first;
            while (runPointer.next != null && counter != index){
                runPointer = runPointer.next;
                counter ++;
            }
            return runPointer.training;
        }
    }

    /*

    Eigenschaft
    currentNode: Referenz auf den aktuellen Knoten. Über entsprechende Methodenaufrufe (siehe unten)
    ändert sich, welcher Knoten als aktuell gilt.

    Operationen
    Die Klasse DoublyLinkedList muss folgende Methoden besitzen:

    void add (Trainingseinheit e)  fügt die Trainingseinheit e der verketteten Liste
    hinzu. Die neue Trainingseinheit soll hinter dem aktuellen Knoten eingefügt werden. Nach dem
    Einfügen soll der neu erzeugte Knoten zum aktuellen Knoten werden.
    Wenn noch keine Elemente in der Liste gespeichert sind, dann wird ein neuer Knoten erzeugt und
    dies ist dann ebenfalls der aktuelle Knoten. Eine Liste könnte z.B. so entstehen:

    Trainingseinheit getCurrent()  liefert die in currentNode gespeicherte Trainingseinheit

    Trainingseinheit next ()  setzt den nächsten Knoten als currentNode und liefert die darin gespeicherte Trainingseinheit zurück

    Trainingseinheit prev ()  setzt den vorherigen Knoten als currentElement und liefert die darin gespeicherte Trainingseinheit zurück

    Trainingseinheit get (int offset)  liefert eine Trainingseinheit aus der verketteten
    Liste zurück. offset gibt an, wie viele Stellen hinter dem aktuellen Knoten sich das Element
    befindet. Beispiele: get(0) liefert die Trainingseinheit des aktuellen Knotens. get(1) liefert die
    Trainingseinheit des darauffolgenden Knotens. get(2) liefert die Trainingseinheit dahinter usw.
    Der Offset kann beliebig groß sein, da das „letzte“ Element ja wieder auf das „erste“ Element
    verweist.

    int size ()  liefert die Anzahl der gespeicherten Trainingseinheiten zurück
    Wenn die Methoden getCurrent(), next(), prev() oder get (int offset) für die
    leere Liste aufgerufen werden, dann werfen Sie eine NoSuchElementException.

     */
}
