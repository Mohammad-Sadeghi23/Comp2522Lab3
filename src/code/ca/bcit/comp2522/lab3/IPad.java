package ca.bcit.comp2522.lab3;

/**
 * Constructs an IPad device (child class of IDevice), with instance variables to indicate if it
 * has a case and its operating system version.
 *
 * @author Mohammad, Ted
 * @version 1.0
 */
public class IPad extends IDevice {

    final boolean hasACase;
    final String operatingSystemVersion;


    public IPad(final boolean hasACase,
                final String operatorSystemVersion) {


        super("learning");

        this.hasACase = hasACase;
        this.operatingSystemVersion = operatorSystemVersion;
    }

    @Override
    public String getPurpose() {
        final StringBuilder devicePurpose;
        devicePurpose = new StringBuilder();

        devicePurpose.append(super.getPurpose());
        devicePurpose.append("is ");
        devicePurpose.append("\"learning\"");

        return devicePurpose.toString();
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }
}
