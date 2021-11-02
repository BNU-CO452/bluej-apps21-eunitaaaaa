
/**
 * This class models a BNU module which forms part
 * of a course.
 *
 * @author Eunita Da Silva
 * @version 1.0
 */
public class Module
{
    // instance variables - replace the example below with your own
    
    private  String Code;
    
    private  String title;
    
    private  int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String Code, String title)
    {
        credit = 15;
        this.Code = Code;
        this.title = title;
    }
    public String getCode()

    {
        return Code;
    }
    public String gettitle()
    {
        return title;
    }
    public void setCredit(int credit)
    {
        this.credit= credit;
    }

    /**
     * This method will print out the Module code and 
     * title
     */
    public void print()
    {
       printHeading();
        
        System.out.println(" Module Code: " + Code + ": " 
        +  title  + "credit" + credit);
        System.out.println(); 
        
    }    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}   
