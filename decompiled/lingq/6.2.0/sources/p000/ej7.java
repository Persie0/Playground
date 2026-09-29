package p000;

import android.os.Trace;
import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.layout.C0345l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class ej7 implements ku4 {

    /* JADX INFO: renamed from: a */
    public final int f37341a;

    /* JADX INFO: renamed from: b */
    public final sq5 f37342b;

    /* JADX INFO: renamed from: c */
    public final vi3 f37343c;

    /* JADX INFO: renamed from: d */
    public bk1 f37344d;

    /* JADX INFO: renamed from: e */
    public pm9 f37345e;

    /* JADX INFO: renamed from: f */
    public zq4 f37346f;

    /* JADX INFO: renamed from: g */
    public boolean f37347g;

    /* JADX INFO: renamed from: h */
    public boolean f37348h;

    /* JADX INFO: renamed from: i */
    public boolean f37349i;

    /* JADX INFO: renamed from: j */
    public Object f37350j;

    /* JADX INFO: renamed from: k */
    public boolean f37351k;

    /* JADX INFO: renamed from: l */
    public dj7 f37352l;

    /* JADX INFO: renamed from: m */
    public boolean f37353m;

    /* JADX INFO: renamed from: n */
    public long f37354n;

    /* JADX INFO: renamed from: o */
    public long f37355o;

    /* JADX INFO: renamed from: p */
    public long f37356p;

    /* JADX INFO: renamed from: q */
    public boolean f37357q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C3552rx f37358r;

    public ej7(C3552rx c3552rx, int i, sq5 sq5Var, vi3 vi3Var) {
        this.f37358r = c3552rx;
        this.f37341a = i;
        this.f37342b = sq5Var;
        this.f37343c = vi3Var;
        int i2 = u16.f63245b;
        this.f37356p = System.nanoTime() - u16.f63244a;
    }

    @Override // p000.ku4
    /* JADX INFO: renamed from: a */
    public final void mo3885a() {
        this.f37353m = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m11176b() {
        zq4 zq4Var = this.f37346f;
        if (zq4Var != null) {
            switch (zq4Var.f71968a) {
                case 0:
                    break;
                default:
                    sq4 sq4VarM25746b = zq4Var.m25746b();
                    if ((sq4VarM25746b != null ? sq4VarM25746b.f61242f : null) != null) {
                        C0339f.m1494c(zq4Var.f71969b, zq4Var.f71970c);
                    }
                    break;
            }
        }
        this.f37346f = null;
        pm9 pm9Var = this.f37345e;
        if (pm9Var != null) {
            pm9Var.mo19394a();
        }
        this.f37345e = null;
        this.f37352l = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11177c(C0022ak c0022ak) {
        boolean zM11178d;
        if (!this.f37358r.f59986a) {
            return false;
        }
        if (this.f37353m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM11178d = m11178d(c0022ak);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zM11178d = m11178d(c0022ak);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zM11178d;
    }

    @Override // p000.ku4
    public final void cancel() {
        if (this.f37348h) {
            return;
        }
        this.f37348h = true;
        m11176b();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01fa  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX INFO: renamed from: d */
    public final boolean m11178d(C0022ak c0022ak) {
        ?? r12;
        List list;
        pm9 pm9VarM1499f;
        int i = this.f37341a;
        long j = i;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j);
        yt4 yt4Var = (yt4) ((xt4) this.f37358r.f59987b).f68703b.mo0a();
        if (!this.f37348h) {
            int iMo15745a = yt4Var.mo15745a();
            if (i >= 0 && i < iMo15745a) {
                Object objMo15747c = yt4Var.mo15747c(i);
                Object obj = this.f37350j;
                if (obj != null && !objMo15747c.equals(obj)) {
                    m11176b();
                    return false;
                }
                Object objMo16527d = yt4Var.mo16527d(i);
                sq5 sq5Var = this.f37342b;
                f60 f60Var = (f60) sq5Var.f61250d;
                if (sq5Var.f61249c != objMo16527d || f60Var == null) {
                    n66 n66Var = (n66) sq5Var.f61248b;
                    Object objM17255g = n66Var.m17255g(objMo16527d);
                    Object obj2 = objM17255g;
                    if (objM17255g == null) {
                        f60 f60Var2 = new f60();
                        f60Var2.f38507e = -1;
                        n66Var.m17261m(objMo16527d, f60Var2);
                        obj2 = f60Var2;
                    }
                    f60Var = (f60) obj2;
                    sq5Var.f61249c = objMo16527d;
                    sq5Var.f61250d = f60Var;
                }
                m11179e();
                long jM512a = c0022ak.m512a();
                this.f37354n = jM512a;
                int i2 = u16.f63245b;
                this.f37356p = System.nanoTime() - u16.f63244a;
                this.f37355o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jM512a);
                if (!m11179e()) {
                    if (m11181g(this.f37354n, f60Var.f38503a + f60Var.f38504b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m11180f(objMo15747c, objMo16527d, f60Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!m11179e()) {
                        return true;
                    }
                }
                if (this.f37346f != null) {
                    if (!m11181g(this.f37354n, f60Var.f38505c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        zq4 zq4Var = this.f37346f;
                        if (zq4Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (zq4Var.f71968a) {
                            case 0:
                                pm9VarM1499f = zq4Var.f71969b.m1499f(zq4Var.f71970c);
                                break;
                            default:
                                C0339f c0339f = zq4Var.f71969b;
                                sq4 sq4VarM25746b = zq4Var.m25746b();
                                if (sq4VarM25746b != null) {
                                    c0339f.m1498d(sq4VarM25746b, false);
                                }
                                pm9VarM1499f = c0339f.m1499f(zq4Var.f71970c);
                                break;
                        }
                        this.f37345e = pm9VarM1499f;
                        this.f37346f = null;
                        this.f37349i = true;
                        Trace.endSection();
                        m11182h();
                        f60Var.f38505c = f60.m11563a(this.f37355o, f60Var.f38505c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.f37351k) {
                    if (this.f37354n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        pm9 pm9Var = this.f37345e;
                        if (pm9Var == null) {
                            throw wq1.m24126v("Should precompose before resolving nested prefetch states");
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        pm9Var.mo19395b(new n31(1, ref$ObjectRef));
                        List list2 = (List) ref$ObjectRef.f47718a;
                        this.f37352l = list2 != null ? new dj7(this, list2) : null;
                        this.f37351k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                dj7 dj7Var = this.f37352l;
                if (dj7Var != null) {
                    int i3 = f60Var.f38507e;
                    boolean z = this.f37353m;
                    List[] listArr = dj7Var.f35724b;
                    int i4 = dj7Var.f35725c;
                    List list3 = dj7Var.f35723a;
                    if (i4 < list3.size()) {
                        if (dj7Var.f35728f.f37348h) {
                            l54.m15816c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                ((lu4) list3.get(i5)).f50142d = i3;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (dj7Var.f35725c < list3.size()) {
                                try {
                                    if (listArr[dj7Var.f35725c] == null) {
                                        if (c0022ak.m512a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i6 = dj7Var.f35725c;
                                        lu4 lu4Var = (lu4) list3.get(i6);
                                        vi3 vi3Var = lu4Var.f50139a;
                                        if (vi3Var == null) {
                                            list = EmptyList.f47638a;
                                        } else {
                                            ju4 ju4Var = new ju4(lu4Var, lu4Var.f50142d);
                                            vi3Var.invoke(ju4Var);
                                            ArrayList arrayList = ju4Var.f46159b;
                                            lu4Var.f50144f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i6] = list;
                                    }
                                    List list4 = listArr[dj7Var.f35725c];
                                    list4.getClass();
                                    while (dj7Var.f35726d < list4.size()) {
                                        ej7 ej7Var = (ej7) list4.get(dj7Var.f35726d);
                                        if (z) {
                                            ej7 ej7Var2 = ej7Var != null ? ej7Var : null;
                                            if (ej7Var2 != null) {
                                                r12 = 1;
                                                ej7Var2.f37353m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        dj7Var.f35727e = r12;
                                        if (ej7Var.m11177c(c0022ak)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        dj7Var.f35726d += r12;
                                    }
                                    dj7Var.f35726d = 0;
                                    dj7Var.f35725c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                dj7 dj7Var2 = this.f37352l;
                if (dj7Var2 != null && dj7Var2.f35727e) {
                    m11182h();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j);
                    dj7 dj7Var3 = this.f37352l;
                    if (dj7Var3 != null) {
                        dj7Var3.f35727e = false;
                    }
                }
                bk1 bk1Var = this.f37344d;
                if (!this.f37347g && bk1Var != null) {
                    if (!m11181g(this.f37354n, f60Var.f38506d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = bk1Var.f8631a;
                        if (this.f37348h) {
                            l54.m15814a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f37347g) {
                            l54.m15814a("Request was already measured!");
                        }
                        this.f37347g = true;
                        pm9 pm9Var2 = this.f37345e;
                        if (pm9Var2 == null) {
                            throw wq1.m24126v("performComposition() must be called before performMeasure()");
                        }
                        int iMo19397d = pm9Var2.mo19397d();
                        for (int i7 = 0; i7 < iMo19397d; i7++) {
                            pm9Var2.mo19398e(i7, j2);
                        }
                        Trace.endSection();
                        m11182h();
                        f60Var.f38506d = f60.m11563a(this.f37355o, f60Var.f38506d);
                        vi3 vi3Var2 = this.f37343c;
                        if (vi3Var2 != null) {
                            vi3Var2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                dj7 dj7Var4 = this.f37352l;
                if (this.f37347g && this.f37351k && dj7Var4 != null) {
                    List list5 = dj7Var4.f35723a;
                    List list6 = list5;
                    int size2 = list6.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < size2; i8++) {
                        iMin = Math.min(iMin, ((lu4) list5.get(i8)).f50143e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i9 = f60Var.f38507e;
                    f60Var.f38507e = i9 == -1 ? iMin : ((i9 * 3) + iMin) / 4;
                    int size3 = list6.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < size3; i10++) {
                        iMin2 = Math.min(iMin2, ((lu4) list5.get(i10)).f50144f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        f60Var.f38506d = 0L;
                    }
                }
                return false;
            }
        }
        m11176b();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11179e() {
        zq4 zq4Var;
        return this.f37349i || ((zq4Var = this.f37346f) != null && zq4Var.m25747c());
    }

    /* JADX INFO: renamed from: f */
    public final void m11180f(Object obj, Object obj2, f60 f60Var) {
        zq4 zq4Var;
        zq4 zq4Var2 = this.f37346f;
        int i = 0;
        if (zq4Var2 == null) {
            C3552rx c3552rx = this.f37358r;
            zi3 zi3VarM24674a = ((xt4) c3552rx.f59987b).m24674a(this.f37341a, obj, obj2);
            C0339f c0339fM1531a = ((C0345l) c3552rx.f59988c).m1531a();
            if (c0339fM1531a.f4193a.m1569L()) {
                c0339fM1531a.m1505l(obj, zi3VarM24674a, true);
                zq4Var = new zq4(c0339fM1531a, obj, 1);
            } else {
                zq4Var = new zq4(c0339fM1531a, obj, i);
            }
            zq4Var2 = zq4Var;
            this.f37346f = zq4Var2;
            this.f37350j = obj;
        }
        this.f37357q = false;
        while (!zq4Var2.m25747c() && !this.f37357q) {
            r41 r41Var = new r41(7, this, f60Var);
            switch (zq4Var2.f71968a) {
                case 0:
                    break;
                default:
                    sq4 sq4VarM25746b = zq4Var2.m25746b();
                    i67 i67Var = sq4VarM25746b != null ? sq4VarM25746b.f61242f : null;
                    if (i67Var == null || i67Var.m13699c()) {
                        break;
                    } else {
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            i67Var.m13701e(r41Var);
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            break;
                        } catch (Throwable th) {
                            try {
                                sq4VarM25746b.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        m11182h();
        boolean z = this.f37357q;
        long j = this.f37355o;
        if (z) {
            f60Var.f38504b = f60.m11563a(j, f60Var.f38504b);
        } else {
            f60Var.f38503a = f60.m11563a(j, f60Var.f38503a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11181g(long j, long j2) {
        if (this.f37353m) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX INFO: renamed from: h */
    public final void m11182h() {
        int i = u16.f63245b;
        long jNanoTime = System.nanoTime() - u16.f63244a;
        long jM20999a = s0a.m20999a(jNanoTime, this.f37356p);
        long j = jM20999a >> 1;
        iy5 iy5Var = cn2.f10315b;
        if ((((int) jM20999a) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
        }
        this.f37355o = j;
        long j2 = this.f37354n - j;
        this.f37354n = j2;
        this.f37356p = jNanoTime;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f37341a);
        sb.append(", constraints = ");
        sb.append(this.f37344d);
        sb.append(", isComposed = ");
        sb.append(m11179e());
        sb.append(", isMeasured = ");
        sb.append(this.f37347g);
        sb.append(", isCanceled = ");
        return AbstractC3393o1.m17740o(sb, this.f37348h, " }");
    }
}
