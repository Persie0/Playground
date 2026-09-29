package p373rn;

import dm.C5207g;
import p003a2.C0009a;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: rn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C8887s extends AbstractC8875g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8887s(String str) {
        super(str);
        C5207g.m11111f(str, "value");
    }

    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "module");
        return interfaceC8863u.mo11877o().m13563v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p373rn.AbstractC8875g
    public final String toString() {
        return C0009a.m22j(new StringBuilder("\""), (String) this.f46772a, '\"');
    }
}
