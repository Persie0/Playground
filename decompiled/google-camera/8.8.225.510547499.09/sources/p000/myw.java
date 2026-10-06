package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myw extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mtq f41825a;

    public myw(mtq mtqVar) {
        this.f41825a = mtqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41825a.mo16906j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f41825a.mo16914s(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new msz((mtm) this.f41825a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f41825a.mo16916u(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((mtm) this.f41825a).f41599b;
    }

    public myw() {
    }
}
