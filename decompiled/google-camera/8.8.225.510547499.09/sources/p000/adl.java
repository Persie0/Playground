package p000;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adl {

    /* JADX INFO: renamed from: a */
    private static final Locale[] f163a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: a */
    public static Locale m294a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: b */
    static boolean m295b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m296c(locale) || m296c(locale2)) {
            return false;
        }
        String strM85e = abd.m85e(locale);
        if (!strM85e.isEmpty()) {
            return strM85e.equals(abd.m85e(locale2));
        }
        String country = locale.getCountry();
        return country.isEmpty() || country.equals(locale2.getCountry());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m296c(Locale locale) {
        Locale[] localeArr = f163a;
        int length = localeArr.length;
        for (int i = 0; i < 2; i++) {
            if (localeArr[i].equals(locale)) {
                return true;
            }
        }
        return false;
    }
}
