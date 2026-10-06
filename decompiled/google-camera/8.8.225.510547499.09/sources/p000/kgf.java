package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgf extends kfv {

    /* JADX INFO: renamed from: a */
    private boolean f35882a = false;

    /* JADX INFO: renamed from: b */
    private final kfv f35883b;

    public kgf(kfv kfvVar, byte[] bArr) {
        this.f35883b = kfvVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: aZ */
    public final void mo5454aZ(kgg kggVar, long j) {
        this.f35883b.mo5454aZ(kggVar, j);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final void mo5455ba(kll kllVar) {
        synchronized (this) {
            if (this.f35882a) {
                return;
            }
            this.f35882a = true;
            this.f35883b.mo5455ba(kllVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bj */
    public final void mo6427bj(kpl kplVar) {
        this.f35883b.mo6427bj(kplVar);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bk */
    public final void mo9226bk(long j, int i) {
        this.f35883b.mo9226bk(j, i);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bl */
    public final void mo9227bl(long j, int i, long j2) {
        this.f35883b.mo9227bl(j, i, j2);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bm */
    public final void mo9228bm(long j, Set set) {
        this.f35883b.mo9228bm(j, set);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bn */
    public final void mo8901bn(kfd kfdVar) {
        this.f35883b.mo8901bn(kfdVar);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        synchronized (this) {
            if (this.f35882a) {
                return;
            }
            this.f35882a = true;
            this.f35883b.mo3408bu(kppVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bv */
    public final void mo9229bv(long j, int i) {
        this.f35883b.mo9229bv(j, i);
    }
}
