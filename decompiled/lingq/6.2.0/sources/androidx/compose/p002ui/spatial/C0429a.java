package androidx.compose.p002ui.spatial;

import android.os.Trace;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0361k;
import androidx.compose.p002ui.platform.C0403o;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.AbstractC3695vr;
import p000.C3047gq;
import p000.RunnableC3684vg;
import p000.b17;
import p000.d84;
import p000.f84;
import p000.g28;
import p000.h66;
import p000.i54;
import p000.k40;
import p000.m66;
import p000.pq4;
import p000.t56;
import p000.te1;
import p000.ts5;
import p000.ui3;
import p000.x66;
import p000.xfa;
import p000.xz9;
import p000.yz9;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0429a {

    /* JADX INFO: renamed from: a */
    public final d84 f5029a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f5030b;

    /* JADX INFO: renamed from: c */
    public final C3047gq f5031c;

    /* JADX INFO: renamed from: d */
    public final yz9 f5032d;

    /* JADX INFO: renamed from: e */
    public final h66 f5033e;

    /* JADX INFO: renamed from: f */
    public boolean f5034f;

    /* JADX INFO: renamed from: g */
    public boolean f5035g;

    /* JADX INFO: renamed from: h */
    public boolean f5036h;

    /* JADX INFO: renamed from: i */
    public RunnableC3684vg f5037i;

    /* JADX INFO: renamed from: j */
    public long f5038j;

    /* JADX INFO: renamed from: k */
    public final ui3 f5039k;

    /* JADX INFO: renamed from: l */
    public final m66 f5040l;

    public C0429a(t56 t56Var, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f5029a = t56Var;
        this.f5030b = viewTreeObserverOnGlobalLayoutListenerC0391c;
        C3047gq c3047gq = new C3047gq(5, false);
        c3047gq.f41172c = new long[192];
        c3047gq.f41173d = new long[192];
        this.f5031c = c3047gq;
        this.f5032d = new yz9();
        this.f5033e = new h66();
        this.f5038j = -1L;
        this.f5039k = new ui3() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0429a c0429a = this.f5028b;
                c0429a.f5037i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c0429a.m1874a();
                    return xfa.f68157a;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.f5040l = new m66();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1870c(AbstractC0362l abstractC0362l) {
        b17 b17Var = abstractC0362l.f4455g0;
        return (b17Var == null || AbstractC3695vr.m23514y(((C0403o) b17Var).m1807b())) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1871d(C0357g c0357g) {
        return c0357g.f4346g != -4;
    }

    /* JADX INFO: renamed from: g */
    public static long m1872g(C0357g c0357g) {
        k40 k40Var = c0357g.f4335a0;
        AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
        long jM11595d = 0;
        for (AbstractC0362l abstractC0362l2 = (C0353c) k40Var.f46676d; abstractC0362l2 != null && abstractC0362l2 != abstractC0362l; abstractC0362l2 = abstractC0362l2.f4434L) {
            if (m1870c(abstractC0362l2)) {
                return 9223372034707292159L;
            }
            jM11595d = f84.m11595d(jM11595d, abstractC0362l2.f4443U);
        }
        return jM11595d;
    }

    /* JADX INFO: renamed from: j */
    public static void m1873j(C0357g c0357g) {
        if (!c0357g.f4338c || m1870c((AbstractC0362l) c0357g.f4335a0.f46677e)) {
            return;
        }
        c0357g.f4338c = false;
        if (c0357g.f4342e) {
            c0357g.f4340d = m1872g(c0357g);
            c0357g.f4342e = false;
        }
        if (f84.m11593b(c0357g.f4340d, 9223372034707292159L)) {
            return;
        }
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            m1873j((C0357g) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0238  */
    /* JADX WARN: Code duplicated, block: B:103:0x024e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0262  */
    /* JADX WARN: Code duplicated, block: B:108:0x0272  */
    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:112:0x0281 A[LOOP:11: B:111:0x027f->B:112:0x0281, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02be  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c9 A[LOOP:9: B:104:0x0253->B:119:0x02c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02db A[LOOP:12: B:125:0x02d9->B:126:0x02db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d4 A[EDGE_INSN: B:159:0x02d4->B:122:0x02d4 BREAK  A[LOOP:9: B:104:0x0253->B:119:0x02c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4 A[LOOP:7: B:83:0x01a2->B:84:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x0213  */
    /* JADX INFO: renamed from: a */
    public final void m1874a() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        yz9 yz9Var;
        C3047gq c3047gq;
        long j5;
        long j6;
        float[] fArr;
        Object[] objArr;
        long[] jArr;
        int length;
        long jM25390a;
        xz9 xz9Var;
        long j7;
        xz9 xz9Var2;
        int i;
        long j8;
        long j9;
        long j10;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j11;
        int i7;
        int i8;
        xz9 xz9Var3;
        long[] jArr2;
        long[] jArr3;
        int i9;
        int i10;
        int i11;
        long j12;
        long j13;
        float[] fArr2;
        xz9 xz9Var4;
        xz9 xz9Var5;
        long j14;
        long j15;
        RunnableC3684vg runnableC3684vg = this.f5037i;
        if (runnableC3684vg != null) {
            this.f5030b.removeCallbacks(runnableC3684vg);
            this.f5037i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f5034f;
        boolean z3 = z2 || this.f5035g;
        long j16 = 0;
        C3047gq c3047gq2 = this.f5031c;
        boolean z4 = true;
        yz9 yz9Var2 = this.f5032d;
        if (z2) {
            this.f5034f = false;
            h66 h66Var = this.f5033e;
            Object[] objArr2 = h66Var.f1293a;
            int i12 = h66Var.f1294b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((ui3) objArr2[i13]).mo0a();
            }
            long[] jArr4 = (long[]) c3047gq2.f41172c;
            int i14 = c3047gq2.f41171b;
            int i15 = 0;
            while (i15 < jArr4.length - 2 && i15 < i14) {
                boolean z5 = z4;
                int i16 = i14;
                long j17 = jArr4[i15 + 2];
                boolean z6 = z3;
                if ((((int) (j17 >> 60)) & 1) != 0) {
                    long j18 = jArr4[i15];
                    long j19 = jArr4[i15 + 1];
                    xz9 xz9Var6 = (xz9) yz9Var2.f70710a.m10152b(((int) j17) & 33554431);
                    while (xz9Var6 != null) {
                        xz9 xz9Var7 = xz9Var6.f69026e;
                        int i17 = i15;
                        long j20 = xz9Var6.f69029h;
                        long j21 = xz9Var6.f69023b;
                        boolean z7 = (jCurrentTimeMillis - j20 >= j16 || j20 == Long.MIN_VALUE) ? z5 : false;
                        boolean z8 = j21 == j16 ? z5 : false;
                        xz9Var6.f69027f = j18;
                        xz9Var6.f69028g = j19;
                        if (z7 && z8) {
                            j14 = j19;
                            xz9Var6.f69030i = -1L;
                            xz9Var6.f69029h = jCurrentTimeMillis;
                            j15 = j16;
                            xz9Var6.m24799a(j18, j14, yz9Var2.f70713d, yz9Var2.f70714e, yz9Var2.f70716g);
                        } else {
                            j14 = j19;
                            j15 = j16;
                            if (!z8) {
                                xz9Var6.f69030i = jCurrentTimeMillis;
                                long j22 = yz9Var2.f70712c;
                                long j23 = j21 + jCurrentTimeMillis;
                                if (j22 > j15 && j23 < j22) {
                                    yz9Var2.f70712c = j22;
                                }
                            }
                        }
                        i15 = i17;
                        xz9Var6 = xz9Var7;
                        j19 = j14;
                        j16 = j15;
                    }
                }
                i15 += 3;
                i14 = i16;
                z3 = z6;
                z4 = z5;
                j16 = j16;
            }
            z = z3;
            j = j16;
            long[] jArr5 = (long[]) c3047gq2.f41172c;
            int i18 = c3047gq2.f41171b;
            for (int i19 = 0; i19 < jArr5.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                jArr5[i20] = jArr5[i20] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f5035g) {
            this.f5035g = false;
            long j24 = yz9Var2.f70713d;
            long j25 = yz9Var2.f70714e;
            j2 = jCurrentTimeMillis;
            float[] fArr3 = yz9Var2.f70716g;
            t56 t56Var = yz9Var2.f70710a;
            j3 = 128;
            Object[] objArr3 = t56Var.f35145c;
            long[] jArr6 = t56Var.f35143a;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                j4 = 255;
                while (true) {
                    long j26 = jArr6[i21];
                    long[] jArr7 = jArr6;
                    yz9 yz9Var3 = yz9Var2;
                    if ((((~j26) << 7) & j26 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        long j27 = j26;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j27 & 255) < 128) {
                                xz9 xz9Var8 = (xz9) objArr3[(i21 << 3) + i23];
                                while (xz9Var8 != null) {
                                    C3047gq c3047gq3 = c3047gq2;
                                    xz9 xz9Var9 = xz9Var8;
                                    yz9Var3.m25391b(xz9Var9, j24, j25, fArr3, j2);
                                    xz9Var8 = xz9Var9.f69026e;
                                    c3047gq2 = c3047gq3;
                                }
                            }
                            j27 >>= 8;
                            i23++;
                            yz9Var3 = yz9Var3;
                            c3047gq2 = c3047gq2;
                        }
                        c3047gq2 = c3047gq2;
                        yz9Var2 = yz9Var3;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        c3047gq2 = c3047gq2;
                        yz9Var2 = yz9Var3;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21++;
                    c3047gq2 = c3047gq2;
                    jArr6 = jArr7;
                }
            }
            if (z) {
                j12 = yz9Var2.f70713d;
                j13 = yz9Var2.f70714e;
                fArr2 = yz9Var2.f70716g;
                xz9Var4 = yz9Var2.f70711b;
                if (xz9Var4 != null) {
                    xz9Var5 = xz9Var4;
                    while (xz9Var5 != null) {
                        C0357g c0357gM21979L = te1.m21979L(xz9Var5.f69024c);
                        long jM1875b = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L)).getRectManager().m1875b(c0357gM21979L);
                        xz9Var5.f69027f = jM1875b;
                        C0361k c0361k = c0357gM21979L.f4337b0.f58070p;
                        xz9Var5.f69028g = (((long) (c0361k.f49301a + ((int) (jM1875b >> 32)))) << 32) | (((long) (c0361k.f49302b + ((int) (jM1875b & 4294967295L)))) & 4294967295L);
                        yz9Var2.m25391b(xz9Var5, j12, j13, fArr2, j2);
                        xz9Var5 = xz9Var5.f69026e;
                        c3047gq2 = c3047gq2;
                    }
                }
            }
            yz9Var = yz9Var2;
            c3047gq = c3047gq2;
            if (this.f5036h) {
                this.f5036h = false;
                jArr2 = (long[]) c3047gq.f41172c;
                int i24 = c3047gq.f41171b;
                jArr3 = (long[]) c3047gq.f41173d;
                i10 = 0;
                for (i9 = 0; i9 < jArr2.length - 2 && i10 < jArr3.length - 2 && i9 < i24; i9 += 3) {
                    i11 = i9 + 2;
                    if (jArr2[i11] != g28.f40081a) {
                        jArr3[i10] = jArr2[i9];
                        jArr3[i10 + 1] = jArr2[i9 + 1];
                        jArr3[i10 + 2] = jArr2[i11];
                        i10 += 3;
                    }
                }
                c3047gq.f41171b = i10;
                c3047gq.f41172c = jArr3;
                c3047gq.f41173d = jArr2;
            }
            if (yz9Var.f70712c <= j2) {
                j5 = yz9Var.f70713d;
                j6 = yz9Var.f70714e;
                fArr = yz9Var.f70716g;
                t56 t56Var2 = yz9Var.f70710a;
                objArr = t56Var2.f35145c;
                jArr = t56Var2.f35143a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j8 = Long.MAX_VALUE;
                    while (true) {
                        j9 = jArr[i];
                        j10 = j5;
                        i2 = length;
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i5 = 8;
                            i6 = 8 - ((~(i - i2)) >>> 31);
                            jM25390a = j8;
                            j11 = j9;
                            i7 = 0;
                            while (i7 < i6) {
                                if ((j11 & j4) < j3) {
                                    xz9Var3 = (xz9) objArr[(i << 3) + i7];
                                    while (xz9Var3 != null) {
                                        int i25 = i6;
                                        xz9 xz9Var10 = xz9Var3;
                                        long j28 = j10;
                                        int i26 = i7;
                                        int i27 = i5;
                                        int i28 = i;
                                        long j29 = j2;
                                        jM25390a = yz9.m25390a(xz9Var10, j28, j6, fArr, j29, jM25390a);
                                        j2 = j29;
                                        i = i28;
                                        i5 = i27;
                                        i7 = i26;
                                        j10 = j28;
                                        i2 = i2;
                                        xz9Var3 = xz9Var10.f69026e;
                                        i6 = i25;
                                    }
                                }
                                int i29 = i6;
                                long j30 = j10;
                                int i30 = i7;
                                int i31 = i5;
                                j11 >>= i31;
                                int i32 = i30 + 1;
                                j10 = j30;
                                i2 = i2;
                                i = i;
                                i5 = i31;
                                i7 = i32;
                                i6 = i29;
                            }
                            i3 = i2;
                            i8 = i5;
                            j5 = j10;
                            i4 = i;
                            if (i6 == i8) {
                                break;
                            } else {
                                j8 = jM25390a;
                            }
                        } else {
                            i3 = i2;
                            i4 = i;
                            j5 = j10;
                        }
                        if (i4 != i3) {
                            jM25390a = j8;
                            break;
                        } else {
                            i = i4 + 1;
                            length = i3;
                        }
                    }
                } else {
                    jM25390a = Long.MAX_VALUE;
                }
                xz9Var = yz9Var.f70711b;
                if (xz9Var != null) {
                    for (xz9Var2 = xz9Var; xz9Var2 != null; xz9Var2 = xz9Var2.f69026e) {
                        long j31 = j2;
                        jM25390a = yz9.m25390a(xz9Var2, j5, j6, fArr, j31, jM25390a);
                        j2 = j31;
                    }
                }
                if (jM25390a == Long.MAX_VALUE) {
                    j7 = -1;
                } else {
                    j7 = jM25390a;
                }
                yz9Var.f70712c = j7;
            }
            if (yz9Var.f70712c > j) {
                m1880k();
            }
        }
        j2 = jCurrentTimeMillis;
        j3 = 128;
        j4 = 255;
        if (z) {
            j12 = yz9Var2.f70713d;
            j13 = yz9Var2.f70714e;
            fArr2 = yz9Var2.f70716g;
            xz9Var4 = yz9Var2.f70711b;
            if (xz9Var4 != null) {
                xz9Var5 = xz9Var4;
                while (xz9Var5 != null) {
                    C0357g c0357gM21979L2 = te1.m21979L(xz9Var5.f69024c);
                    long jM1875b2 = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L2)).getRectManager().m1875b(c0357gM21979L2);
                    xz9Var5.f69027f = jM1875b2;
                    C0361k c0361k2 = c0357gM21979L2.f4337b0.f58070p;
                    xz9Var5.f69028g = (((long) (c0361k2.f49301a + ((int) (jM1875b2 >> 32)))) << 32) | (((long) (c0361k2.f49302b + ((int) (jM1875b2 & 4294967295L)))) & 4294967295L);
                    yz9Var2.m25391b(xz9Var5, j12, j13, fArr2, j2);
                    xz9Var5 = xz9Var5.f69026e;
                    c3047gq2 = c3047gq2;
                }
            }
        }
        yz9Var = yz9Var2;
        c3047gq = c3047gq2;
        if (this.f5036h) {
            this.f5036h = false;
            jArr2 = (long[]) c3047gq.f41172c;
            int i210 = c3047gq.f41171b;
            jArr3 = (long[]) c3047gq.f41173d;
            i10 = 0;
            while (i9 < jArr2.length - 2) {
                i11 = i9 + 2;
                if (jArr2[i11] != g28.f40081a) {
                    jArr3[i10] = jArr2[i9];
                    jArr3[i10 + 1] = jArr2[i9 + 1];
                    jArr3[i10 + 2] = jArr2[i11];
                    i10 += 3;
                }
            }
            c3047gq.f41171b = i10;
            c3047gq.f41172c = jArr3;
            c3047gq.f41173d = jArr2;
        }
        if (yz9Var.f70712c <= j2) {
            j5 = yz9Var.f70713d;
            j6 = yz9Var.f70714e;
            fArr = yz9Var.f70716g;
            t56 t56Var3 = yz9Var.f70710a;
            objArr = t56Var3.f35145c;
            jArr = t56Var3.f35143a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j8 = Long.MAX_VALUE;
                while (true) {
                    j9 = jArr[i];
                    j10 = j5;
                    i2 = length;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        i5 = 8;
                        i6 = 8 - ((~(i - i2)) >>> 31);
                        jM25390a = j8;
                        j11 = j9;
                        i7 = 0;
                        while (i7 < i6) {
                            if ((j11 & j4) < j3) {
                                xz9Var3 = (xz9) objArr[(i << 3) + i7];
                                while (xz9Var3 != null) {
                                    int i211 = i6;
                                    xz9 xz9Var11 = xz9Var3;
                                    long j210 = j10;
                                    int i212 = i7;
                                    int i213 = i5;
                                    int i214 = i;
                                    long j211 = j2;
                                    jM25390a = yz9.m25390a(xz9Var11, j210, j6, fArr, j211, jM25390a);
                                    j2 = j211;
                                    i = i214;
                                    i5 = i213;
                                    i7 = i212;
                                    j10 = j210;
                                    i2 = i2;
                                    xz9Var3 = xz9Var11.f69026e;
                                    i6 = i211;
                                }
                            }
                            int i215 = i6;
                            long j32 = j10;
                            int i33 = i7;
                            int i34 = i5;
                            j11 >>= i34;
                            int i35 = i33 + 1;
                            j10 = j32;
                            i2 = i2;
                            i = i;
                            i5 = i34;
                            i7 = i35;
                            i6 = i215;
                        }
                        i3 = i2;
                        i8 = i5;
                        j5 = j10;
                        i4 = i;
                        if (i6 == i8) {
                            break;
                            break;
                        }
                        j8 = jM25390a;
                    } else {
                        i3 = i2;
                        i4 = i;
                        j5 = j10;
                    }
                    if (i4 != i3) {
                        jM25390a = j8;
                        break;
                    } else {
                        i = i4 + 1;
                        length = i3;
                    }
                }
            } else {
                jM25390a = Long.MAX_VALUE;
            }
            xz9Var = yz9Var.f70711b;
            if (xz9Var != null) {
                while (xz9Var2 != null) {
                    long j33 = j2;
                    jM25390a = yz9.m25390a(xz9Var2, j5, j6, fArr, j33, jM25390a);
                    j2 = j33;
                }
            }
            if (jM25390a == Long.MAX_VALUE) {
                j7 = -1;
            } else {
                j7 = jM25390a;
            }
            yz9Var.f70712c = j7;
        }
        if (yz9Var.f70712c > j) {
            m1880k();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m1875b(C0357g c0357g) {
        if (!m1871d(c0357g)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.f5031c.f41172c)[m1876e(c0357g)];
        int i = (int) (j >> 32);
        return (((long) ((int) j)) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: e */
    public final int m1876e(C0357g c0357g) {
        int i = c0357g.f4346g;
        if (i != -4) {
            int i2 = c0357g.f4336b;
            C3047gq c3047gq = this.f5031c;
            long[] jArr = (long[]) c3047gq.f41172c;
            if (i < 0 || i >= c3047gq.f41171b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = c3047gq.f41171b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            i54.m13662a("LayoutNode " + c0357g.f4336b + " not found in RectList");
        }
        c0357g.f4346g = i;
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final void m1877f(C0357g c0357g) {
        c0357g.f4338c = true;
        k40 k40Var = c0357g.f4335a0;
        C0361k c0361k = c0357g.f4337b0.f58070p;
        int iMo1642b0 = c0361k.mo1642b0();
        float fMo1640a0 = c0361k.mo1640a0();
        m66 m66Var = this.f5040l;
        m66Var.f50662a = 0.0f;
        m66Var.f50663b = 0.0f;
        m66Var.f50664c = iMo1642b0;
        m66Var.f50665d = fMo1640a0;
        for (AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e; abstractC0362l != null; abstractC0362l = abstractC0362l.f4434L) {
            C0357g c0357g2 = abstractC0362l.f4432J;
            if (abstractC0362l == ((AbstractC0362l) c0357g2.f4335a0.f46677e) && !c0357g2.f4338c) {
                long jM1875b = m1875b(c0357g2);
                if (!f84.m11593b(jM1875b, 9223372034707292159L)) {
                    m66Var.m16657c((((long) Float.floatToRawIntBits((int) (jM1875b >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM1875b & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            b17 b17Var = abstractC0362l.f4455g0;
            if (b17Var != null) {
                float[] fArrM1807b = ((C0403o) b17Var).m1807b();
                if (!AbstractC3695vr.m23514y(fArrM1807b)) {
                    ts5.m22288c(fArrM1807b, m66Var);
                }
            }
            long j = abstractC0362l.f4443U;
            m66Var.m16657c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) m66Var.f50662a;
        int i2 = (int) m66Var.f50663b;
        int i3 = (int) m66Var.f50664c;
        int i4 = (int) m66Var.f50665d;
        int i5 = c0357g.f4336b;
        int i6 = c0357g.f4346g;
        C3047gq c3047gq = this.f5031c;
        if (i6 != -4) {
            int iM1876e = m1876e(c0357g);
            long[] jArr = (long[]) c3047gq.f41172c;
            jArr[iM1876e] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iM1876e + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iM1876e + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            C0357g c0357gM1610w = c0357g.m1610w();
            c0357g.f4346g = c3047gq.m12807k(i5, i, i2, i3, i4, c0357gM1610w != null ? c0357gM1610w.f4336b : -1, c0357gM1610w != null ? m1876e(c0357gM1610w) : -4, k40Var.m14799f(1024), k40Var.m14799f(16), this.f5032d.f70710a.m10151a(i5));
        }
        c0357g.f4344f = false;
        this.f5034f = true;
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i8 = x66VarM1559B.f67832c;
        for (int i9 = 0; i9 < i8; i9++) {
            C0357g c0357g3 = (C0357g) objArr[i9];
            if (c0357g3.m1570M()) {
                m1877f(c0357g3);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1878h(C0357g c0357g) {
        long j;
        boolean zM1570M = c0357g.m1570M();
        k40 k40Var = c0357g.f4335a0;
        if (zM1570M && c0357g.f4344f) {
            C0357g c0357gM1610w = c0357g.m1610w();
            if (c0357gM1610w == null || c0357gM1610w.f4338c) {
                j = c0357gM1610w == null ? 0L : 9223372034707292159L;
            } else {
                if (c0357gM1610w.f4342e) {
                    c0357gM1610w.f4342e = false;
                    c0357gM1610w.f4340d = m1872g(c0357gM1610w);
                }
                j = c0357gM1610w.f4340d;
            }
            AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
            if (f84.m11593b(j, 9223372034707292159L) || m1870c(abstractC0362l)) {
                m1877f(c0357g);
            } else if (c0357g.f4338c) {
                m1877f(c0357g);
                m1873j(c0357g);
            } else {
                long jM11595d = f84.m11595d(j, abstractC0362l.f4443U);
                C0361k c0361k = c0357g.f4337b0.f58070p;
                int iMo1642b0 = c0361k.mo1642b0();
                int iMo1640a0 = c0361k.mo1640a0();
                int i = c0357g.f4346g;
                C3047gq c3047gq = this.f5031c;
                if (i != -4) {
                    int iM1876e = m1876e(c0357g);
                    if (c0357gM1610w != null) {
                        int iM1876e2 = m1876e(c0357gM1610w);
                        long[] jArr = (long[]) c3047gq.f41172c;
                        long j2 = jArr[iM1876e2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jM11595d >> 32));
                        int i3 = ((int) j2) + ((int) (jM11595d & 4294967295L));
                        long j3 = jArr[iM1876e];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iM1876e + 2;
                        long j4 = jArr[i6];
                        jArr[iM1876e] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iM1876e + 1] = (((long) (iMo1642b0 + i2)) << 32) | (((long) (iMo1640a0 + i3)) & 4294967295L);
                        jArr[i6] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i4 != 0 || i5 != 0) {
                            c3047gq.m12812q(iM1876e, i4, i5, j4);
                        }
                    } else {
                        int iM1876e3 = m1876e(c0357g);
                        int i7 = (int) (jM11595d >> 32);
                        int i8 = (int) (jM11595d & 4294967295L);
                        long[] jArr2 = (long[]) c3047gq.f41172c;
                        long j5 = jArr2[iM1876e3];
                        jArr2[iM1876e3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iM1876e3 + 1] = (((long) (iMo1640a0 + i8)) & 4294967295L) | (((long) (iMo1642b0 + i7)) << 32);
                        int i9 = iM1876e3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            c3047gq.m12812q(iM1876e3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = c0357g.f4336b;
                    boolean zM14799f = k40Var.m14799f(1024);
                    boolean zM14799f2 = k40Var.m14799f(16);
                    boolean zM10151a = this.f5032d.f70710a.m10151a(i12);
                    if (c0357gM1610w != null) {
                        int i13 = c0357gM1610w.f4336b;
                        int iM1876e4 = m1876e(c0357gM1610w);
                        int i14 = (int) (jM11595d >> 32);
                        int i15 = (int) (jM11595d & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) c3047gq.f41172c;
                        if ((((int) jArr3[iM1876e4 + 2]) & 33554431) != (33554431 & i13)) {
                            i54.m13662a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iM1876e4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i14;
                        int i19 = i17 + i15;
                        c0357g.f4346g = c3047gq.m12807k(i16, i18, i19, iMo1642b0 + i18, i19 + iMo1640a0, i13, iM1876e4, zM14799f, zM14799f2, zM10151a);
                    } else {
                        int i20 = (int) (jM11595d >> 32);
                        int i21 = (int) (jM11595d & 4294967295L);
                        c0357g.f4346g = c3047gq.m12807k(i12, i20, i21, i20 + iMo1642b0, i21 + iMo1640a0, -1, -4, zM14799f, zM14799f2, zM10151a);
                    }
                }
            }
            c0357g.f4344f = false;
            this.f5034f = true;
            m1880k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1879i(C0357g c0357g) {
        if (c0357g.f4346g != -4) {
            int iM1876e = m1876e(c0357g);
            long[] jArr = (long[]) this.f5031c.f41172c;
            jArr[iM1876e] = -1;
            jArr[iM1876e + 1] = -1;
            jArr[iM1876e + 2] = g28.f40081a;
            c0357g.f4346g = -4;
            c0357g.f4344f = true;
            this.f5034f = true;
            this.f5036h = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public final void m1880k() {
        RunnableC3684vg runnableC3684vg = this.f5037i;
        boolean z = runnableC3684vg != null;
        long j = this.f5032d.f70712c;
        if (j >= 0 || !z) {
            if (this.f5038j == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f5030b;
            if (runnableC3684vg != null) {
                viewTreeObserverOnGlobalLayoutListenerC0391c.removeCallbacks(runnableC3684vg);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f5038j = jMax;
            RunnableC3684vg runnableC3684vg2 = new RunnableC3684vg(0, this.f5039k);
            viewTreeObserverOnGlobalLayoutListenerC0391c.postDelayed(runnableC3684vg2, jMax - jCurrentTimeMillis);
            this.f5037i = runnableC3684vg2;
        }
    }
}
