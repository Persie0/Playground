package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eas {

    /* JADX INFO: renamed from: i */
    private long f13103i;

    /* JADX INFO: renamed from: j */
    private long f13104j;

    /* JADX INFO: renamed from: k */
    private float f13105k;

    /* JADX INFO: renamed from: m */
    private int f13107m;

    /* JADX INFO: renamed from: a */
    private final double[] f13095a = new double[16];

    /* JADX INFO: renamed from: r */
    private final jfs f13112r = new jfs((byte[]) null);

    /* JADX INFO: renamed from: s */
    private final jfs f13113s = new jfs((byte[]) null);

    /* JADX INFO: renamed from: t */
    private final jfs f13114t = new jfs((byte[]) null);

    /* JADX INFO: renamed from: u */
    private final jfs f13115u = new jfs((byte[]) null);

    /* JADX INFO: renamed from: v */
    private final jfs f13116v = new jfs((byte[]) null);

    /* JADX INFO: renamed from: w */
    private final jfs f13117w = new jfs((byte[]) null);

    /* JADX INFO: renamed from: x */
    private final jfs f13118x = new jfs((byte[]) null);

    /* JADX INFO: renamed from: y */
    private final jfs f13119y = new jfs((byte[]) null);

    /* JADX INFO: renamed from: z */
    private final jfs f13120z = new jfs((byte[]) null);

    /* JADX INFO: renamed from: b */
    private final ini f13096b = new ini();

    /* JADX INFO: renamed from: c */
    private final ini f13097c = new ini();

    /* JADX INFO: renamed from: d */
    private final ini f13098d = new ini();

    /* JADX INFO: renamed from: e */
    private final ini f13099e = new ini();

    /* JADX INFO: renamed from: f */
    private final ini f13100f = new ini();

    /* JADX INFO: renamed from: g */
    private final ini f13101g = new ini();

    /* JADX INFO: renamed from: h */
    private final ini f13102h = new ini();

    /* JADX INFO: renamed from: L */
    private final ljf f13094L = new ljf();

    /* JADX INFO: renamed from: l */
    private boolean f13106l = false;

    /* JADX INFO: renamed from: n */
    private boolean f13108n = true;

    /* JADX INFO: renamed from: A */
    private final jfs f13083A = new jfs((byte[]) null);

    /* JADX INFO: renamed from: B */
    private final jfs f13084B = new jfs((byte[]) null);

    /* JADX INFO: renamed from: C */
    private final jfs f13085C = new jfs((byte[]) null);

    /* JADX INFO: renamed from: D */
    private final jfs f13086D = new jfs((byte[]) null);

    /* JADX INFO: renamed from: E */
    private final jfs f13087E = new jfs((byte[]) null);

    /* JADX INFO: renamed from: F */
    private final jfs f13088F = new jfs((byte[]) null);

    /* JADX INFO: renamed from: G */
    private final jfs f13089G = new jfs((byte[]) null);

    /* JADX INFO: renamed from: H */
    private final jfs f13090H = new jfs((byte[]) null);

    /* JADX INFO: renamed from: o */
    private final ini f13109o = new ini();

    /* JADX INFO: renamed from: p */
    private final ini f13110p = new ini();

    /* JADX INFO: renamed from: q */
    private final ini f13111q = new ini();

    /* JADX INFO: renamed from: I */
    private final jfs f13091I = new jfs((byte[]) null);

    /* JADX INFO: renamed from: J */
    private final jfs f13092J = new jfs((byte[]) null);

    /* JADX INFO: renamed from: K */
    private final jfs f13093K = new jfs((byte[]) null);

    private eas() {
    }

    /* JADX INFO: renamed from: b */
    public static eas m7006b() {
        eas easVar = new eas();
        easVar.m7012e();
        return easVar;
    }

    /* JADX INFO: renamed from: i */
    private final void m7007i() {
        this.f13113s.m13110t(this.f13091I);
        jfs.m13068q(this.f13114t, this.f13091I, this.f13092J);
        jfs.m13068q(this.f13113s, this.f13092J, this.f13114t);
        this.f13113s.m13105k();
    }

    /* JADX INFO: renamed from: j */
    private final void m7008j(jfs jfsVar, ini iniVar) {
        jfs.m13069r(jfsVar, this.f13101g, this.f13098d);
        this.f13094L.m15533i(this.f13098d, this.f13097c, this.f13093K);
        ljf ljfVar = this.f13094L;
        jfs jfsVar2 = this.f13093K;
        double dM13101g = jfsVar2.m13101g(0, 0) + jfsVar2.m13101g(1, 1) + jfsVar2.m13101g(2, 2);
        iniVar.m11519g((jfsVar2.m13101g(2, 1) - jfsVar2.m13101g(1, 2)) / 2.0d, (jfsVar2.m13101g(0, 2) - jfsVar2.m13101g(2, 0)) / 2.0d, (jfsVar2.m13101g(1, 0) - jfsVar2.m13101g(0, 1)) / 2.0d);
        double d = (dM13101g - 1.0d) * 0.5d;
        double dM11515b = iniVar.m11515b();
        if (d > 0.7071067811865476d) {
            if (dM11515b > 0.0d) {
                iniVar.m11517e(Math.asin(dM11515b) / dM11515b);
                return;
            }
            return;
        }
        if (d > -0.7071067811865476d) {
            iniVar.m11517e(Math.acos(d) / dM11515b);
            return;
        }
        double dAsin = 3.141592653589793d - Math.asin(dM11515b);
        double dM13101g2 = jfsVar2.m13101g(0, 0) - d;
        double dM13101g3 = jfsVar2.m13101g(1, 1) - d;
        double dM13101g4 = jfsVar2.m13101g(2, 2) - d;
        Object obj = ljfVar.f38372d;
        double d2 = dM13101g2 * dM13101g2;
        double d3 = dM13101g3 * dM13101g3;
        if (d2 > d3 && d2 > dM13101g4 * dM13101g4) {
            ((ini) obj).m11519g(dM13101g2, (jfsVar2.m13101g(1, 0) + jfsVar2.m13101g(0, 1)) / 2.0d, (jfsVar2.m13101g(0, 2) + jfsVar2.m13101g(2, 0)) / 2.0d);
        } else if (d3 > dM13101g4 * dM13101g4) {
            ((ini) obj).m11519g((jfsVar2.m13101g(1, 0) + jfsVar2.m13101g(0, 1)) / 2.0d, dM13101g3, (jfsVar2.m13101g(2, 1) + jfsVar2.m13101g(1, 2)) / 2.0d);
        } else {
            ((ini) obj).m11519g((jfsVar2.m13101g(0, 2) + jfsVar2.m13101g(2, 0)) / 2.0d, (jfsVar2.m13101g(2, 1) + jfsVar2.m13101g(1, 2)) / 2.0d, dM13101g4);
        }
        ini iniVar2 = (ini) obj;
        if (ini.m11513a(iniVar2, iniVar) < 0.0d) {
            iniVar2.m11517e(-1.0d);
        }
        iniVar2.m11516d();
        iniVar2.m11517e(dAsin);
        iniVar.m11518f(iniVar2);
    }

    /* JADX INFO: renamed from: a */
    public final double m7009a() {
        double dM13101g = this.f13112r.m13101g(2, 0);
        double dM13101g2 = this.f13112r.m13101g(2, 1);
        if (Math.sqrt((dM13101g * dM13101g) + (dM13101g2 * dM13101g2)) < 0.1d) {
            return 0.0d;
        }
        double dAtan2 = (-90.0d) - ((Math.atan2(dM13101g2, dM13101g) / 3.141592653589793d) * 180.0d);
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return dAtan2 >= 360.0d ? dAtan2 - 360.0d : dAtan2;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7010c(float[] fArr, long j) {
        this.f13097c.m11519g(fArr[0], fArr[1], fArr[2]);
        if (this.f13104j != 0) {
            m7008j(this.f13112r, this.f13096b);
            for (int i = 0; i < 3; i++) {
                ini iniVar = this.f13111q;
                iniVar.m11520h();
                if (i == 0) {
                    iniVar.f31594a = 1.0E-7d;
                } else if (i == 1) {
                    iniVar.f31595b = 1.0E-7d;
                } else {
                    iniVar.f31596c = 1.0E-7d;
                }
                ljf.m15523j(iniVar, this.f13086D);
                jfs.m13068q(this.f13086D, this.f13112r, this.f13087E);
                m7008j(this.f13087E, this.f13109o);
                ini iniVar2 = this.f13109o;
                ini iniVar3 = this.f13096b;
                this.f13110p.m11519g(iniVar3.f31594a - iniVar2.f31594a, iniVar3.f31595b - iniVar2.f31595b, iniVar3.f31596c - iniVar2.f31596c);
                this.f13110p.m11517e(1.0E7d);
                this.f13119y.m13104j(i, this.f13110p);
            }
            this.f13119y.m13110t(this.f13088F);
            jfs.m13068q(this.f13114t, this.f13088F, this.f13089G);
            jfs.m13068q(this.f13119y, this.f13089G, this.f13090H);
            jfs jfsVar = this.f13090H;
            jfs jfsVar2 = this.f13117w;
            jfs jfsVar3 = this.f13118x;
            Object obj = jfsVar3.f33914a;
            Object obj2 = jfsVar.f33914a;
            double d = ((double[]) obj2)[0];
            Object obj3 = jfsVar2.f33914a;
            ((double[]) obj)[0] = d + ((double[]) obj3)[0];
            ((double[]) obj)[1] = ((double[]) obj2)[1] + ((double[]) obj3)[1];
            ((double[]) obj)[2] = ((double[]) obj2)[2] + ((double[]) obj3)[2];
            ((double[]) obj)[3] = ((double[]) obj2)[3] + ((double[]) obj3)[3];
            ((double[]) obj)[4] = ((double[]) obj2)[4] + ((double[]) obj3)[4];
            ((double[]) obj)[5] = ((double[]) obj2)[5] + ((double[]) obj3)[5];
            ((double[]) obj)[6] = ((double[]) obj2)[6] + ((double[]) obj3)[6];
            ((double[]) obj)[7] = ((double[]) obj2)[7] + ((double[]) obj3)[7];
            ((double[]) obj)[8] = ((double[]) obj2)[8] + ((double[]) obj3)[8];
            jfsVar3.m13111u(this.f13088F);
            this.f13119y.m13110t(this.f13089G);
            jfs.m13068q(this.f13089G, this.f13088F, this.f13090H);
            jfs.m13068q(this.f13114t, this.f13090H, this.f13120z);
            jfs.m13069r(this.f13120z, this.f13096b, this.f13100f);
            jfs.m13068q(this.f13120z, this.f13119y, this.f13088F);
            this.f13089G.m13105k();
            jfs jfsVar4 = this.f13089G;
            jfs jfsVar5 = this.f13088F;
            Object obj4 = jfsVar4.f33914a;
            double d2 = ((double[]) obj4)[0];
            Object obj5 = jfsVar5.f33914a;
            ((double[]) obj4)[0] = d2 - ((double[]) obj5)[0];
            ((double[]) obj4)[1] = ((double[]) obj4)[1] - ((double[]) obj5)[1];
            ((double[]) obj4)[2] = ((double[]) obj4)[2] - ((double[]) obj5)[2];
            ((double[]) obj4)[3] = ((double[]) obj4)[3] - ((double[]) obj5)[3];
            ((double[]) obj4)[4] = ((double[]) obj4)[4] - ((double[]) obj5)[4];
            ((double[]) obj4)[5] = ((double[]) obj4)[5] - ((double[]) obj5)[5];
            ((double[]) obj4)[6] = ((double[]) obj4)[6] - ((double[]) obj5)[6];
            ((double[]) obj4)[7] = ((double[]) obj4)[7] - ((double[]) obj5)[7];
            ((double[]) obj4)[8] = ((double[]) obj4)[8] - ((double[]) obj5)[8];
            jfs.m13068q(jfsVar4, this.f13114t, jfsVar5);
            this.f13114t.m13109s(this.f13088F);
            ljf.m15523j(this.f13100f, this.f13113s);
            jfs jfsVar6 = this.f13113s;
            jfs jfsVar7 = this.f13112r;
            jfs.m13068q(jfsVar6, jfsVar7, jfsVar7);
            m7007i();
        } else {
            this.f13094L.m15533i(this.f13101g, this.f13097c, this.f13112r);
        }
        this.f13104j = j;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7011d(float[] fArr, long j) {
        long j2 = this.f13103i;
        if (j2 != 0) {
            float f = (j - j2) * 1.0E-9f;
            if (f > 0.04f) {
                f = this.f13108n ? this.f13105k : 0.01f;
            } else if (this.f13106l) {
                this.f13105k = (this.f13105k * 0.95f) + (0.050000012f * f);
                int i = this.f13107m + 1;
                this.f13107m = i;
                if (i > 10.0f) {
                    this.f13108n = true;
                }
            } else {
                this.f13105k = f;
                this.f13107m = 1;
                this.f13106l = true;
            }
            float f2 = -f;
            this.f13099e.m11519g(fArr[0] * f2, fArr[1] * f2, fArr[2] * f2);
            ljf.m15523j(this.f13099e, this.f13113s);
            this.f13084B.m13109s(this.f13112r);
            jfs.m13068q(this.f13113s, this.f13112r, this.f13084B);
            this.f13112r.m13109s(this.f13084B);
            m7007i();
            this.f13085C.m13109s(this.f13115u);
            Object obj = this.f13085C.f33914a;
            double d = ((double[]) obj)[0];
            double d2 = f * f;
            Double.isNaN(d2);
            ((double[]) obj)[0] = d * d2;
            double d3 = ((double[]) obj)[1];
            Double.isNaN(d2);
            ((double[]) obj)[1] = d3 * d2;
            double d4 = ((double[]) obj)[2];
            Double.isNaN(d2);
            ((double[]) obj)[2] = d4 * d2;
            double d5 = ((double[]) obj)[3];
            Double.isNaN(d2);
            ((double[]) obj)[3] = d5 * d2;
            double d6 = ((double[]) obj)[4];
            Double.isNaN(d2);
            ((double[]) obj)[4] = d6 * d2;
            double d7 = ((double[]) obj)[5];
            Double.isNaN(d2);
            ((double[]) obj)[5] = d7 * d2;
            double d8 = ((double[]) obj)[6];
            Double.isNaN(d2);
            ((double[]) obj)[6] = d8 * d2;
            double d9 = ((double[]) obj)[7];
            Double.isNaN(d2);
            ((double[]) obj)[7] = d9 * d2;
            double d10 = ((double[]) obj)[8];
            Double.isNaN(d2);
            ((double[]) obj)[8] = d10 * d2;
            Object obj2 = this.f13114t.f33914a;
            ((double[]) obj2)[0] = ((double[]) obj2)[0] + ((double[]) obj)[0];
            ((double[]) obj2)[1] = ((double[]) obj2)[1] + ((double[]) obj)[1];
            ((double[]) obj2)[2] = ((double[]) obj2)[2] + ((double[]) obj)[2];
            ((double[]) obj2)[3] = ((double[]) obj2)[3] + ((double[]) obj)[3];
            ((double[]) obj2)[4] = ((double[]) obj2)[4] + ((double[]) obj)[4];
            ((double[]) obj2)[5] = ((double[]) obj2)[5] + ((double[]) obj)[5];
            ((double[]) obj2)[6] = ((double[]) obj2)[6] + ((double[]) obj)[6];
            ((double[]) obj2)[7] = ((double[]) obj2)[7] + ((double[]) obj)[7];
            ((double[]) obj2)[8] = ((double[]) obj2)[8] + ((double[]) obj)[8];
        }
        this.f13103i = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m7012e() {
        this.f13103i = 0L;
        this.f13104j = 0L;
        this.f13112r.m13105k();
        this.f13113s.m13105k();
        this.f13114t.m13107m();
        this.f13114t.m13106l(25.0d);
        this.f13115u.m13107m();
        this.f13115u.m13106l(1.0d);
        this.f13116v.m13107m();
        this.f13116v.m13106l(0.0625d);
        this.f13117w.m13107m();
        this.f13117w.m13106l(0.5625d);
        this.f13118x.m13107m();
        this.f13119y.m13107m();
        this.f13120z.m13107m();
        this.f13096b.m11520h();
        this.f13097c.m11520h();
        this.f13098d.m11520h();
        this.f13099e.m11520h();
        this.f13100f.m11520h();
        this.f13101g.m11519g(0.0d, 0.0d, 9.81d);
        this.f13102h.m11519g(0.0d, 1.0d, 0.0d);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m7013f(double d) {
        double dM7009a = ((d - m7009a()) / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(dM7009a);
        double dCos = Math.cos(dM7009a);
        double[] dArr = {dCos, -dSin, 0.0d};
        double[] dArr2 = {0.0d, 0.0d, 1.0d};
        double[][] dArr3 = {dArr, new double[]{dSin, dCos, 0.0d}, dArr2};
        this.f13083A.m13103i(dArr[0], dArr[1], dArr[2], dSin, dCos, 0.0d, dArr2[0], dArr2[1], dArr2[2]);
        jfs jfsVar = this.f13112r;
        jfs.m13068q(jfsVar, this.f13083A, jfsVar);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7014g() {
        return this.f13104j != 0;
    }

    /* JADX INFO: renamed from: h */
    public final double[] m7015h() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.f13095a[(i2 * 4) + i] = this.f13112r.m13101g(i, i2);
            }
        }
        double[] dArr = this.f13095a;
        dArr[11] = 0.0d;
        dArr[7] = 0.0d;
        dArr[3] = 0.0d;
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[15] = 1.0d;
        return dArr;
    }
}
