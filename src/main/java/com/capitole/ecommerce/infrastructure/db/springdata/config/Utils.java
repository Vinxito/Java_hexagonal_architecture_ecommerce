package com.capitole.ecommerce.infrastructure.db.springdata.config;

import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class Utils {

    public static Date stringToDate(String dateTime) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss", Locale.ITALIAN);
        Date parsedDate = null;
        try {
            parsedDate = df.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }

}
