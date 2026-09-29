package p000;

import androidx.compose.runtime.collection.C0275a;
import androidx.compose.runtime.snapshots.C0285a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public class s66 extends jc9 {

    /* JADX INFO: renamed from: n */
    public static final int[] f60418n = new int[0];

    /* JADX INFO: renamed from: e */
    public final vi3 f60419e;

    /* JADX INFO: renamed from: f */
    public final vi3 f60420f;

    /* JADX INFO: renamed from: g */
    public int f60421g;

    /* JADX INFO: renamed from: h */
    public o66 f60422h;

    /* JADX INFO: renamed from: i */
    public ArrayList f60423i;

    /* JADX INFO: renamed from: j */
    public C0285a f60424j;

    /* JADX INFO: renamed from: k */
    public int[] f60425k;

    /* JADX INFO: renamed from: l */
    public int f60426l;

    /* JADX INFO: renamed from: m */
    public boolean f60427m;

    public s66(long j, C0285a c0285a, vi3 vi3Var, vi3 vi3Var2) {
        super(j, c0285a);
        this.f60419e = vi3Var;
        this.f60420f = vi3Var2;
        this.f60424j = C0285a.f3799e;
        this.f60425k = f60418n;
        this.f60426l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m21127A(long j) {
        synchronized (nc9.f52602c) {
            this.f60424j = this.f60424j.m1317i(j);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo3578B(o66 o66Var) {
        this.f60422h = o66Var;
    }

    /* JADX INFO: renamed from: C */
    public s66 mo3579C(vi3 vi3Var, vi3 vi3Var2) {
        nj6 nj6Var;
        if (this.f45418c) {
            hi7.m13278a("Cannot use a disposed snapshot");
        }
        if (this.f60427m && this.f45419d < 0) {
            hi7.m13279b("Unsupported operation on a disposed or applied snapshot");
        }
        m21127A(mo3582g());
        Object obj = nc9.f52602c;
        synchronized (obj) {
            long j = nc9.f52604e;
            nc9.f52604e = j + 1;
            nc9.f52603d = nc9.f52603d.m1317i(j);
            C0285a c0285aMo3581d = mo3581d();
            mo3584r(c0285aMo3581d.m1317i(j));
            nj6Var = new nj6(j, nc9.m17352d(c0285aMo3581d, mo3582g() + 1, j), nc9.m17359k(vi3Var, mo3163e(), true), nc9.m17360l(vi3Var2, mo3165i()), this);
        }
        if (this.f60427m || this.f45418c) {
            return nj6Var;
        }
        long jMo3582g = mo3582g();
        synchronized (obj) {
            long j2 = nc9.f52604e;
            nc9.f52604e = j2 + 1;
            mo3585s(j2);
            nc9.f52603d = nc9.f52603d.m1317i(mo3582g());
        }
        mo3584r(nc9.m17352d(mo3581d(), jMo3582g + 1, mo3582g()));
        return nj6Var;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: b */
    public final void mo14392b() {
        nc9.f52603d = nc9.f52603d.m1314f(mo3582g()).m1313d(this.f60424j);
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: c */
    public void mo3162c() {
        if (this.f45418c) {
            return;
        }
        this.f45418c = true;
        synchronized (nc9.f52602c) {
            m14394o();
        }
        mo3167l();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: f */
    public boolean mo3164f() {
        return false;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: h */
    public int mo3583h() {
        return this.f60421g;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: i */
    public vi3 mo3165i() {
        return this.f60420f;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: k */
    public void mo3166k() {
        this.f60426l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p000.jc9
    /* JADX INFO: renamed from: l */
    public void mo3167l() {
        if (this.f60426l <= 0) {
            hi7.m13278a("no pending nested snapshots");
        }
        int i = this.f60426l - 1;
        this.f60426l = i;
        if (i != 0 || this.f60427m) {
            return;
        }
        o66 o66VarMo3588x = mo3588x();
        if (o66VarMo3588x != null) {
            if (this.f60427m) {
                hi7.m13279b("Unsupported operation on a snapshot that has been applied");
            }
            mo3578B(null);
            long jMo3582g = mo3582g();
            Object[] objArr = o66VarMo3588x.f1303b;
            long[] jArr = o66VarMo3588x.f1302a;
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
                                for (rh9 rh9VarMo1310d = ((ph9) objArr[(i2 << 3) + i4]).mo1310d(); rh9VarMo1310d != null; rh9VarMo1310d = rh9VarMo1310d.f59323b) {
                                    long j2 = rh9VarMo1310d.f59322a;
                                    if (j2 == jMo3582g || u91.m22633z0(this.f60424j, Long.valueOf(j2))) {
                                        wx8 wx8Var = nc9.f52600a;
                                        rh9VarMo1310d.f59322a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m14391a();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: m */
    public void mo3168m() {
        if (this.f60427m || this.f45418c) {
            return;
        }
        m21128v();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: n */
    public void mo3169n(ph9 ph9Var) {
        o66 o66VarMo3588x = mo3588x();
        if (o66VarMo3588x == null) {
            o66 o66Var = pm8.f56484a;
            o66VarMo3588x = new o66();
            mo3578B(o66VarMo3588x);
        }
        o66VarMo3588x.m17811d(ph9Var);
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: p */
    public final void mo14395p() {
        int length = this.f60425k.length;
        for (int i = 0; i < length; i++) {
            nc9.m17369u(this.f60425k[i]);
        }
        m14394o();
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: t */
    public void mo3586t(int i) {
        this.f60421g = i;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: u */
    public jc9 mo3170u(vi3 vi3Var) {
        oj6 oj6Var;
        if (this.f45418c) {
            hi7.m13278a("Cannot use a disposed snapshot");
        }
        if (this.f60427m && this.f45419d < 0) {
            hi7.m13279b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo3582g = mo3582g();
        m21127A(mo3582g());
        Object obj = nc9.f52602c;
        synchronized (obj) {
            long j = nc9.f52604e;
            nc9.f52604e = j + 1;
            nc9.f52603d = nc9.f52603d.m1317i(j);
            oj6Var = new oj6(j, nc9.m17352d(mo3581d(), jMo3582g + 1, j), nc9.m17359k(vi3Var, mo3163e(), true), this);
        }
        if (this.f60427m || this.f45418c) {
            return oj6Var;
        }
        long jMo3582g2 = mo3582g();
        synchronized (obj) {
            long j2 = nc9.f52604e;
            nc9.f52604e = j2 + 1;
            mo3585s(j2);
            nc9.f52603d = nc9.f52603d.m1317i(mo3582g());
        }
        mo3584r(nc9.m17352d(mo3581d(), jMo3582g2 + 1, mo3582g()));
        return oj6Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m21128v() {
        m21127A(mo3582g());
        if (this.f60427m || this.f45418c) {
            return;
        }
        long jMo3582g = mo3582g();
        synchronized (nc9.f52602c) {
            long j = nc9.f52604e;
            nc9.f52604e = j + 1;
            mo3585s(j);
            nc9.f52603d = nc9.f52603d.m1317i(mo3582g());
        }
        mo3584r(nc9.m17352d(mo3581d(), jMo3582g + 1, mo3582g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[EDGE_INSN: B:101:0x0150->B:77:0x0150 BREAK  A[LOOP:4: B:66:0x0121->B:76:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010e A[Catch: all -> 0x0104, LOOP:2: B:48:0x00dc->B:60:0x010e, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014d A[Catch: all -> 0x0104, LOOP:4: B:66:0x0121->B:76:0x014d, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0115 A[EDGE_INSN: B:96:0x0115->B:62:0x0115 BREAK  A[LOOP:2: B:48:0x00dc->B:60:0x010e], SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public bna mo3587w() {
        HashMap mapM17350b;
        List list;
        o66 o66Var;
        long j;
        long j2;
        o66 o66VarMo3588x = mo3588x();
        if (o66VarMo3588x != null) {
            long j3 = nc9.f52609j.f45417b;
            mapM17350b = nc9.m17350b(j3, this, nc9.f52603d.m1314f(j3));
        } else {
            mapM17350b = null;
        }
        EmptyList emptyList = EmptyList.f47638a;
        synchronized (nc9.f52602c) {
            try {
                nc9.m17351c(this);
                if (o66VarMo3588x == null || o66VarMo3588x.f1305d == 0) {
                    mo14392b();
                    yn3 yn3Var = nc9.f52609j;
                    o66 o66Var2 = yn3Var.f60422h;
                    nc9.m17370v(yn3Var, nc9.f52600a);
                    if (o66Var2 == null || !o66Var2.m725c()) {
                        list = emptyList;
                        o66Var = null;
                    } else {
                        list = nc9.f52607h;
                        o66Var = o66Var2;
                    }
                } else {
                    yn3 yn3Var2 = nc9.f52609j;
                    bna bnaVarM21129z = m21129z(nc9.f52604e, o66VarMo3588x, mapM17350b, nc9.f52603d.m1314f(yn3Var2.f45417b));
                    if (!bnaVarM21129z.equals(lc9.f49479x)) {
                        return bnaVarM21129z;
                    }
                    mo14392b();
                    o66Var = yn3Var2.f60422h;
                    nc9.m17370v(yn3Var2, nc9.f52600a);
                    mo3578B(null);
                    yn3Var2.f60422h = null;
                    list = nc9.f52607h;
                }
                this.f60427m = true;
                if (o66Var != null) {
                    C0275a c0275a = new C0275a(o66Var);
                    if (!o66Var.m724b()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((zi3) list.get(i)).invoke(c0275a, this);
                        }
                    }
                }
                if (o66VarMo3588x != null && o66VarMo3588x.m725c()) {
                    C0275a c0275a2 = new C0275a(o66VarMo3588x);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((zi3) list.get(i2)).invoke(c0275a2, this);
                    }
                }
                synchronized (nc9.f52602c) {
                    try {
                        mo14395p();
                        nc9.m17354f();
                        if (o66Var != null) {
                            Object[] objArr = o66Var.f1303b;
                            long[] jArr = o66Var.f1302a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                nc9.m17365q((ph9) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (o66VarMo3588x != null) {
                            Object[] objArr2 = o66VarMo3588x.f1303b;
                            long[] jArr2 = o66VarMo3588x.f1302a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                nc9.m17365q((ph9) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f60423i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                nc9.m17365q((ph9) arrayList.get(i9));
                            }
                        }
                        this.f60423i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return lc9.f49479x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public o66 mo3588x() {
        return this.f60422h;
    }

    @Override // p000.jc9
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public vi3 mo3163e() {
        return this.f60419e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final bna m21129z(long j, o66 o66Var, HashMap map, C0285a c0285a) {
        ArrayList arrayList;
        ArrayList arrayListM22603U0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        ph9 ph9Var;
        rh9 rh9Var;
        C0285a c0285a2;
        Object[] objArr;
        long[] jArr;
        C0285a c0285a3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        rh9 rh9VarMo19144f;
        C0285a c0285aM1316h = mo3581d().m1317i(mo3582g()).m1316h(this.f60424j);
        Object[] objArr3 = o66Var.f1303b;
        long[] jArr3 = o66Var.f1302a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListM22603U0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ph9 ph9Var2 = (ph9) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            rh9 rh9VarMo1310d = ph9Var2.mo1310d();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            rh9 rh9VarM17367s = nc9.m17367s(rh9VarMo1310d, j, c0285a);
                            if (rh9VarM17367s == null) {
                                arrayList4 = arrayListM22603U0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListM22603U0;
                                j2 = j3;
                                rh9 rh9VarM17367s2 = nc9.m17367s(rh9VarMo1310d, mo3582g(), c0285aM1316h);
                                if (rh9VarM17367s2 != null && rh9VarM17367s2.f59322a != 1 && !rh9VarM17367s.equals(rh9VarM17367s2)) {
                                    c0285a3 = c0285aM1316h;
                                    rh9 rh9VarM17367s3 = nc9.m17367s(rh9VarMo1310d, mo3582g(), mo3581d());
                                    if (rh9VarM17367s3 == null) {
                                        nc9.m17366r();
                                        throw null;
                                    }
                                    if (map == null || (rh9VarMo19144f = (rh9) map.get(rh9VarM17367s)) == null) {
                                        rh9VarMo19144f = ph9Var2.mo19144f(rh9VarM17367s2, rh9VarM17367s, rh9VarM17367s3);
                                    }
                                    if (rh9VarMo19144f == null) {
                                        return new kc9(this);
                                    }
                                    if (!rh9VarMo19144f.equals(rh9VarM17367s3)) {
                                        if (rh9VarMo19144f.equals(rh9VarM17367s)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(ph9Var2, rh9VarM17367s.mo3652b(mo3582g())));
                                            arrayListM22603U0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListM22603U0.add(ph9Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!rh9VarMo19144f.equals(rh9VarM17367s2) ? new Pair(ph9Var2, rh9VarMo19144f) : new Pair(ph9Var2, rh9VarM17367s2.mo3652b(mo3582g())));
                                        }
                                    }
                                    arrayListM22603U0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListM22603U0 = arrayList4;
                            }
                            c0285a3 = c0285aM1316h;
                            arrayList2 = arrayList5;
                            arrayListM22603U0 = arrayList4;
                        } else {
                            c0285a3 = c0285aM1316h;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c0285aM1316h = c0285a3;
                    }
                    c0285a2 = c0285aM1316h;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c0285a2 = c0285aM1316h;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    c0285aM1316h = c0285a2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                m21128v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    Pair pair = (Pair) arrayList2.get(i2);
                    ph9Var = (ph9) pair.f47623a;
                    rh9Var = (rh9) pair.f47624b;
                    rh9Var.f59322a = j;
                    synchronized (nc9.f52602c) {
                        rh9Var.f59323b = ph9Var.mo1310d();
                        ph9Var.mo1311g(rh9Var);
                    }
                }
            }
            if (arrayListM22603U0 != null) {
                size = arrayListM22603U0.size();
                for (i = 0; i < size; i++) {
                    o66Var.m17819l((ph9) arrayListM22603U0.get(i));
                }
                arrayList3 = this.f60423i;
                if (arrayList3 != null) {
                    arrayListM22603U0 = u91.m22603U0(arrayListM22603U0, arrayList3);
                }
                this.f60423i = arrayListM22603U0;
            }
            return lc9.f49479x;
        }
        arrayList = null;
        arrayListM22603U0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m21128v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                Pair pair2 = (Pair) arrayList2.get(i2);
                ph9Var = (ph9) pair2.f47623a;
                rh9Var = (rh9) pair2.f47624b;
                rh9Var.f59322a = j;
                synchronized (nc9.f52602c) {
                    rh9Var.f59323b = ph9Var.mo1310d();
                    ph9Var.mo1311g(rh9Var);
                }
            }
        }
        if (arrayListM22603U0 != null) {
            size = arrayListM22603U0.size();
            while (i < size) {
                o66Var.m17819l((ph9) arrayListM22603U0.get(i));
            }
            arrayList3 = this.f60423i;
            if (arrayList3 != null) {
                arrayListM22603U0 = u91.m22603U0(arrayListM22603U0, arrayList3);
            }
            this.f60423i = arrayListM22603U0;
        }
        return lc9.f49479x;
    }
}
