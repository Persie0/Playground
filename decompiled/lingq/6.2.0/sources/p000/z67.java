package p000;

import com.google.firebase.perf.util.Constants$CounterNames;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class z67 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f70988a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    /* JADX INFO: renamed from: b */
    public static void m25470b(String str, String str2) {
        if (str == null || str.length() == 0) {
            C3386nv.m17626m("Attribute key must not be null or empty");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            C3386nv.m17626m("Attribute value must not be null or empty");
            return;
        }
        if (str.length() > 40) {
            Locale locale = Locale.US;
            C3386nv.m17626m("Attribute key length must not exceed 40 characters");
        } else if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            C3386nv.m17626m("Attribute value length must not exceed 100 characters");
        } else {
            if (f70988a.matcher(str).matches()) {
                return;
            }
            C3386nv.m17626m("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m25471c(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants$CounterNames constants$CounterNames : Constants$CounterNames.values()) {
            if (constants$CounterNames.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3300a();
}
