package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sj4 {

    /* JADX INFO: renamed from: a */
    public final HashMap f60926a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final int f60927b = 64;

    /* JADX INFO: renamed from: c */
    public final int f60928c;

    public sj4(int i) {
        this.f60928c = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m21417a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m21418b(String str) {
        boolean zEquals;
        String strM21417a = m21417a(this.f60928c, "com.crashlytics.version-control-info");
        if (this.f60926a.size() >= this.f60927b && !this.f60926a.containsKey(strM21417a)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f60927b, null);
            return false;
        }
        String strM21417a2 = m21417a(this.f60928c, str);
        String str2 = (String) this.f60926a.get(strM21417a);
        if (str2 == null) {
            zEquals = strM21417a2 == null;
        } else {
            zEquals = str2.equals(strM21417a2);
        }
        if (zEquals) {
            return false;
        }
        this.f60926a.put(strM21417a, strM21417a2);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m21419c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM21417a = m21417a(this.f60928c, str);
                if (this.f60926a.size() < this.f60927b || this.f60926a.containsKey(strM21417a)) {
                    String str2 = (String) entry.getValue();
                    this.f60926a.put(strM21417a, str2 == null ? "" : m21417a(this.f60928c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f60927b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
