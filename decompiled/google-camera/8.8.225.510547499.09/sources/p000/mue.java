package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mue extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    final Collection f41630a;

    /* JADX INFO: renamed from: b */
    final mrf f41631b;

    public mue(Collection collection, mrf mrfVar) {
        this.f41630a = collection;
        this.f41631b = mrfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41630a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f41630a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return mkv.m16510R(this.f41630a.iterator(), this.f41631b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41630a.size();
    }
}
