package ca.bcit.comp2522.lab3;

public class IPhone16 extends IPhone{
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    
    public IPhone16(double minutesRemaining, String carrier, boolean highResolutionCamera, int gigabytesOfMemory) {
        super(minutesRemaining, carrier); 
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }
    
    /** Verify if IPhone16 has high resolution camera.
     * @return boolean true when IPhone16 has high resolution camera*/
    public boolean hasHighResolutionCamera() {
        return highResolutionCamera;
    }
    
    /**
     * Getter for IPhone16 memory in gigabytes.
     * @Return int memory in gigabytes*/
    public int getGigabytesOfMemory() {
        return gigabytesOfMemory;
    }
    
    
    /**
     * To Override toString() showing 
     * all instance variables and 
     * parent's toString().
     */
    @Override
    public String toString() {
        return super.toString() + ", High Resolution Camera: " + 
               (hasHighResolutionCamera() ? "Yes" : "No") + 
                ", Memory: " + getGigabytesOfMemory() + " GB";
    }
    
    /**
     * To override equals() methods.
     * @return boolean true when IPhone16 objects 
        have the same amount of minutes remaining 
        on their phone plan are considered equal, 
        but only if they also have the same value 
        for “high-resolution camera”.*/
    @Override
    public boolean equals(Object other) {
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
     * @return int hashCode*/
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + 
            Double.hashCode(getMinuteRemaining()) + 
            Boolean.hashCode(highResolutionCamera);
    }
    
    
}
