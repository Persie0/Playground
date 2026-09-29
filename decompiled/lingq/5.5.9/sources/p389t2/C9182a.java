package p389t2;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: t2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9182a {
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static boolean m17515a() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 >= 32) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                    z10 = true;
                }
                if (z10) {
                    return true;
                }
            }
            z10 = false;
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
