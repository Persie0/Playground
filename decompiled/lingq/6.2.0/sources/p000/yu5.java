package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.C1098n;
import com.google.common.collect.C1103s;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yu5 {

    /* JADX INFO: renamed from: a */
    public final xu5 f70472a;

    /* JADX INFO: renamed from: b */
    public final Object f70473b;

    /* JADX INFO: renamed from: c */
    public final zk8[] f70474c;

    /* JADX INFO: renamed from: d */
    public boolean f70475d;

    /* JADX INFO: renamed from: e */
    public boolean f70476e;

    /* JADX INFO: renamed from: f */
    public boolean f70477f;

    /* JADX INFO: renamed from: g */
    public zu5 f70478g;

    /* JADX INFO: renamed from: h */
    public boolean f70479h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f70480i;

    /* JADX INFO: renamed from: j */
    public final y90[] f70481j;

    /* JADX INFO: renamed from: k */
    public final i92 f70482k;

    /* JADX INFO: renamed from: l */
    public final wv5 f70483l;

    /* JADX INFO: renamed from: m */
    public yu5 f70484m;

    /* JADX INFO: renamed from: n */
    public k8a f70485n;

    /* JADX INFO: renamed from: o */
    public u8a f70486o;

    /* JADX INFO: renamed from: p */
    public long f70487p;

    public yu5(y90[] y90VarArr, long j, i92 i92Var, gv5 gv5Var, wv5 wv5Var, zu5 zu5Var, u8a u8aVar) {
        this.f70481j = y90VarArr;
        this.f70487p = j;
        this.f70482k = i92Var;
        this.f70483l = wv5Var;
        jv5 jv5Var = zu5Var.f72178a;
        this.f70473b = jv5Var.f46226a;
        this.f70478g = zu5Var;
        this.f70485n = k8a.f46867d;
        this.f70486o = u8aVar;
        this.f70474c = new zk8[y90VarArr.length];
        this.f70480i = new boolean[y90VarArr.length];
        long j2 = zu5Var.f72179b;
        long j3 = zu5Var.f72182e;
        boolean z = zu5Var.f72184g;
        wv5Var.getClass();
        Object obj = jv5Var.f46226a;
        int i = ve7.f65274k;
        Object obj2 = ((Pair) obj).first;
        jv5 jv5VarM14689a = jv5Var.m14689a(((Pair) obj).second);
        vv5 vv5Var = (vv5) ((HashMap) wv5Var.f67357e).get(obj2);
        vv5Var.getClass();
        ((HashSet) wv5Var.f67360h).add(vv5Var);
        uv5 uv5Var = (uv5) ((HashMap) wv5Var.f67358f).get(vv5Var);
        if (uv5Var != null) {
            uv5Var.f64403a.m19800f(uv5Var.f64404b);
        }
        vv5Var.f65984c.add(jv5VarM14689a);
        xu5 xu5VarMo16936c = vv5Var.f65982a.mo16936c(jv5VarM14689a, gv5Var, j2);
        ((IdentityHashMap) wv5Var.f67356d).put(xu5VarMo16936c, vv5Var);
        wv5Var.m24167d();
        this.f70472a = j3 != -9223372036854775807L ? new w31(xu5VarMo16936c, !z, 0L, j3) : xu5VarMo16936c;
    }

    /* JADX INFO: renamed from: a */
    public final long m25318a(u8a u8aVar, long j) {
        return m25319b(u8aVar, j, false, new boolean[this.f70481j.length]);
    }

    /* JADX INFO: renamed from: b */
    public final long m25319b(u8a u8aVar, long j, boolean z, boolean[] zArr) {
        y90[] y90VarArr;
        zk8[] zk8VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= u8aVar.f63593b) {
                break;
            }
            if (z || !u8aVar.m22551l(this.f70486o, i)) {
                z2 = false;
            }
            this.f70480i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            y90VarArr = this.f70481j;
            int length = y90VarArr.length;
            zk8VarArr = this.f70474c;
            if (i2 >= length) {
                break;
            }
            if (y90VarArr[i2].f69496b == -2) {
                zk8VarArr[i2] = null;
            }
            i2++;
        }
        m25322e();
        this.f70486o = u8aVar;
        m25323f();
        long jMo2544c = this.f70472a.mo2544c((C3565s8[]) u8aVar.f63595d, this.f70480i, this.f70474c, zArr, j);
        for (int i3 = 0; i3 < y90VarArr.length; i3++) {
            if (y90VarArr[i3].f69496b == -2 && this.f70486o.m22552m(i3)) {
                zk8VarArr[i3] = new bw8();
            }
        }
        this.f70477f = false;
        for (int i4 = 0; i4 < zk8VarArr.length; i4++) {
            if (zk8VarArr[i4] != null) {
                bna.m3987z(u8aVar.m22552m(i4));
                if (y90VarArr[i4].f69496b != -2) {
                    this.f70477f = true;
                }
            } else {
                bna.m3987z(((C3565s8[]) u8aVar.f63595d)[i4] == null);
            }
        }
        return jMo2544c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25320c(zu5 zu5Var) {
        zu5 zu5Var2 = this.f70478g;
        long j = zu5Var2.f72183f;
        return (j == -9223372036854775807L || j == zu5Var.f72183f) && zu5Var2.f72179b == zu5Var.f72179b && zu5Var2.f72178a.equals(zu5Var.f72178a);
    }

    /* JADX INFO: renamed from: d */
    public final void m25321d(oh5 oh5Var) {
        bna.m3987z(this.f70484m == null);
        this.f70472a.mo2556o(oh5Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m25322e() {
        if (this.f70484m != null) {
            return;
        }
        int i = 0;
        while (true) {
            u8a u8aVar = this.f70486o;
            if (i >= u8aVar.f63593b) {
                return;
            }
            u8aVar.m22552m(i);
            C3565s8 c3565s8 = ((C3565s8[]) this.f70486o.f63595d)[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25323f() {
        if (this.f70484m != null) {
            return;
        }
        int i = 0;
        while (true) {
            u8a u8aVar = this.f70486o;
            if (i >= u8aVar.f63593b) {
                return;
            }
            u8aVar.m22552m(i);
            C3565s8 c3565s8 = ((C3565s8[]) this.f70486o.f63595d)[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m25324g() {
        if (!this.f70476e) {
            return this.f70478g.f72179b;
        }
        long jMo2557p = this.f70477f ? this.f70472a.mo2557p() : Long.MIN_VALUE;
        return jMo2557p == Long.MIN_VALUE ? this.f70478g.f72183f : jMo2557p;
    }

    /* JADX INFO: renamed from: h */
    public final yu5 m25325h() {
        return this.f70484m;
    }

    /* JADX INFO: renamed from: i */
    public final long m25326i() {
        if (this.f70476e) {
            return this.f70472a.mo2545d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: j */
    public final long m25327j() {
        return this.f70487p;
    }

    /* JADX INFO: renamed from: k */
    public final long m25328k() {
        return this.f70478g.f72179b + this.f70487p;
    }

    /* JADX INFO: renamed from: l */
    public final k8a m25329l() {
        return this.f70485n;
    }

    /* JADX INFO: renamed from: m */
    public final u8a m25330m() {
        return this.f70486o;
    }

    /* JADX INFO: renamed from: n */
    public final void m25331n(float f, z0a z0aVar) {
        this.f70476e = true;
        this.f70485n = this.f70472a.mo2554m();
        u8a u8aVarM25338u = m25338u(f, z0aVar);
        zu5 zu5Var = this.f70478g;
        long jMax = zu5Var.f72179b;
        long j = zu5Var.f72183f;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM25318a = m25318a(u8aVarM25338u, jMax);
        long j2 = this.f70487p;
        zu5 zu5Var2 = this.f70478g;
        this.f70487p = (zu5Var2.f72179b - jM25318a) + j2;
        this.f70478g = zu5Var2.m25791b(jM25318a, zu5Var2.f72180c);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25332o() {
        try {
            if (!this.f70476e) {
                this.f70472a.mo2547f();
                return false;
            }
            for (zk8 zk8Var : this.f70474c) {
                if (zk8Var != null) {
                    zk8Var.mo4200c();
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m25333p() {
        if (this.f70476e) {
            return !this.f70477f || this.f70472a.mo2557p() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m25334q() {
        if (this.f70476e) {
            return m25333p() || m25324g() - this.f70478g.f72179b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m25335r(rw2 rw2Var, long j) {
        this.f70475d = true;
        this.f70472a.mo2553l(rw2Var, j);
    }

    /* JADX INFO: renamed from: s */
    public final void m25336s(long j) {
        bna.m3987z(this.f70484m == null);
        if (this.f70476e) {
            this.f70472a.mo2559r(j - this.f70487p);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m25337t() {
        m25322e();
        xu5 xu5Var = this.f70472a;
        try {
            boolean z = xu5Var instanceof w31;
            wv5 wv5Var = this.f70483l;
            if (z) {
                wv5Var.m24171i(((w31) xu5Var).f66317a);
            } else {
                wv5Var.m24171i(xu5Var);
            }
        } catch (RuntimeException e) {
            ss5.m21724v("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final u8a m25338u(float f, z0a z0aVar) {
        final d92 d92Var;
        final String str;
        int i;
        C3565s8 c3565s8;
        int i2;
        long[][] jArr;
        String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairM13732l;
        boolean z;
        Context context;
        int[] iArr;
        i92 i92Var = this.f70482k;
        y90[] y90VarArr = this.f70481j;
        k8a k8aVar = this.f70485n;
        i92Var.getClass();
        int i3 = 1;
        int[] iArr2 = new int[y90VarArr.length + 1];
        int length = y90VarArr.length + 1;
        j8a[][] j8aVarArr = new j8a[length][];
        int[][][] iArr3 = new int[y90VarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = k8aVar.f46868a;
            j8aVarArr[i4] = new j8a[i5];
            iArr3[i4] = new int[i5][];
        }
        int length2 = y90VarArr.length;
        final int[] iArr4 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr4[i6] = y90VarArr[i6].mo24679E();
        }
        int i7 = 0;
        while (i7 < k8aVar.f46868a) {
            j8a j8aVarM15003a = k8aVar.m15003a(i7);
            int i8 = j8aVarM15003a.f45216c == 5 ? i3 : 0;
            int length3 = y90VarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (i11 < y90VarArr.length) {
                y90 y90Var = y90VarArr[i11];
                k8a k8aVar2 = k8aVar;
                int[] iArr5 = iArr2;
                int i12 = i3;
                int iMax = 0;
                for (int i13 = 0; i13 < j8aVarM15003a.f45214a; i13++) {
                    iMax = Math.max(iMax, y90Var.mo4251D(j8aVarM15003a.f45217d[i13]) & 7);
                }
                int i14 = iArr5[i11] == 0 ? i12 : 0;
                if (iMax > i10 || (iMax == i10 && i8 != 0 && i9 == 0 && i14 != 0)) {
                    i10 = iMax;
                    i9 = i14;
                    length3 = i11;
                }
                i11++;
                i3 = i12;
                k8aVar = k8aVar2;
                iArr2 = iArr5;
            }
            k8a k8aVar3 = k8aVar;
            int[] iArr6 = iArr2;
            int i15 = i3;
            if (length3 == y90VarArr.length) {
                iArr = new int[j8aVarM15003a.f45214a];
            } else {
                y90 y90Var2 = y90VarArr[length3];
                int[] iArr7 = new int[j8aVarM15003a.f45214a];
                for (int i16 = 0; i16 < j8aVarM15003a.f45214a; i16++) {
                    iArr7[i16] = y90Var2.mo4251D(j8aVarM15003a.f45217d[i16]);
                }
                iArr = iArr7;
            }
            int i17 = iArr6[length3];
            j8aVarArr[length3][i17] = j8aVarM15003a;
            iArr3[length3][i17] = iArr;
            iArr6[length3] = i17 + 1;
            i7++;
            i3 = i15;
            k8aVar = k8aVar3;
            iArr2 = iArr6;
        }
        int[] iArr8 = iArr2;
        int i18 = i3;
        k8a[] k8aVarArr = new k8a[y90VarArr.length];
        String[] strArr = new String[y90VarArr.length];
        int[] iArr9 = new int[y90VarArr.length];
        for (int i19 = 0; i19 < y90VarArr.length; i19++) {
            int i20 = iArr8[i19];
            k8aVarArr[i19] = new k8a((j8a[]) uma.m22799D(j8aVarArr[i19], i20));
            iArr3[i19] = (int[][]) uma.m22799D(iArr3[i19], i20);
            strArr[i19] = y90VarArr[i19].mo4257k();
            iArr9[i19] = y90VarArr[i19].f69496b;
        }
        dq5 dq5Var = new dq5(iArr9, k8aVarArr, iArr4, iArr3, new k8a((j8a[]) uma.m22799D(j8aVarArr[y90VarArr.length], iArr8[y90VarArr.length])));
        synchronized (i92Var.f43729c) {
            i92Var.f43733g = Thread.currentThread();
            d92Var = i92Var.f43732f;
        }
        if (i92Var.f43736j == null && (context = i92Var.f43730d) != null) {
            i92Var.f43736j = Boolean.valueOf(uma.m22796A(context));
        }
        int i21 = 8;
        if (d92Var.f35198A && Build.VERSION.SDK_INT >= 32 && i92Var.f43734h == null) {
            i92Var.f43734h = new nc0(i92Var.f43730d, new RunnableC0002a0(i92Var, i21), i92Var.f43736j);
        }
        int i22 = dq5Var.f36024a;
        sw2[] sw2VarArr = new sw2[i22];
        i92.m13726d(dq5Var, d92Var, sw2VarArr);
        i92.m13724b(dq5Var, d92Var, sw2VarArr);
        i92.m13725c(dq5Var, d92Var, sw2VarArr);
        Context context2 = i92Var.f43730d;
        int i23 = dq5Var.f36024a;
        Pair pairM13728f = i92.m13728f(sw2VarArr, i18);
        if (pairM13728f == null) {
            int i24 = 0;
            while (true) {
                if (i24 >= dq5Var.f36024a) {
                    z = false;
                    break;
                }
                if (2 == dq5Var.f36025b[i24] && dq5Var.f36026c[i24].f46868a > 0) {
                    z = true;
                    break;
                }
                i24++;
            }
            pairM13728f = i92.m13732l(1, dq5Var, iArr3, new y82(i92Var, d92Var, z, iArr4), new C3166k(7));
            if (pairM13728f != null) {
                sw2VarArr[((Integer) pairM13728f.second).intValue()] = (sw2) pairM13728f.first;
            }
        }
        if (pairM13728f == null) {
            str = null;
        } else {
            sw2 sw2Var = (sw2) pairM13728f.first;
            str = sw2Var.f61508a.f45217d[sw2Var.f61509b[0]].f6395d;
        }
        Pair pairM13728f2 = i92.m13728f(sw2VarArr, 2);
        Pair pairM13728f3 = i92.m13728f(sw2VarArr, 4);
        if (pairM13728f2 == null && pairM13728f3 == null) {
            d92Var.f60535q.getClass();
            final Point pointM22820o = (!d92Var.f60525g || context2 == null) ? null : uma.m22820o(context2);
            Pair pairM13732l2 = i92.m13732l(2, dq5Var, iArr3, new f92() { // from class: x82
                /* JADX WARN: Code duplicated, block: B:28:0x004a  */
                @Override // p000.f92
                /* JADX INFO: renamed from: i */
                public final List mo394i(int i25, j8a j8aVar, int[] iArr10) {
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    j8a j8aVar2 = j8aVar;
                    int i30 = iArr4[i25];
                    d92 d92Var2 = d92Var;
                    Point point = pointM22820o;
                    int i31 = point != null ? point.x : d92Var2.f60523e;
                    int i32 = point != null ? point.y : d92Var2.f60524f;
                    boolean z2 = d92Var2.f60526h;
                    AbstractC1104t abstractC1104t = i92.f43726k;
                    if (i31 == Integer.MAX_VALUE || i32 == Integer.MAX_VALUE) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        int i33 = Integer.MAX_VALUE;
                        for (int i34 = 0; i34 < j8aVar2.f45214a; i34++) {
                            C0713b c0713b = j8aVar2.f45217d[i34];
                            int i35 = c0713b.f6413v;
                            int i36 = c0713b.f6414w;
                            if (i35 > 0 && i36 > 0) {
                                if (!z2) {
                                    i28 = i32;
                                    i29 = i31;
                                } else if ((i35 > i36) != (i31 > i32)) {
                                    i29 = i32;
                                    i28 = i31;
                                } else {
                                    i28 = i32;
                                    i29 = i31;
                                }
                                int i37 = i35 * i28;
                                int i38 = i36 * i29;
                                Point point2 = i37 >= i38 ? new Point(i29, uma.m22810e(i38, i35)) : new Point(uma.m22810e(i37, i36), i28);
                                int i39 = c0713b.f6413v;
                                int i40 = i39 * i36;
                                if (i39 >= ((int) (point2.x * 0.98f)) && i36 >= ((int) (point2.y * 0.98f)) && i40 < i33) {
                                    i33 = i40;
                                }
                            }
                        }
                        i26 = i33;
                    }
                    c14 c14VarM6284m = ImmutableList.m6284m();
                    int i41 = 0;
                    while (i41 < j8aVar2.f45214a) {
                        C0713b c0713b2 = j8aVar2.f45217d[i41];
                        int i42 = c0713b2.f6413v;
                        int i43 = (i42 == -1 || (i27 = c0713b2.f6414w) == -1) ? -1 : i42 * i27;
                        c14VarM6284m.m3157b(new h92(i25, j8aVar2, i41, d92Var2, iArr10[i41], str, i30, i26 == Integer.MAX_VALUE || (i43 != -1 && i43 <= i26)));
                        i41++;
                        j8aVar2 = j8aVar;
                    }
                    return c14VarM6284m.m4280g();
                }
            }, new C3166k(6));
            if (pairM13732l2 == null) {
                d92Var.f60535q.getClass();
                pairM13732l = i92.m13732l(4, dq5Var, iArr3, new C3440oy(d92Var, 7), new C3166k(5));
            } else {
                pairM13732l = null;
            }
            if (pairM13732l != null) {
                sw2VarArr[((Integer) pairM13732l.second).intValue()] = (sw2) pairM13732l.first;
            } else if (pairM13732l2 != null) {
                sw2VarArr[((Integer) pairM13732l2.second).intValue()] = (sw2) pairM13732l2.first;
            }
        }
        if (i92.m13728f(sw2VarArr, 3) == null) {
            d92Var.f60535q.getClass();
            if (!d92Var.f60538t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = uma.f64080a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairM13732l3 = i92.m13732l(3, dq5Var, iArr3, new ah1(d92Var, str, languageTag), new C3166k(8));
            if (pairM13732l3 != null) {
                sw2VarArr[((Integer) pairM13732l3.second).intValue()] = (sw2) pairM13732l3.first;
            }
        }
        d92Var.f60535q.getClass();
        int i25 = ImmutableSet.f13401c;
        C1098n c1098n = new C1098n(4);
        int iM24988f = y90.m24988f(0, 0, 0, 0);
        for (int i26 = 0; i26 < i22; i26++) {
            sw2 sw2Var2 = sw2VarArr[i26];
            if (sw2Var2 != null) {
                j8a j8aVar = sw2Var2.f61508a;
                if (!d92Var.f35202E.get(i26) && !d92Var.f60540v.contains(Integer.valueOf(j8aVar.f45216c))) {
                    c1098n.mo3156a(j8aVar.f45215b);
                    int i27 = 0;
                    while (true) {
                        int[] iArr10 = sw2Var2.f61509b;
                        if (i27 < iArr10.length) {
                            String str3 = j8aVar.f45217d[iArr10[i27]].f6404m;
                            if (str3 != null) {
                                c1098n.m3157b(str3);
                            }
                            i27++;
                        }
                    }
                }
            }
        }
        ImmutableSet immutableSetMo6343h = c1098n.mo6343h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i28 = 0;
        while (i28 < dq5Var.f36024a) {
            if (dq5Var.f36025b[i28] == 5) {
                k8a k8aVar4 = dq5Var.f36026c[i28];
                int i29 = 0;
                while (i29 < k8aVar4.f46868a) {
                    j8a j8aVarM15003a2 = k8aVar4.m15003a(i29);
                    arrayList.add(j8aVarM15003a2);
                    int i30 = i28;
                    int[] iArr11 = (int[]) iArr3[i28][i29].clone();
                    k8a k8aVar5 = k8aVar4;
                    int[][][] iArr12 = iArr3;
                    for (int i31 = 0; i31 < iArr11.length; i31++) {
                        String str4 = j8aVarM15003a2.f45217d[i31].f6404m;
                        if (str4 != null && !immutableSetMo6343h.contains(str4)) {
                            iArr11[i31] = iM24988f;
                        }
                    }
                    arrayList2.add(iArr11);
                    i29++;
                    k8aVar4 = k8aVar5;
                    i28 = i30;
                    iArr3 = iArr12;
                }
            }
            i28++;
            iArr3 = iArr3;
        }
        int[][][] iArr13 = iArr3;
        int size = arrayList.size();
        j8a[] j8aVarArr2 = new j8a[size];
        bna.m3987z(arrayList.size() == size);
        arrayList.toArray(j8aVarArr2);
        k8a k8aVar6 = new k8a(j8aVarArr2);
        int size2 = arrayList2.size();
        int[][] iArr14 = new int[size2][];
        bna.m3987z(arrayList2.size() == size2);
        arrayList2.toArray(iArr14);
        for (int i32 = 0; i32 < dq5Var.f36024a; i32++) {
            if (dq5Var.f36025b[i32] == 5) {
                sw2 sw2VarM13731k = i92.m13731k(k8aVar6, iArr14, d92Var);
                sw2VarArr[i32] = sw2VarM13731k;
                if (sw2VarM13731k == null) {
                    break;
                }
                int iIndexOf = k8aVar6.f46869b.indexOf(sw2VarM13731k.f61508a);
                Arrays.fill(iArr14[iIndexOf >= 0 ? iIndexOf : -1], iM24988f);
            }
        }
        for (int i33 = 0; i33 < i23; i33++) {
            int i34 = dq5Var.f36025b[i33];
            if (i34 != 2 && i34 != 1) {
                if (i34 != 3 && i34 != 4) {
                    if (i34 != 5 && sw2VarArr[i33] == null) {
                        sw2VarArr[i33] = i92.m13731k(dq5Var.f36026c[i33], iArr13[i33], d92Var);
                    }
                }
            }
        }
        i92.m13726d(dq5Var, d92Var, sw2VarArr);
        i92.m13724b(dq5Var, d92Var, sw2VarArr);
        i92.m13725c(dq5Var, d92Var, sw2VarArr);
        a3d a3dVar = i92Var.f43731e;
        i92Var.f43728b.getClass();
        a3dVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (sw2 sw2Var3 : sw2VarArr) {
            if (sw2Var3 == null || sw2Var3.f61509b.length <= 1) {
                arrayList3.add(null);
            } else {
                c14 c14VarM6284m = ImmutableList.m6284m();
                c14VarM6284m.m3157b(new C3526r8(0L, 0L));
                arrayList3.add(c14VarM6284m);
            }
        }
        int length4 = sw2VarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i35 = 0; i35 < sw2VarArr.length; i35++) {
            sw2 sw2Var4 = sw2VarArr[i35];
            if (sw2Var4 == null) {
                jArr2[i35] = new long[0];
            } else {
                int[] iArr15 = sw2Var4.f61509b;
                jArr2[i35] = new long[iArr15.length];
                for (int i36 = 0; i36 < iArr15.length; i36++) {
                    long j = sw2Var4.f61508a.f45217d[iArr15[i36]].f6401j;
                    long[] jArr3 = jArr2[i35];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i36] = j;
                }
                Arrays.sort(jArr2[i35]);
            }
        }
        int[] iArr16 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i37 = 0; i37 < length4; i37++) {
            long[] jArr5 = jArr2[i37];
            jArr4[i37] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        C3565s8.m21150a(arrayList3, jArr4);
        new j13();
        AbstractC3489q9.m19779i(2, "expectedValuesPerKey");
        vf5 vf5VarM6348a = new C1103s().m6348a();
        int i38 = 0;
        while (i38 < length4) {
            long[] jArr6 = jArr2[i38];
            if (jArr6.length <= 1) {
                i2 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr6.length;
                double[] dArr = new double[length5];
                int i39 = 0;
                while (true) {
                    long[] jArr7 = jArr2[i38];
                    i2 = length4;
                    double dLog = 0.0d;
                    if (i39 >= jArr7.length) {
                        break;
                    }
                    long[][] jArr8 = jArr2;
                    long j2 = jArr7[i39];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i39] = dLog;
                    i39++;
                    jArr2 = jArr8;
                    length4 = i2;
                }
                long[][] jArr9 = jArr2;
                int i40 = length5 - 1;
                double d = dArr[i40] - dArr[0];
                int i41 = 0;
                while (i41 < i40) {
                    double d2 = dArr[i41];
                    i41++;
                    long[][] jArr10 = jArr9;
                    vf5VarM6348a.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i41]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i38));
                    iArr16 = iArr16;
                    jArr9 = jArr10;
                }
                jArr = jArr9;
            }
            i38++;
            length4 = i2;
            iArr16 = iArr16;
            jArr2 = jArr;
        }
        int[] iArr17 = iArr16;
        long[][] jArr11 = jArr2;
        ImmutableList immutableListM6287r = ImmutableList.m6287r(vf5VarM6348a.values());
        for (int i42 = 0; i42 < immutableListM6287r.size(); i42++) {
            int iIntValue = ((Integer) immutableListM6287r.get(i42)).intValue();
            int i43 = iArr17[iIntValue] + 1;
            iArr17[iIntValue] = i43;
            jArr4[iIntValue] = jArr11[iIntValue][i43];
            C3565s8.m21150a(arrayList3, jArr4);
        }
        for (int i44 = 0; i44 < sw2VarArr.length; i44++) {
            if (arrayList3.get(i44) != null) {
                jArr4[i44] = jArr4[i44] * 2;
            }
        }
        C3565s8.m21150a(arrayList3, jArr4);
        c14 c14VarM6284m2 = ImmutableList.m6284m();
        for (int i45 = 0; i45 < arrayList3.size(); i45++) {
            c14 c14Var = (c14) arrayList3.get(i45);
            c14VarM6284m2.m3157b(c14Var == null ? ImmutableList.m6289v() : c14Var.m4280g());
        }
        ImmutableList immutableListM4280g = c14VarM6284m2.m4280g();
        C3565s8[] c3565s8Arr = new C3565s8[sw2VarArr.length];
        for (int i46 = 0; i46 < sw2VarArr.length; i46++) {
            sw2 sw2Var5 = sw2VarArr[i46];
            if (sw2Var5 != null) {
                int[] iArr18 = sw2Var5.f61509b;
                if (iArr18.length != 0) {
                    int length6 = iArr18.length;
                    j8a j8aVar2 = sw2Var5.f61508a;
                    if (length6 == 1) {
                        c3565s8 = new C3565s8(j8aVar2, new int[]{iArr18[0]});
                    } else {
                        ImmutableList immutableList = (ImmutableList) immutableListM4280g.get(i46);
                        C3565s8 c3565s9 = new C3565s8(j8aVar2, iArr18);
                        ImmutableList.m6287r(immutableList);
                        c3565s8 = c3565s9;
                    }
                    c3565s8Arr[i46] = c3565s8;
                }
            }
        }
        b68[] b68VarArr = new b68[i22];
        for (int i47 = 0; i47 < i22; i47++) {
            b68VarArr[i47] = (d92Var.f35202E.get(i47) || d92Var.f60540v.contains(Integer.valueOf(dq5Var.f36025b[i47])) || (dq5Var.f36025b[i47] != -2 && c3565s8Arr[i47] == null)) ? null : b68.f8018c;
        }
        d92Var.f60535q.getClass();
        Pair pairCreate = Pair.create(b68VarArr, c3565s8Arr);
        C3565s8[] c3565s8Arr2 = (C3565s8[]) pairCreate.second;
        int[][][] iArr19 = dq5Var.f36028e;
        int length7 = c3565s8Arr2.length;
        List[] listArr = new List[length7];
        for (int i48 = 0; i48 < c3565s8Arr2.length; i48++) {
            C3565s8 c3565s10 = c3565s8Arr2[i48];
            listArr[i48] = c3565s10 != null ? ImmutableList.m6291y(c3565s10) : ImmutableList.m6289v();
        }
        c14 c14Var2 = new c14(4);
        int i49 = 0;
        while (true) {
            int i50 = dq5Var.f36024a;
            k8a[] k8aVarArr2 = dq5Var.f36026c;
            if (i49 >= i50) {
                break;
            }
            k8a k8aVar7 = k8aVarArr2[i49];
            int i51 = 0;
            while (i51 < k8aVar7.f46868a) {
                j8a j8aVarM15003a3 = k8aVar7.m15003a(i51);
                int i52 = k8aVarArr2[i49].m15003a(i51).f45214a;
                int[] iArr20 = new int[i52];
                int i53 = 0;
                int i54 = 0;
                while (i54 < i52) {
                    int[][][] iArr21 = iArr19;
                    List[] listArr2 = listArr;
                    if ((iArr19[i49][i51][i54] & 7) == 4) {
                        iArr20[i53] = i54;
                        i53++;
                    }
                    i54++;
                    listArr = listArr2;
                    iArr19 = iArr21;
                }
                int[][][] iArr22 = iArr19;
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr20, i53);
                int iMin = 16;
                k8a k8aVar8 = k8aVar7;
                String str5 = null;
                int i55 = 0;
                boolean z2 = false;
                int i56 = 0;
                while (i55 < iArrCopyOf.length) {
                    int[] iArr23 = iArrCopyOf;
                    String str6 = k8aVarArr2[i49].m15003a(i51).f45217d[iArrCopyOf[i55]].f6406o;
                    int i57 = i56 + 1;
                    if (i56 == 0) {
                        str5 = str6;
                    } else {
                        z2 = (!Objects.equals(str5, str6)) | z2;
                    }
                    iMin = Math.min(iMin, iArr22[i49][i51][i55] & 24);
                    i55++;
                    i56 = i57;
                    iArrCopyOf = iArr23;
                }
                if (z2) {
                    iMin = Math.min(iMin, dq5Var.f36027d[i49]);
                }
                boolean z3 = iMin != 0;
                int i58 = j8aVarM15003a3.f45214a;
                int[] iArr24 = new int[i58];
                boolean[] zArr = new boolean[i58];
                int i59 = 0;
                while (i59 < j8aVarM15003a3.f45214a) {
                    iArr24[i59] = iArr22[i49][i51][i59] & 7;
                    boolean z4 = false;
                    int i60 = 0;
                    while (i60 < length7) {
                        List list = listArr3[i60];
                        int i61 = length7;
                        k8a[] k8aVarArr3 = k8aVarArr2;
                        int i62 = 0;
                        while (true) {
                            if (i62 >= list.size()) {
                                i = i51;
                                break;
                            }
                            C3565s8 c3565s11 = (C3565s8) list.get(i62);
                            int i63 = i62;
                            i = i51;
                            if (c3565s11.f60498a.equals(j8aVarM15003a3)) {
                                int i64 = 0;
                                while (true) {
                                    if (i64 >= c3565s11.f60499b) {
                                        i64 = -1;
                                        break;
                                    }
                                    if (c3565s11.f60500c[i64] == i59) {
                                        break;
                                    }
                                    i64++;
                                }
                                if (i64 != -1) {
                                    z4 = true;
                                    break;
                                }
                            }
                            i62 = i63 + 1;
                            i51 = i;
                        }
                        i60++;
                        length7 = i61;
                        k8aVarArr2 = k8aVarArr3;
                        i51 = i;
                    }
                    zArr[i59] = z4;
                    i59++;
                    k8aVarArr2 = k8aVarArr2;
                }
                c14Var2.m3157b(new z8a(j8aVarM15003a3, z3, iArr24, zArr));
                i51++;
                listArr = listArr3;
                k8aVar7 = k8aVar8;
                iArr19 = iArr22;
                length7 = length7;
                k8aVarArr2 = k8aVarArr2;
            }
            i49++;
        }
        k8a k8aVar9 = dq5Var.f36029f;
        for (int i65 = 0; i65 < k8aVar9.f46868a; i65++) {
            j8a j8aVarM15003a4 = k8aVar9.m15003a(i65);
            int[] iArr25 = new int[j8aVarM15003a4.f45214a];
            Arrays.fill(iArr25, 0);
            c14Var2.m3157b(new z8a(j8aVarM15003a4, false, iArr25, new boolean[j8aVarM15003a4.f45214a]));
        }
        u8a u8aVar = new u8a((b68[]) pairCreate.first, (C3565s8[]) pairCreate.second, new a9a(c14Var2.m4280g()), dq5Var);
        for (int i66 = 0; i66 < u8aVar.f63593b; i66++) {
            boolean zM22552m = u8aVar.m22552m(i66);
            C3565s8[] c3565s8Arr3 = (C3565s8[]) u8aVar.f63595d;
            if (zM22552m) {
                bna.m3987z(c3565s8Arr3[i66] != null || this.f70481j[i66].f69496b == -2);
            } else {
                bna.m3987z(c3565s8Arr3[i66] == null);
            }
        }
        for (C3565s8 c3565s12 : (C3565s8[]) u8aVar.f63595d) {
        }
        return u8aVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m25339v(yu5 yu5Var) {
        if (yu5Var == this.f70484m) {
            return;
        }
        m25322e();
        this.f70484m = yu5Var;
        m25323f();
    }

    /* JADX INFO: renamed from: w */
    public final void m25340w(long j) {
        this.f70487p = j;
    }

    /* JADX INFO: renamed from: x */
    public final long m25341x(long j) {
        return j - this.f70487p;
    }

    /* JADX INFO: renamed from: y */
    public final long m25342y(long j) {
        return j + this.f70487p;
    }

    /* JADX INFO: renamed from: z */
    public final void m25343z() {
        xu5 xu5Var = this.f70472a;
        if (xu5Var instanceof w31) {
            long j = this.f70478g.f72182e;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            w31 w31Var = (w31) xu5Var;
            w31Var.f66322f = 0L;
            w31Var.f66323g = j;
        }
    }
}
