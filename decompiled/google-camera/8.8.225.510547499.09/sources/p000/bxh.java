package p000;

import android.util.Log;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxh {

    /* JADX INFO: renamed from: c */
    private static volatile bxh f4694c;

    /* JADX INFO: renamed from: d */
    private int f4695d;

    /* JADX INFO: renamed from: e */
    private boolean f4696e = true;

    /* JADX INFO: renamed from: b */
    private static final File f4693b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: a */
    public static volatile int f4692a = -1;

    public bxh() {
        new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static bxh m3154a() {
        if (f4694c == null) {
            synchronized (bxh.class) {
                if (f4694c == null) {
                    f4694c = new bxh();
                }
            }
        }
        return f4694c;
    }

    /* JADX INFO: renamed from: c */
    private final synchronized boolean m3155c() {
        boolean z = true;
        int i = this.f4695d + 1;
        this.f4695d = i;
        if (i >= 50) {
            this.f4695d = 0;
            int length = f4693b.list().length;
            long j = f4692a != -1 ? f4692a : 20000;
            if (length >= j) {
                z = false;
            }
            this.f4696e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w(zuAgeeF.wzMpvtCL, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
            }
        }
        return this.f4696e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3156b(int i, int i2, boolean z, boolean z2) {
        return z && !z2 && i >= 0 && i2 >= 0 && m3155c();
    }
}
