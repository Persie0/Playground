package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class osb extends osg implements ory {

    /* JADX INFO: renamed from: a */
    private final boolean f46476a;

    public osb() {
        osg osgVarM18982e;
        m19003C(null);
        oqc oqcVarM19012cX = m19012cX();
        oqd oqdVar = oqcVarM19012cX instanceof oqd ? (oqd) oqcVarM19012cX : null;
        boolean z = false;
        if (oqdVar != null && (osgVarM18982e = oqdVar.m18982e()) != null) {
            while (!osgVarM18982e.mo18980cB()) {
                oqc oqcVarM19012cX2 = osgVarM18982e.m19012cX();
                oqd oqdVar2 = oqcVarM19012cX2 instanceof oqd ? (oqd) oqcVarM19012cX2 : null;
                if (oqdVar2 == null || (osgVarM18982e = oqdVar2.m18982e()) == null) {
                }
            }
            z = true;
        }
        this.f46476a = z;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: cB */
    public final boolean mo18980cB() {
        return this.f46476a;
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: cC */
    public final boolean mo18981cC() {
        return true;
    }
}
