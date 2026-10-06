package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knz extends koa {

    /* JADX INFO: renamed from: a */
    koi f36668a = null;

    /* JADX INFO: renamed from: b */
    private final oju f36669b;

    public knz(oju ojuVar) {
        this.f36669b = ojuVar;
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: a */
    public final void mo14611a(Object obj, kod kodVar) {
        synchronized (this) {
            if (this.f36668a == null) {
                this.f36668a = (koi) this.f36669b.get();
            }
            this.f36668a.mo14614a(obj);
        }
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: b */
    public final void mo14612b(kon konVar, ktz ktzVar) {
        koi koiVar;
        synchronized (this) {
            koiVar = this.f36668a;
            this.f36668a = null;
        }
        if (koiVar != null) {
            konVar.m14625a(ktzVar);
            koiVar.mo14615b(konVar, (Object[]) ktzVar.f37200c);
        }
    }
}
