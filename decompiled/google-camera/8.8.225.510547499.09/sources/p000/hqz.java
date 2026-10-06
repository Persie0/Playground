package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hqz {

    /* JADX INFO: renamed from: a */
    public static final nbh f29226a = nbh.m17259h("com/google/android/apps/camera/timelapse/stabilization/EisProcessExecutor");

    /* JADX INFO: renamed from: f */
    public final jpd f29231f;

    /* JADX INFO: renamed from: g */
    public AmbientModeSupport.AmbientController f29232g;

    /* JADX INFO: renamed from: h */
    public drj f29233h;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f29227b = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public final Queue f29229d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final Queue f29230e = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorService f29228c = jzn.m13824l("Cheetah-eis-executor");

    public hqz(jpd jpdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29231f = jpdVar;
    }
}
