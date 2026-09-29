package p000;

import android.os.Trace;
import androidx.collection.AbstractC0042e;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.collection.C0275a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes.dex */
public final class pf1 implements jf1 {

    /* JADX INFO: renamed from: H */
    public final n66 f56027H;

    /* JADX INFO: renamed from: I */
    public n66 f56028I;

    /* JADX INFO: renamed from: J */
    public boolean f56029J;

    /* JADX INFO: renamed from: K */
    public j69 f56030K;

    /* JADX INFO: renamed from: L */
    public i67 f56031L;

    /* JADX INFO: renamed from: M */
    public pf1 f56032M;

    /* JADX INFO: renamed from: N */
    public int f56033N;

    /* JADX INFO: renamed from: O */
    public final m58 f56034O;

    /* JADX INFO: renamed from: P */
    public final v48 f56035P;

    /* JADX INFO: renamed from: Q */
    public final tj3 f56036Q;

    /* JADX INFO: renamed from: R */
    public int f56037R;

    /* JADX INFO: renamed from: a */
    public final kf1 f56038a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3517r f56039b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f56040c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final Object f56041d = new Object();

    /* JADX INFO: renamed from: e */
    public final q66 f56042e;

    /* JADX INFO: renamed from: f */
    public final cb9 f56043f;

    /* JADX INFO: renamed from: g */
    public final n66 f56044g;

    /* JADX INFO: renamed from: h */
    public final o66 f56045h;

    /* JADX INFO: renamed from: i */
    public final o66 f56046i;

    /* JADX INFO: renamed from: j */
    public final n66 f56047j;

    /* JADX INFO: renamed from: k */
    public final tt0 f56048k;

    /* JADX INFO: renamed from: l */
    public final tt0 f56049l;

