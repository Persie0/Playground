package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements nm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51508a;

    /* JADX INFO: renamed from: b */
    public final Object f51509b;

    public /* synthetic */ mm0(Object obj, int i) {
        this.f51508a = i;
        this.f51509b = obj;
    }

    @Override // p000.nm0
    /* JADX INFO: renamed from: b */
    public final void mo15586b(Throwable th) {
        int i = this.f51508a;
        Object obj = this.f51509b;
        switch (i) {
            case 0:
                ((vi3) obj).invoke(th);
                break;
            default:
                ((ci2) obj).mo125a();
                break;
        }
    }

    public final String toString() {
        int i = this.f51508a;
        Object obj = this.f51509b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((vi3) obj).getClass().getSimpleName() + '@' + d32.m10016N(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ci2) obj) + ']';
        }
    }
}
