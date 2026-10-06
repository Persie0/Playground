package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class erm implements hjk {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f15250a;

    /* JADX INFO: renamed from: b */
    private final Object f15251b;

    public erm(dhv dhvVar, int i) {
        this.f15250a = i;
        this.f15251b = dhvVar;
    }

    public erm(oju ojuVar, int i) {
        this.f15250a = i;
        this.f15251b = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dhv, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15250a) {
            case 0:
                ((fjp) this.f15251b).m8495b();
                break;
            default:
                ?? r0 = this.f15251b;
                dhx dhxVar = dib.f11240a;
                r0.mo6178f();
                break;
        }
    }
}
