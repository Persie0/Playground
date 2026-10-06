package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class nai extends nan implements Collection {
    private static final long serialVersionUID = 0;

    public nai(Collection collection, Object obj) {
        super(collection, obj);
    }

    /* JADX INFO: renamed from: a */
    public Collection mo17199a() {
        return (Collection) this.f41901g;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f41902h) {
            zAdd = mo17199a().add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f41902h) {
            zAddAll = mo17199a().addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f41902h) {
            mo17199a().clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f41902h) {
            zContains = mo17199a().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f41902h) {
            zContainsAll = mo17199a().containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f41902h) {
            zIsEmpty = mo17199a().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return mo17199a().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f41902h) {
            zRemove = mo17199a().remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f41902h) {
            zRemoveAll = mo17199a().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f41902h) {
            zRetainAll = mo17199a().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f41902h) {
            size = mo17199a().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f41902h) {
            array = mo17199a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f41902h) {
            array = mo17199a().toArray(objArr);
        }
        return array;
    }
}
