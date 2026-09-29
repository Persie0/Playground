package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ov */
/* JADX INFO: loaded from: classes.dex */
public final class C3437ov implements Collection, Set, ug4, yg4 {

    /* JADX INFO: renamed from: a */
    public int[] f55021a = AbstractC3423or.f54764b;

    /* JADX INFO: renamed from: b */
    public Object[] f55022b = AbstractC3423or.f54766d;

    /* JADX INFO: renamed from: c */
    public int f55023c;

    public C3437ov(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM19018F;
        int i2 = this.f55023c;
        if (obj == null) {
            iM19018F = pb1.m19018F(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM19018F = pb1.m19018F(this, obj, iHashCode);
        }
        if (iM19018F >= 0) {
            return false;
        }
        int i3 = ~iM19018F;
        int[] iArr = this.f55021a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f55022b;
            int[] iArr2 = new int[i4];
            this.f55021a = iArr2;
            this.f55022b = new Object[i4];
            if (i2 != this.f55023c) {
                C3386nv.m17619e();
                return false;
            }
            if (iArr2.length != 0) {
                AbstractC3550rv.m20829W(0, iArr.length, 6, iArr, iArr2);
                AbstractC3550rv.m20830X(0, objArr.length, 6, objArr, this.f55022b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f55021a;
            int i5 = i3 + 1;
            AbstractC3550rv.m20825S(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f55022b;
            AbstractC3550rv.m20826T(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f55023c;
        if (i2 == i6) {
            int[] iArr4 = this.f55021a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f55022b[i3] = obj;
                this.f55023c = i6 + 1;
                return true;
            }
        }
        C3386nv.m17619e();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f55023c;
        int i = this.f55023c;
        int[] iArr = this.f55021a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f55022b;
            int[] iArr2 = new int[size];
            this.f55021a = iArr2;
            this.f55022b = new Object[size];
            if (i > 0) {
                AbstractC3550rv.m20829W(0, i, 6, iArr, iArr2);
                AbstractC3550rv.m20830X(0, this.f55023c, 6, objArr, this.f55022b);
            }
        }
        if (this.f55023c != i) {
            C3386nv.m17619e();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f55023c != 0) {
            this.f55021a = AbstractC3423or.f54764b;
            this.f55022b = AbstractC3423or.f54766d;
            this.f55023c = 0;
        }
        if (this.f55023c == 0) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? pb1.m19018F(this, null, 0) : pb1.m19018F(this, obj, obj.hashCode())) >= 0;
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
    public final Object m18522d(int i) {
        int i2 = this.f55023c;
        Object[] objArr = this.f55022b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f55021a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC3550rv.m20825S(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f55022b;
                AbstractC3550rv.m20826T(i, i4, i2, objArr2, objArr2);
            }
            this.f55022b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f55021a = iArr2;
            this.f55022b = new Object[i5];
            if (i > 0) {
                AbstractC3550rv.m20829W(0, i, 6, iArr, iArr2);
                AbstractC3550rv.m20830X(0, i, 6, objArr, this.f55022b);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC3550rv.m20825S(i, i6, i2, iArr, this.f55021a);
                AbstractC3550rv.m20826T(i, i6, i2, objArr, this.f55022b);
            }
        }
        if (i2 == this.f55023c) {
            this.f55023c = i3;
            return obj;
        }
        C3386nv.m17619e();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f55023c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f55023c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f55022b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f55021a;
        int i = this.f55023c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f55023c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3052gv(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM19018F = obj == null ? pb1.m19018F(this, null, 0) : pb1.m19018F(this, obj, obj.hashCode());
        if (iM19018F < 0) {
            return false;
        }
        m18522d(iM19018F);
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
        for (int i = this.f55023c - 1; -1 < i; i--) {
            if (!u91.m22633z0(collection, this.f55022b[i])) {
                m18522d(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f55023c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f55023c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC3550rv.m20826T(0, 0, this.f55023c, this.f55022b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f55023c * 14);
        sb.append('{');
        int i = this.f55023c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f55022b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC3550rv.m20832Z(this.f55022b, 0, this.f55023c);
    }
}
