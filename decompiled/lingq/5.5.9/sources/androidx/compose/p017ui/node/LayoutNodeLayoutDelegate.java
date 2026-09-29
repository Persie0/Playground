package androidx.compose.p017ui.node;

import ae.C0062b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import p105f0.C5458f;
import p127g1.InterfaceC5651o;
import p166i1.C6162q;
import p166i1.InterfaceC6133a;
import p385sf.C9000b;
import p387t0.InterfaceC9172x;
import p470x1.C10013a;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f3783a;

    /* JADX INFO: renamed from: b */
    public LayoutNode.LayoutState f3784b;

    /* JADX INFO: renamed from: c */
    public boolean f3785c;

    /* JADX INFO: renamed from: d */
    public boolean f3786d;

    /* JADX INFO: renamed from: e */
    public boolean f3787e;

    /* JADX INFO: renamed from: f */
    public boolean f3788f;

    /* JADX INFO: renamed from: g */
    public boolean f3789g;

    /* JADX INFO: renamed from: h */
    public int f3790h;

    /* JADX INFO: renamed from: i */
    public final MeasurePassDelegate f3791i;

    public final class MeasurePassDelegate extends AbstractC0526g implements InterfaceC5651o, InterfaceC6133a {

        /* JADX INFO: renamed from: e */
        public boolean f3795e;

        /* JADX INFO: renamed from: f */
        public boolean f3796f;

        /* JADX INFO: renamed from: h */
        public InterfaceC2052l<? super InterfaceC9172x, C9072e> f3798h;

        /* JADX INFO: renamed from: i */
        public float f3799i;

        /* JADX INFO: renamed from: k */
        public Object f3801k;

        /* JADX INFO: renamed from: g */
        public long f3797g = C10020h.f50973b;

        /* JADX INFO: renamed from: j */
        public boolean f3800j = true;

        /* JADX INFO: renamed from: l */
        public final C6162q f3802l = new C6162q(this);

        /* JADX INFO: renamed from: H */
        public final C5458f<InterfaceC5651o> f3792H = new C5458f<>(new InterfaceC5651o[16]);

        /* JADX INFO: renamed from: I */
        public boolean f3793I = true;

        /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$a */
        public /* synthetic */ class C0533a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3803a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f3804b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3803a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f3804b = iArr2;
            }
        }

        public MeasurePassDelegate() {
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: C */
        public final void mo2144C() {
            C5458f<LayoutNode> c5458fM2130t;
            int i10;
            C6162q c6162q = this.f3802l;
            c6162q.m2076i();
            final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            boolean z10 = layoutNodeLayoutDelegate.f3786d;
            final LayoutNode layoutNode = layoutNodeLayoutDelegate.f3783a;
            if (z10 && (i10 = (c5458fM2130t = layoutNode.m2130t()).f34019c) > 0) {
                LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
                int i11 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArr[i11];
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.f3759V;
                    if (layoutNodeLayoutDelegate2.f3785c && layoutNode2.f3753P == LayoutNode.UsageByParent.InMeasureBlock) {
                        MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate2.f3791i;
                        if (layoutNode2.m2110F(measurePassDelegate.f3795e ? new C10013a(measurePassDelegate.f3689d) : null)) {
                            layoutNode.m2114J(false);
                        }
                    }
                    i11++;
                } while (i11 < i10);
            }
            if (layoutNodeLayoutDelegate.f3787e || (!mo2152f().f35994f && layoutNodeLayoutDelegate.f3786d)) {
                layoutNodeLayoutDelegate.f3786d = false;
                LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f3784b;
                layoutNodeLayoutDelegate.f3784b = LayoutNode.LayoutState.LayingOut;
                OwnerSnapshotObserver snapshotObserver = C0062b.m296O1(layoutNode).getSnapshotObserver();
                InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = layoutNodeLayoutDelegate;
                        LayoutNode layoutNode3 = layoutNodeLayoutDelegate3.f3783a;
                        int i12 = 0;
                        layoutNode3.f3752O = 0;
                        C5458f<LayoutNode> c5458fM2130t2 = layoutNode3.m2130t();
                        int i13 = c5458fM2130t2.f34019c;
                        if (i13 > 0) {
                            LayoutNode[] layoutNodeArr2 = c5458fM2130t2.f34017a;
                            int i14 = 0;
                            do {
                                LayoutNode layoutNode4 = layoutNodeArr2[i14];
                                layoutNode4.f3751N = layoutNode4.f3750M;
                                layoutNode4.f3750M = Integer.MAX_VALUE;
                                if (layoutNode4.f3753P == LayoutNode.UsageByParent.InLayoutBlock) {
                                    layoutNode4.f3753P = LayoutNode.UsageByParent.NotUsed;
                                }
                                i14++;
                            } while (i14 < i13);
                        }
                        C05341 c05341 = new InterfaceC2052l<InterfaceC6133a, C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1.1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC6133a interfaceC6133a) {
                                InterfaceC6133a interfaceC6133a2 = interfaceC6133a;
                                C5207g.m11111f(interfaceC6133a2, "it");
                                interfaceC6133a2.mo2151e().getClass();
                                return C9072e.f47360a;
                            }
                        };
                        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate2 = this;
                        measurePassDelegate2.mo2153g(c05341);
                        layoutNode.f3758U.f35996b.mo2162P0().mo2041f();
                        LayoutNode layoutNode5 = layoutNodeLayoutDelegate3.f3783a;
                        C5458f<LayoutNode> c5458fM2130t3 = layoutNode5.m2130t();
                        int i15 = c5458fM2130t3.f34019c;
                        if (i15 > 0) {
                            LayoutNode[] layoutNodeArr3 = c5458fM2130t3.f34017a;
                            do {
                                LayoutNode layoutNode6 = layoutNodeArr3[i12];
                                if (layoutNode6.f3751N != layoutNode6.f3750M) {
                                    layoutNode5.m2109E();
                                    layoutNode5.m2132v();
                                    if (layoutNode6.f3750M == Integer.MAX_VALUE) {
                                        layoutNode6.m2107C();
                                    }
                                }
                                i12++;
                            } while (i12 < i15);
                        }
                        measurePassDelegate2.mo2153g(new InterfaceC2052l<InterfaceC6133a, C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1.2
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC6133a interfaceC6133a) {
                                InterfaceC6133a interfaceC6133a2 = interfaceC6133a;
                                C5207g.m11111f(interfaceC6133a2, "it");
                                interfaceC6133a2.mo2151e().f3705e = interfaceC6133a2.mo2151e().f3704d;
                                return C9072e.f47360a;
                            }
                        });
                        return C9072e.f47360a;
                    }
                };
                snapshotObserver.getClass();
                snapshotObserver.m2205b(layoutNode, snapshotObserver.f3882d, interfaceC2041a);
                layoutNodeLayoutDelegate.f3784b = layoutState;
                if (mo2152f().f35994f && layoutNodeLayoutDelegate.f3789g) {
                    requestLayout();
                }
                layoutNodeLayoutDelegate.f3787e = false;
            }
            if (c6162q.f3704d) {
                c6162q.f3705e = true;
            }
            if (c6162q.f3702b && c6162q.m2073f()) {
                c6162q.m2075h();
            }
        }

        /* JADX INFO: renamed from: J0 */
        public final void m2145J0() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3790h > 0) {
                List<LayoutNode> listM2127q = layoutNodeLayoutDelegate.f3783a.m2127q();
                int size = listM2127q.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LayoutNode layoutNode = listM2127q.get(i10);
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.f3759V;
                    if (layoutNodeLayoutDelegate2.f3789g && !layoutNodeLayoutDelegate2.f3786d) {
                        layoutNode.m2113I(false);
                    }
                    layoutNodeLayoutDelegate2.f3791i.m2145J0();
                }
            }
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: K */
        public final boolean mo2146K() {
            return LayoutNodeLayoutDelegate.this.f3783a.f3749L;
        }

        /* JADX INFO: renamed from: K0 */
        public final void m2147K0() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3783a;
            LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
            layoutNode.m2114J(false);
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f3783a;
            LayoutNode layoutNodeM2128r = layoutNode2.m2128r();
            if (layoutNodeM2128r != null && layoutNode2.f3755R == LayoutNode.UsageByParent.NotUsed) {
                int i10 = C0533a.f3803a[layoutNodeM2128r.f3759V.f3784b.ordinal()];
                if (i10 != 1) {
                    usageByParent = i10 != 2 ? layoutNodeM2128r.f3755R : LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                C5207g.m11111f(usageByParent, "<set-?>");
                layoutNode2.f3755R = usageByParent;
            }
        }

        /* JADX INFO: renamed from: L0 */
        public final void m2148L0(final long j10, final float f3, final InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
            this.f3797g = j10;
            this.f3799i = f3;
            this.f3798h = interfaceC2052l;
            this.f3796f = true;
            this.f3802l.f3707g = false;
            final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.f3789g) {
                layoutNodeLayoutDelegate.f3789g = false;
                layoutNodeLayoutDelegate.m2142c(layoutNodeLayoutDelegate.f3790h - 1);
            }
            OwnerSnapshotObserver snapshotObserver = C0062b.m296O1(layoutNodeLayoutDelegate.f3783a).getSnapshotObserver();
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3783a;
            InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                    long j11 = j10;
                    float f10 = f3;
                    InterfaceC2052l<InterfaceC9172x, C9072e> interfaceC2052l2 = interfaceC2052l;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                    if (interfaceC2052l2 == null) {
                        NodeCoordinator nodeCoordinatorM2141a = layoutNodeLayoutDelegate2.m2141a();
                        c10587a.getClass();
                        AbstractC0526g.a.m2058d(nodeCoordinatorM2141a, j11, f10);
                    } else {
                        NodeCoordinator nodeCoordinatorM2141a2 = layoutNodeLayoutDelegate2.m2141a();
                        c10587a.getClass();
                        AbstractC0526g.a.m2062h(nodeCoordinatorM2141a2, j11, f10, interfaceC2052l2);
                    }
                    return C9072e.f47360a;
                }
            };
            snapshotObserver.getClass();
            C5207g.m11111f(layoutNode, "node");
            snapshotObserver.m2205b(layoutNode, snapshotObserver.f3883e, interfaceC2041a);
        }

        /* JADX INFO: renamed from: M0 */
        public final boolean m2149M0(final long j10) {
            final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            InterfaceC0549h interfaceC0549hM296O1 = C0062b.m296O1(layoutNodeLayoutDelegate.f3783a);
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3783a;
            LayoutNode layoutNodeM2128r = layoutNode.m2128r();
            boolean z10 = true;
            layoutNode.f3757T = layoutNode.f3757T || (layoutNodeM2128r != null && layoutNodeM2128r.f3757T);
            if (!layoutNode.f3759V.f3785c && C10013a.m18597b(this.f3689d, j10)) {
                interfaceC0549hM296O1.mo2231i(layoutNode);
                layoutNode.m2116M();
                return false;
            }
            this.f3802l.f3706f = false;
            mo2153g(new InterfaceC2052l<InterfaceC6133a, C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC6133a interfaceC6133a) {
                    InterfaceC6133a interfaceC6133a2 = interfaceC6133a;
                    C5207g.m11111f(interfaceC6133a2, "it");
                    interfaceC6133a2.mo2151e().f3703c = false;
                    return C9072e.f47360a;
                }
            });
            this.f3795e = true;
            long j11 = layoutNodeLayoutDelegate.m2141a().f3688c;
            m2052I0(j10);
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.f3784b;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
            if (!(layoutState == layoutState2)) {
                throw new IllegalStateException("layout state is not idle before measure starts".toString());
            }
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            layoutNodeLayoutDelegate.f3784b = layoutState3;
            layoutNodeLayoutDelegate.f3785c = false;
            OwnerSnapshotObserver snapshotObserver = C0062b.m296O1(layoutNode).getSnapshotObserver();
            InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    layoutNodeLayoutDelegate.m2141a().mo2048w(j10);
                    return C9072e.f47360a;
                }
            };
            snapshotObserver.getClass();
            snapshotObserver.m2205b(layoutNode, snapshotObserver.f3881c, interfaceC2041a);
            if (layoutNodeLayoutDelegate.f3784b == layoutState3) {
                layoutNodeLayoutDelegate.f3786d = true;
                layoutNodeLayoutDelegate.f3787e = true;
                layoutNodeLayoutDelegate.f3784b = layoutState2;
            }
            if (C10022j.m18627a(layoutNodeLayoutDelegate.m2141a().f3688c, j11) && layoutNodeLayoutDelegate.m2141a().f3686a == this.f3686a && layoutNodeLayoutDelegate.m2141a().f3687b == this.f3687b) {
                z10 = false;
            }
            m2051H0(C9000b.m17236a(layoutNodeLayoutDelegate.m2141a().f3686a, layoutNodeLayoutDelegate.m2141a().f3687b));
            return z10;
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: Q */
        public final void mo2150Q() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3783a;
            LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
            layoutNode.m2114J(false);
        }

        @Override // p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: R */
        public final int mo2044R(int i10) {
            m2147K0();
            return LayoutNodeLayoutDelegate.this.m2141a().mo2044R(i10);
        }

        @Override // androidx.compose.p017ui.layout.AbstractC0526g
        /* JADX INFO: renamed from: X */
        public final int mo2054X() {
            return LayoutNodeLayoutDelegate.this.m2141a().mo2054X();
        }

        @Override // p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: a */
        public final int mo2045a(int i10) {
            m2147K0();
            return LayoutNodeLayoutDelegate.this.m2141a().mo2045a(i10);
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: e */
        public final AlignmentLines mo2151e() {
            return this.f3802l;
        }

        @Override // androidx.compose.p017ui.layout.AbstractC0526g
        /* JADX INFO: renamed from: e0 */
        public final int mo2055e0() {
            return LayoutNodeLayoutDelegate.this.m2141a().mo2055e0();
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: f */
        public final C0543b mo2152f() {
            return LayoutNodeLayoutDelegate.this.f3783a.f3758U.f35996b;
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: g */
        public final void mo2153g(InterfaceC2052l<? super InterfaceC6133a, C9072e> interfaceC2052l) {
            C5207g.m11111f(interfaceC2052l, "block");
            List<LayoutNode> listM2127q = LayoutNodeLayoutDelegate.this.f3783a.m2127q();
            int size = listM2127q.size();
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC2052l.mo528n(listM2127q.get(i10).f3759V.f3791i);
            }
        }

        @Override // p166i1.InterfaceC6133a
        /* JADX INFO: renamed from: j */
        public final InterfaceC6133a mo2154j() {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            LayoutNode layoutNodeM2128r = LayoutNodeLayoutDelegate.this.f3783a.m2128r();
            if (layoutNodeM2128r == null || (layoutNodeLayoutDelegate = layoutNodeM2128r.f3759V) == null) {
                return null;
            }
            return layoutNodeLayoutDelegate.f3791i;
        }

        @Override // p166i1.InterfaceC6133a
        public final void requestLayout() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f3783a;
            LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
            layoutNode.m2113I(false);
        }

        @Override // p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: s */
        public final int mo2046s(int i10) {
            m2147K0();
            return LayoutNodeLayoutDelegate.this.m2141a().mo2046s(i10);
        }

        @Override // androidx.compose.p017ui.layout.AbstractC0526g
        /* JADX INFO: renamed from: t0 */
        public final void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
            long j11 = this.f3797g;
            int i10 = C10020h.f50974c;
            if (!(j10 == j11)) {
                m2145J0();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (LayoutNodeLayoutDelegate.m2140b(layoutNodeLayoutDelegate.f3783a)) {
                AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                layoutNodeLayoutDelegate.getClass();
                C5207g.m11108c(null);
                AbstractC0526g.a.m2057c(c10587a, null, (int) (j10 >> 32), C10020h.m18625a(j10));
            }
            layoutNodeLayoutDelegate.f3784b = LayoutNode.LayoutState.LayingOut;
            m2148L0(j10, f3, interfaceC2052l);
            layoutNodeLayoutDelegate.f3784b = LayoutNode.LayoutState.Idle;
        }

        @Override // p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: u */
        public final int mo2047u(int i10) {
            m2147K0();
            return LayoutNodeLayoutDelegate.this.m2141a().mo2047u(i10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5651o
        /* JADX INFO: renamed from: w */
        public final AbstractC0526g mo2048w(long j10) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.f3783a;
            LayoutNode.UsageByParent usageByParent2 = layoutNode.f3755R;
            LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.NotUsed;
            if (usageByParent2 == usageByParent3) {
                layoutNode.m2121j();
            }
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.f3783a;
            if (LayoutNodeLayoutDelegate.m2140b(layoutNode2)) {
                this.f3795e = true;
                m2052I0(j10);
                layoutNode2.getClass();
                C5207g.m11111f(usageByParent3, "<set-?>");
                layoutNode2.f3754Q = usageByParent3;
                layoutNodeLayoutDelegate.getClass();
                C5207g.m11108c(null);
                throw null;
            }
            LayoutNode layoutNodeM2128r = layoutNode2.m2128r();
            if (layoutNodeM2128r != null) {
                boolean z10 = layoutNode2.f3753P == usageByParent3 || layoutNode2.f3757T;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeM2128r.f3759V;
                if (!z10) {
                    throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode2.f3753P + ". Parent state " + layoutNodeLayoutDelegate2.f3784b + '.').toString());
                }
                int i10 = C0533a.f3803a[layoutNodeLayoutDelegate2.f3784b.ordinal()];
                if (i10 == 1) {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeLayoutDelegate2.f3784b);
                    }
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                }
                C5207g.m11111f(usageByParent, "<set-?>");
                layoutNode2.f3753P = usageByParent;
            } else {
                C5207g.m11111f(usageByParent3, "<set-?>");
                layoutNode2.f3753P = usageByParent3;
            }
            m2149M0(j10);
            return this;
        }

        @Override // p127g1.InterfaceC5644h
        /* JADX INFO: renamed from: y */
        public final Object mo2049y() {
            return this.f3801k;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$a */
    public final class C0537a extends AbstractC0526g implements InterfaceC5651o, InterfaceC6133a {

        /* JADX INFO: renamed from: e */
        public boolean f3816e;

        /* JADX INFO: renamed from: f */
        public Object f3817f;

        /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3818a;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f3818a = iArr2;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: J0 */
        public final void m2155J0() {
            throw null;
        }

        @Override // androidx.compose.p017ui.layout.AbstractC0526g
        /* JADX INFO: renamed from: t0 */
        public final void mo2056t0(long j10, float f3, InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5651o
        /* JADX INFO: renamed from: w */
        public final AbstractC0526g mo2048w(long j10) {
            throw null;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f3783a = layoutNode;
        this.f3784b = LayoutNode.LayoutState.Idle;
        this.f3791i = new MeasurePassDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2140b(LayoutNode layoutNode) {
        layoutNode.getClass();
        return C5207g.m11106a(null, layoutNode);
    }

    /* JADX INFO: renamed from: a */
    public final NodeCoordinator m2141a() {
        return this.f3783a.f3758U.f35997c;
    }

    /* JADX INFO: renamed from: c */
    public final void m2142c(int i10) {
        int i11 = this.f3790h;
        this.f3790h = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode layoutNodeM2128r = this.f3783a.m2128r();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNodeM2128r != null ? layoutNodeM2128r.f3759V : null;
            if (layoutNodeLayoutDelegate != null) {
                if (i10 == 0) {
                    layoutNodeLayoutDelegate.m2142c(layoutNodeLayoutDelegate.f3790h - 1);
                    return;
                }
                layoutNodeLayoutDelegate.m2142c(layoutNodeLayoutDelegate.f3790h + 1);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2143d() {
        boolean z10;
        LayoutNode layoutNodeM2128r;
        MeasurePassDelegate measurePassDelegate = this.f3791i;
        if (measurePassDelegate.f3800j) {
            measurePassDelegate.f3800j = false;
            Object obj = measurePassDelegate.f3801k;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            z10 = !C5207g.m11106a(obj, layoutNodeLayoutDelegate.m2141a().mo2049y());
            measurePassDelegate.f3801k = layoutNodeLayoutDelegate.m2141a().mo2049y();
        } else {
            z10 = false;
        }
        LayoutNode layoutNode = this.f3783a;
        if (!z10 || (layoutNodeM2128r = layoutNode.m2128r()) == null) {
            return;
        }
        layoutNodeM2128r.m2114J(false);
    }
}
