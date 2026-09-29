package p000;

import androidx.collection.C0039b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j66 implements yg4, Set, tg4 {

    /* JADX INFO: renamed from: a */
    public final i66 f45117a;

    /* JADX INFO: renamed from: b */
    public final i66 f45118b;

    public j66(i66 i66Var) {
        i66Var.getClass();
        this.f45117a = i66Var;
        this.f45118b = i66Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f45118b.m13689b(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i66 i66Var = this.f45118b;
        i66Var.getClass();
        int i = i66Var.f1301g;
        for (Object obj : collection) {
            int iM13691d = i66Var.m13691d(obj);
            i66Var.f1296b[iM13691d] = obj;
            long[] jArr = i66Var.f1297c;
            int i2 = i66Var.f1298d;
            jArr[iM13691d] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iM13691d) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            i66Var.f1298d = iM13691d;
            if (i66Var.f1299e == Integer.MAX_VALUE) {
                i66Var.f1299e = iM13691d;
            }
        }
        return i != i66Var.f1301g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f45118b.m13690c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f45117a.m722a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f45117a.m722a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j66.class != obj.getClass()) {
            return false;
        }
        return fa4.m11650l(this.f45117a, ((j66) obj).f45117a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f45117a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f45117a.f1301g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0039b(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f45118b.m13694g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        i66 i66Var = this.f45118b;
        i66Var.getClass();
        int i = i66Var.f1301g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = i66Var.f1300f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = i66Var.f1295a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (fa4.m11650l(i66Var.f1296b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                i66Var.m13695h(iNumberOfTrailingZeros);
            }
        }
        return i != i66Var.f1301g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f45118b.m13696i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f45117a.f1301g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ss5.m21701a0(this, objArr);
    }

    public final String toString() {
        return this.f45117a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ss5.m21699Z(this);
    }
}
