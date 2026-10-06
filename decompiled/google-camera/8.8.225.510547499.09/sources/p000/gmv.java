package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gmv extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicInteger f25634a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f25635b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nqf f25636c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ggs f25637d;

    public gmv(AtomicInteger atomicInteger, int i, nqf nqfVar, ggs ggsVar) {
        this.f25634a = atomicInteger;
        this.f25635b = i;
        this.f25636c = nqfVar;
        this.f25637d = ggsVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        if (this.f25634a.incrementAndGet() == this.f25635b) {
            this.f25636c.mo14894e(ckb.f5964g);
            this.f25637d.m9231o(this);
        }
    }
}
