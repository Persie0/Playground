package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bop {

    /* JADX INFO: renamed from: a */
    public static final boo f4022a = new boo("Log");

    /* JADX INFO: renamed from: a */
    public static void m2812a(boo booVar, String str) {
        if (m2819h(booVar, 6)) {
            Log.e(booVar.f4021a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2813b(boo booVar, String str, Throwable th) {
        if (m2819h(booVar, 6)) {
            Log.e(booVar.f4021a, str, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2814c(boo booVar, String str) {
        if (m2819h(booVar, 5)) {
            Log.w(booVar.f4021a, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2815d(boo booVar, String str, Throwable th) {
        if (m2819h(booVar, 5)) {
            Log.w(booVar.f4021a, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2816e(boo booVar) {
        if (m2819h(booVar, 3)) {
            String str = booVar.f4021a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2817f(boo booVar) {
        if (m2819h(booVar, 4)) {
            String str = booVar.f4021a;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2818g(boo booVar) {
        if (m2819h(booVar, 2)) {
            String str = booVar.f4021a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m2819h(boo booVar, int i) {
        try {
            return Log.isLoggable("CAM2PORT_", i) || Log.isLoggable(booVar.f4021a, i);
        } catch (IllegalArgumentException e) {
            boo booVar2 = f4022a;
            StringBuilder sb = new StringBuilder();
            sb.append("Tag too long:");
            sb.append(booVar);
            m2812a(booVar2, "Tag too long:".concat(String.valueOf(booVar)));
            return false;
        }
    }
}
