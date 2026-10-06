package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyf implements Iterator {

    /* JADX INFO: renamed from: a */
    private final Iterator f45017a;

    public nyf(Iterator it) {
        this.f45017a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45017a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f45017a.next();
        return entry.getValue() instanceof nyg ? new nye(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45017a.remove();
    }
}
