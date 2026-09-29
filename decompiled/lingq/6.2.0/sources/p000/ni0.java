package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ni0 {

    /* JADX INFO: renamed from: a */
    public static final mi0 f52748a = mi0.f51345a;

    /* JADX INFO: renamed from: a */
    default float mo12303a(float f, float f2, float f3) {
        f52748a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
