/**
 * A class for Apple product.
 * @Author Mohammad, Ted
 * @version 1.0
 */

abstract class IDevice
{
    /**
     * Purpose of device. 
     */
    private final String purpose;

    /**
     * Constructor for IDevice.
     * @param purpose of IDevice*/
    public IDevice(final String purpose)
    {
        this.purpose = purpose;

    }

    /**
     * To print purpose of IDevice.
     * @return String purpose*/
    public String getPurpose()
    {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder(purpose);

        devicePurpose.append("The purpose of this iDevice is ");

        return purpose;
    }
    
    /**
     * To print all child class's instance variables.*/
    public abstract void printDetails();
}
