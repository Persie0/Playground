package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnv {

    /* JADX INFO: renamed from: a */
    private static final boo f3897a = new boo("CamAgntFact");

    /* JADX INFO: renamed from: b */
    private static final String f3898b;

    /* JADX INFO: renamed from: c */
    private static bnu f3899c;

    /* JADX INFO: renamed from: d */
    private static bnu f3900d;

    /* JADX INFO: renamed from: e */
    private static int f3901e;

    /* JADX INFO: renamed from: f */
    private static int f3902f;

    static {
        boo booVar = boq.f4023a;
        String str = "0";
        try {
            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "camera2.portability.force_api", "0");
        } catch (Exception e) {
            bop.m2813b(boq.f4023a, "Exception while getting system property: ", e);
        }
        f3898b = str;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized bnu m2780a(Context context) {
        if (m2782c() == 2) {
            if (f3899c == null) {
                f3899c = new bnh();
                f3901e = 1;
            } else {
                f3901e++;
            }
            return f3899c;
        }
        if (f3900d == null) {
            f3900d = new bmt(context);
            f3902f = 1;
        } else {
            f3902f++;
        }
        return f3900d;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m2781b() {
        bnu bnuVar;
        if (m2782c() == 2) {
            int i = f3901e - 1;
            f3901e = i;
            if (i == 0 && (bnuVar = f3899c) != null) {
                bnuVar.m2779g(true);
                bok bokVar = ((bnh) bnuVar).f3881f;
                synchronized (bokVar.f4015b) {
                    bokVar.f4015b = true;
                }
                synchronized (bokVar.f4014a) {
                    bokVar.f4014a.notifyAll();
                }
                ((bnh) bnuVar).f3880e.m2801b();
                f3899c = null;
            }
        } else {
            int i2 = f3902f - 1;
            f3902f = i2;
            if (i2 == 0 && f3900d != null) {
                f3900d = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m2782c() {
        String str = f3898b;
        if (str.equals("1")) {
            bop.m2816e(f3897a);
            return 2;
        }
        if (!str.equals("2")) {
            return 2;
        }
        bop.m2816e(f3897a);
        return 3;
    }
}
