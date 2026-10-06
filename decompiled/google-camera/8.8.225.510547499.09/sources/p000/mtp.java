package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mtp extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mtq f41600a;

    public mtp(mtq mtqVar) {
        this.f41600a = mtqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41600a.mo16906j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f41600a.mo16912q().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f41600a.mo16902f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41600a.mo16901e();
    }
}
