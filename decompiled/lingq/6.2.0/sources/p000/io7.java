package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class io7 extends AbstractC3282l1 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final io7 f44360d;

    /* JADX INFO: renamed from: b */
    public Object[] f44361b;

    /* JADX INFO: renamed from: c */
    public int f44362c;

    static {
        io7 io7Var = new io7(new Object[0], 0);
        f44360d = io7Var;
        io7Var.f48878a = false;
    }

    public io7(Object[] objArr, int i) {
        this.f44361b = objArr;
        this.f44362c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m15738d();
        if (i < 0 || i > (i2 = this.f44362c)) {
            ij6.m13949f(this.f44362c, ux5.m22998u("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f44361b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f44361b, i, objArr2, i + 1, this.f44362c - i);
            this.f44361b = objArr2;
        }
        this.f44361b[i] = obj;
        this.f44362c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m14053f(int i) {
        if (i < 0 || i >= this.f44362c) {
            ij6.m13949f(this.f44362c, ux5.m22998u("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m14053f(i);
        return this.f44361b[i];
    }

    @Override // p000.l94
    public final l94 mutableCopyWithCapacity(int i) {
        if (i >= this.f44362c) {
            return new io7(Arrays.copyOf(this.f44361b, i), this.f44362c);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m15738d();
        m14053f(i);
        Object[] objArr = this.f44361b;
        Object obj = objArr[i];
        int i2 = this.f44362c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f44362c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m15738d();
        m14053f(i);
        Object[] objArr = this.f44361b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44362c;
    }

    @Override // p000.AbstractC3282l1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m15738d();
        int i = this.f44362c;
        Object[] objArr = this.f44361b;
        if (i == objArr.length) {
            this.f44361b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f44361b;
        int i2 = this.f44362c;
        this.f44362c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
