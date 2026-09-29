package p420um;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import mn.C7648e;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: um.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9569h implements InterfaceC2041a<AbstractC5265x> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7648e f49193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9571i f49194b;

    public C9569h(AbstractC9571i abstractC9571i, C7648e c7648e) {
        this.f49194b = abstractC9571i;
        this.f49193a = c7648e;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final AbstractC5265x mo807E() {
        C5238j0.f33329b.getClass();
        C5238j0 c5238j0 = C5238j0.f33330c;
        InterfaceC5240k0 interfaceC5240k0Mo13600k = this.f49194b.mo13600k();
        List listEmptyList = Collections.emptyList();
        C9567g c9567g = new C9567g(this);
        LockBasedStorageManager.C7035a c7035a = LockBasedStorageManager.f39828e;
        C5207g.m11110e(c7035a, "NO_LOCKS");
        return KotlinTypeFactory.m14189h(listEmptyList, new LazyScopeAdapter(c7035a, c9567g), c5238j0, interfaceC5240k0Mo13600k, false);
    }
}
