package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ota implements orf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ otb f46509a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f46510b;

    public ota(otb otbVar, Runnable runnable) {
        this.f46509a = otbVar;
        this.f46510b = runnable;
    }

    @Override // p000.orf
    /* JADX INFO: renamed from: cF */
    public final void mo18947cF() {
        this.f46509a.f46511c.removeCallbacks(this.f46510b);
    }
}