    public pf1(kf1 kf1Var, AbstractC3517r abstractC3517r) {
        this.f56038a = kf1Var;
        this.f56039b = abstractC3517r;
        q66 q66Var = new q66(new o66());
        this.f56042e = q66Var;
        cb9 cb9Var = new cb9();
        if (kf1Var.mo1225d()) {
            cb9Var.f9852k = new t56();
        }
        if (kf1Var.mo1227f()) {
            cb9Var.m4490f();
        }
        this.f56043f = cb9Var;
        this.f56044g = fa4.m11654p();
        this.f56045h = new o66();
        this.f56046i = new o66();
        this.f56047j = fa4.m11654p();
        tt0 tt0Var = new tt0();
        this.f56048k = tt0Var;
        tt0 tt0Var2 = new tt0();
        this.f56049l = tt0Var2;
        this.f56027H = fa4.m11654p();
        this.f56028I = fa4.m11654p();
        m58 m58Var = new m58(kf1Var, 13);
        this.f56034O = m58Var;
        this.f56035P = new v48();
        tj3 tj3Var = new tj3(abstractC3517r, kf1Var, eb9.m11013d(cb9Var), q66Var, tt0Var, tt0Var2, m58Var, this);
        kf1Var.mo1237p(tj3Var);
        this.f56036Q = tj3Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m19085A(zi3 zi3Var) {
        boolean zM19094j = m19094j();
        m19101q();
        kf1 kf1Var = this.f56038a;
        if (!zM19094j) {
            kf1Var.mo1222a(this, zi3Var);
            return;
        }
        tj3 tj3Var = this.f56036Q;
        tj3Var.f62412z = 0;
        tj3Var.f62411y = true;
        kf1Var.mo1222a(this, zi3Var);
        tj3Var.m22144v();
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: a */
    public final void mo1823a() {
        synchronized (this.f56041d) {
            try {
                if (this.f56036Q.f62371F) {
                    hi7.m13279b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f56037R != 3) {
                    this.f56037R = 3;
                    tt0 tt0Var = this.f56036Q.f62377L;
                    if (tt0Var != null) {
                        m19090f(tt0Var);
                    }
                    boolean z = this.f56043f.f9843b == 0;
                    if (!z || !this.f56042e.f57324a.m724b()) {
                        v48 v48Var = this.f56035P;
                        try {
                            v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                            if (!z) {
                                cb9 cb9Var = this.f56043f;
                                v48 v48Var2 = this.f56035P;
                                fb9 fb9VarM4492h = cb9Var.m4492h();
                                try {
                                    fb9VarM4492h.m11739n(fb9VarM4492h.f38819t, new C3186kj(v48Var2, 2));
                                    fb9VarM4492h.m11713H();
                                    fb9VarM4492h.m11731e(true);
                                    this.f56039b.m20226b();
                                    this.f56039b.mo4607m();
                                    v48Var.m23102e();
                                } catch (Throwable th) {
                                    fb9VarM4492h.m11731e(false);
                                    throw th;
                                }
                            }
                            v48Var.m23101d();
                            v48Var.m23098a();
                        } catch (Throwable th2) {
                            v48Var.m23098a();
                            throw th2;
                        }
                    }
                    tj3 tj3Var = this.f56036Q;
                    tj3Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        tj3Var.f62388b.mo1242u(tj3Var);
                        tj3Var.f62370E.clear();
                        tj3Var.f62405s.clear();
                        tj3Var.f62391e.f62837p.m15734S();
                        tj3Var.f62408v = null;
                        tj3Var.f62387a.m20226b();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f56038a.mo1243v(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m19086b() {
        this.f56040c.set(null);
        this.f56048k.f62837p.m15734S();
        this.f56049l.f62837p.m15734S();
        q66 q66Var = this.f56042e;
        if (q66Var.f57324a.m724b()) {
            return;
        }
        v48 v48Var = this.f56035P;
        try {
            v48Var.m23105i(q66Var, this.f56036Q.m22085C());
            v48Var.m23101d();
        } finally {
            v48Var.m23098a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19087c(Object obj, boolean z) {
        Object objM17255g = this.f56044g.m17255g(obj);
        if (objM17255g == null) {
            return;
        }
        boolean z2 = objM17255g instanceof o66;
        o66 o66Var = this.f56045h;
        o66 o66Var2 = this.f56046i;
        n66 n66Var = this.f56027H;
        if (!z2) {
            x18 x18Var = (x18) objM17255g;
            if (fa4.m11632F(n66Var, obj, x18Var) || x18Var.m24236b(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (x18Var.f67645g == null || z) {
                o66Var.m17811d(x18Var);
                return;
            } else {
                o66Var2.m17811d(x18Var);
                return;
            }
        }
        o66 o66Var3 = (o66) objM17255g;
        Object[] objArr = o66Var3.f1303b;
        long[] jArr = o66Var3.f1302a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x18 x18Var2 = (x18) objArr[(i << 3) + i3];
                        if (!fa4.m11632F(n66Var, obj, x18Var2) && x18Var2.m24236b(obj) != InvalidationResult.IGNORED) {
                            if (x18Var2.f67645g == null || z) {
                                o66Var.m17811d(x18Var2);
                            } else {
                                o66Var2.m17811d(x18Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final void m19088d(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM723a;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zM724b;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof C0275a;
        n66 n66Var = this.f56047j;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            AbstractC0042e abstractC0042e = ((C0275a) set).f3738a;
            Object[] objArr = abstractC0042e.f1303b;
            long[] jArr9 = abstractC0042e.f1302a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof x18) {
                                    ((x18) obj2).m24236b(obj);
                                } else {
                                    m19087c(obj2, z);
                                    Object objM17255g = n66Var.m17255g(obj2);
                                    if (objM17255g != null) {
                                        if (objM17255g instanceof o66) {
                                            o66 o66Var = (o66) objM17255g;
                                            Object[] objArr2 = o66Var.f1303b;
                                            long[] jArr10 = o66Var.f1302a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                m19087c((gc2) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            m19087c((gc2) objM17255g, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof x18) {
                    ((x18) obj3).m24236b(null);
                } else {
                    m19087c(obj3, z);
                    Object objM17255g2 = n66Var.m17255g(obj3);
                    if (objM17255g2 != null) {
                        if (objM17255g2 instanceof o66) {
                            o66 o66Var2 = (o66) objM17255g2;
                            Object[] objArr3 = o66Var2.f1303b;
                            long[] jArr12 = o66Var2.f1302a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                m19087c((gc2) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            m19087c((gc2) objM17255g2, z);
                        }
                    }
                }
            }
        }
        n66 n66Var2 = this.f56044g;
        o66 o66Var3 = this.f56045h;
        if (z) {
            o66 o66Var4 = this.f56046i;
            if (o66Var4.m725c()) {
                long[] jArr13 = n66Var2.f52399a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = n66Var2.f52400b[i18];
                                    Object obj5 = n66Var2.f52401c[i18];
                                    if (obj5 instanceof o66) {
                                        o66 o66Var5 = (o66) obj5;
                                        Object[] objArr4 = o66Var5.f1303b;
                                        long[] jArr14 = o66Var5.f1302a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            x18 x18Var = (x18) objArr5[i22];
                                                            if (o66Var4.m723a(x18Var) || o66Var3.m723a(x18Var)) {
                                                                o66Var5.m17820m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zM724b = o66Var5.m724b();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        x18 x18Var2 = (x18) obj5;
                                        zM724b = o66Var4.m723a(x18Var2) || o66Var3.m723a(x18Var2);
                                    }
                                    if (zM724b) {
                                        n66Var2.m17260l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                o66Var4.m17812e();
                m19093i();
                return;
            }
        }
        if (o66Var3.m725c()) {
            long[] jArr16 = n66Var2.f52399a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = n66Var2.f52400b[i26];
                                Object obj7 = n66Var2.f52401c[i26];
                                if (obj7 instanceof o66) {
                                    o66 o66Var6 = (o66) obj7;
                                    Object[] objArr6 = o66Var6.f1303b;
                                    long[] jArr17 = o66Var6.f1302a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (o66Var3.m723a((x18) objArr7[i30])) {
                                                            o66Var6.m17820m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zM723a = o66Var6.m724b();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zM723a = o66Var3.m723a((x18) obj7);
                                }
                                if (zM723a) {
                                    n66Var2.m17260l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            m19093i();
            o66Var3.m17812e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19089e() {
        synchronized (this.f56041d) {
            try {
                m19090f(this.f56048k);
                m19099o();
            } catch (Throwable th) {
                try {
                    if (!this.f56042e.f57324a.m724b()) {
                        v48 v48Var = this.f56035P;
                        try {
                            v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                            v48Var.m23101d();
                        } finally {
                            v48Var.m23098a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m19086b();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x013a A[EDGE_INSN: B:164:0x013a->B:82:0x013a BREAK  A[LOOP:2: B:140:0x00ed->B:80:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0130 A[Catch: all -> 0x0120, LOOP:2: B:140:0x00ed->B:80:0x0130, LOOP_END, TryCatch #1 {all -> 0x0120, blocks: (B:64:0x00ed, B:66:0x00fc, B:68:0x0106, B:70:0x010c, B:72:0x011c, B:76:0x0125, B:82:0x013a, B:90:0x015c, B:93:0x016f, B:80:0x0130, B:85:0x0144, B:99:0x018d, B:101:0x0199), top: B:140:0x00ed }] */
    /* JADX INFO: renamed from: f */
    public final void m19090f(tt0 tt0Var) throws Throwable {
        InterfaceC3510qt interfaceC3510qt;
        v48 v48Var;
        v48 v48Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        v48 v48Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM724b;
        long j3;
        tt0 tt0Var2 = this.f56049l;
        tj3 tj3Var = this.f56036Q;
        nf1 nf1VarM22085C = tj3Var.m22085C();
        v48 v48Var4 = this.f56035P;
        v48Var4.m23105i(this.f56042e, nf1VarM22085C);
        try {
            if (tt0Var.f62837p.m15736U()) {
                try {
                    if (tt0Var2.f62837p.m15736U() && this.f56031L == null) {
                        v48Var4.m23101d();
                    }
                    return;
                } finally {
                    v48Var4.m23098a();
                }
            }
            i67 i67Var = this.f56031L;
            if (i67Var == null || (interfaceC3510qt = i67Var.f43605l) == null) {
                interfaceC3510qt = this.f56039b;
            }
            try {
                Trace.beginSection(interfaceC3510qt.equals(i67Var != null ? i67Var.f43605l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    i67 i67Var2 = this.f56031L;
                    if (i67Var2 == null || (v48Var = i67Var2.f43604k) == null) {
                        v48Var = v48Var4;
                    }
                    cb9 cb9Var = this.f56043f;
                    nf1 nf1VarM22085C2 = tj3Var.m22085C();
                    fb9 fb9VarM4492h = eb9.m11013d(cb9Var).m4492h();
                    int i3 = 0;
                    try {
                        tt0Var.m22298I(interfaceC3510qt, fb9VarM4492h, v48Var, nf1VarM22085C2);
                        fb9VarM4492h.m11731e(true);
                        interfaceC3510qt.mo4607m();
                        Trace.endSection();
                        v48Var4.m23102e();
                        v48Var4.m23103f();
                        if (this.f56029J) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f56029J = false;
                                n66 n66Var = this.f56044g;
                                long[] jArr3 = n66Var.f52399a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = n66Var.f52400b[i8];
                                                    Object obj2 = n66Var.f52401c[i8];
                                                    if (obj2 instanceof o66) {
                                                        o66 o66Var = (o66) obj2;
                                                        Object[] objArr = o66Var.f1303b;
                                                        long[] jArr4 = o66Var.f1302a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        v48Var3 = v48Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((x18) objArr[i13]).m24235a()) {
                                                                                    o66Var.m17820m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM724b = o66Var.m724b();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        v48Var3 = v48Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zM724b = !((x18) obj2).m24235a();
                                                    }
                                                    if (zM724b) {
                                                        n66Var.m17260l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    v48Var3 = v48Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                v48Var4 = v48Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            v48Var2 = v48Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            v48Var2 = v48Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        v48Var4 = v48Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    v48Var2 = v48Var4;
                                }
                                m19093i();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            v48Var2 = v48Var4;
                        }
                        try {
                            if (tt0Var2.f62837p.m15736U() && this.f56031L == null) {
                                v48Var2.m23101d();
                            }
                            return;
                        } finally {
                            v48Var2.m23098a();
                        }
                    } catch (Throwable th3) {
                        try {
                            fb9VarM4492h.m11731e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (tt0Var2.f62837p.m15736U() && this.f56031L == null) {
                v48Var4.m23101d();
            }
            throw th;
        } finally {
            v48Var4.m23098a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19091g() {
        synchronized (this.f56041d) {
            try {
                tt0 tt0Var = this.f56049l;
                tt0Var.getClass();
                if (!tt0Var.f62837p.m15736U()) {
                    m19090f(this.f56049l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f56042e.f57324a.m724b()) {
                        v48 v48Var = this.f56035P;
                        try {
                            v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                            v48Var.m23101d();
                        } finally {
                            v48Var.m23098a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m19086b();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m19092h() {
        synchronized (this.f56041d) {
            try {
                this.f56036Q.f62408v = null;
                if (!this.f56042e.f57324a.m724b()) {
                    v48 v48Var = this.f56035P;
                    try {
                        v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                        v48Var.m23101d();
                        v48Var.m23098a();
                    } catch (Throwable th) {
                        v48Var.m23098a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f56042e.f57324a.m724b()) {
                        v48 v48Var2 = this.f56035P;
                        try {
                            v48Var2.m23105i(this.f56042e, this.f56036Q.m22085C());
                            v48Var2.m23101d();
                        } finally {
                            v48Var2.m23098a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    m19086b();
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m19093i() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM724b;
        int i4;
        int i5;
        n66 n66Var = this.f56047j;
        long[] jArr3 = n66Var.f52399a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = n66Var.f52400b[i10];
                            Object obj2 = n66Var.f52401c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof o66;
                            j5 = j8;
                            n66 n66Var2 = this.f56044g;
                            if (z) {
                                o66 o66Var = (o66) obj2;
                                Object[] objArr = o66Var.f1303b;
                                long[] jArr4 = o66Var.f1302a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!n66Var2.m17251c((gc2) objArr[i15])) {
                                                        o66Var.m17820m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM724b = o66Var.m724b();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zM724b = !n66Var2.m17251c((gc2) obj2);
                            }
                            if (zM724b) {
                                n66Var.m17260l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        o66 o66Var2 = this.f56046i;
        if (!o66Var2.m725c()) {
            return;
        }
        Object[] objArr2 = o66Var2.f1303b;
        long[] jArr5 = o66Var2.f1302a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((x18) objArr2[i20]).f67645g == null) {
                            o66Var2.m17820m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19094j() {
        boolean z;
        synchronized (this.f56041d) {
            z = true;
            if (this.f56037R != 1) {
                z = false;
            }
            if (z) {
                this.f56037R = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final void m19095k(zi3 zi3Var) {
        try {
            synchronized (this.f56041d) {
                m19098n();
                n66 n66Var = this.f56028I;
                this.f56028I = fa4.m11654p();
                try {
                    tj3 tj3Var = this.f56036Q;
                    j69 j69Var = this.f56030K;
                    if (!tj3Var.f62391e.f62837p.m15736U()) {
                        cf1.m4605a("Expected applyChanges() to have been called");
                    }
                    tj3Var.f62381P = j69Var;
                    try {
                        tj3Var.m22136o(n66Var, zi3Var);
                        tj3Var.f62381P = null;
                    } catch (Throwable th) {
                        tj3Var.f62381P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f56028I = n66Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f56042e.f57324a.m724b()) {
                    v48 v48Var = this.f56035P;
                    try {
                        v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                        v48Var.m23101d();
                    } finally {
                        v48Var.m23098a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m19086b();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final i67 m19096l(boolean z, zi3 zi3Var) {
        if (this.f56031L != null) {
            hi7.m13279b("A pausable composition is in progress");
        }
        i67 i67Var = new i67(this, this.f56038a, this.f56036Q, this.f56042e, zi3Var, z, this.f56039b, this.f56041d);
        this.f56031L = i67Var;
        return i67Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m19097m() {
        synchronized (this.f56041d) {
            try {
                if (this.f56031L != null) {
                    hi7.m13279b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f56043f.f9843b == 0;
                if (!z || !this.f56042e.f57324a.m724b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        v48 v48Var = this.f56035P;
                        try {
                            v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                            if (!z) {
                                cb9 cb9Var = this.f56043f;
                                v48 v48Var2 = this.f56035P;
                                fb9 fb9VarM4492h = cb9Var.m4492h();
                                try {
                                    fb9VarM4492h.m11739n(fb9VarM4492h.f38819t, new C3794yf(7, v48Var2, fb9VarM4492h));
                                    fb9VarM4492h.m11731e(true);
                                    this.f56039b.mo4607m();
                                    v48Var.m23102e();
                                } catch (Throwable th) {
                                    fb9VarM4492h.m11731e(false);
                                    throw th;
                                }
                            }
                            v48Var.m23101d();
                            v48Var.m23098a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            v48Var.m23098a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f56044g.m17249a();
                this.f56047j.m17249a();
                this.f56028I.m17249a();
                this.f56048k.f62837p.m15734S();
                this.f56049l.f62837p.m15734S();
                tj3 tj3Var = this.f56036Q;
                tj3Var.f62370E.clear();
                tj3Var.f62405s.clear();
                tj3Var.f62391e.f62837p.m15734S();
                tj3Var.f62408v = null;
                this.f56037R = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m19098n() {
        Object obj = pb1.f55915c;
        AtomicReference atomicReference = this.f56040c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                cf1.m4606b("pending composition has not been applied");
                C3386nv.m17631r();
                return;
            }
            if (andSet instanceof Set) {
                m19088d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                cf1.m4606b("corrupt pendingModifications drain: " + atomicReference);
                C3386nv.m17631r();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m19088d(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m19099o() {
        AtomicReference atomicReference = this.f56040c;
        Object andSet = atomicReference.getAndSet(null);
        if (fa4.m11650l(andSet, pb1.f55915c)) {
            return;
        }
        if (andSet instanceof Set) {
            m19088d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m19088d(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f56031L == null) {
                cf1.m4605a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            cf1.m4606b("corrupt pendingModifications drain: " + atomicReference);
            C3386nv.m17631r();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m19100p() {
        EmptySet emptySet = EmptySet.f47640a;
        AtomicReference atomicReference = this.f56040c;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (fa4.m11650l(andSet, pb1.f55915c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m19088d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            cf1.m4606b("corrupt pendingModifications drain: " + atomicReference);
            C3386nv.m17631r();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m19088d(set, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19101q() {
        String str;
        int i = this.f56037R;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            hi7.m13279b(str);
        }
        if (this.f56031L == null) {
            return;
        }
        hi7.m13279b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: r */
    public final void m19102r(ArrayList arrayList) {
        q66 q66Var = this.f56042e;
        tj3 tj3Var = this.f56036Q;
        if (arrayList.size() > 0) {
            ((z36) ((Pair) arrayList.get(0)).f47623a).getClass();
            throw null;
        }
        try {
            tj3Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    tj3Var.m22087E(arrayList);
                    tj3Var.m22126j();
                    Trace.endSection();
                } catch (Throwable th) {
                    tj3Var.m22108a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!q66Var.f57324a.m724b()) {
                    v48 v48Var = this.f56035P;
                    try {
                        v48Var.m23105i(q66Var, tj3Var.m22085C());
                        v48Var.m23101d();
                    } finally {
                        v48Var.m23098a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m19086b();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final InvalidationResult m19103s(x18 x18Var, Object obj) {
        pf1 pf1Var;
        int i = x18Var.f67640b;
        if ((i & 2) != 0) {
            x18Var.f67640b = i | 4;
        }
        oj3 oj3Var = x18Var.f67641c;
        if (oj3Var == null || !oj3Var.m18039a()) {
            return InvalidationResult.IGNORED;
        }
        cb9 cb9Var = this.f56043f;
        cb9Var.getClass();
        oj3 oj3Var2 = x18Var.f67641c;
        if (oj3Var2 != null && cb9Var.m4493i(r46.m20386k(oj3Var2))) {
            if (x18Var.f67642d == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult invalidationResultM19104t = m19104t(x18Var, oj3Var, obj);
            if (invalidationResultM19104t != InvalidationResult.IGNORED) {
                this.f56034O.m16642e();
            }
            return invalidationResultM19104t;
        }
        synchronized (this.f56041d) {
            pf1Var = this.f56032M;
        }
        if (pf1Var != null) {
            tj3 tj3Var = pf1Var.f56036Q;
            if (tj3Var.f62371F && tj3Var.m22123h0(x18Var, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final InvalidationResult m19104t(x18 x18Var, oj3 oj3Var, Object obj) {
        synchronized (this.f56041d) {
            try {
                pf1 pf1Var = this.f56032M;
                pf1 pf1Var2 = null;
                if (pf1Var != null) {
                    cb9 cb9Var = this.f56043f;
                    int i = this.f56033N;
                    if (cb9Var.f9848g) {
                        cf1.m4605a("Writer is active");
                    }
                    if (i < 0 || i >= cb9Var.f9843b) {
                        cf1.m4605a("Invalid group index");
                    }
                    oj3 oj3VarM20386k = r46.m20386k(oj3Var);
                    if (cb9Var.m4493i(oj3VarM20386k)) {
                        int i2 = cb9Var.f9842a[(i * 5) + 3] + i;
                        int i3 = oj3VarM20386k.f54459a;
                        if (i > i3 || i3 >= i2) {
                            pf1Var = null;
                        }
                    } else {
                        pf1Var = null;
                    }
                    pf1Var2 = pf1Var;
                }
                if (pf1Var2 == null) {
                    tj3 tj3Var = this.f56036Q;
                    if (tj3Var.f62371F && tj3Var.m22123h0(x18Var, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof gc2;
                        n66 n66Var = this.f56028I;
                        if (z) {
                            Object objM17255g = n66Var.m17255g(x18Var);
                            if (objM17255g == null) {
                                fa4.m11645g(this.f56028I, x18Var, obj);
                                break;
                            }
                            if (objM17255g instanceof o66) {
                                o66 o66Var = (o66) objM17255g;
                                Object[] objArr = o66Var.f1303b;
                                long[] jArr = o66Var.f1302a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    fa4.m11645g(this.f56028I, x18Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == gr7.f41240e) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        fa4.m11645g(this.f56028I, x18Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        fa4.m11645g(this.f56028I, x18Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objM17255g != gr7.f41240e) {
                                    fa4.m11645g(this.f56028I, x18Var, obj);
                                    break;
                                }
                            }
                        } else {
                            n66Var.m17261m(x18Var, gr7.f41240e);
                        }
                    } else {
                        this.f56028I.m17261m(x18Var, gr7.f41240e);
                    }
                }
                if (pf1Var2 != null) {
                    return pf1Var2.m19104t(x18Var, oj3Var, obj);
                }
                this.f56038a.mo1233l(this);
                return this.f56036Q.f62371F ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m19105u(Object obj) {
        Object objM17255g = this.f56044g.m17255g(obj);
        if (objM17255g == null) {
            return;
        }
        boolean z = objM17255g instanceof o66;
        n66 n66Var = this.f56027H;
        if (!z) {
            x18 x18Var = (x18) objM17255g;
            if (x18Var.m24236b(obj) == InvalidationResult.IMMINENT) {
                fa4.m11645g(n66Var, obj, x18Var);
                return;
            }
            return;
        }
        o66 o66Var = (o66) objM17255g;
        Object[] objArr = o66Var.f1303b;
        long[] jArr = o66Var.f1302a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x18 x18Var2 = (x18) objArr[(i << 3) + i3];
                        if (x18Var2.m24236b(obj) == InvalidationResult.IMMINENT) {
                            fa4.m11645g(n66Var, obj, x18Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final boolean m19106v(Set set) {
        boolean z = set instanceof C0275a;
        n66 n66Var = this.f56047j;
        n66 n66Var2 = this.f56044g;
        if (z) {
            AbstractC0042e abstractC0042e = ((C0275a) set).f3738a;
            Object[] objArr = abstractC0042e.f1303b;
            long[] jArr = abstractC0042e.f1302a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (n66Var2.m17251c(obj) || n66Var.m17251c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (n66Var2.m17251c(obj2) || n66Var.m17251c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m19107w() {
        synchronized (this.f56041d) {
            i67 i67Var = this.f56031L;
            boolean z = false;
            if (i67Var != null && (i67Var.f43601h.get() != PausedCompositionState.Recomposing || i67Var.f43602i != r46.m20393t())) {
                AtomicReference atomicReference = i67Var.f43601h;
                PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                i67Var.f43605l.f3785a.m21101a(9);
                return false;
            }
            m19098n();
            try {
                n66 n66Var = this.f56028I;
                this.f56028I = fa4.m11654p();
                try {
                    tj3 tj3Var = this.f56036Q;
                    j69 j69Var = this.f56030K;
                    kz6 kz6Var = tj3Var.f62391e.f62837p;
                    if (!kz6Var.m15736U()) {
                        cf1.m4605a("Expected applyChanges() to have been called");
                    }
                    if (n66Var.f52403e > 0 || !tj3Var.f62405s.isEmpty()) {
                        tj3Var.f62381P = j69Var;
                        try {
                            tj3Var.m22136o(n66Var, null);
                            tj3Var.f62381P = null;
                            z = !kz6Var.m15736U();
                        } catch (Throwable th) {
                            tj3Var.f62381P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m19099o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f56028I = n66Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f56042e.f57324a.m724b()) {
                        v48 v48Var = this.f56035P;
                        try {
                            v48Var.m23105i(this.f56042e, this.f56036Q.m22085C());
                            v48Var.m23101d();
                        } finally {
                            v48Var.m23098a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m19086b();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m19108x(C0275a c0275a) {
        Object obj;
        while (true) {
            Object obj2 = this.f56040c.get();
            if (obj2 == null || obj2.equals(pb1.f55915c)) {
                obj = c0275a;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c0275a};
            } else {
                if (!(obj2 instanceof Object[])) {
                    ij6.m13967y(this.f56040c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c0275a;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f56040c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f56041d) {
                            m19099o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: y */
    public final void m19109y(Object obj) {
        x18 x18VarM22083A;
        int i;
        boolean z;
        tj3 tj3Var = this.f56036Q;
        if (tj3Var.f62366A <= 0 && (x18VarM22083A = tj3Var.m22083A()) != null) {
            int i2 = x18VarM22083A.f67640b | 1;
            x18VarM22083A.f67640b = i2;
            if ((i2 & 32) == 0) {
                d66 d66Var = x18VarM22083A.f67644f;
                if (d66Var == null) {
                    d66Var = new d66();
                    x18VarM22083A.f67644f = d66Var;
                }
                int i3 = x18VarM22083A.f67643e;
                int iM10124c = d66Var.m10124c(obj);
                if (iM10124c < 0) {
                    iM10124c = ~iM10124c;
                    i = -1;
                } else {
                    i = d66Var.f35036c[iM10124c];
                }
                d66Var.f35035b[iM10124c] = obj;
                d66Var.f35036c[iM10124c] = i3;
                if (i == x18VarM22083A.f67643e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f56034O.m16642e();
            if (z) {
                return;
            }
            if (obj instanceof qh9) {
                ((qh9) obj).m19974e(1);
            }
            fa4.m11645g(this.f56044g, obj, x18VarM22083A);
            if (obj instanceof gc2) {
                gc2 gc2Var = (gc2) obj;
                fc2 fc2VarM12475i = gc2Var.m12475i();
                n66 n66Var = this.f56047j;
                fa4.m11633G(n66Var, obj);
                d66 d66Var2 = fc2VarM12475i.f38835e;
                Object[] objArr = d66Var2.f35035b;
                long[] jArr = d66Var2.f35034a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    ph9 ph9Var = (ph9) objArr[(i4 << 3) + i7];
                                    if (ph9Var instanceof qh9) {
                                        ((qh9) ph9Var).m19974e(1);
                                    }
                                    fa4.m11645g(n66Var, ph9Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = fc2VarM12475i.f38836f;
                n66 n66Var2 = x18VarM22083A.f67645g;
                if (n66Var2 == null) {
                    n66Var2 = new n66();
                    x18VarM22083A.f67645g = n66Var2;
                }
                n66Var2.m17261m(gc2Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m19110z(Object obj) {
        synchronized (this.f56041d) {
            try {
                m19105u(obj);
                Object objM17255g = this.f56047j.m17255g(obj);
                if (objM17255g != null) {
                    if (objM17255g instanceof o66) {
                        o66 o66Var = (o66) objM17255g;
                        Object[] objArr = o66Var.f1303b;
                        long[] jArr = o66Var.f1302a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m19105u((gc2) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        m19105u((gc2) objM17255g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
