package p373rn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: rn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C8884p extends AbstractC8881m {
    public C8884p(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        AbstractC6795c abstractC6795cMo11877o = interfaceC8863u.mo11877o();
        abstractC6795cMo11877o.getClass();
        AbstractC5265x abstractC5265xM13562t = abstractC6795cMo11877o.m13562t(PrimitiveType.LONG);
        if (abstractC5265xM13562t != null) {
            return abstractC5265xM13562t;
        }
        AbstractC6795c.m13540a(59);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p373rn.AbstractC8875g
    public final String toString() {
        return ((Number) this.f46772a).longValue() + ".toLong()";
    }
}
