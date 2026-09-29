package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class cu3 implements List, tg4 {

    /* JADX INFO: renamed from: a */
    public final h66 f34537a = new h66(16);

    /* JADX INFO: renamed from: b */
    public final x56 f34538b = new x56(16);

    /* JADX INFO: renamed from: c */
    public int f34539c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f34539c = -1;
        this.f34537a.m13093j();
        this.f34538b.f67781b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d16) && indexOf((d16) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d16) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final long m9893d() {
        long jM23494d = AbstractC3695vr.m23494d(Float.POSITIVE_INFINITY, false, false);
        int i = this.f34539c + 1;
        int i2 = this.f34537a.f1294b - 1;
        if (i > i2) {
            return jM23494d;
        }
        while (true) {
            x56 x56Var = this.f34538b;
            if (i < 0) {
                x56Var.getClass();
                break;
            }
            if (i >= x56Var.f67781b) {
                break;
            }
            long j = x56Var.f67780a[i];
            if (omd.m18162r(j, jM23494d) < 0) {
                jM23494d = j;
            }
            if ((omd.m18121J(jM23494d) < 0.0f && omd.m18126P(jM23494d)) || i == i2) {
                return jM23494d;
            }
            i++;
        }
        v63.m23143u("Index must be between 0 and size");
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m9894f(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f34537a.m13096m(i, i2);
        x56 x56Var = this.f34538b;
        if (i >= 0) {
            int i3 = x56Var.f67781b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    C3386nv.m17626m("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = x56Var.f67780a;
                            AbstractC3550rv.m20828V(jArr, jArr, i, i2, i3);
                        }
                        x56Var.f67781b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            x56Var.getClass();
        }
        v63.m23143u("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objM717b = this.f34537a.m717b(i);
        objM717b.getClass();
        return (d16) objM717b;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d16)) {
            return -1;
        }
        d16 d16Var = (d16) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!fa4.m11650l(this.f34537a.m717b(i), d16Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f34537a.m719d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new au3(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d16)) {
            return -1;
        }
        d16 d16Var = (d16) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (fa4.m11650l(this.f34537a.m717b(size), d16Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new au3(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f34537a.f1294b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new bu3(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ss5.m21701a0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new au3(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
