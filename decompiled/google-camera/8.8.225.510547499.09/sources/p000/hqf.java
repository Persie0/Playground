package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hqf extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hqk f29046a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ jfs f29047b;

    public hqf(hqk hqkVar, jfs jfsVar, byte[] bArr) {
        this.f29046a = hqkVar;
        this.f29047b = jfsVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        jfo jfoVar;
        if (!this.f29047b.m13078M() || (jfoVar = this.f29046a.f29073U) == null) {
            return;
        }
        jfoVar.m13053b();
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonDown() {
        jfo jfoVar;
        if (this.f29047b.m13078M() || (jfoVar = this.f29046a.f29073U) == null) {
            return;
        }
        jfoVar.m13053b();
    }
}
