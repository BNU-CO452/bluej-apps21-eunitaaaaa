
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
        this.Code = Code;
        this.title = title;
        credit = 0;
        
    }
    public String getCode()

    {
        return this. Code;
    }
    public String gettitle()
    {
        return this.title;
    }
    public int getCredit()
    {
     return this. credit;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }

    /**
     * This method will print out the Module code and 
     * title
     */
    public void print()
    {
        
        System.out.println(" Module Code: " + Code + ": " +  title);
        System.out.println("Credits: "  + credit); 
        System.out.println(); 
    }
    
    }  
