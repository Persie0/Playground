package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class xhb extends chb implements RandomAccess, hib, bjb {

    /* JADX INFO: renamed from: d */
    public static final int[] f68224d;

    /* JADX INFO: renamed from: e */
    public static final xhb f68225e;

    /* JADX INFO: renamed from: b */
    public int[] f68226b;

    /* JADX INFO: renamed from: c */
    public int f68227c;

    static {
        int[] iArr = new int[0];
        f68224d = iArr;
        f68225e = new xhb(iArr, 0, false);
    }

    public xhb(int[] iArr, int i, boolean z) {
        super(z);
        this.f68226b = iArr;
        this.f68227c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m4665d();
        if (i < 0 || i > (i2 = this.f68227c)) {
            v63.m23143u(ehb.m11156a(this.f68227c, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f68226b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f68226b, 0, iArr2, 0, i);
            System.arraycopy(this.f68226b, i, iArr2, i3, this.f68227c - i);
            this.f68226b = iArr2;
        }
        this.f68226b[i] = iIntValue;
        this.f68227c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.chb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m4665d();
        collection.getClass();
        if (!(collection instanceof xhb)) {
            return super.addAll(collection);
        }
        xhb xhbVar = (xhb) collection;
        int i = xhbVar.f68227c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f68227c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f68226b;
        if (i3 > iArr.length) {
            this.f68226b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(xhbVar.f68226b, 0, this.f68226b, this.f68227c, xhbVar.f68227c);
        this.f68227c = i3;
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
        if (!(obj instanceof xhb)) {
            return super.equals(obj);
        }
        xhb xhbVar = (xhb) obj;
        if (this.f68227c != xhbVar.f68227c) {
            return false;
        }
        int[] iArr = xhbVar.f68226b;
        for (int i = 0; i < this.f68227c; i++) {
            if (this.f68226b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.mib
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xhb mo10419Y(int i) {
        if (i >= this.f68227c) {
            return new xhb(i == 0 ? f68224d : Arrays.copyOf(this.f68226b, i), this.f68227c, true);
        }
        ij6.m13959q();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m24522g(int i) {
        m24524i(i);
        return this.f68226b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m24524i(i);
        return Integer.valueOf(this.f68226b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m24523h(int i) {
        m4665d();
        int i2 = this.f68227c;
        int length = this.f68226b.length;
        if (i2 == length) {
            int[] iArr = new int[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f68226b, 0, iArr, 0, this.f68227c);
            this.f68226b = iArr;
        }
        int[] iArr2 = this.f68226b;
        int i3 = this.f68227c;
        this.f68227c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f68227c; i2++) {
            i = (i * 31) + this.f68226b[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m24524i(int i) {
        if (i < 0 || i >= this.f68227c) {
            v63.m23143u(ehb.m11156a(this.f68227c, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f68227c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f68226b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.chb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m4665d();
        m24524i(i);
        int[] iArr = this.f68226b;
        int i2 = iArr[i];
        int i3 = this.f68227c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f68227c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m4665d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f68226b;
        System.arraycopy(iArr, i2, iArr, i, this.f68227c - i2);
        this.f68227c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m4665d();
        m24524i(i);
        int[] iArr = this.f68226b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68227c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m24523h(((Integer) obj).intValue());
        return true;
    }
}
