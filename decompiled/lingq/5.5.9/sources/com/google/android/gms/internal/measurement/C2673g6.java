package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2673g6 extends AbstractC2770n5 implements RandomAccess, InterfaceC2824r7 {

    /* JADX INFO: renamed from: b */
    public float[] f14215b;

    /* JADX INFO: renamed from: c */
    public int f14216c;

    static {
        new C2673g6(0, false, new float[0]);
    }

    public C2673g6() {
        this(0, true, new float[10]);
    }

    public C2673g6(int i10, boolean z10, float[] fArr) {
        super(z10);
        this.f14215b = fArr;
        this.f14216c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14216c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14216c));
        }
        float[] fArr = this.f14215b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f14215b, i10, fArr2, i10 + 1, this.f14216c - i10);
            this.f14215b = fArr2;
        }
        this.f14215b[i10] = fFloatValue;
        this.f14216c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7847f(((Float) obj).floatValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8076a();
        Charset charset = C2849t6.f14439a;
        collection.getClass();
        if (!(collection instanceof C2673g6)) {
            return super.addAll(collection);
        }
        C2673g6 c2673g6 = (C2673g6) collection;
        int i10 = c2673g6.f14216c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14216c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f14215b;
        if (i12 > fArr.length) {
            this.f14215b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2673g6.f14215b, 0, this.f14215b, this.f14216c, c2673g6.f14216c);
        this.f14216c = i12;
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
        if (!(obj instanceof C2673g6)) {
            return super.equals(obj);
        }
        C2673g6 c2673g6 = (C2673g6) obj;
        if (this.f14216c != c2673g6.f14216c) {
            return false;
        }
        float[] fArr = c2673g6.f14215b;
        for (int i10 = 0; i10 < this.f14216c; i10++) {
            if (Float.floatToIntBits(this.f14215b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m7847f(float f3) {
        m8076a();
        int i10 = this.f14216c;
        float[] fArr = this.f14215b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f14215b = fArr2;
        }
        float[] fArr3 = this.f14215b;
        int i11 = this.f14216c;
        this.f14216c = i11 + 1;
        fArr3[i11] = f3;
    }

    /* JADX INFO: renamed from: g */
    public final void m7848g(int i10) {
        if (i10 < 0 || i10 >= this.f14216c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14216c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m7848g(i10);
        return Float.valueOf(this.f14215b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f14216c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f14215b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f14216c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14215b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2836s6 mo7645r(int i10) {
        if (i10 < this.f14216c) {
            throw new IllegalArgumentException();
        }
        return new C2673g6(this.f14216c, true, Arrays.copyOf(this.f14215b, i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8076a();
        m7848g(i10);
        float[] fArr = this.f14215b;
        float f3 = fArr[i10];
        int i11 = this.f14216c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f14216c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m8076a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14215b;
        System.arraycopy(fArr, i11, fArr, i10, this.f14216c - i11);
        this.f14216c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m8076a();
        m7848g(i10);
        float[] fArr = this.f14215b;
        float f3 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14216c;
    }
}
