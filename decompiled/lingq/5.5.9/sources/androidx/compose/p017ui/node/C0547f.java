package androidx.compose.p017ui.node;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import p105f0.C5458f;
import p127g1.InterfaceC5647k;
import p166i1.C6136b0;
import p166i1.C6138c0;
import p470x1.C10013a;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.node.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0547f {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f3911a;

    /* JADX INFO: renamed from: b */
    public final C0542a f3912b;

    /* JADX INFO: renamed from: c */
    public boolean f3913c;

    /* JADX INFO: renamed from: d */
    public final C6138c0 f3914d;

    /* JADX INFO: renamed from: e */
    public final C5458f<InterfaceC0549h.a> f3915e;

    /* JADX INFO: renamed from: f */
    public final long f3916f;

    /* JADX INFO: renamed from: g */
    public final C5458f<a> f3917g;

    /* JADX INFO: renamed from: h */
    public C10013a f3918h;

    /* JADX INFO: renamed from: androidx.compose.ui.node.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LayoutNode f3919a;

        /* JADX INFO: renamed from: b */
        public final boolean f3920b;

        /* JADX INFO: renamed from: c */
        public final boolean f3921c;

        public a(LayoutNode layoutNode, boolean z10, boolean z11) {
            C5207g.m11111f(layoutNode, "node");
            this.f3919a = layoutNode;
            this.f3920b = z10;
            this.f3921c = z11;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.f$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3922a;

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
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3922a = iArr;
        }
    }

    public C0547f(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "root");
        this.f3911a = layoutNode;
        this.f3912b = new C0542a();
        this.f3914d = new C6138c0();
        this.f3915e = new C5458f<>(new InterfaceC0549h.a[16]);
        this.f3916f = 1L;
        this.f3917g = new C5458f<>(new a[16]);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2211e(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        boolean z10 = false;
        if (layoutNodeLayoutDelegate.f3788f) {
            if (layoutNode.f3754Q != LayoutNode.UsageByParent.InMeasureBlock) {
                layoutNodeLayoutDelegate.getClass();
            } else {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m2212a(boolean z10) {
        C6138c0 c6138c0 = this.f3914d;
        if (z10) {
            c6138c0.getClass();
            LayoutNode layoutNode = this.f3911a;
            C5207g.m11111f(layoutNode, "rootNode");
            C5458f<LayoutNode> c5458f = c6138c0.f35963a;
            c5458f.m11691h();
            c5458f.m11687b(layoutNode);
            layoutNode.f3765a0 = true;
        }
        C6136b0 c6136b0 = C6136b0.f35962a;
        C5458f<LayoutNode> c5458f2 = c6138c0.f35963a;
        c5458f2.getClass();
        LayoutNode[] layoutNodeArr = c5458f2.f34017a;
        int i10 = c5458f2.f34019c;
        C5207g.m11111f(layoutNodeArr, "<this>");
        Arrays.sort(layoutNodeArr, 0, i10, c6136b0);
        int i11 = c5458f2.f34019c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            LayoutNode[] layoutNodeArr2 = c5458f2.f34017a;
            do {
                LayoutNode layoutNode2 = layoutNodeArr2[i12];
                if (layoutNode2.f3765a0) {
                    C6138c0.m12647a(layoutNode2);
                }
                i12--;
            } while (i12 >= 0);
        }
        c5458f2.m11691h();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2213b(LayoutNode layoutNode, C10013a c10013a) {
        layoutNode.getClass();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2214c(LayoutNode layoutNode, C10013a c10013a) {
        boolean zM2110F;
        if (c10013a != null) {
            zM2110F = layoutNode.m2110F(c10013a);
        } else {
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNode.f3759V.f3791i;
            zM2110F = layoutNode.m2110F(measurePassDelegate.f3795e ? new C10013a(measurePassDelegate.f3689d) : null);
        }
        LayoutNode layoutNodeM2128r = layoutNode.m2128r();
        if (zM2110F && layoutNodeM2128r != null) {
            LayoutNode.UsageByParent usageByParent = layoutNode.f3753P;
            if (usageByParent == LayoutNode.UsageByParent.InMeasureBlock) {
                m2224n(layoutNodeM2128r, false);
            } else if (usageByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                m2223m(layoutNodeM2128r, false);
            }
        }
        return zM2110F;
    }

    /* JADX INFO: renamed from: d */
    public final void m2215d(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        C0542a c0542a = this.f3912b;
        if (c0542a.f3893a.isEmpty()) {
            return;
        }
        if (!this.f3913c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        if (!(!layoutNodeLayoutDelegate.f3785c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.f3759V.f3785c && c0542a.m2207b(layoutNode2)) {
                    m2219i(layoutNode2);
                }
                if (!layoutNode2.f3759V.f3785c) {
                    m2215d(layoutNode2);
                }
                i11++;
            } while (i11 < i10);
        }
        if (layoutNodeLayoutDelegate.f3785c && c0542a.m2207b(layoutNode)) {
            m2219i(layoutNode);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2216f(InterfaceC2041a<C9072e> interfaceC2041a) {
        boolean z10;
        C0542a c0542a = this.f3912b;
        LayoutNode layoutNode = this.f3911a;
        if (!layoutNode.m2136z()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode.f3749L) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f3913c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = 0;
        if (this.f3918h != null) {
            this.f3913c = true;
            try {
                boolean zIsEmpty = c0542a.f3893a.isEmpty();
                TreeSet<LayoutNode> treeSet = c0542a.f3893a;
                if (!zIsEmpty) {
                    z10 = false;
                    loop0: while (true) {
                        while (!treeSet.isEmpty()) {
                            LayoutNode layoutNodeFirst = treeSet.first();
                            C5207g.m11110e(layoutNodeFirst, "node");
                            c0542a.m2207b(layoutNodeFirst);
                            boolean zM2219i = m2219i(layoutNodeFirst);
                            if (layoutNodeFirst == layoutNode && zM2219i) {
                                z10 = true;
                            }
                        }
                        break loop0;
                    }
                    if (interfaceC2041a != null) {
                        interfaceC2041a.mo807E();
                    }
                } else {
                    z10 = false;
                }
                this.f3913c = false;
            } catch (Throwable th2) {
                this.f3913c = false;
                throw th2;
            }
        } else {
            z10 = false;
        }
        C5458f<InterfaceC0549h.a> c5458f = this.f3915e;
        int i11 = c5458f.f34019c;
        if (i11 > 0) {
            InterfaceC0549h.a[] aVarArr = c5458f.f34017a;
            do {
                aVarArr[i10].mo2098c();
                i10++;
            } while (i10 < i11);
        }
        c5458f.m11691h();
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final void m2217g() {
        LayoutNode layoutNode = this.f3911a;
        if (!layoutNode.m2136z()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!layoutNode.f3749L) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f3913c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f3918h != null) {
            this.f3913c = true;
            try {
                m2218h(layoutNode);
                this.f3913c = false;
            } catch (Throwable th2) {
                this.f3913c = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2218h(LayoutNode layoutNode) {
        m2220j(layoutNode);
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.f3753P == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.f3759V.f3791i.f3802l.m2073f()) {
                    m2218h(layoutNode2);
                }
                i11++;
            } while (i11 < i10);
        }
        m2220j(layoutNode);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2219i(LayoutNode layoutNode) {
        boolean zM2214c;
        C10013a c10013a;
        boolean z10;
        boolean z11;
        boolean z12 = layoutNode.f3749L;
        int i10 = 0;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        if (!z12) {
            if (layoutNodeLayoutDelegate.f3785c) {
                if (layoutNode.f3753P == LayoutNode.UsageByParent.InMeasureBlock || layoutNodeLayoutDelegate.f3791i.f3802l.m2073f()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && !C5207g.m11106a(layoutNode.m2105A(), Boolean.TRUE) && !m2211e(layoutNode)) {
                if (layoutNodeLayoutDelegate.f3791i.f3802l.m2073f()) {
                    z11 = true;
                } else {
                    layoutNodeLayoutDelegate.getClass();
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
            }
        }
        layoutNodeLayoutDelegate.getClass();
        LayoutNode layoutNode2 = this.f3911a;
        if (layoutNodeLayoutDelegate.f3785c) {
            if (layoutNode == layoutNode2) {
                c10013a = this.f3918h;
                C5207g.m11108c(c10013a);
            } else {
                c10013a = null;
            }
            layoutNodeLayoutDelegate.getClass();
            zM2214c = m2214c(layoutNode, c10013a);
        } else {
            zM2214c = false;
        }
        if (layoutNodeLayoutDelegate.f3788f && C5207g.m11106a(layoutNode.m2105A(), Boolean.TRUE)) {
            if (layoutNode.f3755R == LayoutNode.UsageByParent.NotUsed) {
                layoutNode.m2122k();
            }
            layoutNodeLayoutDelegate.getClass();
            C5207g.m11108c(null);
            throw null;
        }
        if (layoutNodeLayoutDelegate.f3786d && layoutNode.f3749L) {
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.f3791i;
            if (layoutNode == layoutNode2) {
                if (layoutNode.f3755R == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.m2122k();
                }
                AbstractC0526g.a.C10587a c10587a = AbstractC0526g.a.f3690a;
                int iMo2055e0 = measurePassDelegate.mo2055e0();
                LayoutDirection layoutDirection = layoutNode.f3747J;
                LayoutNode layoutNodeM2128r = layoutNode.m2128r();
                C0543b c0543b = layoutNodeM2128r != null ? layoutNodeM2128r.f3758U.f35996b : null;
                InterfaceC5647k interfaceC5647k = AbstractC0526g.a.f3693d;
                c10587a.getClass();
                int i11 = AbstractC0526g.a.f3692c;
                LayoutDirection layoutDirection2 = AbstractC0526g.a.f3691b;
                AbstractC0526g.a.f3692c = iMo2055e0;
                AbstractC0526g.a.f3691b = layoutDirection;
                boolean zM2065i = AbstractC0526g.a.C10587a.m2065i(c10587a, c0543b);
                AbstractC0526g.a.m2059e(c10587a, measurePassDelegate, 0, 0);
                if (c0543b != null) {
                    c0543b.f35994f = zM2065i;
                }
                AbstractC0526g.a.f3692c = i11;
                AbstractC0526g.a.f3691b = layoutDirection2;
                AbstractC0526g.a.f3693d = interfaceC5647k;
            } else {
                if (layoutNode.f3755R == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.m2122k();
                }
                try {
                    layoutNode.f3767b0 = true;
                    if (!measurePassDelegate.f3796f) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    measurePassDelegate.m2148L0(measurePassDelegate.f3797g, measurePassDelegate.f3799i, measurePassDelegate.f3798h);
                    layoutNode.f3767b0 = false;
                } catch (Throwable th2) {
                    layoutNode.f3767b0 = false;
                    throw th2;
                }
            }
            C6138c0 c6138c0 = this.f3914d;
            c6138c0.getClass();
            c6138c0.f35963a.m11687b(layoutNode);
            layoutNode.f3765a0 = true;
        }
        C5458f<a> c5458f = this.f3917g;
        if (c5458f.m11695l()) {
            int i12 = c5458f.f34019c;
            if (i12 > 0) {
                a[] aVarArr = c5458f.f34017a;
                do {
                    a aVar = aVarArr[i10];
                    if (aVar.f3919a.m2136z()) {
                        boolean z13 = aVar.f3920b;
                        boolean z14 = aVar.f3921c;
                        LayoutNode layoutNode3 = aVar.f3919a;
                        if (z13) {
                            m2222l(layoutNode3, z14);
                            throw null;
                        }
                        m2224n(layoutNode3, z14);
                    }
                    i10++;
                } while (i10 < i12);
            }
            c5458f.m11691h();
        }
        return zM2214c;
    }

    /* JADX INFO: renamed from: j */
    public final void m2220j(LayoutNode layoutNode) {
        C10013a c10013a;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        if (!layoutNodeLayoutDelegate.f3785c) {
            layoutNodeLayoutDelegate.getClass();
            return;
        }
        if (layoutNode == this.f3911a) {
            c10013a = this.f3918h;
            C5207g.m11108c(c10013a);
        } else {
            c10013a = null;
        }
        layoutNode.f3759V.getClass();
        m2214c(layoutNode, c10013a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m2221k(LayoutNode layoutNode, boolean z10) {
        LayoutNode layoutNodeM2128r;
        boolean z11;
        C5207g.m11111f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        int i10 = b.f3922a[layoutNodeLayoutDelegate.f3784b.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                layoutNodeLayoutDelegate.getClass();
                if (layoutNodeLayoutDelegate.f3788f || z10) {
                    layoutNodeLayoutDelegate.f3788f = true;
                    layoutNodeLayoutDelegate.getClass();
                    layoutNodeLayoutDelegate.f3786d = true;
                    layoutNodeLayoutDelegate.f3787e = true;
                    if (C5207g.m11106a(layoutNode.m2105A(), Boolean.TRUE)) {
                        layoutNodeM2128r = layoutNode.m2128r();
                        if (layoutNodeM2128r != null) {
                            layoutNodeM2128r.f3759V.getClass();
                        }
                        if (layoutNodeM2128r == null && layoutNodeM2128r.f3759V.f3788f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            this.f3912b.m2206a(layoutNode);
                        }
                    }
                    if (!this.f3913c) {
                        return true;
                    }
                }
            } else if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutNodeLayoutDelegate.getClass();
                if (layoutNodeLayoutDelegate.f3788f) {
                    layoutNodeLayoutDelegate.f3788f = true;
                    layoutNodeLayoutDelegate.getClass();
                    layoutNodeLayoutDelegate.f3786d = true;
                    layoutNodeLayoutDelegate.f3787e = true;
                    if (C5207g.m11106a(layoutNode.m2105A(), Boolean.TRUE)) {
                        layoutNodeM2128r = layoutNode.m2128r();
                        if (layoutNodeM2128r != null) {
                            layoutNodeM2128r.f3759V.getClass();
                        }
                        if (layoutNodeM2128r == null) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            this.f3912b.m2206a(layoutNode);
                        }
                    }
                    if (!this.f3913c) {
                        return true;
                    }
                } else {
                    layoutNodeLayoutDelegate.f3788f = true;
                    layoutNodeLayoutDelegate.getClass();
                    layoutNodeLayoutDelegate.f3786d = true;
                    layoutNodeLayoutDelegate.f3787e = true;
                    if (C5207g.m11106a(layoutNode.m2105A(), Boolean.TRUE)) {
                        layoutNodeM2128r = layoutNode.m2128r();
                        if (layoutNodeM2128r != null) {
                            layoutNodeM2128r.f3759V.getClass();
                        }
                        if (layoutNodeM2128r == null) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            this.f3912b.m2206a(layoutNode);
                        }
                    }
                    if (!this.f3913c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2222l(LayoutNode layoutNode, boolean z10) {
        C5207g.m11111f(layoutNode, "layoutNode");
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2223m(LayoutNode layoutNode, boolean z10) {
        C5207g.m11111f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        int i10 = b.f3922a[layoutNodeLayoutDelegate.f3784b.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (z10 || (!layoutNodeLayoutDelegate.f3785c && !layoutNodeLayoutDelegate.f3786d)) {
                layoutNodeLayoutDelegate.f3786d = true;
                layoutNodeLayoutDelegate.f3787e = true;
                if (layoutNode.f3749L) {
                    LayoutNode layoutNodeM2128r = layoutNode.m2128r();
                    if (!(layoutNodeM2128r != null && layoutNodeM2128r.f3759V.f3786d)) {
                        if (!(layoutNodeM2128r != null && layoutNodeM2128r.f3759V.f3785c)) {
                            this.f3912b.m2206a(layoutNode);
                        }
                    }
                }
                if (!this.f3913c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX INFO: renamed from: n */
    public final boolean m2224n(LayoutNode layoutNode, boolean z10) {
        LayoutNode layoutNodeM2128r;
        boolean z11;
        C5207g.m11111f(layoutNode, "layoutNode");
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        int i10 = b.f3922a[layoutNodeLayoutDelegate.f3784b.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f3917g.m11687b(new a(layoutNode, false, z10));
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNodeLayoutDelegate.f3785c || z10) {
                    layoutNodeLayoutDelegate.f3785c = true;
                    if (layoutNode.f3749L) {
                        layoutNodeM2128r = layoutNode.m2128r();
                        if (layoutNodeM2128r == null && layoutNodeM2128r.f3759V.f3785c) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            this.f3912b.m2206a(layoutNode);
                        }
                    } else {
                        if (layoutNode.f3753P == LayoutNode.UsageByParent.InMeasureBlock || layoutNodeLayoutDelegate.f3791i.f3802l.m2073f()) {
                            layoutNodeM2128r = layoutNode.m2128r();
                            if (layoutNodeM2128r == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                this.f3912b.m2206a(layoutNode);
                            }
                        }
                    }
                    if (!this.f3913c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m2225o(long j10) {
        C10013a c10013a = this.f3918h;
        if (c10013a == null ? false : C10013a.m18597b(c10013a.f50963a, j10)) {
            return;
        }
        if (!(!this.f3913c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f3918h = new C10013a(j10);
        LayoutNode layoutNode = this.f3911a;
        layoutNode.f3759V.f3785c = true;
        this.f3912b.m2206a(layoutNode);
    }
}
