package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpo implements byw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bpp f4083a;

    /* JADX INFO: renamed from: b */
    private final bzi f4084b;

    public bpo(bpp bppVar, bzi bziVar) {
        this.f4083a = bppVar;
        this.f4084b = bziVar;
    }

    @Override // p000.byw
    /* JADX INFO: renamed from: a */
    public final void mo2860a(boolean z) {
        if (z) {
            synchronized (this.f4083a) {
                bzi bziVar = this.f4084b;
                for (bzw bzwVar : cbi.m3385f(bziVar.f4812a)) {
                    if (!bzwVar.mo3332l() && !bzwVar.mo3331k()) {
                        bzwVar.mo3323c();
                        if (bziVar.f4814c) {
                            bziVar.f4813b.add(bzwVar);
                        } else {
                            bzwVar.mo3322b();
                        }
                    }
                }
            }
        }
    }
}
