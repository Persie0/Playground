package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.AbstractC3608te;
import p000.aa1;
import p000.bl2;
import p000.cu3;
import p000.d16;
import p000.eh0;
import p000.ht5;
import p000.ir9;
import p000.l87;
import p000.omd;
import p000.oq4;
import p000.pq4;
import p000.sl6;
import p000.u8a;
import p000.v54;
import p000.vi3;
import p000.x66;
import p000.yk5;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.node.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0353c extends AbstractC0362l {

    /* JADX INFO: renamed from: p0 */
    public static final u8a f4306p0;

    /* JADX INFO: renamed from: n0 */
    public final ir9 f4307n0;

    /* JADX INFO: renamed from: o0 */
    public v54 f4308o0;

    static {
        u8a u8aVarM11125e = eh0.m11125e();
        int i = aa1.f413l;
        u8aVarM11125e.m22555p(aa1.f407f);
        u8aVarM11125e.m22562w(1.0f);
        u8aVarM11125e.m22563x(1);
        f4306p0 = u8aVarM11125e;
    }

    public C0353c(C0357g c0357g) {
        super(c0357g);
        ir9 ir9Var = new ir9();
        ir9Var.f34840d = 0;
        this.f4307n0 = ir9Var;
        ir9Var.f34844h = this;
        this.f4308o0 = c0357g.f4348h != null ? new v54(this) : null;
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        bl2 bl2VarM1609v = this.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo741e((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1601n(), i);
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: a1 */
    public final void mo1541a1() {
        if (this.f4308o0 == null) {
            this.f4308o0 = new v54(this);
        }
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        bl2 bl2VarM1609v = this.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo740d((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1601n(), i);
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: d1 */
    public final yk5 mo1542d1() {
        return this.f4308o0;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: f1 */
    public final d16 mo1543f1() {
        return this.f4307n0;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: i0 */
    public final void mo1544i0(long j, float f, vi3 vi3Var) {
        m1701v1(j, f, vi3Var, null);
        if (this.f4366j) {
            return;
        }
        this.f4432J.f4337b0.f58070p.m1651E0();
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l, p000.l87
    /* JADX INFO: renamed from: j0 */
    public final void mo1545j0(long j, float f, C0312a c0312a) {
        m1701v1(j, f, null, c0312a);
        if (this.f4366j) {
            return;
        }
        this.f4432J.f4337b0.f58070p.m1651E0();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        bl2 bl2VarM1609v = this.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo739c((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1601n(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: l1 */
    public final void mo1546l1(sl6 sl6Var, long j, cu3 cu3Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        C0357g c0357g;
        long jM9893d;
        C0357g c0357g2 = this.f4432J;
        boolean z3 = false;
        if (sl6Var.mo18971f(c0357g2)) {
            if (!m1666G1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m1675X0(j, m1681e1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = cu3Var.f34539c;
                    x66 x66VarM1558A = c0357g2.m1558A();
                    objArr = x66VarM1558A.f67830a;
                    i3 = x66VarM1558A.f67832c - 1;
                    while (i3 >= 0) {
                        c0357g = (C0357g) objArr[i3];
                        if (c0357g.m1570M()) {
                            sl6Var.mo18969d(c0357g, j, cu3Var, i2, z2);
                            jM9893d = cu3Var.m9893d();
                            if (omd.m18121J(jM9893d) >= 0.0f && omd.m18126P(jM9893d) && !omd.m18125O(jM9893d) && !sl6Var.mo18970e(cu3Var, c0357g)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    cu3Var.f34539c = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = cu3Var.f34539c;
                x66 x66VarM1558A2 = c0357g2.m1558A();
                objArr = x66VarM1558A2.f67830a;
                i3 = x66VarM1558A2.f67832c - 1;
                while (i3 >= 0) {
                    c0357g = (C0357g) objArr[i3];
                    if (c0357g.m1570M()) {
                        sl6Var.mo18969d(c0357g, j, cu3Var, i2, z2);
                        jM9893d = cu3Var.m9893d();
                        if (omd.m18121J(jM9893d) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                cu3Var.f34539c = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = cu3Var.f34539c;
            x66 x66VarM1558A3 = c0357g2.m1558A();
            objArr = x66VarM1558A3.f67830a;
            i3 = x66VarM1558A3.f67832c - 1;
            while (i3 >= 0) {
                c0357g = (C0357g) objArr[i3];
                if (c0357g.m1570M()) {
                    sl6Var.mo18969d(c0357g, j, cu3Var, i2, z2);
                    jM9893d = cu3Var.m9893d();
                    if (omd.m18121J(jM9893d) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            cu3Var.f34539c = i6;
        }
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        bl2 bl2VarM1609v = this.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo737a((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1601n(), i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        m16026m0(j);
        C0357g c0357g = this.f4432J;
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0357g) objArr[i2]).f4337b0.f58070p.f4426l = LayoutNode$UsageByParent.NotUsed;
        }
        m1704y1(c0357g.f4325R.mo738b(this, c0357g.m1601n(), j));
        m1694p1();
        return this;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: r0 */
    public final int mo1547r0(AbstractC3608te abstractC3608te) {
        v54 v54Var = this.f4308o0;
        if (v54Var != null) {
            return v54Var.mo1547r0(abstractC3608te);
        }
        C0361k c0361k = this.f4432J.f4337b0.f58070p;
        oq4 oq4Var = c0361k.f4405T;
        if (!c0361k.f4393H) {
            if (c0361k.f4417f.f58058d == LayoutNode$LayoutState.Measuring) {
                oq4Var.f4294f = true;
                if (oq4Var.f4290b) {
                    c0361k.f4403R = true;
                    c0361k.f4404S = true;
                }
            } else {
                oq4Var.f4295g = true;
            }
        }
        C0353c c0353cMo1643e = c0361k.mo1643e();
        boolean z = c0353cMo1643e.f4367k;
        c0353cMo1643e.f4367k = true;
        c0361k.mo1636I();
        c0353cMo1643e.f4367k = z;
        Integer num = (Integer) oq4Var.f4297i.get(abstractC3608te);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: u1 */
    public final void mo1548u1(ym0 ym0Var, C0312a c0312a) throws Throwable {
        C0357g c0357g = this.f4432J;
        Owner ownerM19457a = pq4.m19457a(c0357g);
        x66 x66VarM1558A = c0357g.m1558A();
        Object[] objArr = x66VarM1558A.f67830a;
        int i = x66VarM1558A.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0357g c0357g2 = (C0357g) objArr[i2];
            if (c0357g2.m1570M()) {
                c0357g2.m1595j(ym0Var, c0312a);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).getShowLayoutBounds()) {
            long j = this.f49303c;
            ym0Var.mo17014f(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f4306p0);
        }
    }
}
