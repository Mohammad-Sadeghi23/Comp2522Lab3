/**
 * Class of IPhone.
 *  * 
 * @author Mohammad, Ted
 * @version 1.0
 * */

public class IPhone extends IDevice {
    
    double minuteRemaining;
    String carrier;

    /**
     * Constructor of IPhone.
     * @param String purpose*/
    public IPhone(final String purpose, 
                  final double minuteRemaining, 
                  final String carrier) 
    {
        super(purpose);
        this.minuteRemaining = minuteRemaining;
        this.carrier = carrier;
        
    }

    @Override
    public String toString() {
        StringBuilder IPhonestringBuilder;
        IPhonestringBuilder = new StringBuilder();
        IPhonestringBuilder = IPhonestringBuilder.append("");
        return IPhonestringBuilder.toString();
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
