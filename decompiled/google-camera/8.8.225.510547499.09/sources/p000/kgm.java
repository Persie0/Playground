package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgm extends kfv {

    /* JADX INFO: renamed from: a */
    public final kfv f35927a;

    /* JADX INFO: renamed from: b */
    private final Executor f35928b;

    public kgm(kfv kfvVar, Executor executor, byte[] bArr) {
        this.f35928b = executor;
        this.f35927a = kfvVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final void mo5455ba(kll kllVar) {
        this.f35928b.execute(new kds(this, kllVar, 5));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bj */
    public final void mo6427bj(kpl kplVar) {
        this.f35928b.execute(new kds(this, kplVar, 2));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bk */
    public final void mo9226bk(long j, int i) {
        this.f35928b.execute(new kgl(this, j, i, 0));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bl */
    public final void mo9227bl(final long j, final int i, final long j2) {
        this.f35928b.execute(new Runnable() { // from class: kgk
            @Override // java.lang.Runnable
            public final void run() {
                kgm kgmVar = this.f35919a;
                kgmVar.f35927a.mo9227bl(j, i, j2);
            }
        });
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bm */
    public final void mo9228bm(long j, Set set) {
        this.f35928b.execute(new dcr(this, j, set, 14));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bn */
    public final void mo8901bn(kfd kfdVar) {
        this.f35928b.execute(new kds(this, kfdVar, 3));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        this.f35928b.execute(new kds(this, kppVar, 4));
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bv */
    public final void mo9229bv(long j, int i) {
        this.f35928b.execute(new kgl(this, j, i, 1));
    }
}
