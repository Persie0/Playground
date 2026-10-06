package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class owi extends owg {

    /* JADX INFO: renamed from: c */
    protected final our f46717c;

    public owi(our ourVar, oly olyVar) {
        super(olyVar, -3);
        this.f46717c = ourVar;
    }

    @Override // p000.owg
    /* JADX INFO: renamed from: b */
    protected final Object mo19080b(oub oubVar, ols olsVar) {
        Object objM19114c = m19114c(new owr(oubVar), olsVar);
        return objM19114c == oma.COROUTINE_SUSPENDED ? objM19114c : oki.f46196a;
    }

    /* JADX INFO: renamed from: c */
    protected final Object m19114c(ous ousVar, ols olsVar) {
        Object objMo16104da = this.f46717c.mo16104da(ousVar, olsVar);
        return objMo16104da == oma.COROUTINE_SUSPENDED ? objMo16104da : oki.f46196a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    @Override // p000.owg, p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) throws Throwable {
        Object objM19113d;
        if (this.f46713b == -3) {
            oly olyVarMo18639d = olsVar.mo18639d();
            oly olyVarPlus = olyVarMo18639d.plus(this.f46712a);
            if (ooc.m18737c(olyVarPlus, olyVarMo18639d)) {
                objM19113d = m19114c(ousVar, olsVar);
                if (objM19113d != oma.COROUTINE_SUSPENDED) {
                    return oki.f46196a;
                }
            } else if (ooc.m18737c(olyVarPlus.get(olu.f46271a), olyVarMo18639d.get(olu.f46271a))) {
                oly olyVarMo18639d2 = olsVar.mo18639d();
                if (!(ousVar instanceof owr) && !(ousVar instanceof owl)) {
                    ousVar = new owu(ousVar, olyVarMo18639d2);
                }
                objM19113d = lku.m15647ap(olyVarPlus, ousVar, oyb.m19164a(olyVarPlus), new owh(this, null), olsVar);
                oma omaVar = oma.COROUTINE_SUSPENDED;
                if (objM19113d != omaVar) {
                    objM19113d = oki.f46196a;
                }
                if (objM19113d != omaVar) {
                    return oki.f46196a;
                }
            } else {
                objM19113d = owg.m19113d(this, ousVar, olsVar);
                if (objM19113d != oma.COROUTINE_SUSPENDED) {
                    return oki.f46196a;
                }
            }
        } else {
            objM19113d = owg.m19113d(this, ousVar, olsVar);
            if (objM19113d != oma.COROUTINE_SUSPENDED) {
                return oki.f46196a;
            }
        }
        return objM19113d;
    }

    @Override // p000.owg
    public final String toString() throws IOException {
        return this.f46717c + " -> " + super.toString();
    }
}
