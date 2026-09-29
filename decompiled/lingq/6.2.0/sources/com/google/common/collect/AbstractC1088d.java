package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.common.collect.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1088d implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f13453a;

    /* JADX INFO: renamed from: b */
    public Object f13454b = null;

    /* JADX INFO: renamed from: c */
    public Collection f13455c = null;

    /* JADX INFO: renamed from: d */
    public Iterator f13456d = Iterators$EmptyModifiableIterator.INSTANCE;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractMapBasedMultimap f13457e;

    public AbstractC1088d(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        this.f13457e = abstractMapBasedMultimap;
        this.f13453a = abstractMapBasedMultimap.f13381d.entrySet().iterator();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo3154a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13453a.hasNext() || this.f13456d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f13456d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13453a.next();
            this.f13454b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13455c = collection;
            this.f13456d = collection.iterator();
        }
        return this.f13456d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13456d.remove();
        Collection collection = this.f13455c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13453a.remove();
        }
        this.f13457e.f13382e--;
    }
}
