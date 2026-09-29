package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class jo7 extends AbstractC3319m1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final jo7 f45918d = new jo7(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f45919b;

    /* JADX INFO: renamed from: c */
    public int f45920c;

    public jo7(Object[] objArr, int i, boolean z) {
        super(z);
        this.f45919b = objArr;
        this.f45920c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m16594d();
        if (i < 0 || i > (i2 = this.f45920c)) {
            ij6.m13949f(this.f45920c, ux5.m22998u("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f45919b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f45919b, i, objArr2, i + 1, this.f45920c - i);
            this.f45919b = objArr2;
        }
        this.f45919b[i] = obj;
        this.f45920c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m14572f(int i) {
        if (i < 0 || i >= this.f45920c) {
            ij6.m13949f(this.f45920c, ux5.m22998u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m14572f(i);
        return this.f45919b[i];
    }

    @Override // p000.m94
    public final m94 mutableCopyWithCapacity(int i) {
        if (i >= this.f45920c) {
            return new jo7(Arrays.copyOf(this.f45919b, i), this.f45920c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m16594d();
        m14572f(i);
        Object[] objArr = this.f45919b;
        Object obj = objArr[i];
        int i2 = this.f45920c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f45920c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m16594d();
        m14572f(i);
        Object[] objArr = this.f45919b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45920c;
    }

    @Override // p000.AbstractC3319m1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m16594d();
        int i = this.f45920c;
        Object[] objArr = this.f45919b;
        if (i == objArr.length) {
            this.f45919b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f45919b;
        int i2 = this.f45920c;
        this.f45920c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
