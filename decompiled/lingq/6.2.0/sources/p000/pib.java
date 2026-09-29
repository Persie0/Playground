package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class pib extends chb implements RandomAccess, lib, bjb {

    /* JADX INFO: renamed from: d */
    public static final long[] f56276d;

    /* JADX INFO: renamed from: e */
    public static final pib f56277e;

    /* JADX INFO: renamed from: b */
    public long[] f56278b;

    /* JADX INFO: renamed from: c */
    public int f56279c;

    static {
        long[] jArr = new long[0];
        f56276d = jArr;
        f56277e = new pib(jArr, 0, false);
    }

    public pib(long[] jArr, int i, boolean z) {
        super(z);
        this.f56278b = jArr;
        this.f56279c = i;
    }

    /* JADX INFO: renamed from: h */
    public static pib m19181h() {
        return f56277e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m4665d();
        if (i < 0 || i > (i2 = this.f56279c)) {
            v63.m23143u(ehb.m11156a(this.f56279c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f56278b;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f56278b, 0, jArr2, 0, i);
            System.arraycopy(this.f56278b, i, jArr2, i3, this.f56279c - i);
            this.f56278b = jArr2;
        }
        this.f56278b[i] = jLongValue;
        this.f56279c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.chb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4665d();
        collection.getClass();
        if (!(collection instanceof pib)) {
            return super.addAll(collection);
        }
        pib pibVar = (pib) collection;
        int i = pibVar.f56279c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56279c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f56278b;
        if (i3 > jArr.length) {
            this.f56278b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(pibVar.f56278b, 0, this.f56278b, this.f56279c, pibVar.f56279c);
        this.f56279c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.chb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pib)) {
            return super.equals(obj);
        }
        pib pibVar = (pib) obj;
        if (this.f56279c != pibVar.f56279c) {
            return false;
        }
        long[] jArr = pibVar.f56278b;
        for (int i = 0; i < this.f56279c; i++) {
            if (this.f56278b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final long m19182f(int i) {
        m19186k(i);
        return this.f56278b[i];
    }

    @Override // p000.mib
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final pib mo10419Y(int i) {
        if (i >= this.f56279c) {
            return new pib(i == 0 ? f56276d : Arrays.copyOf(this.f56278b, i), this.f56279c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m19186k(i);
        return Long.valueOf(this.f56278b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56279c; i2++) {
            long j = this.f56278b[i2];
            byte[] bArr = kib.f47356a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m19184i(long j) {
        m4665d();
        int i = this.f56279c;
        int length = this.f56278b.length;
        if (i == length) {
            long[] jArr = new long[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f56278b, 0, jArr, 0, this.f56279c);
            this.f56278b = jArr;
        }
        long[] jArr2 = this.f56278b;
        int i2 = this.f56279c;
        this.f56279c = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f56279c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f56278b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m19185j(int i) {
        int length = this.f56278b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f56278b = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = g9a.m12427d(length, 3, 2, 1, 10);
        }
        this.f56278b = Arrays.copyOf(this.f56278b, length);
    }

    /* JADX INFO: renamed from: k */
    public final void m19186k(int i) {
        if (i < 0 || i >= this.f56279c) {
            v63.m23143u(ehb.m11156a(this.f56279c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p000.chb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m4665d();
        m19186k(i);
        long[] jArr = this.f56278b;
        long j = jArr[i];
        int i2 = this.f56279c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f56279c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m4665d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f56278b;
        System.arraycopy(jArr, i2, jArr, i, this.f56279c - i2);
        this.f56279c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m4665d();
        m19186k(i);
        long[] jArr = this.f56278b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56279c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m19184i(((Long) obj).longValue());
        return true;
    }
}
