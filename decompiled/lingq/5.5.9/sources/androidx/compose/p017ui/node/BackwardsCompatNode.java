package androidx.compose.p017ui.node;

import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusStateImpl;
import androidx.compose.p017ui.input.pointer.PointerEventPass;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.modifier.ModifierLocalManager;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.HashSet;
import p060d1.C5024k;
import p060d1.InterfaceC5034u;
import p127g1.C5649m;
import p127g1.C5650n;
import p127g1.InterfaceC5643g;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p127g1.InterfaceC5655s;
import p127g1.InterfaceC5657u;
import p127g1.InterfaceC5658v;
import p127g1.InterfaceC5660x;
import p127g1.InterfaceC5662z;
import p142h1.AbstractC5872c;
import p142h1.C5870a;
import p142h1.C5871b;
import p142h1.C5877h;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5874e;
import p142h1.InterfaceC5875f;
import p142h1.InterfaceC5876g;
import p166i1.C6139d;
import p166i1.C6145g;
import p166i1.C6147h;
import p166i1.C6166u;
import p166i1.C6169x;
import p166i1.InterfaceC6142e0;
import p166i1.InterfaceC6143f;
import p166i1.InterfaceC6144f0;
import p166i1.InterfaceC6146g0;
import p166i1.InterfaceC6149i;
import p166i1.InterfaceC6154k0;
import p166i1.InterfaceC6155l;
import p166i1.InterfaceC6160o;
import p210k1.C6572j;
import p210k1.InterfaceC6573k;
import p327q0.InterfaceC8455a;
import p327q0.InterfaceC8458d;
import p327q0.InterfaceC8460f;
import p351r0.InterfaceC8685d;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8689h;
import p351r0.InterfaceC8691j;
import p351r0.InterfaceC8692k;
import p351r0.InterfaceC8694m;
import p351r0.InterfaceC8695n;
import p385sf.C9000b;
import p424v0.InterfaceC9619c;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BackwardsCompatNode extends InterfaceC0500b.c implements InterfaceC0544c, InterfaceC6155l, InterfaceC6143f, InterfaceC6154k0, InterfaceC6146g0, InterfaceC5874e, InterfaceC5876g, InterfaceC6144f0, InterfaceC6160o, InterfaceC6149i, InterfaceC8686e, InterfaceC8692k, InterfaceC8695n, InterfaceC6142e0, InterfaceC8455a {

    /* JADX INFO: renamed from: H */
    public C5870a f3711H;

    /* JADX INFO: renamed from: I */
    public final HashSet<AbstractC5872c<?>> f3712I;

    /* JADX INFO: renamed from: J */
    public InterfaceC5647k f3713J;

    /* JADX INFO: renamed from: k */
    public InterfaceC0500b.b f3714k;

    /* JADX INFO: renamed from: l */
    public boolean f3715l;

    /* JADX INFO: renamed from: androidx.compose.ui.node.BackwardsCompatNode$a */
    public static final class C0527a implements InterfaceC0549h.a {
        public C0527a() {
        }

        @Override // androidx.compose.p017ui.node.InterfaceC0549h.a
        /* JADX INFO: renamed from: c */
        public final void mo2098c() {
            BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
            if (backwardsCompatNode.f3713J == null) {
                backwardsCompatNode.mo2091q(C6139d.m12651d(backwardsCompatNode, BuildConfig.SDK_TRUNCATE_LENGTH));
            }
        }
    }

    public BackwardsCompatNode(InterfaceC0500b.b bVar) {
        C5207g.m11111f(bVar, "element");
        this.f3327b = C6169x.m12693b(bVar);
        this.f3714k = bVar;
        this.f3715l = true;
        this.f3712I = new HashSet<>();
    }

    @Override // p166i1.InterfaceC6149i
    /* JADX INFO: renamed from: A */
    public final void mo2077A(NodeCoordinator nodeCoordinator) {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((InterfaceC5655s) bVar).mo12014A(nodeCoordinator);
    }

    @Override // p166i1.InterfaceC6154k0
    /* JADX INFO: renamed from: C */
    public final C6572j mo2078C() {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((InterfaceC6573k) bVar).mo13165C();
    }

    @Override // p166i1.InterfaceC6146g0
    /* JADX INFO: renamed from: D */
    public final void mo2079D(C5024k c5024k, PointerEventPass pointerEventPass, long j10) {
        C5207g.m11111f(pointerEventPass, "pass");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC5034u) bVar).mo2022V().m2021E(c5024k, pointerEventPass, j10);
    }

    @Override // androidx.compose.p017ui.InterfaceC0500b.c
    /* JADX INFO: renamed from: F */
    public final void mo1931F() {
        m2080I(true);
    }

    @Override // androidx.compose.p017ui.InterfaceC0500b.c
    /* JADX INFO: renamed from: G */
    public final void mo1932G() {
        m2081J();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX INFO: renamed from: I */
    public final void m2080I(boolean z10) {
        if (!this.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.b bVar = this.f3714k;
        boolean z11 = false;
        if ((this.f3327b & 32) != 0) {
            if (bVar instanceof InterfaceC5875f) {
                InterfaceC5875f<?> interfaceC5875f = (InterfaceC5875f) bVar;
                C5870a c5870a = this.f3711H;
                if (c5870a == null || !c5870a.mo602o(interfaceC5875f.getKey())) {
                    this.f3711H = new C5870a(interfaceC5875f);
                    if (C6139d.m12652e(this).f3758U.f35998d.f3335j) {
                        ModifierLocalManager modifierLocalManager = C6139d.m12653f(this).getModifierLocalManager();
                        C5877h<?> key = interfaceC5875f.getKey();
                        modifierLocalManager.getClass();
                        C5207g.m11111f(key, "key");
                        modifierLocalManager.f3695b.m11687b(this);
                        modifierLocalManager.f3696c.m11687b(key);
                        modifierLocalManager.m2067a();
                    }
                } else {
                    c5870a.f35149a = interfaceC5875f;
                    ModifierLocalManager modifierLocalManager2 = C6139d.m12653f(this).getModifierLocalManager();
                    C5877h<?> key2 = interfaceC5875f.getKey();
                    modifierLocalManager2.getClass();
                    C5207g.m11111f(key2, "key");
                    modifierLocalManager2.f3695b.m11687b(this);
                    modifierLocalManager2.f3696c.m11687b(key2);
                    modifierLocalManager2.m2067a();
                }
            }
            if (bVar instanceof InterfaceC5873d) {
                if (z10) {
                    m2082K();
                } else {
                    C6139d.m12653f(this).mo2237q(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C9072e mo807E() {
                            this.f3717b.m2082K();
                            return C9072e.f47360a;
                        }
                    });
                }
            }
        }
        if ((this.f3327b & 4) != 0) {
            if (bVar instanceof InterfaceC8458d) {
                this.f3715l = true;
            }
            if (!z10) {
                C6139d.m12651d(this, 2).m2184k1();
            }
        }
        if ((this.f3327b & 2) != 0) {
            if (C6139d.m12652e(this).f3758U.f35998d.f3335j) {
                NodeCoordinator nodeCoordinator = this.f3332g;
                C5207g.m11108c(nodeCoordinator);
                ((C0545d) nodeCoordinator).f3897a0 = this;
                nodeCoordinator.mo2188o1();
            }
            if (!z10) {
                C6139d.m12651d(this, 2).m2184k1();
                C6139d.m12652e(this).m2134x();
            }
        }
        if (bVar instanceof InterfaceC5662z) {
            ((InterfaceC5662z) bVar).m12017N();
        }
        if ((this.f3327b & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
            if ((bVar instanceof InterfaceC5658v) && C6139d.m12652e(this).f3758U.f35998d.f3335j) {
                C6139d.m12652e(this).m2134x();
            }
            if (bVar instanceof InterfaceC5657u) {
                this.f3713J = null;
                if (C6139d.m12652e(this).f3758U.f35998d.f3335j) {
                    C6139d.m12653f(this).mo2236p(new C0527a());
                }
            }
        }
        if (((this.f3327b & 256) != 0) && (bVar instanceof InterfaceC5655s) && C6139d.m12652e(this).f3758U.f35998d.f3335j) {
            C6139d.m12652e(this).m2134x();
        }
        if (bVar instanceof InterfaceC8694m) {
            ((InterfaceC8694m) bVar).m16942R().f3388a.m11687b(this);
        }
        if (((this.f3327b & 16) != 0) && (bVar instanceof InterfaceC5034u)) {
            ((InterfaceC5034u) bVar).mo2022V().f32868a = this.f3332g;
        }
        if ((this.f3327b & 8) != 0) {
            z11 = true;
        }
        if (z11) {
            C6139d.m12653f(this).mo2234m();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J */
    public final void m2081J() {
        if (!this.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.b bVar = this.f3714k;
        boolean z10 = true;
        if ((this.f3327b & 32) != 0) {
            if (bVar instanceof InterfaceC5875f) {
                ModifierLocalManager modifierLocalManager = C6139d.m12653f(this).getModifierLocalManager();
                C5877h key = ((InterfaceC5875f) bVar).getKey();
                modifierLocalManager.getClass();
                C5207g.m11111f(key, "key");
                modifierLocalManager.f3697d.m11687b(C6139d.m12652e(this));
                modifierLocalManager.f3698e.m11687b(key);
                modifierLocalManager.m2067a();
            }
            if (bVar instanceof InterfaceC5873d) {
                ((InterfaceC5873d) bVar).mo1428X(BackwardsCompatNodeKt.f3721a);
            }
        }
        if ((this.f3327b & 8) == 0) {
            z10 = false;
        }
        if (z10) {
            C6139d.m12653f(this).mo2234m();
        }
        if (bVar instanceof InterfaceC8694m) {
            ((InterfaceC8694m) bVar).m16942R().f3388a.m11696m(this);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2082K() {
        if (this.f3335j) {
            this.f3712I.clear();
            C6139d.m12653f(this).getSnapshotObserver().m2205b(this, BackwardsCompatNodeKt.f3723c, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    BackwardsCompatNode backwardsCompatNode = this.f3720b;
                    InterfaceC0500b.b bVar = backwardsCompatNode.f3714k;
                    C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((InterfaceC5873d) bVar).mo1428X(backwardsCompatNode);
                    return C9072e.f47360a;
                }
            });
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: a */
    public final int mo1941a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0521b) bVar).mo1422a(interfaceC5645i, interfaceC5644h, i10);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: b */
    public final int mo1942b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0521b) bVar).mo1423b(interfaceC5645i, interfaceC5644h, i10);
    }

    @Override // p142h1.InterfaceC5874e, p142h1.InterfaceC5876g
    /* JADX INFO: renamed from: c */
    public final Object mo2083c(C5877h c5877h) {
        C6166u c6166u;
        C5207g.m11111f(c5877h, "<this>");
        this.f3712I.add(c5877h);
        InterfaceC0500b.c cVar = this.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        LayoutNode layoutNodeM12652e = C6139d.m12652e(this);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 32) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f3327b & 32) != 0 && (cVar2 instanceof InterfaceC5874e)) {
                        InterfaceC5874e interfaceC5874e = (InterfaceC5874e) cVar2;
                        if (interfaceC5874e.mo2092r().mo602o(c5877h)) {
                            return interfaceC5874e.mo2092r().mo607y(c5877h);
                        }
                    }
                    cVar2 = cVar2.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar2 = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
        return c5877h.f35151a.mo807E();
    }

    @Override // p327q0.InterfaceC8455a
    /* JADX INFO: renamed from: d */
    public final long mo2084d() {
        return C9000b.m17259y(C6139d.m12651d(this, BuildConfig.SDK_TRUNCATE_LENGTH).f3688c);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1943e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0521b) bVar).mo1352e(interfaceC0524e, interfaceC5651o, j10);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: f */
    public final int mo1944f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0521b) bVar).mo1424f(interfaceC5645i, interfaceC5644h, i10);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: g */
    public final int mo1945g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0521b) bVar).mo1425g(interfaceC5645i, interfaceC5644h, i10);
    }

    @Override // p327q0.InterfaceC8455a
    public final InterfaceC10015c getDensity() {
        return C6139d.m12652e(this).f3746I;
    }

    @Override // p327q0.InterfaceC8455a
    public final LayoutDirection getLayoutDirection() {
        return C6139d.m12652e(this).f3747J;
    }

    @Override // p166i1.InterfaceC6160o
    /* JADX INFO: renamed from: j */
    public final void mo2085j(long j10) {
        InterfaceC0500b.b bVar = this.f3714k;
        if (bVar instanceof InterfaceC5658v) {
            ((InterfaceC5658v) bVar).mo1438j(j10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p166i1.InterfaceC6160o
    /* JADX INFO: renamed from: k */
    public final void mo2086k(C5649m c5649m) {
        C5207g.m11111f(c5649m, "coordinates");
        InterfaceC0500b.b bVar = this.f3714k;
        if (bVar instanceof C5650n) {
            ((C5650n) bVar).getClass();
            throw null;
        }
    }

    @Override // p351r0.InterfaceC8692k
    /* JADX INFO: renamed from: m */
    public final void mo2087m(InterfaceC8691j interfaceC8691j) {
        InterfaceC0500b.b bVar = this.f3714k;
        if (!(bVar instanceof InterfaceC8689h)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        new C6147h((InterfaceC8689h) bVar).mo528n(interfaceC8691j);
    }

    @Override // p166i1.InterfaceC6146g0
    /* JADX INFO: renamed from: n */
    public final void mo2088n() {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC5034u) bVar).mo2022V().m2024n();
    }

    @Override // p166i1.InterfaceC6142e0
    /* JADX INFO: renamed from: o */
    public final boolean mo2089o() {
        return this.f3335j;
    }

    @Override // p166i1.InterfaceC6146g0
    /* JADX INFO: renamed from: p */
    public final void mo2090p() {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC5034u) bVar).mo2022V().getClass();
    }

    @Override // p166i1.InterfaceC6160o
    /* JADX INFO: renamed from: q */
    public final void mo2091q(NodeCoordinator nodeCoordinator) {
        C5207g.m11111f(nodeCoordinator, "coordinates");
        this.f3713J = nodeCoordinator;
        InterfaceC0500b.b bVar = this.f3714k;
        if (bVar instanceof InterfaceC5657u) {
            ((InterfaceC5657u) bVar).mo1441q(nodeCoordinator);
        }
    }

    @Override // p142h1.InterfaceC5874e
    /* JADX INFO: renamed from: r */
    public final AbstractC0140a mo2092r() {
        C5870a c5870a = this.f3711H;
        return c5870a != null ? c5870a : C5871b.f35150a;
    }

    @Override // p166i1.InterfaceC6143f
    /* JADX INFO: renamed from: s */
    public final void mo1946s(InterfaceC9619c interfaceC9619c) {
        C5207g.m11111f(interfaceC9619c, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        InterfaceC8460f interfaceC8460f = (InterfaceC8460f) bVar;
        if (this.f3715l && (bVar instanceof InterfaceC8458d)) {
            final InterfaceC0500b.b bVar2 = this.f3714k;
            if (bVar2 instanceof InterfaceC8458d) {
                C6139d.m12653f(this).getSnapshotObserver().m2205b(this, BackwardsCompatNodeKt.f3722b, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        ((InterfaceC8458d) bVar2).mo16541Q(this);
                        return C9072e.f47360a;
                    }
                });
            }
            this.f3715l = false;
        }
        interfaceC8460f.mo16542s(interfaceC9619c);
    }

    @Override // p166i1.InterfaceC6143f
    /* JADX INFO: renamed from: t */
    public final void mo2093t() {
        this.f3715l = true;
        C6145g.m12654a(this);
    }

    public final String toString() {
        return this.f3714k.toString();
    }

    @Override // p166i1.InterfaceC6155l
    /* JADX INFO: renamed from: u */
    public final void mo2094u(long j10) {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((InterfaceC5643g) bVar).m12013u(j10);
    }

    @Override // p351r0.InterfaceC8686e
    /* JADX INFO: renamed from: w */
    public final void mo2095w(FocusStateImpl focusStateImpl) {
        C5207g.m11111f(focusStateImpl, "focusState");
        InterfaceC0500b.b bVar = this.f3714k;
        if (!(bVar instanceof InterfaceC8685d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ((InterfaceC8685d) bVar).m16938w(focusStateImpl);
    }

    @Override // p166i1.InterfaceC6144f0
    /* JADX INFO: renamed from: y */
    public final Object mo2096y(InterfaceC10015c interfaceC10015c, Object obj) {
        C5207g.m11111f(interfaceC10015c, "<this>");
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((InterfaceC5660x) bVar).mo12015y(interfaceC10015c, obj);
    }

    @Override // p166i1.InterfaceC6146g0
    /* JADX INFO: renamed from: z */
    public final void mo2097z() {
        InterfaceC0500b.b bVar = this.f3714k;
        C5207g.m11109d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC5034u) bVar).mo2022V().getClass();
    }
}
