package p000;

import android.location.Location;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eyr {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f21002a = 0;

    /* JADX INFO: renamed from: b */
    private static final nbh f21003b = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/util/MetadataUtils");

    /* JADX INFO: renamed from: c */
    private static final NumberFormat f21004c = NumberFormat.getInstance(Locale.US);

    /* JADX INFO: renamed from: a */
    public static Double m8052a(Map.Entry entry) {
        try {
            return Double.valueOf(f21004c.parse((String) entry.getValue()).doubleValue());
        } catch (ParseException e) {
            ((nbe) ((nbe) ((nbe) f21003b.m17252c()).mo17283h(e)).mo17276G(2056)).mo17301z("Parse double failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m8053b(Map.Entry entry) {
        try {
            return Integer.valueOf((String) entry.getValue());
        } catch (NumberFormatException e) {
            ((nbe) ((nbe) ((nbe) f21003b.m17252c()).mo17283h(e)).mo17276G(2057)).mo17301z("Parse integer failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m8054c(double d) {
        String[] strArrSplit = Location.convert(Math.abs(d), 2).split(":");
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            float fFloatValue = f21004c.parse(strArrSplit[2]).floatValue() * 1000.0f;
            return strArrSplit[0] + "/1," + strArrSplit[1] + "/1," + ((int) fFloatValue) + "/1000";
        } catch (ParseException e) {
            ((nbe) ((nbe) f21003b.m17252c()).mo17276G(2058)).mo17293r("Could not parse float: %s", strArrSplit[2]);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m8055d(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static Date m8056e(Map.Entry entry) {
        try {
            return new Date(Long.parseLong((String) entry.getValue()));
        } catch (NumberFormatException e) {
            entry.getKey();
            entry.getValue();
            return null;
        }
    }
}
