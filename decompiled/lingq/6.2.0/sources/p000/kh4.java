package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f47295b;

    public /* synthetic */ kh4(int i, int i2) {
        this.f47294a = i2;
        this.f47295b = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f47294a;
        int i2 = this.f47295b;
        switch (i) {
            case 0:
            case 1:
                return Float.valueOf(i2 / 100.0f);
            default:
                return Integer.valueOf(i2);
        }
    }
}
