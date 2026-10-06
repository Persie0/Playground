package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class oxp {

    /* JADX INFO: renamed from: c */
    public final opn f46784c = ook.m18796j(this);

    /* JADX INFO: renamed from: d */
    public final opn f46785d = ook.m18796j(this);

    /* JADX INFO: renamed from: a */
    private final opn f46783a = ook.m18796j(null);

    /* JADX INFO: renamed from: cJ */
    private final oxp m19136cJ() {
        while (true) {
            oxp oxpVar = (oxp) this.f46785d.f46397a;
            oxp oxpVar2 = oxpVar;
            oxp oxpVar3 = null;
            while (true) {
                Object obj = oxpVar2.f46784c.f46397a;
                if (obj == this) {
                    if (oxpVar != oxpVar2 && !this.f46785d.m18856d(oxpVar, oxpVar2)) {
                        break;
                    }
                    return oxpVar2;
                }
                if (mo19134cI()) {
                    return null;
                }
                if (obj == null) {
                    return oxpVar2;
                }
                if (obj instanceof oxt) {
                    ((oxt) obj).m19151c(oxpVar2);
                    break;
                }
                if (!(obj instanceof oxu)) {
                    oxpVar3 = oxpVar2;
                    oxpVar2 = (oxp) obj;
                } else if (oxpVar3 == null) {
                    oxpVar2 = (oxp) oxpVar2.f46785d.f46397a;
                } else {
                    if (!oxpVar3.f46784c.m18856d(oxpVar2, ((oxu) obj).f46796a)) {
                        break;
                    }
                    oxpVar2 = oxpVar3;
                    oxpVar3 = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: cH */
    public boolean mo19133cH() {
        return m19141n() == null;
    }

    /* JADX INFO: renamed from: cI */
    public boolean mo19134cI() {
        return m19138k() instanceof oxu;
    }

    /* JADX INFO: renamed from: j */
    public final int m19137j(oxp oxpVar, oxp oxpVar2, oxn oxnVar) {
        oxpVar.f46785d.m18854b(this);
        oxpVar.f46784c.m18854b(oxpVar2);
        oxnVar.f46782d = oxpVar2;
        if (this.f46784c.m18856d(oxpVar2, oxnVar)) {
            return oxnVar.m19151c(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m19138k() {
        opn opnVar = this.f46784c;
        while (true) {
            Object obj = opnVar.f46397a;
            if (!(obj instanceof oxt)) {
                return obj;
            }
            ((oxt) obj).m19151c(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final oxp m19139l() {
        Object objM19138k = m19138k();
        objM19138k.getClass();
        oxu oxuVar = objM19138k instanceof oxu ? (oxu) objM19138k : null;
        return oxuVar != null ? oxuVar.f46796a : (oxp) objM19138k;
    }

    /* JADX INFO: renamed from: m */
    public final oxp m19140m() {
        oxp oxpVarM19136cJ = m19136cJ();
        if (oxpVarM19136cJ != null) {
            return oxpVarM19136cJ;
        }
        Object obj = this.f46785d.f46397a;
        while (true) {
            oxp oxpVar = (oxp) obj;
            if (!oxpVar.mo19134cI()) {
                return oxpVar;
            }
            obj = oxpVar.f46785d.f46397a;
        }
    }

    /* JADX INFO: renamed from: n */
    public final oxp m19141n() {
        Object objM19138k;
        oxp oxpVar;
        oxu oxuVar;
        do {
            objM19138k = m19138k();
            if (objM19138k instanceof oxu) {
                return ((oxu) objM19138k).f46796a;
            }
            if (objM19138k == this) {
                return (oxp) objM19138k;
            }
            objM19138k.getClass();
            oxpVar = (oxp) objM19138k;
            oxuVar = (oxu) oxpVar.f46783a.f46397a;
            if (oxuVar == null) {
                oxuVar = new oxu(oxpVar);
                oxpVar.f46783a.m18854b(oxuVar);
            }
        } while (!this.f46784c.m18856d(objM19138k, oxuVar));
        oxpVar.m19136cJ();
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m19142o(oxp oxpVar) {
        oxp oxpVar2;
        opn opnVar = oxpVar.f46785d;
        do {
            oxpVar2 = (oxp) opnVar.f46397a;
            if (m19138k() != oxpVar) {
                return;
            }
        } while (!oxpVar.f46785d.m18856d(oxpVar2, this));
        if (mo19134cI()) {
            oxpVar.m19136cJ();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m19143p() {
        Object objM19138k = m19138k();
        objM19138k.getClass();
        ((oxu) objM19138k).f46796a.m19144q();
    }

    /* JADX INFO: renamed from: q */
    public final void m19144q() {
        oxp oxpVar = this;
        while (true) {
            Object objM19138k = oxpVar.m19138k();
            if (!(objM19138k instanceof oxu)) {
                oxpVar.m19136cJ();
                return;
            }
            oxpVar = ((oxu) objM19138k).f46796a;
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m19145r(oxp oxpVar, oxp oxpVar2) {
        oxpVar.f46785d.m18854b(this);
        oxpVar.f46784c.m18854b(oxpVar2);
        if (!this.f46784c.m18856d(oxpVar2, oxpVar)) {
            return false;
        }
        oxpVar.m19142o(oxpVar2);
        return true;
    }

    public String toString() {
        return new oof(this) { // from class: oxo
            @Override // p000.oof
            /* JADX INFO: renamed from: g */
            public final Object mo18761g() {
                return oqv.m18920a(this.f46332b);
            }
        } + "@" + oqv.m18921b(this);
    }
}
