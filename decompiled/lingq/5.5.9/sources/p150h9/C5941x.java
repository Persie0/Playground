package p150h9;

import java.util.HashSet;

/* JADX INFO: renamed from: h9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5941x {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f35374a = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public static String f35375b = "goog.exo.core";

    /* JADX INFO: renamed from: a */
    public static synchronized void m12374a(String str) {
        try {
            if (f35374a.add(str)) {
                f35375b += ", " + str;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
