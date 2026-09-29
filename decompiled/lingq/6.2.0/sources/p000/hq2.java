package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hq2 implements vp2 {

    /* JADX INFO: renamed from: a */
    public on3 f42769a = mn3.f51554a;

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f42769a;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f42769a = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        hq2 hq2Var = new hq2();
        hq2Var.f42769a = this.f42769a;
        return hq2Var;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f42769a + ')';
    }
}
