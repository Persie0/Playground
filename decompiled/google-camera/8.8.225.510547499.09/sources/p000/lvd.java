package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvd {

    /* JADX INFO: renamed from: a */
    public static final lvd f39383a = new lvd();

    /* JADX INFO: renamed from: b */
    public final String f39384b;

    public lvd() {
        lku.m15670x(true, "Android Logging mandates tags be less than 23 characters.");
        this.f39384b = "VisionKit";
    }

    /* JADX INFO: renamed from: a */
    public final String m16087a(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    /* JADX INFO: renamed from: b */
    public final String m16088b(Object obj, String str, Object... objArr) {
        String str2;
        String strM16087a = m16087a(str, objArr);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        return "[" + str2 + "] " + strM16087a;
    }

    /* JADX INFO: renamed from: c */
    public final void m16089c(Object obj, String str, Object... objArr) {
        if (m16091e(6)) {
            Log.e(this.f39384b, m16088b(obj, str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16090d(Object obj, String str, Object... objArr) {
        if (m16091e(5)) {
            Log.w(this.f39384b, m16088b(obj, str, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16091e(int i) {
        return Log.isLoggable(this.f39384b, i);
    }
}
