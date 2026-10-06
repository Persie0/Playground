package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgc implements lgb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lgb f38199a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Iterable f38200b;

    /* JADX INFO: renamed from: c */
    private final boolean f38201c = false;

    public lgc(lgb lgbVar, Iterable iterable) {
        this.f38199a = lgbVar;
        this.f38200b = iterable;
    }

    @Override // p000.lgb, p000.kyx
    /* JADX INFO: renamed from: a */
    public final synchronized laa mo15079a() {
        return laa.m15114j(this.f38199a.mo15079a().mo15110i(not.INSTANCE, new lhz(this.f38200b)));
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: c */
    public final Object mo15294c() {
        return this.f38199a.mo15294c();
    }

    @Override // p000.lgb, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lqi.m15868m(mo15079a());
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: cm */
    public final synchronized Object mo15295cm() {
        throw null;
    }
}
