package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.graphics.layer.C0312a;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC3489q9;
import p000.AbstractC3550rv;
import p000.AbstractC3572sf;
import p000.b34;
import p000.bk1;
import p000.du4;
import p000.f84;
import p000.it4;
import p000.l43;
import p000.l87;
import p000.n66;
import p000.o66;
import p000.om8;
import p000.pm8;
import p000.qp3;
import p000.u91;
import p000.un1;
import p000.ut4;
import p000.vt4;
import p000.wfb;
import p000.wh2;
import p000.x91;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0135d {

    /* JADX INFO: renamed from: a */
    public final n66 f2554a;

    /* JADX INFO: renamed from: b */
    public C0139h f2555b;

    /* JADX INFO: renamed from: c */
    public int f2556c;

    /* JADX INFO: renamed from: d */
    public final o66 f2557d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f2558e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2559f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f2560g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2561h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2562i;

    /* JADX INFO: renamed from: j */
    public wh2 f2563j;

    public C0135d() {
        long[] jArr = om8.f54590a;
        this.f2554a = new n66();
        o66 o66Var = pm8.f56484a;
        this.f2557d = new o66();
        this.f2558e = new ArrayList();
        this.f2559f = new ArrayList();
        this.f2560g = new ArrayList();
        this.f2561h = new ArrayList();
        this.f2562i = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static void m1007c(du4 du4Var, int i, ut4 ut4Var, boolean z) {
        int i2 = 0;
        long jMo10673g = du4Var.mo10673g(0);
        long jM11592a = z ? f84.m11592a(0, i, 1, jMo10673g) : f84.m11592a(i, 0, 2, jMo10673g);
        C0134c[] c0134cArr = ut4Var.f64327a;
        int length = c0134cArr.length;
        int i3 = 0;
        while (i2 < length) {
            C0134c c0134c = c0134cArr[i2];
            int i4 = i3 + 1;
            if (c0134c != null) {
                c0134c.f2547l = f84.m11595d(jM11592a, f84.m11594c(du4Var.mo10673g(i3), jMo10673g));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m1008h(int[] iArr, du4 du4Var, boolean z) {
        int iMo10674h = du4Var.mo10674h();
        int iMo10668b = du4Var.mo10668b() + iMo10674h;
        int iMax = 0;
        while (iMo10674h < iMo10668b) {
            int iM3208C = b34.m3208C(du4Var, z) + iArr[iMo10674h];
            iArr[iMo10674h] = iM3208C;
            iMax = Math.max(iMax, iM3208C);
            iMo10674h++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    public final C0134c m1009a(int i, Object obj) {
        ut4 ut4Var = (ut4) this.f2554a.m17255g(obj);
        if (ut4Var != null) {
            return ut4Var.f64327a[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final long m1010b() {
        ArrayList arrayList = this.f2562i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            C0134c c0134c = (C0134c) arrayList.get(i);
            C0312a c0312a = c0134c.f2550o;
            if (c0312a != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c0134c.f2547l >> 32)) + ((int) (c0312a.f3997u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c0134c.f2547l & 4294967295L)) + ((int) (c0312a.f3997u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:211:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x00d4 A[EDGE_INSN: B:258:0x00d4->B:49:0x00d4 BREAK  A[LOOP:2: B:35:0x0094->B:47:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[LOOP:2: B:35:0x0094->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r13v9, types: [kn1, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX INFO: renamed from: d */
    public final void m1011d(int i, int i2, int i3, ArrayList arrayList, C0139h c0139h, AbstractC3572sf abstractC3572sf, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, un1 un1Var, qp3 qp3Var) {
        n66 n66Var;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0139h c0139h2;
        o66 o66Var;
        ArrayList arrayList5;
        int[] iArr;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int[] iArr2;
        int i7;
        long[] jArr;
        C0139h c0139h3;
        ArrayList arrayList9;
        int i8;
        int i9;
        int[] iArr3;
        ArrayList arrayList10;
        long[] jArr2;
        ArrayList arrayList11;
        C0139h c0139h4;
        ArrayList arrayList12;
        int i10;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        du4 du4Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        n66 n66Var2;
        long j2;
        boolean z4;
        long j3;
        int i16;
        int i17;
        long j4;
        ArrayList arrayList16 = arrayList;
        int i18 = i4;
        C0139h c0139h5 = this.f2555b;
        this.f2555b = c0139h;
        int size = arrayList16.size();
        int i19 = 0;
        loop0: while (true) {
            n66Var = this.f2554a;
            if (i19 >= size) {
                if (!n66Var.m17257i()) {
                    break;
                }
                m1012e();
                return;
            }
            du4 du4Var2 = (du4) arrayList16.get(i19);
            int size2 = du4Var2.mo10671e().size();
            for (int i20 = 0; i20 < size2; i20++) {
                Object objMo1509A = ((l87) du4Var2.mo10671e().get(i20)).mo1509A();
                if ((objMo1509A instanceof it4 ? (it4) objMo1509A : null) != null) {
                    break loop0;
                }
            }
            i19++;
        }
        int i21 = this.f2556c;
        du4 du4Var3 = (du4) u91.m22591I0(arrayList16);
        this.f2556c = du4Var3 != null ? du4Var3.getIndex() : 0;
        long j5 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z5 = z2 || !z3;
        Object[] objArr = n66Var.f52400b;
        long[] jArr3 = n66Var.f52399a;
        int length = jArr3.length - 2;
        o66 o66Var2 = this.f2557d;
        if (length >= 0) {
            int i22 = 0;
            while (true) {
                long j6 = jArr3[i22];
                j = j5;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j6 & 255) < 128) {
                            o66Var2.m17811d(objArr[(i22 << 3) + i24]);
                        }
                        j6 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                    if (i22 != length) {
                        break;
                    }
                    i22++;
                    j5 = j;
                } else if (i22 != length) {
                    break;
                    break;
                } else {
                    i22++;
                    j5 = j;
                }
            }
        } else {
            j = j5;
        }
        int size3 = arrayList16.size();
        int i25 = 0;
        while (true) {
            arrayList2 = this.f2562i;
            arrayList3 = this.f2559f;
            arrayList4 = this.f2558e;
            if (i25 >= size3) {
                break;
            }
            du4 du4Var4 = (du4) arrayList16.get(i25);
            o66Var2.m17819l(du4Var4.getKey());
            int size4 = du4Var4.mo10671e().size();
            int i26 = 0;
            while (true) {
                if (i26 >= size4) {
                    i14 = size3;
                    i15 = i25;
                    n66Var2 = n66Var;
                    j2 = j;
                    i21 = i21;
                    m1013f(du4Var4.getKey());
                    break;
                }
                i14 = size3;
                Object objMo1509A2 = ((l87) du4Var4.mo10671e().get(i26)).mo1509A();
                i15 = i25;
                if ((objMo1509A2 instanceof it4 ? (it4) objMo1509A2 : null) != null) {
                    ut4 ut4Var = (ut4) n66Var.m17255g(du4Var4.getKey());
                    int iM1018a = c0139h5 != null ? c0139h5.m1018a(du4Var4.getKey()) : -1;
                    boolean z6 = iM1018a == -1 && c0139h5 != null;
                    if (ut4Var != null) {
                        z4 = z;
                        n66Var2 = n66Var;
                        j3 = j;
                        if (z5) {
                            ArrayList arrayList17 = arrayList2;
                            ut4.m22909b(ut4Var, du4Var4, un1Var, qp3Var, i5, i6, z4);
                            C0134c[] c0134cArr = ut4Var.f64327a;
                            int length2 = c0134cArr.length;
                            int i27 = 0;
                            while (i27 < length2) {
                                C0134c c0134c = c0134cArr[i27];
                                if (c0134c != null) {
                                    long j7 = j3;
                                    i17 = length2;
                                    i16 = i27;
                                    if (f84.m11593b(c0134c.f2547l, 9223372034707292159L)) {
                                        j4 = j7;
                                    } else {
                                        j4 = j7;
                                        c0134c.f2547l = f84.m11595d(c0134c.f2547l, j4);
                                    }
                                } else {
                                    i16 = i27;
                                    i17 = length2;
                                    j4 = j3;
                                }
                                long j8 = j4;
                                length2 = i17;
                                j3 = j8;
                                i27 = i16 + 1;
                            }
                            j2 = j3;
                            if (z6) {
                                for (C0134c c0134c2 : ut4Var.f64327a) {
                                    if (c0134c2 != null) {
                                        if (c0134c2.m1001c()) {
                                            arrayList17.remove(c0134c2);
                                            wh2 wh2Var = this.f2563j;
                                            if (wh2Var != null) {
                                                AbstractC3489q9.m19789s(wh2Var);
                                            }
                                        }
                                        c0134c2.m999a();
                                    }
                                }
                            }
                            m1014g(du4Var4, false);
                        }
                        break;
                    }
                    ut4 ut4Var2 = new ut4(this);
                    z4 = z;
                    ArrayList arrayList18 = arrayList3;
                    n66Var2 = n66Var;
                    ArrayList arrayList19 = arrayList4;
                    j3 = j;
                    ut4.m22909b(ut4Var2, du4Var4, un1Var, qp3Var, i5, i6, z4);
                    n66Var2.m17261m(du4Var4.getKey(), ut4Var2);
                    if (du4Var4.getIndex() == iM1018a || iM1018a == -1) {
                        long jMo10673g = du4Var4.mo10673g(0);
                        m1007c(du4Var4, (int) (z4 ? jMo10673g & 4294967295L : jMo10673g >> 32), ut4Var2, z4);
                        if (z6) {
                            for (C0134c c0134c3 : ut4Var2.f64327a) {
                                if (c0134c3 != null) {
                                    c0134c3.m999a();
                                }
                            }
                        }
                    } else if (iM1018a < i21) {
                        arrayList19.add(du4Var4);
                    } else {
                        arrayList18.add(du4Var4);
                    }
                    j2 = j3;
                    break;
                    break;
                }
                i26++;
                arrayList3 = arrayList3;
                arrayList2 = arrayList2;
                i21 = i21;
                j = j;
                n66Var = n66Var;
                arrayList4 = arrayList4;
                size3 = i14;
                i25 = i15;
            }
            i25 = i15 + 1;
            arrayList16 = arrayList;
            i21 = i21;
            j = j2;
            n66Var = n66Var2;
            size3 = i14;
        }
        ArrayList arrayList20 = arrayList2;
        ArrayList arrayList21 = arrayList3;
        n66 n66Var3 = n66Var;
        ArrayList arrayList22 = arrayList4;
        int i28 = 2;
        C0134c c0134c4 = null;
        int[] iArr4 = new int[i18];
        if (z5 && c0139h5 != null) {
            if (arrayList22.isEmpty()) {
                i13 = 0;
            } else {
                if (arrayList22.size() > 1) {
                    x91.m24414t0(arrayList22, new vt4(c0139h5, i28));
                }
                int size5 = arrayList22.size();
                int i29 = 0;
                while (i29 < size5) {
                    du4 du4Var5 = (du4) arrayList22.get(i29);
                    int iM1008h = i5 - m1008h(iArr4, du4Var5, z);
                    int i30 = i28;
                    Object objM17255g = n66Var3.m17255g(du4Var5.getKey());
                    objM17255g.getClass();
                    m1007c(du4Var5, iM1008h, (ut4) objM17255g, z);
                    m1014g(du4Var5, false);
                    i29++;
                    i28 = i30;
                }
                i13 = 0;
                AbstractC3550rv.m20834b0(0, 0, 6, iArr4);
            }
            if (!arrayList21.isEmpty()) {
                if (arrayList21.size() > 1) {
                    x91.m24414t0(arrayList21, new vt4(c0139h5, i13));
                }
                int size6 = arrayList21.size();
                for (int i31 = 0; i31 < size6; i31++) {
                    du4 du4Var6 = (du4) arrayList21.get(i31);
                    int iM1008h2 = (m1008h(iArr4, du4Var6, z) + i6) - b34.m3208C(du4Var6, z);
                    Object objM17255g2 = n66Var3.m17255g(du4Var6.getKey());
                    objM17255g2.getClass();
                    m1007c(du4Var6, iM1008h2, (ut4) objM17255g2, z);
                    m1014g(du4Var6, false);
                }
                AbstractC3550rv.m20834b0(0, 0, 6, iArr4);
            }
        }
        Object[] objArr2 = o66Var2.f1303b;
        long[] jArr4 = o66Var2.f1302a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList23 = this.f2561h;
        ArrayList arrayList24 = this.f2560g;
        if (length3 >= 0) {
            o66Var = o66Var2;
            int i32 = 0;
            while (true) {
                long j9 = jArr4[i32];
                arrayList5 = arrayList22;
                Object[] objArr3 = objArr2;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    long j10 = j9;
                    int i34 = 0;
                    while (i34 < i33) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr3[(i32 << 3) + i34];
                            ut4 ut4Var3 = (ut4) n66Var3.m17255g(obj);
                            if (ut4Var3 == null) {
                                i9 = i34;
                                iArr3 = iArr4;
                                arrayList10 = arrayList21;
                                jArr2 = jArr4;
                                arrayList11 = arrayList23;
                                c0139h4 = c0139h5;
                                arrayList12 = arrayList20;
                                i10 = length3;
                                arrayList13 = arrayList24;
                            } else {
                                i9 = i34;
                                arrayList10 = arrayList21;
                                int iM1018a2 = c0139h.m1018a(obj);
                                jArr2 = jArr4;
                                int iMin = Math.min(i18, ut4Var3.f64331e);
                                ut4Var3.f64331e = iMin;
                                int i35 = length3;
                                ut4Var3.f64330d = Math.min(i18 - iMin, ut4Var3.f64330d);
                                if (iM1018a2 == -1) {
                                    C0134c[] c0134cArr2 = ut4Var3.f64327a;
                                    int length4 = c0134cArr2.length;
                                    int i36 = 0;
                                    boolean z7 = false;
                                    int i37 = 0;
                                    while (i36 < length4) {
                                        C0134c[] c0134cArr3 = c0134cArr2;
                                        C0134c c0134c5 = c0134cArr3[i36];
                                        int i38 = i37 + 1;
                                        if (c0134c5 != null) {
                                            if (c0134c5.m1001c()) {
                                                i11 = i36;
                                                i12 = length4;
                                                arrayList24 = arrayList24;
                                                arrayList23 = arrayList23;
                                            } else {
                                                i11 = i36;
                                                if (((Boolean) ((xc9) c0134c5.f2546k).getValue()).booleanValue()) {
                                                    c0134c5.m1002d();
                                                    ut4Var3.f64327a[i37] = c0134c4;
                                                    arrayList20.remove(c0134c5);
                                                    wh2 wh2Var2 = this.f2563j;
                                                    if (wh2Var2 != null) {
                                                        AbstractC3489q9.m19789s(wh2Var2);
                                                    }
                                                } else {
                                                    C0312a c0312a = c0134c5.f2550o;
                                                    i12 = length4;
                                                    if (c0312a != null) {
                                                        l43 l43Var = c0134c5.f2541f;
                                                        if (!c0134c5.m1001c() && l43Var != null) {
                                                            c0134c5.m1004f(true);
                                                            ?? r13 = c0134c4;
                                                            wfb.m23926u(c0134c5.f2536a, r13, r13, new LazyLayoutItemAnimation$animateDisappearance$1(c0134c5, l43Var, c0312a, r13), 3);
                                                        }
                                                    }
                                                    if (c0134c5.m1001c()) {
                                                        arrayList20.add(c0134c5);
                                                        wh2 wh2Var3 = this.f2563j;
                                                        if (wh2Var3 != null) {
                                                            AbstractC3489q9.m19789s(wh2Var3);
                                                        }
                                                        c0134c4 = null;
                                                    } else {
                                                        c0134c5.m1002d();
                                                        c0134c4 = null;
                                                        ut4Var3.f64327a[i37] = null;
                                                    }
                                                }
                                                i36 = i11 + 1;
                                                c0134cArr2 = c0134cArr3;
                                                i37 = i38;
                                                length4 = i12;
                                                arrayList24 = arrayList24;
                                                arrayList23 = arrayList23;
                                            }
                                            z7 = true;
                                            i36 = i11 + 1;
                                            c0134cArr2 = c0134cArr3;
                                            i37 = i38;
                                            length4 = i12;
                                            arrayList24 = arrayList24;
                                            arrayList23 = arrayList23;
                                        } else {
                                            i11 = i36;
                                        }
                                        i12 = length4;
                                        arrayList24 = arrayList24;
                                        arrayList23 = arrayList23;
                                        i36 = i11 + 1;
                                        c0134cArr2 = c0134cArr3;
                                        i37 = i38;
                                        length4 = i12;
                                        arrayList24 = arrayList24;
                                        arrayList23 = arrayList23;
                                    }
                                    arrayList14 = arrayList24;
                                    arrayList15 = arrayList23;
                                    if (!z7) {
                                        m1013f(obj);
                                    }
                                } else {
                                    arrayList14 = arrayList24;
                                    arrayList15 = arrayList23;
                                    bk1 bk1Var = ut4Var3.f64328b;
                                    bk1Var.getClass();
                                    du4 du4VarMo12211p = abstractC3572sf.mo12211p(iM1018a2, ut4Var3.f64330d, ut4Var3.f64331e, bk1Var.f8631a);
                                    du4VarMo12211p.mo10676j();
                                    C0134c[] c0134cArr4 = ut4Var3.f64327a;
                                    int length5 = c0134cArr4.length;
                                    int i39 = 0;
                                    while (true) {
                                        if (i39 >= length5) {
                                            du4Var = du4VarMo12211p;
                                            if (c0139h5 != null && iM1018a2 == c0139h5.m1018a(obj)) {
                                                m1013f(obj);
                                            }
                                        } else {
                                            C0134c c0134c6 = c0134cArr4[i39];
                                            if (c0134c6 != null) {
                                                du4Var = du4VarMo12211p;
                                                if (((Boolean) ((xc9) c0134c6.f2543h).getValue()).booleanValue()) {
                                                }
                                            } else {
                                                du4Var = du4VarMo12211p;
                                            }
                                            i39++;
                                            du4VarMo12211p = du4Var;
                                        }
                                        iArr3 = iArr4;
                                        c0139h4 = c0139h5;
                                        arrayList12 = arrayList20;
                                        du4 du4Var7 = du4Var;
                                        i10 = i35;
                                        arrayList13 = arrayList14;
                                        arrayList11 = arrayList15;
                                        ut4Var3.m22910a(du4Var7, un1Var, qp3Var, i5, i6, ut4Var3.f64329c);
                                        if (iM1018a2 < this.f2556c) {
                                            arrayList13.add(du4Var7);
                                        } else {
                                            arrayList11.add(du4Var7);
                                        }
                                    }
                                }
                                iArr3 = iArr4;
                                c0139h4 = c0139h5;
                                arrayList12 = arrayList20;
                                i10 = i35;
                                arrayList13 = arrayList14;
                                arrayList11 = arrayList15;
                            }
                        } else {
                            i9 = i34;
                            iArr3 = iArr4;
                            arrayList10 = arrayList21;
                            jArr2 = jArr4;
                            arrayList11 = arrayList23;
                            c0139h4 = c0139h5;
                            arrayList12 = arrayList20;
                            i10 = length3;
                            arrayList13 = arrayList24;
                        }
                        j10 >>= 8;
                        i18 = i4;
                        arrayList23 = arrayList11;
                        i34 = i9 + 1;
                        arrayList24 = arrayList13;
                        length3 = i10;
                        arrayList20 = arrayList12;
                        iArr4 = iArr3;
                        c0139h5 = c0139h4;
                        arrayList21 = arrayList10;
                        jArr4 = jArr2;
                    }
                    c0139h2 = c0139h;
                    iArr = iArr4;
                    arrayList6 = arrayList21;
                    jArr = jArr4;
                    arrayList8 = arrayList23;
                    c0139h3 = c0139h5;
                    arrayList9 = arrayList20;
                    i8 = length3;
                    arrayList7 = arrayList24;
                    if (i33 != 8) {
                        break;
                    }
                } else {
                    c0139h2 = c0139h;
                    iArr = iArr4;
                    arrayList6 = arrayList21;
                    jArr = jArr4;
                    arrayList8 = arrayList23;
                    c0139h3 = c0139h5;
                    arrayList9 = arrayList20;
                    i8 = length3;
                    arrayList7 = arrayList24;
                }
                if (i32 == i8) {
                    break;
                }
                i32++;
                i18 = i4;
                arrayList23 = arrayList8;
                arrayList24 = arrayList7;
                length3 = i8;
                arrayList20 = arrayList9;
                iArr4 = iArr;
                objArr2 = objArr3;
                arrayList22 = arrayList5;
                c0139h5 = c0139h3;
                arrayList21 = arrayList6;
                jArr4 = jArr;
            }
        } else {
            c0139h2 = c0139h;
            o66Var = o66Var2;
            arrayList5 = arrayList22;
            iArr = iArr4;
            arrayList6 = arrayList21;
            arrayList7 = arrayList24;
            arrayList8 = arrayList23;
        }
        if (arrayList7.isEmpty()) {
            iArr2 = iArr;
        } else {
            if (arrayList7.size() > 1) {
                x91.m24414t0(arrayList7, new vt4(c0139h2, 3));
            }
            int size7 = arrayList7.size();
            int i40 = 0;
            while (i40 < size7) {
                du4 du4Var8 = (du4) arrayList7.get(i40);
                Object objM17255g3 = n66Var3.m17255g(du4Var8.getKey());
                objM17255g3.getClass();
                ut4 ut4Var4 = (ut4) objM17255g3;
                int[] iArr5 = iArr;
                int iM1008h3 = m1008h(iArr5, du4Var8, z);
                if (z2) {
                    long jMo10673g2 = ((du4) u91.m22589G0(arrayList)).mo10673g(0);
                    i7 = (int) (z ? jMo10673g2 & 4294967295L : jMo10673g2 >> 32);
                } else {
                    i7 = ut4Var4.f64332f;
                }
                du4Var8.mo10677k(i7 - iM1008h3, ut4Var4.f64329c, i2, i3);
                if (z5) {
                    m1014g(du4Var8, true);
                }
                i40++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            AbstractC3550rv.m20834b0(0, 0, 6, iArr2);
        }
        if (!arrayList8.isEmpty()) {
            int i41 = 1;
            if (arrayList8.size() > 1) {
                x91.m24414t0(arrayList8, new vt4(c0139h2, i41));
            }
            int size8 = arrayList8.size();
            for (int i42 = 0; i42 < size8; i42++) {
                du4 du4Var9 = (du4) arrayList8.get(i42);
                Object objM17255g4 = n66Var3.m17255g(du4Var9.getKey());
                objM17255g4.getClass();
                ut4 ut4Var5 = (ut4) objM17255g4;
                du4Var9.mo10677k((ut4Var5.f64333g - b34.m3208C(du4Var9, z)) + m1008h(iArr2, du4Var9, z), ut4Var5.f64329c, i2, i3);
                if (z5) {
                    m1014g(du4Var9, true);
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList8);
        arrayList5.clear();
        arrayList6.clear();
        arrayList7.clear();
        arrayList8.clear();
        o66Var.m17812e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m1012e() {
        n66 n66Var = this.f2554a;
        if (n66Var.m17258j()) {
            Object[] objArr = n66Var.f52401c;
            long[] jArr = n66Var.f52399a;
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
                                for (C0134c c0134c : ((ut4) objArr[(i << 3) + i3]).f64327a) {
                                    if (c0134c != null) {
                                        c0134c.m1002d();
                                    }
                                }
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
            n66Var.m17249a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1013f(Object obj) {
        ut4 ut4Var = (ut4) this.f2554a.m17259k(obj);
        if (ut4Var != null) {
            for (C0134c c0134c : ut4Var.f64327a) {
                if (c0134c != null) {
                    c0134c.m1002d();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1014g(du4 du4Var, boolean z) {
        Object objM17255g = this.f2554a.m17255g(du4Var.getKey());
        objM17255g.getClass();
        C0134c[] c0134cArr = ((ut4) objM17255g).f64327a;
        int length = c0134cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C0134c c0134c = c0134cArr[i];
            int i3 = i2 + 1;
            if (c0134c != null) {
                long jMo10673g = du4Var.mo10673g(i2);
                long j = c0134c.f2547l;
                if (!f84.m11593b(j, 9223372034707292159L) && !f84.m11593b(j, jMo10673g)) {
                    long jM11594c = f84.m11594c(jMo10673g, j);
                    l43 l43Var = c0134c.f2540e;
                    if (l43Var != null) {
                        long jM11594c2 = f84.m11594c(((f84) ((xc9) c0134c.f2553r).getValue()).f38612a, jM11594c);
                        c0134c.m1006h(jM11594c2);
                        c0134c.m1005g(true);
                        c0134c.f2542g = z;
                        wfb.m23926u(c0134c.f2536a, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(c0134c, l43Var, jM11594c2, null), 3);
                    }
                }
                c0134c.f2547l = jMo10673g;
            }
            i++;
            i2 = i3;
        }
    }
}
