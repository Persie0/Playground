package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mch extends ood implements omx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ oeo f39943a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nps f39944b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oeh f39945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mch(oeo oeoVar, nps npsVar, oeh oehVar) {
        super(0);
        this.f39943a = oeoVar;
        this.f39944b = npsVar;
        this.f39945c = oehVar;
    }

    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2077a() {
        this.f39943a.mo18424d();
        oeo oeoVar = this.f39943a;
        synchronized (oeoVar) {
            oeo oeoVar2 = ((oem) oeoVar).f45749b;
            if (oeoVar2 != null) {
                synchronized (oeoVar2) {
                    ((oek) oeoVar2).f45744g = 3;
                    oeoVar2.notifyAll();
                }
                ((oem) oeoVar).f45749b = null;
            }
            ((oem) oeoVar).f45750c = 3;
            oeoVar.notifyAll();
        }
        this.f39944b.cancel(true);
        this.f39945c.close();
        return oki.f46196a;
    }
}
