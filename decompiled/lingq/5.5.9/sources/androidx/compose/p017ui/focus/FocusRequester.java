package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import dm.C5207g;
import p105f0.C5458f;
import p166i1.C6139d;
import p351r0.InterfaceC8695n;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequester {

    /* JADX INFO: renamed from: b */
    public static final FocusRequester f3386b = new FocusRequester();

    /* JADX INFO: renamed from: c */
    public static final FocusRequester f3387c = new FocusRequester();

    /* JADX INFO: renamed from: a */
    public final C5458f<InterfaceC8695n> f3388a = new C5458f<>(new InterfaceC8695n[16]);

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final boolean m1969a(InterfaceC2052l<? super FocusTargetModifierNode, Boolean> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "onFound");
        if (!(!C5207g.m11106a(this, f3386b))) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (!(!C5207g.m11106a(this, f3387c))) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        C5458f<InterfaceC8695n> c5458f = this.f3388a;
        if (!c5458f.m11695l()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int i10 = c5458f.f34019c;
        int i11 = 0;
        if (i10 <= 0) {
            return false;
        }
        InterfaceC8695n[] interfaceC8695nArr = c5458f.f34017a;
        boolean z10 = false;
        do {
            InterfaceC8695n interfaceC8695n = interfaceC8695nArr[i11];
            if (!interfaceC8695n.mo1934v().f3335j) {
                throw new IllegalStateException("Check failed.".toString());
            }
            C5458f c5458f2 = new C5458f(new InterfaceC0500b.c[16]);
            InterfaceC0500b.c cVar = interfaceC8695n.mo1934v().f3330e;
            if (cVar == null) {
                C6139d.m12648a(c5458f2, interfaceC8695n.mo1934v());
            } else {
                c5458f2.m11687b(cVar);
            }
            while (c5458f2.m11695l()) {
                InterfaceC0500b.c cVar2 = (InterfaceC0500b.c) c5458f2.m11697n(c5458f2.f34019c - 1);
                if ((cVar2.f3328c & 1024) == 0) {
                    C6139d.m12648a(c5458f2, cVar2);
                } else {
                    while (cVar2 != null) {
                        if ((cVar2.f3327b & 1024) != 0) {
                            if (!(cVar2 instanceof FocusTargetModifierNode) || !interfaceC2052l.mo528n((FocusTargetModifierNode) cVar2).booleanValue()) {
                                break;
                            }
                            z10 = true;
                            break;
                        }
                        cVar2 = cVar2.f3330e;
                    }
                }
            }
            i11++;
        } while (i11 < i10);
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m1970b() {
        m1969a(new InterfaceC2052l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(FocusTargetModifierNode focusTargetModifierNode) {
                FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNode;
                C5207g.m11111f(focusTargetModifierNode2, "it");
                return Boolean.valueOf(FocusTransactionsKt.m1978c(focusTargetModifierNode2));
            }
        });
    }
}
