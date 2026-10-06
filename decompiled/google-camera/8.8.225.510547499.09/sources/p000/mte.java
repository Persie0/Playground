package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mte implements Iterator {

    /* JADX INFO: renamed from: a */
    Map.Entry f41583a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Iterator f41584b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mtf f41585c;

    public mte(mtf mtfVar, Iterator it) {
        this.f41585c = mtfVar;
        this.f41584b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41584b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f41584b.next();
        this.f41583a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        lku.m15614I(this.f41583a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f41583a.getValue();
        this.f41584b.remove();
        mtm.m16900o(this.f41585c.f41586a, collection.size());
        collection.clear();
        this.f41583a = null;
    }
}
