package androidx.compose.p017ui.node;

import ae.C0062b;
import android.graphics.Paint;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import cm.InterfaceC2052l;
import dm.C5207g;
import p105f0.C5458f;
import p127g1.AbstractC5636a;
import p127g1.InterfaceC5652p;
import p166i1.C6151j;
import p166i1.C6157m;
import p166i1.C6162q;
import p166i1.C6166u;
import p166i1.C6169x;
import p166i1.InterfaceC6137c;
import p166i1.InterfaceC6146g0;
import p387t0.C9147h;
import p387t0.C9149i;
import p387t0.C9169u;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.node.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0543b extends NodeCoordinator {

    /* JADX INFO: renamed from: b0 */
    public static final C9147h f3894b0;

    /* JADX INFO: renamed from: a0 */
    public final a f3895a0;

    /* JADX INFO: renamed from: androidx.compose.ui.node.b$a */
    public static final class a extends InterfaceC0500b.c {
        public final String toString() {
            return "<tail>";
        }
    }

    static {
        C9147h c9147hM17467a = C9149i.m17467a();
        c9147hM17467a.m17444f(C9169u.f47700c);
        Paint paint = c9147hM17467a.f47651a;
        C5207g.m11111f(paint, "<this>");
        paint.setStrokeWidth(1.0f);
        c9147hM17467a.m17449k(1);
        f3894b0 = c9147hM17467a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543b(LayoutNode layoutNode) {
        super(layoutNode);
        C5207g.m11111f(layoutNode, "layoutNode");
        a aVar = new a();
        this.f3895a0 = aVar;
        aVar.f3332g = this;
    }

    @Override // p166i1.AbstractC6164s
    /* JADX INFO: renamed from: J0 */
    public final int mo2208J0(AbstractC5636a abstractC5636a) {
        C5207g.m11111f(abstractC5636a, "alignmentLine");
        AbstractC0546e abstractC0546e = this.f3835L;
        if (abstractC0546e != null) {
            return abstractC0546e.mo2208J0(abstractC5636a);
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f3844g.f3759V.f3791i;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f3784b;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        C6162q c6162q = measurePassDelegate.f3802l;
        if (layoutState == layoutState2) {
            c6162q.f3706f = true;
            if (c6162q.f3702b) {
                layoutNodeLayoutDelegate.f3786d = true;
                layoutNodeLayoutDelegate.f3787e = true;
            }
        } else {
            c6162q.f3707g = true;
        }
        measurePassDelegate.mo2152f().f35994f = true;
        measurePassDelegate.mo2144C();
        measurePassDelegate.mo2152f().f35994f = false;
        Integer num = (Integer) c6162q.f3709i.get(abstractC5636a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: R */
    public final int mo2044R(int i10) {
        C6157m c6157m = this.f3844g.f3745H;
        InterfaceC5652p interfaceC5652pM12667a = c6157m.m12667a();
        LayoutNode layoutNode = c6157m.f35979a;
        return interfaceC5652pM12667a.mo1330c(layoutNode.f3758U.f35997c, layoutNode.m2126p(), i10);
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: a */
    public final int mo2045a(int i10) {
        C6157m c6157m = this.f3844g.f3745H;
        InterfaceC5652p interfaceC5652pM12667a = c6157m.m12667a();
        LayoutNode layoutNode = c6157m.f35979a;
        return interfaceC5652pM12667a.mo1332e(layoutNode.f3758U.f35997c, layoutNode.m2126p(), i10);
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: e1 */
    public final InterfaceC0500b.c mo2178e1() {
        return this.f3895a0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: j1 */
    public final <T extends InterfaceC6137c> void mo2183j1(NodeCoordinator.InterfaceC0540c<T> interfaceC0540c, long j10, C6151j<T> c6151j, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        LayoutNode[] layoutNodeArr;
        boolean z14;
        boolean z15;
        C5207g.m11111f(interfaceC0540c, "hitTestSource");
        C5207g.m11111f(c6151j, "hitTestResult");
        LayoutNode layoutNode = this.f3844g;
        if (!interfaceC0540c.mo2202c(layoutNode)) {
            z12 = z11;
            z13 = false;
        } else if (m2199x1(j10)) {
            z12 = z11;
            z13 = true;
        } else if (z10) {
            float fM2169X0 = m2169X0(j10, m2177d1());
            if ((Float.isInfinite(fM2169X0) || Float.isNaN(fM2169X0)) ? false : true) {
                z13 = true;
                z12 = false;
            } else {
                z12 = z11;
                z13 = false;
            }
        } else {
            z12 = z11;
            z13 = false;
        }
        if (z13) {
            int i10 = c6151j.f35968c;
            C5458f<LayoutNode> c5458fM2129s = layoutNode.m2129s();
            int i11 = c5458fM2129s.f34019c;
            if (i11 > 0) {
                LayoutNode[] layoutNodeArr2 = c5458fM2129s.f34017a;
                int i12 = i11 - 1;
                while (true) {
                    LayoutNode layoutNode2 = layoutNodeArr2[i12];
                    if (layoutNode2.f3749L) {
                        layoutNodeArr = layoutNodeArr2;
                        interfaceC0540c.mo2201b(layoutNode2, j10, c6151j, z10, z12);
                        long jM12656a = c6151j.m12656a();
                        if (Float.intBitsToFloat((int) (jM12656a >> 32)) < 0.0f && C0062b.m414x1(jM12656a)) {
                            InterfaceC0500b.c cVarM2179f1 = layoutNode2.f3758U.f35997c.m2179f1(C6169x.m12694c(16));
                            if (cVarM2179f1 != null) {
                                InterfaceC0500b.c cVar = cVarM2179f1.f3326a;
                                if (!cVar.f3335j) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                if ((cVar.f3328c & 16) != 0) {
                                    for (InterfaceC0500b.c cVar2 = cVar.f3330e; cVar2 != null; cVar2 = cVar2.f3330e) {
                                        if ((cVar2.f3327b & 16) != 0 && (cVar2 instanceof InterfaceC6146g0)) {
                                            ((InterfaceC6146g0) cVar2).mo2097z();
                                        }
                                    }
                                }
                            }
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        z14 = z15 ? false : true;
                        if (z14 && (i12 = i12 - 1) >= 0) {
                            layoutNodeArr2 = layoutNodeArr;
                        }
                    } else {
                        layoutNodeArr = layoutNodeArr2;
                    }
                    if (z14) {
                    }
                }
            }
            c6151j.f35968c = i10;
        }
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator
    /* JADX INFO: renamed from: r1 */
    public final void mo2192r1(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        LayoutNode layoutNode = this.f3844g;
        InterfaceC0549h interfaceC0549hM296O1 = C0062b.m296O1(layoutNode);
        C5458f<LayoutNode> c5458fM2129s = layoutNode.m2129s();
        int i10 = c5458fM2129s.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2129s.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.f3749L) {
                    layoutNode2.m2125n(interfaceC9165q);
                }
                i11++;
            } while (i11 < i10);
        }
        if (interfaceC0549hM296O1.getShowLayoutBounds()) {
            m2171Z0(interfaceC9165q, f3894b0);
        }
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: s */
    public final int mo2046s(int i10) {
        C6157m c6157m = this.f3844g.f3745H;
        InterfaceC5652p interfaceC5652pM12667a = c6157m.m12667a();
        LayoutNode layoutNode = c6157m.f35979a;
        return interfaceC5652pM12667a.mo1329b(layoutNode.f3758U.f35997c, layoutNode.m2126p(), i10);
    }

    @Override // androidx.compose.p017ui.node.NodeCoordinator, androidx.compose.p017ui.layout.AbstractC0526g
    /* JADX INFO: renamed from: t0 */
    public final void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        super.mo2056t0(j10, f3, interfaceC2052l);
        if (this.f35993e) {
            return;
        }
        m2191q1();
        LayoutNode layoutNode = this.f3844g;
        LayoutNode layoutNodeM2128r = layoutNode.m2128r();
        C6166u c6166u = layoutNode.f3758U;
        C0543b c0543b = c6166u.f35996b;
        float f10 = c0543b.f3838O;
        NodeCoordinator nodeCoordinator = c6166u.f35997c;
        while (nodeCoordinator != c0543b) {
            C5207g.m11109d(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0545d c0545d = (C0545d) nodeCoordinator;
            f10 += c0545d.f3838O;
            nodeCoordinator = c0545d.f3845h;
        }
        if (!(f10 == layoutNode.f3760W)) {
            layoutNode.f3760W = f10;
            if (layoutNodeM2128r != null) {
                layoutNodeM2128r.m2109E();
            }
            if (layoutNodeM2128r != null) {
                layoutNodeM2128r.m2132v();
            }
        }
        if (!layoutNode.f3749L) {
            if (layoutNodeM2128r != null) {
                layoutNodeM2128r.m2132v();
            }
            layoutNode.m2106B();
        }
        if (layoutNodeM2128r != null) {
            if (!layoutNode.f3767b0 && layoutNodeM2128r.f3759V.f3784b == LayoutNode.LayoutState.LayingOut) {
                if (!(layoutNode.f3750M == Integer.MAX_VALUE)) {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
                int i10 = layoutNodeM2128r.f3752O;
                layoutNode.f3750M = i10;
                layoutNodeM2128r.f3752O = i10 + 1;
            }
            layoutNode.f3759V.f3791i.mo2144C();
        }
        layoutNode.f3750M = 0;
        layoutNode.f3759V.f3791i.mo2144C();
    }

    @Override // p127g1.InterfaceC5644h
    /* JADX INFO: renamed from: u */
    public final int mo2047u(int i10) {
        C6157m c6157m = this.f3844g.f3745H;
        InterfaceC5652p interfaceC5652pM12667a = c6157m.m12667a();
        LayoutNode layoutNode = c6157m.f35979a;
        return interfaceC5652pM12667a.mo1331d(layoutNode.f3758U.f35997c, layoutNode.m2126p(), i10);
    }

    @Override // p127g1.InterfaceC5651o
    /* JADX INFO: renamed from: w */
    public final AbstractC0526g mo2048w(long j10) {
        m2052I0(j10);
        LayoutNode layoutNode = this.f3844g;
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                layoutNode2.getClass();
                C5207g.m11111f(usageByParent, "<set-?>");
                layoutNode2.f3753P = usageByParent;
                i11++;
            } while (i11 < i10);
        }
        m2195t1(layoutNode.f3778l.mo1328a(this, layoutNode.m2126p(), j10));
        m2189p1();
        return this;
    }
}
