package ca.bcit.comp2522.lab3;
/**
 * Class of IPhone.
 *  * 
 * @author Mohammad, Ted
 * @version 1.0
 * */

public class IPhone extends IDevice {
    
    private double minuteRemaining;
    private String carrier;

    /**
     * Constructor of IPhone.
     * @param double minute remaining of phone plan
     * @param String carrier of phone plan*/
    public IPhone(final double minuteRemaining, 
                  final String carrier) 
    {
        super("talking");
        this.minuteRemaining = minuteRemaining;
        this.carrier = carrier;
        
    }
    
    /**
     * Getter of minute remaining on phone plan.
     * @return minute remaining
     */
    public double getMinuteRemaining() {
        return minuteRemaining;
    }

    /**
     * Getter of carrier of phone plan.
     * @return carrier
     */
    public String getCarrier() {
        return carrier;
    }
    
    /**
     * To override toString method.
     * @return String containing all instance data and purpose*/
    @Override
    public String toString() {
        StringBuilder IPhonestringBuilder;
        IPhonestringBuilder = new StringBuilder();
        
        IPhonestringBuilder = IPhonestringBuilder.append(getPurpose());
        IPhonestringBuilder = IPhonestringBuilder.append(", ");
        IPhonestringBuilder = IPhonestringBuilder.append(getMinuteRemaining());
        IPhonestringBuilder = IPhonestringBuilder.append(", ");
        IPhonestringBuilder = IPhonestringBuilder.append(getCarrier());
        
        return IPhonestringBuilder.toString();
    }
    
    /**
     * to override equals method.
     * @return boolean true if object are IPhone 
     * having same remaining minutes*/
    @Override
    public boolean equals(final Object other) {
        if (this==other) 
        {
            return true;
        }
        
        if(other == null)
        {
            return false;
        }
        if(!(other.getClass().equals(this.getClass())))
        {   
            return false;
        }
        IPhone iPhone = (IPhone) other;
        return iPhone.getMinuteRemaining() == 
                this.getMinuteRemaining();
    }
    
    /**
     * To override hashCode method.
     * @return hashCode of IPhone*/
    @Override
    public int hashCode() {
        return Double.hashCode(getMinuteRemaining());
    }
    
    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }
}
