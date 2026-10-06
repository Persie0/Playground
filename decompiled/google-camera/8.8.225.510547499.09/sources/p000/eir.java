package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eir extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eja f14170a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ dhv f14171b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ jfs f14172c;

    public eir(jfs jfsVar, eja ejaVar, dhv dhvVar, byte[] bArr) {
        this.f14172c = jfsVar;
        this.f14170a = ejaVar;
        this.f14171b = dhvVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        if (this.f14172c.m13078M()) {
            this.f14170a.m7388g();
            return;
        }
        dhv dhvVar = this.f14171b;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonDown() {
        if (this.f14172c.m13078M()) {
            return;
        }
        this.f14170a.m7388g();
    }
}
