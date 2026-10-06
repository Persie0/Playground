package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gin implements gia {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f24896a;

    public gin(int i) {
        this.f24896a = i;
    }

    @Override // p000.gia, p000.kba, java.lang.AutoCloseable
    public final void close() {
        int i = this.f24896a;
    }

    @Override // p000.gia
    /* JADX INFO: renamed from: a */
    public final kge mo9272a() {
        switch (this.f24896a) {
            case 0:
                kgd kgdVarM14187a = kge.m14187a();
                kgdVarM14187a.m14184c(3);
                kgdVarM14187a.m14183b(4);
                kgdVarM14187a.m14186e(3);
                kgdVarM14187a.m14185d(false);
                return kgdVarM14187a.m14182a();
            default:
                kgd kgdVarM14187a2 = kge.m14187a();
                kgdVarM14187a2.m14184c(4);
                kgdVarM14187a2.m14183b(4);
                kgdVarM14187a2.m14186e(1);
                kgdVarM14187a2.m14185d(true);
                return kgdVarM14187a2.m14182a();
        }
    }
}
