package p543do;

import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p102eo.AbstractC5439d;

/* JADX INFO: renamed from: do.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5241l extends AbstractC5265x {
    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return mo11221g1().mo11240V0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public C5238j0 mo11241W0() {
        return mo11221g1().mo11241W0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return mo11221g1().mo11250X0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public boolean mo11242Y0() {
        return mo11221g1().mo11242Y0();
    }

    /* JADX INFO: renamed from: g1 */
    public abstract AbstractC5265x mo11221g1();

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC5265x mo11218c1(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(mo11221g1());
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo11223i1((AbstractC5265x) abstractC5257tMo11663o0);
    }

    /* JADX INFO: renamed from: i1 */
    public abstract AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x);

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return mo11221g1().mo11245q();
    }
}
