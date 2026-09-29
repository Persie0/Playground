package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2822r5 extends AbstractC2770n5 implements RandomAccess, InterfaceC2824r7 {

    /* JADX INFO: renamed from: b */
    public boolean[] f14415b;

    /* JADX INFO: renamed from: c */
    public int f14416c;

    static {
        new C2822r5(new boolean[0], 0, false);
    }

    public C2822r5() {
        this(new boolean[10], 0, true);
    }

    public C2822r5(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f14415b = zArr;
        this.f14416c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14416c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14416c));
        }
        boolean[] zArr = this.f14415b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f14415b, i10, zArr2, i10 + 1, this.f14416c - i10);
            this.f14415b = zArr2;
        }
        this.f14415b[i10] = zBooleanValue;
        this.f14416c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8238f(((Boolean) obj).booleanValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8076a();
        Charset charset = C2849t6.f14439a;
        collection.getClass();
        if (!(collection instanceof C2822r5)) {
            return super.addAll(collection);
        }
        C2822r5 c2822r5 = (C2822r5) collection;
        int i10 = c2822r5.f14416c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14416c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f14415b;
        if (i12 > zArr.length) {
            this.f14415b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2822r5.f14415b, 0, this.f14415b, this.f14416c, c2822r5.f14416c);
        this.f14416c = i12;
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
        if (!(obj instanceof C2822r5)) {
            return super.equals(obj);
        }
        C2822r5 c2822r5 = (C2822r5) obj;
        if (this.f14416c != c2822r5.f14416c) {
            return false;
        }
        boolean[] zArr = c2822r5.f14415b;
        for (int i10 = 0; i10 < this.f14416c; i10++) {
            if (this.f14415b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8238f(boolean z10) {
        m8076a();
        int i10 = this.f14416c;
        boolean[] zArr = this.f14415b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f14415b = zArr2;
        }
        boolean[] zArr3 = this.f14415b;
        int i11 = this.f14416c;
        this.f14416c = i11 + 1;
        zArr3[i11] = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m8239g(int i10) {
        if (i10 < 0 || i10 >= this.f14416c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14416c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8239g(i10);
        return Boolean.valueOf(this.f14415b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14416c; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f14415b[i11];
            Charset charset = C2849t6.f14439a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f14416c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14415b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2836s6 mo7645r(int i10) {
        if (i10 >= this.f14416c) {
            return new C2822r5(Arrays.copyOf(this.f14415b, i10), this.f14416c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8076a();
        m8239g(i10);
        boolean[] zArr = this.f14415b;
        boolean z10 = zArr[i10];
        int i11 = this.f14416c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f14416c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m8076a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f14415b;
        System.arraycopy(zArr, i11, zArr, i10, this.f14416c - i11);
        this.f14416c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8076a();
        m8239g(i10);
        boolean[] zArr = this.f14415b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14416c;
    }
}
