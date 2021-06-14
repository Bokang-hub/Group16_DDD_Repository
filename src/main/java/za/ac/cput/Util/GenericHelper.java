package za.ac.cput.Util;
/* GenericHelper.java
Makes random number for ID
Author: Bokang Molaoa (218131097)
Date: 09 June 2021
*/
import java.util.UUID;

public class GenericHelper
{
    public static int generateId()
    {
        return UUID.randomUUID().toString().hashCode();
    }

}
