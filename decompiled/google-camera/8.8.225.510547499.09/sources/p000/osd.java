package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class osd extends osc {

    /* JADX INFO: renamed from: a */
    private final osg f46478a;

    /* JADX INFO: renamed from: e */
    private final ose f46479e;

    /* JADX INFO: renamed from: f */
    private final oqd f46480f;

    /* JADX INFO: renamed from: g */
    private final Object f46481g;

    public osd(osg osgVar, ose oseVar, oqd oqdVar, Object obj) {
        oseVar.getClass();
        oqdVar.getClass();
        this.f46478a = osgVar;
        this.f46479e = oseVar;
        this.f46480f = oqdVar;
        this.f46481g = obj;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        mo18901b((Throwable) obj);
        return oki.f46196a;
    }

    @Override // p000.oqi
    /* JADX INFO: renamed from: b */
    public final void mo18901b(Throwable th) {
        osg osgVar = this.f46478a;
        ose oseVar = this.f46479e;
        oqd oqdVar = this.f46480f;
        Object obj = this.f46481g;
        boolean z = oqu.f46432a;
        oqd oqdVarM18991J = osg.m18991J(oqdVar);
        if (oqdVarM18991J == null || !osgVar.m19009I(oseVar, oqdVarM18991J, obj)) {
            osgVar.mo18867f(osgVar.m19013v(oseVar, obj));
        }
    }
}
