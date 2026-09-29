package androidx.compose.p017ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import p105f0.C5458f;
import p166i1.InterfaceC6142e0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateObserver f3879a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<LayoutNode, C9072e> f3880b = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2112H(false);
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<LayoutNode, C9072e> f3881c = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2114J(false);
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: d */
    public final InterfaceC2052l<LayoutNode, C9072e> f3882d = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2113I(false);
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: e */
    public final InterfaceC2052l<LayoutNode, C9072e> f3883e = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2113I(false);
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<LayoutNode, C9072e> f3884f = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2111G(false);
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: g */
    public final InterfaceC2052l<LayoutNode, C9072e> f3885g = new InterfaceC2052l<LayoutNode, C9072e>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            C5207g.m11111f(layoutNode2, "layoutNode");
            if (layoutNode2.m2136z()) {
                layoutNode2.m2111G(false);
            }
            return C9072e.f47360a;
        }
    };

    public OwnerSnapshotObserver(InterfaceC2052l<? super InterfaceC2041a<C9072e>, C9072e> interfaceC2052l) {
        this.f3879a = new SnapshotStateObserver(interfaceC2052l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m2204a() {
        SnapshotStateObserver snapshotStateObserver = this.f3879a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = new InterfaceC2052l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Object obj) {
                C5207g.m11111f(obj, "it");
                return Boolean.valueOf(!((InterfaceC6142e0) obj).mo2089o());
            }
        };
        snapshotStateObserver.getClass();
        C5207g.m11111f(ownerSnapshotObserver$clearInvalidObservations$1, "predicate");
        synchronized (snapshotStateObserver.f3288f) {
            C5458f<SnapshotStateObserver.ObservedScopeMap> c5458f = snapshotStateObserver.f3288f;
            int i10 = c5458f.f34019c;
            if (i10 > 0) {
                SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = c5458f.f34017a;
                int i11 = 0;
                do {
                    observedScopeMapArr[i11].m1913d(ownerSnapshotObserver$clearInvalidObservations$1);
                    i11++;
                } while (i11 < i10);
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final <T extends InterfaceC6142e0> void m2205b(T t10, InterfaceC2052l<? super T, C9072e> interfaceC2052l, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(t10, "target");
        C5207g.m11111f(interfaceC2052l, "onChanged");
        this.f3879a.m1909b(t10, interfaceC2052l, interfaceC2041a);
    }
}
