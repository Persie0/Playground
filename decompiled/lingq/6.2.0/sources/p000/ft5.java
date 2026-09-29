package p000;

import android.os.Trace;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.node.Invalidation;
import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.p002ui.node.LayoutNode$UsageByParent;
import androidx.compose.p002ui.node.SortedSet;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public final class ft5 {

    /* JADX INFO: renamed from: a */
    public final C0357g f39617a;

    /* JADX INFO: renamed from: c */
    public boolean f39619c;

    /* JADX INFO: renamed from: d */
    public boolean f39620d;

    /* JADX INFO: renamed from: i */
    public bk1 f39625i;

    /* JADX INFO: renamed from: b */
    public final C3309ls f39618b = new C3309ls(19);

    /* JADX INFO: renamed from: e */
    public final fs6 f39621e = new fs6(0);

    /* JADX INFO: renamed from: f */
    public final x66 f39622f = new x66(new C0357g[16]);

    /* JADX INFO: renamed from: g */
    public final long f39623g = 1;

    /* JADX INFO: renamed from: h */
    public final x66 f39624h = new x66(new dt5[16]);

    public ft5(C0357g c0357g) {
        this.f39617a = c0357g;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12122a(ft5 ft5Var, C0357g c0357g, boolean z) {
        bk1 bk1Var;
        AbstractC0343j placementScope;
        C0353c c0353c;
        C0357g c0357gM1610w;
        C0357g c0357g2 = ft5Var.f39617a;
        boolean z2 = c0357g.f4357l0;
        qq4 qq4Var = c0357g.f4337b0;
        boolean zM12123c = false;
        if (!z2 && m12127k(c0357g)) {
            if (c0357g == c0357g2) {
                bk1Var = ft5Var.f39625i;
                bk1Var.getClass();
            } else {
                bk1Var = null;
            }
            if (z) {
                zM12123c = qq4Var.f58059e ? m12123c(c0357g, bk1Var) : false;
                if ((zM12123c || qq4Var.f58060f) && fa4.m11650l(c0357g.m1571N(), Boolean.TRUE)) {
                    c0357g.m1572O();
                }
            } else {
                boolean zM12124d = c0357g.m1605r() ? m12124d(c0357g, bk1Var) : false;
                if (c0357g.m1604q() && (c0357g == c0357g2 || ((c0357gM1610w = c0357g.m1610w()) != null && c0357gM1610w.m1570M() && qq4Var.f58070p.f4401P))) {
                    if (c0357g == c0357g2) {
                        if (c0357g.f4331X == LayoutNode$UsageByParent.NotUsed) {
                            c0357g.m1588f();
                        }
                        C0357g c0357gM1610w2 = c0357g.m1610w();
                        if (c0357gM1610w2 == null || (c0353c = (C0353c) c0357gM1610w2.f4335a0.f46676d) == null || (placementScope = c0353c.f4368l) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getPlacementScope();
                        }
                        AbstractC0343j.m1521j(placementScope, qq4Var.f58070p, 0, 0);
                    } else {
                        c0357g.m1580X();
                    }
                    fs6 fs6Var = ft5Var.f39621e;
                    fs6Var.getClass();
                    if (c0357g.f4355k0 > 0) {
                        ((x66) fs6Var.f39590b).m24305c(c0357g);
                        c0357g.f4353j0 = true;
                    }
                }
                zM12123c = zM12124d;
            }
            ft5Var.m12129e();
        }
        return zM12123c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    public static boolean m12123c(C0357g c0357g, bk1 bk1Var) throws Throwable {
        boolean zM1638J0;
        C0357g c0357g2 = c0357g.f4348h;
        qq4 qq4Var = c0357g.f4337b0;
        if (c0357g2 == null) {
            return false;
        }
        if (bk1Var == null) {
            C0360j c0360j = qq4Var.f58071q;
            bk1 bk1Var2 = c0360j != null ? c0360j.f4370I : null;
            if (bk1Var2 == null || c0357g2 == null) {
                zM1638J0 = false;
            } else {
                c0360j.getClass();
                zM1638J0 = c0360j.m1638J0(bk1Var2.f8631a);
            }
        } else if (c0357g2 != null) {
            C0360j c0360j2 = qq4Var.f58071q;
            c0360j2.getClass();
            zM1638J0 = c0360j2.m1638J0(bk1Var.f8631a);
        } else {
            zM1638J0 = false;
        }
        C0357g c0357gM1610w = c0357g.m1610w();
        if (zM1638J0 && c0357gM1610w != null) {
            if (c0357gM1610w.f4348h == null) {
                C0357g.m1555b0(c0357gM1610w, false, 3);
                return zM1638J0;
            }
            if (c0357g.m1607t() == LayoutNode$UsageByParent.InMeasureBlock) {
                C0357g.m1554Z(c0357gM1610w, false, 3);
                return zM1638J0;
            }
            if (c0357g.m1607t() == LayoutNode$UsageByParent.InLayoutBlock) {
                c0357gM1610w.m1581Y(false);
            }
        }
        return zM1638J0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12124d(C0357g c0357g, bk1 bk1Var) {
        boolean zM1577T = bk1Var != null ? c0357g.m1577T(bk1Var) : C0357g.m1553U(c0357g);
        C0357g c0357gM1610w = c0357g.m1610w();
        if (zM1577T && c0357gM1610w != null) {
            if (c0357g.m1606s() == LayoutNode$UsageByParent.InMeasureBlock) {
                C0357g.m1555b0(c0357gM1610w, false, 3);
                return zM1577T;
            }
            if (c0357g.m1606s() == LayoutNode$UsageByParent.InLayoutBlock) {
                c0357gM1610w.m1582a0(false);
            }
        }
        return zM1577T;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12125i(C0357g c0357g) {
        C0360j c0360j;
        oq4 oq4Var;
        if (c0357g.f4337b0.f58059e) {
            return (c0357g.m1607t() == LayoutNode$UsageByParent.NotUsed && ((c0360j = c0357g.f4337b0.f58071q) == null || (oq4Var = c0360j.f4375N) == null || !oq4Var.m1537f())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12126j(C0357g c0357g) {
        if (!c0357g.m1605r()) {
            return false;
        }
        do {
            if (c0357g.m1606s() == LayoutNode$UsageByParent.NotUsed && !c0357g.f4337b0.f58070p.f4405T.m1537f()) {
                C0357g c0357gM1610w = c0357g.m1610w();
                if ((c0357gM1610w != null ? c0357gM1610w.f4337b0.f58058d : null) != LayoutNode$LayoutState.Measuring) {
                    return false;
                }
            }
            c0357g = c0357g.m1610w();
            if (c0357g == null) {
                return false;
            }
        } while (!c0357g.m1570M());
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12127k(C0357g c0357g) {
        C0360j c0360j;
        oq4 oq4Var;
        qq4 qq4Var = c0357g.f4337b0;
        return c0357g.m1570M() || qq4Var.f58070p.f4401P || m12126j(c0357g) || fa4.m11650l(c0357g.m1571N(), Boolean.TRUE) || m12125i(c0357g) || qq4Var.f58070p.f4405T.m1537f() || !((c0360j = qq4Var.f58071q) == null || (oq4Var = c0360j.f4375N) == null || !oq4Var.m1537f());
    }

    /* JADX INFO: renamed from: b */
    public final void m12128b(boolean z) {
        fs6 fs6Var = this.f39621e;
        if (z) {
            x66 x66Var = (x66) fs6Var.f39590b;
            C0357g c0357g = this.f39617a;
            if (c0357g.f4355k0 > 0) {
                x66Var.m24310h();
                x66Var.m24305c(c0357g);
                c0357g.f4353j0 = true;
            }
        }
        if (((x66) fs6Var.f39590b).f67832c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                fs6Var.m12111p();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12129e() {
        x66 x66Var = this.f39624h;
        int i = x66Var.f67832c;
        if (i != 0) {
            Object[] objArr = x66Var.f67830a;
            for (int i2 = 0; i2 < i; i2++) {
                dt5 dt5Var = (dt5) objArr[i2];
                if (dt5Var.f36210a.m1569L()) {
                    boolean z = dt5Var.f36211b;
                    C0357g c0357g = dt5Var.f36210a;
                    boolean z2 = dt5Var.f36212c;
                    if (z) {
                        C0357g.m1554Z(c0357g, z2, 2);
                    } else {
                        C0357g.m1555b0(c0357g, z2, 2);
                    }
                }
            }
            x66Var.m24310h();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12130f(C0357g c0357g) {
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (fa4.m11650l(c0357g2.m1571N(), Boolean.TRUE) && !c0357g2.f4357l0) {
                if (this.f39618b.m16509i(c0357g2)) {
                    c0357g2.m1572O();
                }
                m12130f(c0357g2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12131g(C0357g c0357g, boolean z) {
        if (!this.f39619c) {
            i54.m13663b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c0357g.f4337b0.f58059e : c0357g.m1605r()) {
            i54.m13662a("node not yet measured");
        }
        m12132h(c0357g, z);
    }

    /* JADX INFO: renamed from: h */
    public final void m12132h(C0357g c0357g, boolean z) throws Throwable {
        C0360j c0360j;
        oq4 oq4Var;
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if ((!z && (c0357g2.m1606s() == LayoutNode$UsageByParent.InMeasureBlock || c0357g2.f4337b0.f58070p.f4405T.m1537f())) || (z && (c0357g2.m1607t() == LayoutNode$UsageByParent.InMeasureBlock || ((c0360j = c0357g2.f4337b0.f58071q) != null && (oq4Var = c0360j.f4375N) != null && oq4Var.m1537f())))) {
                boolean zM3256x = b34.m3256x(c0357g2);
                qq4 qq4Var = c0357g2.f4337b0;
                if (zM3256x && !z) {
                    if (qq4Var.f58059e && this.f39618b.m16509i(c0357g2)) {
                        m12136o(c0357g2, true);
                    } else {
                        m12131g(c0357g2, true);
                    }
                }
                if (z ? qq4Var.f58059e : c0357g2.m1605r()) {
                    m12136o(c0357g2, z);
                }
                if (!(z ? qq4Var.f58059e : c0357g2.m1605r())) {
                    m12132h(c0357g2, z);
                }
            }
        }
        if (z ? c0357g.f4337b0.f58059e : c0357g.m1605r()) {
            m12136o(c0357g, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [d16] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [x66] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [x66] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: l */
    public final boolean m12133l(ui3 ui3Var) {
        boolean z;
        d16 d16Var;
        ?? M21992f;
        boolean z2;
        C0357g c0357g;
        boolean z3;
        boolean zM12136o;
        C3309ls c3309ls = this.f39618b;
        C0357g c0357g2 = this.f39617a;
        if (!c0357g2.m1569L()) {
            i54.m13662a("performMeasureAndLayout called with unattached root");
        }
        if (!c0357g2.m1570M()) {
            i54.m13662a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f39619c) {
            i54.m13662a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.f39625i != null) {
            this.f39619c = true;
            this.f39620d = true;
            try {
                boolean zM16486D = c3309ls.m16486D();
                m58 m58Var = (m58) c3309ls.f50064b;
                if (zM16486D) {
                    z = false;
                    while (true) {
                        m58 m58Var2 = (m58) c3309ls.f50066d;
                        m58 m58Var3 = (m58) c3309ls.f50065c;
                        if (!((SortedSet) m58Var.f50618b).isEmpty()) {
                            c0357g = (C0357g) ((SortedSet) m58Var.f50618b).first();
                            m58Var.m16648n(c0357g);
                            z3 = c0357g.f4348h != null;
                            z2 = false;
                        } else if (!((SortedSet) m58Var3.f50618b).isEmpty()) {
                            c0357g = (C0357g) ((SortedSet) m58Var3.f50618b).first();
                            m58Var3.m16648n(c0357g);
                            z3 = c0357g.f4348h != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) m58Var2.f50618b).isEmpty()) {
                                break;
                            }
                            C0357g c0357g3 = (C0357g) ((SortedSet) m58Var2.f50618b).first();
                            m58Var2.m16648n(c0357g3);
                            z2 = true;
                            c0357g = c0357g3;
                            z3 = false;
                        }
                        if (z2) {
                            zM12136o = m12122a(this, c0357g, z3);
                        } else {
                            zM12136o = m12136o(c0357g, z3);
                            if (c0357g.f4337b0.f58060f) {
                                c3309ls.m16504a(c0357g, Invalidation.LookaheadPlacement);
                            }
                            if (c0357g.m1604q()) {
                                c3309ls.m16504a(c0357g, Invalidation.Placement);
                            }
                        }
                        if (c0357g == c0357g2 && zM12136o) {
                            z = true;
                        }
                    }
                    if (ui3Var != null) {
                        ui3Var.mo0a();
                    }
                } else {
                    z = false;
                }
                this.f39619c = false;
                this.f39620d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f39619c = false;
                    this.f39620d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        x66 x66Var = this.f39622f;
        Object[] objArr = x66Var.f67830a;
        int i2 = x66Var.f67832c;
        int i3 = 0;
        while (i3 < i2) {
            k40 k40Var = ((C0357g) objArr[i3]).f4335a0;
            C0353c c0353c = (C0353c) k40Var.f46676d;
            boolean zM22199g = tl6.m22199g(4194304);
            if (zM22199g) {
                d16Var = c0353c.f4307n0;
            } else {
                d16Var = c0353c.f4307n0.f34841e;
                if (d16Var == null) {
                }
                i3++;
                i = 0;
            }
            q98 q98Var = AbstractC0362l.f4427i0;
            d16 d16VarM1684h1 = c0353c.m1684h1(zM22199g);
            while (d16VarM1684h1 != null && (d16VarM1684h1.f34840d & 4194304) != 0) {
                if ((d16VarM1684h1.f34839c & 4194304) != 0) {
                    ?? r12 = d16VarM1684h1;
                    ?? x66Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof yp4) {
                            ((yp4) r12).mo1049q((C0353c) k40Var.f46676d);
                        } else {
                            if ((r12.f34839c & 4194304) != 0 && (r12 instanceof fa2)) {
                                d16 d16Var2 = ((fa2) r12).f38701K;
                                int i4 = i;
                                while (d16Var2 != null) {
                                    if ((d16Var2.f34839c & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            M21992f = r12;
                                            x66Var2 = x66Var2;
                                            x66Var2 = x66Var2;
                                            M21992f = d16Var2;
                                        } else {
                                            if (x66Var2 == 0) {
                                                x66Var2 = new x66(new d16[16]);
                                            }
                                            if (M21992f != 0) {
                                                x66Var2.m24305c(M21992f);
                                                M21992f = 0;
                                            }
                                            x66Var2.m24305c(d16Var2);
                                        }
                                    } else {
                                        M21992f = r12;
                                        x66Var2 = x66Var2;
                                    }
                                    d16Var2 = d16Var2.f34842f;
                                    M21992f = M21992f;
                                    x66Var2 = x66Var2;
                                }
                                if (i4 == 1) {
                                    M21992f = r12;
                                    x66Var2 = x66Var2;
                                }
                            }
                            i = 0;
                            r12 = M21992f;
                            x66Var2 = x66Var2;
                        }
                        M21992f = r12;
                        x66Var2 = x66Var2;
                        M21992f = te1.m21992f(x66Var2);
                        i = 0;
                        r12 = M21992f;
                        x66Var2 = x66Var2;
                    }
                }
                if (d16VarM1684h1 == d16Var) {
                    break;
                }
                d16VarM1684h1 = d16VarM1684h1.f34842f;
                i = 0;
            }
            i3++;
            i = 0;
        }
        x66Var.m24310h();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: m */
    public final void m12134m(C0357g c0357g, long j) {
        d16 d16Var;
        if (c0357g.f4357l0) {
            return;
        }
        C0357g c0357g2 = this.f39617a;
        if (c0357g == c0357g2) {
            i54.m13662a("measureAndLayout called on root");
        }
        if (!c0357g2.m1569L()) {
            i54.m13662a("performMeasureAndLayout called with unattached root");
        }
        if (!c0357g2.m1570M()) {
            i54.m13662a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f39619c) {
            i54.m13662a("performMeasureAndLayout called during measure layout");
        }
        if (this.f39625i != null) {
            this.f39619c = true;
            this.f39620d = false;
            try {
                C3309ls c3309ls = this.f39618b;
                ((m58) c3309ls.f50064b).m16648n(c0357g);
                ((m58) c3309ls.f50065c).m16648n(c0357g);
                ((m58) c3309ls.f50066d).m16648n(c0357g);
                if ((m12123c(c0357g, new bk1(j)) || c0357g.f4337b0.f58060f) && fa4.m11650l(c0357g.m1571N(), Boolean.TRUE)) {
                    c0357g.m1572O();
                }
                m12130f(c0357g);
                m12124d(c0357g, new bk1(j));
                if (c0357g.m1604q() && c0357g.m1570M()) {
                    c0357g.m1580X();
                    fs6 fs6Var = this.f39621e;
                    fs6Var.getClass();
                    if (c0357g.f4355k0 > 0) {
                        ((x66) fs6Var.f39590b).m24305c(c0357g);
                        c0357g.f4353j0 = true;
                    }
                }
                m12129e();
                this.f39619c = false;
                this.f39620d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f39619c = false;
                    this.f39620d = false;
                    throw th2;
                }
            }
        }
        x66 x66Var = this.f39622f;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            k40 k40Var = ((C0357g) objArr[i2]).f4335a0;
            C0353c c0353c = (C0353c) k40Var.f46676d;
            boolean zM22199g = tl6.m22199g(4194304);
            if (zM22199g) {
                d16Var = c0353c.f4307n0;
            } else {
                d16Var = c0353c.f4307n0.f34841e;
                if (d16Var == null) {
                }
            }
            q98 q98Var = AbstractC0362l.f4427i0;
            for (d16 d16VarM1684h1 = c0353c.m1684h1(zM22199g); d16VarM1684h1 != null && (d16VarM1684h1.f34840d & 4194304) != 0; d16VarM1684h1 = d16VarM1684h1.f34842f) {
                if ((d16VarM1684h1.f34839c & 4194304) != 0) {
                    ?? M21992f = d16VarM1684h1;
                    ?? x66Var2 = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof yp4) {
                            ((yp4) M21992f).mo1049q((C0353c) k40Var.f46676d);
                        } else if ((M21992f.f34839c & 4194304) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var2 = ((fa2) M21992f).f38701K;
                            int i3 = 0;
                            while (d16Var2 != null) {
                                if ((d16Var2.f34839c & 4194304) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        M21992f = M21992f;
                                        x66Var2 = x66Var2;
                                        x66Var2 = x66Var2;
                                        M21992f = d16Var2;
                                    } else {
                                        if (x66Var2 == 0) {
                                            x66Var2 = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var2.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var2.m24305c(d16Var2);
                                    }
                                } else {
                                    M21992f = M21992f;
                                    x66Var2 = x66Var2;
                                }
                                d16Var2 = d16Var2.f34842f;
                                M21992f = M21992f;
                                x66Var2 = x66Var2;
                            }
                            if (i3 == 1) {
                                M21992f = M21992f;
                                x66Var2 = x66Var2;
                            } else {
                                M21992f = M21992f;
                                x66Var2 = x66Var2;
                            }
                        }
                        M21992f = te1.m21992f(x66Var2);
                    }
                }
                if (d16VarM1684h1 == d16Var) {
                    break;
                }
            }
        }
        x66Var.m24310h();
    }

    /* JADX INFO: renamed from: n */
    public final void m12135n() {
        C3309ls c3309ls = this.f39618b;
        if (c3309ls.m16486D()) {
            C0357g c0357g = this.f39617a;
            if (!c0357g.m1569L()) {
                i54.m13662a("performMeasureAndLayout called with unattached root");
            }
            if (!c0357g.m1570M()) {
                i54.m13662a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f39619c) {
                i54.m13662a("performMeasureAndLayout called during measure layout");
            }
            if (this.f39625i != null) {
                this.f39619c = true;
                this.f39620d = false;
                try {
                    if ((((SortedSet) ((m58) c3309ls.f50066d).f50618b).isEmpty() || ((SortedSet) ((m58) c3309ls.f50064b).f50618b).isEmpty()) ? false : true) {
                        if (c0357g.f4348h != null) {
                            m12138q(c0357g, true);
                        } else {
                            m12137p(c0357g);
                        }
                    }
                    m12138q(c0357g, false);
                    this.f39619c = false;
                    this.f39620d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.f39619c = false;
                        this.f39620d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12136o(C0357g c0357g, boolean z) throws Throwable {
        bk1 bk1Var;
        boolean zM12124d = false;
        if (!c0357g.f4357l0 && m12127k(c0357g)) {
            if (c0357g == this.f39617a) {
                bk1Var = this.f39625i;
                bk1Var.getClass();
            } else {
                bk1Var = null;
            }
            if (z) {
                if (c0357g.f4337b0.f58059e) {
                    zM12124d = m12123c(c0357g, bk1Var);
                }
            } else if (c0357g.m1605r()) {
                zM12124d = m12124d(c0357g, bk1Var);
            }
            m12129e();
        }
        return zM12124d;
    }

    /* JADX INFO: renamed from: p */
    public final void m12137p(C0357g c0357g) throws Throwable {
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (c0357g2.m1606s() == LayoutNode$UsageByParent.InMeasureBlock || c0357g2.f4337b0.f58070p.f4405T.m1537f()) {
                if (b34.m3256x(c0357g2)) {
                    m12138q(c0357g2, true);
                } else {
                    m12137p(c0357g2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m12138q(C0357g c0357g, boolean z) throws Throwable {
        bk1 bk1Var;
        if (c0357g.f4357l0) {
            return;
        }
        if (c0357g == this.f39617a) {
            bk1Var = this.f39625i;
            bk1Var.getClass();
        } else {
            bk1Var = null;
        }
        if (z) {
            m12123c(c0357g, bk1Var);
        } else {
            m12124d(c0357g, bk1Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12139r(C0357g c0357g, boolean z) {
        int i = et5.f37826a[c0357g.f4337b0.f58058d.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f39624h.m24305c(new dt5(c0357g, false, z));
            } else {
                if (i != 5) {
                    gm5.m12750e();
                    return false;
                }
                if (!c0357g.m1605r() || z) {
                    c0357g.f4337b0.f58070p.f4402Q = true;
                    if (!c0357g.f4357l0 && (c0357g.m1570M() || m12126j(c0357g))) {
                        C0357g c0357gM1610w = c0357g.m1610w();
                        if (c0357gM1610w == null || !c0357gM1610w.m1605r()) {
                            this.f39618b.m16504a(c0357g, Invalidation.Measurement);
                        }
                        if (!this.f39620d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m12140s(long j) {
        bk1 bk1Var = this.f39625i;
        if (bk1Var == null ? false : bk1.m3795c(bk1Var.f8631a, j)) {
            return;
        }
        if (this.f39619c) {
            i54.m13662a("updateRootConstraints called while measuring");
        }
        this.f39625i = new bk1(j);
        C0357g c0357g = this.f39617a;
        boolean zM1569L = c0357g.m1569L();
        qq4 qq4Var = c0357g.f4337b0;
        if (zM1569L) {
            C0357g c0357g2 = c0357g.f4348h;
            if (c0357g2 != null) {
                qq4Var.f58059e = true;
            }
            qq4Var.f58070p.f4402Q = true;
            this.f39618b.m16504a(c0357g, c0357g2 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
        }
    }
}
