package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Constructs an IPod device (child class of IDevice), with instance variables to indicate if it
 * has a case and its operating system version.
 *
 * @author Mohammad Sadeghi
 * @author Ted Ip
 * @version 1.0
 */
public class IPod extends IDevice
{

    private static final int MIN_VOLUME_DB = 0;
    private static final int MIN_SONGS_STORED = 0;

    private double maxVolumeDB;
    private int numOfSongsStored;

    /**
     * Constructs an IPod device with instance variables for
     * an maximum volume in decibels and number of songs currently stored on the IPod.
     *
     * @param numOfSongsStored number of songs stored on the IPod
     * @param maxVolumeDB the maximum volume in decibels
     */
    public IPod(final int numOfSongsStored,
                final double maxVolumeDB)
    {

        super("music");

        this.maxVolumeDB = maxVolumeDB;
        this.numOfSongsStored = numOfSongsStored;
    }

    /*
     * Validates the given maximum volume based on the following criteria:
     * 1. Cannot be equal to or less than MIN_VOLUME_DB.
     */
    private void validateMaxVolumeDB(final double maxVolumeDB)
    {
        if (maxVolumeDB <= MIN_VOLUME_DB)
        {
            throw new IllegalArgumentException("Max volume must be greater than " + MIN_VOLUME_DB);
        }
    }

    /*
     * Validates the given number of songs stored based on the following criteria:
     * 1. Cannot be less than MIN_SONGS_STORED.
     */
    private void validateNumOfSongsStored(final int numOfSongsStored)
    {
        if (numOfSongsStored < MIN_SONGS_STORED) {
            throw new IllegalArgumentException("Number of songs stored cannot be negative");
        }
    }

    /**
     * Getter for max volume.
     * @return maxVolumeDB
     */
    public double getMaxVolumeDB()
    {
        return maxVolumeDB;
    }

    /**
     * Getter for number of songs stored.
     * @return numOfSongsStored
     */
    public int getNumOfSongsStored()
    {
        return numOfSongsStored;
    }

    /**
     * Setter for maximum volume.
     * Ran through validator first.
     * @param maxVolumeDB the given maximum volume in decibels
     */
    public void setMaxVolumeDB(final double maxVolumeDB)
    {
        validateMaxVolumeDB(maxVolumeDB);
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * Setter for number of songs stored.
     * Ran through validator first.
     * @param numOfSongsStored the given number of songs stored
     */
    public void setNumOfSongsStored(final int numOfSongsStored)
    {
        validateNumOfSongsStored(numOfSongsStored);
        this.numOfSongsStored = numOfSongsStored;
    }

    /**
     * Returns all instance variables of the Ipod.
     *
     * @return all instance variables in one string
     */
    @Override
    public String toString()
    {
        final StringBuilder str;
        str = new StringBuilder();

        str.append(super.toString());
        str.append("\nThe max volume (DB) is ");
        str.append(this.maxVolumeDB);
        str.append(" and it stores ");
        str.append(this.numOfSongsStored);
        str.append(" songs");

        return str.toString();
    }

    /**
     * Prints details of the Ipod.
     */
    @Override
    public void printDetails()
    {

        final StringBuilder str;
        str = new StringBuilder();

        str.append("The max volume (DB) is for this device is ");
        str.append(this.maxVolumeDB);
        str.append(" and it currently stores ");
        str.append(this.numOfSongsStored);
        str.append(" songs");

        System.out.println(str);
    }

    /**
     * Returns whether a given object is equal to this Ipod.
     * The given object is equal with this Ipod if their number of stored songs are equal.
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
            return  false;
        }

        IPod otherIpod = (IPod) other;

        return (otherIpod.getNumOfSongsStored() == this.numOfSongsStored);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numOfSongsStored);
    }
}
