package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ndk {

    /* JADX INFO: renamed from: a */
    private static String f42046a = "ndt";

    /* JADX INFO: renamed from: b */
    private static String f42047b = "com.google.common.flogger.backend.google.GooglePlatform";

    /* JADX INFO: renamed from: c */
    private static String f42048c = "com.google.common.flogger.backend.system.DefaultPlatform";

    /* JADX INFO: renamed from: d */
    private static final String[] f42049d = {"ndt", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    /* JADX INFO: renamed from: a */
    public static int m17360a() {
        return ((Cnew) Cnew.f42158a.get()).f42159b;
    }

    /* JADX INFO: renamed from: b */
    public static long m17361b() {
        return ndi.f42045a.m17370c();
    }

    /* JADX INFO: renamed from: d */
    public static ncn m17362d(String str) {
        return ndi.f42045a.mo17371e(str);
    }

    /* JADX INFO: renamed from: f */
    public static ncr m17363f() {
        return m17365i().mo17385a();
    }

    /* JADX INFO: renamed from: g */
    public static ndj m17364g() {
        return ndi.f42045a.mo17372h();
    }

    /* JADX INFO: renamed from: i */
    public static nea m17365i() {
        return ndi.f42045a.mo17373j();
    }

    /* JADX INFO: renamed from: k */
    public static nei m17366k() {
        return m17365i().mo17386b();
    }

    /* JADX INFO: renamed from: l */
    public static String m17367l() {
        return ndi.f42045a.mo17374m();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17368n(String str, Level level, boolean z) {
        m17365i().mo17387c(str, level, z);
        return false;
    }

    /* JADX INFO: renamed from: c */
    protected long m17370c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: e */
    protected abstract ncn mo17371e(String str);

    /* JADX INFO: renamed from: h */
    protected abstract ndj mo17372h();

    /* JADX INFO: renamed from: j */
    protected nea mo17373j() {
        return nec.f42087a;
    }

    /* JADX INFO: renamed from: m */
    protected abstract String mo17374m();
}
