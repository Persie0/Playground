package p000;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2918d8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f35100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f35101c;

    public /* synthetic */ C2918d8(double d, double d2, int i) {
        this.f35099a = i;
        this.f35100b = d;
        this.f35101c = d2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f35099a;
        double d = this.f35101c;
        double d2 = this.f35100b;
        switch (i) {
            case 0:
                float f = (float) d;
                return Float.valueOf(f > 0.0f ? l70.m15944g(((float) d2) / f, 0.0f, 1.0f) : 0.0f);
            default:
                return Float.valueOf(((float) d2) / ((float) d));
        }
    }
}
