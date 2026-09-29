package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import p466wn.AbstractC9978a;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyScopeAdapter extends AbstractC9978a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2073e<MemberScope> f39664b;

    public LazyScopeAdapter(InterfaceC2076h interfaceC2076h, final InterfaceC2041a<? extends MemberScope> interfaceC2041a) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f39664b = interfaceC2076h.mo6217b(new InterfaceC2041a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$lazyScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final MemberScope mo807E() {
                MemberScope memberScopeMo807E = interfaceC2041a.mo807E();
                return memberScopeMo807E instanceof AbstractC9978a ? ((AbstractC9978a) memberScopeMo807E).m18554h() : memberScopeMo807E;
            }
        });
    }

    @Override // p466wn.AbstractC9978a
    /* JADX INFO: renamed from: i */
    public final MemberScope mo14117i() {
        return this.f39664b.mo807E();
    }
}
