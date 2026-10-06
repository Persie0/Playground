package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class euy extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hwy f20270a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eva f20271b;

    public euy(eva evaVar, hwy hwyVar) {
        this.f20271b = evaVar;
        this.f20270a = hwyVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        this.f20271b.f20288I.m10431f();
        this.f20270a.m10797f();
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonPressedStateChanged(boolean z) {
        this.f20271b.f20289J = z;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterTouchStart() {
        this.f20271b.f20288I.m10430e();
    }
}
