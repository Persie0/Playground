package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0011ak {

    /* JADX INFO: renamed from: h */
    private static int f567h = 1000;

    /* JADX INFO: renamed from: c */
    public C0009ai[] f570c;

    /* JADX INFO: renamed from: g */
    public final AmbientDelegate f574g;

    /* JADX INFO: renamed from: a */
    int f568a = 0;

    /* JADX INFO: renamed from: b */
    public final C0010aj f569b = new C0010aj();

    /* JADX INFO: renamed from: i */
    private int f575i = 32;

    /* JADX INFO: renamed from: j */
    private int f576j = 32;

    /* JADX INFO: renamed from: d */
    public boolean[] f571d = new boolean[32];

    /* JADX INFO: renamed from: e */
    public int f572e = 1;

    /* JADX INFO: renamed from: f */
    public int f573f = 0;

    /* JADX INFO: renamed from: k */
    private int f577k = 32;

    /* JADX INFO: renamed from: l */
    private C0012al[] f578l = new C0012al[f567h];

    /* JADX INFO: renamed from: m */
    private int f579m = 0;

    /* JADX INFO: renamed from: n */
    private C0009ai[] f580n = new C0009ai[32];

    public C0011ak() {
        this.f570c = null;
        this.f570c = new C0009ai[32];
        m848r();
        this.f574g = new AmbientDelegate((byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static C0009ai m844b(C0011ak c0011ak, C0012al c0012al, C0012al c0012al2, int i, float f, C0012al c0012al3, C0012al c0012al4, int i2, boolean z) {
        C0009ai c0009aiM850a = c0011ak.m850a();
        c0009aiM850a.m720d(c0012al, c0012al2, i, f, c0012al3, c0012al4, i2);
        if (z) {
            C0012al c0012alM851d = c0011ak.m851d();
            C0012al c0012alM851d2 = c0011ak.m851d();
            c0012alM851d.f613c = 4;
            c0012alM851d2.f613c = 4;
            c0009aiM850a.m719c(c0012alM851d, c0012alM851d2);
        }
        return c0009aiM850a;
    }

    /* JADX INFO: renamed from: c */
    public static C0009ai m845c(C0011ak c0011ak, C0012al c0012al, C0012al c0012al2, int i, boolean z) {
        C0009ai c0009aiM850a = c0011ak.m850a();
        c0009aiM850a.m724h(c0012al, c0012al2, i);
        if (z) {
            c0011ak.m858k(c0009aiM850a, 1);
        }
        return c0009aiM850a;
    }

    /* JADX INFO: renamed from: p */
    public static final int m846p(Object obj) {
        C0012al c0012al = ((C0013am) obj).f676f;
        if (c0012al != null) {
            return (int) (c0012al.f614d + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    private final void m847q() {
        int i = this.f575i;
        int i2 = i + i;
        this.f575i = i2;
        this.f570c = (C0009ai[]) Arrays.copyOf(this.f570c, i2);
        AmbientDelegate ambientDelegate = this.f574g;
        ambientDelegate.f1685a = (C0012al[]) Arrays.copyOf((Object[]) ambientDelegate.f1685a, this.f575i);
        int i3 = this.f575i;
        this.f571d = new boolean[i3];
        this.f576j = i3;
        this.f577k = i3;
        this.f569b.f478a.clear();
    }

    /* JADX INFO: renamed from: r */
    private final void m848r() {
        int i = 0;
        while (true) {
            C0009ai[] c0009aiArr = this.f570c;
            if (i >= c0009aiArr.length) {
                return;
            }
            C0009ai c0009ai = c0009aiArr[i];
            if (c0009ai != null) {
                ((ent) this.f574g.f1687c).m7579k(c0009ai);
            }
            this.f570c[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    private final C0012al m849s(int i) {
        C0012al c0012al = (C0012al) ((ent) this.f574g.f1686b).m7578j();
        if (c0012al == null) {
            c0012al = new C0012al(i);
        } else {
            c0012al.m892b();
            c0012al.f618h = i;
        }
        int i2 = this.f579m;
        int i3 = f567h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            f567h = i4;
            this.f578l = (C0012al[]) Arrays.copyOf(this.f578l, i4);
        }
        C0012al[] c0012alArr = this.f578l;
        int i5 = this.f579m;
        this.f579m = i5 + 1;
        c0012alArr[i5] = c0012al;
        return c0012al;
    }

    /* JADX INFO: renamed from: a */
    public final C0009ai m850a() {
        C0009ai c0009ai = (C0009ai) ((ent) this.f574g.f1687c).m7578j();
        if (c0009ai == null) {
            return new C0009ai(this.f574g, null, null, null);
        }
        c0009ai.f396a = null;
        C0008ah c0008ah = c0009ai.f399d;
        c0008ah.f360e = -1;
        c0008ah.f361f = -1;
        c0008ah.f362g = false;
        c0008ah.f356a = 0;
        c0009ai.f397b = 0.0f;
        c0009ai.f400e = false;
        return c0009ai;
    }

    /* JADX INFO: renamed from: d */
    public final C0012al m851d() {
        if (this.f572e + 1 >= this.f576j) {
            m847q();
        }
        C0012al c0012alM849s = m849s(4);
        int i = this.f568a + 1;
        this.f568a = i;
        this.f572e++;
        c0012alM849s.f611a = i;
        ((C0012al[]) this.f574g.f1685a)[i] = c0012alM849s;
        return c0012alM849s;
    }

    /* JADX INFO: renamed from: e */
    public final C0012al m852e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f572e + 1 >= this.f576j) {
            m847q();
        }
        C0013am c0013am = (C0013am) obj;
        C0012al c0012al = c0013am.f676f;
        if (c0012al == null) {
            c0013am.m931e();
            c0012al = c0013am.f676f;
        }
        int i = c0012al.f611a;
        if (i == -1) {
            int i2 = this.f568a + 1;
            this.f568a = i2;
            this.f572e++;
            c0012al.f611a = i2;
            c0012al.f618h = 1;
            ((C0012al[]) this.f574g.f1685a)[i2] = c0012al;
        } else if (i > this.f568a || ((C0012al[]) this.f574g.f1685a)[i] == null) {
            if (i != -1) {
                c0012al.m892b();
            }
            int i3 = this.f568a + 1;
            this.f568a = i3;
            this.f572e++;
            c0012al.f611a = i3;
            c0012al.f618h = 1;
            ((C0012al[]) this.f574g.f1685a)[i3] = c0012al;
        }
        return c0012al;
    }

    /* JADX INFO: renamed from: f */
    public final C0012al m853f() {
        if (this.f572e + 1 >= this.f576j) {
            m847q();
        }
        C0012al c0012alM849s = m849s(3);
        int i = this.f568a + 1;
        this.f568a = i;
        this.f572e++;
        c0012alM849s.f611a = i;
        ((C0012al[]) this.f574g.f1685a)[i] = c0012alM849s;
        return c0012alM849s;
    }

    /* JADX INFO: renamed from: g */
    public final void m854g(C0009ai c0009ai) {
        C0009ai[] c0009aiArr;
        if (this.f573f + 1 >= this.f577k || this.f572e + 1 >= this.f576j) {
            m847q();
        }
        if (!c0009ai.f400e) {
            if (this.f573f > 0) {
                C0008ah c0008ah = c0009ai.f399d;
                C0009ai[] c0009aiArr2 = this.f570c;
                int i = c0008ah.f360e;
                int i2 = 0;
                while (i != -1 && i2 < c0008ah.f356a) {
                    C0012al c0012al = ((C0012al[]) c0008ah.f363h.f1685a)[c0008ah.f357b[i]];
                    if (c0012al.f612b != -1) {
                        float f = c0008ah.f359d[i];
                        c0008ah.m649c(c0012al);
                        C0009ai c0009ai2 = c0009aiArr2[c0012al.f612b];
                        if (!c0009ai2.f400e) {
                            C0008ah c0008ah2 = c0009ai2.f399d;
                            int i3 = c0008ah2.f360e;
                            for (int i4 = 0; i3 != -1 && i4 < c0008ah2.f356a; i4++) {
                                c0008ah.m651e(((C0012al[]) c0008ah.f363h.f1685a)[c0008ah2.f357b[i3]], c0008ah2.f359d[i3] * f);
                                i3 = c0008ah2.f358c[i3];
                            }
                        }
                        c0009ai.f397b += c0009ai2.f397b * f;
                        c0009ai2.f396a.m891a(c0009ai);
                        i = c0008ah.f360e;
                        i2 = 0;
                    } else {
                        i = c0008ah.f358c[i];
                        i2++;
                    }
                }
                if (c0009ai.f399d.f356a == 0) {
                    c0009ai.f400e = true;
                }
            }
            float f2 = c0009ai.f397b;
            if (f2 < 0.0f) {
                c0009ai.f397b = -f2;
                C0008ah c0008ah3 = c0009ai.f399d;
                int i5 = c0008ah3.f360e;
                for (int i6 = 0; i5 != -1 && i6 < c0008ah3.f356a; i6++) {
                    float[] fArr = c0008ah3.f359d;
                    fArr[i5] = -fArr[i5];
                    i5 = c0008ah3.f358c[i5];
                }
            }
            C0008ah c0008ah4 = c0009ai.f399d;
            int i7 = c0008ah4.f360e;
            C0012al c0012al2 = null;
            C0012al c0012al3 = null;
            int i8 = 0;
            while (true) {
                if (i7 == -1 || i8 >= c0008ah4.f356a) {
                    if (c0012al3 == null) {
                        break;
                    }
                    c0012al2 = c0012al3;
                    break;
                }
                float[] fArr2 = c0008ah4.f359d;
                float f3 = fArr2[i7];
                if (f3 < 0.0f) {
                    if (f3 > -0.001f) {
                        fArr2[i7] = 0.0f;
                        f3 = 0.0f;
                    }
                } else if (f3 < 0.001f) {
                    fArr2[i7] = 0.0f;
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    C0012al c0012al4 = ((C0012al[]) c0008ah4.f363h.f1685a)[c0008ah4.f357b[i7]];
                    if (c0012al4.f618h == 1) {
                        if (f3 < 0.0f) {
                            c0012al2 = c0012al4;
                            break;
                        } else if (c0012al3 == null) {
                            c0012al3 = c0012al4;
                        }
                    } else if (f3 < 0.0f && (c0012al2 == null || c0012al4.f613c < c0012al2.f613c)) {
                        c0012al2 = c0012al4;
                    }
                }
                i7 = c0008ah4.f358c[i7];
                i8++;
            }
            if (c0012al2 != null) {
                c0009ai.m717a(c0012al2);
            }
            if (c0009ai.f399d.f356a == 0) {
                c0009ai.f400e = true;
            }
            C0012al c0012al5 = c0009ai.f396a;
            if (c0012al5 == null) {
                return;
            }
            if (c0012al5.f618h != 1 && c0009ai.f397b < 0.0f) {
                return;
            }
        }
        C0009ai c0009ai3 = this.f570c[this.f573f];
        if (c0009ai3 != null) {
            ((ent) this.f574g.f1687c).m7579k(c0009ai3);
        }
        if (!c0009ai.f400e) {
            c0009ai.m718b();
        }
        C0009ai[] c0009aiArr3 = this.f570c;
        int i9 = this.f573f;
        c0009aiArr3[i9] = c0009ai;
        C0012al c0012al6 = c0009ai.f396a;
        c0012al6.f612b = i9;
        this.f573f = i9 + 1;
        int i10 = c0012al6.f617g;
        if (i10 > 0) {
            while (true) {
                c0009aiArr = this.f580n;
                int length = c0009aiArr.length;
                if (length >= i10) {
                    break;
                } else {
                    this.f580n = new C0009ai[length + length];
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                c0009aiArr[i11] = c0009ai.f396a.f616f[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                C0009ai c0009ai4 = c0009aiArr[i12];
                if (c0009ai4 != c0009ai) {
                    c0009ai4.f399d.m653g(c0009ai4, c0009ai);
                    c0009ai4.m718b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m855h(C0012al c0012al, int i) {
        int i2 = c0012al.f612b;
        if (i2 != -1) {
            C0009ai c0009ai = this.f570c[i2];
            if (c0009ai.f400e) {
                c0009ai.f397b = i;
                return;
            }
            C0009ai c0009aiM850a = m850a();
            c0009aiM850a.m723g(c0012al, i);
            m854g(c0009aiM850a);
            return;
        }
        C0009ai c0009aiM850a2 = m850a();
        c0009aiM850a2.f396a = c0012al;
        float f = i;
        c0012al.f614d = f;
        c0009aiM850a2.f397b = f;
        c0009aiM850a2.f400e = true;
        m854g(c0009aiM850a2);
    }

    /* JADX INFO: renamed from: i */
    public final void m856i(C0012al c0012al, C0012al c0012al2, int i, int i2) {
        C0009ai c0009aiM850a = m850a();
        C0012al c0012alM853f = m853f();
        c0012alM853f.f613c = i2;
        c0009aiM850a.m725i(c0012al, c0012al2, c0012alM853f, i);
        m854g(c0009aiM850a);
    }

    /* JADX INFO: renamed from: j */
    public final void m857j(C0012al c0012al, C0012al c0012al2, int i, int i2) {
        C0009ai c0009aiM850a = m850a();
        C0012al c0012alM853f = m853f();
        c0012alM853f.f613c = i2;
        c0009aiM850a.m726j(c0012al, c0012al2, c0012alM853f, i);
        m854g(c0009aiM850a);
    }

    /* JADX INFO: renamed from: k */
    public final void m858k(C0009ai c0009ai, int i) {
        c0009ai.f399d.m652f(m851d(), i);
    }

    /* JADX INFO: renamed from: l */
    public final void m859l() {
        AmbientDelegate ambientDelegate;
        int i = 0;
        while (true) {
            ambientDelegate = this.f574g;
            C0012al[] c0012alArr = (C0012al[]) ambientDelegate.f1685a;
            if (i >= c0012alArr.length) {
                break;
            }
            C0012al c0012al = c0012alArr[i];
            if (c0012al != null) {
                c0012al.m892b();
            }
            i++;
        }
        Object obj = ambientDelegate.f1686b;
        C0012al[] c0012alArr2 = this.f578l;
        int i2 = this.f579m;
        int length = c0012alArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0012al c0012al2 = c0012alArr2[i3];
            ent entVar = (ent) obj;
            int i4 = entVar.f14790a;
            if (i4 < 256) {
                ((Object[]) entVar.f14791b)[i4] = c0012al2;
                entVar.f14790a = i4 + 1;
            }
        }
        this.f579m = 0;
        Arrays.fill((Object[]) this.f574g.f1685a, (Object) null);
        this.f568a = 0;
        this.f569b.f478a.clear();
        this.f572e = 1;
        for (int i5 = 0; i5 < this.f573f; i5++) {
            this.f570c[i5].f398c = false;
        }
        m848r();
        this.f573f = 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m860m(C0012al c0012al, C0012al c0012al2, int i, float f, C0012al c0012al3, C0012al c0012al4, int i2) {
        C0009ai c0009aiM850a = m850a();
        c0009aiM850a.m720d(c0012al, c0012al2, i, f, c0012al3, c0012al4, i2);
        C0012al c0012alM851d = m851d();
        C0012al c0012alM851d2 = m851d();
        c0012alM851d.f613c = 4;
        c0012alM851d2.f613c = 4;
        c0009aiM850a.m719c(c0012alM851d, c0012alM851d2);
        m854g(c0009aiM850a);
    }

    /* JADX INFO: renamed from: n */
    public final void m861n(C0012al c0012al, C0012al c0012al2, int i, int i2) {
        C0009ai c0009aiM850a = m850a();
        c0009aiM850a.m724h(c0012al, c0012al2, i);
        C0012al c0012alM851d = m851d();
        C0012al c0012alM851d2 = m851d();
        c0012alM851d.f613c = i2;
        c0012alM851d2.f613c = i2;
        c0009aiM850a.m719c(c0012alM851d, c0012alM851d2);
        m854g(c0009aiM850a);
    }

    /* JADX INFO: renamed from: o */
    public final void m862o(C0010aj c0010aj) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f573f) {
                i = 0;
                break;
            }
            C0009ai c0009ai = this.f570c[i2];
            if (c0009ai.f396a.f618h != 1 && c0009ai.f397b < 0.0f) {
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                float f = Float.MAX_VALUE;
                int i6 = 0;
                while (true) {
                    if (i3 >= this.f573f) {
                        if (i4 == -1) {
                            break;
                        }
                        C0009ai c0009ai2 = this.f570c[i4];
                        c0009ai2.f396a.f612b = -1;
                        c0009ai2.m717a(((C0012al[]) this.f574g.f1685a)[i5]);
                        c0009ai2.f396a.f612b = i4;
                        for (int i7 = 0; i7 < this.f573f; i7++) {
                            this.f570c[i7].m727k(c0009ai2);
                        }
                        c0010aj.m795a(this);
                        i3 = 0;
                        i4 = -1;
                        i5 = -1;
                        f = Float.MAX_VALUE;
                        i6 = 0;
                    } else {
                        C0009ai c0009ai3 = this.f570c[i3];
                        if (c0009ai3.f396a.f618h != 1 && c0009ai3.f397b < 0.0f) {
                            for (int i8 = 1; i8 < this.f572e; i8++) {
                                C0012al c0012al = ((C0012al[]) this.f574g.f1685a)[i8];
                                float fM647a = c0009ai3.f399d.m647a(c0012al);
                                if (fM647a > 0.0f) {
                                    for (int i9 = 0; i9 < 6; i9++) {
                                        float f2 = c0012al.f615e[i9] / fM647a;
                                        if ((f2 < f && i9 == i6) || i9 > i6) {
                                            f = f2;
                                            i4 = i3;
                                            i5 = i8;
                                            i6 = i9;
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                }
                i = 0;
                break;
            }
            i2++;
        }
        while (i < this.f573f) {
            C0009ai c0009ai4 = this.f570c[i];
            if (c0009ai4.f396a.f618h != 1 && c0009ai4.f397b < 0.0f) {
                return;
            } else {
                i++;
            }
        }
    }
}
