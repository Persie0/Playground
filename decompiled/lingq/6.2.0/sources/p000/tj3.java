package p000;

import android.os.Trace;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class tj3 implements ye1 {

    /* JADX INFO: renamed from: A */
    public int f62366A;

    /* JADX INFO: renamed from: B */
    public int f62367B;

    /* JADX INFO: renamed from: C */
    public boolean f62368C;

    /* JADX INFO: renamed from: D */
    public final sj3 f62369D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f62370E;

    /* JADX INFO: renamed from: F */
    public boolean f62371F;

    /* JADX INFO: renamed from: G */
    public bb9 f62372G;

    /* JADX INFO: renamed from: H */
    public cb9 f62373H;

    /* JADX INFO: renamed from: I */
    public fb9 f62374I;

    /* JADX INFO: renamed from: J */
    public boolean f62375J;

    /* JADX INFO: renamed from: K */
    public l77 f62376K;

    /* JADX INFO: renamed from: L */
    public tt0 f62377L;

    /* JADX INFO: renamed from: M */
    public final ze1 f62378M;

    /* JADX INFO: renamed from: N */
    public oj3 f62379N;

    /* JADX INFO: renamed from: O */
    public j63 f62380O;

    /* JADX INFO: renamed from: P */
    public j69 f62381P;

    /* JADX INFO: renamed from: Q */
    public final nf1 f62382Q;

    /* JADX INFO: renamed from: R */
    public final kn1 f62383R;

    /* JADX INFO: renamed from: S */
    public boolean f62384S;

    /* JADX INFO: renamed from: T */
    public long f62385T;

    /* JADX INFO: renamed from: U */
    public uj3 f62386U;

    /* JADX INFO: renamed from: a */
    public final AbstractC3517r f62387a;

    /* JADX INFO: renamed from: b */
    public final kf1 f62388b;

    /* JADX INFO: renamed from: c */
    public final cb9 f62389c;

    /* JADX INFO: renamed from: d */
    public final q66 f62390d;

    /* JADX INFO: renamed from: e */
    public final tt0 f62391e;

    /* JADX INFO: renamed from: f */
    public final tt0 f62392f;

    /* JADX INFO: renamed from: g */
    public final m58 f62393g;

    /* JADX INFO: renamed from: h */
    public final pf1 f62394h;

    /* JADX INFO: renamed from: j */
    public wj3 f62396j;

    /* JADX INFO: renamed from: k */
    public int f62397k;

    /* JADX INFO: renamed from: l */
    public int f62398l;

    /* JADX INFO: renamed from: m */
    public int f62399m;

    /* JADX INFO: renamed from: o */
    public int[] f62401o;

    /* JADX INFO: renamed from: p */
    public r56 f62402p;

    /* JADX INFO: renamed from: q */
    public boolean f62403q;

    /* JADX INFO: renamed from: r */
    public boolean f62404r;

    /* JADX INFO: renamed from: v */
    public t56 f62408v;

    /* JADX INFO: renamed from: w */
    public boolean f62409w;

    /* JADX INFO: renamed from: y */
    public boolean f62411y;

    /* JADX INFO: renamed from: i */
    public final ArrayList f62395i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final o84 f62400n = new o84();

    /* JADX INFO: renamed from: s */
    public final ArrayList f62405s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final o84 f62406t = new o84();

    /* JADX INFO: renamed from: u */
    public l77 f62407u = l77.f49251d;

    /* JADX INFO: renamed from: x */
    public final o84 f62410x = new o84();

    /* JADX INFO: renamed from: z */
    public int f62412z = -1;

    public tj3(AbstractC3517r abstractC3517r, kf1 kf1Var, cb9 cb9Var, q66 q66Var, tt0 tt0Var, tt0 tt0Var2, m58 m58Var, pf1 pf1Var) {
        this.f62387a = abstractC3517r;
        this.f62388b = kf1Var;
        this.f62389c = cb9Var;
        this.f62390d = q66Var;
        this.f62391e = tt0Var;
        this.f62392f = tt0Var2;
        this.f62393g = m58Var;
        this.f62394h = pf1Var;
        this.f62368C = kf1Var.mo1227f() || kf1Var.mo1225d();
        this.f62369D = new sj3(this, 0);
        this.f62370E = new ArrayList();
        bb9 bb9VarM4491g = cb9Var.m4491g();
        bb9VarM4491g.m3559c();
        this.f62372G = bb9VarM4491g;
        cb9 cb9Var2 = new cb9();
        if (kf1Var.mo1227f()) {
            cb9Var2.m4490f();
        }
        if (kf1Var.mo1225d()) {
            cb9Var2.f9852k = new t56();
        }
        this.f62373H = cb9Var2;
        fb9 fb9VarM4492h = cb9Var2.m4492h();
        fb9VarM4492h.m11731e(true);
        this.f62374I = fb9VarM4492h;
        this.f62378M = new ze1(this, tt0Var);
        bb9 bb9VarM4491g2 = this.f62373H.m4491g();
        try {
            oj3 oj3VarM3557a = bb9VarM4491g2.m3557a(0);
            bb9VarM4491g2.m3559c();
            this.f62379N = oj3VarM3557a;
            this.f62380O = new j63();
            this.f62382Q = new nf1(this);
            kn1 kn1VarMo1231j = kf1Var.mo1231j();
            kn1 kn1VarM22085C = m22085C();
            this.f62383R = kn1VarMo1231j.plus(kn1VarM22085C == null ? EmptyCoroutineContext.f47685a : kn1VarM22085C);
        } catch (Throwable th) {
            bb9VarM4491g2.m3559c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final int m22082Q(tj3 tj3Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        bb9 bb9Var;
        bb9 bb9Var2 = tj3Var.f62372G;
        int i6 = 0;
        if (bb9Var2.m3566j(i)) {
            int iM3565i = bb9Var2.m3565i(i);
            Object objM3572p = bb9Var2.m3572p(bb9Var2.f8283b, i);
            if (iM3565i == 206 && fa4.m11650l(objM3572p, cf1.f9997e)) {
                Object objM3564h = bb9Var2.m3564h(i, 0);
                xj3 xj3Var = objM3564h instanceof xj3 ? (xj3) objM3564h : null;
                x48 x48Var = xj3Var != null ? xj3Var.f68286a : null;
                rj3 rj3Var = x48Var instanceof rj3 ? (rj3) x48Var : null;
                if (rj3Var != null) {
                    o66 o66Var = rj3Var.f59403a.f3720e;
                    Object[] objArr = o66Var.f1303b;
                    long[] jArr2 = o66Var.f1302a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr2[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i6;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        tj3 tj3Var2 = (tj3) objArr[(i7 << 3) + i10];
                                        cb9 cb9Var = tj3Var2.f62389c;
                                        if (cb9Var.f9843b <= 0 || (cb9Var.f9842a[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            pf1 pf1Var = tj3Var2.f62394h;
                                            synchronized (pf1Var.f56041d) {
                                                try {
                                                    pf1Var.m19100p();
                                                    n66 n66Var = pf1Var.f56028I;
                                                    pf1Var.f56028I = fa4.m11654p();
                                                    try {
                                                        pf1Var.f56036Q.m22125i0(n66Var);
                                                    } catch (Throwable th) {
                                                        pf1Var.f56028I = n66Var;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                            tt0 tt0Var = new tt0();
                                            tj3Var2.f62377L = tt0Var;
                                            bb9 bb9VarM4491g = tj3Var2.f62389c.m4491g();
                                            try {
                                                tj3Var2.f62372G = bb9VarM4491g;
                                                ze1 ze1Var = tj3Var2.f62378M;
                                                tt0 tt0Var2 = ze1Var.f71431b;
                                                try {
                                                    ze1Var.f71431b = tt0Var;
                                                    tj3Var2.m22098P(0);
                                                    ze1 ze1Var2 = tj3Var2.f62378M;
                                                    ze1Var2.m25565b();
                                                    try {
                                                        if (ze1Var2.f71432c) {
                                                            bb9Var = bb9VarM4491g;
                                                            try {
                                                                ze1Var2.f71431b.f62837p.m15737V(xy6.f68960c);
                                                                if (ze1Var2.f71432c) {
                                                                    ze1Var2.m25567d(false);
                                                                    ze1Var2.m25567d(false);
                                                                    ze1Var2.f71431b.f62837p.m15737V(hy6.f43205c);
                                                                    i5 = 0;
                                                                    ze1Var2.f71432c = false;
                                                                }
                                                                ze1Var.f71431b = tt0Var2;
                                                                bb9Var.m3559c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                ze1Var.f71431b = tt0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            bb9Var = bb9VarM4491g;
                                                        }
                                                        ze1Var.f71431b = tt0Var2;
                                                        bb9Var.m3559c();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bb9Var.m3559c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    bb9Var = bb9VarM4491g;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                bb9Var = bb9VarM4491g;
                                            }
                                        }
                                        tj3Var.f62388b.mo1239r(tj3Var2.f62394h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i8 = i8;
                                    }
                                    j >>= i8;
                                    i10++;
                                    i8 = i8;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i9 != i8) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return bb9Var2.m3571o(i);
            }
            i3 = 1;
            if (!bb9Var2.m3568l(i)) {
                return bb9Var2.m3571o(i);
            }
        } else {
            i3 = 1;
            if (bb9Var2.m3560d(i)) {
                int i11 = bb9Var2.f8283b[(i * 5) + 3] + i;
                int iM22082Q = 0;
                for (int i12 = i + 1; i12 < i11; i12 += bb9Var2.f8283b[(i12 * 5) + 3]) {
                    boolean zM3568l = bb9Var2.m3568l(i12);
                    if (zM3568l) {
                        tj3Var.f62378M.m25566c();
                        ze1 ze1Var3 = tj3Var.f62378M;
                        Object objM3570n = bb9Var2.m3570n(i12);
                        ze1Var3.m25566c();
                        ze1Var3.f71437h.add(objM3570n);
                    }
                    iM22082Q += m22082Q(tj3Var, i12, zM3568l || z, zM3568l ? 0 : i2 + iM22082Q);
                    if (zM3568l) {
                        tj3Var.f62378M.m25566c();
                        tj3Var.f62378M.m25564a();
                    }
                }
                if (!bb9Var2.m3568l(i)) {
                    return iM22082Q;
                }
            } else if (!bb9Var2.m3568l(i)) {
                return bb9Var2.m3571o(i);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: A */
    public final x18 m22083A() {
        if (this.f62366A != 0) {
            return null;
        }
        ArrayList arrayList = this.f62370E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (x18) AbstractC3393o1.m17731f(1, arrayList);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m22084B() {
        if (!m22086D() || this.f62409w) {
            return true;
        }
        x18 x18VarM22083A = m22083A();
        return (x18VarM22083A == null || (x18VarM22083A.f67640b & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final nf1 m22085C() {
        if (this.f62388b.mo1232k()) {
            return this.f62382Q;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m22086D() {
        x18 x18VarM22083A;
        return (this.f62384S || this.f62411y || this.f62409w || (x18VarM22083A = m22083A()) == null || (x18VarM22083A.f67640b & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final void m22087E(ArrayList arrayList) {
        tj3 tj3Var = this;
        tt0 tt0Var = tj3Var.f62392f;
        ze1 ze1Var = tj3Var.f62378M;
        tt0 tt0Var2 = ze1Var.f71431b;
        try {
            ze1Var.f71431b = tt0Var;
            tt0Var.f62837p.m15737V(vy6.f66098c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                z36 z36Var = (z36) pair.f47623a;
                z36Var.getClass();
                oj3 oj3VarM20386k = r46.m20386k(null);
                cb9 cb9VarM11013d = eb9.m11013d(null);
                int iM4489d = cb9VarM11013d.m4489d(oj3VarM20386k);
                k84 k84Var = new k84();
                ze1Var.m25565b();
                kz6 kz6Var = ze1Var.f71431b.f62837p;
                kz6Var.m15737V(ey6.f38076c);
                ss5.m21696W(kz6Var, 0, k84Var, 1, oj3VarM20386k);
                if (cb9VarM11013d == tj3Var.f62373H) {
                    if (!tj3Var.f62374I.f38822w) {
                        cf1.m4605a("Check failed");
                    }
                    tj3Var.m22147y();
                }
                bb9 bb9VarM4491g = cb9VarM11013d.m4491g();
                try {
                    bb9VarM4491g.m3574r(iM4489d);
                    ze1Var.f71435f = iM4489d;
                    tt0 tt0Var3 = new tt0();
                    tj3Var.m22092J(null, null, null, EmptyList.f47638a, new r60(tj3Var, tt0Var3, bb9VarM4491g, z36Var));
                    tt0 tt0Var4 = ze1Var.f71431b;
                    tt0Var4.getClass();
                    if (!tt0Var3.f62837p.m15736U()) {
                        kz6 kz6Var2 = tt0Var4.f62837p;
                        kz6Var2.m15737V(ay6.f7670c);
                        ss5.m21696W(kz6Var2, 0, tt0Var3, 1, k84Var);
                    }
                    bb9VarM4491g.m3559c();
                    ze1Var.f71431b.f62837p.m15737V(xy6.f68960c);
                    i++;
                    tj3Var = this;
                } catch (Throwable th) {
                    bb9VarM4491g.m3559c();
                    throw th;
                }
            }
            ze1Var.m25565b();
            ze1Var.f71431b.f62837p.m15737V(iy6.f44778c);
            ze1Var.f71435f = 0;
            ze1Var.f71431b = tt0Var2;
        } catch (Throwable th2) {
            ze1Var.f71431b = tt0Var2;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m22088F(l77 l77Var, Object obj) {
        m22106Y(126665345, null);
        m22089G();
        m22133m0(obj);
        long j = this.f62385T;
        try {
            this.f62385T = 126665345L;
            if (this.f62384S) {
                fb9.m11705z(this.f62374I);
            }
            boolean z = (this.f62384S || fa4.m11650l(this.f62372G.m3562f(), l77Var)) ? false : true;
            if (z) {
                m22095M(l77Var);
            }
            m22103V(cf1.f9995c, 202, 0, l77Var);
            this.f62376K = null;
            boolean z2 = this.f62409w;
            this.f62409w = z;
            wfb.m23924s(this, new C0282a(-59194059, true, new C3186kj(obj, 6)));
            this.f62409w = z2;
            m22139q(false);
            this.f62376K = null;
            this.f62385T = j;
            m22139q(false);
        } catch (Throwable th) {
            try {
                bna.m3988z0(th, new qj3(this, 2));
                throw th;
            } catch (Throwable th2) {
                m22139q(false);
                this.f62376K = null;
                this.f62385T = j;
                m22139q(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object m22089G() {
        boolean z = this.f62384S;
        p84 p84Var = we1.f66679a;
        if (!z) {
            Object objM3569m = this.f62372G.m3569m();
            if (!this.f62411y || (objM3569m instanceof p98)) {
                return objM3569m;
            }
        } else if (this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected");
            return p84Var;
        }
        return p84Var;
    }

    /* JADX INFO: renamed from: H */
    public final List m22090H() {
        kf1 kf1Var = this.f62388b;
        jf1 jf1VarMo1229h = kf1Var.mo1229h();
        pf1 pf1Var = jf1VarMo1229h != null ? (pf1) jf1VarMo1229h : null;
        if (pf1Var != null) {
            cb9 cb9Var = pf1Var.f56043f;
            bb9 bb9VarM4491g = eb9.m11013d(cb9Var).m4491g();
            try {
                Integer numM16137w = lda.m16137w(bb9VarM4491g, kf1Var, 0, bb9VarM4491g.f8284c);
                bb9VarM4491g.m3559c();
                if (numM16137w != null) {
                    bb9 bb9VarM4491g2 = eb9.m11013d(cb9Var).m4491g();
                    try {
                        return u91.m22603U0(pf1Var.f56036Q.m22090H(), lda.m16114N(bb9VarM4491g2, numM16137w.intValue(), 0));
                    } finally {
                        bb9VarM4491g2.m3559c();
                    }
                }
            } catch (Throwable th) {
                bb9VarM4491g.m3559c();
                throw th;
            }
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: I */
    public final int m22091I(int i) {
        int iM3573q = this.f62372G.m3573q(i) + 1;
        int i2 = 0;
        while (iM3573q < i) {
            if (!this.f62372G.m3567k(iM3573q)) {
                i2++;
            }
            iM3573q += this.f62372G.f8283b[(iM3573q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:18:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0051, B:26:0x0055, B:27:0x0056, B:29:0x005c, B:22:0x0047), top: B:36:0x0005, inners: #0 }] */
    /* JADX INFO: renamed from: J */
    public final Object m22092J(pf1 pf1Var, pf1 pf1Var2, Integer num, List list, ui3 ui3Var) {
        Object objMo0a;
        boolean z = this.f62371F;
        int i = this.f62397k;
        try {
            this.f62371F = true;
            this.f62397k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                x18 x18Var = (x18) pair.f47623a;
                Object obj = pair.f47624b;
                if (obj != null) {
                    m22123h0(x18Var, obj);
                } else {
                    m22123h0(x18Var, null);
                }
            }
            if (pf1Var == null) {
                objMo0a = ui3Var.mo0a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (pf1Var2 == null || pf1Var2.equals(pf1Var) || iIntValue < 0) {
                    objMo0a = ui3Var.mo0a();
                } else {
                    pf1Var.f56032M = pf1Var2;
                    pf1Var.f56033N = iIntValue;
                    try {
                        objMo0a = ui3Var.mo0a();
                        pf1Var.f56032M = null;
                        pf1Var.f56033N = 0;
                    } catch (Throwable th) {
                        pf1Var.f56032M = null;
                        pf1Var.f56033N = 0;
                        throw th;
                    }
                }
                if (objMo0a == null) {
                    objMo0a = ui3Var.mo0a();
                }
            }
            this.f62371F = z;
            this.f62397k = i;
            return objMo0a;
        } catch (Throwable th2) {
            this.f62371F = z;
            this.f62397k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: K */
    public final void m22093K() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tj3.m22093K():void");
    }

    /* JADX INFO: renamed from: L */
    public final void m22094L() throws Throwable {
        int i;
        m22098P(this.f62372G.f8288g);
        ze1 ze1Var = this.f62378M;
        ze1Var.m25567d(false);
        o84 o84Var = ze1Var.f71433d;
        tj3 tj3Var = ze1Var.f71430a;
        bb9 bb9Var = tj3Var.f62372G;
        if (bb9Var.f8284c > 0 && o84Var.m17838a(-2) != (i = bb9Var.f8290i)) {
            if (!ze1Var.f71432c && ze1Var.f71434e) {
                ze1Var.m25567d(false);
                ze1Var.f71431b.f62837p.m15737V(ly6.f50306c);
                ze1Var.f71432c = true;
            }
            if (i > 0) {
                oj3 oj3VarM3557a = bb9Var.m3557a(i);
                o84Var.m17840c(i);
                ze1Var.m25567d(false);
                kz6 kz6Var = ze1Var.f71431b.f62837p;
                kz6Var.m15737V(ky6.f48776c);
                ss5.m21695V(kz6Var, 0, oj3VarM3557a);
                ze1Var.f71432c = true;
            }
        }
        ze1Var.f71431b.f62837p.m15737V(ty6.f63096c);
        int i2 = ze1Var.f71435f;
        bb9 bb9Var2 = tj3Var.f62372G;
        ze1Var.f71435f = bb9Var2.f8283b[(bb9Var2.f8288g * 5) + 3] + i2;
    }

    /* JADX INFO: renamed from: M */
    public final void m22095M(l77 l77Var) {
        t56 t56Var = this.f62408v;
        if (t56Var == null) {
            t56Var = new t56();
            this.f62408v = t56Var;
        }
        t56Var.m21850i(this.f62372G.f8288g, l77Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX INFO: renamed from: N */
    public final void m22096N(int i, int i2, int i3) {
        bb9 bb9Var = this.f62372G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (bb9Var.m3573q(i) == i2) {
                i3 = i2;
            } else if (bb9Var.m3573q(i2) == i) {
                i3 = i;
            } else if (bb9Var.m3573q(i) == bb9Var.m3573q(i2)) {
                i3 = bb9Var.m3573q(i);
            } else {
                int iM3573q = i;
                int i4 = 0;
                while (iM3573q > 0 && iM3573q != i3) {
                    iM3573q = bb9Var.m3573q(iM3573q);
                    i4++;
                }
                int iM3573q2 = i2;
                int i5 = 0;
                while (iM3573q2 > 0 && iM3573q2 != i3) {
                    iM3573q2 = bb9Var.m3573q(iM3573q2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iM3573q3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iM3573q3 = bb9Var.m3573q(iM3573q3);
                }
                int i8 = i5 - i4;
                int iM3573q4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iM3573q4 = bb9Var.m3573q(iM3573q4);
                }
                i3 = iM3573q3;
                for (int iM3573q5 = iM3573q4; i3 != iM3573q5; iM3573q5 = bb9Var.m3573q(iM3573q5)) {
                    i3 = bb9Var.m3573q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (bb9Var.m3568l(i)) {
                this.f62378M.m25564a();
            }
            i = bb9Var.m3573q(i);
        }
        m22138p(i2, i3);
    }

    /* JADX INFO: renamed from: O */
    public final Object m22097O() {
        boolean z = this.f62384S;
        p84 p84Var = we1.f66679a;
        if (!z) {
            Object objM3569m = this.f62372G.m3569m();
            if (!this.f62411y || (objM3569m instanceof p98)) {
                return objM3569m instanceof xj3 ? ((xj3) objM3569m).f68286a : objM3569m;
            }
        } else if (this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected");
            return p84Var;
        }
        return p84Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m22098P(int i) throws Throwable {
        boolean zM3568l = this.f62372G.m3568l(i);
        ze1 ze1Var = this.f62378M;
        if (zM3568l) {
            ze1Var.m25566c();
            Object objM3570n = this.f62372G.m3570n(i);
            ze1Var.m25566c();
            ze1Var.f71437h.add(objM3570n);
        }
        m22082Q(this, i, zM3568l, 0);
        ze1Var.m25566c();
        if (zM3568l) {
            ze1Var.m25564a();
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m22099R(int i, boolean z) {
        x18 x18VarM22083A;
        if ((i & 1) == 0 && (this.f62384S || this.f62411y)) {
            j69 j69Var = this.f62381P;
            if (j69Var != null && (x18VarM22083A = m22083A()) != null && j69Var.mo14307a()) {
                int i2 = x18VarM22083A.f67640b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                x18VarM22083A.f67640b = i3;
                x18VarM22083A.f67640b = (this.f62411y ? i2 | 129 : i3 & (-129)) | 256;
                kz6 kz6Var = this.f62378M.f71431b.f62837p;
                kz6Var.m15737V(sy6.f61628c);
                ss5.m21695V(kz6Var, 0, x18VarM22083A);
                this.f62388b.mo1238q(x18VarM22083A);
                return false;
            }
        } else if (!z && m22086D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX INFO: renamed from: S */
    public final void m22100S() {
        long jRotateLeft;
        if (this.f62405s.isEmpty()) {
            this.f62398l = this.f62372G.m3575s() + this.f62398l;
            return;
        }
        bb9 bb9Var = this.f62372G;
        int iM3563g = bb9Var.m3563g();
        int[] iArr = bb9Var.f8283b;
        int i = bb9Var.f8288g;
        Object objM3572p = i < bb9Var.f8289h ? bb9Var.m3572p(iArr, i) : null;
        Object objM3562f = bb9Var.m3562f();
        int i2 = this.f62399m;
        p84 p84Var = we1.f66679a;
        if (objM3572p == null) {
            if (objM3562f == null || iM3563g != 207 || objM3562f.equals(p84Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) iM3563g), 3) ^ ((long) i2);
            } else {
                this.f62385T = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) objM3562f.hashCode()), 3) ^ ((long) i2);
            }
            m22109a0(null, (iArr[(bb9Var.f8288g * 5) + 1] & 1073741824) != 0);
            m22093K();
            bb9Var.m3561e();
            if (objM3572p != null) {
                if (objM3572p instanceof Enum) {
                    this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T, 3) ^ ((long) ((Enum) objM3572p).ordinal()), 3);
                } else {
                    this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T, 3) ^ ((long) objM3572p.hashCode()), 3);
                }
            }
            if (objM3562f == null && iM3563g == 207 && !objM3562f.equals(p84Var)) {
                this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T ^ ((long) i2), 3) ^ ((long) objM3562f.hashCode()), 3);
                return;
            } else {
                this.f62385T = Long.rotateRight(((long) iM3563g) ^ Long.rotateRight(this.f62385T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) (objM3572p instanceof Enum ? ((Enum) objM3572p).ordinal() : objM3572p.hashCode())), 3);
        this.f62385T = jRotateLeft;
        m22109a0(null, (iArr[(bb9Var.f8288g * 5) + 1] & 1073741824) != 0);
        m22093K();
        bb9Var.m3561e();
        if (objM3572p != null) {
            if (objM3562f == null) {
            }
            this.f62385T = Long.rotateRight(((long) iM3563g) ^ Long.rotateRight(this.f62385T ^ ((long) i2), 3), 3);
        } else if (objM3572p instanceof Enum) {
            this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T, 3) ^ ((long) ((Enum) objM3572p).ordinal()), 3);
        } else {
            this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T, 3) ^ ((long) objM3572p.hashCode()), 3);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m22101T() {
        bb9 bb9Var = this.f62372G;
        int i = bb9Var.f8290i;
        this.f62398l = i >= 0 ? bb9Var.f8283b[(i * 5) + 1] & 67108863 : 0;
        bb9Var.m3576t();
    }

    /* JADX INFO: renamed from: U */
    public final void m22102U() {
        if (this.f62398l != 0) {
            cf1.m4605a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f62384S) {
            return;
        }
        x18 x18VarM22083A = m22083A();
        if (x18VarM22083A != null) {
            int i = x18VarM22083A.f67640b;
            if ((i & 128) == 0) {
                x18VarM22083A.f67640b = i | 16;
            }
        }
        if (this.f62405s.isEmpty()) {
            m22101T();
        } else {
            m22093K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    /* JADX INFO: renamed from: V */
    public final void m22103V(Object obj, int i, int i2, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        wj3 wj3Var;
        wj3 wj3Var2;
        ArrayList arrayList;
        t56 t56Var;
        int i3;
        Object objValueOf;
        n66 n66Var;
        Object objM17255g;
        h66 h66Var;
        fb9 fb9Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        bb9 bb9Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        bb9 bb9Var2;
        int i13;
        Object objM3572p;
        fb9 fb9Var2;
        int i14;
        wj3 wj3Var3;
        Object obj4 = obj;
        if (this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.f62399m;
        Object obj5 = we1.f66679a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.f62385T = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.f62399m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.f62384S) {
                this.f62372G.f8292k++;
                fb9Var2 = this.f62374I;
                i14 = fb9Var2.f38819t;
                if (z) {
                    fb9Var2.m11722Q(obj5, obj5, true, i);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    fb9Var2.m11722Q(obj4, obj2, false, i);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    fb9Var2.m11722Q(obj4, obj5, false, i);
                }
                wj3Var3 = this.f62396j;
                if (wj3Var3 != null) {
                    int i16 = (-2) - i14;
                    ei4 ei4Var = new ei4(-1, i, i16, -1);
                    wj3Var3.f66930e.m21850i(i16, new dq3(-1, this.f62397k - wj3Var3.f66927b, 0));
                    wj3Var3.f66929d.add(ei4Var);
                }
                m22146x(z, null);
                return;
            }
            if (i2 != 1 && this.f62411y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f62396j == null) {
                int iM3563g = this.f62372G.m3563g();
                if (!z2 && iM3563g == i) {
                    bb9Var2 = this.f62372G;
                    i13 = bb9Var2.f8288g;
                    if (i13 < bb9Var2.f8289h) {
                        objM3572p = bb9Var2.m3572p(bb9Var2.f8283b, i13);
                    } else {
                        objM3572p = null;
                    }
                    if (fa4.m11650l(obj4, objM3572p)) {
                        m22109a0(obj2, z);
                        z3 = z2;
                    }
                }
                bb9Var = this.f62372G;
                iArr = bb9Var.f8283b;
                arrayList2 = new ArrayList();
                if (bb9Var.f8292k <= 0) {
                    i10 = bb9Var.f8288g;
                    while (i10 < bb9Var.f8289h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objM3572p2 = bb9Var.m3572p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new ei4(objM3572p2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.f62396j = new wj3(this.f62397k, arrayList2);
            } else {
                z3 = z2;
            }
            wj3Var = this.f62396j;
            if (wj3Var != null) {
                arrayList = wj3Var.f66929d;
                t56Var = wj3Var.f66930e;
                i3 = wj3Var.f66927b;
                if (obj4 != null) {
                    objValueOf = new af4(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                n66Var = ((g56) wj3Var.f66931f.getValue()).f40233a;
                objM17255g = n66Var.m17255g(objValueOf);
                if (objM17255g == null) {
                    objM17255g = null;
                } else if (objM17255g instanceof h66) {
                    h66Var = (h66) objM17255g;
                    Object objM13095l = h66Var.m13095l(0);
                    if (h66Var.m719d()) {
                        n66Var.m17259k(objValueOf);
                    }
                    if (h66Var.f1294b == 1) {
                        n66Var.m17261m(objValueOf, h66Var.m716a());
                    }
                    objM17255g = objM13095l;
                } else {
                    n66Var.m17259k(objValueOf);
                }
                ei4 ei4Var2 = (ei4) objM17255g;
                if (!z3 || ei4Var2 == null) {
                    this.f62372G.f8292k++;
                    this.f62384S = true;
                    this.f62376K = null;
                    if (this.f62374I.f38822w) {
                        fb9 fb9VarM4492h = this.f62373H.m4492h();
                        this.f62374I = fb9VarM4492h;
                        fb9VarM4492h.m11718M();
                        this.f62375J = false;
                        this.f62376K = null;
                    }
                    this.f62374I.m11730d();
                    fb9Var = this.f62374I;
                    int i19 = fb9Var.f38819t;
                    if (z) {
                        fb9Var.m11722Q(obj5, obj5, true, i);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        fb9Var.m11722Q(obj5, obj2, false, i);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        fb9Var.m11722Q(obj3, obj5, false, i);
                    }
                    this.f62379N = this.f62374I.m11728b(i19);
                    int i20 = (-2) - i19;
                    ei4 ei4Var3 = new ei4(-1, i, i20, -1);
                    t56Var.m21850i(i20, new dq3(-1, this.f62397k - i3, i4));
                    arrayList.add(ei4Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.f62397k;
                    }
                    wj3Var2 = new wj3(i5, arrayList3);
                } else {
                    int i21 = ei4Var2.f37283c;
                    arrayList.add(ei4Var2);
                    dq3 dq3Var = (dq3) t56Var.m10152b(i21);
                    this.f62397k = (dq3Var != null ? dq3Var.f36019b : -1) + i3;
                    dq3 dq3Var2 = (dq3) t56Var.m10152b(i21);
                    int i22 = dq3Var2 != null ? dq3Var2.f36018a : -1;
                    int i23 = wj3Var.f66928c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = t56Var.f35145c;
                            long[] jArr = t56Var.f35143a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                dq3 dq3Var3 = (dq3) objArr3[(i26 << 3) + i28];
                                                int i29 = dq3Var3.f36018a;
                                                if (i29 == i22) {
                                                    dq3Var3.f36018a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        dq3Var3.f36018a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = t56Var.f35145c;
                        long[] jArr2 = t56Var.f35143a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            dq3 dq3Var4 = (dq3) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = dq3Var4.f36018a;
                                            if (i33 == i22) {
                                                dq3Var4.f36018a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                dq3Var4.f36018a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    ze1 ze1Var = this.f62378M;
                    int i34 = ze1Var.f71435f;
                    tj3 tj3Var = ze1Var.f71430a;
                    ze1Var.f71435f = (i21 - tj3Var.f62372G.f8288g) + i34;
                    this.f62372G.m3574r(i21);
                    if (i6 > 0) {
                        ze1Var.m25567d(false);
                        o84 o84Var = ze1Var.f71433d;
                        bb9 bb9Var3 = tj3Var.f62372G;
                        if (bb9Var3.f8284c > 0 && o84Var.m17838a(-2) != (i7 = bb9Var3.f8290i)) {
                            if (!ze1Var.f71432c && ze1Var.f71434e) {
                                ze1Var.m25567d(false);
                                ze1Var.f71431b.f62837p.m15737V(ly6.f50306c);
                                ze1Var.f71432c = true;
                            }
                            if (i7 > 0) {
                                oj3 oj3VarM3557a = bb9Var3.m3557a(i7);
                                o84Var.m17840c(i7);
                                ze1Var.m25567d(false);
                                kz6 kz6Var = ze1Var.f71431b.f62837p;
                                kz6Var.m15737V(ky6.f48776c);
                                ss5.m21695V(kz6Var, 0, oj3VarM3557a);
                                ze1Var.f71432c = true;
                            }
                        }
                        kz6 kz6Var2 = ze1Var.f71431b.f62837p;
                        kz6Var2.m15737V(py6.f56998c);
                        kz6Var2.f48814B[kz6Var2.f48815C - kz6Var2.f48818z[kz6Var2.f48813A - 1].f41551a] = i6;
                    }
                    m22109a0(obj2, z);
                    wj3Var2 = null;
                }
            } else {
                wj3Var2 = null;
            }
            m22146x(z, wj3Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.f62385T = jRotateLeft;
        if (obj4 == null) {
            this.f62399m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f62384S) {
            this.f62372G.f8292k++;
            fb9Var2 = this.f62374I;
            i14 = fb9Var2.f38819t;
            if (z) {
                fb9Var2.m11722Q(obj5, obj5, true, i);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                fb9Var2.m11722Q(obj4, obj2, false, i);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                fb9Var2.m11722Q(obj4, obj5, false, i);
            }
            wj3Var3 = this.f62396j;
            if (wj3Var3 != null) {
                int i110 = (-2) - i14;
                ei4 ei4Var4 = new ei4(-1, i, i110, -1);
                wj3Var3.f66930e.m21850i(i110, new dq3(-1, this.f62397k - wj3Var3.f66927b, 0));
                wj3Var3.f66929d.add(ei4Var4);
            }
            m22146x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f62396j == null) {
            int iM3563g2 = this.f62372G.m3563g();
            if (!z2) {
                bb9Var2 = this.f62372G;
                i13 = bb9Var2.f8288g;
                if (i13 < bb9Var2.f8289h) {
                    objM3572p = bb9Var2.m3572p(bb9Var2.f8283b, i13);
                } else {
                    objM3572p = null;
                }
                if (fa4.m11650l(obj4, objM3572p)) {
                    m22109a0(obj2, z);
                    z3 = z2;
                }
            }
            bb9Var = this.f62372G;
            iArr = bb9Var.f8283b;
            arrayList2 = new ArrayList();
            if (bb9Var.f8292k <= 0) {
                i10 = bb9Var.f8288g;
                while (i10 < bb9Var.f8289h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objM3572p3 = bb9Var.m3572p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new ei4(objM3572p3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.f62396j = new wj3(this.f62397k, arrayList2);
        } else {
            z3 = z2;
        }
        wj3Var = this.f62396j;
        if (wj3Var != null) {
            arrayList = wj3Var.f66929d;
            t56Var = wj3Var.f66930e;
            i3 = wj3Var.f66927b;
            if (obj4 != null) {
                objValueOf = new af4(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            n66Var = ((g56) wj3Var.f66931f.getValue()).f40233a;
            objM17255g = n66Var.m17255g(objValueOf);
            if (objM17255g == null) {
                objM17255g = null;
            } else if (objM17255g instanceof h66) {
                h66Var = (h66) objM17255g;
                Object objM13095l2 = h66Var.m13095l(0);
                if (h66Var.m719d()) {
                    n66Var.m17259k(objValueOf);
                }
                if (h66Var.f1294b == 1) {
                    n66Var.m17261m(objValueOf, h66Var.m716a());
                }
                objM17255g = objM13095l2;
            } else {
                n66Var.m17259k(objValueOf);
            }
            ei4 ei4Var5 = (ei4) objM17255g;
            if (z3) {
            }
            this.f62372G.f8292k++;
            this.f62384S = true;
            this.f62376K = null;
            if (this.f62374I.f38822w) {
                fb9 fb9VarM4492h2 = this.f62373H.m4492h();
                this.f62374I = fb9VarM4492h2;
                fb9VarM4492h2.m11718M();
                this.f62375J = false;
                this.f62376K = null;
            }
            this.f62374I.m11730d();
            fb9Var = this.f62374I;
            int i113 = fb9Var.f38819t;
            if (z) {
                fb9Var.m11722Q(obj5, obj5, true, i);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                fb9Var.m11722Q(obj5, obj2, false, i);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                fb9Var.m11722Q(obj3, obj5, false, i);
            }
            this.f62379N = this.f62374I.m11728b(i113);
            int i210 = (-2) - i113;
            ei4 ei4Var6 = new ei4(-1, i, i210, -1);
            t56Var.m21850i(i210, new dq3(-1, this.f62397k - i3, i4));
            arrayList.add(ei4Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.f62397k;
            }
            wj3Var2 = new wj3(i5, arrayList4);
        } else {
            wj3Var2 = null;
        }
        m22146x(z, wj3Var2);
    }

    /* JADX INFO: renamed from: W */
    public final void m22104W() {
        m22103V(null, -127, 0, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m22105X(int i, wx6 wx6Var) {
        m22103V(wx6Var, i, 0, null);
    }

    /* JADX INFO: renamed from: Y */
    public final void m22106Y(int i, Object obj) {
        m22103V(obj, i, 0, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m22107Z() {
        m22103V(null, 125, 1, null);
        this.f62404r = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m22108a() {
        m22126j();
        this.f62395i.clear();
        this.f62400n.f53974b = 0;
        this.f62406t.f53974b = 0;
        this.f62410x.f53974b = 0;
        this.f62408v = null;
        j63 j63Var = this.f62380O;
        j63Var.f45109A.m15734S();
        j63Var.f45110z.m15734S();
        this.f62385T = 0L;
        this.f62366A = 0;
        this.f62404r = false;
        this.f62384S = false;
        this.f62411y = false;
        this.f62371F = false;
        this.f62412z = -1;
        bb9 bb9Var = this.f62372G;
        if (!bb9Var.f8287f) {
            bb9Var.m3559c();
        }
        if (this.f62374I.f38822w) {
            return;
        }
        m22147y();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m22109a0(Object obj, boolean z) {
        if (z) {
            bb9 bb9Var = this.f62372G;
            if (bb9Var.f8292k <= 0) {
                if ((bb9Var.f8283b[(bb9Var.f8288g * 5) + 1] & 1073741824) == 0) {
                    hi7.m13278a("Expected a node group");
                }
                bb9Var.m3577u();
                return;
            }
            return;
        }
        if (obj != null && this.f62372G.m3562f() != obj) {
            ze1 ze1Var = this.f62378M;
            ze1Var.getClass();
            ze1Var.m25567d(false);
            kz6 kz6Var = ze1Var.f71431b.f62837p;
            kz6Var.m15737V(cz6.f34737c);
            ss5.m21695V(kz6Var, 0, obj);
        }
        this.f62372G.m3577u();
    }

    /* JADX INFO: renamed from: b */
    public final void m22110b(Object obj, zi3 zi3Var) {
        if (this.f62384S) {
            kz6 kz6Var = this.f62380O.f45110z;
            kz6Var.m15737V(dz6.f36463c);
            ss5.m21695V(kz6Var, 0, obj);
            zi3Var.getClass();
            lda.m16119e(2, zi3Var);
            ss5.m21695V(kz6Var, 1, zi3Var);
            return;
        }
        ze1 ze1Var = this.f62378M;
        ze1Var.m25565b();
        kz6 kz6Var2 = ze1Var.f71431b.f62837p;
        kz6Var2.m15737V(dz6.f36463c);
        zi3Var.getClass();
        lda.m16119e(2, zi3Var);
        ss5.m21696W(kz6Var2, 0, obj, 1, zi3Var);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m22111b0(int i) {
        int i2;
        int i3;
        if (this.f62396j != null) {
            m22103V(null, i, 0, null);
            return;
        }
        if (this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f62385T = Long.rotateLeft(Long.rotateLeft(this.f62385T, 3) ^ ((long) i), 3) ^ ((long) this.f62399m);
        this.f62399m++;
        bb9 bb9Var = this.f62372G;
        boolean z = this.f62384S;
        p84 p84Var = we1.f66679a;
        if (z) {
            bb9Var.f8292k++;
            this.f62374I.m11722Q(p84Var, p84Var, false, i);
            m22146x(false, null);
            return;
        }
        if (bb9Var.m3563g() == i && ((i3 = bb9Var.f8288g) >= bb9Var.f8289h || (bb9Var.f8283b[(i3 * 5) + 1] & 536870912) == 0)) {
            bb9Var.m3577u();
            m22146x(false, null);
            return;
        }
        if (bb9Var.f8292k <= 0 && (i2 = bb9Var.f8288g) != bb9Var.f8289h) {
            int i4 = this.f62397k;
            m22094L();
            this.f62378M.m25568e(i4, bb9Var.m3575s());
            thb.m22045d(i2, bb9Var.f8288g, this.f62405s);
        }
        bb9Var.f8292k++;
        this.f62384S = true;
        this.f62376K = null;
        if (this.f62374I.f38822w) {
            fb9 fb9VarM4492h = this.f62373H.m4492h();
            this.f62374I = fb9VarM4492h;
            fb9VarM4492h.m11718M();
            this.f62375J = false;
            this.f62376K = null;
        }
        fb9 fb9Var = this.f62374I;
        fb9Var.m11730d();
        int i5 = fb9Var.f38819t;
        fb9Var.m11722Q(p84Var, p84Var, false, i);
        this.f62379N = fb9Var.m11728b(i5);
        m22146x(false, null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22112c(double d) {
        Object objM22089G = m22089G();
        if ((objM22089G instanceof Double) && d == ((Number) objM22089G).doubleValue()) {
            return false;
        }
        m22133m0(Double.valueOf(d));
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m22113c0(int i) {
        m22103V(null, i, 0, null);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22114d(float f) {
        Object objM22089G = m22089G();
        if ((objM22089G instanceof Float) && f == ((Number) objM22089G).floatValue()) {
            return false;
        }
        m22133m0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX INFO: renamed from: d0 */
    public final tj3 m22115d0(int i) {
        x18 x18Var;
        boolean z;
        m22111b0(i);
        boolean z2 = this.f62384S;
        m58 m58Var = this.f62393g;
        ArrayList arrayList = this.f62370E;
        pf1 pf1Var = this.f62394h;
        if (z2) {
            x18 x18Var2 = new x18(pf1Var);
            arrayList.add(x18Var2);
            m22133m0(x18Var2);
            x18Var2.f67643e = this.f62367B;
            x18Var2.f67640b &= -17;
            m58Var.m16642e();
            return this;
        }
        int i2 = this.f62372G.f8290i;
        ArrayList arrayList2 = this.f62405s;
        int iM22053l = thb.m22053l(i2, arrayList2);
        ja4 ja4Var = iM22053l >= 0 ? (ja4) arrayList2.remove(iM22053l) : null;
        Object objM3569m = this.f62372G.m3569m();
        if (fa4.m11650l(objM3569m, we1.f66679a)) {
            x18Var = new x18(pf1Var);
            m22133m0(x18Var);
        } else {
            objM3569m.getClass();
            x18Var = (x18) objM3569m;
        }
        if (ja4Var == null) {
            int i3 = x18Var.f67640b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                x18Var.f67640b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = x18Var.f67640b;
        x18Var.f67640b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(x18Var);
        x18Var.f67643e = this.f62367B;
        x18Var.f67640b &= -17;
        m58Var.m16642e();
        int i5 = x18Var.f67640b;
        if ((i5 & 256) != 0) {
            x18Var.f67640b = (i5 & (-257)) | 512;
            kz6 kz6Var = this.f62378M.f71431b.f62837p;
            kz6Var.m15737V(yy6.f70645c);
            ss5.m21695V(kz6Var, 0, x18Var);
            if (!this.f62411y) {
                int i6 = x18Var.f67640b;
                if ((i6 & 128) != 0) {
                    this.f62411y = true;
                    this.f62412z = this.f62372G.f8290i;
                    x18Var.f67640b = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22116e(int i) {
        Object objM22089G = m22089G();
        if ((objM22089G instanceof Integer) && i == ((Number) objM22089G).intValue()) {
            return false;
        }
        m22133m0(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m22117e0(Object obj) {
        if (!this.f62384S && this.f62372G.m3563g() == 207 && !fa4.m11650l(this.f62372G.m3562f(), obj) && this.f62412z < 0) {
            this.f62412z = this.f62372G.f8288g;
            this.f62411y = true;
        }
        m22103V(null, 207, 0, obj);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m22118f(long j) {
        Object objM22089G = m22089G();
        if ((objM22089G instanceof Long) && j == ((Number) objM22089G).longValue()) {
            return false;
        }
        m22133m0(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m22119f0() {
        m22103V(null, 125, 2, null);
        this.f62404r = true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m22120g(Object obj) {
        if (fa4.m11650l(m22089G(), obj)) {
            return false;
        }
        m22133m0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g0 */
    public final void m22121g0() {
        this.f62399m = 0;
        this.f62372G = this.f62389c.m4491g();
        m22103V(null, 100, 0, null);
        kf1 kf1Var = this.f62388b;
        kf1Var.mo1241t();
        l77 l77VarMo1230i = kf1Var.mo1230i();
        this.f62410x.m17840c(this.f62409w ? 1 : 0);
        this.f62409w = m22120g(l77VarMo1230i);
        this.f62376K = null;
        if (!this.f62403q) {
            this.f62403q = kf1Var.mo1226e();
        }
        if (!this.f62368C) {
            this.f62368C = kf1Var.mo1227f();
        }
        if (this.f62368C) {
            vh9 vh9Var = of1.f54263a;
            vh9Var.getClass();
            l77VarMo1230i = l77VarMo1230i.m15968d(vh9Var, new wh9(m22085C()));
        }
        this.f62407u = l77VarMo1230i;
        Set set = (Set) xwc.m24743P(l77VarMo1230i, x64.f67818a);
        if (set != null) {
            set.add(m22148z());
            kf1Var.mo1236o(set);
        }
        m22103V(null, Long.hashCode(kf1Var.mo1228g()), 0, null);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m22122h(boolean z) {
        Object objM22089G = m22089G();
        if ((objM22089G instanceof Boolean) && z == ((Boolean) objM22089G).booleanValue()) {
            return false;
        }
        m22133m0(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m22123h0(x18 x18Var, Object obj) {
        oj3 oj3Var = x18Var.f67641c;
        if (oj3Var == null) {
            return false;
        }
        int iM4489d = this.f62372G.f8282a.m4489d(r46.m20386k(oj3Var));
        if (!this.f62371F || iM4489d < this.f62372G.f8288g) {
            return false;
        }
        ArrayList arrayList = this.f62405s;
        int iM22053l = thb.m22053l(iM4489d, arrayList);
        if (iM22053l < 0) {
            int i = -(iM22053l + 1);
            if (!(obj instanceof gc2)) {
                obj = null;
            }
            arrayList.add(i, new ja4(x18Var, iM4489d, obj));
            return true;
        }
        ja4 ja4Var = (ja4) arrayList.get(iM22053l);
        if (!(obj instanceof gc2)) {
            ja4Var.f45335c = null;
            return true;
        }
        Object obj2 = ja4Var.f45335c;
        if (obj2 == null) {
            ja4Var.f45335c = obj;
            return true;
        }
        if (obj2 instanceof o66) {
            ((o66) obj2).m17811d(obj);
            return true;
        }
        o66 o66Var = pm8.f56484a;
        o66 o66Var2 = new o66(2);
        o66Var2.m17818k(obj2);
        o66Var2.m17818k(obj);
        ja4Var.f45335c = o66Var2;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22124i(Object obj) {
        if (m22089G() == obj) {
            return false;
        }
        m22133m0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    /* JADX INFO: renamed from: i0 */
    public final void m22125i0(n66 n66Var) {
        ArrayList arrayList = this.f62405s;
        for (int iM23602H = vz1.m23602H(arrayList); -1 < iM23602H; iM23602H--) {
            ja4 ja4Var = (ja4) arrayList.get(iM23602H);
            oj3 oj3Var = ja4Var.f45333a.f67641c;
            oj3 oj3VarM20386k = oj3Var != null ? r46.m20386k(oj3Var) : null;
            if (oj3VarM20386k == null || !oj3VarM20386k.m18039a()) {
                arrayList.remove(iM23602H);
            } else {
                int i = ja4Var.f45334b;
                int i2 = oj3VarM20386k.f54459a;
                if (i != i2) {
                    ja4Var.f45334b = i2;
                }
            }
        }
        Object[] objArr = n66Var.f52400b;
        Object[] objArr2 = n66Var.f52401c;
        long[] jArr = n66Var.f52399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            x18 x18Var = (x18) obj;
                            oj3 oj3Var2 = x18Var.f67641c;
                            if (oj3Var2 != null) {
                                int i7 = r46.m20386k(oj3Var2).f54459a;
                                if (obj2 == gr7.f41240e) {
                                    obj2 = null;
                                }
                                arrayList.add(new ja4(x18Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        x91.m24414t0(arrayList, thb.f62313i);
    }

    /* JADX INFO: renamed from: j */
    public final void m22126j() {
        this.f62396j = null;
        this.f62397k = 0;
        this.f62398l = 0;
        this.f62385T = 0L;
        this.f62404r = false;
        ze1 ze1Var = this.f62378M;
        ze1Var.f71432c = false;
        ze1Var.f71433d.f53974b = 0;
        ze1Var.f71435f = 0;
        ze1Var.f71434e = true;
        ze1Var.f71436g = 0;
        ze1Var.f71437h.clear();
        ze1Var.f71438i = -1;
        ze1Var.f71439j = -1;
        ze1Var.f71440k = -1;
        ze1Var.f71441l = 0;
        this.f62370E.clear();
        this.f62401o = null;
        this.f62402p = null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m22127j0(int i, int i2) {
        if (m22135n0(i) != i2) {
            if (i < 0) {
                r56 r56Var = this.f62402p;
                if (r56Var == null) {
                    r56Var = new r56();
                    this.f62402p = r56Var;
                }
                r56Var.m20411f(i, i2);
                return;
            }
            int[] iArr = this.f62401o;
            if (iArr == null) {
                iArr = new int[this.f62372G.f8284c];
                AbstractC3550rv.m20834b0(-1, 0, 6, iArr);
                this.f62401o = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m22128k(AbstractC0279g abstractC0279g) {
        return xwc.m24743P(m22132m(), abstractC0279g);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m22129k0(int i, int i2) {
        int iM22135n0 = m22135n0(i);
        if (iM22135n0 != i2) {
            int i3 = i2 - iM22135n0;
            ArrayList arrayList = this.f62395i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM22135n1 = m22135n0(i) + i3;
                m22127j0(i, iM22135n1);
                for (int i4 = size; -1 < i4; i4--) {
                    wj3 wj3Var = (wj3) arrayList.get(i4);
                    if (wj3Var != null && wj3Var.m24009a(i, iM22135n1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                bb9 bb9Var = this.f62372G;
                if (i < 0) {
                    i = bb9Var.f8290i;
                } else if (bb9Var.m3568l(i)) {
                    return;
                } else {
                    i = this.f62372G.m3573q(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22130l(ui3 ui3Var) {
        if (!this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f62404r = false;
        if (!this.f62384S) {
            cf1.m4605a("createNode() can only be called when inserting");
        }
        o84 o84Var = this.f62400n;
        int i = o84Var.f53973a[o84Var.f53974b - 1];
        fb9 fb9Var = this.f62374I;
        oj3 oj3VarM11728b = fb9Var.m11728b(fb9Var.f38821v);
        this.f62398l++;
        j63 j63Var = this.f62380O;
        kz6 kz6Var = j63Var.f45110z;
        kz6Var.m15737V(my6.f52038d);
        ss5.m21695V(kz6Var, 0, ui3Var);
        kz6Var.f48814B[kz6Var.f48815C - kz6Var.f48818z[kz6Var.f48813A - 1].f41551a] = i;
        ss5.m21695V(kz6Var, 1, oj3VarM11728b);
        kz6 kz6Var2 = j63Var.f45109A;
        kz6Var2.m15737V(my6.f52039e);
        kz6Var2.f48814B[kz6Var2.f48815C - kz6Var2.f48818z[kz6Var2.f48813A - 1].f41551a] = i;
        ss5.m21695V(kz6Var2, 0, oj3VarM11728b);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m22131l0(Object obj) {
        if (obj instanceof x48) {
            xj3 xj3Var = new xj3((x48) obj, this.f62399m - 1);
            if (this.f62384S) {
                kz6 kz6Var = this.f62378M.f71431b.f62837p;
                kz6Var.m15737V(ry6.f60041c);
                ss5.m21695V(kz6Var, 0, xj3Var);
            }
            this.f62390d.add(obj);
            obj = xj3Var;
        }
        m22133m0(obj);
    }

    /* JADX INFO: renamed from: m */
    public final l77 m22132m() {
        l77 l77Var;
        l77 l77Var2 = this.f62376K;
        if (l77Var2 != null) {
            return l77Var2;
        }
        int iM3573q = this.f62372G.f8290i;
        boolean z = this.f62384S;
        wx6 wx6Var = cf1.f9995c;
        if (z && this.f62375J) {
            int iM11710E = this.f62374I.f38821v;
            while (iM11710E > 0) {
                if (this.f62374I.m11744s(iM11710E) == 202 && fa4.m11650l(this.f62374I.m11745t(iM11710E), wx6Var)) {
                    Object objM11742q = this.f62374I.m11742q(iM11710E);
                    objM11742q.getClass();
                    l77 l77Var3 = (l77) objM11742q;
                    this.f62376K = l77Var3;
                    return l77Var3;
                }
                fb9 fb9Var = this.f62374I;
                iM11710E = fb9Var.m11710E(fb9Var.f38801b, iM11710E);
            }
        }
        if (this.f62372G.f8284c > 0) {
            while (iM3573q > 0) {
                if (this.f62372G.m3565i(iM3573q) == 202) {
                    bb9 bb9Var = this.f62372G;
                    if (fa4.m11650l(bb9Var.m3572p(bb9Var.f8283b, iM3573q), wx6Var)) {
                        t56 t56Var = this.f62408v;
                        if (t56Var == null || (l77Var = (l77) t56Var.m10152b(iM3573q)) == null) {
                            bb9 bb9Var2 = this.f62372G;
                            Object objM3558b = bb9Var2.m3558b(bb9Var2.f8283b, iM3573q);
                            objM3558b.getClass();
                            l77Var = (l77) objM3558b;
                        }
                        this.f62376K = l77Var;
                        return l77Var;
                    }
                }
                iM3573q = this.f62372G.m3573q(iM3573q);
            }
        }
        l77 l77Var4 = this.f62407u;
        this.f62376K = l77Var4;
        return l77Var4;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m22133m0(Object obj) {
        if (this.f62384S) {
            fb9 fb9Var = this.f62374I;
            if (fb9Var.f38813n <= 0 || fb9Var.f38808i == fb9Var.f38810k) {
                fb9Var.m11711F(obj);
                return;
            }
            t56 t56Var = fb9Var.f38818s;
            if (t56Var == null) {
                t56Var = new t56();
            }
            fb9Var.f38818s = t56Var;
            int i = fb9Var.f38821v;
            Object objM10152b = t56Var.m10152b(i);
            if (objM10152b == null) {
                objM10152b = new h66();
                t56Var.m21850i(i, objM10152b);
            }
            ((h66) objM10152b).m13090g(obj);
            return;
        }
        bb9 bb9Var = this.f62372G;
        boolean z = bb9Var.f8295n;
        ze1 ze1Var = this.f62378M;
        if (!z) {
            oj3 oj3VarM3557a = bb9Var.m3557a(bb9Var.f8290i);
            kz6 kz6Var = ze1Var.f71431b.f62837p;
            kz6Var.m15737V(zx6.f72343c);
            ss5.m21696W(kz6Var, 0, oj3VarM3557a, 1, obj);
            return;
        }
        int iM11011b = (bb9Var.f8293l - eb9.m11011b(bb9Var.f8283b, bb9Var.f8290i)) - 1;
        if (ze1Var.f71430a.f62372G.f8290i - ze1Var.f71435f >= 0) {
            ze1Var.m25567d(true);
            kz6 kz6Var2 = ze1Var.f71431b.f62837p;
            kz6Var2.m15737V(my6.f52041g);
            ss5.m21695V(kz6Var2, 0, obj);
            kz6Var2.f48814B[kz6Var2.f48815C - kz6Var2.f48818z[kz6Var2.f48813A - 1].f41551a] = iM11011b;
            return;
        }
        bb9 bb9Var2 = this.f62372G;
        oj3 oj3VarM3557a2 = bb9Var2.m3557a(bb9Var2.f8290i);
        kz6 kz6Var3 = ze1Var.f71431b.f62837p;
        kz6Var3.m15737V(my6.f52040f);
        ss5.m21696W(kz6Var3, 0, obj, 1, oj3VarM3557a2);
        kz6Var3.f48814B[kz6Var3.f48815C - kz6Var3.f48818z[kz6Var3.f48813A - 1].f41551a] = iM11011b;
    }

    /* JADX INFO: renamed from: n */
    public final qe1 m22134n() {
        Collection collection;
        if (!this.f62388b.mo1232k()) {
            return null;
        }
        ListBuilder listBuilderM23650t = vz1.m23650t();
        fb9 fb9Var = this.f62374I;
        listBuilderM23650t.addAll(lda.m16123i(fb9Var, null, fb9Var.f38819t, null));
        bb9 bb9Var = this.f62372G;
        boolean z = bb9Var.f8287f;
        int[] iArr = bb9Var.f8283b;
        if (z || bb9Var.f8284c == 0) {
            collection = EmptyList.f47638a;
        } else {
            d08 d08Var = new d08(bb9Var);
            int iM3573q = bb9Var.f8290i;
            Object objValueOf = Integer.valueOf(bb9Var.f8293l - eb9.m11011b(iArr, iM3573q));
            while (iM3573q >= 0) {
                d08Var.m21330v(bb9Var.m3565i(iM3573q), bb9Var.m3567k(iM3573q) ? bb9Var.m3572p(iArr, iM3573q) : we1.f66679a, bb9Var.f8282a.m4494j(iM3573q), objValueOf);
                objValueOf = bb9Var.m3557a(iM3573q);
                iM3573q = bb9Var.m3573q(iM3573q);
            }
            collection = (ArrayList) d08Var.f60774a;
        }
        listBuilderM23650t.addAll(collection);
        listBuilderM23650t.addAll(m22090H());
        return new qe1(vz1.m23635i(listBuilderM23650t), this.f62368C);
    }

    /* JADX INFO: renamed from: n0 */
    public final int m22135n0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f62401o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f62372G.m3571o(i) : i2;
        }
        r56 r56Var = this.f62402p;
        if (r56Var != null && r56Var.m20408c(i) >= 0) {
            int iM20408c = r56Var.m20408c(i);
            if (iM20408c >= 0) {
                return r56Var.f58763c[iM20408c];
            }
            uk9.m22775i(ux5.m22988k(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m22136o(n66 n66Var, zi3 zi3Var) {
        ArrayList arrayList = this.f62405s;
        if (this.f62371F) {
            cf1.m4605a("Reentrant composition is not supported");
        }
        this.f62393g.m16642e();
        Trace.beginSection("Compose:recompose");
        try {
            this.f62367B = Long.hashCode(nc9.m17358j().mo3582g());
            this.f62408v = null;
            m22125i0(n66Var);
            this.f62397k = 0;
            this.f62371F = true;
            try {
                m22121g0();
                Object objM22089G = m22089G();
                if (objM22089G != zi3Var && zi3Var != null) {
                    m22133m0(zi3Var);
                }
                sj3 sj3Var = this.f62369D;
                x66 x66VarM1253c = AbstractC0278f.m1253c();
                try {
                    x66VarM1253c.m24305c(sj3Var);
                    wx6 wx6Var = cf1.f9993a;
                    if (zi3Var != null) {
                        m22105X(200, wx6Var);
                        wfb.m23924s(this, zi3Var);
                        m22139q(false);
                    } else if (!this.f62409w || objM22089G == null || objM22089G.equals(we1.f66679a)) {
                        m22100S();
                    } else {
                        m22105X(200, wx6Var);
                        lda.m16119e(2, objM22089G);
                        wfb.m23924s(this, (zi3) objM22089G);
                        m22139q(false);
                    }
                    x66VarM1253c.m24314l(x66VarM1253c.f67832c - 1);
                    m22145w();
                    this.f62371F = false;
                    arrayList.clear();
                    if (!this.f62374I.f38822w) {
                        cf1.m4605a("Check failed");
                    }
                    m22147y();
                    Trace.endSection();
                } catch (Throwable th) {
                    x66VarM1253c.m24314l(x66VarM1253c.f67832c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    bna.m3988z0(th2, new qj3(this, 1));
                    throw th2;
                } catch (Throwable th3) {
                    this.f62371F = false;
                    arrayList.clear();
                    m22108a();
                    if (!this.f62374I.f38822w) {
                        cf1.m4605a("Check failed");
                    }
                    m22147y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m22137o0() {
        if (!this.f62404r) {
            cf1.m4605a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f62404r = false;
        if (this.f62384S) {
            cf1.m4605a("useNode() called while inserting");
        }
        bb9 bb9Var = this.f62372G;
        Object objM3570n = bb9Var.m3570n(bb9Var.f8290i);
        ze1 ze1Var = this.f62378M;
        ze1Var.m25566c();
        ze1Var.f71437h.add(objM3570n);
        if (this.f62411y && (objM3570n instanceof oe1)) {
            ze1Var.m25565b();
            ze1Var.f71431b.f62837p.m15737V(fz6.f39962c);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22138p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m22138p(this.f62372G.m3573q(i), i2);
        if (this.f62372G.m3568l(i)) {
            Object objM3570n = this.f62372G.m3570n(i);
            ze1 ze1Var = this.f62378M;
            ze1Var.m25566c();
            ze1Var.f71437h.add(objM3570n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX INFO: renamed from: q */
    public final void m22139q(boolean z) {
        long jRotateRight;
        o84 o84Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o84 o84Var2;
        int i7;
        o66 o66Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        o84 o84Var3 = this.f62400n;
        int i15 = o84Var3.f53973a[o84Var3.f53974b - 2] - 1;
        boolean z2 = this.f62384S;
        p84 p84Var = we1.f66679a;
        if (z2) {
            fb9 fb9Var = this.f62374I;
            int i16 = fb9Var.f38821v;
            int iM11744s = fb9Var.m11744s(i16);
            Object objM11745t = this.f62374I.m11745t(i16);
            Object objM11742q = this.f62374I.m11742q(i16);
            if (objM11745t != null) {
                jRotateRight2 = Long.rotateRight(this.f62385T, 3) ^ ((long) (objM11745t instanceof Enum ? ((Enum) objM11745t).ordinal() : objM11745t.hashCode()));
            } else if (objM11742q == null || iM11744s != 207 || objM11742q.equals(p84Var)) {
                jRotateRight2 = Long.rotateRight(this.f62385T ^ ((long) i15), 3) ^ ((long) iM11744s);
            } else {
                this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T ^ ((long) i15), 3) ^ ((long) objM11742q.hashCode()), 3);
            }
            this.f62385T = Long.rotateRight(jRotateRight2, 3);
        } else {
            bb9 bb9Var = this.f62372G;
            int i17 = bb9Var.f8290i;
            int iM3565i = bb9Var.m3565i(i17);
            bb9 bb9Var2 = this.f62372G;
            Object objM3572p = bb9Var2.m3572p(bb9Var2.f8283b, i17);
            bb9 bb9Var3 = this.f62372G;
            Object objM3558b = bb9Var3.m3558b(bb9Var3.f8283b, i17);
            if (objM3572p != null) {
                jRotateRight = Long.rotateRight(this.f62385T, 3) ^ ((long) (objM3572p instanceof Enum ? ((Enum) objM3572p).ordinal() : objM3572p.hashCode()));
            } else if (objM3558b == null || iM3565i != 207 || objM3558b.equals(p84Var)) {
                jRotateRight = Long.rotateRight(this.f62385T ^ ((long) i15), 3) ^ ((long) iM3565i);
            } else {
                this.f62385T = Long.rotateRight(Long.rotateRight(this.f62385T ^ ((long) i15), 3) ^ ((long) objM3558b.hashCode()), 3);
            }
            this.f62385T = Long.rotateRight(jRotateRight, 3);
        }
        int i18 = this.f62398l;
        wj3 wj3Var = this.f62396j;
        ArrayList arrayList4 = this.f62405s;
        ze1 ze1Var = this.f62378M;
        if (wj3Var != null) {
            t56 t56Var = wj3Var.f66930e;
            int i19 = wj3Var.f66927b;
            ArrayList arrayList5 = wj3Var.f66926a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = wj3Var.f66929d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i20 = 0; i20 < size; i20++) {
                    hashSet2.add(arrayList6.get(i20));
                }
                i = -1;
                o66 o66Var2 = pm8.f56484a;
                o66 o66Var3 = new o66();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size3) {
                    ei4 ei4Var = (ei4) arrayList5.get(i21);
                    if (hashSet2.contains(ei4Var)) {
                        o84Var2 = o84Var3;
                        i7 = i21;
                        if (!o66Var3.m723a(ei4Var)) {
                            int i24 = i22;
                            if (i24 < size2) {
                                ei4 ei4Var2 = (ei4) arrayList6.get(i24);
                                if (ei4Var2 != ei4Var) {
                                    dq3 dq3Var = (dq3) t56Var.m10152b(ei4Var2.f37283c);
                                    int i25 = dq3Var != null ? dq3Var.f36019b : -1;
                                    o66Var3.m17811d(ei4Var2);
                                    i10 = i23;
                                    if (i25 != i10) {
                                        dq3 dq3Var2 = (dq3) t56Var.m10152b(ei4Var2.f37283c);
                                        int i26 = dq3Var2 != null ? dq3Var2.f36020c : ei4Var2.f37284d;
                                        o66Var = o66Var3;
                                        int i27 = i25 + i19;
                                        i8 = size2;
                                        int i28 = i10 + i19;
                                        if (i26 > 0) {
                                            i9 = i19;
                                            int i29 = ze1Var.f71441l;
                                            if (i29 > 0) {
                                                arrayList2 = arrayList5;
                                                if (ze1Var.f71439j == i27 - i29 && ze1Var.f71440k == i28 - i29) {
                                                    ze1Var.f71441l = i29 + i26;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            ze1Var.m25566c();
                                            ze1Var.f71439j = i27;
                                            ze1Var.f71440k = i28;
                                            ze1Var.f71441l = i26;
                                        } else {
                                            i9 = i19;
                                            arrayList2 = arrayList5;
                                            ze1Var.getClass();
                                        }
                                        if (i25 <= i10) {
                                            int i30 = i26;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i25) {
                                                Object[] objArr5 = t56Var.f35145c;
                                                long[] jArr5 = t56Var.f35143a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j = jArr5[i31];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length)) >>> 31);
                                                            int i33 = 0;
                                                            while (i33 < i32) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    dq3 dq3Var3 = (dq3) objArr5[(i31 << 3) + i33];
                                                                    jArr2 = jArr5;
                                                                    int i34 = dq3Var3.f36019b;
                                                                    i13 = i25;
                                                                    if (i25 <= i34 && i34 < i13 + i30) {
                                                                        dq3Var3.f36019b = (i34 - i13) + i10;
                                                                    } else if (i13 + 1 <= i34 && i34 < i10) {
                                                                        dq3Var3.f36019b = i34 - i30;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i25;
                                                                }
                                                                j >>= 8;
                                                                i33++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i25 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i25;
                                                        }
                                                        if (i31 == length) {
                                                            break;
                                                        }
                                                        i31++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i25 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = t56Var.f35145c;
                                            long[] jArr6 = t56Var.f35143a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i35 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i35];
                                                    int i36 = i26;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i37 = 8 - ((~(i35 - length2)) >>> 31);
                                                        int i38 = 0;
                                                        while (i38 < i37) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i38;
                                                                dq3 dq3Var4 = (dq3) objArr6[(i35 << 3) + i38];
                                                                objArr4 = objArr6;
                                                                int i39 = dq3Var4.f36019b;
                                                                jArr4 = jArr6;
                                                                if (i25 <= i39 && i39 < i25 + i36) {
                                                                    dq3Var4.f36019b = (i39 - i25) + i10;
                                                                } else if (i10 <= i39 && i39 < i25) {
                                                                    dq3Var4.f36019b = i39 + i36;
                                                                }
                                                            } else {
                                                                i14 = i38;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i38 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i37 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i35 == length2) {
                                                        break;
                                                    }
                                                    i35++;
                                                    arrayList4 = arrayList4;
                                                    i26 = i36;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        o66Var = o66Var3;
                                        i8 = size2;
                                        i9 = i19;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    o66Var = o66Var3;
                                    i8 = size2;
                                    i9 = i19;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i23;
                                    i11 = i7 + 1;
                                }
                                i22 = i24 + 1;
                                dq3 dq3Var5 = (dq3) t56Var.m10152b(ei4Var2.f37283c);
                                int i40 = i10 + (dq3Var5 != null ? dq3Var5.f36020c : ei4Var2.f37284d);
                                i21 = i11;
                                wj3Var = wj3Var;
                                o66Var3 = o66Var;
                                size2 = i8;
                                i19 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i23 = i40;
                                o84Var3 = o84Var2;
                            } else {
                                i22 = i24;
                                o84Var3 = o84Var2;
                                i21 = i7;
                            }
                        }
                    } else {
                        o84Var2 = o84Var3;
                        dq3 dq3Var6 = (dq3) t56Var.m10152b(ei4Var.f37283c);
                        int i41 = dq3Var6 != null ? dq3Var6.f36019b : -1;
                        int i42 = ei4Var.f37283c;
                        i7 = i21;
                        ze1Var.m25568e(i41 + i19, ei4Var.f37284d);
                        wj3Var.m24009a(i42, 0);
                        ze1Var.f71435f = (i42 - ze1Var.f71430a.f62372G.f8288g) + ze1Var.f71435f;
                        this.f62372G.m3574r(i42);
                        m22094L();
                        this.f62372G.m3575s();
                        thb.m22045d(i42, this.f62372G.f8283b[(i42 * 5) + 3] + i42, arrayList4);
                    }
                    i21 = i7 + 1;
                    o84Var3 = o84Var2;
                }
                o84Var = o84Var3;
                arrayList = arrayList4;
                ze1Var.m25566c();
                if (arrayList5.size() > 0) {
                    bb9 bb9Var4 = this.f62372G;
                    ze1Var.f71435f = (bb9Var4.f8289h - ze1Var.f71430a.f62372G.f8288g) + ze1Var.f71435f;
                    bb9Var4.m3576t();
                }
            } else {
                o84Var = o84Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            o84Var = o84Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.f62384S;
        if (!z3) {
            bb9 bb9Var5 = this.f62372G;
            int i43 = bb9Var5.f8294m - bb9Var5.f8293l;
            if (i43 > 0) {
                if (i43 > 0) {
                    ze1Var.m25567d(false);
                    o84 o84Var4 = ze1Var.f71433d;
                    bb9 bb9Var6 = ze1Var.f71430a.f62372G;
                    if (bb9Var6.f8284c > 0 && o84Var4.m17838a(-2) != (i6 = bb9Var6.f8290i)) {
                        if (!ze1Var.f71432c && ze1Var.f71434e) {
                            ze1Var.m25567d(false);
                            ze1Var.f71431b.f62837p.m15737V(ly6.f50306c);
                            ze1Var.f71432c = true;
                        }
                        if (i6 > 0) {
                            oj3 oj3VarM3557a = bb9Var6.m3557a(i6);
                            o84Var4.m17840c(i6);
                            ze1Var.m25567d(false);
                            kz6 kz6Var = ze1Var.f71431b.f62837p;
                            kz6Var.m15737V(ky6.f48776c);
                            ss5.m21695V(kz6Var, 0, oj3VarM3557a);
                            ze1Var.f71432c = true;
                        }
                    }
                    kz6 kz6Var2 = ze1Var.f71431b.f62837p;
                    kz6Var2.m15737V(bz6.f9199c);
                    kz6Var2.f48814B[kz6Var2.f48815C - kz6Var2.f48818z[kz6Var2.f48813A - 1].f41551a] = i43;
                } else {
                    ze1Var.getClass();
                }
            }
        }
        int i44 = this.f62397k;
        while (true) {
            bb9 bb9Var7 = this.f62372G;
            if (bb9Var7.f8292k > 0 || (i5 = bb9Var7.f8288g) == bb9Var7.f8289h) {
                break;
            }
            m22094L();
            ze1Var.m25568e(i44, this.f62372G.m3575s());
            thb.m22045d(i5, this.f62372G.f8288g, arrayList);
        }
        if (z3) {
            if (z) {
                j63 j63Var = this.f62380O;
                kz6 kz6Var3 = j63Var.f45109A;
                if (kz6Var3.f48813A == 0) {
                    cf1.m4605a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                kz6 kz6Var4 = j63Var.f45110z;
                gz6[] gz6VarArr = kz6Var3.f48818z;
                int i45 = kz6Var3.f48813A - 1;
                kz6Var3.f48813A = i45;
                gz6 gz6Var = gz6VarArr[i45];
                gz6VarArr[i45] = null;
                kz6Var4.m15737V(gz6Var);
                Object[] objArr7 = kz6Var3.f48816D;
                Object[] objArr8 = kz6Var4.f48816D;
                int i46 = kz6Var4.f48817E;
                int i47 = gz6Var.f41552b;
                int i48 = kz6Var3.f48817E;
                int i49 = i48 - i47;
                System.arraycopy(objArr7, i49, objArr8, i46 - i47, i48 - i49);
                Object[] objArr9 = kz6Var3.f48816D;
                int i50 = kz6Var3.f48817E;
                Arrays.fill(objArr9, i50 - i47, i50, (Object) null);
                int[] iArr = kz6Var3.f48814B;
                int[] iArr2 = kz6Var4.f48814B;
                int i51 = kz6Var4.f48815C;
                int i52 = gz6Var.f41551a;
                int i53 = kz6Var3.f48815C;
                AbstractC3550rv.m20825S(i51 - i52, i53 - i52, i53, iArr, iArr2);
                kz6Var3.f48817E -= i47;
                kz6Var3.f48815C -= i52;
                i18 = 1;
            }
            bb9 bb9Var8 = this.f62372G;
            if (bb9Var8.f8292k <= 0) {
                hi7.m13278a("Unbalanced begin/end empty");
            }
            bb9Var8.f8292k--;
            fb9 fb9Var2 = this.f62374I;
            int i54 = fb9Var2.f38821v;
            fb9Var2.m11735j();
            if (this.f62372G.f8292k <= 0) {
                int i55 = (-2) - i54;
                this.f62374I.m11736k();
                this.f62374I.m11731e(true);
                oj3 oj3Var = this.f62379N;
                boolean zM15736U = this.f62380O.f45110z.m15736U();
                cb9 cb9Var = this.f62373H;
                if (zM15736U) {
                    ze1Var.m25565b();
                    ze1Var.m25567d(false);
                    o84 o84Var5 = ze1Var.f71433d;
                    bb9 bb9Var9 = ze1Var.f71430a.f62372G;
                    if (bb9Var9.f8284c <= 0 || o84Var5.m17838a(-2) == (i4 = bb9Var9.f8290i)) {
                        i3 = 1;
                    } else {
                        if (!ze1Var.f71432c && ze1Var.f71434e) {
                            ze1Var.m25567d(false);
                            ze1Var.f71431b.f62837p.m15737V(ly6.f50306c);
                            ze1Var.f71432c = true;
                        }
                        if (i4 > 0) {
                            oj3 oj3VarM3557a2 = bb9Var9.m3557a(i4);
                            o84Var5.m17840c(i4);
                            ze1Var.m25567d(false);
                            kz6 kz6Var5 = ze1Var.f71431b.f62837p;
                            kz6Var5.m15737V(ky6.f48776c);
                            ss5.m21695V(kz6Var5, 0, oj3VarM3557a2);
                            i3 = 1;
                            ze1Var.f71432c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    ze1Var.m25566c();
                    kz6 kz6Var6 = ze1Var.f71431b.f62837p;
                    kz6Var6.m15737V(ny6.f53409c);
                    ss5.m21696W(kz6Var6, 0, oj3Var, i3, cb9Var);
                    r3 = 0;
                } else {
                    j63 j63Var2 = this.f62380O;
                    ze1Var.m25565b();
                    ze1Var.m25567d(false);
                    o84 o84Var6 = ze1Var.f71433d;
                    bb9 bb9Var10 = ze1Var.f71430a.f62372G;
                    if (bb9Var10.f8284c > 0 && o84Var6.m17838a(-2) != (i2 = bb9Var10.f8290i)) {
                        if (!ze1Var.f71432c && ze1Var.f71434e) {
                            ze1Var.m25567d(false);
                            ze1Var.f71431b.f62837p.m15737V(ly6.f50306c);
                            ze1Var.f71432c = true;
                        }
                        if (i2 > 0) {
                            oj3 oj3VarM3557a3 = bb9Var10.m3557a(i2);
                            o84Var6.m17840c(i2);
                            ze1Var.m25567d(false);
                            kz6 kz6Var7 = ze1Var.f71431b.f62837p;
                            kz6Var7.m15737V(ky6.f48776c);
                            ss5.m21695V(kz6Var7, 0, oj3VarM3557a3);
                            ze1Var.f71432c = true;
                        }
                    }
                    ze1Var.m25566c();
                    kz6 kz6Var8 = ze1Var.f71431b.f62837p;
                    kz6Var8.m15737V(oy6.f55307c);
                    int i56 = kz6Var8.f48817E - kz6Var8.f48818z[kz6Var8.f48813A - 1].f41552b;
                    Object[] objArr10 = kz6Var8.f48816D;
                    objArr10[i56] = oj3Var;
                    objArr10[i56 + 1] = cb9Var;
                    objArr10[i56 + 2] = j63Var2;
                    this.f62380O = new j63();
                    r3 = 0;
                }
                this.f62384S = r3;
                if (this.f62389c.f9843b != 0) {
                    m22127j0(i55, r3);
                    m22129k0(i55, i18);
                }
            }
        } else {
            if (z) {
                ze1Var.m25564a();
            }
            int i57 = ze1Var.f71430a.f62372G.f8290i;
            o84 o84Var7 = ze1Var.f71433d;
            int i58 = i;
            if (o84Var7.m17838a(i58) > i57) {
                cf1.m4605a("Missed recording an endGroup");
            }
            if (o84Var7.m17838a(i58) == i57) {
                ze1Var.m25567d(false);
                o84Var7.m17839b();
                ze1Var.f71431b.f62837p.m15737V(hy6.f43205c);
            }
            int i59 = this.f62372G.f8290i;
            if (i18 != m22135n0(i59)) {
                m22129k0(i59, i18);
            }
            if (z) {
                i18 = 1;
            }
            this.f62372G.m3561e();
            ze1Var.m25566c();
        }
        ArrayList arrayList7 = this.f62395i;
        wj3 wj3Var2 = (wj3) arrayList7.remove(arrayList7.size() - 1);
        if (wj3Var2 != null && !z3) {
            wj3Var2.f66928c++;
        }
        this.f62396j = wj3Var2;
        this.f62397k = o84Var.m17839b() + i18;
        this.f62399m = o84Var.m17839b();
        this.f62398l = o84Var.m17839b() + i18;
    }

    /* JADX INFO: renamed from: r */
    public final void m22140r() {
        m22139q(false);
        x18 x18VarM22083A = m22083A();
        if (x18VarM22083A != null) {
            int i = x18VarM22083A.f67640b;
            if ((i & 1) != 0) {
                x18VarM22083A.f67640b = i | 2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m22141s() {
        m22139q(true);
    }

    /* JADX INFO: renamed from: t */
    public final void m22142t() {
        m22139q(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[EDGE_INSN: B:28:0x0082->B:29:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0082 A[SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public final x18 m22143u() {
        x18 x18Var;
        oj3 oj3VarM3557a;
        m85 m85Var;
        ArrayList arrayList = this.f62370E;
        int i = 1;
        x18 x18Var2 = !arrayList.isEmpty() ? (x18) arrayList.remove(arrayList.size() - 1) : null;
        if (x18Var2 != null) {
            x18Var2.f67640b &= -9;
            this.f62393g.m16642e();
            int i2 = this.f62367B;
            d66 d66Var = x18Var2.f67644f;
            if (d66Var == null || (x18Var2.f67640b & 16) != 0) {
                m85Var = null;
                break;
            }
            Object[] objArr = d66Var.f35035b;
            int[] iArr = d66Var.f35036c;
            long[] jArr = d66Var.f35034a;
            int length = jArr.length - 2;
            if (length < 0) {
                m85Var = null;
                break;
            }
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            if (iArr[i6] != i2) {
                                m85Var = new m85(x18Var2, i2, i, d66Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 == 8) {
                        if (i3 == length) {
                            i3++;
                        }
                    }
                    m85Var = null;
                    break;
                }
                if (i3 == length) {
                    m85Var = null;
                    break;
                }
                i3++;
            }
            ze1 ze1Var = this.f62378M;
            if (m85Var != null) {
                kz6 kz6Var = ze1Var.f71431b.f62837p;
                kz6Var.m15737V(gy6.f41525c);
                ss5.m21696W(kz6Var, 0, m85Var, 1, this.f62394h);
            }
            int i7 = x18Var2.f67640b;
            if ((i7 & 512) != 0) {
                x18Var2.f67640b = i7 & (-513);
                kz6 kz6Var2 = ze1Var.f71431b.f62837p;
                kz6Var2.m15737V(jy6.f46392c);
                ss5.m21695V(kz6Var2, 0, x18Var2);
                int i8 = x18Var2.f67640b;
                x18Var2.f67640b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    x18Var2.f67640b = i8 & (-1153);
                    if (this.f62412z == this.f62372G.f8290i) {
                        this.f62411y = false;
                        this.f62412z = -1;
                    }
                }
            }
        }
        if (x18Var2 != null) {
            int i9 = x18Var2.f67640b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.f62403q)) {
                if (x18Var2.f67641c == null) {
                    if (this.f62384S) {
                        fb9 fb9Var = this.f62374I;
                        oj3VarM3557a = fb9Var.m11728b(fb9Var.f38821v);
                    } else {
                        bb9 bb9Var = this.f62372G;
                        oj3VarM3557a = bb9Var.m3557a(bb9Var.f8290i);
                    }
                    x18Var2.f67641c = oj3VarM3557a;
                }
                x18Var2.f67640b &= -5;
                x18Var = x18Var2;
            } else {
                x18Var = null;
            }
        } else {
            x18Var = null;
        }
        m22139q(false);
        return x18Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m22144v() {
        if (this.f62371F || this.f62412z != 0) {
            hi7.m13278a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f62412z = -1;
        this.f62411y = false;
    }

    /* JADX INFO: renamed from: w */
    public final void m22145w() {
        m22139q(false);
        this.f62388b.mo1224c();
        m22139q(false);
        ze1 ze1Var = this.f62378M;
        if (ze1Var.f71432c) {
            ze1Var.m25567d(false);
            ze1Var.m25567d(false);
            ze1Var.f71431b.f62837p.m15737V(hy6.f43205c);
            ze1Var.f71432c = false;
        }
        ze1Var.m25565b();
        if (ze1Var.f71433d.f53974b != 0) {
            cf1.m4605a("Missed recording an endGroup()");
        }
        if (!this.f62395i.isEmpty()) {
            cf1.m4605a("Start/end imbalance");
        }
        m22126j();
        this.f62372G.m3559c();
        this.f62409w = this.f62410x.m17839b() != 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m22146x(boolean z, wj3 wj3Var) {
        this.f62395i.add(this.f62396j);
        this.f62396j = wj3Var;
        int i = this.f62398l;
        o84 o84Var = this.f62400n;
        o84Var.m17840c(i);
        o84Var.m17840c(this.f62399m);
        o84Var.m17840c(this.f62397k);
        if (z) {
            this.f62397k = 0;
        }
        this.f62398l = 0;
        this.f62399m = 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m22147y() {
        cb9 cb9Var = new cb9();
        if (this.f62368C) {
            cb9Var.m4490f();
        }
        if (this.f62388b.mo1225d()) {
            cb9Var.f9852k = new t56();
        }
        this.f62373H = cb9Var;
        fb9 fb9VarM4492h = cb9Var.m4492h();
        fb9VarM4492h.m11731e(true);
        this.f62374I = fb9VarM4492h;
    }

    /* JADX INFO: renamed from: z */
    public final mf1 m22148z() {
        uj3 uj3Var = this.f62386U;
        if (uj3Var != null) {
            return uj3Var;
        }
        uj3 uj3Var2 = new uj3(this.f62394h);
        this.f62386U = uj3Var2;
        return uj3Var2;
    }
}
