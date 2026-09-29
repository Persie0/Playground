package tl;

import cm.InterfaceC2041a;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: tl.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C9332t<T> implements Iterable<C9331s<? extends T>>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<Iterator<T>> f48068a;

    /* JADX WARN: Multi-variable type inference failed */
    public C9332t(InterfaceC2041a<? extends Iterator<? extends T>> interfaceC2041a) {
        this.f48068a = interfaceC2041a;
    }

    @Override // java.lang.Iterable
    public final Iterator<C9331s<T>> iterator() {
        return new C9333u(this.f48068a.mo807E());
    }
}
