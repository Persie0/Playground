package p165i0;

import dm.C5207g;
import dm.C5213m;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: i0.g */
/* JADX INFO: loaded from: classes.dex */
public class C6114g<K, V, T> extends AbstractC6112e<K, V, T> {

    /* JADX INFO: renamed from: d */
    public final C6113f<K, V> f35936d;

    /* JADX INFO: renamed from: e */
    public K f35937e;

    /* JADX INFO: renamed from: f */
    public boolean f35938f;

    /* JADX INFO: renamed from: g */
    public int f35939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6114g(C6113f<K, V> c6113f, AbstractC6128u<K, V, T>[] abstractC6128uArr) {
        super(c6113f.f35932c, abstractC6128uArr);
        C5207g.m11111f(c6113f, "builder");
        this.f35936d = c6113f;
        this.f35939g = c6113f.f35934e;
    }

    /* JADX INFO: renamed from: c */
    public final void m12618c(int i10, C6127t<?, ?> c6127t, K k10, int i11) {
        int i12 = i11 * 5;
        AbstractC6128u<K, V, T>[] abstractC6128uArr = this.f35927a;
        if (i12 <= 30) {
            int i13 = 1 << ((i10 >> i12) & 31);
            if (c6127t.m12630h(i13)) {
                int iM12628f = c6127t.m12628f(i13);
                AbstractC6128u<K, V, T> abstractC6128u = abstractC6128uArr[i11];
                Object[] objArr = c6127t.f35953d;
                int iBitCount = Integer.bitCount(c6127t.f35950a) * 2;
                abstractC6128u.getClass();
                C5207g.m11111f(objArr, "buffer");
                abstractC6128u.f35956a = objArr;
                abstractC6128u.f35957b = iBitCount;
                abstractC6128u.f35958c = iM12628f;
                this.f35928b = i11;
                return;
            }
            int iM12641t = c6127t.m12641t(i13);
            C6127t<?, ?> c6127tM12640s = c6127t.m12640s(iM12641t);
            AbstractC6128u<K, V, T> abstractC6128u2 = abstractC6128uArr[i11];
            Object[] objArr2 = c6127t.f35953d;
            int iBitCount2 = Integer.bitCount(c6127t.f35950a) * 2;
            abstractC6128u2.getClass();
            C5207g.m11111f(objArr2, "buffer");
            abstractC6128u2.f35956a = objArr2;
            abstractC6128u2.f35957b = iBitCount2;
            abstractC6128u2.f35958c = iM12641t;
            m12618c(i10, c6127tM12640s, k10, i11 + 1);
            return;
        }
        AbstractC6128u<K, V, T> abstractC6128u3 = abstractC6128uArr[i11];
        Object[] objArr3 = c6127t.f35953d;
        int length = objArr3.length;
        abstractC6128u3.getClass();
        abstractC6128u3.f35956a = objArr3;
        abstractC6128u3.f35957b = length;
        abstractC6128u3.f35958c = 0;
        while (true) {
            AbstractC6128u<K, V, T> abstractC6128u4 = abstractC6128uArr[i11];
            if (C5207g.m11106a(abstractC6128u4.f35956a[abstractC6128u4.f35958c], k10)) {
                this.f35928b = i11;
                return;
            } else {
                abstractC6128uArr[i11].f35958c += 2;
            }
        }
    }

    @Override // p165i0.AbstractC6112e, java.util.Iterator
    public final T next() {
        if (this.f35936d.f35934e != this.f35939g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f35929c) {
            throw new NoSuchElementException();
        }
        AbstractC6128u<K, V, T> abstractC6128u = this.f35927a[this.f35928b];
        this.f35937e = (K) abstractC6128u.f35956a[abstractC6128u.f35958c];
        this.f35938f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p165i0.AbstractC6112e, java.util.Iterator
    public final void remove() {
        if (!this.f35938f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f35929c;
        C6113f<K, V> c6113f = this.f35936d;
        if (!z10) {
            C5213m.m11198c(c6113f).remove(this.f35937e);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            AbstractC6128u<K, V, T> abstractC6128u = this.f35927a[this.f35928b];
            Object obj = abstractC6128u.f35956a[abstractC6128u.f35958c];
            C5213m.m11198c(c6113f).remove(this.f35937e);
            m12618c(obj != null ? obj.hashCode() : 0, c6113f.f35932c, obj, 0);
        }
        this.f35937e = null;
        this.f35938f = false;
        this.f35939g = c6113f.f35934e;
    }
}
