package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ws */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1103ws extends AbstractSet {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1109wy f47965a;

    public C1103ws(C1109wy c1109wy) {
        this.f47965a = c1109wy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1106wv(this.f47965a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47965a.f48004d;
    }
}
