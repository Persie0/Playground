package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ui8 {

    /* JADX INFO: renamed from: a */
    public static final si8 f63972a = m22752a(50);

    /* JADX INFO: renamed from: a */
    public static final si8 m22752a(int i) {
        u67 u67Var = new u67(i);
        return new si8(u67Var, u67Var, u67Var, u67Var);
    }

    /* JADX INFO: renamed from: b */
    public static final si8 m22753b(float f) {
        yj2 yj2Var = new yj2(f);
        return new si8(yj2Var, yj2Var, yj2Var, yj2Var);
    }

    /* JADX INFO: renamed from: c */
    public static si8 m22754c(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new si8(new yj2(f), new yj2(f2), new yj2((i & 4) != 0 ? 0.0f : 8.0f), new yj2((i & 8) == 0 ? 8.0f : 0.0f));
    }
}
