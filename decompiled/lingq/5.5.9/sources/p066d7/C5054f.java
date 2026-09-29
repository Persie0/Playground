package p066d7;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: d7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5054f {
    /* JADX INFO: renamed from: a */
    public static Bundle m10733a(String str, boolean z10) {
        if (str == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(str);
            Iterator<String> it = urlQuerySanitizer.getParameterSet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    String strM10736d = m10736d(next, urlQuerySanitizer, false);
                    if (strM10736d != null) {
                        if (z10 || next.equals("wzrk_c2a")) {
                            bundle.putString(next, strM10736d);
                        } else {
                            bundle.putString(next, URLDecoder.decode(strM10736d, "UTF-8"));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m10734b(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String strM10735c = m10735c("source", urlQuerySanitizer);
            String strM10735c2 = m10735c("medium", urlQuerySanitizer);
            String strM10735c3 = m10735c("campaign", urlQuerySanitizer);
            jSONObject.put("us", strM10735c);
            jSONObject.put("um", strM10735c2);
            jSONObject.put("uc", strM10735c3);
            String strM10736d = m10736d("wzrk_".concat("medium"), urlQuerySanitizer, true);
            if (strM10736d != null && strM10736d.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", strM10736d);
            }
            C2181a.m6449a("Referrer data: " + jSONObject.toString(4));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static String m10735c(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String strM10736d = m10736d("utm_".concat(str), urlQuerySanitizer, true);
        if (strM10736d == null && (strM10736d = m10736d("wzrk_".concat(str), urlQuerySanitizer, true)) == null) {
            return null;
        }
        return strM10736d;
    }

    /* JADX INFO: renamed from: d */
    public static String m10736d(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z10) {
        if (str != null) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value == null) {
                    return null;
                }
                if (z10 && value.length() > 120) {
                    value = value.substring(0, 120);
                }
                return value;
            } catch (Throwable th2) {
                C2181a.m6457j("Couldn't parse the URI", th2);
            }
        }
        return null;
    }
}
