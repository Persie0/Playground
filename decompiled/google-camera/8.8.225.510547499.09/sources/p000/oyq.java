package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyq {

    /* JADX INFO: renamed from: a */
    public static final long f46849a = lku.m15638ag("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final int f46850b = lku.m15640ai("kotlinx.coroutines.scheduler.core.pool.size", ook.m18789c(oya.f46803a, 2), 1, 0, 8);

    /* JADX INFO: renamed from: c */
    public static final int f46851c = lku.m15640ai("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* JADX INFO: renamed from: d */
    public static final long f46852d = TimeUnit.SECONDS.toNanos(lku.m15638ag("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* JADX INFO: renamed from: e */
    public static final oyo f46853e = new oyo(0);

    /* JADX INFO: renamed from: f */
    public static final oyo f46854f = new oyo(1);
}
