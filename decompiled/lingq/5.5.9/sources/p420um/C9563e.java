package p420um;

import bo.C1631i;
import dm.C5207g;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: um.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9563e implements InterfaceC5240k0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractTypeAliasDescriptor f49182a;

    public C9563e(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f49182a = abstractTypeAliasDescriptor;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        return DescriptorUtilsKt.m14108e(this.f49182a);
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection<AbstractC5257t> mo11278p() {
        Collection<AbstractC5257t> collectionMo11278p = ((C1631i) this.f49182a).mo5314n0().mo11250X0().mo11278p();
        C5207g.m11110e(collectionMo11278p, "declarationDescriptor.un…pe.constructor.supertypes");
        return collectionMo11278p;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: q */
    public final InterfaceC8834e mo11235q() {
        return this.f49182a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        List list = ((C1631i) this.f49182a).f9169L;
        if (list != null) {
            return list;
        }
        C5207g.m11117l("typeConstructorParameters");
        throw null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f49182a.mo11874a().m15235f() + ']';
    }
}
