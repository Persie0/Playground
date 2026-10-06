package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nos extends nog {

    /* JADX INFO: renamed from: c */
    private nor f43992c;

    public nos(mwj mwjVar, boolean z, Executor executor, nol nolVar) {
        super(mwjVar, z, false);
        this.f43992c = new nop(this, nolVar, executor);
        m17563r();
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: h */
    public final void mo17559h(int i, Object obj) {
    }

    @Override // p000.nnz
    /* JADX INFO: renamed from: n */
    protected final void mo17545n() {
        nor norVar = this.f43992c;
        if (norVar != null) {
            norVar.m17614h();
        }
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: q */
    public final void mo17562q() {
        nor norVar = this.f43992c;
        if (norVar != null) {
            norVar.m17574f();
        }
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: s */
    public final void mo17564s(int i) {
        super.mo17564s(i);
        if (i == 1) {
            this.f43992c = null;
        }
    }

    public nos(mwj mwjVar, boolean z, Executor executor, Callable callable) {
        super(mwjVar, z, false);
        this.f43992c = new noq(this, callable, executor);
        m17563r();
    }
}
