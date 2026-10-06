package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class owu implements ous {

    /* JADX INFO: renamed from: a */
    private final oly f46739a;

    /* JADX INFO: renamed from: b */
    private final Object f46740b;

    /* JADX INFO: renamed from: c */
    private final onm f46741c;

    public owu(ous ousVar, oly olyVar) {
        ousVar.getClass();
        olyVar.getClass();
        this.f46739a = olyVar;
        this.f46740b = oyb.m19164a(olyVar);
        this.f46741c = new owt(ousVar, null);
    }

    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        Object objM15647ap = lku.m15647ap(this.f46739a, obj, this.f46740b, this.f46741c, olsVar);
        return objM15647ap == oma.COROUTINE_SUSPENDED ? objM15647ap : oki.f46196a;
    }
}
