package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class doc extends agc implements hvc, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final doc f35978d;

    /* JADX INFO: renamed from: b */
    public int[] f35979b;

    /* JADX INFO: renamed from: c */
    public int f35980c;

    static {
        doc docVar = new doc(new int[0], 0);
        f35978d = docVar;
        docVar.f614a = false;
    }

    public doc(int[] iArr, int i) {
        this.f35979b = iArr;
        this.f35980c = i;
    }

    @Override // p000.mpc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpc mo5748a(int i) {
        if (i >= this.f35980c) {
            return new doc(Arrays.copyOf(this.f35979b, i), this.f35980c);
        }
        ij6.m13959q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m390d();
        if (i < 0 || i > (i2 = this.f35980c)) {
            v63.m23143u(m10564h(i));
            return;
        }
        int[] iArr = this.f35979b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f35979b, i, iArr2, i + 1, this.f35980c - i);
            this.f35979b = iArr2;
        }
        this.f35979b[i] = iIntValue;
        this.f35980c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.agc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m390d();
        Charset charset = noc.f53082a;
        collection.getClass();
        if (!(collection instanceof doc)) {
            return super.addAll(collection);
        }
        doc docVar = (doc) collection;
        int i = docVar.f35980c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35980c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f35979b;
        if (i3 > iArr.length) {
            this.f35979b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(docVar.f35979b, 0, this.f35979b, this.f35980c, docVar.f35980c);
        this.f35980c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doc)) {
            return super.equals(obj);
        }
        doc docVar = (doc) obj;
        if (this.f35980c != docVar.f35980c) {
            return false;
        }
        int[] iArr = docVar.f35979b;
        for (int i = 0; i < this.f35980c; i++) {
            if (this.f35979b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10562f(int i) {
        m390d();
        int i2 = this.f35980c;
        int[] iArr = this.f35979b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f35979b = iArr2;
        }
        int[] iArr3 = this.f35979b;
        int i3 = this.f35980c;
        this.f35980c = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m10563g(int i) {
        if (i < 0 || i >= this.f35980c) {
            v63.m23143u(m10564h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10563g(i);
        return Integer.valueOf(this.f35979b[i]);
    }

    /* JADX INFO: renamed from: h */
    public final String m10564h(int i) {
        int i2 = this.f35980c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.agc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35980c; i2++) {
            i = (i * 31) + this.f35979b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f35980c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f35979b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m390d();
        m10563g(i);
        int[] iArr = this.f35979b;
        int i2 = iArr[i];
        int i3 = this.f35980c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f35980c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m390d();
        if (i2 < i) {
            v63.m23143u("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f35979b;
        System.arraycopy(iArr, i2, iArr, i, this.f35980c - i2);
        this.f35980c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m390d();
        m10563g(i);
        int[] iArr = this.f35979b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35980c;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m10562f(((Integer) obj).intValue());
        return true;
    }
}
