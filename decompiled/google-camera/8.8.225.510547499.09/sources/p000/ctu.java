package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctu implements kev {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f9501a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ctx f9502b;

    public ctu(ctx ctxVar, nqf nqfVar) {
        this.f9502b = ctxVar;
        this.f9501a = nqfVar;
    }

    @Override // p000.kev
    /* JADX INFO: renamed from: a */
    public final void mo5508a(kcl kclVar, long j) {
        synchronized (this.f9502b.f9521c) {
            nqf nqfVar = this.f9501a;
            csn csnVar = this.f9502b.f9527i;
            csnVar.getClass();
            nqfVar.mo8566a(new dof(csnVar.f9336a, kclVar, j));
        }
    }

    @Override // p000.kev
    /* JADX INFO: renamed from: b */
    public final void mo5509b() {
        kmq kmqVarMo14558k;
        ctx ctxVar = this.f9502b;
        ddq ddqVar = ctxVar.f9542x;
        synchronized (ctxVar.f9521c) {
            kme kmeVar = ctxVar.f9512D.f36117a;
            csn csnVar = ctxVar.f9527i;
            csnVar.getClass();
            kmqVarMo14558k = kmeVar.mo13854a(csnVar.f9336a).mo14558k();
        }
        ddqVar.mo5947g(kmqVarMo14558k);
    }
}
