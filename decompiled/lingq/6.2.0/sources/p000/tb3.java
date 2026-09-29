package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class tb3 {

    /* JADX INFO: renamed from: a */
    public static final float[] f62095a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile pe9 f62096b = new pe9(0);

    /* JADX INFO: renamed from: c */
    public static final Object[] f62097c;

    static {
        Object[] objArr = new Object[0];
        f62097c = objArr;
        synchronized (objArr) {
            f62096b.m19080d(115, new ub3(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f62096b.m19080d(130, new ub3(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f62096b.m19080d(150, new ub3(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f62096b.m19080d(180, new ub3(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f62096b.m19080d(200, new ub3(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f62096b.m19079c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        k54.m14853b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static sb3 m21931a(float f) {
        float fM19079c;
        sb3 ub3Var;
        float[] fArr = f62095a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        sb3 sb3Var = (sb3) f62096b.m19078b(i);
        if (sb3Var != null) {
            return sb3Var;
        }
        pe9 pe9Var = f62096b;
        if (pe9Var.f56013a) {
            AbstractC3122is.m14091e(pe9Var);
        }
        int iM18260j = AbstractC3423or.m18260j(pe9Var.f56016d, i, pe9Var.f56014b);
        if (iM18260j >= 0) {
            return (sb3) f62096b.m19082f(iM18260j);
        }
        int i2 = -(iM18260j + 1);
        int i3 = i2 - 1;
        if (i2 >= f62096b.m19081e()) {
            ub3 ub3Var2 = new ub3(new float[]{1.0f}, new float[]{f});
            m21932b(f, ub3Var2);
            return ub3Var2;
        }
        if (i3 < 0) {
            ub3Var = new ub3(fArr, fArr);
            fM19079c = 1.0f;
        } else {
            fM19079c = f62096b.m19079c(i3) / 100.0f;
            ub3Var = (sb3) f62096b.m19082f(i3);
        }
        float fM19079c2 = f62096b.m19079c(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fM19079c == fM19079c2 ? 0.0f : (f - fM19079c) / (fM19079c2 - fM19079c))) * 1.0f) + 0.0f;
        sb3 sb3Var2 = (sb3) f62096b.m19082f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fMo21206b = ub3Var.mo21206b(f2);
            fArr2[i4] = ((sb3Var2.mo21206b(f2) - fMo21206b) * fMax) + fMo21206b;
        }
        ub3 ub3Var3 = new ub3(fArr, fArr2);
        m21932b(f, ub3Var3);
        return ub3Var3;
    }

    /* JADX INFO: renamed from: b */
    public static void m21932b(float f, ub3 ub3Var) {
        synchronized (f62097c) {
            pe9 pe9VarClone = f62096b.clone();
            pe9VarClone.m19080d((int) (f * 100.0f), ub3Var);
            f62096b = pe9VarClone;
        }
    }
}
