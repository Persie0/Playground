package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2590a7 extends AbstractC2770n5 implements RandomAccess, InterfaceC2823r6, InterfaceC2824r7 {

    /* JADX INFO: renamed from: d */
    public static final C2590a7 f14051d = new C2590a7(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f14052b;

    /* JADX INFO: renamed from: c */
    public int f14053c;

    public C2590a7() {
        this(new long[10], 0, true);
    }

    public C2590a7(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f14052b = jArr;
        this.f14053c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14053c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14053c));
        }
        long[] jArr = this.f14052b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f14052b, i10, jArr2, i10 + 1, this.f14053c - i10);
            this.f14052b = jArr2;
        }
        this.f14052b[i10] = jLongValue;
        this.f14053c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7643f(((Long) obj).longValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8076a();
        Charset charset = C2849t6.f14439a;
        collection.getClass();
        if (!(collection instanceof C2590a7)) {
            return super.addAll(collection);
        }
        C2590a7 c2590a7 = (C2590a7) collection;
        int i10 = c2590a7.f14053c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14053c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f14052b;
        if (i12 > jArr.length) {
            this.f14052b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2590a7.f14052b, 0, this.f14052b, this.f14053c, c2590a7.f14053c);
        this.f14053c = i12;
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
        if (!(obj instanceof C2590a7)) {
            return super.equals(obj);
        }
        C2590a7 c2590a7 = (C2590a7) obj;
        if (this.f14053c != c2590a7.f14053c) {
            return false;
        }
        long[] jArr = c2590a7.f14052b;
        for (int i10 = 0; i10 < this.f14053c; i10++) {
            if (this.f14052b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m7643f(long j10) {
        m8076a();
        int i10 = this.f14053c;
        long[] jArr = this.f14052b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f14052b = jArr2;
        }
        long[] jArr3 = this.f14052b;
        int i11 = this.f14053c;
        this.f14053c = i11 + 1;
        jArr3[i11] = j10;
    }

    /* JADX INFO: renamed from: g */
    public final void m7644g(int i10) {
        if (i10 < 0 || i10 >= this.f14053c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14053c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m7644g(i10);
        return Long.valueOf(this.f14052b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14053c; i11++) {
            long j10 = this.f14052b[i11];
            Charset charset = C2849t6.f14439a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f14053c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14052b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final InterfaceC2836s6 mo7645r(int i10) {
        if (i10 >= this.f14053c) {
            return new C2590a7(Arrays.copyOf(this.f14052b, i10), this.f14053c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8076a();
        m7644g(i10);
        long[] jArr = this.f14052b;
        long j10 = jArr[i10];
        int i11 = this.f14053c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f14053c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m8076a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14052b;
        System.arraycopy(jArr, i11, jArr, i10, this.f14053c - i11);
        this.f14053c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8076a();
        m7644g(i10);
        long[] jArr = this.f14052b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14053c;
    }
}
