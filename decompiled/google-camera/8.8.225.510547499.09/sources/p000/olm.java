package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olm extends okr implements Set, Serializable {

    /* JADX INFO: renamed from: a */
    public final olh f46260a;

    public olm() {
        this(new olh());
    }

    @Override // p000.okr
    /* JADX INFO: renamed from: a */
    public final int mo18596a() {
        return this.f46260a.f46247e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f46260a.m18623a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f46260a.m18628f();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46260a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f46260a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f46260a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f46260a.m18634l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f46260a.m18626d(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f46260a.m18628f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f46260a.m18628f();
        return super.retainAll(collection);
    }

    public olm(olh olhVar) {
        this.f46260a = olhVar;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f46260a.f46248f) {
            return new olk(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }
}
