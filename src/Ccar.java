public class Ccar implements Bbrakes,Eengine {
  @Override
  public void brakes1(){//need to use public or else it shows visibility error.
  System.out.println("brakes applied");
  }
  
  public void start(){
    System.out.println("engine started");
  }
 
  public void stop(){
    System.out.println("engine stopped");
  }
}
