package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0869t extends AbstractC0830c<Integer> implements RandomAccess, InterfaceC0866r0 {

    /* JADX INFO: renamed from: b */
    public int[] f5930b;

    /* JADX INFO: renamed from: c */
    public int f5931c;

    static {
        new C0869t(new int[0], 0).f5822a = false;
    }

    public C0869t() {
        this(new int[10], 0);
    }

    public C0869t(int[] iArr, int i10) {
        this.f5930b = iArr;
        this.f5931c = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 >= this.f5931c) {
            return new C0869t(Arrays.copyOf(this.f5930b, i10), this.f5931c);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5931c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5931c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        int[] iArr = this.f5930b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f5930b, i10, iArr2, i10 + 1, this.f5931c - i10);
            this.f5930b = iArr2;
        }
        this.f5930b[i10] = iIntValue;
        this.f5931c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3437f(((Integer) obj).intValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m3192a();
        Charset charset = C0871u.f5935a;
        collection.getClass();
        if (!(collection instanceof C0869t)) {
            return super.addAll(collection);
        }
        C0869t c0869t = (C0869t) collection;
        int i10 = c0869t.f5931c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5931c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f5930b;
        if (i12 > iArr.length) {
            this.f5930b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c0869t.f5930b, 0, this.f5930b, this.f5931c, c0869t.f5931c);
        this.f5931c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0869t)) {
            return super.equals(obj);
        }
        C0869t c0869t = (C0869t) obj;
        if (this.f5931c != c0869t.f5931c) {
            return false;
        }
        int[] iArr = c0869t.f5930b;
        for (int i10 = 0; i10 < this.f5931c; i10++) {
            if (this.f5930b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3437f(int i10) {
        m3192a();
        int i11 = this.f5931c;
        int[] iArr = this.f5930b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5930b = iArr2;
        }
        int[] iArr3 = this.f5930b;
        int i12 = this.f5931c;
        this.f5931c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m3438g(int i10) {
        if (i10 < 0 || i10 >= this.f5931c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5931c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3438g(i10);
        return Integer.valueOf(this.f5930b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5931c; i11++) {
            i10 = (i10 * 31) + this.f5930b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        m3438g(i10);
        int[] iArr = this.f5930b;
        int i11 = iArr[i10];
        int i12 = this.f5931c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f5931c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3192a();
        for (int i10 = 0; i10 < this.f5931c; i10++) {
            if (obj.equals(Integer.valueOf(this.f5930b[i10]))) {
                int[] iArr = this.f5930b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f5931c - i10) - 1);
                this.f5931c--;
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
        int[] iArr = this.f5930b;
        System.arraycopy(iArr, i11, iArr, i10, this.f5931c - i11);
        this.f5931c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m3192a();
        m3438g(i10);
        int[] iArr = this.f5930b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5931c;
    }
}
