package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class ko7 extends AbstractC3356n1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final ko7 f47602d = new ko7(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f47603b;

    /* JADX INFO: renamed from: c */
    public int f47604c;

    public ko7(Object[] objArr, int i, boolean z) {
        super(z);
        this.f47603b = objArr;
        this.f47604c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m17167d();
        if (i < 0 || i > (i2 = this.f47604c)) {
            ij6.m13949f(this.f47604c, ux5.m22998u("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f47603b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f47603b, i, objArr2, i + 1, this.f47604c - i);
            this.f47603b = objArr2;
        }
        this.f47603b[i] = obj;
        this.f47604c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m15343f(int i) {
        if (i < 0 || i >= this.f47604c) {
            ij6.m13949f(this.f47604c, ux5.m22998u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m15343f(i);
        return this.f47603b[i];
    }

    @Override // p000.n94
    public final n94 mutableCopyWithCapacity(int i) {
        if (i >= this.f47604c) {
            return new ko7(Arrays.copyOf(this.f47603b, i), this.f47604c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.AbstractC3356n1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m17167d();
        m15343f(i);
        Object[] objArr = this.f47603b;
        Object obj = objArr[i];
        int i2 = this.f47604c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f47604c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m17167d();
        m15343f(i);
        Object[] objArr = this.f47603b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47604c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m17167d();
        int i = this.f47604c;
        Object[] objArr = this.f47603b;
        if (i == objArr.length) {
            this.f47603b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f47603b;
        int i2 = this.f47604c;
        this.f47604c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
