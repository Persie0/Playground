package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.common.collect.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3181c0 extends C3183d0.d<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f16147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f16148b;

    public C3181c0(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f16147a = immutableSet;
        this.f16148b = immutableSet2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16147a.contains(obj) && this.f16148b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f16147a.containsAll(collection) && this.f16148b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f16148b, this.f16147a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3179b0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f16147a.iterator();
        int i10 = 0;
        while (true) {
            while (it.hasNext()) {
                if (this.f16148b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }
}
