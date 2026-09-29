package p427v3;

import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import dm.C5207g;

/* JADX INFO: renamed from: v3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9635b implements C1042k0.b {

    /* JADX INFO: renamed from: a */
    public final C9637d<?>[] f49331a;

    public C9635b(C9637d<?>... c9637dArr) {
        C5207g.m11111f(c9637dArr, "initializers");
        this.f49331a = c9637dArr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: a */
    public final AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
        AbstractC1036h0 abstractC1036h0 = null;
        for (C9637d<?> c9637d : this.f49331a) {
            if (C5207g.m11106a(c9637d.f49332a, cls)) {
                Object objMo528n = c9637d.f49333b.mo528n(c9636c);
                abstractC1036h0 = objMo528n instanceof AbstractC1036h0 ? (AbstractC1036h0) objMo528n : null;
            }
        }
        if (abstractC1036h0 != null) {
            return abstractC1036h0;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
