package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class j8c extends s1c implements RandomAccess, y8c {

    /* JADX INFO: renamed from: d */
    public static final int[] f45225d;

    /* JADX INFO: renamed from: e */
    public static final j8c f45226e;

    /* JADX INFO: renamed from: b */
    public int[] f45227b;

    /* JADX INFO: renamed from: c */
    public int f45228c;

    static {
        int[] iArr = new int[0];
        f45225d = iArr;
        f45226e = new j8c(iArr, 0, false);
    }

    public j8c(int[] iArr, int i, boolean z) {
        super(z);
        this.f45227b = iArr;
        this.f45228c = i;
    }

    /* JADX INFO: renamed from: h */
    public static j8c m14338h() {
        return f45226e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m21004d();
        if (i < 0 || i > (i2 = this.f45228c)) {
            v63.m23143u(wq1.m24115k("Index:", i, this.f45228c, ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f45227b;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f45227b, 0, iArr2, 0, i);
            System.arraycopy(this.f45227b, i, iArr2, i3, this.f45228c - i);
            this.f45227b = iArr2;
        }
        this.f45227b[i] = iIntValue;
        this.f45228c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.s1c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m21004d();
        Charset charset = m9c.f50823a;
        collection.getClass();
        if (!(collection instanceof j8c)) {
            return super.addAll(collection);
        }
        j8c j8cVar = (j8c) collection;
        int i = j8cVar.f45228c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45228c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f45227b;
        if (i3 > iArr.length) {
            this.f45227b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(j8cVar.f45227b, 0, this.f45227b, this.f45228c, j8cVar.f45228c);
        this.f45228c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.s1c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8c)) {
            return super.equals(obj);
        }
        j8c j8cVar = (j8c) obj;
        if (this.f45228c != j8cVar.f45228c) {
            return false;
        }
        int[] iArr = j8cVar.f45227b;
        for (int i = 0; i < this.f45228c; i++) {
            if (this.f45227b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m14339g(int i) {
        m14342k(i);
        return this.f45227b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m14342k(i);
        return Integer.valueOf(this.f45227b[i]);
    }

    @Override // p000.s1c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45228c; i2++) {
            i = (i * 31) + this.f45227b[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m14340i(int i) {
        m21004d();
        int i2 = this.f45228c;
        int length = this.f45227b.length;
        if (i2 == length) {
            int[] iArr = new int[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f45227b, 0, iArr, 0, this.f45228c);
            this.f45227b = iArr;
        }
        int[] iArr2 = this.f45227b;
        int i3 = this.f45228c;
        this.f45228c = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f45228c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45227b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m14341j(int i) {
        int length = this.f45227b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f45227b = new int[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = g9a.m12427d(length, 3, 2, 1, 10);
        }
        this.f45227b = Arrays.copyOf(this.f45227b, length);
    }

    /* JADX INFO: renamed from: k */
    public final void m14342k(int i) {
        if (i < 0 || i >= this.f45228c) {
            v63.m23143u(wq1.m24115k("Index:", i, this.f45228c, ", Size:"));
        }
    }

    @Override // p000.e9c
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ e9c mo10949p(int i) {
        if (i >= this.f45228c) {
            return new j8c(i == 0 ? f45225d : Arrays.copyOf(this.f45227b, i), this.f45228c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.s1c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m21004d();
        m14342k(i);
        int[] iArr = this.f45227b;
        int i2 = iArr[i];
        int i3 = this.f45228c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f45228c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m21004d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f45227b;
        System.arraycopy(iArr, i2, iArr, i, this.f45228c - i2);
        this.f45228c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m21004d();
        m14342k(i);
        int[] iArr = this.f45227b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45228c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m14340i(((Integer) obj).intValue());
        return true;
    }
}
