package p021j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.concurrent.b */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0524b implements Collection, Serializable {

    /* JADX INFO: renamed from: a */
    final ConcurrentHashMap f33201a;

    AbstractC0524b(ConcurrentHashMap concurrentHashMap) {
        this.f33201a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f33201a.clear();
    }

    @Override // java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f33201a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.Collection, java.util.Set
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        C0533k[] c0533kArr = this.f33201a.f33185a;
        boolean zRemove = false;
        if (c0533kArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= c0533kArr.length) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
        } else {
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f33201a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long jM12556k = this.f33201a.m12556k();
        if (jM12556k < 0) {
            jM12556k = 0;
        }
        if (jM12556k > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i = (int) jM12556k;
        Object[] objArrCopyOf = new Object[i];
        int i2 = 0;
        for (Object obj : this) {
            if (i2 == i) {
                if (i >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                i = i3;
            }
            objArrCopyOf[i2] = obj;
            i2++;
        }
        return i2 == i ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long jM12556k = this.f33201a.m12556k();
        if (jM12556k < 0) {
            jM12556k = 0;
        }
        if (jM12556k > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i = (int) jM12556k;
        Object[] objArrCopyOf = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        int length = objArrCopyOf.length;
        int i2 = 0;
        for (Object obj : this) {
            if (i2 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                length = i3;
            }
            objArrCopyOf[i2] = obj;
            i2++;
        }
        if (objArr != objArrCopyOf || i2 >= length) {
            return i2 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i2);
        }
        objArrCopyOf[i2] = null;
        return objArrCopyOf;
    }
}
