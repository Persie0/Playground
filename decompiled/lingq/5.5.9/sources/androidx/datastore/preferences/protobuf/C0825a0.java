package androidx.datastore.preferences.protobuf;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0825a0 extends AbstractC0830c<Long> implements RandomAccess, InterfaceC0866r0 {

    /* JADX INFO: renamed from: b */
    public long[] f5817b;

    /* JADX INFO: renamed from: c */
    public int f5818c;

    static {
        new C0825a0(new long[0], 0).f5822a = false;
    }

    public C0825a0() {
        this(new long[10], 0);
    }

    public C0825a0(long[] jArr, int i10) {
        this.f5817b = jArr;
        this.f5818c = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0871u.c
    /* JADX INFO: renamed from: E */
    public final C0871u.c mo3165E(int i10) {
        if (i10 >= this.f5818c) {
            return new C0825a0(Arrays.copyOf(this.f5817b, i10), this.f5818c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m3192a();
        if (i10 < 0 || i10 > (i11 = this.f5818c)) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5818c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
        long[] jArr = this.f5817b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[C0166e.m757a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f5817b, i10, jArr2, i10 + 1, this.f5818c - i10);
            this.f5817b = jArr2;
        }
        this.f5817b[i10] = jLongValue;
        this.f5818c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3166f(((Long) obj).longValue());
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m3192a();
        Charset charset = C0871u.f5935a;
        collection.getClass();
        if (!(collection instanceof C0825a0)) {
            return super.addAll(collection);
        }
        C0825a0 c0825a0 = (C0825a0) collection;
        int i10 = c0825a0.f5818c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5818c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f5817b;
        if (i12 > jArr.length) {
            this.f5817b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c0825a0.f5817b, 0, this.f5817b, this.f5818c, c0825a0.f5818c);
        this.f5818c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0825a0)) {
            return super.equals(obj);
        }
        C0825a0 c0825a0 = (C0825a0) obj;
        if (this.f5818c != c0825a0.f5818c) {
            return false;
        }
        long[] jArr = c0825a0.f5817b;
        for (int i10 = 0; i10 < this.f5818c; i10++) {
            if (this.f5817b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3166f(long j10) {
        m3192a();
        int i10 = this.f5818c;
        long[] jArr = this.f5817b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[C0166e.m757a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f5817b = jArr2;
        }
        long[] jArr3 = this.f5817b;
        int i11 = this.f5818c;
        this.f5818c = i11 + 1;
        jArr3[i11] = j10;
    }

    /* JADX INFO: renamed from: g */
    public final void m3167g(int i10) {
        if (i10 < 0 || i10 >= this.f5818c) {
            StringBuilder sbM614j = C0141b.m614j("Index:", i10, ", Size:");
            sbM614j.append(this.f5818c);
            throw new IndexOutOfBoundsException(sbM614j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m3167g(i10);
        return Long.valueOf(this.f5817b[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM3440a = 1;
        for (int i10 = 0; i10 < this.f5818c; i10++) {
            iM3440a = (iM3440a * 31) + C0871u.m3440a(this.f5817b[i10]);
        }
        return iM3440a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m3192a();
        m3167g(i10);
        long[] jArr = this.f5817b;
        long j10 = jArr[i10];
        int i11 = this.f5818c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f5818c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0830c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3192a();
        for (int i10 = 0; i10 < this.f5818c; i10++) {
            if (obj.equals(Long.valueOf(this.f5817b[i10]))) {
                long[] jArr = this.f5817b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f5818c - i10) - 1);
                this.f5818c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m3192a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5817b;
        System.arraycopy(jArr, i11, jArr, i10, this.f5818c - i11);
        this.f5818c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m3192a();
        m3167g(i10);
        long[] jArr = this.f5817b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5818c;
    }
}
