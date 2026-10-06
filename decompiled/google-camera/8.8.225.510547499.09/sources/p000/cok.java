package p000;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cok implements dte, kba {

    /* JADX INFO: renamed from: a */
    public static final float[] f6439a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f6440b = {0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f6441c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f6442d = {0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    public static final nbh f6443e = nbh.m17259h("com/google/android/apps/camera/brella/features/LowResImageExtractor");

    /* JADX INFO: renamed from: h */
    public lby f6446h;

    /* JADX INFO: renamed from: i */
    public final Executor f6447i;

    /* JADX INFO: renamed from: j */
    public lea f6448j;

    /* JADX INFO: renamed from: k */
    public final dhv f6449k;

    /* JADX INFO: renamed from: n */
    private final bko f6452n;

    /* JADX INFO: renamed from: f */
    public final Object f6444f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f6445g = new Object();

    /* JADX INFO: renamed from: l */
    public boolean f6450l = true;

    /* JADX INFO: renamed from: m */
    public final Deque f6451m = new ConcurrentLinkedDeque();

    public cok(bko bkoVar, Executor executor, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f6452n = bkoVar;
        this.f6447i = executor;
        this.f6449k = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4008a() {
        synchronized (this.f6445g) {
            while (!this.f6451m.isEmpty()) {
                ((coj) this.f6451m.removeFirst()).f6437a.close();
            }
        }
    }

    @Override // p000.dte
    /* JADX INFO: renamed from: b */
    public final void mo4009b(key keyVar, kgg kggVar) {
        key keyVarMo7040a = keyVar.mo7040a();
        if (keyVarMo7040a != null) {
            keyVarMo7040a.mo7050k(new coi(this, keyVarMo7040a, kggVar));
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4010c() {
        synchronized (this.f6444f) {
            if (this.f6450l) {
                lby lbyVarM2626t = this.f6452n.m2626t("low-res");
                this.f6446h = lbyVarM2626t;
                this.f6448j = lea.m15230a(lbyVarM2626t);
                this.f6450l = false;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f6447i.execute(new cmd(this, 6));
    }
}
