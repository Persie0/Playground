package androidx.compose.p017ui.node;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.LinkedHashMap;
import p127g1.C5649m;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p166i1.AbstractC6164s;
import p385sf.C9000b;
import p387t0.InterfaceC9172x;
import p470x1.C10020h;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.node.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0546e extends AbstractC6164s implements InterfaceC5651o {

    /* JADX INFO: renamed from: g */
    public final NodeCoordinator f3905g;

    /* JADX INFO: renamed from: h */
    public long f3906h;

    /* JADX INFO: renamed from: i */
    public LinkedHashMap f3907i;

    /* JADX INFO: renamed from: j */
    public final C5649m f3908j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5653q f3909k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f3910l;

    public AbstractC0546e(NodeCoordinator nodeCoordinator) {
        C5207g.m11111f(nodeCoordinator, "coordinator");
        C5207g.m11111f(null, "lookaheadScope");
        this.f3905g = nodeCoordinator;
        this.f3906h = C10020h.f50973b;
        this.f3908j = new C5649m(this);
        this.f3910l = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m2209U0(AbstractC0546e abstractC0546e, InterfaceC5653q interfaceC5653q) {
        C9072e c9072e;
        if (interfaceC5653q != null) {
            abstractC0546e.getClass();
            abstractC0546e.m2051H0(C9000b.m17236a(interfaceC5653q.mo2039b(), interfaceC5653q.mo2038a()));
            c9072e = C9072e.f47360a;
        } else {
            c9072e = null;
        }
        if (c9072e == null) {
            abstractC0546e.m2051H0(0L);
        }
        if (!C5207g.m11106a(abstractC0546e.f3909k, interfaceC5653q) && interfaceC5653q != null) {
            LinkedHashMap linkedHashMap = abstractC0546e.f3907i;
            if (!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!interfaceC5653q.mo2040e().isEmpty())) {
                if (!C5207g.m11106a(interfaceC5653q.mo2040e(), abstractC0546e.f3907i)) {
                    abstractC0546e.f3905g.f3844g.f3759V.getClass();
                    C5207g.m11108c(null);
                    throw null;
                }
            }
        }
        abstractC0546e.f3909k = interfaceC5653q;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: L0 */
    public final AbstractC6164s mo2157L0() {
        NodeCoordinator nodeCoordinator = this.f3905g.f3845h;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f3835L;
        }
        return null;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC5647k mo2158M0() {
        return this.f3908j;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: N0 */
    public final boolean mo2160N0() {
        return this.f3909k != null;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: O0 */
    public final LayoutNode mo2161O0() {
        return this.f3905g.f3844g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: P0 */
    public final InterfaceC5653q mo2162P0() {
        InterfaceC5653q interfaceC5653q = this.f3909k;
        if (interfaceC5653q != null) {
            return interfaceC5653q;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: Q0 */
    public final AbstractC6164s mo2163Q0() {
        NodeCoordinator nodeCoordinator = this.f3905g.f3846i;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f3835L;
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public int mo2044R(int i10) {
        NodeCoordinator nodeCoordinator = this.f3905g.f3845h;
        C5207g.m11108c(nodeCoordinator);
        AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
        C5207g.m11108c(abstractC0546e);
        return abstractC0546e.mo2044R(i10);
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: R0 */
    public final long mo2164R0() {
        return this.f3906h;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: T0 */
    public final void mo2165T0() {
        mo2056t0(this.f3906h, 0.0f, null);
    }

    /* JADX INFO: renamed from: V0 */
    public void m2210V0() {
        AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
        int iMo2039b = mo2162P0().mo2039b();
        LayoutDirection layoutDirection = this.f3905g.f3844g.f3747J;
        InterfaceC5647k interfaceC5647k = AbstractC0526g.a.f3693d;
        c10587a.getClass();
        int i10 = AbstractC0526g.a.f3692c;
        LayoutDirection layoutDirection2 = AbstractC0526g.a.f3691b;
        AbstractC0526g.a.f3692c = iMo2039b;
        AbstractC0526g.a.f3691b = layoutDirection;
        boolean zM2065i = AbstractC0526g.a.C10587a.m2065i(c10587a, this);
        mo2162P0().mo2041f();
        this.f35994f = zM2065i;
        AbstractC0526g.a.f3692c = i10;
        AbstractC0526g.a.f3691b = layoutDirection2;
        AbstractC0526g.a.f3693d = interfaceC5647k;
    }

    /* JADX INFO: renamed from: a */
    public int mo2045a(int i10) {
        NodeCoordinator nodeCoordinator = this.f3905g.f3845h;
        C5207g.m11108c(nodeCoordinator);
        AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
        C5207g.m11108c(abstractC0546e);
        return abstractC0546e.mo2045a(i10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f3905g.mo1462c0();
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f3905g.getDensity();
    }

    @Override // p127g1.InterfaceC5645i
    public final LayoutDirection getLayoutDirection() {
        return this.f3905g.f3844g.f3747J;
    }

    /* JADX INFO: renamed from: s */
    public int mo2046s(int i10) {
        NodeCoordinator nodeCoordinator = this.f3905g.f3845h;
        C5207g.m11108c(nodeCoordinator);
        AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
        C5207g.m11108c(abstractC0546e);
        return abstractC0546e.mo2046s(i10);
    }

    @Override // androidx.compose.p017ui.layout.AbstractC0526g
    /* JADX INFO: renamed from: t0 */
    public final void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        long j11 = this.f3906h;
        int i10 = C10020h.f50974c;
        if (!(j11 == j10)) {
            this.f3906h = j10;
            NodeCoordinator nodeCoordinator = this.f3905g;
            nodeCoordinator.f3844g.f3759V.getClass();
            AbstractC6164s.m12681S0(nodeCoordinator);
        }
        if (this.f35993e) {
            return;
        }
        m2210V0();
    }

    /* JADX INFO: renamed from: u */
    public int mo2047u(int i10) {
        NodeCoordinator nodeCoordinator = this.f3905g.f3845h;
        C5207g.m11108c(nodeCoordinator);
        AbstractC0546e abstractC0546e = nodeCoordinator.f3835L;
        C5207g.m11108c(abstractC0546e);
        return abstractC0546e.mo2047u(i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: y */
    public final Object mo2049y() {
        return this.f3905g.mo2049y();
    }
}
