package p249lo;

import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: lo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C7420m implements Iterable<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7415h f41259a;

    public C7420m(InterfaceC7415h interfaceC7415h) {
        this.f41259a = interfaceC7415h;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f41259a.iterator();
    }
}
