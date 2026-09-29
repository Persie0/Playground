package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.bq1;
import p000.d16;
import p000.e28;
import p000.ea2;
import p000.fa2;
import p000.kv8;
import p000.ov8;
import p000.pv8;
import p000.pvc;
import p000.te1;
import p000.thb;
import p000.tv8;
import p000.u91;
import p000.uh8;
import p000.vi3;
import p000.x66;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0423c {

    /* JADX INFO: renamed from: a */
    public final d16 f4971a;

    /* JADX INFO: renamed from: b */
    public final boolean f4972b;

    /* JADX INFO: renamed from: c */
    public final C0357g f4973c;

    /* JADX INFO: renamed from: d */
    public final kv8 f4974d;

    /* JADX INFO: renamed from: e */
    public C0423c f4975e;

    /* JADX INFO: renamed from: f */
    public final int f4976f;

    public C0423c(d16 d16Var, boolean z, C0357g c0357g, kv8 kv8Var) {
        this.f4971a = d16Var;
        this.f4972b = z;
        this.f4973c = c0357g;
        this.f4974d = kv8Var;
        this.f4976f = c0357g.f4336b;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m1839j(int i, C0423c c0423c) {
        return c0423c.m1848i((i & 1) != 0 ? !c0423c.f4972b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: a */
    public final e28 m1840a(AbstractC0362l abstractC0362l) {
        ?? M21992f;
        C0423c c0423cM1850l = m1850l();
        if (c0423cM1850l == null) {
            return e28.f36619e;
        }
        d16 d16Var = (d16) c0423cM1850l.f4973c.f4335a0.f46679g;
        if ((d16Var.f34840d & 8) == 0) {
            M21992f = 0;
            break;
        }
        loop0: while (true) {
            if (d16Var != null) {
                if ((d16Var.f34839c & 8) != 0) {
                    M21992f = d16Var;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof ov8) {
                            if (((ov8) M21992f).mo1399m()) {
                                break loop0;
                            }
                        } else if ((M21992f.f34839c & 8) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var2 = ((fa2) M21992f).f38701K;
                            int i = 0;
                            while (d16Var2 != null) {
                                if ((d16Var2.f34839c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                        x66Var = x66Var;
                                        M21992f = d16Var2;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                d16Var2 = d16Var2.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            } else {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                if ((d16Var.f34840d & 8) != 0) {
                    d16Var = d16Var.f34842f;
                }
            }
            M21992f = 0;
            break;
        }
        ov8 ov8Var = (ov8) M21992f;
        AbstractC0362l abstractC0362lM21976I = ov8Var != null ? te1.m21976I(ov8Var, 8) : null;
        return abstractC0362lM21976I == null ? c0423cM1850l.m1840a(abstractC0362l) : abstractC0362lM21976I.mo1670Q(abstractC0362l, true);
    }

    /* JADX INFO: renamed from: b */
    public final C0423c m1841b(uh8 uh8Var, vi3 vi3Var) {
        kv8 kv8Var = new kv8();
        kv8Var.f48473c = false;
        kv8Var.f48474d = false;
        vi3Var.invoke(kv8Var);
        C0423c c0423c = new C0423c(new pv8(vi3Var), false, new C0357g(this.f4976f + (uh8Var != null ? 1000000000 : 2000000000), true), kv8Var);
        c0423c.f4975e = this;
        return c0423c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1842c(C0357g c0357g, ArrayList arrayList) {
        x66 x66VarM1558A = c0357g.m1558A();
        Object[] objArr = x66VarM1558A.f67830a;
        int i = x66VarM1558A.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (c0357g2.m1569L() && !c0357g2.f4357l0) {
                if (c0357g2.f4335a0.m14799f(8)) {
                    arrayList.add(pvc.m19511g(c0357g2, this.f4972b));
                } else {
                    m1842c(c0357g2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0362l m1843d() {
        if (!m1852n()) {
            ov8 ov8VarM1845f = m1845f();
            return ov8VarM1845f != null ? te1.m21976I(ov8VarM1845f, 8) : (C0353c) this.f4973c.f4335a0.f46676d;
        }
        C0423c c0423cM1850l = m1850l();
        if (c0423cM1850l != null) {
            return c0423cM1850l.m1843d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1844e(ArrayList arrayList, ArrayList arrayList2) {
        m1856r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C0423c c0423c = (C0423c) arrayList.get(size2);
            if (c0423c.m1853o()) {
                arrayList2.add(c0423c);
            } else if (!c0423c.f4974d.f48474d) {
                c0423c.m1844e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: f */
    public final ov8 m1845f() {
        ?? M21992f;
        boolean z;
        ?? r0;
        boolean z2 = this.f4974d.f48473c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        C0357g c0357g = this.f4973c;
        if (!z2) {
            d16 d16Var = (d16) c0357g.f4335a0.f46679g;
            if ((d16Var.f34840d & 8) != 0) {
                loop3: while (d16Var != null) {
                    if ((d16Var.f34839c & 8) != 0) {
                        M21992f = d16Var;
                        ?? x66Var = 0;
                        while (true) {
                            if (M21992f != 0) {
                                if (M21992f instanceof ov8) {
                                    if (((ov8) M21992f).mo1399m()) {
                                        r4 = M21992f;
                                    }
                                } else if ((M21992f.f34839c & 8) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var2 = ((fa2) M21992f).f38701K;
                                    int i = 0;
                                    while (d16Var2 != null) {
                                        if ((d16Var2.f34839c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M21992f = M21992f;
                                                x66Var = x66Var;
                                                x66Var = x66Var;
                                                M21992f = d16Var2;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var2);
                                            }
                                        } else {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                        }
                                        d16Var2 = d16Var2.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                    }
                    if ((d16Var.f34840d & 8) == 0) {
                        break;
                    }
                    d16Var = d16Var.f34842f;
                }
            }
        } else {
            d16 d16Var3 = (d16) c0357g.f4335a0.f46679g;
            if ((d16Var3.f34840d & 8) != 0) {
                M21992f = 0;
                while (d16Var3 != null) {
                    if ((d16Var3.f34839c & 8) != 0) {
                        d16 d16VarM21992f = d16Var3;
                        x66 x66Var2 = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof ov8) {
                                ov8 ov8Var = (ov8) d16VarM21992f;
                                if (ov8Var.mo1399m()) {
                                    if (ov8Var.mo789I0()) {
                                        r0 = M21992f;
                                        r0 = M21992f;
                                        return ov8Var;
                                    }
                                    if (M21992f == 0) {
                                        r0 = ov8Var;
                                    }
                                }
                                r0 = M21992f;
                                z = false;
                                M21992f = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                M21992f = M21992f;
                                if ((d16VarM21992f.f34839c & 8) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i2 = 0;
                                    for (d16 d16Var4 = ((fa2) d16VarM21992f).f38701K; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
                                        if ((d16Var4.f34839c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                d16VarM21992f = d16Var4;
                                            } else {
                                                if (x66Var2 == null) {
                                                    x66Var2 = new x66(new d16[16]);
                                                }
                                                if (d16VarM21992f != null) {
                                                    x66Var2.m24305c(d16VarM21992f);
                                                    d16VarM21992f = null;
                                                }
                                                x66Var2.m24305c(d16Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                M21992f = M21992f;
                            }
                            d16VarM21992f = te1.m21992f(x66Var2);
                        }
                    }
                    if ((d16Var3.f34840d & 8) == 0) {
                        break;
                    }
                    d16Var3 = d16Var3.f34842f;
                    M21992f = M21992f;
                }
                r4 = M21992f;
            }
        }
        return (ov8) r4;
    }

    /* JADX INFO: renamed from: g */
    public final e28 m1846g() {
        AbstractC0362l abstractC0362lM1843d = m1843d();
        if (abstractC0362lM1843d != null) {
            if (!abstractC0362lM1843d.mo1543f1().f34836I) {
                abstractC0362lM1843d = null;
            }
            if (abstractC0362lM1843d != null) {
                return bq1.m4054e0(abstractC0362lM1843d).mo1670Q(abstractC0362lM1843d, true);
            }
        }
        return e28.f36619e;
    }

    /* JADX INFO: renamed from: h */
    public final e28 m1847h() {
        AbstractC0362l abstractC0362lM1843d = m1843d();
        if (abstractC0362lM1843d != null) {
            if (!abstractC0362lM1843d.mo1543f1().f34836I) {
                abstractC0362lM1843d = null;
            }
            if (abstractC0362lM1843d != null) {
                return bq1.m4050Z(abstractC0362lM1843d, true);
            }
        }
        return e28.f36619e;
    }

    /* JADX INFO: renamed from: i */
    public final List m1848i(boolean z, boolean z2) {
        if (!z && this.f4974d.f48474d) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m1853o()) {
            return m1856r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m1844e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final kv8 m1849k() {
        boolean zM1853o = m1853o();
        kv8 kv8Var = this.f4974d;
        if (!zM1853o) {
            return kv8Var;
        }
        kv8 kv8VarM15705f = kv8Var.m15705f();
        m1855q(new ArrayList(), kv8VarM15705f);
        return kv8VarM15705f;
    }

    /* JADX INFO: renamed from: l */
    public final C0423c m1850l() {
        C0357g c0357gM1610w;
        C0423c c0423c = this.f4975e;
        if (c0423c != null) {
            return c0423c;
        }
        C0357g c0357g = this.f4973c;
        boolean z = this.f4972b;
        if (!z) {
            c0357gM1610w = null;
            break;
        }
        c0357gM1610w = c0357g.m1610w();
        while (true) {
            if (c0357gM1610w == null) {
                c0357gM1610w = null;
                break;
            }
            kv8 kv8VarM1613z = c0357gM1610w.m1613z();
            if (kv8VarM1613z != null && kv8VarM1613z.f48473c) {
                break;
            }
            c0357gM1610w = c0357gM1610w.m1610w();
        }
        if (c0357gM1610w == null) {
            for (C0357g c0357gM1610w2 = c0357g.m1610w(); c0357gM1610w2 != null; c0357gM1610w2 = c0357gM1610w2.m1610w()) {
                if (c0357gM1610w2.f4335a0.m14799f(8)) {
                    c0357gM1610w = c0357gM1610w2;
                }
            }
            c0357gM1610w = null;
        }
        if (c0357gM1610w == null) {
            return null;
        }
        return pvc.m19511g(c0357gM1610w, z);
    }

    /* JADX INFO: renamed from: m */
    public final e28 m1851m() {
        ea2 ea2VarM1845f = m1845f();
        if (ea2VarM1845f == null) {
            return ((C0353c) this.f4973c.f4335a0.f46676d).m1660B1();
        }
        return thb.m22052k(((d16) ea2VarM1845f).f34837a, AbstractC0422b.m1838a(this.f4974d, AbstractC0421a.f4946b) != null, true);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1852n() {
        return this.f4975e != null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1853o() {
        return this.f4972b && this.f4974d.f48473c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final boolean m1854p() {
        if (m1852n() || !m1839j(4, this).isEmpty()) {
            return false;
        }
        C0357g c0357gM1610w = this.f4973c.m1610w();
        while (c0357gM1610w != null) {
            kv8 kv8VarM1613z = c0357gM1610w.m1613z();
            if (kv8VarM1613z != null && kv8VarM1613z.f48473c) {
                if (c0357gM1610w == null) {
                    return true;
                }
                return false;
            }
            c0357gM1610w = c0357gM1610w.m1610w();
        }
        c0357gM1610w = null;
        if (c0357gM1610w == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m1855q(ArrayList arrayList, kv8 kv8Var) {
        if (this.f4974d.f48474d) {
            return;
        }
        m1856r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C0423c c0423c = (C0423c) arrayList.get(size2);
            if (!c0423c.m1853o()) {
                kv8Var.m15707h(c0423c.f4974d);
                c0423c.m1855q(arrayList, kv8Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final List m1856r(ArrayList arrayList, boolean z) {
        if (m1852n()) {
            return EmptyList.f47638a;
        }
        m1842c(this.f4973c, arrayList);
        if (z) {
            C0427g c0427g = AbstractC0424d.f5019z;
            kv8 kv8Var = this.f4974d;
            final uh8 uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, c0427g);
            if (uh8Var != null && kv8Var.f48473c && !arrayList.isEmpty()) {
                arrayList.add(m1841b(uh8Var, new vi3() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        AbstractC0426f.m1864h((tv8) obj, uh8Var.f63934a);
                        return xfa.f68157a;
                    }
                }));
            }
            C0427g c0427g2 = AbstractC0424d.f4994a;
            if (kv8Var.f48471a.m17251c(c0427g2) && !arrayList.isEmpty() && kv8Var.f48473c) {
                List list = (List) AbstractC0422b.m1838a(kv8Var, c0427g2);
                final String str = list != null ? (String) u91.m22591I0(list) : null;
                if (str != null) {
                    arrayList.add(0, m1841b(null, new vi3() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            AbstractC0426f.m1860d((tv8) obj, str);
                            return xfa.f68157a;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }
}
