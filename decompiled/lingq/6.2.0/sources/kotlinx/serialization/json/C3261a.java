package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p000.ey8;
import p000.fa4;
import p000.hf4;
import p000.ss5;
import p000.tg4;
import p000.u91;

/* JADX INFO: renamed from: kotlinx.serialization.json.a */
/* JADX INFO: loaded from: classes.dex */
@ey8(with = hf4.class)
public final class C3261a extends AbstractC3262b implements List<AbstractC3262b>, tg4 {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();

    /* JADX INFO: renamed from: a */
    public final List f48241a;

    public C3261a(List list) {
        list.getClass();
        this.f48241a = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC3262b abstractC3262b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC3262b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC3262b)) {
            return false;
        }
        return this.f48241a.contains((AbstractC3262b) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f48241a.containsAll(collection);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC3262b get(int i) {
        return (AbstractC3262b) this.f48241a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return fa4.m11650l(this.f48241a, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f48241a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC3262b)) {
            return -1;
        }
        return this.f48241a.indexOf((AbstractC3262b) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f48241a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f48241a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC3262b)) {
            return -1;
        }
        return this.f48241a.lastIndexOf((AbstractC3262b) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC3262b> listIterator() {
        return this.f48241a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC3262b remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC3262b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC3262b set(int i, AbstractC3262b abstractC3262b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f48241a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC3262b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC3262b> subList(int i, int i2) {
        return this.f48241a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ss5.m21701a0(this, objArr);
    }

    public final String toString() {
        return u91.m22596N0(this.f48241a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC3262b> listIterator(int i) {
        return this.f48241a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }
}
