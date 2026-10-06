package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxr extends nwf implements RandomAccess, nxw, nze {

    /* JADX INFO: renamed from: b */
    public static final nxr f44982b;

    /* JADX INFO: renamed from: c */
    private int[] f44983c;

    /* JADX INFO: renamed from: d */
    private int f44984d;

    static {
        nxr nxrVar = new nxr(new int[0], 0);
        f44982b = nxrVar;
        nxrVar.mo17769b();
    }

    public nxr() {
        this(new int[10], 0);
    }

    /* JADX INFO: renamed from: h */
    private final String m18144h(int i) {
        return "Index:" + i + ", Size:" + this.f44984d;
    }

    /* JADX INFO: renamed from: i */
    private final void m18145i(int i) {
        if (i < 0 || i >= this.f44984d) {
            throw new IndexOutOfBoundsException(m18144h(i));
        }
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m17771cA();
        if (i < 0 || i > (i2 = this.f44984d)) {
            throw new IndexOutOfBoundsException(m18144h(i));
        }
        int[] iArr = this.f44983c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f44983c, i, iArr2, i + 1, this.f44984d - i);
            this.f44983c = iArr2;
        }
        this.f44983c[i] = iIntValue;
        this.f44984d++;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m17771cA();
        nxz.m18156e(collection);
        if (!(collection instanceof nxr)) {
            return super.addAll(collection);
        }
        nxr nxrVar = (nxr) collection;
        int i = nxrVar.f44984d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44984d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f44983c;
        if (i3 > iArr.length) {
            this.f44983c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(nxrVar.f44983c, 0, this.f44983c, this.f44984d, nxrVar.f44984d);
        this.f44984d = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.nxw
    /* JADX INFO: renamed from: d */
    public final int mo18146d(int i) {
        m18145i(i);
        return this.f44983c[i];
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxr)) {
            return super.equals(obj);
        }
        nxr nxrVar = (nxr) obj;
        if (this.f44984d != nxrVar.f44984d) {
            return false;
        }
        int[] iArr = nxrVar.f44983c;
        for (int i = 0; i < this.f44984d; i++) {
            if (this.f44983c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nxw mo17775e(int i) {
        if (i >= this.f44984d) {
            return new nxr(Arrays.copyOf(this.f44983c, i), this.f44984d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.nxw
    /* JADX INFO: renamed from: g */
    public final void mo18148g(int i) {
        m17771cA();
        int i2 = this.f44984d;
        int[] iArr = this.f44983c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f44983c = iArr2;
        }
        int[] iArr3 = this.f44983c;
        int i3 = this.f44984d;
        this.f44984d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo18146d(i));
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44984d; i2++) {
            i = (i * 31) + this.f44983c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f44984d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44983c[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        m18145i(i);
        int[] iArr = this.f44983c;
        int i2 = iArr[i];
        int i3 = this.f44984d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f44984d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m17771cA();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f44983c;
        System.arraycopy(iArr, i2, iArr, i, this.f44984d - i2);
        this.f44984d -= i2 - i;
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m17771cA();
        m18145i(i);
        int[] iArr = this.f44983c;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44984d;
    }

    private nxr(int[] iArr, int i) {
        this.f44983c = iArr;
        this.f44984d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo18148g(((Integer) obj).intValue());
        return true;
    }
}
