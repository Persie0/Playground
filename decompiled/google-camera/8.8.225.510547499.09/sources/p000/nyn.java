package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyn extends nwf implements RandomAccess, nxx, nze {

    /* JADX INFO: renamed from: b */
    public static final nyn f45025b;

    /* JADX INFO: renamed from: c */
    private long[] f45026c;

    /* JADX INFO: renamed from: d */
    private int f45027d;

    static {
        nyn nynVar = new nyn(new long[0], 0);
        f45025b = nynVar;
        nynVar.mo17769b();
    }

    public nyn() {
        this(new long[10], 0);
    }

    /* JADX INFO: renamed from: g */
    private final String m18185g(int i) {
        return "Index:" + i + ", Size:" + this.f45027d;
    }

    /* JADX INFO: renamed from: h */
    private final void m18186h(int i) {
        if (i < 0 || i >= this.f45027d) {
            throw new IndexOutOfBoundsException(m18185g(i));
        }
    }

    @Override // p000.nxx
    /* JADX INFO: renamed from: a */
    public final long mo18149a(int i) {
        m18186h(i);
        return this.f45026c[i];
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m17771cA();
        if (i < 0 || i > (i2 = this.f45027d)) {
            throw new IndexOutOfBoundsException(m18185g(i));
        }
        long[] jArr = this.f45026c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f45026c, i, jArr2, i + 1, this.f45027d - i);
            this.f45026c = jArr2;
        }
        this.f45026c[i] = jLongValue;
        this.f45027d++;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17771cA();
        nxz.m18156e(collection);
        if (!(collection instanceof nyn)) {
            return super.addAll(collection);
        }
        nyn nynVar = (nyn) collection;
        int i = nynVar.f45027d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45027d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f45026c;
        if (i3 > jArr.length) {
            this.f45026c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(nynVar.f45026c, 0, this.f45026c, this.f45027d, nynVar.f45027d);
        this.f45027d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final nxx mo17775e(int i) {
        if (i >= this.f45027d) {
            return new nyn(Arrays.copyOf(this.f45026c, i), this.f45027d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyn)) {
            return super.equals(obj);
        }
        nyn nynVar = (nyn) obj;
        if (this.f45027d != nynVar.f45027d) {
            return false;
        }
        long[] jArr = nynVar.f45026c;
        for (int i = 0; i < this.f45027d; i++) {
            if (this.f45026c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.nxx
    /* JADX INFO: renamed from: f */
    public final void mo18151f(long j) {
        m17771cA();
        int i = this.f45027d;
        long[] jArr = this.f45026c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f45026c = jArr2;
        }
        long[] jArr3 = this.f45026c;
        int i2 = this.f45027d;
        this.f45027d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(mo18149a(i));
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM18153b = 1;
        for (int i = 0; i < this.f45027d; i++) {
            iM18153b = (iM18153b * 31) + nxz.m18153b(this.f45026c[i]);
        }
        return iM18153b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f45027d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45026c[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        m18186h(i);
        long[] jArr = this.f45026c;
        long j = jArr[i];
        int i2 = this.f45027d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f45027d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m17771cA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f45026c;
        System.arraycopy(jArr, i2, jArr, i, this.f45027d - i2);
        this.f45027d -= i2 - i;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m17771cA();
        m18186h(i);
        long[] jArr = this.f45026c;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45027d;
    }

    private nyn(long[] jArr, int i) {
        this.f45026c = jArr;
        this.f45027d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo18151f(((Long) obj).longValue());
        return true;
    }
}
