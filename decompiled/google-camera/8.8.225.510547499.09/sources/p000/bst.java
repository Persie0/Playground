package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bst implements bsz {

    /* JADX INFO: renamed from: a */
    public final boolean f4377a;

    /* JADX INFO: renamed from: b */
    private final bsz f4378b;

    /* JADX INFO: renamed from: c */
    private final bqn f4379c;

    /* JADX INFO: renamed from: d */
    private int f4380d;

    /* JADX INFO: renamed from: e */
    private boolean f4381e;

    /* JADX INFO: renamed from: f */
    private final ljf f4382f;

    public bst(bsz bszVar, boolean z, bqn bqnVar, ljf ljfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        bzq.m3278r(bszVar);
        this.f4378b = bszVar;
        this.f4377a = z;
        this.f4379c = bqnVar;
        bzq.m3278r(ljfVar);
        this.f4382f = ljfVar;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        return this.f4378b.mo3014a();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        return this.f4378b.mo3015b();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: c */
    public final Object mo3016c() {
        return this.f4378b.mo3016c();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3017d() {
        if (this.f4381e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4380d++;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final synchronized void mo3018e() {
        if (this.f4380d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4381e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4381e = true;
        this.f4378b.mo3018e();
    }

    /* JADX INFO: renamed from: f */
    public final void m3019f() {
        int i;
        synchronized (this) {
            int i2 = this.f4380d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.f4380d = i;
        }
        if (i == 0) {
            ljf ljfVar = this.f4382f;
            bqn bqnVar = this.f4379c;
            ((brw) ljfVar.f38373e).m2964d(bqnVar);
            if (this.f4377a) {
                ((bub) ljfVar.f38371c).m3074d(bqnVar, this);
            } else {
                ((kbh) ljfVar.f38372d).m13935c(this, false);
            }
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4377a + ", listener=" + this.f4382f.toString() + ", key=" + String.valueOf(this.f4379c) + ", acquired=" + this.f4380d + KMNlNMe.vgCoFQKyMpO + this.f4381e + ", resource=" + this.f4378b.toString() + "}";
    }
}
