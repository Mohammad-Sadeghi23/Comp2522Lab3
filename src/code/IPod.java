public class IPod extends IDevice {
    private static final double MAXVOLUMEDB = 0;

    private final int numOfSongsStored = 0;

    public IPod(final String purpose) {
        super(purpose);
    }

    @Override
    public String getPurpose() {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder();

        devicePurpose.append(super.getPurpose());
        devicePurpose.append("is ");
        devicePurpose.append("\"music\"");

        return devicePurpose.toString();
    }

    @Override
    public void printDetails() {

    }
}
