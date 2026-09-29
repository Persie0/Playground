package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import jm.C6526i;
import kotlin.NoWhenBranchMatchedException;
import p105f0.C5458f;
import p127g1.InterfaceC5638b;
import p166i1.C6139d;
import p351r0.C8682a;
import p351r0.C8698q;
import p351r0.C8699r;

/* JADX INFO: loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$a */
    public /* synthetic */ class C0507a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3399a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3399a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public static final boolean m1981a(FocusTargetModifierNode focusTargetModifierNode, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        FocusStateImpl focusStateImpl = focusTargetModifierNode.f3392k;
        int[] iArr = C0507a.f3399a;
        int i10 = iArr[focusStateImpl.ordinal()];
        boolean z10 = false;
        if (i10 == 1) {
            FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
            if (focusTargetModifierNodeM16945c == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i11 = iArr[focusTargetModifierNodeM16945c.f3392k.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return m1983c(focusTargetModifierNode, focusTargetModifierNodeM16945c, 2, interfaceC2052l);
                }
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!m1981a(focusTargetModifierNodeM16945c, interfaceC2052l)) {
                if (!m1983c(focusTargetModifierNode, focusTargetModifierNodeM16945c, 2, interfaceC2052l)) {
                    if (focusTargetModifierNode.m1971I().f3373a && interfaceC2052l.mo528n(focusTargetModifierNodeM16945c).booleanValue()) {
                    }
                }
            }
            z10 = true;
        } else {
            if (i10 == 2 || i10 == 3) {
                return m1984d(focusTargetModifierNode, interfaceC2052l);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!m1984d(focusTargetModifierNode, interfaceC2052l)) {
                if (focusTargetModifierNode.m1971I().f3373a ? interfaceC2052l.mo528n(focusTargetModifierNode).booleanValue() : false) {
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m1982b(FocusTargetModifierNode focusTargetModifierNode, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        int i10 = C0507a.f3399a[focusTargetModifierNode.f3392k.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return m1985e(focusTargetModifierNode, interfaceC2052l);
            }
            if (i10 == 4) {
                return focusTargetModifierNode.m1971I().f3373a ? interfaceC2052l.mo528n(focusTargetModifierNode).booleanValue() : m1985e(focusTargetModifierNode, interfaceC2052l);
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetModifierNode focusTargetModifierNodeM16945c = C8698q.m16945c(focusTargetModifierNode);
        if (focusTargetModifierNodeM16945c == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (!m1982b(focusTargetModifierNodeM16945c, interfaceC2052l)) {
            if (m1983c(focusTargetModifierNode, focusTargetModifierNodeM16945c, 1, interfaceC2052l)) {
                return true;
            }
            z10 = false;
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1983c(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i10, final InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        if (m1986f(focusTargetModifierNode, focusTargetModifierNode2, i10, interfaceC2052l)) {
            return true;
        }
        Boolean bool = (Boolean) C8682a.m16936a(focusTargetModifierNode, i10, new InterfaceC2052l<InterfaceC5638b.a, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(InterfaceC5638b.a aVar) {
                InterfaceC5638b.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.m1986f(focusTargetModifierNode, focusTargetModifierNode2, i10, interfaceC2052l));
                if (boolValueOf.booleanValue() || !aVar2.m12011a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1984d(FocusTargetModifierNode focusTargetModifierNode, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC0500b.c cVar = focusTargetModifierNode.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar2 = cVar.f3330e;
        if (cVar2 == null) {
            C6139d.m12648a(c5458f, cVar);
        } else {
            c5458f.m11687b(cVar2);
        }
        int i10 = 0;
        loop0: while (true) {
            while (true) {
                if (!c5458f.m11695l()) {
                    break loop0;
                }
                InterfaceC0500b.c cVar3 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
                if ((cVar3.f3328c & 1024) == 0) {
                    C6139d.m12648a(c5458f, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        }
                        if ((cVar3.f3327b & 1024) != 0) {
                            if (!(cVar3 instanceof FocusTargetModifierNode)) {
                                break;
                            }
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) cVar3;
                            int i11 = i10 + 1;
                            if (objArrCopyOf.length < i11) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                            }
                            objArrCopyOf[i10] = focusTargetModifierNode2;
                            i10 = i11;
                            break;
                        }
                        cVar3 = cVar3.f3330e;
                    }
                }
            }
        }
        C8699r c8699r = C8699r.f46283a;
        C5207g.m11111f(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, c8699r);
        if (i10 > 0) {
            int i12 = i10 - 1;
            do {
                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) objArrCopyOf[i12];
                if (C8698q.m16946d(focusTargetModifierNode3) && m1981a(focusTargetModifierNode3, interfaceC2052l)) {
                    return true;
                }
                i12--;
            } while (i12 >= 0);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m1985e(FocusTargetModifierNode focusTargetModifierNode, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC0500b.c cVar = focusTargetModifierNode.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar2 = cVar.f3330e;
        if (cVar2 == null) {
            C6139d.m12648a(c5458f, cVar);
        } else {
            c5458f.m11687b(cVar2);
        }
        int i10 = 0;
        while (c5458f.m11695l()) {
            InterfaceC0500b.c cVar3 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
            if ((cVar3.f3328c & 1024) == 0) {
                C6139d.m12648a(c5458f, cVar3);
            } else {
                while (cVar3 != null) {
                    if ((cVar3.f3327b & 1024) != 0) {
                        if (!(cVar3 instanceof FocusTargetModifierNode)) {
                            break;
                        }
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) cVar3;
                        int i11 = i10 + 1;
                        if (objArrCopyOf.length < i11) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i11, objArrCopyOf.length * 2));
                            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                        }
                        objArrCopyOf[i10] = focusTargetModifierNode2;
                        i10 = i11;
                        break;
                    }
                    cVar3 = cVar3.f3330e;
                }
            }
        }
        C8699r c8699r = C8699r.f46283a;
        C5207g.m11111f(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i10, c8699r);
        if (i10 <= 0) {
            return false;
        }
        int i12 = 0;
        do {
            FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) objArrCopyOf[i12];
            if (C8698q.m16946d(focusTargetModifierNode3) && m1982b(focusTargetModifierNode3, interfaceC2052l)) {
                return true;
            }
            i12++;
        } while (i12 < i10);
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static final boolean m1986f(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i10, InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        if (!(focusTargetModifierNode.f3392k == FocusStateImpl.ActiveParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC0500b.c cVar = focusTargetModifierNode.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
        InterfaceC0500b.c cVar2 = cVar.f3330e;
        if (cVar2 == null) {
            C6139d.m12648a(c5458f, cVar);
        } else {
            c5458f.m11687b(cVar2);
        }
        int i11 = 0;
        loop0: while (true) {
            while (true) {
                if (!c5458f.m11695l()) {
                    break loop0;
                }
                InterfaceC0500b.c cVar3 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
                if ((cVar3.f3328c & 1024) == 0) {
                    C6139d.m12648a(c5458f, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        }
                        if ((cVar3.f3327b & 1024) != 0) {
                            if (!(cVar3 instanceof FocusTargetModifierNode)) {
                                break;
                            }
                            FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) cVar3;
                            int i12 = i11 + 1;
                            if (objArrCopyOf.length < i12) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                            }
                            objArrCopyOf[i11] = focusTargetModifierNode3;
                            i11 = i12;
                            break;
                        }
                        cVar3 = cVar3.f3330e;
                    }
                }
            }
        }
        C8699r c8699r = C8699r.f46283a;
        C5207g.m11111f(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i11, c8699r);
        if (i10 == 1) {
            int i13 = new C6526i(0, i11 - 1).f37164b;
            if (i13 >= 0) {
                boolean z10 = false;
                int i14 = 0;
                while (true) {
                    if (z10) {
                        FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) objArrCopyOf[i14];
                        if (C8698q.m16946d(focusTargetModifierNode4) && m1982b(focusTargetModifierNode4, interfaceC2052l)) {
                            return true;
                        }
                    }
                    if (C5207g.m11106a(objArrCopyOf[i14], focusTargetModifierNode2)) {
                        z10 = true;
                    }
                    if (i14 == i13) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            if (!(i10 == 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i15 = new C6526i(0, i11 - 1).f37164b;
            if (i15 >= 0) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetModifierNode focusTargetModifierNode5 = (FocusTargetModifierNode) objArrCopyOf[i15];
                        if (C8698q.m16946d(focusTargetModifierNode5) && m1981a(focusTargetModifierNode5, interfaceC2052l)) {
                            return true;
                        }
                    }
                    if (C5207g.m11106a(objArrCopyOf[i15], focusTargetModifierNode2)) {
                        z11 = true;
                    }
                    if (i15 == 0) {
                        break;
                    }
                    i15--;
                }
            }
        }
        if (!(i10 == 1) && focusTargetModifierNode.m1971I().f3373a) {
            InterfaceC0500b.c cVarM12650c = C6139d.m12650c(focusTargetModifierNode, 1024);
            if (!(cVarM12650c instanceof FocusTargetModifierNode)) {
                cVarM12650c = null;
            }
            if (!(((FocusTargetModifierNode) cVarM12650c) == null)) {
                return interfaceC2052l.mo528n(focusTargetModifierNode).booleanValue();
            }
        }
        return false;
    }
}
