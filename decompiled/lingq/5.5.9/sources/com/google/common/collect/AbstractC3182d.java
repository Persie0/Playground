package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.collect.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3182d<K, V> implements InterfaceC3203v<K, V> {

    /* JADX INFO: renamed from: a */
    public transient AbstractMapBasedMultimap.C3131c f16149a;

    /* JADX INFO: renamed from: b */
    public transient a f16150b;

    /* JADX INFO: renamed from: c */
    public transient AbstractMapBasedMultimap.C3129a f16151c;

    /* JADX INFO: renamed from: com.google.common.collect.d$a */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractMapBasedMultimap) AbstractC3182d.this).m9020c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<V> it = ((C3201t) AbstractC3182d.this.mo9019b().values()).iterator();
            while (it.hasNext()) {
                if (((Collection) it.next()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = (AbstractMapBasedMultimap) AbstractC3182d.this;
            abstractMapBasedMultimap.getClass();
            return new C3178b(abstractMapBasedMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractMapBasedMultimap) AbstractC3182d.this).f15985e;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3203v) {
            return ((AbstractListMultimap) this).mo9019b().equals(((InterfaceC3203v) obj).mo9019b());
        }
        return false;
    }

    public final int hashCode() {
        return mo9019b().hashCode();
    }

    public final String toString() {
        return mo9019b().toString();
    }
}
