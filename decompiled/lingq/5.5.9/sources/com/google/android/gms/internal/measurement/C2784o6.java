package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2784o6 extends AbstractC2770n5 implements RandomAccess, InterfaceC2810q6, InterfaceC2824r7 {

    /* JADX INFO: renamed from: d */
    public static final C2784o6 f14363d = new C2784o6(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f14364b;

    /* JADX INFO: renamed from: c */
    public int f14365c;

    public C2784o6() {
        this(new int[10], 0, true);
    }

    public C2784o6(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f14364b = iArr;
        this.f14365c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14365c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14365c));
        }
        int[] iArr = this.f14364b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f14364b, i10, iArr2, i10 + 1, this.f14365c - i10);
            this.f14364b = iArr2;
        }
        this.f14364b[i10] = iIntValue;
        this.f14365c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8147f(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8076a();
        Charset charset = C2849t6.f14439a;
        collection.getClass();
        if (!(collection instanceof C2784o6)) {
            return super.addAll(collection);
        }
        C2784o6 c2784o6 = (C2784o6) collection;
        int i10 = c2784o6.f14365c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14365c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f14364b;
        if (i12 > iArr.length) {
            this.f14364b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2784o6.f14364b, 0, this.f14364b, this.f14365c, c2784o6.f14365c);
        this.f14365c = i12;
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
        if (!(obj instanceof C2784o6)) {
            return super.equals(obj);
        }
        C2784o6 c2784o6 = (C2784o6) obj;
        if (this.f14365c != c2784o6.f14365c) {
            return false;
        }
        int[] iArr = c2784o6.f14364b;
        for (int i10 = 0; i10 < this.f14365c; i10++) {
            if (this.f14364b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8147f(int i10) {
        m8076a();
        int i11 = this.f14365c;
        int[] iArr = this.f14364b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f14364b = iArr2;
        }
        int[] iArr3 = this.f14364b;
        int i12 = this.f14365c;
        this.f14365c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m8148g(int i10) {
        if (i10 < 0 || i10 >= this.f14365c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14365c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8148g(i10);
        return Integer.valueOf(this.f14364b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14365c; i11++) {
            i10 = (i10 * 31) + this.f14364b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f14365c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14364b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final InterfaceC2836s6 mo7645r(int i10) {
        if (i10 >= this.f14365c) {
            return new C2784o6(Arrays.copyOf(this.f14364b, i10), this.f14365c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8076a();
        m8148g(i10);
        int[] iArr = this.f14364b;
        int i11 = iArr[i10];
        int i12 = this.f14365c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f14365c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m8076a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14364b;
        System.arraycopy(iArr, i11, iArr, i10, this.f14365c - i11);
        this.f14365c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m8076a();
        m8148g(i10);
        int[] iArr = this.f14364b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14365c;
    }
}
