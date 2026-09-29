package androidx.compose.p017ui.node;

import ae.C0062b;
import androidx.appcompat.widget.C0322j;
import androidx.compose.p017ui.CombinedModifier;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import p081e0.InterfaceC5302d;
import p105f0.C5458f;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p166i1.C6151j;
import p166i1.C6157m;
import p166i1.C6161p;
import p166i1.C6162q;
import p166i1.C6166u;
import p166i1.C6167v;
import p166i1.C6169x;
import p166i1.InterfaceC6140d0;
import p166i1.InterfaceC6142e0;
import p166i1.InterfaceC6146g0;
import p166i1.InterfaceC6160o;
import p210k1.C6574l;
import p338qd.C8573r0;
import p387t0.InterfaceC9165q;
import p470x1.C10013a;
import p470x1.C10016d;
import p470x1.C10019g;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode implements InterfaceC5302d, InterfaceC6142e0, ComposeUiNode, InterfaceC0549h.a {

    /* JADX INFO: renamed from: d0 */
    public static final C0530b f3741d0 = new C0530b();

    /* JADX INFO: renamed from: e0 */
    public static final InterfaceC2041a<LayoutNode> f3742e0 = new InterfaceC2041a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final LayoutNode mo807E() {
            return new LayoutNode(3, false, 0);
        }
    };

    /* JADX INFO: renamed from: f0 */
    public static final C0529a f3743f0 = new C0529a();

    /* JADX INFO: renamed from: g0 */
    public static final C6161p f3744g0 = new C6161p(0);

    /* JADX INFO: renamed from: H */
    public final C6157m f3745H;

    /* JADX INFO: renamed from: I */
    public InterfaceC10015c f3746I;

    /* JADX INFO: renamed from: J */
    public LayoutDirection f3747J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0647n1 f3748K;

    /* JADX INFO: renamed from: L */
    public boolean f3749L;

    /* JADX INFO: renamed from: M */
    public int f3750M;

    /* JADX INFO: renamed from: N */
    public int f3751N;

    /* JADX INFO: renamed from: O */
    public int f3752O;

    /* JADX INFO: renamed from: P */
    public UsageByParent f3753P;

    /* JADX INFO: renamed from: Q */
    public UsageByParent f3754Q;

    /* JADX INFO: renamed from: R */
    public UsageByParent f3755R;

    /* JADX INFO: renamed from: S */
    public UsageByParent f3756S;

    /* JADX INFO: renamed from: T */
    public boolean f3757T;

    /* JADX INFO: renamed from: U */
    public final C6166u f3758U;

    /* JADX INFO: renamed from: V */
    public final LayoutNodeLayoutDelegate f3759V;

    /* JADX INFO: renamed from: W */
    public float f3760W;

    /* JADX INFO: renamed from: X */
    public NodeCoordinator f3761X;

    /* JADX INFO: renamed from: Y */
    public boolean f3762Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC0500b f3763Z;

    /* JADX INFO: renamed from: a */
    public final boolean f3764a;

    /* JADX INFO: renamed from: a0 */
    public boolean f3765a0;

    /* JADX INFO: renamed from: b */
    public final int f3766b;

    /* JADX INFO: renamed from: b0 */
    public boolean f3767b0;

    /* JADX INFO: renamed from: c */
    public int f3768c;

    /* JADX INFO: renamed from: c0 */
    public boolean f3769c0;

    /* JADX INFO: renamed from: d */
    public final C0322j f3770d;

    /* JADX INFO: renamed from: e */
    public C5458f<LayoutNode> f3771e;

    /* JADX INFO: renamed from: f */
    public boolean f3772f;

    /* JADX INFO: renamed from: g */
    public LayoutNode f3773g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0549h f3774h;

    /* JADX INFO: renamed from: i */
    public int f3775i;

    /* JADX INFO: renamed from: j */
    public final C5458f<LayoutNode> f3776j;

    /* JADX INFO: renamed from: k */
    public boolean f3777k;

    /* JADX INFO: renamed from: l */
    public InterfaceC5652p f3778l;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$a */
    public static final class C0529a implements InterfaceC0647n1 {
        @Override // androidx.compose.p017ui.platform.InterfaceC0647n1
        /* JADX INFO: renamed from: a */
        public final long mo2137a() {
            return 400L;
        }

        @Override // androidx.compose.p017ui.platform.InterfaceC0647n1
        /* JADX INFO: renamed from: b */
        public final long mo2138b() {
            int i10 = C10019g.f50972c;
            return C10019g.f50970a;
        }

        @Override // androidx.compose.p017ui.platform.InterfaceC0647n1
        /* JADX INFO: renamed from: c */
        public final float mo2139c() {
            return 16.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$b */
    public static final class C0530b extends AbstractC0531c {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: a */
        public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List list, long j10) {
            C5207g.m11111f(interfaceC0524e, "$this$measure");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$c */
    public static abstract class AbstractC0531c implements InterfaceC5652p {

        /* JADX INFO: renamed from: a */
        public final String f3781a = "Undefined intrinsics block and it is required";

        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: b */
        public final int mo1329b(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            throw new IllegalStateException(this.f3781a.toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: c */
        public final int mo1330c(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            throw new IllegalStateException(this.f3781a.toString());
        }

        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: d */
        public final int mo1331d(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            throw new IllegalStateException(this.f3781a.toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: e */
        public final int mo1332e(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            throw new IllegalStateException(this.f3781a.toString());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$d */
    public /* synthetic */ class C0532d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3782a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3782a = iArr;
        }
    }

    public LayoutNode() {
        this(3, false, 0);
    }

    public LayoutNode(int i10, boolean z10) {
        this.f3764a = z10;
        this.f3766b = i10;
        this.f3770d = new C0322j(new C5458f(new LayoutNode[16]), new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3780b.f3759V;
                layoutNodeLayoutDelegate.f3791i.f3793I = true;
                layoutNodeLayoutDelegate.getClass();
                return C9072e.f47360a;
            }
        });
        this.f3776j = new C5458f<>(new LayoutNode[16]);
        this.f3777k = true;
        this.f3778l = f3741d0;
        this.f3745H = new C6157m(this);
        this.f3746I = new C10016d(1.0f, 1.0f);
        this.f3747J = LayoutDirection.Ltr;
        this.f3748K = f3743f0;
        this.f3750M = Integer.MAX_VALUE;
        this.f3751N = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f3753P = usageByParent;
        this.f3754Q = usageByParent;
        this.f3755R = usageByParent;
        this.f3756S = usageByParent;
        this.f3758U = new C6166u(this);
        this.f3759V = new LayoutNodeLayoutDelegate(this);
        this.f3762Y = true;
        this.f3763Z = InterfaceC0500b.a.f3325a;
    }

    public LayoutNode(int i10, boolean z10, int i11) {
        this((i10 & 2) != 0 ? C6574l.f37394c.addAndGet(1) : 0, (i10 & 1) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: K */
    public static void m2104K(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "it");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        if (C0532d.f3782a[layoutNodeLayoutDelegate.f3784b.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNodeLayoutDelegate.f3784b);
        }
        if (layoutNodeLayoutDelegate.f3785c) {
            layoutNode.m2114J(true);
            return;
        }
        if (layoutNodeLayoutDelegate.f3786d) {
            layoutNode.m2113I(true);
            return;
        }
        layoutNodeLayoutDelegate.getClass();
        if (layoutNodeLayoutDelegate.f3788f) {
            layoutNode.m2111G(true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final Boolean m2105A() {
        this.f3759V.getClass();
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m2106B() {
        boolean z10 = this.f3749L;
        this.f3749L = true;
        if (!z10) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3759V;
            if (layoutNodeLayoutDelegate.f3785c) {
                m2114J(true);
            } else {
                layoutNodeLayoutDelegate.getClass();
            }
        }
        C6166u c6166u = this.f3758U;
        NodeCoordinator nodeCoordinator = c6166u.f35996b.f3845h;
        for (NodeCoordinator nodeCoordinator2 = c6166u.f35997c; !C5207g.m11106a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f3845h) {
            if (nodeCoordinator2.f3842S) {
                nodeCoordinator2.m2184k1();
            }
        }
        C5458f<LayoutNode> c5458fM2130t = m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.f3750M != Integer.MAX_VALUE) {
                    layoutNode.m2106B();
                    m2104K(layoutNode);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2107C() {
        if (this.f3749L) {
            int i10 = 0;
            this.f3749L = false;
            C5458f<LayoutNode> c5458fM2130t = m2130t();
            int i11 = c5458fM2130t.f34019c;
            if (i11 > 0) {
                LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
                do {
                    layoutNodeArr[i10].m2107C();
                    i10++;
                } while (i10 < i11);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2108D(LayoutNode layoutNode) {
        if (layoutNode.f3759V.f3790h > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3759V;
            layoutNodeLayoutDelegate.m2142c(layoutNodeLayoutDelegate.f3790h - 1);
        }
        if (this.f3774h != null) {
            layoutNode.m2124m();
        }
        layoutNode.f3773g = null;
        layoutNode.f3758U.f35997c.f3846i = null;
        if (layoutNode.f3764a) {
            this.f3768c--;
            C5458f c5458f = (C5458f) layoutNode.f3770d.f1238b;
            int i10 = c5458f.f34019c;
            if (i10 > 0) {
                Object[] objArr = c5458f.f34017a;
                int i11 = 0;
                do {
                    ((LayoutNode) objArr[i11]).f3758U.f35997c.f3846i = null;
                    i11++;
                } while (i11 < i10);
            }
        }
        m2135y();
        m2109E();
    }

    /* JADX INFO: renamed from: E */
    public final void m2109E() {
        if (this.f3764a) {
            LayoutNode layoutNodeM2128r = m2128r();
            if (layoutNodeM2128r != null) {
                layoutNodeM2128r.m2109E();
            }
        } else {
            this.f3777k = true;
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2110F(C10013a c10013a) {
        if (c10013a == null) {
            return false;
        }
        if (this.f3755R == UsageByParent.NotUsed) {
            m2121j();
        }
        return this.f3759V.f3791i.m2149M0(c10013a.f50963a);
    }

    /* JADX INFO: renamed from: G */
    public final void m2111G(boolean z10) {
        InterfaceC0549h interfaceC0549h;
        if (this.f3764a || (interfaceC0549h = this.f3774h) == null) {
            return;
        }
        interfaceC0549h.mo2227d(this, true, z10);
    }

    /* JADX INFO: renamed from: H */
    public final void m2112H(boolean z10) {
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    /* JADX INFO: renamed from: I */
    public final void m2113I(boolean z10) {
        InterfaceC0549h interfaceC0549h;
        if (!this.f3764a && (interfaceC0549h = this.f3774h) != null) {
            int i10 = InterfaceC0549h.f3926o;
            interfaceC0549h.mo2227d(this, false, z10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J */
    public final void m2114J(boolean z10) {
        LayoutNode layoutNodeM2128r;
        if (!this.f3764a) {
            InterfaceC0549h interfaceC0549h = this.f3774h;
            if (interfaceC0549h == null) {
                return;
            }
            int i10 = InterfaceC0549h.f3926o;
            interfaceC0549h.mo2226a(this, false, z10);
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            LayoutNode layoutNodeM2128r2 = layoutNodeLayoutDelegate.f3783a.m2128r();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.f3783a.f3755R;
            if (layoutNodeM2128r2 != null && usageByParent != UsageByParent.NotUsed) {
                while (layoutNodeM2128r2.f3755R == usageByParent && (layoutNodeM2128r = layoutNodeM2128r2.m2128r()) != null) {
                    layoutNodeM2128r2 = layoutNodeM2128r;
                }
                int i11 = LayoutNodeLayoutDelegate.MeasurePassDelegate.C0533a.f3804b[usageByParent.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    }
                    layoutNodeM2128r2.m2113I(z10);
                    return;
                }
                layoutNodeM2128r2.m2114J(z10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public final void m2115L() {
        C6166u c6166u = this.f3758U;
        C5458f<InterfaceC0500b.b> c5458f = c6166u.f36000f;
        if (c5458f == null) {
            return;
        }
        int i10 = c5458f.f34019c;
        InterfaceC0500b.c cVar = c6166u.f35998d.f3329d;
        while (true) {
            i10--;
            if (cVar == null || i10 < 0) {
                return;
            }
            boolean z10 = cVar.f3335j;
            if (z10) {
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                cVar.mo1933H();
                cVar.m1930E();
            }
            cVar = cVar.f3329d;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2116M() {
        C5458f<LayoutNode> c5458fM2130t = m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                UsageByParent usageByParent = layoutNode.f3756S;
                layoutNode.f3755R = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.m2116M();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2117N() {
        if (this.f3768c > 0 && this.f3772f) {
            int i10 = 0;
            this.f3772f = false;
            C5458f<LayoutNode> c5458f = this.f3771e;
            if (c5458f == null) {
                c5458f = new C5458f<>(new LayoutNode[16]);
                this.f3771e = c5458f;
            }
            c5458f.m11691h();
            C5458f c5458f2 = (C5458f) this.f3770d.f1238b;
            int i11 = c5458f2.f34019c;
            if (i11 > 0) {
                Object[] objArr = c5458f2.f34017a;
                do {
                    LayoutNode layoutNode = (LayoutNode) objArr[i10];
                    if (layoutNode.f3764a) {
                        c5458f.m11688e(c5458f.f34019c, layoutNode.m2130t());
                    } else {
                        c5458f.m11687b(layoutNode);
                    }
                    i10++;
                } while (i10 < i11);
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3759V;
            layoutNodeLayoutDelegate.f3791i.f3793I = true;
            layoutNodeLayoutDelegate.getClass();
        }
    }

    @Override // p081e0.InterfaceC5302d
    /* JADX INFO: renamed from: a */
    public final void mo2118a() {
        C6166u c6166u = this.f3758U;
        NodeCoordinator nodeCoordinator = c6166u.f35996b.f3845h;
        for (NodeCoordinator nodeCoordinator2 = c6166u.f35997c; !C5207g.m11106a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f3845h) {
            nodeCoordinator2.f3847j = true;
            if (nodeCoordinator2.f3843T != null) {
                nodeCoordinator2.m2187n1(null, false);
            }
        }
    }

    @Override // androidx.compose.p017ui.node.ComposeUiNode
    /* JADX INFO: renamed from: b */
    public final void mo2099b(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "value");
        if (this.f3747J != layoutDirection) {
            this.f3747J = layoutDirection;
            m2134x();
            LayoutNode layoutNodeM2128r = m2128r();
            if (layoutNodeM2128r != null) {
                layoutNodeM2128r.m2132v();
            }
            m2133w();
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h.a
    /* JADX INFO: renamed from: c */
    public final void mo2098c() {
        InterfaceC0500b.c cVar;
        C6166u c6166u = this.f3758U;
        C0543b c0543b = c6166u.f35996b;
        boolean zM12694c = C6169x.m12694c(BuildConfig.SDK_TRUNCATE_LENGTH);
        if (zM12694c) {
            cVar = c0543b.f3895a0;
        } else {
            cVar = c0543b.f3895a0.f3329d;
            if (cVar == null) {
                return;
            }
        }
        InterfaceC2052l<NodeCoordinator, C9072e> interfaceC2052l = NodeCoordinator.f3825U;
        for (InterfaceC0500b.c cVarM2179f1 = c0543b.m2179f1(zM12694c); cVarM2179f1 != null && (cVarM2179f1.f3328c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0; cVarM2179f1 = cVarM2179f1.f3330e) {
            if ((cVarM2179f1.f3327b & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 && (cVarM2179f1 instanceof InterfaceC6160o)) {
                ((InterfaceC6160o) cVarM2179f1).mo2091q(c6166u.f35996b);
            }
            if (cVarM2179f1 == cVar) {
                break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // androidx.compose.p017ui.node.ComposeUiNode
    /* JADX INFO: renamed from: d */
    public final void mo2100d(InterfaceC0500b interfaceC0500b) {
        boolean z10;
        boolean z11;
        C0545d c0545d;
        C5207g.m11111f(interfaceC0500b, "value");
        if (!(!this.f3764a || this.f3763Z == InterfaceC0500b.a.f3325a)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.f3763Z = interfaceC0500b;
        C6166u c6166u = this.f3758U;
        c6166u.getClass();
        InterfaceC0500b.c cVar = c6166u.f35999e;
        C6167v.a aVar = C6167v.f36008a;
        if (!(cVar != aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        cVar.f3329d = aVar;
        aVar.f3330e = cVar;
        c6166u.f35999e = aVar;
        C5458f<InterfaceC0500b.b> c5458f = c6166u.f36000f;
        if (c5458f == null) {
            c5458f = new C5458f<>(new InterfaceC0500b.b[0]);
        }
        C5458f<InterfaceC0500b.b> c5458f2 = c5458f;
        C5458f<InterfaceC0500b.b> c5458f3 = c6166u.f36001g;
        if (c5458f3 == null) {
            c5458f3 = new C5458f<>(new InterfaceC0500b.b[16]);
        }
        final C5458f<InterfaceC0500b.b> c5458f4 = c5458f3;
        C5458f c5458f5 = new C5458f(new InterfaceC0500b[c5458f4.f34019c]);
        c5458f5.m11687b(interfaceC0500b);
        while (c5458f5.m11695l()) {
            InterfaceC0500b interfaceC0500b2 = (InterfaceC0500b) c5458f5.m11697n(c5458f5.f34019c - 1);
            if (interfaceC0500b2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) interfaceC0500b2;
                c5458f5.m11687b(combinedModifier.f3319b);
                c5458f5.m11687b(combinedModifier.f3318a);
            } else if (interfaceC0500b2 instanceof InterfaceC0500b.b) {
                c5458f4.m11687b(interfaceC0500b2);
            } else {
                interfaceC0500b2.mo1926t(new InterfaceC2052l<InterfaceC0500b.b, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(InterfaceC0500b.b bVar) {
                        InterfaceC0500b.b bVar2 = bVar;
                        C5207g.m11111f(bVar2, "it");
                        c5458f4.m11687b(bVar2);
                        return Boolean.TRUE;
                    }
                });
            }
        }
        int i10 = c5458f4.f34019c;
        int i11 = c5458f2.f34019c;
        C0543b.a aVar2 = c6166u.f35998d;
        if (i10 == i11) {
            InterfaceC0500b.c cVarM12685e = aVar2.f3329d;
            int i12 = i11 - 1;
            int i13 = 0;
            z10 = false;
            while (cVarM12685e != null && i12 >= 0) {
                InterfaceC0500b.b bVar = c5458f2.f34017a[i12];
                InterfaceC0500b.b bVar2 = c5458f4.f34017a[i12];
                int iM12690a = C6167v.m12690a(bVar, bVar2);
                if (iM12690a == 0) {
                    i12++;
                    cVarM12685e = cVarM12685e.f3330e;
                    break;
                }
                if (iM12690a == 1) {
                    cVarM12685e = C6166u.m12685e(bVar, bVar2, cVarM12685e);
                }
                if (!cVarM12685e.f3335j) {
                    z10 = true;
                }
                i13 |= cVarM12685e.f3327b;
                cVarM12685e.f3328c = i13;
                cVarM12685e = cVarM12685e.f3329d;
                i12--;
            }
            InterfaceC0500b.c cVar2 = cVarM12685e;
            int i14 = i12;
            if (i14 > 0) {
                if (!(cVar2 != null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c6166u.m12687d(c5458f2, i14, c5458f4, i14, cVar2);
                z11 = true;
                z10 = true;
            } else {
                z11 = false;
            }
        } else {
            if (i11 == 0) {
                InterfaceC0500b.c cVarM12683b = aVar2;
                int i15 = 0;
                for (int i16 = i10 - 1; i16 >= 0; i16--) {
                    cVarM12683b = C6166u.m12683b(c5458f4.f34017a[i16], cVarM12683b);
                    i15 |= cVarM12683b.f3327b;
                    cVarM12683b.f3328c = i15;
                }
            } else if (i10 == 0) {
                int i17 = i11 - 1;
                InterfaceC0500b.c cVar3 = aVar2.f3329d;
                while (cVar3 != null && i17 >= 0) {
                    InterfaceC0500b.c cVar4 = cVar3.f3329d;
                    C6166u.m12684c(cVar3);
                    i17--;
                    cVar3 = cVar4;
                }
                z10 = false;
                z11 = true;
            } else {
                c6166u.m12687d(c5458f2, i11, c5458f4, i10, aVar2);
            }
            z11 = true;
            z10 = true;
        }
        c6166u.f36000f = c5458f4;
        c5458f2.m11691h();
        c6166u.f36001g = c5458f2;
        InterfaceC0500b.c cVar5 = c6166u.f35999e;
        C6167v.a aVar3 = C6167v.f36008a;
        if (!(cVar5 == aVar3)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar6 = aVar3.f3330e;
        if (cVar6 == null) {
            cVar6 = aVar2;
        }
        c6166u.f35999e = cVar6;
        cVar6.f3329d = null;
        aVar3.f3330e = null;
        if (!(cVar6 != aVar3)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C0543b c0543b = c6166u.f35996b;
        LayoutNode layoutNode = c6166u.f35995a;
        if (z11) {
            NodeCoordinator nodeCoordinator = c0543b;
            for (InterfaceC0500b.c cVar7 = aVar2.f3329d; cVar7 != null; cVar7 = cVar7.f3329d) {
                if (((cVar7.f3327b & 2) != 0) && (cVar7 instanceof InterfaceC0544c)) {
                    NodeCoordinator nodeCoordinator2 = cVar7.f3332g;
                    if (nodeCoordinator2 != null) {
                        c0545d = (C0545d) nodeCoordinator2;
                        InterfaceC0544c interfaceC0544c = c0545d.f3897a0;
                        c0545d.f3897a0 = (InterfaceC0544c) cVar7;
                        if (interfaceC0544c != cVar7) {
                            c0545d.mo2188o1();
                        }
                    } else {
                        c0545d = new C0545d(layoutNode, (InterfaceC0544c) cVar7);
                        cVar7.f3332g = c0545d;
                    }
                    nodeCoordinator.f3846i = c0545d;
                    c0545d.f3845h = nodeCoordinator;
                    nodeCoordinator = c0545d;
                } else {
                    cVar7.f3332g = nodeCoordinator;
                }
            }
            LayoutNode layoutNodeM2128r = layoutNode.m2128r();
            nodeCoordinator.f3846i = layoutNodeM2128r != null ? layoutNodeM2128r.f3758U.f35996b : null;
            c6166u.f35997c = nodeCoordinator;
        }
        if (z10 && layoutNode.m2136z()) {
            c6166u.m12686a(true);
        }
        NodeCoordinator nodeCoordinator3 = c0543b.f3845h;
        for (NodeCoordinator nodeCoordinator4 = c6166u.f35997c; !C5207g.m11106a(nodeCoordinator4, nodeCoordinator3) && nodeCoordinator4 != null; nodeCoordinator4 = nodeCoordinator4.f3845h) {
            nodeCoordinator4.f3835L = null;
        }
        this.f3759V.m2143d();
    }

    @Override // androidx.compose.p017ui.node.ComposeUiNode
    /* JADX INFO: renamed from: e */
    public final void mo2101e(InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC10015c, "value");
        if (C5207g.m11106a(this.f3746I, interfaceC10015c)) {
            return;
        }
        this.f3746I = interfaceC10015c;
        m2134x();
        LayoutNode layoutNodeM2128r = m2128r();
        if (layoutNodeM2128r != null) {
            layoutNodeM2128r.m2132v();
        }
        m2133w();
    }

    @Override // androidx.compose.p017ui.node.ComposeUiNode
    /* JADX INFO: renamed from: f */
    public final void mo2102f(InterfaceC5652p interfaceC5652p) {
        C5207g.m11111f(interfaceC5652p, "value");
        if (C5207g.m11106a(this.f3778l, interfaceC5652p)) {
            return;
        }
        this.f3778l = interfaceC5652p;
        C6157m c6157m = this.f3745H;
        c6157m.getClass();
        c6157m.f35980b.setValue(interfaceC5652p);
        m2134x();
    }

    @Override // androidx.compose.p017ui.node.ComposeUiNode
    /* JADX INFO: renamed from: g */
    public final void mo2103g(InterfaceC0647n1 interfaceC0647n1) {
        C5207g.m11111f(interfaceC0647n1, "<set-?>");
        this.f3748K = interfaceC0647n1;
    }

    @Override // p081e0.InterfaceC5302d
    /* JADX INFO: renamed from: h */
    public final void mo2119h() {
        if (this.f3769c0) {
            this.f3769c0 = false;
        } else {
            m2115L();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public final void m2120i(InterfaceC0549h interfaceC0549h) {
        C5207g.m11111f(interfaceC0549h, "owner");
        if (!(this.f3774h == null)) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + m2123l(0)).toString());
        }
        LayoutNode layoutNode = this.f3773g;
        if (!(layoutNode == null || C5207g.m11106a(layoutNode.f3774h, interfaceC0549h))) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(interfaceC0549h);
            sb2.append(") than the parent's owner(");
            LayoutNode layoutNodeM2128r = m2128r();
            sb2.append(layoutNodeM2128r != null ? layoutNodeM2128r.f3774h : null);
            sb2.append("). This tree: ");
            sb2.append(m2123l(0));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode2 = this.f3773g;
            sb2.append(layoutNode2 != null ? layoutNode2.m2123l(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        LayoutNode layoutNodeM2128r2 = m2128r();
        if (layoutNodeM2128r2 == null) {
            this.f3749L = true;
        }
        this.f3774h = interfaceC0549h;
        this.f3775i = (layoutNodeM2128r2 != null ? layoutNodeM2128r2.f3775i : -1) + 1;
        if (C8573r0.m16750q0(this) != null) {
            interfaceC0549h.mo2234m();
        }
        interfaceC0549h.mo2238r(this);
        boolean zM11106a = C5207g.m11106a(null, null);
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3759V;
        C6166u c6166u = this.f3758U;
        if (!zM11106a) {
            layoutNodeLayoutDelegate.getClass();
            NodeCoordinator nodeCoordinator = c6166u.f35996b.f3845h;
            for (NodeCoordinator nodeCoordinator2 = c6166u.f35997c; !C5207g.m11106a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f3845h) {
                nodeCoordinator2.f3835L = null;
            }
        }
        c6166u.m12686a(false);
        C5458f c5458f = (C5458f) this.f3770d.f1238b;
        int i10 = c5458f.f34019c;
        if (i10 > 0) {
            Object[] objArr = c5458f.f34017a;
            int i11 = 0;
            do {
                ((LayoutNode) objArr[i11]).m2120i(interfaceC0549h);
                i11++;
            } while (i11 < i10);
        }
        m2134x();
        if (layoutNodeM2128r2 != null) {
            layoutNodeM2128r2.m2134x();
        }
        NodeCoordinator nodeCoordinator3 = c6166u.f35996b.f3845h;
        for (NodeCoordinator nodeCoordinator4 = c6166u.f35997c; !C5207g.m11106a(nodeCoordinator4, nodeCoordinator3) && nodeCoordinator4 != null; nodeCoordinator4 = nodeCoordinator4.f3845h) {
            nodeCoordinator4.m2187n1(nodeCoordinator4.f3849l, false);
        }
        layoutNodeLayoutDelegate.m2143d();
        InterfaceC0500b.c cVar = c6166u.f35999e;
        if ((cVar.f3328c & 7168) != 0) {
            while (cVar != null) {
                int i12 = cVar.f3327b;
                if (((i12 & 4096) != 0) | ((i12 & 1024) != 0) | ((i12 & 2048) != 0)) {
                    C6169x.m12692a(cVar, 1);
                }
                cVar = cVar.f3330e;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2121j() {
        this.f3756S = this.f3755R;
        this.f3755R = UsageByParent.NotUsed;
        C5458f<LayoutNode> c5458fM2130t = m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.f3755R != UsageByParent.NotUsed) {
                    layoutNode.m2121j();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2122k() {
        this.f3756S = this.f3755R;
        this.f3755R = UsageByParent.NotUsed;
        C5458f<LayoutNode> c5458fM2130t = m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.f3755R == UsageByParent.InLayoutBlock) {
                    layoutNode.m2122k();
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m2123l(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        C5458f<LayoutNode> c5458fM2130t = m2130t();
        int i12 = c5458fM2130t.f34019c;
        if (i12 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i13 = 0;
            do {
                sb2.append(layoutNodeArr[i13].m2123l(i10 + 1));
                i13++;
            } while (i13 < i12);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "tree.toString()");
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: m */
    public final void m2124m() {
        InterfaceC0549h interfaceC0549h = this.f3774h;
        if (interfaceC0549h == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeM2128r = m2128r();
            sb2.append(layoutNodeM2128r != null ? layoutNodeM2128r.m2123l(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        C6166u c6166u = this.f3758U;
        boolean z10 = (c6166u.f35999e.f3328c & 1024) != 0;
        InterfaceC0500b.c cVar = c6166u.f35998d;
        if (z10) {
            for (InterfaceC0500b.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f3329d) {
                if (((cVar2.f3327b & 1024) != 0) && (cVar2 instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) cVar2;
                    if (focusTargetModifierNode.f3392k.isFocused()) {
                        C0062b.m296O1(this).getFocusOwner().mo1959f(true, false);
                        focusTargetModifierNode.m1973K();
                    }
                }
            }
        }
        LayoutNode layoutNodeM2128r2 = m2128r();
        if (layoutNodeM2128r2 != null) {
            layoutNodeM2128r2.m2132v();
            layoutNodeM2128r2.m2134x();
            this.f3753P = UsageByParent.NotUsed;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3759V;
        C6162q c6162q = layoutNodeLayoutDelegate.f3791i.f3802l;
        c6162q.f3702b = true;
        c6162q.f3703c = false;
        c6162q.f3705e = false;
        c6162q.f3704d = false;
        c6162q.f3706f = false;
        c6162q.f3707g = false;
        c6162q.f3708h = null;
        layoutNodeLayoutDelegate.getClass();
        if (C8573r0.m16750q0(this) != null) {
            interfaceC0549h.mo2234m();
        }
        while (cVar != null) {
            if (cVar.f3335j) {
                cVar.m1930E();
            }
            cVar = cVar.f3329d;
        }
        interfaceC0549h.mo2232j(this);
        this.f3774h = null;
        this.f3775i = 0;
        C5458f c5458f = (C5458f) this.f3770d.f1238b;
        int i10 = c5458f.f34019c;
        if (i10 > 0) {
            Object[] objArr = c5458f.f34017a;
            int i11 = 0;
            do {
                ((LayoutNode) objArr[i11]).m2124m();
                i11++;
            } while (i11 < i10);
        }
        this.f3750M = Integer.MAX_VALUE;
        this.f3751N = Integer.MAX_VALUE;
        this.f3749L = false;
    }

    /* JADX INFO: renamed from: n */
    public final void m2125n(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        this.f3758U.f35997c.m2170Y0(interfaceC9165q);
    }

    @Override // p166i1.InterfaceC6142e0
    /* JADX INFO: renamed from: o */
    public final boolean mo2089o() {
        return m2136z();
    }

    /* JADX INFO: renamed from: p */
    public final List<InterfaceC5651o> m2126p() {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f3759V.f3791i;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        layoutNodeLayoutDelegate.f3783a.m2117N();
        boolean z10 = measurePassDelegate.f3793I;
        C5458f<InterfaceC5651o> c5458f = measurePassDelegate.f3792H;
        if (!z10) {
            return c5458f.m11690g();
        }
        C8573r0.m16768x(layoutNodeLayoutDelegate.f3783a, c5458f, new InterfaceC2052l<LayoutNode, InterfaceC5651o>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5651o mo528n(LayoutNode layoutNode) {
                LayoutNode layoutNode2 = layoutNode;
                C5207g.m11111f(layoutNode2, "it");
                return layoutNode2.f3759V.f3791i;
            }
        });
        measurePassDelegate.f3793I = false;
        return c5458f.m11690g();
    }

    /* JADX INFO: renamed from: q */
    public final List<LayoutNode> m2127q() {
        return m2130t().m11690g();
    }

    /* JADX INFO: renamed from: r */
    public final LayoutNode m2128r() {
        LayoutNode layoutNode = this.f3773g;
        boolean z10 = false;
        if (layoutNode != null && layoutNode.f3764a) {
            z10 = true;
        }
        if (!z10) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.m2128r();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C5458f<LayoutNode> m2129s() {
        boolean z10 = this.f3777k;
        C5458f<LayoutNode> c5458f = this.f3776j;
        if (z10) {
            c5458f.m11691h();
            c5458f.m11688e(c5458f.f34019c, m2130t());
            C6161p c6161p = f3744g0;
            C5207g.m11111f(c6161p, "comparator");
            LayoutNode[] layoutNodeArr = c5458f.f34017a;
            int i10 = c5458f.f34019c;
            C5207g.m11111f(layoutNodeArr, "<this>");
            Arrays.sort(layoutNodeArr, 0, i10, c6161p);
            this.f3777k = false;
        }
        return c5458f;
    }

    /* JADX INFO: renamed from: t */
    public final C5458f<LayoutNode> m2130t() {
        m2117N();
        if (this.f3768c == 0) {
            return (C5458f) this.f3770d.f1238b;
        }
        C5458f<LayoutNode> c5458f = this.f3771e;
        C5207g.m11108c(c5458f);
        return c5458f;
    }

    public final String toString() {
        return C8573r0.m16718c1(this) + " children: " + m2127q().size() + " measurePolicy: " + this.f3778l;
    }

    /* JADX INFO: renamed from: u */
    public final void m2131u(long j10, C6151j<InterfaceC6146g0> c6151j, boolean z10, boolean z11) {
        C5207g.m11111f(c6151j, "hitTestResult");
        C6166u c6166u = this.f3758U;
        c6166u.f35997c.m2182i1(NodeCoordinator.f3829Y, c6166u.f35997c.m2176c1(j10), c6151j, z10, z11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v */
    public final void m2132v() {
        if (this.f3762Y) {
            C6166u c6166u = this.f3758U;
            NodeCoordinator nodeCoordinator = c6166u.f35996b;
            NodeCoordinator nodeCoordinator2 = c6166u.f35997c.f3846i;
            this.f3761X = null;
            while (!C5207g.m11106a(nodeCoordinator, nodeCoordinator2)) {
                if ((nodeCoordinator != null ? nodeCoordinator.f3843T : null) != null) {
                    this.f3761X = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.f3846i : null;
            }
        }
        NodeCoordinator nodeCoordinator3 = this.f3761X;
        if (nodeCoordinator3 != null && nodeCoordinator3.f3843T == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.m2184k1();
            return;
        }
        LayoutNode layoutNodeM2128r = m2128r();
        if (layoutNodeM2128r != null) {
            layoutNodeM2128r.m2132v();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2133w() {
        C6166u c6166u = this.f3758U;
        NodeCoordinator nodeCoordinator = c6166u.f35997c;
        C0543b c0543b = c6166u.f35996b;
        while (nodeCoordinator != c0543b) {
            C5207g.m11109d(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0545d c0545d = (C0545d) nodeCoordinator;
            InterfaceC6140d0 interfaceC6140d0 = c0545d.f3843T;
            if (interfaceC6140d0 != null) {
                interfaceC6140d0.invalidate();
            }
            nodeCoordinator = c0545d.f3845h;
        }
        InterfaceC6140d0 interfaceC6140d1 = c6166u.f35996b.f3843T;
        if (interfaceC6140d1 != null) {
            interfaceC6140d1.invalidate();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2134x() {
        m2114J(false);
    }

    /* JADX INFO: renamed from: y */
    public final void m2135y() {
        LayoutNode layoutNodeM2128r;
        if (this.f3768c > 0) {
            this.f3772f = true;
        }
        if (this.f3764a && (layoutNodeM2128r = m2128r()) != null) {
            layoutNodeM2128r.f3772f = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2136z() {
        return this.f3774h != null;
    }
}
