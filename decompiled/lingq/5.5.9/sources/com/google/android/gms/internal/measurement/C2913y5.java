package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2913y5 extends AbstractC2770n5 implements RandomAccess, InterfaceC2824r7 {

    /* JADX INFO: renamed from: b */
    public double[] f14513b;

    /* JADX INFO: renamed from: c */
    public int f14514c;

    static {
        new C2913y5(new double[0], 0, false);
    }

    public C2913y5() {
        this(new double[10], 0, true);
    }

    public C2913y5(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f14513b = dArr;
        this.f14514c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14514c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14514c));
        }
        double[] dArr = this.f14513b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f14513b, i10, dArr2, i10 + 1, this.f14514c - i10);
            this.f14513b = dArr2;
        }
        this.f14513b[i10] = dDoubleValue;
        this.f14514c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8438f(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8076a();
        Charset charset = C2849t6.f14439a;
        collection.getClass();
        if (!(collection instanceof C2913y5)) {
            return super.addAll(collection);
        }
        C2913y5 c2913y5 = (C2913y5) collection;
        int i10 = c2913y5.f14514c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14514c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f14513b;
        if (i12 > dArr.length) {
            this.f14513b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2913y5.f14513b, 0, this.f14513b, this.f14514c, c2913y5.f14514c);
        this.f14514c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2913y5)) {
            return super.equals(obj);
        }
        C2913y5 c2913y5 = (C2913y5) obj;
        if (this.f14514c != c2913y5.f14514c) {
            return false;
        }
        double[] dArr = c2913y5.f14513b;
        for (int i10 = 0; i10 < this.f14514c; i10++) {
            if (Double.doubleToLongBits(this.f14513b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8438f(double d10) {
        m8076a();
        int i10 = this.f14514c;
        double[] dArr = this.f14513b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f14513b = dArr2;
        }
        double[] dArr3 = this.f14513b;
        int i11 = this.f14514c;
        this.f14514c = i11 + 1;
        dArr3[i11] = d10;
    }

    /* JADX INFO: renamed from: g */
    public final void m8439g(int i10) {
        if (i10 < 0 || i10 >= this.f14514c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14514c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8439g(i10);
        return Double.valueOf(this.f14513b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14514c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f14513b[i11]);
            Charset charset = C2849t6.f14439a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f14514c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14513b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2836s6 mo7645r(int i10) {
        if (i10 >= this.f14514c) {
            return new C2913y5(Arrays.copyOf(this.f14513b, i10), this.f14514c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8076a();
        m8439g(i10);
        double[] dArr = this.f14513b;
        double d10 = dArr[i10];
        int i11 = this.f14514c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f14514c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m8076a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f14513b;
        System.arraycopy(dArr, i11, dArr, i10, this.f14514c - i11);
        this.f14514c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m8076a();
        m8439g(i10);
        double[] dArr = this.f14513b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14514c;
    }
}
