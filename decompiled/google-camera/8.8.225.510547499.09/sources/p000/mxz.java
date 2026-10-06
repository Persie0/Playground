package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mxz extends naz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Iterator f41786a;

    public mxz(Iterator it) {
        this.f41786a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41786a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f41786a.next();
    }
}
