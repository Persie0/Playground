package p000;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzg extends nwf implements RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final nzg f45063b;

    /* JADX INFO: renamed from: c */
    private Object[] f45064c;

    /* JADX INFO: renamed from: d */
    private int f45065d;

    static {
        nzg nzgVar = new nzg(new Object[0], 0);
        f45063b = nzgVar;
        nzgVar.mo17769b();
    }

    public nzg() {
        this(new Object[10], 0);
    }

    /* JADX INFO: renamed from: d */
    private final String m18261d(int i) {
        return "Index:" + i + ", Size:" + this.f45065d;
    }

    /* JADX INFO: renamed from: f */
    private final void m18262f(int i) {
        if (i < 0 || i >= this.f45065d) {
            throw new IndexOutOfBoundsException(m18261d(i));
        }
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m17771cA();
        if (i < 0 || i > (i2 = this.f45065d)) {
            throw new IndexOutOfBoundsException(m18261d(i));
        }
        Object[] objArr = this.f45064c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f45064c, i, objArr2, i + 1, this.f45065d - i);
            this.f45064c = objArr2;
        }
        this.f45064c[i] = obj;
        this.f45065d++;
        this.modCount++;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ nxy mo17775e(int i) {
        if (i >= this.f45065d) {
            return new nzg(Arrays.copyOf(this.f45064c, i), this.f45065d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m18262f(i);
        return this.f45064c[i];
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m17771cA();
        m18262f(i);
        Object[] objArr = this.f45064c;
        Object obj = objArr[i];
        int i2 = this.f45065d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f45065d--;
        this.modCount++;
        return obj;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m17771cA();
        m18262f(i);
        Object[] objArr = this.f45064c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45065d;
    }

    private nzg(Object[] objArr, int i) {
        this.f45064c = objArr;
        this.f45065d = i;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m17771cA();
        int i = this.f45065d;
        Object[] objArr = this.f45064c;
        if (i == objArr.length) {
            this.f45064c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f45064c;
        int i2 = this.f45065d;
        this.f45065d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
