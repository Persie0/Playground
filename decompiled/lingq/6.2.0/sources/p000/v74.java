package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class v74 extends AbstractC3356n1 implements j94, RandomAccess, dk7 {

    /* JADX INFO: renamed from: d */
    public static final v74 f64968d = new v74(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f64969b;

    /* JADX INFO: renamed from: c */
    public int f64970c;

    public v74(int[] iArr, int i, boolean z) {
        super(z);
        this.f64969b = iArr;
        this.f64970c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m17167d();
        if (i < 0 || i > (i2 = this.f64970c)) {
            ij6.m13949f(this.f64970c, ux5.m22998u("Index:", i, ", Size:"));
            return;
        }
        int[] iArr = this.f64969b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f64969b, i, iArr2, i + 1, this.f64970c - i);
            this.f64969b = iArr2;
        }
        this.f64969b[i] = iIntValue;
        this.f64970c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC3356n1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17167d();
        Charset charset = q94.f57449a;
        collection.getClass();
        if (!(collection instanceof v74)) {
            return super.addAll(collection);
        }
        v74 v74Var = (v74) collection;
        int i = v74Var.f64970c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64970c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f64969b;
        if (i3 > iArr.length) {
            this.f64969b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(v74Var.f64969b, 0, this.f64969b, this.f64970c, v74Var.f64970c);
        this.f64970c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        m17167d();
        int i2 = this.f64970c;
        int[] iArr = this.f64969b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f64969b = iArr2;
        }
        int[] iArr3 = this.f64969b;
        int i3 = this.f64970c;
        this.f64970c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC3356n1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v74)) {
            return super.equals(obj);
        }
        v74 v74Var = (v74) obj;
        if (this.f64970c != v74Var.f64970c) {
            return false;
        }
        int[] iArr = v74Var.f64969b;
        for (int i = 0; i < this.f64970c; i++) {
            if (this.f64969b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m23154f(int i) {
        if (i < 0 || i >= this.f64970c) {
            ij6.m13949f(this.f64970c, ux5.m22998u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m23154f(i);
        return this.f64969b[i];
    }

    @Override // p000.AbstractC3356n1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f64970c; i2++) {
            i = (i * 31) + this.f64969b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f64970c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64969b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.n94
    public final n94 mutableCopyWithCapacity(int i) {
        if (i >= this.f64970c) {
            return new v74(Arrays.copyOf(this.f64969b, i), this.f64970c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.AbstractC3356n1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m17167d();
        m23154f(i);
        int[] iArr = this.f64969b;
        int i2 = iArr[i];
        int i3 = this.f64970c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f64970c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m17167d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f64969b;
        System.arraycopy(iArr, i2, iArr, i, this.f64970c - i2);
        this.f64970c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m17167d();
        m23154f(i);
        int[] iArr = this.f64969b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64970c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
