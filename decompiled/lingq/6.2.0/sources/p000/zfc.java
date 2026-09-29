package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zfc extends s1c implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f71506d;

    /* JADX INFO: renamed from: e */
    public static final zfc f71507e;

    /* JADX INFO: renamed from: b */
    public Object[] f71508b;

    /* JADX INFO: renamed from: c */
    public int f71509c;

    static {
        Object[] objArr = new Object[0];
        f71506d = objArr;
        f71507e = new zfc(objArr, 0, false);
    }

    public zfc(Object[] objArr, int i, boolean z) {
        super(z);
        this.f71508b = objArr;
        this.f71509c = i;
    }

    /* JADX INFO: renamed from: g */
    public static zfc m25596g() {
        return f71507e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m21004d();
        if (i < 0 || i > (i2 = this.f71509c)) {
            v63.m23143u(wq1.m24115k("Index:", i, this.f71509c, ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f71508b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[g9a.m12427d(length, 3, 2, 1, 10)];
            System.arraycopy(this.f71508b, 0, objArr2, 0, i);
            System.arraycopy(this.f71508b, i, objArr2, i3, this.f71509c - i);
            this.f71508b = objArr2;
        }
        this.f71508b[i] = obj;
        this.f71509c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m25597h(i);
        return this.f71508b[i];
    }

    /* JADX INFO: renamed from: h */
    public final void m25597h(int i) {
        if (i < 0 || i >= this.f71509c) {
            v63.m23143u(wq1.m24115k("Index:", i, this.f71509c, ", Size:"));
        }
    }

    @Override // p000.e9c
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ e9c mo10949p(int i) {
        if (i >= this.f71509c) {
            return new zfc(i == 0 ? f71506d : Arrays.copyOf(this.f71508b, i), this.f71509c, true);
        }
        ij6.m13959q();
        return null;
    }

    @Override // p000.s1c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21004d();
        m25597h(i);
        Object[] objArr = this.f71508b;
        Object obj = objArr[i];
        int i2 = this.f71509c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f71509c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m21004d();
        m25597h(i);
        Object[] objArr = this.f71508b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71509c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21004d();
        int i = this.f71509c;
        int length = this.f71508b.length;
        if (i == length) {
            this.f71508b = Arrays.copyOf(this.f71508b, g9a.m12427d(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f71508b;
        int i2 = this.f71509c;
        this.f71509c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
