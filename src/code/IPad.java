public class IPad extends IDevice
{

    public IPad(final String purpose)
    {
        super(purpose);
    }

    @Override
    public String getPurpose()
    {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder();

        devicePurpose.append(super.getPurpose());
        devicePurpose.append("is ");
        devicePurpose.append("\"learning\"");

        return devicePurpose.toString();
    }

    @Override
    public void printDetails()
    {

    }
}
