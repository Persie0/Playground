package p162ho;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p348qn.InterfaceC8652b;
import p543do.AbstractC5244m0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: renamed from: ho.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6092b extends AbstractC5244m0 {
    @Override // p543do.AbstractC5244m0
    /* JADX INFO: renamed from: g */
    public final InterfaceC5246n0 mo11246g(InterfaceC5240k0 interfaceC5240k0) {
        C5207g.m11111f(interfaceC5240k0, "key");
        InterfaceC8652b interfaceC8652b = interfaceC5240k0 instanceof InterfaceC8652b ? (InterfaceC8652b) interfaceC5240k0 : null;
        if (interfaceC8652b == null) {
            return null;
        }
        if (interfaceC8652b.mo14219b().mo11239f()) {
            return new C5250p0(interfaceC8652b.mo14219b().mo11236c(), Variance.OUT_VARIANCE);
        }
        return interfaceC8652b.mo14219b();
    }
}
