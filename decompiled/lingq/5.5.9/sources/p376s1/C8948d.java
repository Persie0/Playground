package p376s1;

import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: s1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8948d implements Collection<C8947c>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final List<C8947c> f46915a;

    /* JADX INFO: renamed from: b */
    public final int f46916b;

    public C8948d(List<C8947c> list) {
        this.f46915a = list;
        this.f46916b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C8947c c8947c) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C8947c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C8947c)) {
            return false;
        }
        C8947c c8947c = (C8947c) obj;
        C5207g.m11111f(c8947c, "element");
        return this.f46915a.contains(c8947c);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        return this.f46915a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8948d) {
            return C5207g.m11106a(this.f46915a, ((C8948d) obj).f46915a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f46915a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f46915a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C8947c> iterator() {
        return this.f46915a.iterator();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super C8947c> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f46916b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f46915a + ')';
    }
}
