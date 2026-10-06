package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctt implements kfb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicInteger f9497a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f9498b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kfc f9499c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ctx f9500d;

    public ctt(ctx ctxVar, AtomicInteger atomicInteger, nqf nqfVar, kfc kfcVar) {
        this.f9500d = ctxVar;
        this.f9497a = atomicInteger;
        this.f9498b = nqfVar;
        this.f9499c = kfcVar;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        if (this.f9497a.incrementAndGet() == this.f9500d.f9526h) {
            this.f9498b.mo14894e(ctx.f9508b);
            this.f9499c.mo9412l(this);
        }
    }
}
