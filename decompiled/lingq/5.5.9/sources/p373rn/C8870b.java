package p373rn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: rn.b */
/* JADX INFO: loaded from: classes2.dex */
public class C8870b extends AbstractC8875g<List<? extends AbstractC8875g<?>>> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<InterfaceC8863u, AbstractC5257t> f46769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8870b(List<? extends AbstractC8875g<?>> list, InterfaceC2052l<? super InterfaceC8863u, ? extends AbstractC5257t> interfaceC2052l) {
        super(list);
        C5207g.m11111f(list, "value");
        C5207g.m11111f(interfaceC2052l, "computeType");
        this.f46769b = interfaceC2052l;
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        AbstractC5257t abstractC5257tMo528n = this.f46769b.mo528n(interfaceC8863u);
        if (!AbstractC6795c.m13546z(abstractC5257tMo528n) && !AbstractC6795c.m13534G(abstractC5257tMo528n) && !AbstractC6795c.m13530C(abstractC5257tMo528n, C6797e.a.f38370V.m15221i()) && !AbstractC6795c.m13530C(abstractC5257tMo528n, C6797e.a.f38371W.m15221i()) && !AbstractC6795c.m13530C(abstractC5257tMo528n, C6797e.a.f38372X.m15221i())) {
            AbstractC6795c.m13530C(abstractC5257tMo528n, C6797e.a.f38373Y.m15221i());
        }
        return abstractC5257tMo528n;
    }
}
