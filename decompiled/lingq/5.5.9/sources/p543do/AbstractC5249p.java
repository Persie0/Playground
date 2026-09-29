package p543do;

import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p139go.InterfaceC5850d;
import p306on.InterfaceC8093b;

/* JADX INFO: renamed from: do.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5249p extends AbstractC5262v0 implements InterfaceC5850d {

    /* JADX INFO: renamed from: b */
    public final AbstractC5265x f33340b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5265x f33341c;

    public AbstractC5249p(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        C5207g.m11111f(abstractC5265x, "lowerBound");
        C5207g.m11111f(abstractC5265x2, "upperBound");
        this.f33340b = abstractC5265x;
        this.f33341c = abstractC5265x2;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return mo11283e1().mo11240V0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public C5238j0 mo11241W0() {
        return mo11283e1().mo11241W0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return mo11283e1().mo11250X0();
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public boolean mo11242Y0() {
        return mo11283e1().mo11242Y0();
    }

    /* JADX INFO: renamed from: e1 */
    public abstract AbstractC5265x mo11283e1();

    /* JADX INFO: renamed from: f1 */
    public abstract String mo11284f1(DescriptorRenderer descriptorRenderer, InterfaceC8093b interfaceC8093b);

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public MemberScope mo11245q() {
        return mo11283e1().mo11245q();
    }

    public String toString() {
        return DescriptorRenderer.f39547b.mo13985u(this);
    }
}
