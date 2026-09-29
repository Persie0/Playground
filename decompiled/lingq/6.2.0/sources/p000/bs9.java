package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class bs9 {

    /* JADX INFO: renamed from: a */
    public static final String f8950a;

    /* JADX INFO: renamed from: b */
    public static final long f8951b;

    /* JADX INFO: renamed from: c */
    public static final int f8952c;

    /* JADX INFO: renamed from: d */
    public static final int f8953d;

    /* JADX INFO: renamed from: e */
    public static final long f8954e;

    /* JADX INFO: renamed from: f */
    public static final tr3 f8955f;

    static {
        String property;
        int i = zp9.f71940a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f8950a = property;
        f8951b = ci8.m4707T("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = zp9.f71940a;
        if (i2 < 2) {
            i2 = 2;
        }
        f8952c = ci8.m4708U(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        f8953d = ci8.m4708U(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        f8954e = TimeUnit.SECONDS.toNanos(ci8.m4707T("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f8955f = tr3.f62758d;
    }
}
