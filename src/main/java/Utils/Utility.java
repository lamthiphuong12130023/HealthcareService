package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getDatetime() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        return sdfDate.format(now);
    }
}
