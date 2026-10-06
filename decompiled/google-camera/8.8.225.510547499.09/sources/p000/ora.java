package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ora extends oxw {

    /* JADX INFO: renamed from: b */
    public final opl f46443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ora(oly olyVar, ols olsVar) {
        super(olyVar, olsVar);
        olyVar.getClass();
        olsVar.getClass();
        this.f46443b = ook.m18794h(0);
    }

    @Override // p000.oxw, p000.osg
    /* JADX INFO: renamed from: f */
    protected final void mo18867f(Object obj) {
        mo18862h(obj);
    }

    /* JADX WARN: Switch 'out' block B:3:0x0002 for B:4:0x0004 already processed. Defaulting to fallback option. */
    @Override // p000.oxw, p000.opp
    /* JADX INFO: renamed from: h */
    protected final void mo18862h(Object obj) {
        opl oplVar = this.f46443b;
        do {
            switch (oplVar.f46391b) {
                case 0:
                    break;
                case 1:
                    oxg.m19129a(omn.m18701f(this.f46797e), ook.m18769G(obj, this.f46797e));
                    return;
                default:
                    throw new IllegalStateException("Already resumed");
            }
        } while (!this.f46443b.m18847c(0, 2));
    }
}
