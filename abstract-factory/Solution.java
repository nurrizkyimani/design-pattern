
public class Solution {

  ///button sutff; 
  private interface Button {
      void paint();
  }

  public class MACOSButton implements Button {

    @Override
    public void paint(){
        System.out.println("You have created MacOSButton.");
    }

  }


  public class WindowsButton implements Button {

    @Override
    public void paint(){
      System.out.println("You have created WindowsButton.");
    }
  }

  //end of button stuff; 


  public interface Checkbox {
    void paint();
  }

  public class MacCheckBox implements Checkbox {

    @Override
    public void paint(){
      System.out.println("You have created Mac Checkbox")
    }
  }






}

