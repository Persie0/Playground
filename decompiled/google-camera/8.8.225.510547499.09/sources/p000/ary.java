package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ary implements adj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2218a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2219b;

    public ary(asf asfVar, int i) {
        this.f2219b = i;
        this.f2218a = asfVar;
    }

    public ary(C0133dl c0133dl, int i) {
        this.f2219b = i;
        this.f2218a = c0133dl;
    }

    @Override // p000.adj
    /* JADX INFO: renamed from: a */
    public final void mo291a() {
        switch (this.f2219b) {
            case 0:
                ((asf) this.f2218a).mo1942l();
                break;
            default:
                ((C0133dl) this.f2218a).m6325d();
                break;
        }
    }
}
