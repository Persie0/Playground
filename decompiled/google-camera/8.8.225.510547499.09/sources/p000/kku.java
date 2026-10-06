package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kku extends kpt {

    /* JADX INFO: renamed from: a */
    boolean f36411a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kkw f36412b;

    /* JADX INFO: renamed from: c */
    private final long f36413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kku(kkw kkwVar, kpw kpwVar, kfd kfdVar) {
        super(kpwVar);
        this.f36412b = kkwVar;
        this.f36411a = false;
        ((kja) kkwVar.f36426k.f38884c).f36243i.m14852d(Integer.valueOf(kpwVar.mo7247c()), Integer.valueOf(kpwVar.mo7246b()), Integer.valueOf(kpwVar.mo7245a()));
        kkwVar.f36422g.mo13954b();
        this.f36413c = kfdVar.f35811b;
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f36411a) {
                return;
            }
            this.f36411a = true;
            ((kja) this.f36412b.f36426k.f38884c).f36244j.m14852d(Integer.valueOf(mo7247c()), Integer.valueOf(mo7246b()), Integer.valueOf(mo7245a()));
            this.f36412b.f36422g.mo13953a();
            super.close();
            this.f36412b.m14470b();
        }
    }

    @Override // p000.kpt, p000.kpw
    /* JADX INFO: renamed from: d */
    public final long mo7248d() {
        return this.f36413c;
    }
}
