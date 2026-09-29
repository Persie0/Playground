package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qhd {
    /* JADX INFO: renamed from: a */
    public static void m19975a(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String str2 = String.format(str, objArr);
            String strValueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + str2.length() + 2);
            sb.append(str2);
            sb.append(": ");
            sb.append(strValueOf);
            Log.e("Vision", sb.toString());
        }
    }
}
