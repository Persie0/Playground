package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class osc extends oqi implements orf, oru {

    /* JADX INFO: renamed from: b */
    public osg f46477b;

    @Override // p000.oru
    /* JADX INFO: renamed from: cE */
    public final osj mo18948cE() {
        return null;
    }

    @Override // p000.orf
    /* JADX INFO: renamed from: cF */
    public final void mo18947cF() {
        Object objM19010cV;
        osg osgVarM18982e = m18982e();
        do {
            objM19010cV = osgVarM18982e.m19010cV();
            if (!(objM19010cV instanceof osc)) {
                if (!(objM19010cV instanceof oru) || ((oru) objM19010cV).mo18948cE() == null) {
                    return;
                }
                mo19133cH();
                return;
            }
            if (objM19010cV != this) {
                return;
            }
        } while (!osgVarM18982e.f46489d.m18856d(objM19010cV, osh.f46495f));
    }

    @Override // p000.oru
    /* JADX INFO: renamed from: cG */
    public final boolean mo18949cG() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final osg m18982e() {
        osg osgVar = this.f46477b;
        if (osgVar != null) {
            return osgVar;
        }
        ooc.m18736b("job");
        return null;
    }

    @Override // p000.oxp
    public final String toString() {
        return oqv.m18920a(this) + "@" + oqv.m18921b(this) + "[job@" + oqv.m18921b(m18982e()) + "]";
    }
}
