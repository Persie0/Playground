package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjt implements hjo {

    /* JADX INFO: renamed from: a */
    private final hju f28061a;

    /* JADX INFO: renamed from: b */
    private kba f28062b;

    public hjt(hju hjuVar) {
        this.f28061a = hjuVar;
    }

    @Override // p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f28062b = this.f28061a.mo10393a();
    }

    @Override // p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        kba kbaVar = this.f28062b;
        lku.m15662p(kbaVar);
        kbaVar.close();
        this.f28062b = null;
    }
}
