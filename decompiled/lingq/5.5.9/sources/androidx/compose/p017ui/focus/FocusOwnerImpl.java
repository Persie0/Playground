package androidx.compose.p017ui.focus;

import android.view.KeyEvent;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p022b1.InterfaceC1291d;
import p106f1.C5461c;
import p106f1.InterfaceC5459a;
import p166i1.AbstractC6165t;
import p166i1.C6139d;
import p166i1.C6166u;
import p351r0.C8684c;
import p351r0.C8698q;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8690i;
import p351r0.InterfaceC8692k;
import p375s0.C8942d;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements InterfaceC8690i {

    /* JADX INFO: renamed from: b */
    public final FocusInvalidationManager f3365b;

    /* JADX INFO: renamed from: d */
    public LayoutDirection f3367d;

    /* JADX INFO: renamed from: a */
    public final FocusTargetModifierNode f3364a = new FocusTargetModifierNode();

    /* JADX INFO: renamed from: c */
    public final FocusOwnerImpl$modifier$1 f3366c = new AbstractC6165t<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // p166i1.AbstractC6165t
        /* JADX INFO: renamed from: c */
        public final InterfaceC0500b.c mo1935c() {
            return this.f3369a.f3364a;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p166i1.AbstractC6165t
        /* JADX INFO: renamed from: h */
        public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
            FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) cVar;
            C5207g.m11111f(focusTargetModifierNode, "node");
            return focusTargetModifierNode;
        }

        public final int hashCode() {
            return this.f3369a.f3364a.hashCode();
        }
    };

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusOwnerImpl$a */
    public /* synthetic */ class C0504a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3368a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
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
            f3368a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(InterfaceC2052l<? super InterfaceC2041a<C9072e>, C9072e> interfaceC2052l) {
        this.f3365b = new FocusInvalidationManager(interfaceC2052l);
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: a */
    public final void mo1954a(InterfaceC8692k interfaceC8692k) {
        C5207g.m11111f(interfaceC8692k, "node");
        FocusInvalidationManager focusInvalidationManager = this.f3365b;
        focusInvalidationManager.getClass();
        focusInvalidationManager.m1953a(focusInvalidationManager.f3361d, interfaceC8692k);
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: b */
    public final void mo1955b(LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "<set-?>");
        this.f3367d = layoutDirection;
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: c */
    public final FocusOwnerImpl$modifier$1 mo1956c() {
        return this.f3366c;
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: d */
    public final void mo1957d() {
        FocusTargetModifierNode focusTargetModifierNode = this.f3364a;
        if (focusTargetModifierNode.f3392k == FocusStateImpl.Inactive) {
            focusTargetModifierNode.m1974L(FocusStateImpl.Active);
        }
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: e */
    public final void mo1958e(InterfaceC8686e interfaceC8686e) {
        C5207g.m11111f(interfaceC8686e, "node");
        FocusInvalidationManager focusInvalidationManager = this.f3365b;
        focusInvalidationManager.getClass();
        focusInvalidationManager.m1953a(focusInvalidationManager.f3360c, interfaceC8686e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: f */
    public final void mo1959f(boolean z10, boolean z11) {
        FocusStateImpl focusStateImpl;
        FocusTargetModifierNode focusTargetModifierNode = this.f3364a;
        FocusStateImpl focusStateImpl2 = focusTargetModifierNode.f3392k;
        if (FocusTransactionsKt.m1976a(focusTargetModifierNode, z10, z11)) {
            int i10 = C0504a.f3368a[focusStateImpl2.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusTargetModifierNode.m1974L(focusStateImpl);
        }
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: g */
    public final void mo1960g(FocusTargetModifierNode focusTargetModifierNode) {
        C5207g.m11111f(focusTargetModifierNode, "node");
        FocusInvalidationManager focusInvalidationManager = this.f3365b;
        focusInvalidationManager.getClass();
        focusInvalidationManager.m1953a(focusInvalidationManager.f3359b, focusTargetModifierNode);
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: h */
    public final C8942d mo1961h() {
        FocusTargetModifierNode focusTargetModifierNodeM16943a = C8698q.m16943a(this.f3364a);
        if (focusTargetModifierNodeM16943a != null) {
            return C8698q.m16944b(focusTargetModifierNodeM16943a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:197:0x022b  */
    @Override // p351r0.InterfaceC8688g
    /* JADX INFO: renamed from: i */
    public final boolean mo1962i(int i10) {
        FocusRequester focusRequester;
        FocusTargetModifierNode focusTargetModifierNode;
        boolean zBooleanValue;
        C6166u c6166u;
        Boolean boolM1996j;
        boolean z10;
        boolean zMo1962i;
        FocusTargetModifierNode focusTargetModifierNode2 = this.f3364a;
        FocusTargetModifierNode focusTargetModifierNodeM16943a = C8698q.m16943a(focusTargetModifierNode2);
        if (focusTargetModifierNodeM16943a == null) {
            return false;
        }
        LayoutDirection layoutDirection = this.f3367d;
        if (layoutDirection == null) {
            C5207g.m11117l("layoutDirection");
            throw null;
        }
        FocusPropertiesImpl focusPropertiesImplM1971I = focusTargetModifierNodeM16943a.m1971I();
        int i11 = 4;
        if (i10 == 1) {
            focusRequester = focusPropertiesImplM1971I.f3374b;
        } else {
            if (i10 == 2) {
                focusRequester = focusPropertiesImplM1971I.f3375c;
            } else {
                if (i10 == 5) {
                    focusRequester = focusPropertiesImplM1971I.f3376d;
                } else {
                    if (i10 == 6) {
                        focusRequester = focusPropertiesImplM1971I.f3377e;
                    } else {
                        boolean z11 = i10 == 3;
                        FocusRequester focusRequester2 = focusPropertiesImplM1971I.f3381i;
                        FocusRequester focusRequester3 = focusPropertiesImplM1971I.f3380h;
                        if (z11) {
                            int i12 = C8698q.a.f46281a[layoutDirection.ordinal()];
                            if (i12 == 1) {
                                focusRequester2 = focusRequester3;
                            } else if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            focusRequester = !C5207g.m11106a(focusRequester2, FocusRequester.f3386b) ? focusRequester2 : null;
                            if (focusRequester == null) {
                                focusRequester = focusPropertiesImplM1971I.f3378f;
                            }
                        } else {
                            if (i10 == 4) {
                                int i13 = C8698q.a.f46281a[layoutDirection.ordinal()];
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    focusRequester2 = focusRequester3;
                                }
                                focusRequester = !C5207g.m11106a(focusRequester2, FocusRequester.f3386b) ? focusRequester2 : null;
                                if (focusRequester == null) {
                                    focusRequester = focusPropertiesImplM1971I.f3379g;
                                }
                            } else {
                                if (i10 == 7) {
                                    ((FocusPropertiesImpl$enter$1) focusPropertiesImplM1971I.f3382j).getClass();
                                    focusRequester = FocusRequester.f3386b;
                                } else {
                                    if (!(i10 == 8)) {
                                        throw new IllegalStateException("invalid FocusDirection".toString());
                                    }
                                    ((FocusPropertiesImpl$exit$1) focusPropertiesImplM1971I.f3383k).getClass();
                                    focusRequester = FocusRequester.f3386b;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (C5207g.m11106a(focusRequester, FocusRequester.f3387c)) {
            return false;
        }
        if (!C5207g.m11106a(focusRequester, FocusRequester.f3386b)) {
            return focusRequester.m1969a(new InterfaceC2052l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(FocusTargetModifierNode focusTargetModifierNode3) {
                    FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode3;
                    C5207g.m11111f(focusTargetModifierNode4, "it");
                    return Boolean.valueOf(FocusTransactionsKt.m1978c(focusTargetModifierNode4));
                }
            });
        }
        LayoutDirection layoutDirection2 = this.f3367d;
        if (layoutDirection2 == null) {
            C5207g.m11117l("layoutDirection");
            throw null;
        }
        FocusOwnerImpl$moveFocus$foundNextItem$1 focusOwnerImpl$moveFocus$foundNextItem$1 = new FocusOwnerImpl$moveFocus$foundNextItem$1(focusTargetModifierNodeM16943a);
        if ((i10 == 1) || i10 == 2) {
            if (i10 == 1) {
                zBooleanValue = OneDimensionalFocusSearchKt.m1982b(focusTargetModifierNode2, focusOwnerImpl$moveFocus$foundNextItem$1);
            } else {
                if (!(i10 == 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                zBooleanValue = OneDimensionalFocusSearchKt.m1981a(focusTargetModifierNode2, focusOwnerImpl$moveFocus$foundNextItem$1);
            }
        } else {
            if ((((i10 == 3) || i10 == 4) || i10 == 5) || i10 == 6) {
                Boolean boolM1996j2 = TwoDimensionalFocusSearchKt.m1996j(focusTargetModifierNode2, i10, focusOwnerImpl$moveFocus$foundNextItem$1);
                if (boolM1996j2 != null) {
                    zBooleanValue = boolM1996j2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                if (i10 == 7) {
                    int i14 = C8698q.a.f46281a[layoutDirection2.ordinal()];
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i11 = 3;
                    }
                    FocusTargetModifierNode focusTargetModifierNodeM16943a2 = C8698q.m16943a(focusTargetModifierNode2);
                    if (focusTargetModifierNodeM16943a2 == null || (boolM1996j = TwoDimensionalFocusSearchKt.m1996j(focusTargetModifierNodeM16943a2, i11, focusOwnerImpl$moveFocus$foundNextItem$1)) == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolM1996j.booleanValue();
                    }
                } else {
                    if (!(i10 == 8)) {
                        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C8684c.m16937a(i10))).toString());
                    }
                    FocusTargetModifierNode focusTargetModifierNodeM16943a3 = C8698q.m16943a(focusTargetModifierNode2);
                    if (focusTargetModifierNodeM16943a3 == null) {
                        focusTargetModifierNode = null;
                        break;
                    }
                    InterfaceC0500b.c cVar = focusTargetModifierNodeM16943a3.f3326a;
                    if (!cVar.f3335j) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    InterfaceC0500b.c cVar2 = cVar.f3329d;
                    LayoutNode layoutNodeM12652e = C6139d.m12652e(focusTargetModifierNodeM16943a3);
                    loop0: while (true) {
                        if (layoutNodeM12652e == null) {
                            focusTargetModifierNode = null;
                            break;
                        }
                        if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 1024) != 0) {
                            while (cVar2 != null) {
                                if ((cVar2.f3327b & 1024) != 0 && (cVar2 instanceof FocusTargetModifierNode)) {
                                    focusTargetModifierNode = (FocusTargetModifierNode) cVar2;
                                    if (focusTargetModifierNode.m1971I().f3373a) {
                                        break loop0;
                                    }
                                }
                                cVar2 = cVar2.f3329d;
                            }
                        }
                        layoutNodeM12652e = layoutNodeM12652e.m2128r();
                        cVar2 = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
                    }
                    if (focusTargetModifierNode == null || C5207g.m11106a(focusTargetModifierNode, focusTargetModifierNode2)) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = ((Boolean) focusOwnerImpl$moveFocus$foundNextItem$1.mo528n(focusTargetModifierNode)).booleanValue();
                    }
                }
            }
        }
        if (!zBooleanValue) {
            if (!focusTargetModifierNode2.f3392k.getHasFocus() || focusTargetModifierNode2.f3392k.isFocused()) {
                z10 = false;
                zMo1962i = z10;
            } else {
                if ((i10 == 1) || i10 == 2) {
                    z10 = false;
                    mo1959f(false, true);
                    if (focusTargetModifierNode2.f3392k.isFocused()) {
                        zMo1962i = mo1962i(i10);
                    }
                } else {
                    z10 = false;
                }
                zMo1962i = z10;
            }
            if (!zMo1962i) {
                return z10;
            }
        }
        return true;
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: j */
    public final void mo1963j() {
        FocusTransactionsKt.m1976a(this.f3364a, true, true);
    }

    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: k */
    public final boolean mo1964k(C5461c c5461c) {
        InterfaceC5459a interfaceC5459a;
        int size;
        FocusTargetModifierNode focusTargetModifierNodeM16943a = C8698q.m16943a(this.f3364a);
        if (focusTargetModifierNodeM16943a != null) {
            Object objM12650c = C6139d.m12650c(focusTargetModifierNodeM16943a, 16384);
            if (!(objM12650c instanceof InterfaceC5459a)) {
                objM12650c = null;
            }
            interfaceC5459a = (InterfaceC5459a) objM12650c;
        } else {
            interfaceC5459a = null;
        }
        if (interfaceC5459a != null) {
            ArrayList arrayListM12649b = C6139d.m12649b(interfaceC5459a, 16384);
            ArrayList arrayList = arrayListM12649b instanceof List ? arrayListM12649b : null;
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i10 = size - 1;
                    if (((InterfaceC5459a) arrayList.get(size)).mo11700i(c5461c)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            if (interfaceC5459a.mo11700i(c5461c) || interfaceC5459a.mo11699B(c5461c)) {
                return true;
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((InterfaceC5459a) arrayList.get(i11)).mo11699B(c5461c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p351r0.InterfaceC8688g
    /* JADX INFO: renamed from: l */
    public final void mo1965l(boolean z10) {
        mo1959f(z10, true);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[LOOP:1: B:41:0x0092->B:46:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4 A[LOOP:2: B:55:0x00c1->B:59:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p351r0.InterfaceC8690i
    /* JADX INFO: renamed from: m */
    public final boolean mo1966m(KeyEvent keyEvent) {
        Object obj;
        InterfaceC1291d interfaceC1291d;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        InterfaceC0500b.c cVarM12650c;
        C5207g.m11111f(keyEvent, "keyEvent");
        FocusTargetModifierNode focusTargetModifierNodeM16943a = C8698q.m16943a(this.f3364a);
        if (focusTargetModifierNodeM16943a == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        InterfaceC0500b.c cVar = focusTargetModifierNodeM16943a.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((cVar.f3328c & 9216) != 0) {
            InterfaceC0500b.c cVar2 = cVar.f3330e;
            obj = null;
            while (true) {
                if (cVar2 != null) {
                    int i12 = cVar2.f3327b;
                    if ((i12 & 9216) != 0) {
                        if ((i12 & 1024) != 0) {
                            interfaceC1291d = (InterfaceC1291d) obj;
                            break;
                        }
                        if (!(cVar2 instanceof InterfaceC1291d)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        obj = cVar2;
                    }
                    cVar2 = cVar2.f3330e;
                }
            }
            if (interfaceC1291d == null) {
                cVarM12650c = C6139d.m12650c(focusTargetModifierNodeM16943a, 8192);
                if (!(cVarM12650c instanceof InterfaceC1291d)) {
                    cVarM12650c = null;
                }
                interfaceC1291d = (InterfaceC1291d) cVarM12650c;
            }
            if (interfaceC1291d != null) {
                ArrayList arrayListM12649b = C6139d.m12649b(interfaceC1291d, 8192);
                arrayList = arrayListM12649b instanceof List ? arrayListM12649b : null;
                if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                    while (true) {
                        i11 = size2 - 1;
                        if (((InterfaceC1291d) arrayList.get(size2)).mo4792h(keyEvent)) {
                            return true;
                        }
                        if (i11 < 0) {
                            break;
                        }
                        size2 = i11;
                    }
                }
                if (!interfaceC1291d.mo4792h(keyEvent) || interfaceC1291d.mo4793l(keyEvent)) {
                    return true;
                }
                if (arrayList != null) {
                    size = arrayList.size();
                    for (i10 = 0; i10 < size; i10++) {
                        if (((InterfaceC1291d) arrayList.get(i10)).mo4793l(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        obj = null;
        interfaceC1291d = (InterfaceC1291d) obj;
        if (interfaceC1291d == null) {
            cVarM12650c = C6139d.m12650c(focusTargetModifierNodeM16943a, 8192);
            if (!(cVarM12650c instanceof InterfaceC1291d)) {
                cVarM12650c = null;
            }
            interfaceC1291d = (InterfaceC1291d) cVarM12650c;
        }
        if (interfaceC1291d != null) {
            ArrayList arrayListM12649b2 = C6139d.m12649b(interfaceC1291d, 8192);
            if (arrayListM12649b2 instanceof List) {
            }
            if (arrayList != null) {
                while (true) {
                    i11 = size2 - 1;
                    if (((InterfaceC1291d) arrayList.get(size2)).mo4792h(keyEvent)) {
                        return true;
                    }
                    if (i11 < 0) {
                        break;
                        break;
                    }
                    size2 = i11;
                }
            }
            if (!interfaceC1291d.mo4792h(keyEvent)) {
                return true;
            }
            if (arrayList != null) {
                size = arrayList.size();
                while (i10 < size) {
                    if (((InterfaceC1291d) arrayList.get(i10)).mo4793l(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
