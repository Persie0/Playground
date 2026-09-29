package p010a9;

import android.util.Log;

/* JADX INFO: renamed from: a9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a {
    /* JADX INFO: renamed from: a */
    public static void m208a(Object obj, String str, String str2) {
        String strM210c = m210c(str);
        if (Log.isLoggable(strM210c, 3)) {
            Log.d(strM210c, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m209b(String str, String str2, Exception exc) {
        String strM210c = m210c(str);
        if (Log.isLoggable(strM210c, 6)) {
            Log.e(strM210c, str2, exc);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m210c(String str) {
        return "TRuntime.".concat(str);
    }
}
