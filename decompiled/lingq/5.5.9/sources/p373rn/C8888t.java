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

/* JADX INFO: renamed from: rn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C8888t extends AbstractC8881m {
    public C8888t(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863u, C6797e.a.f38366R);
        AbstractC5265x abstractC5265xMo5316v = interfaceC8830cM13584a != null ? interfaceC8830cM13584a.mo5316v() : null;
        if (abstractC5265xMo5316v == null) {
            abstractC5265xMo5316v = C5602h.m11912c(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte");
        }
        return abstractC5265xMo5316v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p373rn.AbstractC8875g
    public final String toString() {
        return ((Number) this.f46772a).intValue() + ".toUByte()";
    }
}
