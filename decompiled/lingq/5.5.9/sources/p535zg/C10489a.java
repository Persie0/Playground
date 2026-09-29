package p535zg;

import ag.C0075b;
import ag.C0076c;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: zg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10489a {

    /* JADX INFO: renamed from: a */
    public static final Object f52419a = new Object();

    /* JADX INFO: renamed from: b */
    public static C0075b f52420b;

    /* JADX INFO: renamed from: a */
    public static void m19475a(C0076c c0076c, String str) {
        c0076c.m457a("Kochava Diagnostic - " + str);
    }

    /* JADX INFO: renamed from: b */
    public static C0075b m19476b() {
        if (f52420b == null) {
            synchronized (f52419a) {
                if (f52420b == null) {
                    f52420b = new C0075b();
                }
            }
        }
        return f52420b;
    }

    /* JADX INFO: renamed from: c */
    public static void m19477c(C0076c c0076c, String str) {
        c0076c.f203a.m456b(4, C0204c.m852k("Kochava Diagnostic - ", str), c0076c.f204b, c0076c.f205c);
    }
}
