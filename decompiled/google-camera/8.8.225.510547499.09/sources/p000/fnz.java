package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnz implements eop {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22815a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22816b;

    public fnz(foc focVar, int i) {
        this.f22816b = i;
        this.f22815a = focVar;
    }

    public fnz(fws fwsVar, int i, byte[] bArr) {
        this.f22816b = i;
        this.f22815a = fwsVar;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5221a(boolean z) {
        int i = this.f22816b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5222b(boolean z) {
        int i = this.f22816b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5223c() {
        int i = this.f22816b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo5225e(boolean z) {
        int i = this.f22816b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo5226f(boolean z) {
        int i = this.f22816b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [igf, java.lang.Object] */
    @Override // p000.eop
    /* JADX INFO: renamed from: d */
    public final void mo5224d(boolean z) {
        switch (this.f22816b) {
            case 0:
                if (!z) {
                    foc focVar = (foc) this.f22815a;
                    if (!focVar.f22881l) {
                        focVar.f22876g.onShutterButtonClick();
                    }
                }
                break;
            default:
                ?? r0 = ((fws) this.f22815a).f23765b;
                r0.getClass();
                if (!z) {
                    r0.onShutterButtonDown();
                } else {
                    r0.onShutterTouchStart();
                }
                break;
        }
    }
}
