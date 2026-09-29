package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0851k extends AbstractC0830c<Double> implements RandomAccess, InterfaceC0866r0 {

    /* JADX INFO: renamed from: b */
    public double[] f5882b;

    /* JADX INFO: renamed from: c */
    public int f5883c;

    static {
        new C0851k(0, new double[0]).f5822a = false;
    }

    public C0851k() {
        this(0, new double[10]);
    }

    public C0851k(int i10, double[] dArr) {
        this.f5882b = dArr;
        this.f5883c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 < this.f5883c) {
            throw new IllegalArgumentException();
        }
        return new C0851k(this.f5883c, Arrays.copyOf(this.f5882b, i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5883c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5883c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        double[] dArr = this.f5882b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f5882b, i10, dArr2, i10 + 1, this.f5883c - i10);
            this.f5882b = dArr2;
        }
        this.f5882b[i10] = dDoubleValue;
        this.f5883c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3362f(((Double) obj).doubleValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m3192a();
        Charset charset = C0871u.f5935a;
        collection.getClass();
        if (!(collection instanceof C0851k)) {
            return super.addAll(collection);
        }
        C0851k c0851k = (C0851k) collection;
        int i10 = c0851k.f5883c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5883c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f5882b;
        if (i12 > dArr.length) {
            this.f5882b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c0851k.f5882b, 0, this.f5882b, this.f5883c, c0851k.f5883c);
        this.f5883c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0851k)) {
            return super.equals(obj);
        }
        C0851k c0851k = (C0851k) obj;
        if (this.f5883c != c0851k.f5883c) {
            return false;
        }
        double[] dArr = c0851k.f5882b;
        for (int i10 = 0; i10 < this.f5883c; i10++) {
            if (Double.doubleToLongBits(this.f5882b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3362f(double d10) {
        m3192a();
        int i10 = this.f5883c;
        double[] dArr = this.f5882b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f5882b = dArr2;
        }
        double[] dArr3 = this.f5882b;
        int i11 = this.f5883c;
        this.f5883c = i11 + 1;
        dArr3[i11] = d10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m3363g(int i10) {
        if (i10 < 0 || i10 >= this.f5883c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5883c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3363g(i10);
        return Double.valueOf(this.f5882b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM3440a = 1;
        for (int i10 = 0; i10 < this.f5883c; i10++) {
            iM3440a = (iM3440a * 31) + C0871u.m3440a(Double.doubleToLongBits(this.f5882b[i10]));
        }
        return iM3440a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        m3363g(i10);
        double[] dArr = this.f5882b;
        double d10 = dArr[i10];
        int i11 = this.f5883c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f5883c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3192a();
        for (int i10 = 0; i10 < this.f5883c; i10++) {
            if (obj.equals(Double.valueOf(this.f5882b[i10]))) {
                double[] dArr = this.f5882b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f5883c - i10) - 1);
                this.f5883c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3192a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f5882b;
        System.arraycopy(dArr, i11, dArr, i10, this.f5883c - i11);
        this.f5883c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m3192a();
        m3363g(i10);
        double[] dArr = this.f5882b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5883c;
    }
}
