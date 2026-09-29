package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p166i1.C6134a0;
import p166i1.C6139d;
import p351r0.C8687f;
import p351r0.C8698q;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusTransactionsKt$a */
    public /* synthetic */ class C0506a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3396a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3396a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1976a(FocusTargetModifierNode focusTargetModifierNode, boolean z10, boolean z11) {
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        int i10 = C0506a.f3396a[focusTargetModifierNode.f3392k.ordinal()];
        if (i10 == 1) {
            focusTargetModifierNode.m1974L(FocusStateImpl.Inactive);
            if (z11) {
                C8687f.m16940b(focusTargetModifierNode);
            }
        } else {
            if (i10 == 2) {
                if (!z10) {
                    return z10;
                }
                focusTargetModifierNode.m1974L(FocusStateImpl.Inactive);
                if (!z11) {
                    return z10;
                }
                C8687f.m16940b(focusTargetModifierNode);
                return z10;
            }
            if (i10 == 3) {
                FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
                if (!(focusTargetModifierNodeM16945c != null ? m1976a(focusTargetModifierNodeM16945c, z10, z11) : true)) {
                    return false;
                }
                focusTargetModifierNode.m1974L(FocusStateImpl.Inactive);
                if (z11) {
                    C8687f.m16940b(focusTargetModifierNode);
                }
            } else if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1977b(final FocusTargetModifierNode focusTargetModifierNode) {
        C6134a0.m12646a(focusTargetModifierNode, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                focusTargetModifierNode.m1971I();
                return C9072e.f47360a;
            }
        });
        int i10 = C0506a.f3396a[focusTargetModifierNode.f3392k.ordinal()];
        if (i10 == 3 || i10 == 4) {
            focusTargetModifierNode.m1974L(FocusStateImpl.Active);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m1978c(FocusTargetModifierNode focusTargetModifierNode) {
        C5207g.m11111f(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.f3326a.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!focusTargetModifierNode.m1971I().f3373a) {
            return TwoDimensionalFocusSearchKt.m1991e(focusTargetModifierNode, 7, new InterfaceC2052l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(FocusTargetModifierNode focusTargetModifierNode2) {
                    FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode2;
                    C5207g.m11111f(focusTargetModifierNode3, "it");
                    return Boolean.valueOf(FocusTransactionsKt.m1978c(focusTargetModifierNode3));
                }
            });
        }
        int i10 = C0506a.f3396a[focusTargetModifierNode.f3392k.ordinal()];
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            C8687f.m16940b(focusTargetModifierNode);
            return true;
        }
        if (i10 == 3) {
            FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
            if (focusTargetModifierNodeM16945c != null ? m1976a(focusTargetModifierNodeM16945c, false, true) : true) {
                m1977b(focusTargetModifierNode);
            } else {
                z10 = false;
            }
            if (z10) {
                C8687f.m16940b(focusTargetModifierNode);
            }
            return z10;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC0500b.c cVarM12650c = C6139d.m12650c(focusTargetModifierNode, 1024);
        if (!(cVarM12650c instanceof FocusTargetModifierNode)) {
            cVarM12650c = null;
        }
        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) cVarM12650c;
        if (focusTargetModifierNode2 != null) {
            return m1979d(focusTargetModifierNode2, focusTargetModifierNode);
        }
        if (m1980e(focusTargetModifierNode)) {
            m1977b(focusTargetModifierNode);
        } else {
            z10 = false;
        }
        if (z10) {
            C8687f.m16940b(focusTargetModifierNode);
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1979d(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        InterfaceC0500b.c cVarM12650c = C6139d.m12650c(focusTargetModifierNode2, 1024);
        if (!(cVarM12650c instanceof FocusTargetModifierNode)) {
            cVarM12650c = null;
        }
        if (!C5207g.m11106a((FocusTargetModifierNode) cVarM12650c, focusTargetModifierNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i10 = C0506a.f3396a[focusTargetModifierNode.f3392k.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC0500b.c cVarM12650c2 = C6139d.m12650c(focusTargetModifierNode, 1024);
                    FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) (cVarM12650c2 instanceof FocusTargetModifierNode ? cVarM12650c2 : null);
                    if (focusTargetModifierNode3 == null && m1980e(focusTargetModifierNode)) {
                        focusTargetModifierNode.m1974L(FocusStateImpl.Active);
                        C8687f.m16940b(focusTargetModifierNode);
                        return m1979d(focusTargetModifierNode, focusTargetModifierNode2);
                    }
                    if (focusTargetModifierNode3 != null && m1979d(focusTargetModifierNode3, focusTargetModifierNode)) {
                        boolean zM1979d = m1979d(focusTargetModifierNode, focusTargetModifierNode2);
                        if (focusTargetModifierNode.f3392k != FocusStateImpl.ActiveParent) {
                            z10 = false;
                        }
                        if (z10) {
                            return zM1979d;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (C8698q.m16945c(focusTargetModifierNode) == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
                    if (focusTargetModifierNodeM16945c != null ? m1976a(focusTargetModifierNodeM16945c, false, true) : true) {
                        m1977b(focusTargetModifierNode2);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        C8687f.m16940b(focusTargetModifierNode2);
                        return z10;
                    }
                }
            }
            return false;
        }
        m1977b(focusTargetModifierNode2);
        focusTargetModifierNode.m1974L(FocusStateImpl.ActiveParent);
        C8687f.m16940b(focusTargetModifierNode2);
        C8687f.m16940b(focusTargetModifierNode);
        return z10;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1980e(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        InterfaceC0549h interfaceC0549h;
        NodeCoordinator nodeCoordinator = focusTargetModifierNode.f3332g;
        if (nodeCoordinator == null || (layoutNode = nodeCoordinator.f3844g) == null || (interfaceC0549h = layoutNode.f3774h) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return interfaceC0549h.requestFocus();
    }
}
