package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import bo.C1631i;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8844j;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p420um.AbstractC9582o;
import p420um.C9563e;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTypeAliasDescriptor extends AbstractC9582o implements InterfaceC8845j0 {

    /* JADX INFO: renamed from: e */
    public final AbstractC8852n f38487e;

    /* JADX INFO: renamed from: f */
    public List<? extends InterfaceC8847k0> f38488f;

    /* JADX INFO: renamed from: g */
    public final C9563e f38489g;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractTypeAliasDescriptor(InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, AbstractC8852n abstractC8852n) {
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(abstractC8852n, "visibilityImpl");
        super(interfaceC8838g, interfaceC9077e, c7648e, aVar);
        this.f38487e = abstractC8852n;
        this.f38489g = new C9563e(this);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14059h(this, d10);
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return false;
    }

    @Override // p420um.AbstractC9582o
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC8844j mo18004P0() {
        return this;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final AbstractC5265x m13624P0() {
        MemberScope memberScopeMo13688N0;
        final C1631i c1631i = (C1631i) this;
        InterfaceC8830c interfaceC8830cMo5315s = c1631i.mo5315s();
        if (interfaceC8830cMo5315s == null || (memberScopeMo13688N0 = interfaceC8830cMo5315s.mo13688N0()) == null) {
            memberScopeMo13688N0 = MemberScope.C7015a.f39670b;
        }
        return C5258t0.m11304o(this, memberScopeMo13688N0, new InterfaceC2052l<AbstractC5439d, AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$computeDefaultType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5265x mo528n(AbstractC5439d abstractC5439d) {
                abstractC5439d.mo11661m0(c1631i);
                return null;
            }
        });
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return false;
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return C5258t0.m11292c(((C1631i) this).mo5314n0(), new InterfaceC2052l<AbstractC5262v0, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(AbstractC5262v0 abstractC5262v0) {
                AbstractC5262v0 abstractC5262v1 = abstractC5262v0;
                C5207g.m11110e(abstractC5262v1, "type");
                boolean z10 = false;
                if (!C7499b.m14926X(abstractC5262v1)) {
                    InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v1.mo11250X0().mo11235q();
                    if ((interfaceC8834eMo11235q instanceof InterfaceC8847k0) && !C5207g.m11106a(((InterfaceC8847k0) interfaceC8834eMo11235q).mo11876g(), this.f38491b)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8834e mo18004P0() {
        return this;
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g mo18004P0() {
        return this;
    }

    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        return this.f38487e;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        return this.f38489g;
    }

    @Override // p420um.AbstractC9581n
    public final String toString() {
        return "typealias " + mo11874a().m15235f();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        List list = this.f38488f;
        if (list != null) {
            return list;
        }
        C5207g.m11117l("declaredTypeParametersImpl");
        throw null;
    }
}
