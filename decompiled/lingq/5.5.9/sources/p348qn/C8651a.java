package p348qn;

import dm.C5207g;
import fo.C5602h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p102eo.AbstractC5439d;
import p139go.InterfaceC5848b;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: qn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8651a extends AbstractC5265x implements InterfaceC5848b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC5246n0 f46225b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8652b f46226c;

    /* JADX INFO: renamed from: d */
    public final boolean f46227d;

    /* JADX INFO: renamed from: e */
    public final C5238j0 f46228e;

    public C8651a(InterfaceC5246n0 interfaceC5246n0, InterfaceC8652b interfaceC8652b, boolean z10, C5238j0 c5238j0) {
        C5207g.m11111f(interfaceC5246n0, "typeProjection");
        C5207g.m11111f(interfaceC8652b, "constructor");
        C5207g.m11111f(c5238j0, "attributes");
        this.f46225b = interfaceC5246n0;
        this.f46226c = interfaceC8652b;
        this.f46227d = z10;
        this.f46228e = c5238j0;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: V0 */
    public final List<InterfaceC5246n0> mo11240V0() {
        return EmptyList.f38032a;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: W0 */
    public final C5238j0 mo11241W0() {
        return this.f46228e;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC5240k0 mo11250X0() {
        return this.f46226c;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11242Y0() {
        return this.f46227d;
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        InterfaceC5246n0 interfaceC5246n0Mo11238e = this.f46225b.mo11238e(abstractC5439d);
        C5207g.m11110e(interfaceC5246n0Mo11238e, "typeProjection.refine(kotlinTypeRefiner)");
        return new C8651a(interfaceC5246n0Mo11238e, this.f46226c, this.f46227d, this.f46228e);
    }

    @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        if (z10 == this.f46227d) {
            return this;
        }
        return new C8651a(this.f46225b, this.f46226c, z10, this.f46228e);
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5262v0 mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        InterfaceC5246n0 interfaceC5246n0Mo11238e = this.f46225b.mo11238e(abstractC5439d);
        C5207g.m11110e(interfaceC5246n0Mo11238e, "typeProjection.refine(kotlinTypeRefiner)");
        return new C8651a(interfaceC5246n0Mo11238e, this.f46226c, this.f46227d, this.f46228e);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11217b1(boolean z10) {
        if (z10 == this.f46227d) {
            return this;
        }
        return new C8651a(this.f46225b, this.f46226c, z10, this.f46228e);
    }

    @Override // p543do.AbstractC5265x
    /* JADX INFO: renamed from: f1 */
    public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new C8651a(this.f46225b, this.f46226c, this.f46227d, c5238j0);
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        return C5602h.m11910a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p543do.AbstractC5265x
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f46225b);
        sb2.append(')');
        sb2.append(this.f46227d ? "?" : "");
        return sb2.toString();
    }
}
