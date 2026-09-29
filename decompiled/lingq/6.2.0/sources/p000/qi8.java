package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qi8 {

    /* JADX INFO: renamed from: a */
    public final long f57823a;

    /* JADX INFO: renamed from: b */
    public final long f57824b;

    /* JADX INFO: renamed from: c */
    public final long f57825c;

    /* JADX INFO: renamed from: d */
    public final long f57826d;

    /* JADX INFO: renamed from: e */
    public final long f57827e;

    /* JADX INFO: renamed from: f */
    public final float f57828f;

    /* JADX INFO: renamed from: g */
    public final float f57829g;

    /* JADX INFO: renamed from: h */
    public final float f57830h;

    /* JADX INFO: renamed from: i */
    public long f57831i;

    public qi8(long j, long j2, long j3, en1 en1Var) {
        this.f57823a = j;
        this.f57824b = j2;
        this.f57825c = j3;
        long jM10541q = do7.m10541q(do7.m10546v(j, j2));
        this.f57826d = jM10541q;
        long jM10541q2 = do7.m10541q(do7.m10546v(j3, j2));
        this.f57827e = jM10541q2;
        float f = en1Var.f37552a;
        this.f57828f = f;
        this.f57829g = 0.0f;
        float fM10536l = do7.m10536l(jM10541q, jM10541q2);
        float f2 = jna.f45883b;
        float fSqrt = (float) Math.sqrt(1.0f - (fM10536l * fM10536l));
        this.f57830h = ((double) fSqrt) > 0.001d ? ((fM10536l + 1.0f) * f) / fSqrt : 0.0f;
        this.f57831i = i73.m13710a(0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0092  */
    /* JADX INFO: renamed from: b */
    public static yr1 m19976b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        i73 i73Var;
        long jM10541q = do7.m10541q(do7.m10546v(j2, j));
        long jM10549y = do7.m10549y(j, do7.m10519F(1.0f + f2, do7.m10519F(f, jM10541q)));
        long jM10535k = do7.m10535k(2.0f, do7.m10549y(j3, j4));
        long jM13710a = i73.m13710a(jna.m14562b(do7.m10544t(j3), do7.m10544t(jM10535k), f2), jna.m14562b(do7.m10545u(j3), do7.m10545u(jM10535k), f2));
        long jM10549y2 = do7.m10549y(j5, do7.m10519F(f3, jna.m14561a(do7.m10544t(jM13710a) - do7.m10544t(j5), do7.m10545u(jM13710a) - do7.m10545u(j5))));
        long jM10546v = do7.m10546v(jM10549y2, j5);
        long jM13710a2 = i73.m13710a(-do7.m10545u(jM10546v), do7.m10544t(jM10546v));
        long jM13710a3 = i73.m13710a(-do7.m10545u(jM13710a2), do7.m10544t(jM13710a2));
        float fM10536l = do7.m10536l(jM10541q, jM13710a3);
        if (Math.abs(fM10536l) < 1.0E-4f) {
            i73Var = null;
        } else {
            float fM10536l2 = do7.m10536l(do7.m10546v(jM10549y2, j2), jM13710a3);
            if (Math.abs(fM10536l) < Math.abs(fM10536l2) * 1.0E-4f) {
                i73Var = null;
            } else {
                i73Var = new i73(do7.m10549y(j2, do7.m10519F(fM10536l2 / fM10536l, jM10541q)));
            }
        }
        long j6 = i73Var != null ? i73Var.f43618a : j3;
        long jM10535k2 = do7.m10535k(3.0f, do7.m10549y(jM10549y, do7.m10519F(2.0f, j6)));
        return new yr1(new float[]{do7.m10544t(jM10549y), do7.m10545u(jM10549y), do7.m10544t(jM10535k2), do7.m10545u(jM10535k2), do7.m10544t(j6), do7.m10545u(j6), do7.m10544t(jM10549y2), do7.m10545u(jM10549y2)});
    }

    /* JADX INFO: renamed from: a */
    public final float m19977a(float f) {
        float fM19978c = m19978c();
        float f2 = this.f57829g;
        if (f > fM19978c) {
            return f2;
        }
        float f3 = this.f57830h;
        if (f > f3) {
            return ((f - f3) * f2) / (m19978c() - f3);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m19978c() {
        return (1.0f + this.f57829g) * this.f57830h;
    }
}
