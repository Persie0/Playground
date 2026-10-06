package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class orb extends oyn {

    /* JADX INFO: renamed from: f */
    public int f46444f;

    public orb(int i) {
        super(0L, oyq.f46853e);
        this.f46444f = i;
    }

    /* JADX INFO: renamed from: B */
    public final void m18946B(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            lkm.m15595v(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        oqv.m18928i(mo18892r().mo18639d(), new oqt("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: o */
    public Object mo18889o(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: p */
    public abstract Object mo18890p();

    /* JADX INFO: renamed from: q */
    public Throwable mo18891q(Object obj) {
        oqg oqgVar = obj instanceof oqg ? (oqg) obj : null;
        if (oqgVar != null) {
            return oqgVar.f46421b;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract ols mo18892r();

    /* JADX WARN: Type inference failed for: r1v5, types: [ols, omg] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM15591r;
        Object objM15591r2;
        boolean z = oqu.f46432a;
        try {
            oxf oxfVar = (oxf) mo18892r();
            ?? r1 = oxfVar.f46766b;
            Object obj = oxfVar.f46768d;
            oly olyVarMo18639d = r1.mo18639d();
            Object objM19165b = oyb.m19165b(olyVarMo18639d, obj);
            osx osxVarM18913c = objM19165b != oyb.f46804a ? oqn.m18913c(r1, olyVarMo18639d, objM19165b) : null;
            try {
                oly olyVarMo18639d2 = r1.mo18639d();
                Object objMo18890p = mo18890p();
                Throwable thMo18891q = mo18891q(objMo18890p);
                ory oryVar = (thMo18891q == null && oqv.m18934o(this.f46444f)) ? (ory) olyVarMo18639d2.get(ory.f46473c) : null;
                if (oryVar != null && !oryVar.mo18974cZ()) {
                    Throwable thMo18975o = oryVar.mo18975o();
                    mo18895u(objMo18890p, thMo18975o);
                    if (oqu.f46433b) {
                        thMo18975o = oxy.m19156a(thMo18975o, r1);
                    }
                    r1.mo18640e(lkm.m15591r(thMo18975o));
                } else if (thMo18891q != null) {
                    r1.mo18640e(lkm.m15591r(thMo18891q));
                } else {
                    r1.mo18640e(mo18889o(objMo18890p));
                }
                if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                    oyb.m19166c(olyVarMo18639d, objM19165b);
                }
                try {
                    objM15591r2 = oki.f46196a;
                } catch (Throwable th) {
                    objM15591r2 = lkm.m15591r(th);
                }
                m18946B(null, okd.m18589a(objM15591r2));
            } catch (Throwable th2) {
                if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                    oyb.m19166c(olyVarMo18639d, objM19165b);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                objM15591r = oki.f46196a;
            } catch (Throwable th4) {
                objM15591r = lkm.m15591r(th4);
            }
            m18946B(th3, okd.m18589a(objM15591r));
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo18895u(Object obj, Throwable th) {
        throw null;
    }
}
