package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class em9 {

    /* JADX INFO: renamed from: A */
    public vi0 f37471A;

    /* JADX INFO: renamed from: B */
    public long f37472B;

    /* JADX INFO: renamed from: C */
    public vi0 f37473C;

    /* JADX INFO: renamed from: D */
    public boolean f37474D;

    /* JADX INFO: renamed from: E */
    public o39 f37475E;

    /* JADX INFO: renamed from: F */
    public Object f37476F;

    /* JADX INFO: renamed from: G */
    public Object f37477G;

    /* JADX INFO: renamed from: H */
    public float f37478H;

    /* JADX INFO: renamed from: I */
    public float f37479I;

    /* JADX INFO: renamed from: J */
    public float f37480J;

    /* JADX INFO: renamed from: K */
    public float f37481K;

    /* JADX INFO: renamed from: L */
    public float f37482L;

    /* JADX INFO: renamed from: M */
    public float f37483M;

    /* JADX INFO: renamed from: N */
    public float f37484N;

    /* JADX INFO: renamed from: O */
    public float f37485O;

    /* JADX INFO: renamed from: P */
    public float f37486P;

    /* JADX INFO: renamed from: Q */
    public float f37487Q;

    /* JADX INFO: renamed from: R */
    public float f37488R;

    /* JADX INFO: renamed from: S */
    public float f37489S;

    /* JADX INFO: renamed from: T */
    public fa1 f37490T;

    /* JADX INFO: renamed from: U */
    public long f37491U;

    /* JADX INFO: renamed from: V */
    public vi0 f37492V;

    /* JADX INFO: renamed from: W */
    public ax9 f37493W;

    /* JADX INFO: renamed from: X */
    public aw9 f37494X;

    /* JADX INFO: renamed from: Y */
    public long f37495Y;

    /* JADX INFO: renamed from: Z */
    public long f37496Z;

    /* JADX INFO: renamed from: a */
    public long f37497a;

    /* JADX INFO: renamed from: a0 */
    public long f37498a0;

    /* JADX INFO: renamed from: b */
    public int f37499b;

    /* JADX INFO: renamed from: b0 */
    public float f37500b0;

    /* JADX INFO: renamed from: c */
    public float f37501c;

    /* JADX INFO: renamed from: c0 */
    public int f37502c0;

    /* JADX INFO: renamed from: d */
    public float f37503d;

    /* JADX INFO: renamed from: e */
    public float f37504e;

    /* JADX INFO: renamed from: f */
    public float f37505f;

    /* JADX INFO: renamed from: g */
    public float f37506g;

    /* JADX INFO: renamed from: h */
    public float f37507h;

    /* JADX INFO: renamed from: i */
    public float f37508i;

    /* JADX INFO: renamed from: j */
    public float f37509j;

    /* JADX INFO: renamed from: k */
    public float f37510k;

    /* JADX INFO: renamed from: p */
    public float f37515p;

    /* JADX INFO: renamed from: q */
    public float f37516q;

    /* JADX INFO: renamed from: r */
    public float f37517r;

    /* JADX INFO: renamed from: s */
    public float f37518s;

    /* JADX INFO: renamed from: y */
    public vi0 f37524y;

    /* JADX INFO: renamed from: l */
    public float f37511l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f37512m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f37513n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f37514o = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f37519t = Float.NaN;

    /* JADX INFO: renamed from: u */
    public float f37520u = Float.NaN;

    /* JADX INFO: renamed from: v */
    public float f37521v = Float.NaN;

    /* JADX INFO: renamed from: w */
    public float f37522w = Float.NaN;

    /* JADX INFO: renamed from: x */
    public long f37523x = aa1.f403b;

    /* JADX INFO: renamed from: z */
    public long f37525z = aa1.f411j;

    public em9() {
        long j = aa1.f412k;
        this.f37472B = j;
        this.f37475E = ss5.f61356d;
        this.f37478H = 1.0f;
        this.f37479I = 1.0f;
        this.f37480J = 1.0f;
        long j2 = k9a.f46915b;
        this.f37486P = Float.intBitsToFloat((int) (j2 >> 32));
        this.f37487Q = Float.intBitsToFloat((int) (j2 & 4294967295L));
        this.f37488R = 1.0f;
        this.f37491U = j;
        this.f37493W = ax9.f7649c;
        long j3 = zx9.f72359c;
        this.f37495Y = j3;
        this.f37496Z = j3;
        this.f37498a0 = j3;
        this.f37500b0 = Float.NaN;
    }

    /* JADX INFO: renamed from: y */
    public static final void m11230y(ArrayList arrayList, String str, Object obj) {
        arrayList.add(new xna(obj, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m11231a(vi0 vi0Var) {
        this.f37497a &= -17179869185L;
        int i = this.f37499b;
        this.f37499b = vi0Var != null ? i | 2 : i & (-3);
        this.f37471A = vi0Var;
        int i2 = aa1.f413l;
        this.f37525z = aa1.f412k;
    }

    /* JADX INFO: renamed from: b */
    public final void m11232b(long j) {
        this.f37497a |= 17179869184L;
        this.f37499b &= -3;
        this.f37525z = j;
        this.f37471A = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m11233c(vi0 vi0Var) {
        this.f37497a &= -34359738369L;
        int i = this.f37499b;
        this.f37499b = vi0Var != null ? i | 1 : i & (-2);
        this.f37524y = vi0Var;
        int i2 = aa1.f413l;
        this.f37523x = aa1.f412k;
    }

    /* JADX INFO: renamed from: d */
    public final void m11234d(long j) {
        this.f37497a |= 34359738368L;
        this.f37499b &= -2;
        this.f37523x = j;
        this.f37524y = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m11235e(vi0 vi0Var) {
        this.f37497a &= -137438953473L;
        int i = this.f37499b;
        this.f37499b = vi0Var != null ? i | 128 : i & (-129);
        this.f37492V = vi0Var;
        int i2 = aa1.f413l;
        this.f37491U = aa1.f412k;
    }

    /* JADX INFO: renamed from: f */
    public final void m11236f(em9 em9Var) {
        em9Var.f37497a = this.f37497a;
        em9Var.f37499b = this.f37499b;
        em9Var.f37515p = this.f37515p;
        em9Var.f37516q = this.f37516q;
        em9Var.f37517r = this.f37517r;
        em9Var.f37518s = this.f37518s;
        em9Var.f37519t = this.f37519t;
        em9Var.f37520u = this.f37520u;
        em9Var.f37521v = this.f37521v;
        em9Var.f37522w = this.f37522w;
        em9Var.f37501c = this.f37501c;
        em9Var.f37503d = this.f37503d;
        em9Var.f37504e = this.f37504e;
        em9Var.f37505f = this.f37505f;
        em9Var.f37506g = this.f37506g;
        em9Var.f37507h = this.f37507h;
        em9Var.f37508i = this.f37508i;
        em9Var.f37509j = this.f37509j;
        em9Var.f37510k = this.f37510k;
        em9Var.f37475E = this.f37475E;
        em9Var.f37478H = this.f37478H;
        em9Var.f37479I = this.f37479I;
        em9Var.f37480J = this.f37480J;
        em9Var.f37481K = this.f37481K;
        em9Var.f37482L = this.f37482L;
        em9Var.f37483M = this.f37483M;
        em9Var.f37484N = this.f37484N;
        em9Var.f37485O = this.f37485O;
        em9Var.f37486P = this.f37486P;
        em9Var.f37487Q = this.f37487Q;
        em9Var.f37489S = this.f37489S;
        em9Var.f37490T = this.f37490T;
        em9Var.f37488R = this.f37488R;
        em9Var.f37523x = this.f37523x;
        em9Var.f37524y = this.f37524y;
        em9Var.f37525z = this.f37525z;
        em9Var.f37471A = this.f37471A;
        em9Var.f37472B = this.f37472B;
        em9Var.f37473C = this.f37473C;
        em9Var.f37476F = this.f37476F;
        em9Var.f37477G = this.f37477G;
        em9Var.f37474D = this.f37474D;
        em9Var.f37511l = this.f37511l;
        em9Var.f37512m = this.f37512m;
        em9Var.f37513n = this.f37513n;
        em9Var.f37514o = this.f37514o;
        em9Var.f37491U = this.f37491U;
        em9Var.f37492V = this.f37492V;
        em9Var.f37493W = this.f37493W;
        em9Var.f37494X = this.f37494X;
        em9Var.f37495Y = this.f37495Y;
        em9Var.f37496Z = this.f37496Z;
        em9Var.f37498a0 = this.f37498a0;
        em9Var.f37500b0 = this.f37500b0;
        em9Var.f37502c0 = this.f37502c0;
    }

    /* JADX INFO: renamed from: g */
    public final void m11237g(int i) {
        this.f37497a |= 1099511627776L;
        this.f37502c0 = ((i | 2) & 3) | (this.f37502c0 & (-4));
    }

    /* JADX INFO: renamed from: h */
    public final void m11238h(int i) {
        this.f37497a |= 35184372088832L;
        this.f37502c0 = ((i << 10) & 15360) | (this.f37502c0 & (-15361));
    }

    /* JADX INFO: renamed from: i */
    public final void m11239i(bc3 bc3Var) {
        this.f37497a |= 549755813888L;
        this.f37502c0 = ((bc3Var.f8327a << 17) & 134086656) | (this.f37502c0 & (-134086657));
    }

    /* JADX INFO: renamed from: j */
    public final void m11240j(vi0 vi0Var) {
        this.f37497a &= -68719476737L;
        int i = this.f37499b;
        this.f37499b = vi0Var != null ? i | 4 : i & (-5);
        this.f37473C = vi0Var;
        int i2 = aa1.f413l;
        this.f37472B = aa1.f412k;
    }

    /* JADX INFO: renamed from: k */
    public final int m11241k() {
        return ((this.f37497a & 1099511627776L) == 0 || (this.f37502c0 & 1) != 1) ? 0 : 1;
    }

    /* JADX INFO: renamed from: l */
    public final int m11242l() {
        if ((this.f37497a & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.f37502c0 & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            j54.m14288a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final bc3 m11243m() {
        if ((this.f37497a & 549755813888L) != 0) {
            return new bc3((this.f37502c0 & 134086656) >> 17);
        }
        bc3 bc3Var = bc3.f8316b;
        return bc3.f8321g;
    }

    /* JADX INFO: renamed from: n */
    public final int m11244n() {
        if ((this.f37497a & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.f37502c0 & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        j54.m14288a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    /* JADX INFO: renamed from: o */
    public final int m11245o() {
        return fm9.m11940d(this.f37499b) | fm9.m11942f(this.f37497a);
    }

    /* JADX INFO: renamed from: p */
    public final int m11246p() {
        if ((this.f37497a & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.f37502c0 & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        j54.m14288a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    /* JADX INFO: renamed from: q */
    public final rt9 m11247q() {
        int i;
        long j = this.f37497a & 274877906944L;
        rt9 rt9Var = rt9.f59801b;
        if (j == 0 || (i = ((this.f37502c0 & 114688) >> 14) & 3) == 0) {
            return rt9Var;
        }
        if (i != 1) {
            return i != 2 ? new rt9(i) : rt9.f59803d;
        }
        return rt9.f59802c;
    }

    /* JADX INFO: renamed from: r */
    public final int m11248r() {
        if ((this.f37497a & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.f37502c0 & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        j54.m14288a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11249s(byte b) {
        return ((1 << b) & this.f37497a) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11250t(int i) {
        return (this.f37499b & (1 << (i + (-50)))) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m11251u(int i) {
        this.f37497a |= 17592186044416L;
        this.f37502c0 = ((i << 8) & 768) | (this.f37502c0 & (-769));
    }

    /* JADX INFO: renamed from: v */
    public final void m11252v(int i) {
        this.f37497a |= 2199023255552L;
        this.f37502c0 = ((i << 2) & 28) | (this.f37502c0 & (-29));
    }

    /* JADX INFO: renamed from: w */
    public final void m11253w(rt9 rt9Var) {
        this.f37497a |= 274877906944L;
        this.f37502c0 = (((rt9Var.f59804a | 4) << 14) & 114688) | (this.f37502c0 & (-114689));
    }

    /* JADX INFO: renamed from: x */
    public final void m11254x(int i) {
        this.f37497a |= 4398046511104L;
        this.f37502c0 = ((i << 4) & 112) | (this.f37502c0 & (-113));
    }
}
