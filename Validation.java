import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Validation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Validation
{
    private Pattern pattern;
	private Matcher matcher;
	private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Constructor for objects of class Validation
     */
    public Validation()
    {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
	/**
	 * Validate hex with regular expression
	 * 
	 * @param hex
	 *            hex for validation
	 * @return true valid hex, false invalid hex
	 */
	public boolean validate(final String hex) {

		matcher = pattern.matcher(hex);
		return matcher.matches();

	}
	    /**
     * Checking if the value is numeric, so both X and Y are numeric values
     * @param xyPos is the x or y position given by the user
     * @return checking if the value given by user only contains numbers, else returns false
     */
    public boolean checkNumeric(String xyPos)
    {
        // if nothing is added written in it returns false
        if (xyPos.length() == 0)
            return false;
        int position = 0;
        // checks if every position is a number and not a character
        while (position < xyPos.length())
        {
            char thisNumeric = xyPos.charAt(position);
            if (thisNumeric < '0' || thisNumeric > '9')
                return false;
            position++;
        }
        return true;
    }
}
