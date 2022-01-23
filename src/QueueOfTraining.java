import java.util.Vector;

public class QueueOfTraining {
        //Trainingseinheit training;
        Vector MyQueue;

        public QueueOfTraining() {
            this.MyQueue = new Vector();
        }

        public void PushTraining(Trainingseinheit training){
            MyQueue.add(training);
        }

        public Trainingseinheit PollTraining(){
            Trainingseinheit temp = (Trainingseinheit) MyQueue.firstElement();
            MyQueue.removeElement(MyQueue.firstElement());
            return temp;

        } //poll() - Returns and removes the head of the queue.
    }

