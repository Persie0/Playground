package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2850t7 extends AbstractC2770n5 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2850t7 f14441d = new C2850t7(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f14442b;

    /* JADX INFO: renamed from: c */
    public int f14443c;

    public C2850t7(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f14442b = objArr;
        this.f14443c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m8076a();
        if (i10 < 0 || i10 > (i11 = this.f14443c)) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14443c));
        }
        Object[] objArr = this.f14442b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f14442b, i10, objArr2, i10 + 1, this.f14443c - i10);
            this.f14442b = objArr2;
        }
        this.f14442b[i10] = obj;
        this.f14443c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8076a();
        int i10 = this.f14443c;
        Object[] objArr = this.f14442b;
        if (i10 == objArr.length) {
            this.f14442b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f14442b;
        int i11 = this.f14443c;
        this.f14443c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8260f(int i10) {
        if (i10 < 0 || i10 >= this.f14443c) {
            throw new IndexOutOfBoundsException(C0204c.m851j("Index:", i10, ", Size:", this.f14443c));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m8260f(i10);
        return this.f14442b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2836s6
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2836s6 mo7645r(int i10) {
        if (i10 >= this.f14443c) {
            return new C2850t7(Arrays.copyOf(this.f14442b, i10), this.f14443c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2770n5, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m8076a();
        m8260f(i10);
        Object[] objArr = this.f14442b;
        Object obj = objArr[i10];
        int i11 = this.f14443c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f14443c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m8076a();
        m8260f(i10);
        Object[] objArr = this.f14442b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14443c;
    }
}
