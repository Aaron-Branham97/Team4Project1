package cs310teamproj;

/**
 *
 * @author Aaron Branham and Cole Landers
 */
public class Badge {
    private String firstName;
    private String middleIntital;
    private String lastName;
    private String badgeID;
    
    public Badge() {
        firstName = null;
        middleIntital = null;
        lastName = null;
        badgeID = null;
    }
	
    public Badge(String badgeID, String firstName, String middleIntital, String lastName){
        this.badgeID = badgeID;
        this.firstName = firstName;
        this.middleIntital = middleIntital;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleIntital() {
        return middleIntital;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBadgeID() {
        return badgeID;
    }

    @Override
    public String toString() {
        return "#" + badgeID + " (" + lastName + ", " + firstName + " " + middleIntital + ")";
    }
}
