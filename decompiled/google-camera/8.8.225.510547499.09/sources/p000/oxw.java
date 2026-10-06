package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oxw extends opp implements omg {

    /* JADX INFO: renamed from: e */
    public final ols f46797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxw(oly olyVar, ols olsVar) {
        super(olyVar);
        olyVar.getClass();
        olsVar.getClass();
        this.f46797e = olsVar;
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: cM */
    public final StackTraceElement mo18652cM() {
        return null;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: cN */
    protected final boolean mo18866cN() {
        return true;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: f */
    protected void mo18867f(Object obj) {
        oxg.m19129a(omn.m18701f(this.f46797e), ook.m18769G(obj, this.f46797e));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ols, omg] */
    @Override // p000.omg
    /* JADX INFO: renamed from: g */
    public final omg mo18653g() {
        ?? r0 = this.f46797e;
        if (r0 instanceof omg) {
            return r0;
        }
        return null;
    }

    @Override // p000.opp
    /* JADX INFO: renamed from: h */
    protected void mo18862h(Object obj) {
        ols olsVar = this.f46797e;
        olsVar.mo18640e(ook.m18769G(obj, olsVar));
    }
}
