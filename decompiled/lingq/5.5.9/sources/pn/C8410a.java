package pn;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;

/* JADX INFO: renamed from: pn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8410a<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return C7499b.m14951m(DescriptorUtilsKt.m14110g((InterfaceC8830c) t10).m15214b(), DescriptorUtilsKt.m14110g((InterfaceC8830c) t11).m15214b());
    }
}
