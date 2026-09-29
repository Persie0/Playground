package p373rn;

import dm.C5207g;
import fo.C5602h;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: rn.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C8889u extends AbstractC8881m {
    public C8889u(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863u, C6797e.a.f38368T);
        AbstractC5265x abstractC5265xMo5316v = interfaceC8830cM13584a != null ? interfaceC8830cM13584a.mo5316v() : null;
        return abstractC5265xMo5316v == null ? C5602h.m11912c(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC5265xMo5316v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p373rn.AbstractC8875g
    public final String toString() {
        return ((Number) this.f46772a).intValue() + ".toUInt()";
    }
}
