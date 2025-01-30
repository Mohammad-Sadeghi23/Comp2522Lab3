package ca.bcit.comp2522.lab3;
/**
 * An abstract class for Apple products.
 * Includes an instance variable to store the purpose of the device,
 * and an abstract method for to print details of the device.
 * 
 * @Author Mohammad Sadeghi
 * @author Ted Ip
 * @version 1.0
 */

abstract class IDevice
{

    private final String purpose;

    /**
     * Constructor for IDevice.
     * 
     * @param purpose of IDevice
     */
    public IDevice(final String purpose)
    {

        validateIDevicePurpose(purpose);
        this.purpose = purpose;
    }

    /*
     * Validates the given purpose based on the following criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     */
    private static void validateIDevicePurpose(final String purpose)
    {

        if(purpose == null ||
           purpose.isBlank())

        {
            throw new IllegalArgumentException("Purpose can't be null or empty");
        }
    }

    /**
     * To return the purpose of the IDevice.
     * 
     * @return String purpose, purpose of the IDevice.
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints details.
     */
    public abstract void printDetails();

    /**
     * Returns the purpose of the device.
     *
     * @return purpose of the device is as a string
     */
    @Override
    public String toString()
    {

        final StringBuilder IDeviceDetails;
        IDeviceDetails = new StringBuilder();

        IDeviceDetails.append("The purpose of this device is ");
        IDeviceDetails.append(purpose);

        return IDeviceDetails.toString();
    }
}