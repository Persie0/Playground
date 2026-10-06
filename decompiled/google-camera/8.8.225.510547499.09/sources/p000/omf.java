package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class omf extends omd {

    /* JADX INFO: renamed from: a */
    private final oly f46312a;

    /* JADX INFO: renamed from: n */
    public transient ols f46313n;

    public omf(ols olsVar) {
        this(olsVar, olsVar != null ? olsVar.mo18639d() : null);
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public oly mo18639d() {
        oly olyVar = this.f46312a;
        olyVar.getClass();
        return olyVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: h */
    protected void mo18654h() {
        ols olsVar = this.f46313n;
        if (olsVar != null && olsVar != this) {
            olv olvVar = mo18639d().get(olu.f46271a);
            olvVar.getClass();
            ((olu) olvVar).mo18641b(olsVar);
        }
        this.f46313n = ome.f46311a;
    }

    public omf(ols olsVar, oly olyVar) {
        super(olsVar);
        this.f46312a = olyVar;
    }
}
