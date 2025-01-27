public class IPhone extends IDevice {

    public IPhone(final String purpose) {
        super(purpose);
    }

    @Override
    public String getPurpose() {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder();

        devicePurpose.append(super.getPurpose());
        devicePurpose.append("is ");
        devicePurpose.append("\"talking\"");

        return devicePurpose.toString();
    }

    @Override
    public void printDetails() {

    }
}
