package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oi0 implements ni0 {
    @Override // p000.ni0
    /* JADX INFO: renamed from: a */
    public final float mo12303a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
