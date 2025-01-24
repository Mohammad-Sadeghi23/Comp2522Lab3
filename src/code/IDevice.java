/**
 *
 */
abstract class IDevice
{

    private final String purpose;

    public IDevice(final String purpose)
    {
        this.purpose = purpose;

    }

    public String getPurpose()
    {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder(purpose);

        devicePurpose.append("The purpose of this iDevice is ");

        return purpose;
    }

    public abstract void printDetails();
}
