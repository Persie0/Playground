package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nxc extends nwf implements RandomAccess, nxy, nze {

    /* JADX INFO: renamed from: b */
    private static final nxc f44895b;

    /* JADX INFO: renamed from: c */
    private double[] f44896c;

    /* JADX INFO: renamed from: d */
    private int f44897d;

    static {
        nxc nxcVar = new nxc(new double[0], 0);
        f44895b = nxcVar;
        nxcVar.mo17769b();
    }

    public nxc() {
        this(new double[10], 0);
    }

    /* JADX INFO: renamed from: f */
    private final String m18008f(int i) {
        return "Index:" + i + ", Size:" + this.f44897d;
    }

    /* JADX INFO: renamed from: g */
    private final void m18009g(int i) {
        if (i < 0 || i >= this.f44897d) {
            throw new IndexOutOfBoundsException(m18008f(i));
        }
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m17771cA();
        if (i < 0 || i > (i2 = this.f44897d)) {
            throw new IndexOutOfBoundsException(m18008f(i));
        }
        double[] dArr = this.f44896c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f44896c, i, dArr2, i + 1, this.f44897d - i);
            this.f44896c = dArr2;
        }
        this.f44896c[i] = dDoubleValue;
        this.f44897d++;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17771cA();
        nxz.m18156e(collection);
        if (!(collection instanceof nxc)) {
            return super.addAll(collection);
        }
        nxc nxcVar = (nxc) collection;
        int i = nxcVar.f44897d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44897d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f44896c;
        if (i3 > dArr.length) {
            this.f44896c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(nxcVar.f44896c, 0, this.f44896c, this.f44897d, nxcVar.f44897d);
        this.f44897d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m18010d(double d) {
        m17771cA();
        int i = this.f44897d;
        double[] dArr = this.f44896c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f44896c = dArr2;
        }
        double[] dArr3 = this.f44896c;
        int i2 = this.f44897d;
        this.f44897d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ nxy mo17775e(int i) {
        if (i >= this.f44897d) {
            return new nxc(Arrays.copyOf(this.f44896c, i), this.f44897d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxc)) {
            return super.equals(obj);
        }
        nxc nxcVar = (nxc) obj;
        if (this.f44897d != nxcVar.f44897d) {
            return false;
        }
        double[] dArr = nxcVar.f44896c;
        for (int i = 0; i < this.f44897d; i++) {
            if (Double.doubleToLongBits(this.f44896c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m18009g(i);
        return Double.valueOf(this.f44896c[i]);
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM18153b = 1;
        for (int i = 0; i < this.f44897d; i++) {
            iM18153b = (iM18153b * 31) + nxz.m18153b(Double.doubleToLongBits(this.f44896c[i]));
        }
        return iM18153b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f44897d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44896c[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        m18009g(i);
        double[] dArr = this.f44896c;
        double d = dArr[i];
        int i2 = this.f44897d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f44897d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m17771cA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f44896c;
        System.arraycopy(dArr, i2, dArr, i, this.f44897d - i2);
        this.f44897d -= i2 - i;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m17771cA();
        m18009g(i);
        double[] dArr = this.f44896c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44897d;
    }

    private nxc(double[] dArr, int i) {
        this.f44896c = dArr;
        this.f44897d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m18010d(((Double) obj).doubleValue());
        return true;
    }
}
