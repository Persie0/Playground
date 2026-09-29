package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class bh8 extends AbstractC3816z0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f8543a;

    /* JADX INFO: renamed from: b */
    public final int f8544b;

    /* JADX INFO: renamed from: c */
    public int f8545c;

    /* JADX INFO: renamed from: d */
    public int f8546d;

    public bh8(Object[] objArr, int i) {
        this.f8543a = objArr;
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.f8544b = objArr.length;
            this.f8546d = i;
        } else {
            C3386nv.m17623i(objArr.length, ux5.m22998u("ring buffer filled size: ", i, " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f8546d;
    }

    /* JADX INFO: renamed from: f */
    public final void m3719f(int i) {
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.f8546d) {
            C3386nv.m17623i(this.f8546d, ux5.m22998u("n shouldn't be greater than the buffer size: n = ", i, ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.f8545c;
            int i3 = this.f8544b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f8543a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f8545c = i4;
            this.f8546d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f8546d;
        if (i < 0 || i >= i2) {
            v63.m23143u(wq1.m24115k("index: ", i, i2, ", size: "));
            return null;
        }
        return this.f8543a[(this.f8545c + i) % this.f8544b];
    }

    @Override // p000.AbstractC3816z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ah8(this);
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.f8546d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f8546d;
        int i3 = this.f8545c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f8543a;
            if (i5 >= i2 || i3 >= this.f8544b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo3718d()]);
    }
}
