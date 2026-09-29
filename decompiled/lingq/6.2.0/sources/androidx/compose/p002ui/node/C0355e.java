package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.AbstractC3608te;
import p000.aa1;
import p000.d16;
import p000.d66;
import p000.eh0;
import p000.f84;
import p000.ho2;
import p000.jq4;
import p000.l87;
import p000.n84;
import p000.pq4;
import p000.u8a;
import p000.vi3;
import p000.vz1;
import p000.yk5;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.node.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0355e extends AbstractC0362l {

    /* JADX INFO: renamed from: p0 */
    public static final u8a f4309p0;

    /* JADX INFO: renamed from: n0 */
    public InterfaceC0354d f4310n0;

    /* JADX INFO: renamed from: o0 */
    public jq4 f4311o0;

    static {
        u8a u8aVarM11125e = eh0.m11125e();
        int i = aa1.f413l;
        u8aVarM11125e.m22555p(aa1.f409h);
        u8aVarM11125e.m22562w(1.0f);
        u8aVarM11125e.m22563x(1);
        f4309p0 = u8aVarM11125e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0355e(C0357g c0357g, InterfaceC0354d interfaceC0354d) {
        super(c0357g);
        this.f4310n0 = interfaceC0354d;
        this.f4311o0 = c0357g.f4348h != null ? new jq4(this) : null;
        if ((((d16) interfaceC0354d).f34837a.f34839c & 512) == 0) {
            return;
        }
        ho2.m13383c();
        throw null;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m1549H1() {
        if (this.f4366j) {
            return;
        }
        m1696q1();
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        boolean z = abstractC0362l.f4367k;
        abstractC0362l.f4367k = this.f4367k;
        mo1624N0().mo10625c();
        abstractC0362l.f4367k = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final void m1550I1(InterfaceC0354d interfaceC0354d) {
        if (interfaceC0354d.equals(this.f4310n0) || (((d16) interfaceC0354d).f34837a.f34839c & 512) == 0) {
            this.f4310n0 = interfaceC0354d;
        } else {
            ho2.m13383c();
        }
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        InterfaceC0354d interfaceC0354d = this.f4310n0;
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        return interfaceC0354d.mo968e(this, abstractC0362l, i);
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: a1 */
    public final void mo1541a1() {
        if (this.f4311o0 == null) {
            this.f4311o0 = new jq4(this);
        }
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        InterfaceC0354d interfaceC0354d = this.f4310n0;
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        return interfaceC0354d.mo970j(this, abstractC0362l, i);
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: d1 */
    public final yk5 mo1542d1() {
        return this.f4311o0;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: f1 */
    public final d16 mo1543f1() {
        return ((d16) this.f4310n0).f34837a;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: i0 */
    public final void mo1544i0(long j, float f, vi3 vi3Var) {
        m1701v1(j, f, vi3Var, null);
        m1549H1();
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l, p000.l87
    /* JADX INFO: renamed from: j0 */
    public final void mo1545j0(long j, float f, C0312a c0312a) {
        m1701v1(j, f, null, c0312a);
        m1549H1();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        InterfaceC0354d interfaceC0354d = this.f4310n0;
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        return interfaceC0354d.mo967b(this, abstractC0362l, i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        InterfaceC0354d interfaceC0354d = this.f4310n0;
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        return interfaceC0354d.mo969i(this, abstractC0362l, i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        m16026m0(j);
        InterfaceC0354d interfaceC0354d = this.f4310n0;
        AbstractC0362l abstractC0362l = this.f4433K;
        abstractC0362l.getClass();
        m1704y1(interfaceC0354d.mo575f(this, abstractC0362l, j));
        m1694p1();
        return this;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: r0 */
    public final int mo1547r0(AbstractC3608te abstractC3608te) {
        jq4 jq4Var = this.f4311o0;
        if (jq4Var == null) {
            return vz1.m23625d(this, abstractC3608te);
        }
        d66 d66Var = jq4Var.f69933O;
        int iM10125d = d66Var.m10125d(abstractC3608te);
        if (iM10125d >= 0) {
            return d66Var.f35036c[iM10125d];
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0362l
    /* JADX INFO: renamed from: u1 */
    public final void mo1548u1(ym0 ym0Var, C0312a c0312a) {
        AbstractC0362l abstractC0362l;
        AbstractC0362l abstractC0362l2 = this.f4433K;
        abstractC0362l2.getClass();
        abstractC0362l2.m1676Y0(ym0Var, c0312a);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4432J)).getShowLayoutBounds() || (abstractC0362l = this.f4433K) == null) {
            return;
        }
        if (n84.m17279a(this.f49303c, abstractC0362l.f49303c) && f84.m11593b(abstractC0362l.f4443U, 0L)) {
            return;
        }
        long j = this.f49303c;
        ym0Var.mo17014f(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f4309p0);
    }
}
