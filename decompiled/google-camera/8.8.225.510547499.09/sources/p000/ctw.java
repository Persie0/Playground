package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctw extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f9504a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ key f9505b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ctx f9506c;

    public ctw(ctx ctxVar, nqf nqfVar, key keyVar) {
        this.f9506c = ctxVar;
        this.f9504a = nqfVar;
        this.f9505b = keyVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bb */
    public final void mo4006bb() {
        this.f9504a.mo8566a(new IllegalStateException("Snapshot request is aborted"));
        this.f9505b.close();
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bi */
    public final void mo5510bi() {
        synchronized (this.f9506c.f9521c) {
            try {
                kgg kggVar = this.f9506c.f9531m;
                if (kggVar == null) {
                    this.f9504a.mo8566a(new IllegalStateException("Snapshot is not available"));
                } else {
                    kpw kpwVarMo7043d = this.f9505b.mo7043d(kggVar);
                    if (kpwVarMo7043d == null) {
                        this.f9504a.mo8566a(new IllegalStateException("Snapshot is null"));
                    } else if (!this.f9504a.mo14894e(kpwVarMo7043d)) {
                        kpwVarMo7043d.close();
                    }
                }
                this.f9505b.close();
            } catch (Throwable th) {
                this.f9505b.close();
                throw th;
            }
        }
    }
}
