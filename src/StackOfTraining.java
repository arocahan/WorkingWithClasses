import java.util.Vector;

public class StackOfTraining {
    //Trainingseinheit training;
    Vector MyStack;

    public StackOfTraining() {
        this.MyStack = new Vector();
    }

    public void PushTraining(Trainingseinheit training){
           MyStack.add(training);
        }

    public Trainingseinheit PopTraining(){
        return (Trainingseinheit) MyStack.lastElement();
    }
}


