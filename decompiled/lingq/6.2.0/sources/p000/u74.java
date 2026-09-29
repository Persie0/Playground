package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u74 extends AbstractC3319m1 implements i94, RandomAccess, ck7 {

    /* JADX INFO: renamed from: d */
    public static final u74 f63511d = new u74(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f63512b;

    /* JADX INFO: renamed from: c */
    public int f63513c;

    public u74(int[] iArr, int i, boolean z) {
        super(z);
        this.f63512b = iArr;
        this.f63513c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m16594d();
        if (i < 0 || i > (i2 = this.f63513c)) {
            ij6.m13949f(this.f63513c, ux5.m22998u("Index:", i, ", Size:"));
            return;
        }
        int[] iArr = this.f63512b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f63512b, i, iArr2, i + 1, this.f63513c - i);
            this.f63512b = iArr2;
        }
        this.f63512b[i] = iIntValue;
        this.f63513c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m16594d();
        Charset charset = p94.f55800a;
        collection.getClass();
        if (!(collection instanceof u74)) {
            return super.addAll(collection);
        }
        u74 u74Var = (u74) collection;
        int i = u74Var.f63513c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f63513c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f63512b;
        if (i3 > iArr.length) {
            this.f63512b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(u74Var.f63512b, 0, this.f63512b, this.f63513c, u74Var.f63513c);
        this.f63513c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        m16594d();
        int i2 = this.f63513c;
        int[] iArr = this.f63512b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f63512b = iArr2;
        }
        int[] iArr3 = this.f63512b;
        int i3 = this.f63513c;
        this.f63513c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u74)) {
            return super.equals(obj);
        }
        u74 u74Var = (u74) obj;
        if (this.f63513c != u74Var.f63513c) {
            return false;
        }
        int[] iArr = u74Var.f63512b;
        for (int i = 0; i < this.f63513c; i++) {
            if (this.f63512b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m22520f(int i) {
        if (i < 0 || i >= this.f63513c) {
            ij6.m13949f(this.f63513c, ux5.m22998u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m22520f(i);
        return this.f63512b[i];
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f63513c; i2++) {
            i = (i * 31) + this.f63512b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f63513c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f63512b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.m94
    public final m94 mutableCopyWithCapacity(int i) {
        if (i >= this.f63513c) {
            return new u74(Arrays.copyOf(this.f63512b, i), this.f63513c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m16594d();
        m22520f(i);
        int[] iArr = this.f63512b;
        int i2 = iArr[i];
        int i3 = this.f63513c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f63513c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m16594d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f63512b;
        System.arraycopy(iArr, i2, iArr, i, this.f63513c - i2);
        this.f63513c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m16594d();
        m22520f(i);
        int[] iArr = this.f63512b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63513c;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
