package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class np6 {

    /* JADX INFO: renamed from: b */
    public final long[] f53098b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f53099c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f53100d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f53102f;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f53097a = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f53101e = new ReentrantLock();

    public np6(int i) {
        this.f53098b = new long[i];
        this.f53099c = new boolean[i];
    }
}
