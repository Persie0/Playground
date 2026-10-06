package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: xa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1112xa implements Collection, Set {

    /* JADX INFO: renamed from: a */
    public int[] f47983a = C1120xi.f48010a;

    /* JADX INFO: renamed from: b */
    public Object[] f47984b = C1120xi.f48012c;

    /* JADX INFO: renamed from: c */
    public int f47985c;

    /* JADX INFO: renamed from: a */
    public final int m19538a(Object obj) {
        return obj == null ? C0873oe.m18405c(this) : C0873oe.m18404b(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM18404b;
        int i2 = this.f47985c;
        if (obj == null) {
            iM18404b = C0873oe.m18405c(this);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM18404b = C0873oe.m18404b(this, obj, iHashCode);
        }
        if (iM18404b >= 0) {
            return false;
        }
        int i3 = iM18404b ^ (-1);
        int[] iArr = this.f47983a;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f47984b;
            C0873oe.m18406d(this, i4);
            if (i2 != this.f47985c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f47983a;
            if (iArr2.length != 0) {
                omn.m18692af(iArr, iArr2, 0, 0, length);
                omn.m18696aj(objArr, this.f47984b, 0, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f47983a;
            int i5 = i3 + 1;
            omn.m18692af(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f47984b;
            omn.m18693ag(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f47985c;
        if (i2 == i6) {
            int[] iArr4 = this.f47983a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f47984b[i3] = obj;
                this.f47985c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = this.f47985c + collection.size();
        int i = this.f47985c;
        int[] iArr = this.f47983a;
        if (iArr.length < size) {
            Object[] objArr = this.f47984b;
            C0873oe.m18406d(this, size);
            int i2 = this.f47985c;
            if (i2 > 0) {
                omn.m18692af(iArr, this.f47983a, 0, 0, i2);
                omn.m18696aj(objArr, this.f47984b, 0, 0, this.f47985c, 6);
            }
        }
        if (this.f47985c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final Object m19539b(int i) {
        return this.f47984b[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m19540c(Object[] objArr) {
        objArr.getClass();
        this.f47984b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f47985c != 0) {
            m19541d(C1120xi.f48010a);
            m19540c(C1120xi.f48012c);
            this.f47985c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return m19538a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m19541d(int[] iArr) {
        iArr.getClass();
        this.f47983a = iArr;
    }

    /* JADX INFO: renamed from: e */
    public final void m19542e(int i) {
        int i2 = this.f47985c;
        Object[] objArr = this.f47984b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f47983a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                int i5 = i3 + 1;
                omn.m18692af(iArr, iArr, i, i4, i5);
                Object[] objArr2 = this.f47984b;
                omn.m18693ag(objArr2, objArr2, i, i4, i5);
            }
            this.f47984b[i3] = null;
        } else {
            C0873oe.m18406d(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                omn.m18692af(iArr, this.f47983a, 0, 0, i);
                omn.m18696aj(objArr, this.f47984b, 0, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                int i7 = i3 + 1;
                omn.m18692af(iArr, this.f47983a, i, i6, i7);
                omn.m18693ag(objArr, this.f47984b, i, i6, i7);
            }
        }
        if (i2 != this.f47985c) {
            throw new ConcurrentModificationException();
        }
        this.f47985c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f47985c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f47985c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(m19539b(i2))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f47983a;
        int i = this.f47985c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47985c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1110wz(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM19538a = m19538a(obj);
        if (iM19538a < 0) {
            return false;
        }
        m19542e(iM19538a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f47985c - 1; i >= 0; i--) {
            if (!omn.m18676P(collection, this.f47984b[i])) {
                m19542e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f47985c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return omn.m18685Y(this.f47984b, 0, this.f47985c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f47985c * 14);
        sb.append('{');
        int i = this.f47985c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM19539b = m19539b(i2);
            if (objM19539b != this) {
                sb.append(objM19539b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f47985c;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        omn.m18693ag(this.f47984b, objArr, 0, 0, this.f47985c);
        objArr.getClass();
        return objArr;
    }
}
