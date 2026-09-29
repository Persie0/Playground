package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class xi5 implements Collection, tg4 {

    /* JADX INFO: renamed from: c */
    public static final xi5 f68250c = new xi5(EmptyList.f47638a);

    /* JADX INFO: renamed from: a */
    public final List f68251a;

    /* JADX INFO: renamed from: b */
    public final int f68252b;

    public xi5(String str) {
        List listM23365A0 = vk9.m23365A0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(listM23365A0.size());
        int size = listM23365A0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(vk9.m23376L0((String) listM23365A0.get(i)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new ti5((String) arrayList.get(i2)));
        }
        this(arrayList2);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ti5)) {
            return false;
        }
        return this.f68251a.contains((ti5) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f68251a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xi5) {
            return fa4.m11650l(this.f68251a, ((xi5) obj).f68251a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f68251a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f68251a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f68251a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f68252b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f68251a + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }

    public xi5(List list) {
        this.f68251a = list;
        this.f68252b = list.size();
    }
}
