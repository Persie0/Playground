package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: yc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1141yc {

    /* JADX INFO: renamed from: b */
    public static C1142yd f48062b;

    /* JADX INFO: renamed from: f */
    C1140yb[] f48067f;

    /* JADX INFO: renamed from: k */
    public final AmbientDelegate f48072k;

    /* JADX INFO: renamed from: s */
    private final C1140yb f48079s;

    /* JADX INFO: renamed from: t */
    private C1140yb f48080t;

    /* JADX INFO: renamed from: a */
    public static boolean f48061a = false;

    /* JADX INFO: renamed from: l */
    private static int f48064l = 1000;

    /* JADX INFO: renamed from: c */
    public static long f48063c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f48065d = false;

    /* JADX INFO: renamed from: e */
    public int f48066e = 0;

    /* JADX INFO: renamed from: m */
    private int f48073m = 32;

    /* JADX INFO: renamed from: n */
    private int f48074n = 32;

    /* JADX INFO: renamed from: g */
    public boolean f48068g = false;

    /* JADX INFO: renamed from: h */
    public boolean f48069h = false;

    /* JADX INFO: renamed from: o */
    private boolean[] f48075o = new boolean[32];

    /* JADX INFO: renamed from: i */
    int f48070i = 1;

    /* JADX INFO: renamed from: j */
    public int f48071j = 0;

    /* JADX INFO: renamed from: p */
    private int f48076p = 32;

    /* JADX INFO: renamed from: q */
    private C1146yh[] f48077q = new C1146yh[f48064l];

    /* JADX INFO: renamed from: r */
    private int f48078r = 0;

    public C1141yc() {
        this.f48067f = null;
        this.f48067f = new C1140yb[32];
        m19619t();
        AmbientDelegate ambientDelegate = new AmbientDelegate();
        this.f48072k = ambientDelegate;
        this.f48079s = new C1145yg(ambientDelegate, null, null);
        this.f48080t = new C1140yb(ambientDelegate, null, null);
    }

    /* JADX INFO: renamed from: o */
    public static final int m19615o(Object obj) {
        C1146yh c1146yh = ((C1151ym) obj).f48184i;
        if (c1146yh != null) {
            return (int) (c1146yh.f48132f + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    private final void m19617r() {
        for (int i = 0; i < this.f48071j; i++) {
            C1140yb c1140yb = this.f48067f[i];
            c1140yb.f48056a.f48132f = c1140yb.f48057b;
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m19618s() {
        int i = this.f48073m;
        int i2 = i + i;
        this.f48073m = i2;
        this.f48067f = (C1140yb[]) Arrays.copyOf(this.f48067f, i2);
        AmbientDelegate ambientDelegate = this.f48072k;
        ambientDelegate.f1685a = (C1146yh[]) Arrays.copyOf((Object[]) ambientDelegate.f1685a, this.f48073m);
        int i3 = this.f48073m;
        this.f48075o = new boolean[i3];
        this.f48074n = i3;
        this.f48076p = i3;
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48096f++;
            c1142yd.f48107q = Math.max(c1142yd.f48107q, i3);
            C1142yd c1142yd2 = f48062b;
            c1142yd2.f48116z = c1142yd2.f48107q;
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m19619t() {
        for (int i = 0; i < this.f48071j; i++) {
            C1140yb c1140yb = this.f48067f[i];
            if (c1140yb != null) {
                ((msg) this.f48072k.f1687c).m16865d(c1140yb);
            }
            this.f48067f[i] = null;
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m19620u(C1140yb c1140yb) {
        int i;
        long j;
        C1139ya c1139ya;
        int i2;
        C1142yd c1142yd = f48062b;
        long j2 = 1;
        int i3 = 0;
        if (c1142yd != null) {
            c1142yd.f48100j++;
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.f48070i) {
            this.f48075o[i] = false;
            i++;
        }
        boolean z = false;
        int i4 = 0;
        while (!z) {
            C1142yd c1142yd2 = f48062b;
            if (c1142yd2 != null) {
                c1142yd2.f48101k += j2;
            }
            int i5 = 1;
            i4++;
            int i6 = this.f48070i;
            if (i4 >= i6 + i6) {
                return;
            }
            C1146yh c1146yh = c1140yb.f48056a;
            if (c1146yh != null) {
                this.f48075o[c1146yh.f48129c] = true;
            }
            C1146yh c1146yhMo19614k = c1140yb.mo19614k(this.f48075o);
            if (c1146yhMo19614k != null) {
                boolean[] zArr = this.f48075o;
                int i7 = c1146yhMo19614k.f48129c;
                if (zArr[i7]) {
                    return;
                } else {
                    zArr[i7] = true;
                }
            }
            if (c1146yhMo19614k != null) {
                float f = Float.MAX_VALUE;
                int i8 = 0;
                int i9 = -1;
                while (i8 < this.f48071j) {
                    C1140yb c1140yb2 = this.f48067f[i8];
                    if (c1140yb2.f48056a.f48140n != i5 && !c1140yb2.f48059d && (i2 = (c1139ya = c1140yb2.f48060e).f48050e) != -1) {
                        while (i2 != -1 && i3 < c1139ya.f48046a) {
                            if (c1139ya.f48047b[i2] == c1146yhMo19614k.f48129c) {
                                float fM19596a = c1140yb2.f48060e.m19596a(c1146yhMo19614k);
                                if (fM19596a >= 0.0f) {
                                    break;
                                }
                                float f2 = (-c1140yb2.f48057b) / fM19596a;
                                if (f2 >= f) {
                                    break;
                                }
                                f = f2;
                                i9 = i8;
                                break;
                            }
                            i2 = c1139ya.f48048c[i2];
                            i3++;
                        }
                    }
                    i8++;
                    i3 = 0;
                    i5 = 1;
                }
                if (i9 >= 0) {
                    C1140yb c1140yb3 = this.f48067f[i9];
                    c1140yb3.f48056a.f48130d = -1;
                    C1142yd c1142yd3 = f48062b;
                    if (c1142yd3 != null) {
                        j = 1;
                        c1142yd3.f48102l++;
                    } else {
                        j = 1;
                    }
                    c1140yb3.m19605b(c1146yhMo19614k);
                    C1146yh c1146yh2 = c1140yb3.f48056a;
                    c1146yh2.f48130d = i9;
                    c1146yh2.m19643e(this, c1140yb3);
                } else {
                    j = 1;
                }
            } else {
                j = j2;
                z = true;
            }
            j2 = j;
            i3 = 0;
        }
    }

    /* JADX INFO: renamed from: v */
    private final C1146yh m19621v(int i) {
        C1146yh c1146yh = (C1146yh) ((msg) this.f48072k.f1686b).m16864c();
        if (c1146yh == null) {
            c1146yh = new C1146yh(i);
            c1146yh.f48140n = i;
        } else {
            c1146yh.m19641c();
            c1146yh.f48140n = i;
        }
        int i2 = this.f48078r;
        int i3 = f48064l;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            f48064l = i4;
            this.f48077q = (C1146yh[]) Arrays.copyOf(this.f48077q, i4);
        }
        C1146yh[] c1146yhArr = this.f48077q;
        int i5 = this.f48078r;
        this.f48078r = i5 + 1;
        c1146yhArr[i5] = c1146yh;
        return c1146yh;
    }

    /* JADX INFO: renamed from: a */
    public final C1140yb m19622a() {
        C1140yb c1140yb = (C1140yb) ((msg) this.f48072k.f1687c).m16864c();
        if (c1140yb == null) {
            c1140yb = new C1140yb(this.f48072k, null, null);
            f48063c++;
        } else {
            c1140yb.f48056a = null;
            c1140yb.f48060e.m19601f();
            c1140yb.f48057b = 0.0f;
            c1140yb.f48059d = false;
        }
        C1146yh.f48127a++;
        return c1140yb;
    }

    /* JADX INFO: renamed from: b */
    public final C1146yh m19623b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f48070i + 1 >= this.f48074n) {
            m19618s();
        }
        C1151ym c1151ym = (C1151ym) obj;
        C1146yh c1146yh = c1151ym.f48184i;
        if (c1146yh == null) {
            c1151ym.m19658i();
            c1146yh = c1151ym.f48184i;
        }
        int i = c1146yh.f48129c;
        if (i == -1) {
            int i2 = this.f48066e + 1;
            this.f48066e = i2;
            this.f48070i++;
            c1146yh.f48129c = i2;
            c1146yh.f48140n = 1;
            ((C1146yh[]) this.f48072k.f1685a)[i2] = c1146yh;
        } else if (i > this.f48066e || ((C1146yh[]) this.f48072k.f1685a)[i] == null) {
            if (i != -1) {
                c1146yh.m19641c();
            }
            int i3 = this.f48066e + 1;
            this.f48066e = i3;
            this.f48070i++;
            c1146yh.f48129c = i3;
            c1146yh.f48140n = 1;
            ((C1146yh[]) this.f48072k.f1685a)[i3] = c1146yh;
        }
        return c1146yh;
    }

    /* JADX INFO: renamed from: c */
    public final C1146yh m19624c() {
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48105o++;
        }
        if (this.f48070i + 1 >= this.f48074n) {
            m19618s();
        }
        C1146yh c1146yhM19621v = m19621v(3);
        int i = this.f48066e + 1;
        this.f48066e = i;
        this.f48070i++;
        c1146yhM19621v.f48129c = i;
        ((C1146yh[]) this.f48072k.f1685a)[i] = c1146yhM19621v;
        return c1146yhM19621v;
    }

    /* JADX INFO: renamed from: d */
    public final void m19625d(C1146yh c1146yh, C1146yh c1146yh2, int i, float f, C1146yh c1146yh3, C1146yh c1146yh4, int i2, int i3) {
        C1140yb c1140ybM19622a = m19622a();
        if (c1146yh2 == c1146yh3) {
            c1140ybM19622a.f48060e.m19602g(c1146yh, 1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh4, 1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh2, -2.0f);
        } else if (f == 0.5f) {
            c1140ybM19622a.f48060e.m19602g(c1146yh, 1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh2, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh3, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh4, 1.0f);
            if (i > 0 || i2 > 0) {
                c1140ybM19622a.f48057b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c1140ybM19622a.f48060e.m19602g(c1146yh, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh2, 1.0f);
            c1140ybM19622a.f48057b = i;
        } else if (f >= 1.0f) {
            c1140ybM19622a.f48060e.m19602g(c1146yh4, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh3, 1.0f);
            c1140ybM19622a.f48057b = -i2;
        } else {
            float f2 = 1.0f - f;
            c1140ybM19622a.f48060e.m19602g(c1146yh, f2);
            c1140ybM19622a.f48060e.m19602g(c1146yh2, -f2);
            c1140ybM19622a.f48060e.m19602g(c1146yh3, -f);
            c1140ybM19622a.f48060e.m19602g(c1146yh4, f);
            if (i > 0 || i2 > 0) {
                c1140ybM19622a.f48057b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            c1140ybM19622a.m19609f(this, i3);
        }
        m19626e(c1140ybM19622a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
    /* JADX INFO: renamed from: e */
    public final void m19626e(C1140yb c1140yb) {
        boolean z;
        boolean z2;
        C1146yh c1146yhM19604a;
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48098h++;
            if (c1140yb.f48059d) {
                c1142yd.f48099i++;
            }
        }
        if (this.f48071j + 1 >= this.f48076p || this.f48070i + 1 >= this.f48074n) {
            m19618s();
        }
        if (!c1140yb.f48059d) {
            if (this.f48067f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = c1140yb.f48060e.f48046a;
                    for (int i2 = 0; i2 < i; i2++) {
                        C1146yh c1146yhM19599d = c1140yb.f48060e.m19599d(i2);
                        if (c1146yhM19599d.f48130d != -1 || c1146yhM19599d.f48133g) {
                            c1140yb.f48058c.add(c1146yhM19599d);
                        } else {
                            boolean z4 = c1146yhM19599d.f48139m;
                        }
                    }
                    int size = c1140yb.f48058c.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            C1146yh c1146yh = (C1146yh) c1140yb.f48058c.get(i3);
                            if (c1146yh.f48133g) {
                                c1140yb.m19606c(this, c1146yh, true);
                            } else {
                                boolean z5 = c1146yh.f48139m;
                                c1140yb.mo19607d(this, this.f48067f[c1146yh.f48130d], true);
                            }
                        }
                        c1140yb.f48058c.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c1140yb.f48056a != null && c1140yb.f48060e.f48046a == 0) {
                    c1140yb.f48059d = true;
                    this.f48065d = true;
                }
            }
            if (c1140yb.mo19608e()) {
                return;
            }
            float f = c1140yb.f48057b;
            if (f < 0.0f) {
                c1140yb.f48057b = -f;
                C1139ya c1139ya = c1140yb.f48060e;
                int i4 = c1139ya.f48050e;
                for (int i5 = 0; i4 != -1 && i5 < c1139ya.f48046a; i5++) {
                    float[] fArr = c1139ya.f48049d;
                    fArr[i4] = -fArr[i4];
                    i4 = c1139ya.f48048c[i4];
                }
            }
            int i6 = c1140yb.f48060e.f48046a;
            C1146yh c1146yh2 = null;
            C1146yh c1146yh3 = null;
            float f2 = 0.0f;
            boolean zM19603l = false;
            float f3 = 0.0f;
            boolean zM19603l2 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                float fM19597b = c1140yb.f48060e.m19597b(i7);
                C1146yh c1146yhM19599d2 = c1140yb.f48060e.m19599d(i7);
                if (c1146yhM19599d2.f48140n == 1) {
                    if (c1146yh2 == null) {
                        zM19603l = C1140yb.m19603l(c1146yhM19599d2);
                        c1146yh2 = c1146yhM19599d2;
                        f2 = fM19597b;
                    } else if (f2 > fM19597b) {
                        zM19603l = C1140yb.m19603l(c1146yhM19599d2);
                        c1146yh2 = c1146yhM19599d2;
                        f2 = fM19597b;
                    } else if (!zM19603l && C1140yb.m19603l(c1146yhM19599d2)) {
                        c1146yh2 = c1146yhM19599d2;
                        f2 = fM19597b;
                        zM19603l = true;
                    }
                } else if (c1146yh2 == null && fM19597b < 0.0f) {
                    if (c1146yh3 == null) {
                        zM19603l2 = C1140yb.m19603l(c1146yhM19599d2);
                        c1146yh3 = c1146yhM19599d2;
                        f3 = fM19597b;
                    } else if (f3 > fM19597b) {
                        zM19603l2 = C1140yb.m19603l(c1146yhM19599d2);
                        c1146yh3 = c1146yhM19599d2;
                        f3 = fM19597b;
                    } else if (!zM19603l2 && C1140yb.m19603l(c1146yhM19599d2)) {
                        c1146yh3 = c1146yhM19599d2;
                        f3 = fM19597b;
                        zM19603l2 = true;
                    }
                }
            }
            if (c1146yh2 == null) {
                c1146yh2 = c1146yh3;
            }
            if (c1146yh2 == null) {
                z = true;
            } else {
                c1140yb.m19605b(c1146yh2);
                z = false;
            }
            if (c1140yb.f48060e.f48046a == 0) {
                c1140yb.f48059d = true;
            }
            if (z) {
                C1142yd c1142yd2 = f48062b;
                if (c1142yd2 != null) {
                    c1142yd2.f48106p++;
                }
                if (this.f48070i + 1 >= this.f48074n) {
                    m19618s();
                }
                C1146yh c1146yhM19621v = m19621v(3);
                int i8 = this.f48066e + 1;
                this.f48066e = i8;
                this.f48070i++;
                c1146yhM19621v.f48129c = i8;
                ((C1146yh[]) this.f48072k.f1685a)[i8] = c1146yhM19621v;
                c1140yb.f48056a = c1146yhM19621v;
                int i9 = this.f48071j;
                m19616q(c1140yb);
                if (this.f48071j == i9 + 1) {
                    C1140yb c1140yb2 = this.f48080t;
                    c1140yb2.f48056a = null;
                    c1140yb2.f48060e.m19601f();
                    int i10 = 0;
                    while (true) {
                        C1139ya c1139ya2 = c1140yb.f48060e;
                        if (i10 >= c1139ya2.f48046a) {
                            break;
                        }
                        c1140yb2.f48060e.m19600e(c1139ya2.m19599d(i10), c1140yb.f48060e.m19597b(i10), true);
                        i10++;
                    }
                    m19620u(this.f48080t);
                    if (c1146yhM19621v.f48130d == -1) {
                        if (c1140yb.f48056a == c1146yhM19621v && (c1146yhM19604a = c1140yb.m19604a(null, c1146yhM19621v)) != null) {
                            C1142yd c1142yd3 = f48062b;
                            if (c1142yd3 != null) {
                                c1142yd3.f48102l++;
                            }
                            c1140yb.m19605b(c1146yhM19604a);
                        }
                        if (!c1140yb.f48059d) {
                            c1140yb.f48056a.m19643e(this, c1140yb);
                        }
                        ((msg) this.f48072k.f1687c).m16865d(c1140yb);
                        this.f48071j--;
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            C1146yh c1146yh4 = c1140yb.f48056a;
            if (c1146yh4 == null) {
                return;
            }
            if ((c1146yh4.f48140n != 1 && c1140yb.f48057b < 0.0f) || z2) {
                return;
            }
        }
        m19616q(c1140yb);
    }

    /* JADX INFO: renamed from: f */
    public final void m19627f(C1146yh c1146yh, int i) {
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48090J++;
        }
        int i2 = c1146yh.f48130d;
        if (i2 == -1) {
            c1146yh.m19642d(this, i);
            for (int i3 = 0; i3 < this.f48066e + 1; i3++) {
                C1146yh c1146yh2 = ((C1146yh[]) this.f48072k.f1685a)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1140yb c1140ybM19622a = m19622a();
            c1140ybM19622a.f48056a = c1146yh;
            float f = i;
            c1146yh.f48132f = f;
            c1140ybM19622a.f48057b = f;
            c1140ybM19622a.f48059d = true;
            m19626e(c1140ybM19622a);
            return;
        }
        C1140yb c1140yb = this.f48067f[i2];
        if (c1140yb.f48059d) {
            c1140yb.f48057b = i;
            return;
        }
        if (c1140yb.f48060e.f48046a == 0) {
            c1140yb.f48059d = true;
            c1140yb.f48057b = i;
            return;
        }
        C1140yb c1140ybM19622a2 = m19622a();
        if (i < 0) {
            c1140ybM19622a2.f48057b = -i;
            c1140ybM19622a2.f48060e.m19602g(c1146yh, 1.0f);
        } else {
            c1140ybM19622a2.f48057b = i;
            c1140ybM19622a2.f48060e.m19602g(c1146yh, -1.0f);
        }
        m19626e(c1140ybM19622a2);
    }

    /* JADX INFO: renamed from: g */
    public final void m19628g(C1146yh c1146yh, C1146yh c1146yh2, int i, int i2) {
        C1140yb c1140ybM19622a = m19622a();
        C1146yh c1146yhM19624c = m19624c();
        c1146yhM19624c.f48131e = 0;
        c1140ybM19622a.m19611h(c1146yh, c1146yh2, c1146yhM19624c, i);
        if (i2 != 8) {
            m19630i(c1140ybM19622a, (int) (-c1140ybM19622a.f48060e.m19596a(c1146yhM19624c)), i2);
        }
        m19626e(c1140ybM19622a);
    }

    /* JADX INFO: renamed from: h */
    public final void m19629h(C1146yh c1146yh, C1146yh c1146yh2, int i, int i2) {
        C1140yb c1140ybM19622a = m19622a();
        C1146yh c1146yhM19624c = m19624c();
        c1146yhM19624c.f48131e = 0;
        c1140ybM19622a.m19612i(c1146yh, c1146yh2, c1146yhM19624c, i);
        if (i2 != 8) {
            m19630i(c1140ybM19622a, (int) (-c1140ybM19622a.f48060e.m19596a(c1146yhM19624c)), i2);
        }
        m19626e(c1140ybM19622a);
    }

    /* JADX INFO: renamed from: i */
    final void m19630i(C1140yb c1140yb, int i, int i2) {
        c1140yb.f48060e.m19602g(m19636p(i2), i);
    }

    /* JADX INFO: renamed from: j */
    public final void m19631j() {
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48097g++;
        }
        C1140yb c1140yb = this.f48079s;
        if (c1140yb.mo19608e()) {
            m19617r();
            return;
        }
        if (!this.f48069h) {
            m19633l(c1140yb);
            return;
        }
        if (c1142yd != null) {
            c1142yd.f48109s++;
        }
        for (int i = 0; i < this.f48071j; i++) {
            if (!this.f48067f[i].f48059d) {
                m19633l(this.f48079s);
                return;
            }
        }
        C1142yd c1142yd2 = f48062b;
        if (c1142yd2 != null) {
            c1142yd2.f48108r++;
        }
        m19617r();
    }

    /* JADX INFO: renamed from: k */
    public final void m19632k() {
        AmbientDelegate ambientDelegate;
        int i = 0;
        while (true) {
            ambientDelegate = this.f48072k;
            C1146yh[] c1146yhArr = (C1146yh[]) ambientDelegate.f1685a;
            if (i >= c1146yhArr.length) {
                break;
            }
            C1146yh c1146yh = c1146yhArr[i];
            if (c1146yh != null) {
                c1146yh.m19641c();
            }
            i++;
        }
        Object obj = ambientDelegate.f1686b;
        C1146yh[] c1146yhArr2 = this.f48077q;
        int i2 = this.f48078r;
        int length = c1146yhArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1146yh c1146yh2 = c1146yhArr2[i3];
            msg msgVar = (msg) obj;
            int i4 = msgVar.f41540a;
            if (i4 < 256) {
                ((Object[]) msgVar.f41541b)[i4] = c1146yh2;
                msgVar.f41540a = i4 + 1;
            }
        }
        this.f48078r = 0;
        Arrays.fill((Object[]) this.f48072k.f1685a, (Object) null);
        this.f48066e = 0;
        C1145yg c1145yg = (C1145yg) this.f48079s;
        c1145yg.f48123f = 0;
        c1145yg.f48057b = 0.0f;
        this.f48070i = 1;
        for (int i5 = 0; i5 < this.f48071j; i5++) {
            C1140yb c1140yb = this.f48067f[i5];
        }
        m19619t();
        this.f48071j = 0;
        this.f48080t = new C1140yb(this.f48072k, null, null);
    }

    /* JADX INFO: renamed from: l */
    final void m19633l(C1140yb c1140yb) {
        long j;
        boolean z;
        C1142yd c1142yd = f48062b;
        long j2 = 1;
        if (c1142yd != null) {
            c1142yd.f48112v++;
            c1142yd.f48113w = Math.max(c1142yd.f48113w, this.f48070i);
            C1142yd c1142yd2 = f48062b;
            c1142yd2.f48114x = Math.max(c1142yd2.f48114x, this.f48071j);
        }
        int i = 0;
        while (i < this.f48071j) {
            C1140yb c1140yb2 = this.f48067f[i];
            int i2 = 1;
            if (c1140yb2.f48056a.f48140n != 1) {
                float f = 0.0f;
                if (c1140yb2.f48057b < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        C1142yd c1142yd3 = f48062b;
                        if (c1142yd3 != null) {
                            c1142yd3.f48103m += j2;
                        }
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (i4 < this.f48071j) {
                            C1140yb c1140yb3 = this.f48067f[i4];
                            if (c1140yb3.f48056a.f48140n != i2 && !c1140yb3.f48059d && c1140yb3.f48057b < f) {
                                int i8 = c1140yb3.f48060e.f48046a;
                                int i9 = 0;
                                while (i9 < i8) {
                                    C1146yh c1146yhM19599d = c1140yb3.f48060e.m19599d(i9);
                                    float fM19596a = c1140yb3.f48060e.m19596a(c1146yhM19599d);
                                    if (fM19596a > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = c1146yhM19599d.f48134h[i10] / fM19596a;
                                            if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                                i6 = c1146yhM19599d.f48129c;
                                                f2 = f3;
                                                i7 = i10;
                                                i5 = i4;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i4++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i5 != -1) {
                            C1140yb c1140yb4 = this.f48067f[i5];
                            c1140yb4.f48056a.f48130d = -1;
                            C1142yd c1142yd4 = f48062b;
                            if (c1142yd4 != null) {
                                j = 1;
                                c1142yd4.f48102l++;
                            } else {
                                j = 1;
                            }
                            c1140yb4.m19605b(((C1146yh[]) this.f48072k.f1685a)[i6]);
                            C1146yh c1146yh = c1140yb4.f48056a;
                            c1146yh.f48130d = i5;
                            c1146yh.m19643e(this, c1140yb4);
                            z = false;
                        } else {
                            j = 1;
                            z = true;
                        }
                        z2 = (!(i3 <= this.f48070i / 2)) | z;
                        j2 = j;
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
            i++;
            j2 = j2;
        }
        m19620u(c1140yb);
        m19617r();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX INFO: renamed from: m */
    public final void m19634m(C1146yh c1146yh, C1146yh c1146yh2, int i, int i2) {
        boolean z;
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48090J++;
        }
        if (i2 == 8) {
            if (c1146yh2.f48133g && c1146yh.f48130d == -1) {
                c1146yh.m19642d(this, c1146yh2.f48132f + i);
                return;
            }
            i2 = 8;
        }
        C1140yb c1140ybM19622a = m19622a();
        if (i == 0) {
            c1140ybM19622a.f48060e.m19602g(c1146yh, -1.0f);
            c1140ybM19622a.f48060e.m19602g(c1146yh2, 1.0f);
        } else {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            c1140ybM19622a.f48057b = i;
            if (z) {
                c1140ybM19622a.f48060e.m19602g(c1146yh, 1.0f);
                c1140ybM19622a.f48060e.m19602g(c1146yh2, -1.0f);
            } else {
                c1140ybM19622a.f48060e.m19602g(c1146yh, -1.0f);
                c1140ybM19622a.f48060e.m19602g(c1146yh2, 1.0f);
            }
        }
        if (i2 != 8) {
            c1140ybM19622a.m19609f(this, i2);
        }
        m19626e(c1140ybM19622a);
    }

    /* JADX INFO: renamed from: n */
    public final void m19635n(C1146yh c1146yh, C1146yh c1146yh2, C1146yh c1146yh3, C1146yh c1146yh4, float f) {
        C1140yb c1140ybM19622a = m19622a();
        c1140ybM19622a.m19610g(c1146yh, c1146yh2, c1146yh3, c1146yh4, f);
        m19626e(c1140ybM19622a);
    }

    /* JADX INFO: renamed from: p */
    public final C1146yh m19636p(int i) {
        C1142yd c1142yd = f48062b;
        if (c1142yd != null) {
            c1142yd.f48104n++;
        }
        if (this.f48070i + 1 >= this.f48074n) {
            m19618s();
        }
        C1146yh c1146yhM19621v = m19621v(4);
        int i2 = this.f48066e + 1;
        this.f48066e = i2;
        this.f48070i++;
        c1146yhM19621v.f48129c = i2;
        c1146yhM19621v.f48131e = i;
        ((C1146yh[]) this.f48072k.f1685a)[i2] = c1146yhM19621v;
        C1145yg c1145yg = (C1145yg) this.f48079s;
        C1144yf c1144yf = c1145yg.f48124g;
        c1144yf.f48121a = c1146yhM19621v;
        Arrays.fill(c1144yf.f48121a.f48135i, 0.0f);
        c1146yhM19621v.f48135i[c1146yhM19621v.f48131e] = 1.0f;
        c1145yg.m19637m(c1146yhM19621v);
        return c1146yhM19621v;
    }

    /* JADX INFO: renamed from: q */
    private final void m19616q(C1140yb c1140yb) {
        int i;
        if (c1140yb.f48059d) {
            c1140yb.f48056a.m19642d(this, c1140yb.f48057b);
        } else {
            C1140yb[] c1140ybArr = this.f48067f;
            int i2 = this.f48071j;
            c1140ybArr[i2] = c1140yb;
            C1146yh c1146yh = c1140yb.f48056a;
            c1146yh.f48130d = i2;
            this.f48071j = i2 + 1;
            c1146yh.m19643e(this, c1140yb);
        }
        if (this.f48065d) {
            int i3 = 0;
            while (i3 < this.f48071j) {
                if (this.f48067f[i3] == null) {
                    System.out.println("WTF");
                }
                C1140yb c1140yb2 = this.f48067f[i3];
                if (c1140yb2 != null && c1140yb2.f48059d) {
                    c1140yb2.f48056a.m19642d(this, c1140yb2.f48057b);
                    ((msg) this.f48072k.f1687c).m16865d(c1140yb2);
                    this.f48067f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f48071j;
                        if (i4 >= i) {
                            break;
                        }
                        C1140yb[] c1140ybArr2 = this.f48067f;
                        int i6 = i4 - 1;
                        C1140yb c1140yb3 = c1140ybArr2[i4];
                        c1140ybArr2[i6] = c1140yb3;
                        C1146yh c1146yh2 = c1140yb3.f48056a;
                        if (c1146yh2.f48130d == i4) {
                            c1146yh2.f48130d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f48067f[i5] = null;
                    }
                    this.f48071j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f48065d = false;
        }
    }
}
