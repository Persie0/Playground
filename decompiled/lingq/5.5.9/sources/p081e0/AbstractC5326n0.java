package p081e0;

import cm.InterfaceC2041a;
import dm.C5207g;

/* JADX INFO: renamed from: e0.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5326n0<T> extends AbstractC5317j<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5326n0(InterfaceC2041a<? extends T> interfaceC2041a) {
        super(interfaceC2041a);
        C5207g.m11111f(interfaceC2041a, "defaultFactory");
    }

    /* JADX INFO: renamed from: b */
    public final C5328o0<T> m11458b(T t10) {
        return new C5328o0<>(this, t10, true);
    }
}
