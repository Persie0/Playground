package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ouq implements our {

    /* JADX INFO: renamed from: a */
    public final oni f46591a;

    /* JADX INFO: renamed from: b */
    public final onm f46592b;

    /* JADX INFO: renamed from: c */
    private final our f46593c;

    public ouq(our ourVar, oni oniVar, onm onmVar) {
        this.f46593c = ourVar;
        this.f46591a = oniVar;
        this.f46592b = onmVar;
    }

    @Override // p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) {
        ooi ooiVar = new ooi();
        ooiVar.f46351a = owm.f46723a;
        Object objMo16104da = this.f46593c.mo16104da(new oup(this, ooiVar, ousVar, 0), olsVar);
        return objMo16104da == oma.COROUTINE_SUSPENDED ? objMo16104da : oki.f46196a;
    }
}
