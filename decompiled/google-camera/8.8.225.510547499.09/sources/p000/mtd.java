package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mtd implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f41578a;

    /* JADX INFO: renamed from: b */
    Object f41579b = null;

    /* JADX INFO: renamed from: c */
    Collection f41580c = null;

    /* JADX INFO: renamed from: d */
    Iterator f41581d = mye.INSTANCE;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ mtm f41582e;

    public mtd(mtm mtmVar) {
        this.f41582e = mtmVar;
        this.f41578a = mtmVar.f41598a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo16888a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41578a.hasNext() || this.f41581d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f41581d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f41578a.next();
            this.f41579b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f41580c = collection;
            this.f41581d = collection.iterator();
        }
        return mo16888a(this.f41579b, this.f41581d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41581d.remove();
        Collection collection = this.f41580c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f41578a.remove();
        }
        mtm.m16898m(this.f41582e);
    }
}
