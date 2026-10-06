package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bmw extends boh {
    public bmw() {
        super(null);
    }

    @Override // p000.boh
    /* JADX INFO: renamed from: a */
    public final void mo2757a(int i) {
        bop.m2814c(bnh.f3875a, "onCameraError called with no handler set: " + i);
    }

    @Override // p000.boh
    /* JADX INFO: renamed from: b */
    public final void mo2758b(RuntimeException runtimeException, String str, int i, int i2) {
        bop.m2815d(bnh.f3875a, "onCameraException called with no handler set", runtimeException);
    }

    @Override // p000.boh
    /* JADX INFO: renamed from: c */
    public final void mo2759c(RuntimeException runtimeException) {
        bop.m2815d(bnh.f3875a, "onDispatchThreadException called with no handler set", runtimeException);
    }
}
