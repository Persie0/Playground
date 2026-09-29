package p000;

import android.os.Trace;
import androidx.compose.foundation.pager.AbstractC0150d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h27 {

    /* JADX INFO: renamed from: a */
    public final cc4 f41702a;

    /* JADX INFO: renamed from: b */
    public final t56 f41703b;

    /* JADX INFO: renamed from: c */
    public final u56 f41704c;

    /* JADX INFO: renamed from: d */
    public final r56 f41705d;

    /* JADX INFO: renamed from: e */
    public final t56 f41706e;

    /* JADX INFO: renamed from: f */
    public float f41707f;

    /* JADX INFO: renamed from: g */
    public int f41708g;

    /* JADX INFO: renamed from: h */
    public int f41709h;

    /* JADX INFO: renamed from: i */
    public int f41710i;

    /* JADX INFO: renamed from: j */
    public int f41711j;

    /* JADX INFO: renamed from: k */
    public int f41712k;

    /* JADX INFO: renamed from: l */
    public boolean f41713l;

    /* JADX INFO: renamed from: m */
    public int f41714m;

    /* JADX INFO: renamed from: n */
    public final lu4 f41715n;

    /* JADX INFO: renamed from: o */
    public final sq5 f41716o;

    public h27(cc4 cc4Var, lu4 lu4Var, fu4 fu4Var) {
        this.f41702a = cc4Var;
        t56 t56Var = e84.f36837a;
        this.f41703b = new t56();
        this.f41704c = new u56();
        int i = y74.f69406a;
        this.f41705d = new r56();
        this.f41706e = new t56();
        this.f41708g = -1;
        this.f41709h = Integer.MAX_VALUE;
        this.f41710i = Integer.MIN_VALUE;
        this.f41715n = lu4Var;
        this.f41716o = new sq5(fu4Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m13003a(sq5 sq5Var, int i, boolean z) {
        List list;
        List list2;
        t56 t56Var = this.f41706e;
        if (t56Var.m10151a(i)) {
            Object objM10152b = t56Var.m10152b(i);
            objM10152b.getClass();
            return ((ql0) objM10152b).f57892b;
        }
        t56 t56Var2 = this.f41703b;
        int i2 = 0;
        if (t56Var2.m10151a(i)) {
            if (!z || (list2 = (List) t56Var2.m10152b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((ku4) list2.get(i2)).mo3885a();
                i2++;
            }
            return -1;
        }
        nl0 nl0Var = new nl0(this, sq5Var, i2);
        long j = sq5Var.m21574p().f52240v;
        lu4 lu4Var = (lu4) sq5Var.f61250d;
        if (lu4Var == null) {
            fa4.m11636J("state");
            throw null;
        }
        t56Var2.m21850i(i, vz1.m23604J(lu4Var.m16545a(i, j, true, new h85(21, nl0Var, sq5Var))));
        if (!z || (list = (List) t56Var2.m10152b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((ku4) list.get(i2)).mo3885a();
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13004b() {
        return (this.f41709h == Integer.MAX_VALUE || this.f41710i == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
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
    /* JADX INFO: renamed from: c */
    public final void m13005c(sq5 sq5Var, int i, int i2) {
        int i3;
        int i4;
        t56 t56Var = this.f41706e;
        ql0 ql0Var = (ql0) t56Var.m10152b(i);
        gz8 gz8Var = ql0.f57890c;
        if (ql0Var != null) {
            ql0Var.f57892b = i2;
            ql0Var.f57891a = gz8Var;
        } else {
            ql0Var = new ql0();
            ql0Var.f57891a = gz8Var;
            ql0Var.f57892b = i2;
        }
        t56Var.m21850i(i, ql0Var);
        if (i > this.f41710i) {
            this.f41710i = i;
            this.f41712k -= i2;
        } else if (i < this.f41709h) {
            this.f41709h = i;
            this.f41711j -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f41707f) <= 0.0f) {
            if (this.f41712k > 0) {
                i3 = this.f41710i + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.f41707f) <= 0.0f || this.f41711j <= 0) {
            i4 = -1;
        } else {
            i3 = this.f41709h - 1;
            i4 = i3;
        }
        if (i4 > 0) {
            sq5Var.getClass();
            if (i4 != -1 && i4 < this.f41714m) {
                nl0 nl0Var = new nl0(this, sq5Var, i5);
                long j = sq5Var.m21574p().f52240v;
                lu4 lu4Var = (lu4) sq5Var.f61250d;
                if (lu4Var == null) {
                    fa4.m11636J("state");
                    throw null;
                }
                this.f41703b.m21850i(i4, vz1.m23604J(lu4Var.m16545a(i4, j, true, new h85(21, nl0Var, sq5Var))));
            }
        }
        m13010h();
    }

    /* JADX INFO: renamed from: d */
    public final void m13006d(sq5 sq5Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f41707f);
        if (!z) {
            if (!z2 || this.f41713l) {
                this.f41711j = i3 - i5;
                this.f41709h = i;
            } else {
                int iM21693T = ss5.m21693T(Math.abs(f)) + this.f41711j;
                int i8 = i3 - i5;
                if (iM21693T > i8) {
                    iM21693T = i8;
                }
                this.f41711j = iM21693T;
            }
            while (this.f41711j > 0 && (i6 = this.f41709h) > 0) {
                int iM13003a = m13003a(sq5Var, this.f41709h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iM13003a == -1) {
                    return;
                }
                this.f41709h--;
                this.f41711j -= iM13003a;
            }
            return;
        }
        if (!z2 || this.f41713l) {
            this.f41712k = i3 - i4;
            this.f41710i = i2;
        } else {
            int iM21693T2 = ss5.m21693T(Math.abs(f)) + this.f41712k;
            int i9 = i3 - i4;
            if (iM21693T2 > i9) {
                iM21693T2 = i9;
            }
            this.f41712k = iM21693T2;
        }
        while (this.f41712k > 0) {
            int i10 = this.f41710i;
            sq5Var.getClass();
            if (i10 == -1 || (i7 = this.f41710i) >= this.f41714m - 1) {
                return;
            }
            int iM13003a2 = m13003a(sq5Var, this.f41710i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iM13003a2 == -1) {
                return;
            }
            this.f41710i++;
            this.f41712k -= iM13003a2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13007e(float f, n27 n27Var) {
        h27 h27Var;
        boolean z;
        int i;
        int i2;
        int i3;
        sq5 sq5Var = this.f41716o;
        sq5Var.f61249c = n27Var;
        sq5Var.f61250d = this.f41715n;
        float f2 = -f;
        m13010h();
        if (sq5Var.m21572n()) {
            pvc.m19522r(sq5Var.m21574p());
            sq5Var.m21574p();
            this.f41714m = sq5Var.m21578t();
            int iM21570l = sq5Var.m21570l();
            int iM21573o = sq5Var.m21573o();
            int iM21578t = sq5Var.m21578t();
            int iM21576r = sq5Var.m21576r();
            int iM21575q = sq5Var.m21575q();
            t56 t56Var = this.f41706e;
            if (f2 <= 0.0f) {
                this.f41711j = 0 - iM21576r;
                this.f41709h = iM21570l;
                while (this.f41711j > 0 && (i3 = this.f41709h) > 0 && t56Var.m10151a(i3 - 1)) {
                    Object objM10152b = t56Var.m10152b(this.f41709h - 1);
                    objM10152b.getClass();
                    int i4 = ((ql0) objM10152b).f57892b;
                    this.f41709h--;
                    this.f41711j -= i4;
                }
                m13008f(0, this.f41709h - 1);
            } else {
                this.f41712k = 0 - iM21575q;
                this.f41710i = iM21573o;
                while (this.f41712k > 0 && (i2 = this.f41710i) < iM21578t - 1 && t56Var.m10151a(i2 + 1)) {
                    Object objM10152b2 = t56Var.m10152b(this.f41710i + 1);
                    objM10152b2.getClass();
                    int i5 = ((ql0) objM10152b2).f57892b;
                    this.f41710i++;
                    this.f41712k -= i5;
                }
                m13008f(this.f41710i + 1, iM21578t - 1);
            }
        }
        if (sq5Var.m21572n()) {
            pvc.m19522r(sq5Var.m21574p());
            if (sq5Var.m21574p().f52239u != null) {
                i = ((AbstractC0150d) this.f41702a.f9881a).f2685o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            h27Var = this;
            h27Var.m13006d(sq5Var, sq5Var.m21570l(), sq5Var.m21573o(), i, sq5Var.m21575q(), sq5Var.m21576r(), f2, f2 <= 0.0f ? true : z);
        } else {
            h27Var = this;
        }
        h27Var.f41707f = f2;
        h27Var.m13010h();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m13008f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        u56 u56Var = this.f41704c;
        u56Var.m22475b();
        t56 t56Var = this.f41703b;
        int[] iArr2 = t56Var.f35144b;
        long[] jArr2 = t56Var.f35143a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            u56Var.m22474a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        r56 r56Var = this.f41705d;
        int[] iArr3 = r56Var.f58762b;
        long[] jArr3 = r56Var.f58761a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                u56Var.m22474a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        t56 t56Var2 = this.f41706e;
        int[] iArr4 = t56Var2.f35144b;
        long[] jArr4 = t56Var2.f35143a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            u56Var.m22474a(i3);
                        }
                        j6 >>= 8;
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
        int[] iArr5 = u56Var.f63437b;
        long[] jArr5 = u56Var.f63436a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) t56Var.m21848g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((ku4) list.get(i19)).cancel();
                            }
                        }
                        int iM20408c = r56Var.m20408c(i18);
                        if (iM20408c >= 0) {
                            r56Var.f58765e--;
                            long[] jArr6 = r56Var.f58761a;
                            int i20 = r56Var.f58764d;
                            int i21 = iM20408c >> 3;
                            int i22 = (iM20408c & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iM20408c - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        t56Var2.m21848g(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13009g() {
        this.f41709h = Integer.MAX_VALUE;
        this.f41710i = Integer.MIN_VALUE;
        this.f41711j = 0;
        this.f41712k = 0;
        this.f41713l = false;
        this.f41705d.m20406a();
        this.f41706e.m21844c();
        t56 t56Var = this.f41703b;
        long[] jArr = t56Var.f35143a;
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
                        int i4 = (i << 3) + i3;
                        int i5 = t56Var.f35144b[i4];
                        List list = (List) t56Var.f35145c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((ku4) list.get(i6)).cancel();
                        }
                        t56Var.m21849h(i4);
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

    /* JADX INFO: renamed from: h */
    public final void m13010h() {
        Trace.setCounter("prefetchWindowStartExtraSpace", this.f41711j);
        Trace.setCounter("prefetchWindowEndExtraSpace", this.f41712k);
        Trace.setCounter("prefetchWindowStartIndex", this.f41709h);
        Trace.setCounter("prefetchWindowEndIndex", this.f41710i);
    }
}
