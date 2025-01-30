package ca.bcit.comp2522.lab3;
/**
 * Class of IPhone, includes instance variables for minutes
 * remaining on phone plan, and carrier name.
 *
 * @author Mohammad, Ted
 * @version 1.0
 * */

public class IPhone extends IDevice
{

    private static final double MIN_PHONE_MINUTE_REMAINING = 0.0;

    private double minuteRemaining;
    private String carrier;

    /**
     * Constructor of IPhone with instance variables for carrier
     * and number of minutes remaining on plan.
     *
     * @param minuteRemaining minute remaining of phone plan
     * @param carrier carrier of phone plan
     */
    public IPhone(final double minuteRemaining, 
                  final String carrier) 
    {
        super("talking");

        validateCarrier(carrier);
        validateMinuteRemaining(minuteRemaining);

        this.minuteRemaining = minuteRemaining;
        this.carrier = carrier;
        
    }

    /*
     * Validates the given carrier based on the following criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     */
    private static void validateCarrier(final String carrier)
    {
        if(carrier == null || carrier.isBlank())
        {
            throw new IllegalArgumentException("Bad carrier: " + carrier);
        }
    }

    /*
     * Validates the given carrier based on the following criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     */
    private static void validateMinuteRemaining(final double minuteRemaining)
    {
        if(minuteRemaining < MIN_PHONE_MINUTE_REMAINING)
        {
            throw new IllegalArgumentException("Remaining minutes of phone plan cannot be negative.");
        }
    }
    
    /**
     * Getter of minute remaining on phone plan.
     *
     * @return minute remaining
     */
    public double getMinuteRemaining()
    {
        return minuteRemaining;
    }

    /**
     * Getter of carrier of phone plan.
     *
     * @return carrier
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Setter for minutes remaining.
     * Ran through validator first.
     *
     * @param minuteRemaining the given minutes remaining for plan
     */
    public void setMinuteRemaining(final double minuteRemaining)
    {
        validateMinuteRemaining(minuteRemaining);
        this.minuteRemaining = minuteRemaining;
    }

    /**
     * Setter for carrier.
     * Ran through validator first.
     *
     * @param carrier the given carrier of the plan
     */
    public void setCarrier(final String carrier)
    {
        validateCarrier(carrier);
        this.carrier = carrier;
    }

    /**
     * To override toString method.
     *
     * @return String containing all instance data and purpose*/
    @Override
    public String toString()
    {
        StringBuilder IPhonestringBuilder;
        IPhonestringBuilder = new StringBuilder();
        
        IPhonestringBuilder.append(getPurpose());
        IPhonestringBuilder.append(", ");
        IPhonestringBuilder.append(getMinuteRemaining());
        IPhonestringBuilder.append(", ");
        IPhonestringBuilder.append(getCarrier());
        
        return IPhonestringBuilder.toString();
    }
    
    /**
     * Override equals method.
     * IPhones are equal if they
     * have the same remaining minutes
     *
     * @return boolean if the given IPhone is equal to this IPhone
     */
    @Override
    public boolean equals(final Object other)
    {
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
     *
     * @return hashCode of IPhone
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(getMinuteRemaining());
    }

    /**
     * Prints details of the IPhone.
     */
    @Override
    public void printDetails()
    {

        final StringBuilder str;
        str = new StringBuilder();

        str.append("This IPone has the carrier ");
        str.append(this.carrier);
        str.append(" and its current remaining minutes is ");
        str.append(this.minuteRemaining);

        System.out.println(str);
    }
}