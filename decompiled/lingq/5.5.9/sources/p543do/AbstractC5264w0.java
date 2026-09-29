package p543do;

import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: renamed from: do.w0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5264w0 extends AbstractC5257t {
    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return mo11307b1().mo11240V0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        return mo11307b1().mo11241W0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return mo11307b1().mo11250X0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return mo11307b1().mo11242Y0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: a1 */
    public final AbstractC5262v0 mo11288a1() {
        AbstractC5257t abstractC5257tMo11307b1 = mo11307b1();
        while (abstractC5257tMo11307b1 instanceof AbstractC5264w0) {
            abstractC5257tMo11307b1 = ((AbstractC5264w0) abstractC5257tMo11307b1).mo11307b1();
        }
        C5207g.m11109d(abstractC5257tMo11307b1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC5262v0) abstractC5257tMo11307b1;
    }

    /* JADX INFO: renamed from: b1 */
    public abstract AbstractC5257t mo11307b1();

    /* JADX INFO: renamed from: c1 */
    public boolean mo11308c1() {
        return true;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return mo11307b1().mo11245q();
    }

    public final String toString() {
        return mo11308c1() ? mo11307b1().toString() : "<Not computed yet>";
    }
}
