package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class boc {

    /* JADX INFO: renamed from: a */
    private static final boo f3978a = new boo("CamDvcInfChar");

    /* JADX INFO: renamed from: a */
    public abstract int mo2711a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2712b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2713c();

    /* JADX INFO: renamed from: d */
    public final int m2787d(int i) {
        return m2788e(i, false);
    }

    /* JADX INFO: renamed from: e */
    protected final int m2788e(int i, boolean z) {
        if (i % 90 != 0) {
            bop.m2812a(f3978a, "Provided display orientation is not divisible by 90");
        } else {
            if (i >= 0 && i <= 270) {
                if (mo2713c()) {
                    int iMo2711a = (mo2711a() + i) % 360;
                    return z ? (360 - iMo2711a) % 360 : iMo2711a;
                }
                if (mo2712b()) {
                    return ((mo2711a() - i) + 360) % 360;
                }
                bop.m2812a(f3978a, "Camera is facing unhandled direction");
                return 0;
            }
            bop.m2812a(f3978a, "Provided display orientation is outside expected range");
        }
        return 0;
    }
}
