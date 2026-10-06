package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtb implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f41573a;

    /* JADX INFO: renamed from: b */
    Collection f41574b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mtc f41575c;

    public mtb(mtc mtcVar) {
        this.f41575c = mtcVar;
        this.f41573a = mtcVar.f41576a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41573a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f41573a.next();
        this.f41574b = (Collection) entry.getValue();
        mtc mtcVar = this.f41575c;
        Object key = entry.getKey();
        return mkv.m16496D(key, mtcVar.f41577b.mo16886c(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        lku.m15614I(this.f41574b != null, "no calls to next() since the last call to remove()");
        this.f41573a.remove();
        mtm.m16900o(this.f41575c.f41577b, this.f41574b.size());
        this.f41574b.clear();
        this.f41574b = null;
    }
}
