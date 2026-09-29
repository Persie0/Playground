package p165i0;

import ae.C0062b;
import dm.C5207g;
import java.util.Arrays;
import jm.C6524g;
import p186j0.C6398a;
import p338qd.C8573r0;
import tl.C9322j;

/* JADX INFO: renamed from: i0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6127t<K, V> {

    /* JADX INFO: renamed from: e */
    public static final C6127t f35949e = new C6127t(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f35950a;

    /* JADX INFO: renamed from: b */
    public int f35951b;

    /* JADX INFO: renamed from: c */
    public final C8573r0 f35952c;

    /* JADX INFO: renamed from: d */
    public Object[] f35953d;

    /* JADX INFO: renamed from: i0.t$a */
    public static final class a<K, V> {

        /* JADX INFO: renamed from: a */
        public C6127t<K, V> f35954a;

        /* JADX INFO: renamed from: b */
        public final int f35955b;

        public a(C6127t<K, V> c6127t, int i10) {
            C5207g.m11111f(c6127t, "node");
            this.f35954a = c6127t;
            this.f35955b = i10;
        }
    }

    public C6127t(int i10, int i11, Object[] objArr, C8573r0 c8573r0) {
        this.f35950a = i10;
        this.f35951b = i11;
        this.f35952c = c8573r0;
        this.f35953d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static C6127t m12622j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C8573r0 c8573r0) {
        if (i12 > 30) {
            return new C6127t(0, 0, new Object[]{obj, obj2, obj3, obj4}, c8573r0);
        }
        int i13 = (i10 >> i12) & 31;
        int i14 = (i11 >> i12) & 31;
        if (i13 == i14) {
            return new C6127t(0, 1 << i13, new Object[]{m12622j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c8573r0)}, c8573r0);
        }
        Object[] objArr = new Object[4];
        if (i13 < i14) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new C6127t((1 << i14) | (1 << i13), 0, objArr, c8573r0);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m12623a(int i10, int i11, int i12, K k10, V v10, int i13, C8573r0 c8573r0) {
        Object obj = this.f35953d[i10];
        C6127t c6127tM12622j = m12622j(obj != null ? obj.hashCode() : 0, obj, m12645x(i10), i12, k10, v10, i13 + 5, c8573r0);
        int iM12641t = m12641t(i11) + 1;
        Object[] objArr = this.f35953d;
        int i14 = iM12641t - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        C9322j.m17675c0(objArr, objArr2, 0, 0, i10, 6);
        C9322j.m17673a0(i10, i10 + 2, iM12641t, objArr, objArr2);
        objArr2[i14] = c6127tM12622j;
        C9322j.m17673a0(i14 + 1, iM12641t, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m12624b() {
        if (this.f35951b == 0) {
            return this.f35953d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f35950a);
        int length = this.f35953d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += m12640s(i10).m12624b();
        }
        return iBitCount;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[LOOP:0: B:10:0x0024->B:16:0x0035, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX INFO: renamed from: c */
    public final boolean m12625c(K k10) {
        C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, this.f35953d.length), 2);
        int i10 = c6524gM356i2.f37163a;
        int i11 = c6524gM356i2.f37164b;
        int i12 = c6524gM356i2.f37165c;
        if (i12 > 0 && i10 <= i11) {
            while (!C5207g.m11106a(k10, this.f35953d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        if (i12 < 0 && i11 <= i10) {
            while (!C5207g.m11106a(k10, this.f35953d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final boolean m12626d(int i10, int i11, Object obj) {
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            return C5207g.m11106a(obj, this.f35953d[m12628f(i12)]);
        }
        if (!m12631i(i12)) {
            return false;
        }
        C6127t<K, V> c6127tM12640s = m12640s(m12641t(i12));
        return i11 == 30 ? c6127tM12640s.m12625c(obj) : c6127tM12640s.m12626d(i10, i11 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12627e(C6127t<K, V> c6127t) {
        if (this == c6127t) {
            return true;
        }
        if (this.f35951b == c6127t.f35951b && this.f35950a == c6127t.f35950a) {
            int length = this.f35953d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f35953d[i10] != c6127t.f35953d[i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m12628f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f35950a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m12629g(int i10, int i11, Object obj) {
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            int iM12628f = m12628f(i12);
            if (C5207g.m11106a(obj, this.f35953d[iM12628f])) {
                return m12645x(iM12628f);
            }
            return null;
        }
        if (!m12631i(i12)) {
            return null;
        }
        C6127t<K, V> c6127tM12640s = m12640s(m12641t(i12));
        if (i11 != 30) {
            return c6127tM12640s.m12629g(i10, i11 + 5, obj);
        }
        C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
        int i13 = c6524gM356i2.f37163a;
        int i14 = c6524gM356i2.f37164b;
        int i15 = c6524gM356i2.f37165c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (!C5207g.m11106a(obj, c6127tM12640s.f35953d[i13])) {
                if (i13 != i14) {
                    i13 += i15;
                }
            }
            return c6127tM12640s.m12645x(i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12630h(int i10) {
        return (i10 & this.f35950a) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12631i(int i10) {
        return (i10 & this.f35951b) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final C6127t<K, V> m12632k(int i10, C6113f<K, V> c6113f) {
        c6113f.getClass();
        c6113f.m12617b(c6113f.f35935f - 1);
        c6113f.f35933d = m12645x(i10);
        Object[] objArr = this.f35953d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f35952c != c6113f.f35931b) {
            return new C6127t<>(0, 0, C0062b.m260E(i10, objArr), c6113f.f35931b);
        }
        this.f35953d = C0062b.m260E(i10, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C6127t<K, V> m12633l(int i10, K k10, V v10, int i11, C6113f<K, V> c6113f) {
        C6127t<K, V> c6127tM12633l;
        C5207g.m11111f(c6113f, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        boolean zM12630h = m12630h(i12);
        C8573r0 c8573r0 = this.f35952c;
        if (zM12630h) {
            int iM12628f = m12628f(i12);
            if (!C5207g.m11106a(k10, this.f35953d[iM12628f])) {
                c6113f.m12617b(c6113f.f35935f + 1);
                C8573r0 c8573r1 = c6113f.f35931b;
                if (c8573r0 != c8573r1) {
                    return new C6127t<>(this.f35950a ^ i12, this.f35951b | i12, m12623a(iM12628f, i12, i10, k10, v10, i11, c8573r1), c8573r1);
                }
                this.f35953d = m12623a(iM12628f, i12, i10, k10, v10, i11, c8573r1);
                this.f35950a ^= i12;
                this.f35951b |= i12;
                return this;
            }
            c6113f.f35933d = m12645x(iM12628f);
            if (m12645x(iM12628f) == v10) {
                return this;
            }
            if (c8573r0 == c6113f.f35931b) {
                this.f35953d[iM12628f + 1] = v10;
                return this;
            }
            c6113f.f35934e++;
            Object[] objArr = this.f35953d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM12628f + 1] = v10;
            return new C6127t<>(this.f35950a, this.f35951b, objArrCopyOf, c6113f.f35931b);
        }
        if (!m12631i(i12)) {
            c6113f.m12617b(c6113f.f35935f + 1);
            C8573r0 c8573r2 = c6113f.f35931b;
            int iM12628f2 = m12628f(i12);
            if (c8573r0 != c8573r2) {
                return new C6127t<>(this.f35950a | i12, this.f35951b, C0062b.m412x(iM12628f2, k10, v10, this.f35953d), c8573r2);
            }
            this.f35953d = C0062b.m412x(iM12628f2, k10, v10, this.f35953d);
            this.f35950a |= i12;
            return this;
        }
        int iM12641t = m12641t(i12);
        C6127t<K, V> c6127tM12640s = m12640s(iM12641t);
        if (i11 == 30) {
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
            int i13 = c6524gM356i2.f37163a;
            int i14 = c6524gM356i2.f37164b;
            int i15 = c6524gM356i2.f37165c;
            if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                c6113f.m12617b(c6113f.f35935f + 1);
                c6127tM12633l = new C6127t<>(0, 0, C0062b.m412x(0, k10, v10, c6127tM12640s.f35953d), c6113f.f35931b);
            } else {
                while (true) {
                    if (!C5207g.m11106a(k10, c6127tM12640s.f35953d[i13])) {
                        if (i13 == i14) {
                            break;
                        }
                        i13 += i15;
                    } else {
                        c6113f.f35933d = c6127tM12640s.m12645x(i13);
                        if (c6127tM12640s.f35952c == c6113f.f35931b) {
                            c6127tM12640s.f35953d[i13 + 1] = v10;
                            c6127tM12633l = c6127tM12640s;
                        } else {
                            c6113f.f35934e++;
                            Object[] objArr2 = c6127tM12640s.f35953d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            C5207g.m11110e(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i13 + 1] = v10;
                            c6127tM12633l = new C6127t<>(0, 0, objArrCopyOf2, c6113f.f35931b);
                        }
                    }
                }
                c6113f.m12617b(c6113f.f35935f + 1);
                c6127tM12633l = new C6127t<>(0, 0, C0062b.m412x(0, k10, v10, c6127tM12640s.f35953d), c6113f.f35931b);
            }
        } else {
            c6127tM12633l = c6127tM12640s.m12633l(i10, k10, v10, i11 + 5, c6113f);
        }
        return c6127tM12640s == c6127tM12633l ? this : m12639r(iM12641t, c6127tM12633l, c6113f.f35931b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [i0.t, i0.t<K, V>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [i0.t] */
    /* JADX WARN: Type inference failed for: r4v22, types: [i0.t] */
    /* JADX WARN: Type inference failed for: r4v23, types: [i0.t] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [i0.t] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type i0.t<K, V> to ?? for r28v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    /* JADX INFO: renamed from: m */
    public final p165i0.C6127t<K, V> m12634m(p165i0.C6127t<K, V> r29, int r30, p209k0.C6562a r31, p165i0.C6113f<K, V> r32) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p165i0.C6127t.m12634m(i0.t, int, k0.a, i0.f):i0.t");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[LOOP:0: B:20:0x0064->B:24:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final C6127t<K, V> m12635n(int i10, K k10, int i11, C6113f<K, V> c6113f) {
        C6127t<K, V> c6127tM12635n;
        C6127t<K, V> c6127t;
        C5207g.m11111f(c6113f, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            int iM12628f = m12628f(i12);
            return C5207g.m11106a(k10, this.f35953d[iM12628f]) ? m12637p(iM12628f, i12, c6113f) : this;
        }
        if (!m12631i(i12)) {
            return this;
        }
        int iM12641t = m12641t(i12);
        C6127t<K, V> c6127tM12640s = m12640s(iM12641t);
        if (i11 == 30) {
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
            int i13 = c6524gM356i2.f37163a;
            int i14 = c6524gM356i2.f37164b;
            int i15 = c6524gM356i2.f37165c;
            if (i15 > 0 && i13 <= i14) {
                while (true) {
                    if (C5207g.m11106a(k10, c6127tM12640s.f35953d[i13])) {
                        c6127tM12635n = c6127tM12640s.m12632k(i13, c6113f);
                    } else if (i13 != i14) {
                        i13 += i15;
                    }
                }
            } else if (i15 < 0 && i14 <= i13) {
                while (true) {
                    if (C5207g.m11106a(k10, c6127tM12640s.f35953d[i13])) {
                        c6127tM12635n = c6127tM12640s.m12632k(i13, c6113f);
                    } else if (i13 != i14) {
                        i13 += i15;
                    }
                }
            }
            c6127t = c6127tM12640s;
            return m12638q(c6127tM12640s, c6127t, iM12641t, i12, c6113f.f35931b);
        }
        c6127tM12635n = c6127tM12640s.m12635n(i10, k10, i11 + 5, c6113f);
        c6127t = c6127tM12635n;
        return m12638q(c6127tM12640s, c6127t, iM12641t, i12, c6113f.f35931b);
    }

    /* JADX INFO: renamed from: o */
    public final C6127t<K, V> m12636o(int i10, K k10, V v10, int i11, C6113f<K, V> c6113f) {
        C6127t<K, V> c6127tM12636o;
        C6127t<K, V> c6127t;
        C5207g.m11111f(c6113f, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            int iM12628f = m12628f(i12);
            return (C5207g.m11106a(k10, this.f35953d[iM12628f]) && C5207g.m11106a(v10, m12645x(iM12628f))) ? m12637p(iM12628f, i12, c6113f) : this;
        }
        if (!m12631i(i12)) {
            return this;
        }
        int iM12641t = m12641t(i12);
        C6127t<K, V> c6127tM12640s = m12640s(iM12641t);
        if (i11 == 30) {
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
            int i13 = c6524gM356i2.f37163a;
            int i14 = c6524gM356i2.f37164b;
            int i15 = c6524gM356i2.f37165c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (C5207g.m11106a(k10, c6127tM12640s.f35953d[i13]) && C5207g.m11106a(v10, c6127tM12640s.m12645x(i13))) {
                        c6127tM12636o = c6127tM12640s.m12632k(i13, c6113f);
                    } else if (i13 != i14) {
                        i13 += i15;
                    }
                }
            }
            c6127t = c6127tM12640s;
            return m12638q(c6127tM12640s, c6127t, iM12641t, i12, c6113f.f35931b);
        }
        c6127tM12636o = c6127tM12640s.m12636o(i10, k10, v10, i11 + 5, c6113f);
        c6127t = c6127tM12636o;
        return m12638q(c6127tM12640s, c6127t, iM12641t, i12, c6113f.f35931b);
    }

    /* JADX INFO: renamed from: p */
    public final C6127t<K, V> m12637p(int i10, int i11, C6113f<K, V> c6113f) {
        c6113f.getClass();
        c6113f.m12617b(c6113f.f35935f - 1);
        c6113f.f35933d = m12645x(i10);
        Object[] objArr = this.f35953d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f35952c != c6113f.f35931b) {
            return new C6127t<>(i11 ^ this.f35950a, this.f35951b, C0062b.m260E(i10, objArr), c6113f.f35931b);
        }
        this.f35953d = C0062b.m260E(i10, objArr);
        this.f35950a ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final C6127t<K, V> m12638q(C6127t<K, V> c6127t, C6127t<K, V> c6127t2, int i10, int i11, C8573r0 c8573r0) {
        C8573r0 c8573r1 = this.f35952c;
        if (c6127t2 == null) {
            Object[] objArr = this.f35953d;
            if (objArr.length == 1) {
                return null;
            }
            if (c8573r1 != c8573r0) {
                return new C6127t<>(this.f35950a, i11 ^ this.f35951b, C0062b.m264F(i10, objArr), c8573r0);
            }
            this.f35953d = C0062b.m264F(i10, objArr);
            this.f35951b ^= i11;
        } else if (c8573r1 == c8573r0 || c6127t != c6127t2) {
            return m12639r(i10, c6127t2, c8573r0);
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C6127t<K, V> m12639r(int i10, C6127t<K, V> c6127t, C8573r0 c8573r0) {
        Object[] objArr = this.f35953d;
        if (objArr.length == 1 && c6127t.f35953d.length == 2 && c6127t.f35951b == 0) {
            c6127t.f35950a = this.f35951b;
            return c6127t;
        }
        if (this.f35952c == c8573r0) {
            objArr[i10] = c6127t;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = c6127t;
        return new C6127t<>(this.f35950a, this.f35951b, objArrCopyOf, c8573r0);
    }

    /* JADX INFO: renamed from: s */
    public final C6127t<K, V> m12640s(int i10) {
        Object obj = this.f35953d[i10];
        C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C6127t) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m12641t(int i10) {
        return (this.f35953d.length - 1) - Integer.bitCount((i10 - 1) & this.f35951b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final a m12642u(int i10, int i11, Object obj, C6398a c6398a) {
        a aVarM12642u;
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            int iM12628f = m12628f(i12);
            if (!C5207g.m11106a(obj, this.f35953d[iM12628f])) {
                return new a(new C6127t(this.f35950a ^ i12, this.f35951b | i12, m12623a(iM12628f, i12, i10, obj, c6398a, i11, null), null), 1);
            }
            if (m12645x(iM12628f) == c6398a) {
                return null;
            }
            Object[] objArr = this.f35953d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iM12628f + 1] = c6398a;
            return new a(new C6127t(this.f35950a, this.f35951b, objArrCopyOf, null), 0);
        }
        if (!m12631i(i12)) {
            return new a(new C6127t(this.f35950a | i12, this.f35951b, C0062b.m412x(m12628f(i12), obj, c6398a, this.f35953d), null), 1);
        }
        int iM12641t = m12641t(i12);
        C6127t<K, V> c6127tM12640s = m12640s(iM12641t);
        if (i11 == 30) {
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
            int i13 = c6524gM356i2.f37163a;
            int i14 = c6524gM356i2.f37164b;
            int i15 = c6524gM356i2.f37165c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (!C5207g.m11106a(obj, c6127tM12640s.f35953d[i13])) {
                        if (i13 == i14) {
                            aVarM12642u = new a(new C6127t(0, 0, C0062b.m412x(0, obj, c6398a, c6127tM12640s.f35953d), null), 1);
                            break;
                        }
                        i13 += i15;
                    } else {
                        if (c6398a != c6127tM12640s.m12645x(i13)) {
                            Object[] objArr2 = c6127tM12640s.f35953d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            C5207g.m11110e(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[i13 + 1] = c6398a;
                            aVarM12642u = new a(new C6127t(0, 0, objArrCopyOf2, null), 0);
                            break;
                        }
                        aVarM12642u = null;
                        break;
                    }
                }
            } else {
                aVarM12642u = new a(new C6127t(0, 0, C0062b.m412x(0, obj, c6398a, c6127tM12640s.f35953d), null), 1);
                break;
            }
            if (aVarM12642u == null) {
                return null;
            }
        } else {
            aVarM12642u = c6127tM12640s.m12642u(i10, i11 + 5, obj, c6398a);
            if (aVarM12642u == null) {
                return null;
            }
        }
        aVarM12642u.f35954a = m12644w(iM12641t, i12, aVarM12642u.f35954a);
        return aVarM12642u;
    }

    /* JADX INFO: renamed from: v */
    public final C6127t m12643v(int i10, int i11, Object obj) {
        C6127t<K, V> c6127tM12643v;
        int i12 = 1 << ((i10 >> i11) & 31);
        if (m12630h(i12)) {
            int iM12628f = m12628f(i12);
            if (!C5207g.m11106a(obj, this.f35953d[iM12628f])) {
                return this;
            }
            Object[] objArr = this.f35953d;
            if (objArr.length == 2) {
                return null;
            }
            return new C6127t(this.f35950a ^ i12, this.f35951b, C0062b.m260E(iM12628f, objArr), null);
        }
        if (!m12631i(i12)) {
            return this;
        }
        int iM12641t = m12641t(i12);
        C6127t<K, V> c6127tM12640s = m12640s(iM12641t);
        if (i11 == 30) {
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, c6127tM12640s.f35953d.length), 2);
            int i13 = c6524gM356i2.f37163a;
            int i14 = c6524gM356i2.f37164b;
            int i15 = c6524gM356i2.f37165c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (!C5207g.m11106a(obj, c6127tM12640s.f35953d[i13])) {
                        if (i13 == i14) {
                            c6127tM12643v = c6127tM12640s;
                            break;
                        }
                        i13 += i15;
                    } else {
                        Object[] objArr2 = c6127tM12640s.f35953d;
                        if (objArr2.length != 2) {
                            c6127tM12643v = new C6127t<>(0, 0, C0062b.m260E(i13, objArr2), null);
                            break;
                        }
                        c6127tM12643v = null;
                        break;
                    }
                }
            } else {
                c6127tM12643v = c6127tM12640s;
                break;
            }
        } else {
            c6127tM12643v = c6127tM12640s.m12643v(i10, i11 + 5, obj);
        }
        if (c6127tM12643v != null) {
            return c6127tM12640s != c6127tM12643v ? m12644w(iM12641t, i12, c6127tM12643v) : this;
        }
        Object[] objArr3 = this.f35953d;
        if (objArr3.length == 1) {
            return null;
        }
        return new C6127t(this.f35950a, i12 ^ this.f35951b, C0062b.m264F(iM12641t, objArr3), null);
    }

    /* JADX INFO: renamed from: w */
    public final C6127t<K, V> m12644w(int i10, int i11, C6127t<K, V> c6127t) {
        Object[] objArr = c6127t.f35953d;
        if (objArr.length != 2 || c6127t.f35951b != 0) {
            Object[] objArr2 = this.f35953d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = c6127t;
            return new C6127t<>(this.f35950a, this.f35951b, objArrCopyOf, null);
        }
        if (this.f35953d.length == 1) {
            c6127t.f35950a = this.f35951b;
            return c6127t;
        }
        int iM12628f = m12628f(i11);
        Object[] objArr3 = this.f35953d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
        C9322j.m17673a0(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        C9322j.m17673a0(iM12628f + 2, iM12628f, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM12628f] = obj;
        objArrCopyOf2[iM12628f + 1] = obj2;
        return new C6127t<>(this.f35950a ^ i11, i11 ^ this.f35951b, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final V m12645x(int i10) {
        return (V) this.f35953d[i10 + 1];
    }
}
