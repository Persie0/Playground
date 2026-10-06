package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjr implements hjn, hjq {

    /* JADX INFO: renamed from: a */
    public final hjn f28059a;

    /* JADX INFO: renamed from: b */
    private final hjn[] f28060b;

    public hjr(hjn hjnVar, hjn... hjnVarArr) {
        this.f28059a = hjnVar;
        this.f28060b = hjnVarArr;
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        jbx.m12867l(this.f28059a);
        for (hjn hjnVar : this.f28060b) {
            jbx.m12867l(hjnVar);
        }
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f28059a.mo5711f();
        for (hjn hjnVar : this.f28060b) {
            hjnVar.mo5711f();
        }
    }

    @Override // p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        for (hjn hjnVar : this.f28060b) {
            hjnVar.mo5712g();
        }
        this.f28059a.mo5712g();
    }

    @Override // p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
