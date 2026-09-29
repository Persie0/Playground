package kotlin.reflect.jvm.internal.impl.renderer;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p543do.AbstractC5257t;
import p543do.InterfaceC5246n0;

/* JADX INFO: loaded from: classes2.dex */
final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements InterfaceC2052l<InterfaceC5246n0, CharSequence> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DescriptorRendererImpl f39564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.f39564b = descriptorRendererImpl;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final CharSequence mo528n(InterfaceC5246n0 interfaceC5246n0) {
        InterfaceC5246n0 interfaceC5246n1 = interfaceC5246n0;
        C5207g.m11111f(interfaceC5246n1, "it");
        if (interfaceC5246n1.mo11239f()) {
            return "*";
        }
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n1.mo11236c();
        C5207g.m11110e(abstractC5257tMo11236c, "it.type");
        String strMo13985u = this.f39564b.mo13985u(abstractC5257tMo11236c);
        if (interfaceC5246n1.mo11237d() == Variance.INVARIANT) {
            return strMo13985u;
        }
        return interfaceC5246n1.mo11237d() + ' ' + strMo13985u;
    }
}
