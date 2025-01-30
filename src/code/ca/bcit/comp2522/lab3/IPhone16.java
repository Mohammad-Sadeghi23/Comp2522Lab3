package ca.bcit.comp2522.lab3;

/**
 * Class of IPhone 16 (child class of IPhone), includes instance variables for
 * gigabytes of memory and if it has high resolution camera.
 *
 * @author Mohammad Sadeghi
 * @author Ted Ip
 * @version 1.0
 * */

public class IPhone16 extends IPhone
{
    private static final int MIN_GIG_OF_MEM = 0;

    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    
    public IPhone16(double minutesRemaining,
                    String carrier,
                    boolean highResolutionCamera,
                    int gigabytesOfMemory)
    {
        super(minutesRemaining, carrier);

        validateGigabytesOfMemory(gigabytesOfMemory);

        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /*
     * Validates the given amount of gigabytes of memory based on the following criteria:
     * 1. Cannot be less than MIN_GIG_OF_MEM.
     */
    public static void validateGigabytesOfMemory(int gigabytesOfMemory)
    {
        if(gigabytesOfMemory < MIN_GIG_OF_MEM)
        {
            throw new IllegalArgumentException("Amount of gigabytes of memory cannot be negative");
        }
    }

    /** Get if IPhone16 has high resolution camera.
     *
     * @return boolean true when IPhone16 has high resolution camera
     */
    public boolean hasHighResolutionCamera()
    {
        return highResolutionCamera;
    }
    
    /**
     * Getter for IPhone16 memory in gigabytes.
     *
     * @return memory in gigabytes as an int
     */
    public int getGigabytesOfMemory()
    {
        return gigabytesOfMemory;
    }


    /**
     * Setter for high resolution camera.
     *
     * @param highResolutionCamera given status of IPhone 16's high resolution camera
     */
    public void setHighResolutionCamera(final boolean highResolutionCamera)
    {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * Setter for gigabytes of memory.
     * Ran through validator first.
     *
     * @param gigabytesOfMemory given amount of gigabytes of memory for the IPhone 16
     */
    public void setGigabytesOfMemory(final int gigabytesOfMemory)
    {
        validateGigabytesOfMemory(gigabytesOfMemory);
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /**
     * To Override toString() showing 
     * all instance variables and 
     * parent's toString().
     */
    @Override
    public String toString()
    {
        return super.toString() + ", High Resolution Camera: " + 
               (hasHighResolutionCamera() ? "Yes" : "No") + 
                ", Memory: " + getGigabytesOfMemory() + " GB";
    }
    
    /**
     * To override equals() methods.
     * Two IPhone 16s are equal when they
     * have the same amount of minutes remaining
     * on their phone plan, but only if they also have
     * the same value for “high-resolution camera”.
     *
     * @return if the given IPhone 16 is equal to this IPhone 16
     */
    @Override
    public boolean equals(Object other)
    {
        if (this == other) 
        {
            return true;
        }
        if (other == null) 
        {
            return false;
        }
        if (getClass() != other.getClass()) 
        {
            return false;
        }
        IPhone16 iPhone16 = (IPhone16) other;
        return Double.compare(iPhone16.getMinuteRemaining(), getMinuteRemaining()) == 0 && 
               highResolutionCamera == iPhone16.highResolutionCamera;
    }
    
    
    /**
     * To override hashCode() methods.
     *
     * @return int hashCode*/
    @Override
    public int hashCode()
    {
        return 31 * super.hashCode() + 
            Double.hashCode(getMinuteRemaining()) + 
            Boolean.hashCode(highResolutionCamera);
    }
}