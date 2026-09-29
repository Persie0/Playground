package p000;

import androidx.compose.runtime.collection.C0275a;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.snapshots.C0285a;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc9 {

    /* JADX INFO: renamed from: a */
    public static final wx8 f52600a = new wx8(1);

    /* JADX INFO: renamed from: b */
    public static final sq5 f52601b = new sq5(13);

    /* JADX INFO: renamed from: c */
    public static final Object f52602c = new Object();

    /* JADX INFO: renamed from: d */
    public static C0285a f52603d;

    /* JADX INFO: renamed from: e */
    public static long f52604e;

    /* JADX INFO: renamed from: f */
    public static final lj1 f52605f;

    /* JADX INFO: renamed from: g */
    public static final C3047gq f52606g;

    /* JADX INFO: renamed from: h */
    public static List f52607h;

    /* JADX INFO: renamed from: i */
    public static List f52608i;

    /* JADX INFO: renamed from: j */
    public static final yn3 f52609j;

    /* JADX INFO: renamed from: k */
    public static final AtomicInt f52610k;

    static {
        C0285a c0285a = C0285a.f3799e;
        f52603d = c0285a;
        f52604e = 2L;
        lj1 lj1Var = new lj1();
        lj1Var.f49733c = new long[16];
        lj1Var.f49734d = new int[16];
        int[] iArr = new int[16];
        boolean z = false;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        lj1Var.f49735e = iArr;
        f52605f = lj1Var;
        C3047gq c3047gq = new C3047gq(6, z);
        c3047gq.f41172c = new int[16];
        c3047gq.f41173d = new n2b[16];
        f52606g = c3047gq;
        EmptyList emptyList = EmptyList.f47638a;
        f52607h = emptyList;
        f52608i = emptyList;
        long j = f52604e;
        f52604e = 1 + j;
        yn3 yn3Var = new yn3(j, c0285a, null, new C2951e4(28));
        f52603d = f52603d.m1317i(yn3Var.f45417b);
        f52609j = yn3Var;
        f52610k = new AtomicInt(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m17349a() {
        m17353e(f52600a);
    }

    /* JADX INFO: renamed from: b */
    public static final HashMap m17350b(long j, s66 s66Var, C0285a c0285a) {
        long[] jArr;
        C0285a c0285a2;
        long[] jArr2;
        int i;
        int i2;
        rh9 rh9VarM17367s;
        o66 o66VarMo3588x = s66Var.mo3588x();
        if (o66VarMo3588x != null) {
            long jMo3582g = s66Var.mo3582g();
            C0285a c0285aM1316h = s66Var.mo3581d().m1317i(jMo3582g).m1316h(s66Var.f60424j);
            Object[] objArr = o66VarMo3588x.f1303b;
            long[] jArr3 = o66VarMo3588x.f1302a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                ph9 ph9Var = (ph9) objArr[(i3 << 3) + i6];
                                rh9 rh9VarMo1310d = ph9Var.mo1310d();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                rh9 rh9VarM17367s2 = m17367s(rh9VarMo1310d, j, c0285a);
                                if (rh9VarM17367s2 != null && (rh9VarM17367s = m17367s(rh9VarMo1310d, jMo3582g, c0285aM1316h)) != null && !rh9VarM17367s2.equals(rh9VarM17367s)) {
                                    rh9 rh9VarM17367s3 = m17367s(rh9VarMo1310d, jMo3582g, s66Var.mo3581d());
                                    if (rh9VarM17367s3 == null) {
                                        m17366r();
                                        throw null;
                                    }
                                    rh9 rh9VarMo19144f = ph9Var.mo19144f(rh9VarM17367s, rh9VarM17367s2, rh9VarM17367s3);
                                    if (rh9VarMo19144f == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(rh9VarM17367s2, rh9VarMo19144f);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c0285aM1316h = c0285aM1316h;
                        }
                        jArr = jArr3;
                        c0285a2 = c0285aM1316h;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c0285a2 = c0285aM1316h;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c0285aM1316h = c0285a2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m17351c(jc9 jc9Var) {
        long j;
        if (f52603d.m1315g(jc9Var.mo3582g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(jc9Var.mo3582g());
        sb.append(", disposed=");
        sb.append(jc9Var.f45418c);
        sb.append(", applied=");
        s66 s66Var = jc9Var instanceof s66 ? (s66) jc9Var : null;
        sb.append(s66Var != null ? Boolean.valueOf(s66Var.f60427m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f52602c) {
            lj1 lj1Var = f52605f;
            j = lj1Var.f49731a > 0 ? ((long[]) lj1Var.f49733c)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public static final C0285a m17352d(C0285a c0285a, long j, long j2) {
        while (fa4.m11652n(j, j2) < 0) {
            c0285a = c0285a.m1317i(j);
            j++;
        }
        return c0285a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[LOOP:1: B:30:0x0059->B:43:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[EDGE_INSN: B:58:0x0096->B:44:0x0096 BREAK  A[LOOP:1: B:30:0x0059->B:43:0x0093], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final Object m17353e(vi3 vi3Var) {
        o66 o66Var;
        Object objM17370v;
        yn3 yn3Var = f52609j;
        synchronized (f52602c) {
            try {
                o66Var = yn3Var.f60422h;
                if (o66Var != null) {
                    f52610k.addAndGet(1);
                }
                objM17370v = m17370v(yn3Var, vi3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o66Var != null) {
            try {
                List list = f52607h;
                C0275a c0275a = new C0275a(o66Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((zi3) list.get(i)).invoke(c0275a, yn3Var);
                }
                f52610k.addAndGet(-1);
            } catch (Throwable th2) {
                f52610k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f52602c) {
            m17354f();
            if (o66Var != null) {
                Object[] objArr = o66Var.f1303b;
                long[] jArr = o66Var.f1302a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m17365q((ph9) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM17370v;
    }

    /* JADX INFO: renamed from: f */
    public static final void m17354f() {
        C3047gq c3047gq = f52606g;
        int i = c3047gq.f41171b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            n2b n2bVar = ((n2b[]) c3047gq.f41173d)[i2];
            Object obj = n2bVar != null ? n2bVar.get() : null;
            if (obj != null && m17364p((ph9) obj)) {
                if (i3 != i2) {
                    ((n2b[]) c3047gq.f41173d)[i3] = n2bVar;
                    int[] iArr = (int[]) c3047gq.f41172c;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((n2b[]) c3047gq.f41173d)[i4] = null;
            ((int[]) c3047gq.f41172c)[i4] = 0;
        }
        if (i3 != i) {
            c3047gq.f41171b = i3;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final jc9 m17355g(jc9 jc9Var, vi3 vi3Var, boolean z) {
        boolean z2 = jc9Var instanceof s66;
        if (z2 || jc9Var == null) {
            return new bba(z2 ? (s66) jc9Var : null, vi3Var, null, false, z);
        }
        return new cba(jc9Var, vi3Var, false, z);
    }

    /* JADX INFO: renamed from: h */
    public static final rh9 m17356h(rh9 rh9Var) {
        rh9 rh9VarM17367s;
        jc9 jc9VarM17358j = m17358j();
        rh9 rh9VarM17367s2 = m17367s(rh9Var, jc9VarM17358j.mo3582g(), jc9VarM17358j.mo3581d());
        if (rh9VarM17367s2 != null) {
            return rh9VarM17367s2;
        }
        synchronized (f52602c) {
            jc9 jc9VarM17358j2 = m17358j();
            rh9VarM17367s = m17367s(rh9Var, jc9VarM17358j2.mo3582g(), jc9VarM17358j2.mo3581d());
        }
        if (rh9VarM17367s != null) {
            return rh9VarM17367s;
        }
        m17366r();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final rh9 m17357i(rh9 rh9Var, jc9 jc9Var) {
        rh9 rh9VarM17367s;
        rh9 rh9VarM17367s2 = m17367s(rh9Var, jc9Var.mo3582g(), jc9Var.mo3581d());
        if (rh9VarM17367s2 != null) {
            return rh9VarM17367s2;
        }
        synchronized (f52602c) {
            rh9VarM17367s = m17367s(rh9Var, jc9Var.mo3582g(), jc9Var.mo3581d());
        }
        if (rh9VarM17367s != null) {
            return rh9VarM17367s;
        }
        m17366r();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final jc9 m17358j() {
        jc9 jc9Var = (jc9) f52601b.m21566g();
        return jc9Var == null ? f52609j : jc9Var;
    }

    /* JADX INFO: renamed from: k */
    public static final vi3 m17359k(vi3 vi3Var, vi3 vi3Var2, boolean z) {
        if (!z) {
            vi3Var2 = null;
        }
        if (vi3Var == null || vi3Var2 == null || vi3Var == vi3Var2) {
            return vi3Var == null ? vi3Var2 : vi3Var;
        }
        return new mc9(vi3Var, vi3Var2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static final vi3 m17360l(vi3 vi3Var, vi3 vi3Var2) {
        if (vi3Var == null || vi3Var2 == null || vi3Var == vi3Var2) {
            return vi3Var == null ? vi3Var2 : vi3Var;
        }
        return new mc9(vi3Var, vi3Var2, 1);
    }

    /* JADX INFO: renamed from: m */
    public static final rh9 m17361m(rh9 rh9Var, ph9 ph9Var) {
        long j = f52604e;
        lj1 lj1Var = f52605f;
        if (lj1Var.f49731a > 0) {
            j = ((long[]) lj1Var.f49733c)[0];
        }
        long j2 = j - 1;
        rh9 rh9Var2 = null;
        rh9 rh9Var3 = null;
        for (rh9 rh9VarMo1310d = ph9Var.mo1310d(); rh9VarMo1310d != null; rh9VarMo1310d = rh9VarMo1310d.f59323b) {
            long j3 = rh9VarMo1310d.f59322a;
            if (j3 != 0) {
                if (j3 != 0 && fa4.m11652n(j3, j2) <= 0 && !C0285a.f3799e.m1315g(j3)) {
                    if (rh9Var3 != null) {
                        if (fa4.m11652n(rh9VarMo1310d.f59322a, rh9Var3.f59322a) >= 0) {
                            rh9Var2 = rh9Var3;
                            break;
                        }
                        break;
                    }
                    rh9Var3 = rh9VarMo1310d;
                }
            }
            rh9Var2 = rh9VarMo1310d;
            break;
        }
        if (rh9Var2 != null) {
            rh9Var2.f59322a = Long.MAX_VALUE;
            return rh9Var2;
        }
        rh9 rh9VarMo3652b = rh9Var.mo3652b(Long.MAX_VALUE);
        rh9VarMo3652b.f59323b = ph9Var.mo1310d();
        ph9Var.mo1311g(rh9VarMo3652b);
        return rh9VarMo3652b;
    }

    /* JADX INFO: renamed from: n */
    public static final void m17362n(jc9 jc9Var, ph9 ph9Var) {
        jc9Var.mo3586t(jc9Var.mo3583h() + 1);
        vi3 vi3VarMo3165i = jc9Var.mo3165i();
        if (vi3VarMo3165i != null) {
            vi3VarMo3165i.invoke(ph9Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final rh9 m17363o(rh9 rh9Var, qh9 qh9Var, jc9 jc9Var, rh9 rh9Var2) {
        rh9 rh9VarM17361m;
        if (jc9Var.mo3164f()) {
            jc9Var.mo3169n(qh9Var);
        }
        long jMo3582g = jc9Var.mo3582g();
        if (rh9Var2.f59322a == jMo3582g) {
            return rh9Var2;
        }
        synchronized (f52602c) {
            rh9VarM17361m = m17361m(rh9Var, qh9Var);
        }
        rh9VarM17361m.f59322a = jMo3582g;
        if (rh9Var2.f59322a != 1) {
            jc9Var.mo3169n(qh9Var);
        }
        return rh9VarM17361m;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m17364p(ph9 ph9Var) {
        rh9 rh9Var;
        long j = f52604e;
        lj1 lj1Var = f52605f;
        if (lj1Var.f49731a > 0) {
            j = ((long[]) lj1Var.f49733c)[0];
        }
        rh9 rh9Var2 = null;
        rh9 rh9VarMo1310d = null;
        int i = 0;
        for (rh9 rh9VarMo1310d2 = ph9Var.mo1310d(); rh9VarMo1310d2 != null; rh9VarMo1310d2 = rh9VarMo1310d2.f59323b) {
            long j2 = rh9VarMo1310d2.f59322a;
            if (j2 != 0) {
                if (fa4.m11652n(j2, j) >= 0) {
                    i++;
                } else if (rh9Var2 == null) {
                    i++;
                    rh9Var2 = rh9VarMo1310d2;
                } else {
                    if (fa4.m11652n(rh9VarMo1310d2.f59322a, rh9Var2.f59322a) < 0) {
                        rh9Var = rh9Var2;
                        rh9Var2 = rh9VarMo1310d2;
                    } else {
                        rh9Var = rh9VarMo1310d2;
                    }
                    if (rh9VarMo1310d == null) {
                        rh9VarMo1310d = ph9Var.mo1310d();
                        rh9 rh9Var3 = rh9VarMo1310d;
                        while (true) {
                            if (rh9VarMo1310d == null) {
                                rh9VarMo1310d = rh9Var3;
                                break;
                            }
                            if (fa4.m11652n(rh9VarMo1310d.f59322a, j) >= 0) {
                                break;
                            }
                            if (fa4.m11652n(rh9Var3.f59322a, rh9VarMo1310d.f59322a) < 0) {
                                rh9Var3 = rh9VarMo1310d;
                            }
                            rh9VarMo1310d = rh9VarMo1310d.f59323b;
                        }
                    }
                    rh9Var2.f59322a = 0L;
                    rh9Var2.mo3651a(rh9VarMo1310d);
                    rh9Var2 = rh9Var;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: q */
    public static final void m17365q(ph9 ph9Var) {
        if (m17364p(ph9Var)) {
            C3047gq c3047gq = f52606g;
            int i = c3047gq.f41171b;
            int iIdentityHashCode = System.identityHashCode(ph9Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = c3047gq.f41171b - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c3047gq.f41172c)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        n2b n2bVar = ((n2b[]) c3047gq.f41173d)[i5];
                        if (ph9Var == (n2bVar != null ? n2bVar.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) c3047gq.f41172c)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = c3047gq.f41171b;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(c3047gq.f41171b + 1);
                                        break;
                                    }
                                    if (((int[]) c3047gq.f41172c)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    n2b n2bVar2 = ((n2b[]) c3047gq.f41173d)[i5];
                                    if ((n2bVar2 != null ? n2bVar2.get() : null) == ph9Var) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                n2b n2bVar3 = ((n2b[]) c3047gq.f41173d)[i7];
                                if ((n2bVar3 != null ? n2bVar3.get() : null) == ph9Var) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            n2b[] n2bVarArr = (n2b[]) c3047gq.f41173d;
            int length = n2bVarArr.length;
            if (i == length) {
                int i10 = length * 2;
                n2b[] n2bVarArr2 = new n2b[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(n2bVarArr, i9, n2bVarArr2, i11, i - i9);
                System.arraycopy((n2b[]) c3047gq.f41173d, 0, n2bVarArr2, 0, i9);
                AbstractC3550rv.m20825S(i11, i9, i, (int[]) c3047gq.f41172c, iArr);
                AbstractC3550rv.m20829W(0, i9, 6, (int[]) c3047gq.f41172c, iArr);
                c3047gq.f41173d = n2bVarArr2;
                c3047gq.f41172c = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(n2bVarArr, i9, n2bVarArr, i12, i - i9);
                int[] iArr2 = (int[]) c3047gq.f41172c;
                AbstractC3550rv.m20825S(i12, i9, i, iArr2, iArr2);
            }
            ((n2b[]) c3047gq.f41173d)[i9] = new n2b(ph9Var);
            ((int[]) c3047gq.f41172c)[i9] = iIdentityHashCode;
            c3047gq.f41171b++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m17366r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: s */
    public static final rh9 m17367s(rh9 rh9Var, long j, C0285a c0285a) {
        rh9 rh9Var2 = null;
        while (rh9Var != null) {
            long j2 = rh9Var.f59322a;
            if (j2 != 0 && fa4.m11652n(j2, j) <= 0 && !c0285a.m1315g(j2) && (rh9Var2 == null || fa4.m11652n(rh9Var2.f59322a, rh9Var.f59322a) < 0)) {
                rh9Var2 = rh9Var;
            }
            rh9Var = rh9Var.f59323b;
        }
        if (rh9Var2 != null) {
            return rh9Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final rh9 m17368t(rh9 rh9Var, ph9 ph9Var) {
        rh9 rh9VarM17367s;
        jc9 jc9VarM17358j = m17358j();
        vi3 vi3VarMo3163e = jc9VarM17358j.mo3163e();
        if (vi3VarMo3163e != null) {
            vi3VarMo3163e.invoke(ph9Var);
        }
        rh9 rh9VarM17367s2 = m17367s(rh9Var, jc9VarM17358j.mo3582g(), jc9VarM17358j.mo3581d());
        if (rh9VarM17367s2 != null) {
            return rh9VarM17367s2;
        }
        synchronized (f52602c) {
            jc9 jc9VarM17358j2 = m17358j();
            rh9 rh9VarMo1310d = ph9Var.mo1310d();
            rh9VarMo1310d.getClass();
            rh9VarM17367s = m17367s(rh9VarMo1310d, jc9VarM17358j2.mo3582g(), jc9VarM17358j2.mo3581d());
            if (rh9VarM17367s == null) {
                m17366r();
                throw null;
            }
        }
        return rh9VarM17367s;
    }

    /* JADX INFO: renamed from: u */
    public static final void m17369u(int i) {
        lj1 lj1Var = f52605f;
        int i2 = ((int[]) lj1Var.f49735e)[i];
        lj1Var.m16252h(i2, lj1Var.f49731a - 1);
        lj1Var.f49731a--;
        long[] jArr = (long[]) lj1Var.f49733c;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (fa4.m11652n(jArr[i4], j) <= 0) {
                break;
            }
            lj1Var.m16252h(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) lj1Var.f49733c;
        int i5 = lj1Var.f49731a >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < lj1Var.f49731a && fa4.m11652n(jArr2[i6], jArr2[i7]) < 0) {
                if (fa4.m11652n(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                lj1Var.m16252h(i6, i2);
                i2 = i6;
            } else {
                if (fa4.m11652n(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                lj1Var.m16252h(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) lj1Var.f49735e)[i] = lj1Var.f49732b;
        lj1Var.f49732b = i;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m17370v(yn3 yn3Var, vi3 vi3Var) {
        long j = yn3Var.f45417b;
        Object objInvoke = vi3Var.invoke(f52603d.m1314f(j));
        long j2 = f52604e;
        f52604e = 1 + j2;
        C0285a c0285aM1314f = f52603d.m1314f(j);
        f52603d = c0285aM1314f;
        yn3Var.f45417b = j2;
        yn3Var.f45416a = c0285aM1314f;
        yn3Var.f60421g = 0;
        yn3Var.f60422h = null;
        yn3Var.m14394o();
        f52603d = f52603d.m1317i(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: w */
    public static final rh9 m17371w(rh9 rh9Var, ph9 ph9Var, jc9 jc9Var) {
        rh9 rh9VarM17367s;
        rh9 rh9VarM17367s2;
        if (jc9Var.mo3164f()) {
            jc9Var.mo3169n(ph9Var);
        }
        long jMo3582g = jc9Var.mo3582g();
        rh9 rh9VarM17367s3 = m17367s(rh9Var, jMo3582g, jc9Var.mo3581d());
        if (rh9VarM17367s3 == null) {
            synchronized (f52602c) {
                jc9 jc9VarM17358j = m17358j();
                rh9 rh9VarMo1310d = ph9Var.mo1310d();
                rh9VarMo1310d.getClass();
                rh9VarM17367s2 = m17367s(rh9VarMo1310d, jc9VarM17358j.mo3582g(), jc9VarM17358j.mo3581d());
                if (rh9VarM17367s2 == null) {
                    m17366r();
                    throw null;
                }
            }
            rh9VarM17367s3 = rh9VarM17367s2;
        }
        if (rh9VarM17367s3.f59322a == jc9Var.mo3582g()) {
            return rh9VarM17367s3;
        }
        synchronized (f52602c) {
            rh9VarM17367s = m17367s(ph9Var.mo1310d(), jMo3582g, jc9Var.mo3581d());
            if (rh9VarM17367s == null) {
                m17366r();
                throw null;
            }
            if (rh9VarM17367s.f59322a != jMo3582g) {
                rh9 rh9VarM17361m = m17361m(rh9VarM17367s, ph9Var);
                rh9VarM17361m.mo3651a(rh9VarM17367s);
                rh9VarM17361m.f59322a = jc9Var.mo3582g();
                rh9VarM17367s = rh9VarM17361m;
            }
        }
        if (rh9VarM17367s3.f59322a != 1) {
            jc9Var.mo3169n(ph9Var);
        }
        return rh9VarM17367s;
    }
}
