package oop2.assignment.localisation;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TestLocalisation {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale locEnglishUK = new Locale("en", "GB");
        System.out.println(locEnglishUK.getDisplayLanguage());
        System.out.println(locEnglishUK.getDisplayCountry());

        //Using builder patterns
        Locale locArabicEgypt = new Locale.Builder().setLanguage("ar").setRegion("EG").build();
        System.out.println(locArabicEgypt);

        double n = 77234.11;
        System.out.println(NumberFormat.getNumberInstance().format(n));
        System.out.println(NumberFormat.getNumberInstance(Locale.ITALY).format(n));

        double number = 10023.55;
        System.out.println(NumberFormat.getCurrencyInstance().format(number));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.ITALY).format(number));

        String italianNumber = "77.000,11";

        try {
            System.out.println(NumberFormat.getNumberInstance(Locale.FRANCE).parse(italianNumber));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //customFormat();
        TimeStuff();

    }

    public static void customFormat(){
        double n = 77_000_345_654_456.17123;

        System.out.println(new DecimalFormat("$#,###,###.###").format(n));    // leave out zeros
        System.out.println(new DecimalFormat("$0,000,000.0").format(n));    // include zeros
    }

    public static void TimeStuff(){
        DateTimeFormatter dateMediumStyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    }
}
