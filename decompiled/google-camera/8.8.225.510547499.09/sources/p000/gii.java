package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gii implements gia {

    /* JADX INFO: renamed from: a */
    private boolean f24889a;

    /* JADX INFO: renamed from: b */
    private final kfo f24890b;

    public gii(kfo kfoVar) {
        this.f24890b = kfoVar;
    }

    @Override // p000.gia
    /* JADX INFO: renamed from: a */
    public final kge mo9272a() {
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(3);
        kgdVarM14187a.m14183b(4);
        kgdVarM14187a.m14186e(3);
        kgdVarM14187a.m14185d(false);
        return kgdVarM14187a.m14182a();
    }

    @Override // p000.gia, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f24889a) {
            return;
        }
        this.f24889a = true;
        gij.m9291c(this.f24890b, false);
    }
}
