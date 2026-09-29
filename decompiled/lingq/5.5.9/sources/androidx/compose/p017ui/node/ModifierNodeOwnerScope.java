package androidx.compose.p017ui.node;

import cm.InterfaceC2052l;
import dm.C5207g;
import p166i1.InterfaceC6142e0;
import p166i1.InterfaceC6171z;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierNodeOwnerScope implements InterfaceC6142e0 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2052l<ModifierNodeOwnerScope, C9072e> f3821b = new InterfaceC2052l<ModifierNodeOwnerScope, C9072e>() { // from class: androidx.compose.ui.node.ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(ModifierNodeOwnerScope modifierNodeOwnerScope) {
            ModifierNodeOwnerScope modifierNodeOwnerScope2 = modifierNodeOwnerScope;
            C5207g.m11111f(modifierNodeOwnerScope2, "it");
            if (modifierNodeOwnerScope2.mo2089o()) {
                modifierNodeOwnerScope2.f3822a.mo1975x();
            }
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: a */
    public final InterfaceC6171z f3822a;

    public ModifierNodeOwnerScope(InterfaceC6171z interfaceC6171z) {
        C5207g.m11111f(interfaceC6171z, "observerNode");
        this.f3822a = interfaceC6171z;
    }

    @Override // p166i1.InterfaceC6142e0
    /* JADX INFO: renamed from: o */
    public final boolean mo2089o() {
        return this.f3822a.mo1934v().f3335j;
    }
}
