package p105f0;

import android.support.v4.media.C0141b;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p100em.InterfaceC5429a;
import p338qd.C8573r0;
import tl.C9322j;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5455c<T> implements Set<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f34008a;

    /* JADX INFO: renamed from: b */
    public Object[] f34009b = new Object[16];

    /* JADX INFO: renamed from: f0.c$a */
    public static final class a implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public int f34010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C5455c<T> f34011b;

        public a(C5455c<T> c5455c) {
            this.f34011b = c5455c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f34010a < this.f34011b.f34008a;
        }

        @Override // java.util.Iterator
        public final T next() {
            Object[] objArr = this.f34011b.f34009b;
            int i10 = this.f34010a;
            this.f34010a = i10 + 1;
            T t10 = (T) objArr[i10];
            C5207g.m11109d(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11678a(Object obj) {
        int i10 = this.f34008a - 1;
        int iIdentityHashCode = System.identityHashCode(obj);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            T t10 = get(i12);
            int iIdentityHashCode2 = System.identityHashCode(t10);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (t10 == obj) {
                        return i12;
                    }
                    for (int i13 = i12 - 1; -1 < i13; i13--) {
                        Object obj2 = this.f34009b[i13];
                        if (obj2 == obj) {
                            return i13;
                        }
                        if (System.identityHashCode(obj2) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i14 = i12 + 1;
                    int i15 = this.f34008a;
                    while (i14 < i15) {
                        Object obj3 = this.f34009b[i14];
                        if (obj3 == obj) {
                            return i14;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            return -(i14 + 1);
                        }
                        i14++;
                    }
                    i14 = this.f34008a;
                    return -(i14 + 1);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t10) {
        int iM11678a;
        C5207g.m11111f(t10, "value");
        if (this.f34008a > 0) {
            iM11678a = m11678a(t10);
            if (iM11678a >= 0) {
                return false;
            }
        } else {
            iM11678a = -1;
        }
        int i10 = -(iM11678a + 1);
        int i11 = this.f34008a;
        Object[] objArr = this.f34009b;
        if (i11 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            C9322j.m17673a0(i10 + 1, i10, i11, objArr, objArr2);
            C9322j.m17675c0(this.f34009b, objArr2, 0, 0, i10, 6);
            this.f34009b = objArr2;
        } else {
            C9322j.m17673a0(i10 + 1, i10, i11, objArr, objArr);
        }
        this.f34009b[i10] = t10;
        this.f34008a++;
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        C9322j.m17679g0(this.f34009b, null);
        this.f34008a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return m11678a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final T get(int i10) {
        if (i10 >= 0 && i10 < this.f34008a) {
            T t10 = (T) this.f34009b[i10];
            C5207g.m11109d(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }
        StringBuilder sbM614j = C0141b.m614j("Index ", i10, ", size ");
        sbM614j.append(this.f34008a);
        throw new IndexOutOfBoundsException(sbM614j.toString());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f34008a == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t10) {
        int iM11678a;
        if (t10 == null || (iM11678a = m11678a(t10)) < 0) {
            return false;
        }
        int i10 = this.f34008a;
        if (iM11678a < i10 - 1) {
            Object[] objArr = this.f34009b;
            C9322j.m17673a0(iM11678a, iM11678a + 1, i10, objArr, objArr);
        }
        int i11 = this.f34008a - 1;
        this.f34008a = i11;
        this.f34009b[i11] = null;
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f34008a;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C8573r0.m16728h1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C5207g.m11111f(tArr, "array");
        return (T[]) C8573r0.m16730i1(this, tArr);
    }
}
