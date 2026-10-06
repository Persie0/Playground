package p000;

import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggs extends kfv {

    /* JADX INFO: renamed from: a */
    private final Set f24702a = new ArraySet();

    @Override // p000.kfv
    /* JADX INFO: renamed from: aZ */
    public final synchronized void mo5454aZ(kgg kggVar, long j) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo5454aZ(kggVar, j);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: ba */
    public final synchronized void mo5455ba(kll kllVar) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo5455ba(kllVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bj */
    public final synchronized void mo6427bj(kpl kplVar) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo6427bj(kplVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bk */
    public final synchronized void mo9226bk(long j, int i) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo9226bk(j, i);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bl */
    public final synchronized void mo9227bl(long j, int i, long j2) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo9227bl(j, i, j2);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bm */
    public final synchronized void mo9228bm(long j, Set set) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo9228bm(j, set);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bn */
    public final synchronized void mo8901bn(kfd kfdVar) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo8901bn(kfdVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo3408bu(kppVar);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bv */
    public final synchronized void mo9229bv(long j, int i) {
        naz nazVarListIterator = mxk.m17134F(this.f24702a).listIterator();
        while (nazVarListIterator.hasNext()) {
            ((kfv) nazVarListIterator.next()).mo9229bv(j, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m9230n(kfv kfvVar) {
        this.f24702a.add(kfvVar);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m9231o(kfv kfvVar) {
        this.f24702a.remove(kfvVar);
    }
}
