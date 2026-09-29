package tl;

import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C6744b;
import p100em.InterfaceC5429a;
import p260m8.C7499b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: tl.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9319g<T> implements Collection<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final T[] f48056a;

    /* JADX INFO: renamed from: b */
    public final boolean f48057b;

    public C9319g(T[] tArr, boolean z10) {
        C5207g.m11111f(tArr, "values");
        this.f48056a = tArr;
        this.f48057b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return C6744b.m13377i0(obj, this.f48056a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f48056a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return C7499b.m14931b0(this.f48056a);
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
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f48056a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f48056a;
        C5207g.m11111f(tArr, "<this>");
        if (this.f48057b && C5207g.m11106a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }
}
