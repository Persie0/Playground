package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class dwc extends agc implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final dwc f36341d;

    /* JADX INFO: renamed from: b */
    public Object[] f36342b;

    /* JADX INFO: renamed from: c */
    public int f36343c;

    static {
        dwc dwcVar = new dwc(new Object[0], 0);
        f36341d = dwcVar;
        dwcVar.f614a = false;
    }

    public dwc(Object[] objArr, int i) {
        this.f36342b = objArr;
        this.f36343c = i;
    }

    @Override // p000.mpc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpc mo5748a(int i) {
        if (i >= this.f36343c) {
            return new dwc(Arrays.copyOf(this.f36342b, i), this.f36343c);
        }
        ij6.m13959q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m390d();
        if (i < 0 || i > (i2 = this.f36343c)) {
            v63.m23143u(m10708g(i));
            return;
        }
        Object[] objArr = this.f36342b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[hn1.m13352a(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f36342b, i, objArr2, i + 1, this.f36343c - i);
            this.f36342b = objArr2;
        }
        this.f36342b[i] = obj;
        this.f36343c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: f */
    public final void m10707f(int i) {
        if (i < 0 || i >= this.f36343c) {
            v63.m23143u(m10708g(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m10708g(int i) {
        int i2 = this.f36343c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10707f(i);
        return this.f36342b[i];
    }

    @Override // p000.agc, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m390d();
        m10707f(i);
        Object[] objArr = this.f36342b;
        Object obj = objArr[i];
        int i2 = this.f36343c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f36343c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m390d();
        m10707f(i);
        Object[] objArr = this.f36342b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36343c;
    }

    @Override // p000.agc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m390d();
        int i = this.f36343c;
        Object[] objArr = this.f36342b;
        if (i == objArr.length) {
            this.f36342b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f36342b;
        int i2 = this.f36343c;
        this.f36343c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
