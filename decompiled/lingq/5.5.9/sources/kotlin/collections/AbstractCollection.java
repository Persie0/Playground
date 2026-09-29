package kotlin.collections;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCollection<E> implements Collection<E>, InterfaceC5429a {
    /* JADX INFO: renamed from: a */
    public abstract int mo1847a();

    @Override // java.util.Collection
    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        boolean z10 = false;
        if (!isEmpty()) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                if (C5207g.m11106a(it.next(), e10)) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        boolean z10 = true;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo1847a() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo1847a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }

    public final String toString() {
        return C6752c.m13430X(this, ", ", "[", "]", new InterfaceC2052l<E, CharSequence>(this) { // from class: kotlin.collections.AbstractCollection.toString.1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractCollection<E> f38027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f38027b = this;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(Object obj) {
                return obj == this.f38027b ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24);
    }
}
