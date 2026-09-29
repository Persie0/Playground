package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.ModifierNodeOwnerScope;
import cm.InterfaceC2041a;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: i1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6134a0 {
    /* JADX INFO: renamed from: a */
    public static final <T extends InterfaceC0500b.c & InterfaceC6171z> void m12646a(T t10, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(t10, "<this>");
        ModifierNodeOwnerScope modifierNodeOwnerScope = t10.f3331f;
        if (modifierNodeOwnerScope == null) {
            modifierNodeOwnerScope = new ModifierNodeOwnerScope(t10);
            t10.f3331f = modifierNodeOwnerScope;
        }
        C6139d.m12653f(t10).getSnapshotObserver().m2205b(modifierNodeOwnerScope, ModifierNodeOwnerScope.f3821b, interfaceC2041a);
    }
}
