package tl;

import java.util.Iterator;
import p249lo.InterfaceC7415h;

/* JADX INFO: renamed from: tl.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C9329q implements InterfaceC7415h<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable f48064a;

    public C9329q(Iterable iterable) {
        this.f48064a = iterable;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<Object> iterator() {
        return this.f48064a.iterator();
    }
}
