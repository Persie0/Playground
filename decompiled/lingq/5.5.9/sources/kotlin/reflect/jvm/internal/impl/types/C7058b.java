package kotlin.reflect.jvm.internal.impl.types;

import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p102eo.AbstractC5439d;
import p543do.AbstractC5257t;
import p543do.AbstractC5264w0;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7058b extends AbstractC5264w0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2076h f39900b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2041a<AbstractC5257t> f39901c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e<AbstractC5257t> f39902d;

    /* JADX WARN: Multi-variable type inference failed */
    public C7058b(InterfaceC2076h interfaceC2076h, InterfaceC2041a<? extends AbstractC5257t> interfaceC2041a) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        this.f39900b = interfaceC2076h;
        this.f39901c = interfaceC2041a;
        this.f39902d = interfaceC2076h.mo6217b(interfaceC2041a);
    }

    @Override // p543do.AbstractC5257t
    /* JADX INFO: renamed from: Z0 */
    public final AbstractC5257t mo11218c1(final AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        return new C7058b(this.f39900b, new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5257t mo807E() {
                return abstractC5439d.mo11663o0(this.f39901c.mo807E());
            }
        });
    }

    @Override // p543do.AbstractC5264w0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5257t mo11307b1() {
        return this.f39902d.mo807E();
    }

    @Override // p543do.AbstractC5264w0
    /* JADX INFO: renamed from: c1 */
    public final boolean mo11308c1() {
        return ((LockBasedStorageManager.C7040f) this.f39902d).m14165b();
    }
}
