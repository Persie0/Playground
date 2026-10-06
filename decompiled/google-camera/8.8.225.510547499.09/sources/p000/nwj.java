package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwj extends nwf implements RandomAccess, nxs, nze {

    /* JADX INFO: renamed from: b */
    public static final nwj f44830b;

    /* JADX INFO: renamed from: c */
    private boolean[] f44831c;

    /* JADX INFO: renamed from: d */
    private int f44832d;

    static {
        nwj nwjVar = new nwj(new boolean[0], 0);
        f44830b = nwjVar;
        nwjVar.mo17769b();
    }

    public nwj() {
        this(new boolean[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private final String m17772h(int i) {
        return "Index:" + i + ", Size:" + this.f44832d;
    }

    /* JADX INFO: renamed from: i */
    private final void m17773i(int i) {
        if (i < 0 || i >= this.f44832d) {
            throw new IndexOutOfBoundsException(m17772h(i));
        }
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m17771cA();
        if (i < 0 || i > (i2 = this.f44832d)) {
            throw new IndexOutOfBoundsException(m17772h(i));
        }
        boolean[] zArr = this.f44831c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f44831c, i, zArr2, i + 1, this.f44832d - i);
            this.f44831c = zArr2;
        }
        this.f44831c[i] = zBooleanValue;
        this.f44832d++;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17771cA();
        nxz.m18156e(collection);
        if (!(collection instanceof nwj)) {
            return super.addAll(collection);
        }
        nwj nwjVar = (nwj) collection;
        int i = nwjVar.f44832d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44832d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f44831c;
        if (i3 > zArr.length) {
            this.f44831c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(nwjVar.f44831c, 0, this.f44831c, this.f44832d, nwjVar.f44832d);
        this.f44832d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final nxs mo17775e(int i) {
        if (i >= this.f44832d) {
            return new nwj(Arrays.copyOf(this.f44831c, i), this.f44832d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwj)) {
            return super.equals(obj);
        }
        nwj nwjVar = (nwj) obj;
        if (this.f44832d != nwjVar.f44832d) {
            return false;
        }
        boolean[] zArr = nwjVar.f44831c;
        for (int i = 0; i < this.f44832d; i++) {
            if (this.f44831c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.nxs
    /* JADX INFO: renamed from: f */
    public final void mo17776f(boolean z) {
        m17771cA();
        int i = this.f44832d;
        boolean[] zArr = this.f44831c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f44831c = zArr2;
        }
        boolean[] zArr3 = this.f44831c;
        int i2 = this.f44832d;
        this.f44832d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // p000.nxs
    /* JADX INFO: renamed from: g */
    public final boolean mo17777g(int i) {
        m17773i(i);
        return this.f44831c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Boolean.valueOf(mo17777g(i));
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM18152a = 1;
        for (int i = 0; i < this.f44832d; i++) {
            iM18152a = (iM18152a * 31) + nxz.m18152a(this.f44831c[i]);
        }
        return iM18152a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f44832d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44831c[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        m17773i(i);
        boolean[] zArr = this.f44831c;
        boolean z = zArr[i];
        int i2 = this.f44832d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f44832d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m17771cA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f44831c;
        System.arraycopy(zArr, i2, zArr, i, this.f44832d - i2);
        this.f44832d -= i2 - i;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m17771cA();
        m17773i(i);
        boolean[] zArr = this.f44831c;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44832d;
    }

    private nwj(boolean[] zArr, int i) {
        this.f44831c = zArr;
        this.f44832d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo17776f(((Boolean) obj).booleanValue());
        return true;
    }
}
