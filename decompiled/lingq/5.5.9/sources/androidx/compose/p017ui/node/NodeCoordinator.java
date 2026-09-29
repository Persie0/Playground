package androidx.compose.p017ui.node;

import ae.C0062b;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import dm.C5212l;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import p127g1.C5649m;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p166i1.AbstractC6164s;
import p166i1.C6151j;
import p166i1.C6156l0;
import p166i1.C6159n;
import p166i1.C6166u;
import p166i1.C6168w;
import p166i1.C6169x;
import p166i1.InterfaceC6137c;
import p166i1.InterfaceC6140d0;
import p166i1.InterfaceC6142e0;
import p166i1.InterfaceC6143f;
import p166i1.InterfaceC6144f0;
import p166i1.InterfaceC6146g0;
import p166i1.InterfaceC6154k0;
import p166i1.InterfaceC6160o;
import p210k1.C6572j;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8940b;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9144f0;
import p387t0.C9147h;
import p387t0.C9148h0;
import p387t0.C9162o0;
import p387t0.C9173y;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9172x;
import p470x1.C10020h;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import sl.C9072e;
import tl.C9322j;

/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends AbstractC6164s implements InterfaceC5651o, InterfaceC5647k, InterfaceC6142e0, InterfaceC2052l<InterfaceC9165q, C9072e> {

    /* JADX INFO: renamed from: U */
    public static final InterfaceC2052l<NodeCoordinator, C9072e> f3825U = new InterfaceC2052l<NodeCoordinator, C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(NodeCoordinator nodeCoordinator) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator;
            C5207g.m11111f(nodeCoordinator2, "coordinator");
            if (nodeCoordinator2.mo2089o()) {
                C6159n c6159n = nodeCoordinator2.f3840Q;
                if (c6159n == null) {
                    nodeCoordinator2.m2198w1();
                } else {
                    C6159n c6159n2 = NodeCoordinator.f3828X;
                    c6159n2.getClass();
                    c6159n2.f35981a = c6159n.f35981a;
                    c6159n2.f35982b = c6159n.f35982b;
                    c6159n2.f35983c = c6159n.f35983c;
                    c6159n2.f35984d = c6159n.f35984d;
                    c6159n2.f35985e = c6159n.f35985e;
                    c6159n2.f35986f = c6159n.f35986f;
                    c6159n2.f35987g = c6159n.f35987g;
                    c6159n2.f35988h = c6159n.f35988h;
                    c6159n2.f35989i = c6159n.f35989i;
                    nodeCoordinator2.m2198w1();
                    boolean z10 = true;
                    if (c6159n2.f35981a == c6159n.f35981a) {
                        if (c6159n2.f35982b == c6159n.f35982b) {
                            if (c6159n2.f35983c == c6159n.f35983c) {
                                if (c6159n2.f35984d == c6159n.f35984d) {
                                    if (c6159n2.f35985e == c6159n.f35985e) {
                                        if (c6159n2.f35986f == c6159n.f35986f) {
                                            if (c6159n2.f35987g == c6159n.f35987g) {
                                                if (c6159n2.f35988h == c6159n.f35988h) {
                                                    if (!(c6159n2.f35989i == c6159n.f35989i)) {
                                                        z10 = false;
                                                    }
                                                } else {
                                                    z10 = false;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        LayoutNode layoutNode = nodeCoordinator2.f3844g;
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
                        if (layoutNodeLayoutDelegate.f3790h > 0) {
                            if (layoutNodeLayoutDelegate.f3789g) {
                                layoutNode.m2113I(false);
                            }
                            layoutNodeLayoutDelegate.f3791i.m2145J0();
                        }
                        InterfaceC0549h interfaceC0549h = layoutNode.f3774h;
                        if (interfaceC0549h != null) {
                            interfaceC0549h.mo2229g(layoutNode);
                        }
                    }
                }
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: V */
    public static final InterfaceC2052l<NodeCoordinator, C9072e> f3826V = new InterfaceC2052l<NodeCoordinator, C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(NodeCoordinator nodeCoordinator) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator;
            C5207g.m11111f(nodeCoordinator2, "coordinator");
            InterfaceC6140d0 interfaceC6140d0 = nodeCoordinator2.f3843T;
            if (interfaceC6140d0 != null) {
                interfaceC6140d0.invalidate();
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: W */
    public static final C9148h0 f3827W = new C9148h0();

    /* JADX INFO: renamed from: X */
    public static final C6159n f3828X = new C6159n();

    /* JADX INFO: renamed from: Y */
    public static final C0538a f3829Y;

    /* JADX INFO: renamed from: Z */
    public static final C0539b f3830Z;

    /* JADX INFO: renamed from: H */
    public InterfaceC10015c f3831H;

    /* JADX INFO: renamed from: I */
    public LayoutDirection f3832I;

    /* JADX INFO: renamed from: J */
    public float f3833J;

    /* JADX INFO: renamed from: K */
    public InterfaceC5653q f3834K;

    /* JADX INFO: renamed from: L */
    public AbstractC0546e f3835L;

    /* JADX INFO: renamed from: M */
    public LinkedHashMap f3836M;

    /* JADX INFO: renamed from: N */
    public long f3837N;

    /* JADX INFO: renamed from: O */
    public float f3838O;

    /* JADX INFO: renamed from: P */
    public C8940b f3839P;

    /* JADX INFO: renamed from: Q */
    public C6159n f3840Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC2041a<C9072e> f3841R;

    /* JADX INFO: renamed from: S */
    public boolean f3842S;

    /* JADX INFO: renamed from: T */
    public InterfaceC6140d0 f3843T;

    /* JADX INFO: renamed from: g */
    public final LayoutNode f3844g;

    /* JADX INFO: renamed from: h */
    public NodeCoordinator f3845h;

    /* JADX INFO: renamed from: i */
    public NodeCoordinator f3846i;

    /* JADX INFO: renamed from: j */
    public boolean f3847j;

    /* JADX INFO: renamed from: k */
    public boolean f3848k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2052l<? super InterfaceC9172x, C9072e> f3849l;

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$a */
    public static final class C0538a implements InterfaceC0540c<InterfaceC6146g0> {
        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: a */
        public final int mo2200a() {
            return 16;
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: b */
        public final void mo2201b(LayoutNode layoutNode, long j10, C6151j<InterfaceC6146g0> c6151j, boolean z10, boolean z11) {
            C5207g.m11111f(c6151j, "hitTestResult");
            layoutNode.m2131u(j10, c6151j, z10, z11);
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: c */
        public final boolean mo2202c(LayoutNode layoutNode) {
            C5207g.m11111f(layoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: d */
        public final boolean mo2203d(InterfaceC6137c interfaceC6137c) {
            InterfaceC6146g0 interfaceC6146g0 = (InterfaceC6146g0) interfaceC6137c;
            C5207g.m11111f(interfaceC6146g0, "node");
            interfaceC6146g0.mo2090p();
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$b */
    public static final class C0539b implements InterfaceC0540c<InterfaceC6154k0> {
        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: a */
        public final int mo2200a() {
            return 8;
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: b */
        public final void mo2201b(LayoutNode layoutNode, long j10, C6151j<InterfaceC6154k0> c6151j, boolean z10, boolean z11) {
            C5207g.m11111f(c6151j, "hitTestResult");
            C6166u c6166u = layoutNode.f3758U;
            c6166u.f35997c.m2182i1(NodeCoordinator.f3830Z, c6166u.f35997c.m2176c1(j10), c6151j, true, z11);
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: c */
        public final boolean mo2202c(LayoutNode layoutNode) {
            C6572j c6572jM12666a;
            C5207g.m11111f(layoutNode, "parentLayoutNode");
            InterfaceC6154k0 interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNode);
            boolean z10 = false;
            if (interfaceC6154k0M16750q0 != null && (c6572jM12666a = C6156l0.m12666a(interfaceC6154k0M16750q0)) != null && c6572jM12666a.f37393c) {
                z10 = true;
            }
            return !z10;
        }

        @Override // androidx.compose.p017ui.node.NodeCoordinator.InterfaceC0540c
        /* JADX INFO: renamed from: d */
        public final boolean mo2203d(InterfaceC6137c interfaceC6137c) {
            C5207g.m11111f((InterfaceC6154k0) interfaceC6137c, "node");
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$c */
    public interface InterfaceC0540c<N extends InterfaceC6137c> {
        /* JADX INFO: renamed from: a */
        int mo2200a();

        /* JADX INFO: renamed from: b */
        void mo2201b(LayoutNode layoutNode, long j10, C6151j<N> c6151j, boolean z10, boolean z11);

        /* JADX INFO: renamed from: c */
        boolean mo2202c(LayoutNode layoutNode);

        /* JADX INFO: renamed from: d */
        boolean mo2203d(N n10);
    }

    static {
        C7499b.m14961r();
        f3829Y = new C0538a();
        f3830Z = new C0539b();
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f3844g = layoutNode;
        this.f3831H = layoutNode.f3746I;
        this.f3832I = layoutNode.f3747J;
        this.f3833J = 0.8f;
        int i10 = C10020h.f50974c;
        this.f3837N = C10020h.f50973b;
        this.f3841R = new NodeCoordinator$invalidateParentLayer$1(this);
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: A */
    public final NodeCoordinator mo2156A() {
        if (mo2190q()) {
            return this.f3844g.f3758U.f35997c.f3846i;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: L0 */
    public final AbstractC6164s mo2157L0() {
        return this.f3845h;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC5647k mo2158M0() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: N */
    public final long mo2159N(long j10) {
        if (!mo2190q()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f3846i) {
            j10 = nodeCoordinator.m2197v1(j10);
        }
        return j10;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: N0 */
    public final boolean mo2160N0() {
        return this.f3834K != null;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: O0 */
    public final LayoutNode mo2161O0() {
        return this.f3844g;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: P0 */
    public final InterfaceC5653q mo2162P0() {
        InterfaceC5653q interfaceC5653q = this.f3834K;
        if (interfaceC5653q != null) {
            return interfaceC5653q;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: Q0 */
    public final AbstractC6164s mo2163Q0() {
        return this.f3846i;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: R0 */
    public final long mo2164R0() {
        return this.f3837N;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: T0 */
    public final void mo2165T0() {
        mo2056t0(this.f3837N, this.f3838O, this.f3849l);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m2166U0(NodeCoordinator nodeCoordinator, C8940b c8940b, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f3846i;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.m2166U0(nodeCoordinator, c8940b, z10);
        }
        long j10 = this.f3837N;
        int i10 = C10020h.f50974c;
        float f3 = (int) (j10 >> 32);
        c8940b.f46884a -= f3;
        c8940b.f46886c -= f3;
        float fM18625a = C10020h.m18625a(j10);
        c8940b.f46885b -= fM18625a;
        c8940b.f46887d -= fM18625a;
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.mo2312b(c8940b, true);
            if (this.f3848k && z10) {
                long j11 = this.f3688c;
                c8940b.m17160a(0.0f, 0.0f, (int) (j11 >> 32), C10022j.m18628b(j11));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final long m2167V0(NodeCoordinator nodeCoordinator, long j10) {
        if (nodeCoordinator == this) {
            return j10;
        }
        NodeCoordinator nodeCoordinator2 = this.f3846i;
        return (nodeCoordinator2 == null || C5207g.m11106a(nodeCoordinator, nodeCoordinator2)) ? m2176c1(j10) : m2176c1(nodeCoordinator2.m2167V0(nodeCoordinator, j10));
    }

    /* JADX INFO: renamed from: W0 */
    public final long m2168W0(long j10) {
        return C8584v.m16788m(Math.max(0.0f, (C8944f.m17177d(j10) - mo2055e0()) / 2.0f), Math.max(0.0f, (C8944f.m17175b(j10) - mo2054X()) / 2.0f));
    }

    /* JADX INFO: renamed from: X0 */
    public final float m2169X0(long j10, long j11) {
        float fM17165d = Float.POSITIVE_INFINITY;
        if (mo2055e0() >= C8944f.m17177d(j11) && mo2054X() >= C8944f.m17175b(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM2168W0 = m2168W0(j11);
        float fM17177d = C8944f.m17177d(jM2168W0);
        float fM17175b = C8944f.m17175b(jM2168W0);
        float fM17164c = C8941c.m17164c(j10);
        float fMax = Math.max(0.0f, fM17164c < 0.0f ? -fM17164c : fM17164c - mo2055e0());
        float fM17165d2 = C8941c.m17165d(j10);
        long jM14932c = C7499b.m14932c(fMax, Math.max(0.0f, fM17165d2 < 0.0f ? -fM17165d2 : fM17165d2 - mo2054X()));
        if ((fM17177d > 0.0f || fM17175b > 0.0f) && C8941c.m17164c(jM14932c) <= fM17177d && C8941c.m17165d(jM14932c) <= fM17175b) {
            fM17165d = (C8941c.m17165d(jM14932c) * C8941c.m17165d(jM14932c)) + (C8941c.m17164c(jM14932c) * C8941c.m17164c(jM14932c));
        }
        return fM17165d;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m2170Y0(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.mo2314d(interfaceC9165q);
            return;
        }
        long j10 = this.f3837N;
        float f3 = (int) (j10 >> 32);
        float fM18625a = C10020h.m18625a(j10);
        interfaceC9165q.mo17427n(f3, fM18625a);
        m2172a1(interfaceC9165q);
        interfaceC9165q.mo17427n(-f3, -fM18625a);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m2171Z0(InterfaceC9165q interfaceC9165q, C9147h c9147h) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        C5207g.m11111f(c9147h, "paint");
        long j10 = this.f3688c;
        interfaceC9165q.m17484g(new C8942d(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, C10022j.m18628b(j10) - 0.5f), c9147h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [i1.r] */
    /* JADX WARN: Type inference failed for: r9v0, types: [i1.f] */
    /* JADX INFO: renamed from: a1 */
    public final void m2172a1(InterfaceC9165q interfaceC9165q) {
        boolean zM12694c = C6169x.m12694c(4);
        InterfaceC0500b.c cVarMo2178e1 = mo2178e1();
        Object obj = null;
        if (zM12694c || (cVarMo2178e1 = cVarMo2178e1.f3329d) != null) {
            InterfaceC0500b.c cVarM2179f1 = m2179f1(zM12694c);
            while (true) {
                if (cVarM2179f1 != null && (cVarM2179f1.f3328c & 4) != 0) {
                    if ((cVarM2179f1.f3327b & 4) != 0) {
                        if (cVarM2179f1 instanceof InterfaceC6143f) {
                            obj = cVarM2179f1;
                        }
                        obj = (InterfaceC6143f) obj;
                        break;
                    } else if (cVarM2179f1 != cVarMo2178e1) {
                        cVarM2179f1 = cVarM2179f1.f3330e;
                    }
                }
                break;
            }
        }
        ?? r10 = obj;
        if (r10 == 0) {
            mo2192r1(interfaceC9165q);
            return;
        }
        LayoutNode layoutNode = this.f3844g;
        layoutNode.getClass();
        C0062b.m296O1(layoutNode).getSharedDrawScope().m12672a(interfaceC9165q, C9000b.m17259y(this.f3688c), this, r10);
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: b */
    public final long mo2173b(long j10) {
        return C0062b.m296O1(this.f3844g).mo2228f(mo2159N(j10));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b1 */
    public final NodeCoordinator m2174b1(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = this.f3844g;
        LayoutNode layoutNode2 = nodeCoordinator.f3844g;
        if (layoutNode2 == layoutNode) {
            InterfaceC0500b.c cVarMo2178e1 = nodeCoordinator.mo2178e1();
            InterfaceC0500b.c cVar = mo2178e1().f3326a;
            if (!cVar.f3335j) {
                throw new IllegalStateException("Check failed.".toString());
            }
            for (InterfaceC0500b.c cVar2 = cVar.f3329d; cVar2 != null; cVar2 = cVar2.f3329d) {
                if ((cVar2.f3327b & 2) != 0 && cVar2 == cVarMo2178e1) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        LayoutNode layoutNodeM2128r = layoutNode2;
        while (layoutNodeM2128r.f3775i > layoutNode.f3775i) {
            layoutNodeM2128r = layoutNodeM2128r.m2128r();
            C5207g.m11108c(layoutNodeM2128r);
        }
        LayoutNode layoutNodeM2128r2 = layoutNode;
        while (layoutNodeM2128r2.f3775i > layoutNodeM2128r.f3775i) {
            layoutNodeM2128r2 = layoutNodeM2128r2.m2128r();
            C5207g.m11108c(layoutNodeM2128r2);
        }
        while (layoutNodeM2128r != layoutNodeM2128r2) {
            layoutNodeM2128r = layoutNodeM2128r.m2128r();
            layoutNodeM2128r2 = layoutNodeM2128r2.m2128r();
            if (layoutNodeM2128r == null || layoutNodeM2128r2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNodeM2128r2 == layoutNode) {
            return this;
        }
        return layoutNodeM2128r == layoutNode2 ? nodeCoordinator : layoutNodeM2128r.f3758U.f35996b;
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: c */
    public final long mo2175c() {
        return this.f3688c;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f3844g.f3746I.mo1462c0();
    }

    /* JADX INFO: renamed from: c1 */
    public final long m2176c1(long j10) {
        long j11 = this.f3837N;
        float fM17164c = C8941c.m17164c(j10);
        int i10 = C10020h.f50974c;
        long jM14932c = C7499b.m14932c(fM17164c - ((int) (j11 >> 32)), C8941c.m17165d(j10) - C10020h.m18625a(j11));
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        return interfaceC6140d0 != null ? interfaceC6140d0.mo2320j(true, jM14932c) : jM14932c;
    }

    /* JADX INFO: renamed from: d1 */
    public final long m2177d1() {
        return this.f3831H.mo1466z0(this.f3844g.f3748K.mo2138b());
    }

    /* JADX INFO: renamed from: e1 */
    public abstract InterfaceC0500b.c mo2178e1();

    /* JADX INFO: renamed from: f1 */
    public final InterfaceC0500b.c m2179f1(boolean z10) {
        InterfaceC0500b.c cVarMo2178e1;
        C6166u c6166u = this.f3844g.f3758U;
        if (c6166u.f35997c == this) {
            return c6166u.f35999e;
        }
        if (z10) {
            NodeCoordinator nodeCoordinator = this.f3846i;
            if (nodeCoordinator != null && (cVarMo2178e1 = nodeCoordinator.mo2178e1()) != null) {
                return cVarMo2178e1.f3330e;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f3846i;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.mo2178e1();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public final <T extends InterfaceC6137c> void m2180g1(final T t10, final InterfaceC0540c<T> interfaceC0540c, final long j10, final C6151j<T> c6151j, final boolean z10, final boolean z11) {
        if (t10 == null) {
            mo2183j1(interfaceC0540c, j10, c6151j, z10, z11);
            return;
        }
        InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$c<TT;>;JLi1/j<TT;>;ZZ)V */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                this.f3852b.m2180g1(C6168w.m12691a(t10, interfaceC0540c.mo2200a()), interfaceC0540c, j10, c6151j, z10, z11);
                return C9072e.f47360a;
            }
        };
        c6151j.getClass();
        c6151j.m12657f(t10, -1.0f, z11, interfaceC2041a);
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f3844g.f3746I.getDensity();
    }

    @Override // p127g1.InterfaceC5645i
    public final LayoutDirection getLayoutDirection() {
        return this.f3844g.f3747J;
    }

    /* JADX INFO: renamed from: h1 */
    public final <T extends InterfaceC6137c> void m2181h1(final T t10, final InterfaceC0540c<T> interfaceC0540c, final long j10, final C6151j<T> c6151j, final boolean z10, final boolean z11, final float f3) {
        if (t10 == null) {
            mo2183j1(interfaceC0540c, j10, c6151j, z10, z11);
        } else {
            c6151j.m12657f(t10, f3, z11, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$c<TT;>;JLi1/j<TT;>;ZZF)V */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    this.f3859b.m2181h1(C6168w.m12691a(t10, interfaceC0540c.mo2200a()), interfaceC0540c, j10, c6151j, z10, z11, f3);
                    return C9072e.f47360a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final <T extends InterfaceC6137c> void m2182i1(InterfaceC0540c<T> interfaceC0540c, long j10, C6151j<T> c6151j, boolean z10, boolean z11) {
        InterfaceC0500b.c cVarM2179f1;
        C5207g.m11111f(interfaceC0540c, "hitTestSource");
        C5207g.m11111f(c6151j, "hitTestResult");
        int iMo2200a = interfaceC0540c.mo2200a();
        boolean zM12694c = C6169x.m12694c(iMo2200a);
        InterfaceC0500b.c cVarMo2178e1 = mo2178e1();
        if (zM12694c || (cVarMo2178e1 = cVarMo2178e1.f3329d) != null) {
            cVarM2179f1 = m2179f1(zM12694c);
            while (true) {
                if (cVarM2179f1 != null && (cVarM2179f1.f3328c & iMo2200a) != 0) {
                    if ((cVarM2179f1.f3327b & iMo2200a) != 0) {
                        break;
                    } else if (cVarM2179f1 != cVarMo2178e1) {
                        cVarM2179f1 = cVarM2179f1.f3330e;
                    }
                }
                cVarM2179f1 = null;
                break;
            }
        } else {
            cVarM2179f1 = null;
            break;
        }
        boolean z12 = true;
        if (!m2199x1(j10)) {
            if (z10) {
                float fM2169X0 = m2169X0(j10, m2177d1());
                if ((Float.isInfinite(fM2169X0) || Float.isNaN(fM2169X0)) ? false : true) {
                    if (c6151j.f35968c != C9000b.m17249o(c6151j)) {
                        z12 = C0062b.m401u0(c6151j.m12656a(), C5212l.m11169n(fM2169X0, false)) > 0;
                    }
                    if (z12) {
                        m2181h1(cVarM2179f1, interfaceC0540c, j10, c6151j, z10, false, fM2169X0);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (cVarM2179f1 == null) {
            mo2183j1(interfaceC0540c, j10, c6151j, z10, z11);
            return;
        }
        float fM17164c = C8941c.m17164c(j10);
        float fM17165d = C8941c.m17165d(j10);
        if (fM17164c >= 0.0f && fM17165d >= 0.0f && fM17164c < ((float) mo2055e0()) && fM17165d < ((float) mo2054X())) {
            m2180g1(cVarM2179f1, interfaceC0540c, j10, c6151j, z10, z11);
            return;
        }
        float fM2169X1 = !z10 ? Float.POSITIVE_INFINITY : m2169X0(j10, m2177d1());
        if ((Float.isInfinite(fM2169X1) || Float.isNaN(fM2169X1)) ? false : true) {
            if (c6151j.f35968c != C9000b.m17249o(c6151j)) {
                z12 = C0062b.m401u0(c6151j.m12656a(), C5212l.m11169n(fM2169X1, z11)) > 0;
            }
            if (z12) {
                m2181h1(cVarM2179f1, interfaceC0540c, j10, c6151j, z10, z11, fM2169X1);
                return;
            }
        }
        m2196u1(cVarM2179f1, interfaceC0540c, j10, c6151j, z10, z11, fM2169X1);
    }

    /* JADX INFO: renamed from: j1 */
    public <T extends InterfaceC6137c> void mo2183j1(InterfaceC0540c<T> interfaceC0540c, long j10, C6151j<T> c6151j, boolean z10, boolean z11) {
        C5207g.m11111f(interfaceC0540c, "hitTestSource");
        C5207g.m11111f(c6151j, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.f3845h;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2182i1(interfaceC0540c, nodeCoordinator.m2176c1(j10), c6151j, z10, z11);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m2184k1() {
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f3846i;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2184k1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m2185l1() {
        if (this.f3843T != null && this.f3833J <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f3846i;
        if (nodeCoordinator != null) {
            return nodeCoordinator.m2185l1();
        }
        return false;
    }

    /* JADX INFO: renamed from: m1 */
    public final long m2186m1(InterfaceC5647k interfaceC5647k, long j10) {
        NodeCoordinator nodeCoordinator;
        C5207g.m11111f(interfaceC5647k, "sourceCoordinates");
        C5649m c5649m = interfaceC5647k instanceof C5649m ? (C5649m) interfaceC5647k : null;
        if (c5649m == null || (nodeCoordinator = c5649m.f34493a.f3905g) == null) {
            nodeCoordinator = (NodeCoordinator) interfaceC5647k;
        }
        NodeCoordinator nodeCoordinatorM2174b1 = m2174b1(nodeCoordinator);
        while (nodeCoordinator != nodeCoordinatorM2174b1) {
            j10 = nodeCoordinator.m2197v1(j10);
            nodeCoordinator = nodeCoordinator.f3846i;
            C5207g.m11108c(nodeCoordinator);
        }
        return m2167V0(nodeCoordinatorM2174b1, j10);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C9072e mo528n(InterfaceC9165q interfaceC9165q) {
        final InterfaceC9165q interfaceC9165q2 = interfaceC9165q;
        C5207g.m11111f(interfaceC9165q2, "canvas");
        LayoutNode layoutNode = this.f3844g;
        if (layoutNode.f3749L) {
            C0062b.m296O1(layoutNode).getSnapshotObserver().m2205b(this, f3826V, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    this.f3868b.m2172a1(interfaceC9165q2);
                    return C9072e.f47360a;
                }
            });
            this.f3842S = false;
        } else {
            this.f3842S = true;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX INFO: renamed from: n1 */
    public final void m2187n1(InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l, boolean z10) {
        boolean z11;
        boolean zMo2190q;
        InterfaceC2041a<C9072e> interfaceC2041a;
        InterfaceC6140d0 interfaceC6140d0;
        InterfaceC0549h interfaceC0549h;
        InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l2 = this.f3849l;
        LayoutNode layoutNode = this.f3844g;
        if (interfaceC2052l2 == interfaceC2052l && C5207g.m11106a(this.f3831H, layoutNode.f3746I) && this.f3832I == layoutNode.f3747J) {
            if (!z10) {
                z11 = false;
            }
            this.f3849l = interfaceC2052l;
            this.f3831H = layoutNode.f3746I;
            this.f3832I = layoutNode.f3747J;
            zMo2190q = mo2190q();
            interfaceC2041a = this.f3841R;
            if (zMo2190q || interfaceC2052l == null) {
                interfaceC6140d0 = this.f3843T;
                if (interfaceC6140d0 != null) {
                    interfaceC6140d0.mo2313c();
                    layoutNode.f3762Y = true;
                    ((NodeCoordinator$invalidateParentLayer$1) interfaceC2041a).mo807E();
                    if (mo2190q() && (interfaceC0549h = layoutNode.f3774h) != null) {
                        interfaceC0549h.mo2230h(layoutNode);
                    }
                }
                this.f3843T = null;
                this.f3842S = false;
            }
            if (this.f3843T != null) {
                if (z11) {
                    m2198w1();
                    return;
                }
                return;
            }
            InterfaceC6140d0 interfaceC6140d0Mo2235n = C0062b.m296O1(layoutNode).mo2235n(interfaceC2041a, this);
            interfaceC6140d0Mo2235n.mo2317g(this.f3688c);
            interfaceC6140d0Mo2235n.mo2318h(this.f3837N);
            this.f3843T = interfaceC6140d0Mo2235n;
            m2198w1();
            layoutNode.f3762Y = true;
            ((NodeCoordinator$invalidateParentLayer$1) interfaceC2041a).mo807E();
            return;
        }
        z11 = true;
        this.f3849l = interfaceC2052l;
        this.f3831H = layoutNode.f3746I;
        this.f3832I = layoutNode.f3747J;
        zMo2190q = mo2190q();
        interfaceC2041a = this.f3841R;
        if (zMo2190q) {
        }
        interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.mo2313c();
            layoutNode.f3762Y = true;
            ((NodeCoordinator$invalidateParentLayer$1) interfaceC2041a).mo807E();
            if (mo2190q()) {
                interfaceC0549h.mo2230h(layoutNode);
            }
        }
        this.f3843T = null;
        this.f3842S = false;
    }

    @Override // p166i1.InterfaceC6142e0
    /* JADX INFO: renamed from: o */
    public final boolean mo2089o() {
        return this.f3843T != null && mo2190q();
    }

    /* JADX INFO: renamed from: o1 */
    public void mo2188o1() {
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: p1 */
    public final void m2189p1() {
        boolean z10;
        InterfaceC0500b.c cVarMo2178e1;
        boolean zM12694c = C6169x.m12694c(BuildConfig.SDK_TRUNCATE_LENGTH);
        InterfaceC0500b.c cVarM2179f1 = m2179f1(zM12694c);
        if (cVarM2179f1 != null) {
            z10 = true;
            if (!((cVarM2179f1.f3326a.f3328c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0)) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            AbstractC0497b abstractC0497bM1888g = SnapshotKt.m1888g((AbstractC0497b) SnapshotKt.f3261b.m11437d(), null, false);
            try {
                AbstractC0497b abstractC0497bM1920i = abstractC0497bM1888g.m1920i();
                try {
                    if (!zM12694c) {
                        cVarMo2178e1 = mo2178e1().f3329d;
                        if (cVarMo2178e1 == null) {
                        }
                        C9072e c9072e = C9072e.f47360a;
                        AbstractC0497b.m1915o(abstractC0497bM1920i);
                        abstractC0497bM1888g.mo1866c();
                    }
                    cVarMo2178e1 = mo2178e1();
                    for (InterfaceC0500b.c cVarM2179f2 = m2179f1(zM12694c); cVarM2179f2 != null && (cVarM2179f2.f3328c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0; cVarM2179f2 = cVarM2179f2.f3330e) {
                        if ((cVarM2179f2.f3327b & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 && (cVarM2179f2 instanceof InterfaceC6160o)) {
                            ((InterfaceC6160o) cVarM2179f2).mo2085j(this.f3688c);
                        }
                        if (cVarM2179f2 == cVarMo2178e1) {
                            break;
                        }
                    }
                    C9072e c9072e2 = C9072e.f47360a;
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    abstractC0497bM1888g.mo1866c();
                } catch (Throwable th2) {
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    throw th2;
                }
            } catch (Throwable th3) {
                abstractC0497bM1888g.mo1866c();
                throw th3;
            }
        }
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: q */
    public final boolean mo2190q() {
        return !this.f3847j && this.f3844g.m2136z();
    }

    /* JADX INFO: renamed from: q1 */
    public final void m2191q1() {
        AbstractC0546e abstractC0546e = this.f3835L;
        boolean zM12694c = C6169x.m12694c(BuildConfig.SDK_TRUNCATE_LENGTH);
        if (abstractC0546e != null) {
            InterfaceC0500b.c cVarMo2178e1 = mo2178e1();
            if (zM12694c || (cVarMo2178e1 = cVarMo2178e1.f3329d) != null) {
                for (InterfaceC0500b.c cVarM2179f1 = m2179f1(zM12694c); cVarM2179f1 != null && (cVarM2179f1.f3328c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0; cVarM2179f1 = cVarM2179f1.f3330e) {
                    if ((cVarM2179f1.f3327b & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 && (cVarM2179f1 instanceof InterfaceC6160o)) {
                        ((InterfaceC6160o) cVarM2179f1).mo2086k(abstractC0546e.f3908j);
                    }
                    if (cVarM2179f1 == cVarMo2178e1) {
                        break;
                    }
                }
            }
        }
        InterfaceC0500b.c cVarMo2178e2 = mo2178e1();
        if (!zM12694c && (cVarMo2178e2 = cVarMo2178e2.f3329d) == null) {
            return;
        }
        for (InterfaceC0500b.c cVarM2179f2 = m2179f1(zM12694c); cVarM2179f2 != null && (cVarM2179f2.f3328c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0; cVarM2179f2 = cVarM2179f2.f3330e) {
            if ((cVarM2179f2.f3327b & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 && (cVarM2179f2 instanceof InterfaceC6160o)) {
                ((InterfaceC6160o) cVarM2179f2).mo2091q(this);
            }
            if (cVarM2179f2 == cVarMo2178e2) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void mo2192r1(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        NodeCoordinator nodeCoordinator = this.f3845h;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2170Y0(interfaceC9165q);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m2193s1(C8940b c8940b, boolean z10, boolean z11) {
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            if (this.f3848k) {
                if (z11) {
                    long jM2177d1 = m2177d1();
                    float fM17177d = C8944f.m17177d(jM2177d1) / 2.0f;
                    float fM17175b = C8944f.m17175b(jM2177d1) / 2.0f;
                    long j10 = this.f3688c;
                    c8940b.m17160a(-fM17177d, -fM17175b, ((int) (j10 >> 32)) + fM17177d, C10022j.m18628b(j10) + fM17175b);
                } else if (z10) {
                    long j11 = this.f3688c;
                    c8940b.m17160a(0.0f, 0.0f, (int) (j11 >> 32), C10022j.m18628b(j11));
                }
                if (c8940b.m17161b()) {
                    return;
                }
            }
            interfaceC6140d0.mo2312b(c8940b, false);
        }
        long j12 = this.f3837N;
        int i10 = C10020h.f50974c;
        float f3 = (int) (j12 >> 32);
        c8940b.f46884a += f3;
        c8940b.f46886c += f3;
        float fM18625a = C10020h.m18625a(j12);
        c8940b.f46885b += fM18625a;
        c8940b.f46887d += fM18625a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: t */
    public final C8942d mo2194t(InterfaceC5647k interfaceC5647k, boolean z10) {
        NodeCoordinator nodeCoordinator;
        C5207g.m11111f(interfaceC5647k, "sourceCoordinates");
        if (!mo2190q()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!interfaceC5647k.mo2190q()) {
            throw new IllegalStateException(("LayoutCoordinates " + interfaceC5647k + " is not attached!").toString());
        }
        C5649m c5649m = interfaceC5647k instanceof C5649m ? (C5649m) interfaceC5647k : null;
        if (c5649m == null || (nodeCoordinator = c5649m.f34493a.f3905g) == null) {
            nodeCoordinator = (NodeCoordinator) interfaceC5647k;
        }
        NodeCoordinator nodeCoordinatorM2174b1 = m2174b1(nodeCoordinator);
        C8940b c8940b = this.f3839P;
        if (c8940b == null) {
            c8940b = new C8940b();
            this.f3839P = c8940b;
        }
        c8940b.f46884a = 0.0f;
        c8940b.f46885b = 0.0f;
        c8940b.f46886c = (int) (interfaceC5647k.mo2175c() >> 32);
        c8940b.f46887d = C10022j.m18628b(interfaceC5647k.mo2175c());
        while (nodeCoordinator != nodeCoordinatorM2174b1) {
            nodeCoordinator.m2193s1(c8940b, z10, false);
            if (c8940b.m17161b()) {
                return C8942d.f46893e;
            }
            nodeCoordinator = nodeCoordinator.f3846i;
            C5207g.m11108c(nodeCoordinator);
        }
        m2166U0(nodeCoordinatorM2174b1, c8940b, z10);
        return new C8942d(c8940b.f46884a, c8940b.f46885b, c8940b.f46886c, c8940b.f46887d);
    }

    @Override // androidx.compose.p017ui.layout.AbstractC0526g
    /* JADX INFO: renamed from: t0 */
    public void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        m2187n1(interfaceC2052l, false);
        long j11 = this.f3837N;
        int i10 = C10020h.f50974c;
        if (!(j11 == j10)) {
            this.f3837N = j10;
            LayoutNode layoutNode = this.f3844g;
            layoutNode.f3759V.f3791i.m2145J0();
            InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
            if (interfaceC6140d0 != null) {
                interfaceC6140d0.mo2318h(j10);
            } else {
                NodeCoordinator nodeCoordinator = this.f3846i;
                if (nodeCoordinator != null) {
                    nodeCoordinator.m2184k1();
                }
            }
            AbstractC6164s.m12681S0(this);
            InterfaceC0549h interfaceC0549h = layoutNode.f3774h;
            if (interfaceC0549h != null) {
                interfaceC0549h.mo2230h(layoutNode);
            }
        }
        this.f3838O = f3;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m2195t1(InterfaceC5653q interfaceC5653q) {
        C5207g.m11111f(interfaceC5653q, "value");
        InterfaceC5653q interfaceC5653q2 = this.f3834K;
        if (interfaceC5653q != interfaceC5653q2) {
            this.f3834K = interfaceC5653q;
            LayoutNode layoutNode = this.f3844g;
            if (interfaceC5653q2 == null || interfaceC5653q.mo2039b() != interfaceC5653q2.mo2039b() || interfaceC5653q.mo2038a() != interfaceC5653q2.mo2038a()) {
                int iMo2039b = interfaceC5653q.mo2039b();
                int iMo2038a = interfaceC5653q.mo2038a();
                InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
                if (interfaceC6140d0 != null) {
                    interfaceC6140d0.mo2317g(C9000b.m17236a(iMo2039b, iMo2038a));
                } else {
                    NodeCoordinator nodeCoordinator = this.f3846i;
                    if (nodeCoordinator != null) {
                        nodeCoordinator.m2184k1();
                    }
                }
                InterfaceC0549h interfaceC0549h = layoutNode.f3774h;
                if (interfaceC0549h != null) {
                    interfaceC0549h.mo2230h(layoutNode);
                }
                m2051H0(C9000b.m17236a(iMo2039b, iMo2038a));
                C9000b.m17259y(this.f3688c);
                f3827W.getClass();
                boolean zM12694c = C6169x.m12694c(4);
                InterfaceC0500b.c cVarMo2178e1 = mo2178e1();
                if (zM12694c || (cVarMo2178e1 = cVarMo2178e1.f3329d) != null) {
                    for (InterfaceC0500b.c cVarM2179f1 = m2179f1(zM12694c); cVarM2179f1 != null && (cVarM2179f1.f3328c & 4) != 0; cVarM2179f1 = cVarM2179f1.f3330e) {
                        if ((cVarM2179f1.f3327b & 4) != 0 && (cVarM2179f1 instanceof InterfaceC6143f)) {
                            ((InterfaceC6143f) cVarM2179f1).mo2093t();
                        }
                        if (cVarM2179f1 == cVarMo2178e1) {
                            break;
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap = this.f3836M;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!interfaceC5653q.mo2040e().isEmpty())) && !C5207g.m11106a(interfaceC5653q.mo2040e(), this.f3836M)) {
                layoutNode.f3759V.f3791i.f3802l.m2074g();
                LinkedHashMap linkedHashMap2 = this.f3836M;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f3836M = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(interfaceC5653q.mo2040e());
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final <T extends InterfaceC6137c> void m2196u1(final T t10, final InterfaceC0540c<T> interfaceC0540c, final long j10, final C6151j<T> c6151j, final boolean z10, final boolean z11, final float f3) {
        if (t10 == null) {
            mo2183j1(interfaceC0540c, j10, c6151j, z10, z11);
            return;
        }
        if (!interfaceC0540c.mo2203d(t10)) {
            m2196u1(C6168w.m12691a(t10, interfaceC0540c.mo2200a()), interfaceC0540c, j10, c6151j, z10, z11, f3);
            return;
        }
        InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$c<TT;>;JLi1/j<TT;>;ZZF)V */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                this.f3870b.m2196u1(C6168w.m12691a(t10, interfaceC0540c.mo2200a()), interfaceC0540c, j10, c6151j, z10, z11, f3);
                return C9072e.f47360a;
            }
        };
        c6151j.getClass();
        if (c6151j.f35968c == C9000b.m17249o(c6151j)) {
            c6151j.m12657f(t10, f3, z11, interfaceC2041a);
            if (c6151j.f35968c + 1 == C9000b.m17249o(c6151j)) {
                c6151j.m12658g();
                return;
            }
            return;
        }
        long jM12656a = c6151j.m12656a();
        int i10 = c6151j.f35968c;
        c6151j.f35968c = C9000b.m17249o(c6151j);
        c6151j.m12657f(t10, f3, z11, interfaceC2041a);
        if (c6151j.f35968c + 1 < C9000b.m17249o(c6151j) && C0062b.m401u0(jM12656a, c6151j.m12656a()) > 0) {
            int i11 = c6151j.f35968c + 1;
            int i12 = i10 + 1;
            Object[] objArr = c6151j.f35966a;
            C9322j.m17673a0(i12, i11, c6151j.f35969d, objArr, objArr);
            long[] jArr = c6151j.f35967b;
            int i13 = c6151j.f35969d;
            C5207g.m11111f(jArr, "<this>");
            System.arraycopy(jArr, i11, jArr, i12, i13 - i11);
            c6151j.f35968c = ((c6151j.f35969d + i10) - c6151j.f35968c) - 1;
        }
        c6151j.m12658g();
        c6151j.f35968c = i10;
    }

    /* JADX INFO: renamed from: v1 */
    public final long m2197v1(long j10) {
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        if (interfaceC6140d0 != null) {
            j10 = interfaceC6140d0.mo2320j(false, j10);
        }
        long j11 = this.f3837N;
        float fM17164c = C8941c.m17164c(j10);
        int i10 = C10020h.f50974c;
        return C7499b.m14932c(fM17164c + ((int) (j11 >> 32)), C8941c.m17165d(j10) + C10020h.m18625a(j11));
    }

    /* JADX INFO: renamed from: w1 */
    public final void m2198w1() {
        NodeCoordinator nodeCoordinator;
        C9148h0 c9148h0;
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        C9148h0 c9148h1 = f3827W;
        LayoutNode layoutNode = this.f3844g;
        if (interfaceC6140d0 != null) {
            final InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l = this.f3849l;
            if (interfaceC2052l == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            c9148h1.f47660a = 1.0f;
            c9148h1.f47661b = 1.0f;
            c9148h1.f47662c = 1.0f;
            c9148h1.f47663d = 0.0f;
            c9148h1.f47664e = 0.0f;
            c9148h1.f47665f = 0.0f;
            long j10 = C9173y.f47709a;
            c9148h1.f47666g = j10;
            c9148h1.f47667h = j10;
            c9148h1.f47668i = 0.0f;
            c9148h1.f47669j = 0.0f;
            c9148h1.f47670k = 0.0f;
            c9148h1.f47671l = 8.0f;
            c9148h1.f47655H = C9162o0.f47689b;
            c9148h1.f47656I = C9144f0.f47650a;
            c9148h1.f47657J = false;
            c9148h1.f47658K = 0;
            int i10 = C8944f.f46908d;
            InterfaceC10015c interfaceC10015c = layoutNode.f3746I;
            C5207g.m11111f(interfaceC10015c, "<set-?>");
            c9148h1.f47659L = interfaceC10015c;
            C9000b.m17259y(this.f3688c);
            C0062b.m296O1(layoutNode).getSnapshotObserver().m2205b(this, f3825U, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    interfaceC2052l.mo528n(NodeCoordinator.f3827W);
                    return C9072e.f47360a;
                }
            });
            C6159n c6159n = this.f3840Q;
            if (c6159n == null) {
                c6159n = new C6159n();
                this.f3840Q = c6159n;
            }
            float f3 = c9148h1.f47660a;
            c6159n.f35981a = f3;
            float f10 = c9148h1.f47661b;
            c6159n.f35982b = f10;
            float f11 = c9148h1.f47663d;
            c6159n.f35983c = f11;
            float f12 = c9148h1.f47664e;
            c6159n.f35984d = f12;
            float f13 = c9148h1.f47668i;
            c6159n.f35985e = f13;
            float f14 = c9148h1.f47669j;
            c6159n.f35986f = f14;
            float f15 = c9148h1.f47670k;
            c6159n.f35987g = f15;
            float f16 = c9148h1.f47671l;
            c6159n.f35988h = f16;
            long j11 = c9148h1.f47655H;
            c6159n.f35989i = j11;
            c9148h0 = c9148h1;
            interfaceC6140d0.mo2316f(f3, f10, c9148h1.f47662c, f11, f12, c9148h1.f47665f, f13, f14, f15, f16, j11, c9148h1.f47656I, c9148h1.f47657J, c9148h1.f47666g, c9148h1.f47667h, c9148h1.f47658K, layoutNode.f3747J, layoutNode.f3746I);
            nodeCoordinator = this;
            nodeCoordinator.f3848k = c9148h0.f47657J;
        } else {
            nodeCoordinator = this;
            c9148h0 = c9148h1;
            if (!(nodeCoordinator.f3849l == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        nodeCoordinator.f3833J = c9148h0.f47662c;
        InterfaceC0549h interfaceC0549h = layoutNode.f3774h;
        if (interfaceC0549h != null) {
            interfaceC0549h.mo2230h(layoutNode);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX INFO: renamed from: x1 */
    public final boolean m2199x1(long j10) {
        boolean z10;
        float fM17164c = C8941c.m17164c(j10);
        if ((Float.isInfinite(fM17164c) || Float.isNaN(fM17164c)) ? false : true) {
            float fM17165d = C8941c.m17165d(j10);
            if ((Float.isInfinite(fM17165d) || Float.isNaN(fM17165d)) ? false : true) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        InterfaceC6140d0 interfaceC6140d0 = this.f3843T;
        return interfaceC6140d0 == null || !this.f3848k || interfaceC6140d0.mo2315e(j10);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.lang.Object] */
    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: y */
    public final Object mo2049y() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        InterfaceC0500b.c cVarMo2178e1 = mo2178e1();
        LayoutNode layoutNode = this.f3844g;
        C6166u c6166u = layoutNode.f3758U;
        if ((c6166u.f35999e.f3328c & 64) != 0) {
            InterfaceC10015c interfaceC10015c = layoutNode.f3746I;
            for (InterfaceC0500b.c cVar = c6166u.f35998d; cVar != null; cVar = cVar.f3329d) {
                if (cVar != cVarMo2178e1) {
                    if (((cVar.f3327b & 64) != 0) && (cVar instanceof InterfaceC6144f0)) {
                        ref$ObjectRef.f38127a = ((InterfaceC6144f0) cVar).mo2096y(interfaceC10015c, ref$ObjectRef.f38127a);
                    }
                }
            }
        }
        return ref$ObjectRef.f38127a;
    }
}
