package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Constructs an IPad device (child class of IDevice), with instance variables to indicate if it
 * has a case and its operating system version.
 *
 * @author Mohammad Sadeghi
 * @author Ted Ip
 * @version 1.0
 */
public class IPad extends IDevice
{

    private boolean cased;
    private String operatingSystemVersion;


    /**
     * Constructs an IPad device with instance variables for
     * an operating system version and if the IPad has a case.
     *
     * @param cased if the Ipad has a case
     * @param operatorSystemVersion the Ipads current OS version
     */
    public IPad(final boolean cased,
                final String operatorSystemVersion)
    {


        super("learning");

        validateOperatingSystemVersion(operatorSystemVersion);

        this.cased = cased;
        this.operatingSystemVersion = operatorSystemVersion;
    }

    /*
     * Validates the given operating system version based on the following criteria:
     * 1. Cannot be null
     * 2. Cannot be blank
     */
    private static void validateOperatingSystemVersion(final String operatingSystemVersion)
    {
        if (operatingSystemVersion == null || operatingSystemVersion.isEmpty())
        {
            throw new IllegalArgumentException("Bad operating system version " + operatingSystemVersion);
        }
    }

    /**
     * Return whether the Ipad has a case or not.
     *
     * @return if Ipad has a case
     */
    public boolean isCased()
    {
        return cased;
    }

    /**
     * Return the iPadOS version.
     *
     * @return iPadOS version
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    /**
     * Setter for IPad case status
     *
     * @param cased the given status for the IPad having a case
     */
    public void setCased(final boolean cased)
    {
        this.cased = cased;
    }

    /**
     * Setter for operating system version.
     * Ran through validator first.
     *
     * @param operatingSystemVersion the given operating system version
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        validateOperatingSystemVersion(operatingSystemVersion);
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Returns all instance variables of the Ipad.
     *
     * @return all instance variables in one string
     */
    @Override
    public String toString()
    {

        final StringBuilder IPadStringBuilder;
        IPadStringBuilder = new StringBuilder();

        IPadStringBuilder.append(this.getPurpose());
        IPadStringBuilder.append(", ");

        if(this.cased)
        {
            IPadStringBuilder.append("has a Case, ");
        }

        IPadStringBuilder.append("and the operating system version is ");
        IPadStringBuilder.append(this.operatingSystemVersion);

        return IPadStringBuilder.toString();
    }

    /**
     * Prints details of the Ipad.
     */
    @Override
    public void printDetails()
    {
        final StringBuilder str;
        str = new StringBuilder();

        str.append("The operating system version of this IPad is: ");
        str.append(this.operatingSystemVersion);
        str.append("Does this IPad have a case: ");
        str.append(this.cased);

        System.out.println(str);
    }

    /**
     * Returns whether a given object is equal to this Ipad.
     * The given object is equal with this Ipad if their operating system versions are equal.
     *
     * @param other the given object
     * @return if given object is equal to this Ipad
     */
    @Override
    public boolean equals(final Object other)
    {

        if(other == null)
        {
            return false;
        }

        if(!(other.getClass().equals(this.getClass())))
        {
            return false;
        }

        IPad otherIpad = (IPad) other;

        return (this.operatingSystemVersion.equalsIgnoreCase(otherIpad.getOperatingSystemVersion()));
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(operatingSystemVersion);
    }
}