package kotlinx.coroutines.scheduling;

import ae.C0062b;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C7169s;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7186j {

    /* JADX INFO: renamed from: a */
    public static final long f40482a = C0062b.m367l2("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final int f40483b;

    /* JADX INFO: renamed from: c */
    public static final int f40484c;

    /* JADX INFO: renamed from: d */
    public static final long f40485d;

    /* JADX INFO: renamed from: e */
    public static final C7180d f40486e;

    /* JADX INFO: renamed from: f */
    public static final C7184h f40487f;

    /* JADX INFO: renamed from: g */
    public static final C7184h f40488g;

    static {
        int i10 = C7169s.f40443a;
        if (i10 < 2) {
            i10 = 2;
        }
        f40483b = C0062b.m371m2("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
        f40484c = C0062b.m371m2("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f40485d = TimeUnit.SECONDS.toNanos(C0062b.m367l2("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f40486e = C7180d.f40476a;
        f40487f = new C7184h(0);
        f40488g = new C7184h(1);
    }
}
