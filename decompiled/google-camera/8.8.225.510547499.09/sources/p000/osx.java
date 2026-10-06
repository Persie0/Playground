package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osx extends oxw {

    /* JADX INFO: renamed from: b */
    private final ThreadLocal f46506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osx(oly olyVar, ols olsVar) {
        super(olyVar.get(osy.f46507a) == null ? olyVar.plus(osy.f46507a) : olyVar, olsVar);
        olyVar.getClass();
        olsVar.getClass();
        this.f46506b = new ThreadLocal();
        if (olsVar.mo18639d().get(olu.f46271a) instanceof oqo) {
            return;
        }
        Object objM19165b = oyb.m19165b(olyVar, null);
        oyb.m19166c(olyVar, objM19165b);
        m19022L(olyVar, objM19165b);
    }

    /* JADX INFO: renamed from: L */
    public final void m19022L(oly olyVar, Object obj) {
        this.f46506b.set(lkm.m15590q(olyVar, obj));
    }

    /* JADX INFO: renamed from: M */
    public final boolean m19023M() {
        if (this.f46506b.get() == null) {
            return false;
        }
        this.f46506b.set(null);
        return true;
    }

    @Override // p000.oxw, p000.opp
    /* JADX INFO: renamed from: h */
    protected final void mo18862h(Object obj) {
        okb okbVar = (okb) this.f46506b.get();
        if (okbVar != null) {
            oyb.m19166c((oly) okbVar.f46186a, okbVar.f46187b);
            this.f46506b.set(null);
        }
        Object objM18769G = ook.m18769G(obj, this.f46797e);
        ols olsVar = this.f46797e;
        oly olyVarMo18639d = olsVar.mo18639d();
        Object objM19165b = oyb.m19165b(olyVarMo18639d, null);
        osx osxVarM18913c = objM19165b != oyb.f46804a ? oqn.m18913c(olsVar, olyVarMo18639d, objM19165b) : null;
        try {
            this.f46797e.mo18640e(objM18769G);
            if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
            }
        } finally {
            if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                oyb.m19166c(olyVarMo18639d, objM19165b);
            }
        }
    }
}
