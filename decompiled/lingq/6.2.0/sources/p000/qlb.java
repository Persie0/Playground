package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qlb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f57918a;

    public qlb(Iterator it) {
        this.f57918a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57918a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new xmb((String) this.f57918a.next());
    }
}
