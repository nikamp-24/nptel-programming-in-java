/*
In the following program, a thread class ThreadRun is created using the Runnable interface which prints "Thread using Runnable interface". 
Complete the main class to create a thread object of the class ThreadRun and run the thread.
*/

class ThreadRun implements Runnable {
        public void run(){ 
            System.out.print("Thread using Runnable interface."); 
        } 
   }
public class W06_P2{ 
    public static void main(String[] args){ 
        ThreadRun tr = new ThreadRun();
        Thread t = new Thread(tr);
        t.start();  
    } 
}
