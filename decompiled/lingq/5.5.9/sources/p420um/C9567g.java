package p420um;

import cm.InterfaceC2041a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: renamed from: um.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9567g implements InterfaceC2041a<MemberScope> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9569h f49190a;

    public C9567g(C9569h c9569h) {
        this.f49190a = c9569h;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final MemberScope mo807E() {
        StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
        C9569h c9569h = this.f49190a;
        sb2.append(c9569h.f49193a.m15235f());
        return TypeIntersectionScope.C7016a.m14120a(sb2.toString(), c9569h.f49194b.getUpperBounds());
    }
}
