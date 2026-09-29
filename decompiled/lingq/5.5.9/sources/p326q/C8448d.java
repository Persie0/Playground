package p326q;

import ae.C0062b;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8448d<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e */
    public static final int[] f45578e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f45579f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f45580g;

    /* JADX INFO: renamed from: h */
    public static int f45581h;

    /* JADX INFO: renamed from: i */
    public static Object[] f45582i;

    /* JADX INFO: renamed from: j */
    public static int f45583j;

    /* JADX INFO: renamed from: a */
    public int[] f45584a;

    /* JADX INFO: renamed from: b */
    public Object[] f45585b;

    /* JADX INFO: renamed from: c */
    public int f45586c;

    /* JADX INFO: renamed from: d */
    public C8447c f45587d;

    public C8448d() {
        this(0);
    }

    public C8448d(int i10) {
        if (i10 == 0) {
            this.f45584a = f45578e;
            this.f45585b = f45579f;
        } else {
            m16503a(i10);
        }
        this.f45586c = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static void m16502f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C8448d.class) {
                if (f45583j < 10) {
                    objArr[0] = f45582i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f45582i = objArr;
                    f45583j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C8448d.class) {
                if (f45581h < 10) {
                    objArr[0] = f45580g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f45580g = objArr;
                    f45581h++;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m16503a(int i10) {
        if (i10 == 8) {
            synchronized (C8448d.class) {
                Object[] objArr = f45582i;
                if (objArr != null) {
                    this.f45585b = objArr;
                    f45582i = (Object[]) objArr[0];
                    this.f45584a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f45583j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C8448d.class) {
                Object[] objArr2 = f45580g;
                if (objArr2 != null) {
                    this.f45585b = objArr2;
                    f45580g = (Object[]) objArr2[0];
                    this.f45584a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f45581h--;
                    return;
                }
            }
        }
        this.f45584a = new int[i10];
        this.f45585b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int iM16504g;
        if (e10 == null) {
            iM16504g = m16505i();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iM16504g = m16504g(iHashCode, e10);
        }
        if (iM16504g >= 0) {
            return false;
        }
        int i11 = ~iM16504g;
        int i12 = this.f45586c;
        int[] iArr = this.f45584a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f45585b;
            m16503a(i13);
            int[] iArr2 = this.f45584a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f45585b, 0, objArr.length);
            }
            m16502f(iArr, objArr, this.f45586c);
        }
        int i14 = this.f45586c;
        if (i11 < i14) {
            int[] iArr3 = this.f45584a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f45585b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f45586c - i11);
        }
        this.f45584a[i11] = i10;
        this.f45585b[i11] = e10;
        this.f45586c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f45586c;
        int[] iArr = this.f45584a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f45585b;
            m16503a(size);
            int i10 = this.f45586c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f45584a, 0, i10);
                System.arraycopy(objArr, 0, this.f45585b, 0, this.f45586c);
            }
            m16502f(iArr, objArr, this.f45586c);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f45586c;
        if (i10 != 0) {
            m16502f(this.f45584a, this.f45585b, i10);
            this.f45584a = f45578e;
            this.f45585b = f45579f;
            this.f45586c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f45586c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f45586c; i10++) {
                try {
                    if (!set.contains(this.f45585b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m16504g(int i10, Object obj) {
        int i11 = this.f45586c;
        if (i11 == 0) {
            return -1;
        }
        int iM318W = C0062b.m318W(i11, i10, this.f45584a);
        if (iM318W < 0 || obj.equals(this.f45585b[iM318W])) {
            return iM318W;
        }
        int i12 = iM318W + 1;
        while (i12 < i11 && this.f45584a[i12] == i10) {
            if (obj.equals(this.f45585b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM318W - 1; i13 >= 0 && this.f45584a[i13] == i10; i13--) {
            if (obj.equals(this.f45585b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f45584a;
        int i10 = this.f45586c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public final int m16505i() {
        int i10 = this.f45586c;
        if (i10 == 0) {
            return -1;
        }
        int iM318W = C0062b.m318W(i10, 0, this.f45584a);
        if (iM318W < 0 || this.f45585b[iM318W] == null) {
            return iM318W;
        }
        int i11 = iM318W + 1;
        while (i11 < i10 && this.f45584a[i11] == 0) {
            if (this.f45585b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM318W - 1; i12 >= 0 && this.f45584a[i12] == 0; i12--) {
            if (this.f45585b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m16505i() : m16504g(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f45586c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f45587d == null) {
            this.f45587d = new C8447c(this);
        }
        C8447c c8447c = this.f45587d;
        if (c8447c.f45599b == null) {
            c8447c.f45599b = new AbstractC8451g.c();
        }
        return (Iterator<E>) c8447c.f45599b.iterator();
    }

    /* JADX INFO: renamed from: l */
    public final void m16506l(int i10) {
        Object[] objArr = this.f45585b;
        Object obj = objArr[i10];
        int i11 = this.f45586c;
        if (i11 <= 1) {
            m16502f(this.f45584a, objArr, i11);
            this.f45584a = f45578e;
            this.f45585b = f45579f;
            this.f45586c = 0;
            return;
        }
        int[] iArr = this.f45584a;
        int i12 = 8;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i13 = i11 - 1;
            this.f45586c = i13;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                Object[] objArr2 = this.f45585b;
                System.arraycopy(objArr2, i14, objArr2, i10, this.f45586c - i10);
            }
            this.f45585b[this.f45586c] = null;
            return;
        }
        if (i11 > 8) {
            i12 = i11 + (i11 >> 1);
        }
        m16503a(i12);
        this.f45586c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f45584a, 0, i10);
            System.arraycopy(objArr, 0, this.f45585b, 0, i10);
        }
        int i15 = this.f45586c;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, this.f45584a, i10, i15 - i10);
            System.arraycopy(objArr, i16, this.f45585b, i10, this.f45586c - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m16506l(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f45586c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f45585b[i10])) {
                m16506l(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f45586c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f45586c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f45585b, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f45586c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f45586c));
        }
        System.arraycopy(this.f45585b, 0, tArr, 0, this.f45586c);
        int length = tArr.length;
        int i10 = this.f45586c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f45586c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f45586c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f45585b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
