/*
Add necessary codes to print the following:
-----------------OUTPUT-------------------
Name of thread 't':Thread-0
New name of thread 't':NPTEL
Thread is running.
-------------------------------------------------
*/

class W06_P5 extends Thread{  
  public void run(){  
    System.out.println("Thread is running.");  
  }  
 public static void main(String args[]){  
    W06_P5 t=new W06_P5();  
    System.out.println("Name of thread 't':"+ t.getName());
// start the thread  
  t.start();  
// set the name
  t.setName("NPTEL");
System.out.println("New name of thread 't':"+ t.getName());  
 }  
}
