package p165i0;

import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: i0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6112e<K, V, T> implements Iterator<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final AbstractC6128u<K, V, T>[] f35927a;

    /* JADX INFO: renamed from: b */
    public int f35928b;

    /* JADX INFO: renamed from: c */
    public boolean f35929c;

    public AbstractC6112e(C6127t<K, V> c6127t, AbstractC6128u<K, V, T>[] abstractC6128uArr) {
        C5207g.m11111f(c6127t, "node");
        this.f35927a = abstractC6128uArr;
        this.f35929c = true;
        AbstractC6128u<K, V, T> abstractC6128u = abstractC6128uArr[0];
        Object[] objArr = c6127t.f35953d;
        int iBitCount = Integer.bitCount(c6127t.f35950a) * 2;
        abstractC6128u.getClass();
        C5207g.m11111f(objArr, "buffer");
        abstractC6128u.f35956a = objArr;
        abstractC6128u.f35957b = iBitCount;
        abstractC6128u.f35958c = 0;
        this.f35928b = 0;
        m12614a();
    }

    /* JADX INFO: renamed from: a */
    public final void m12614a() {
        int i10 = this.f35928b;
        AbstractC6128u<K, V, T>[] abstractC6128uArr = this.f35927a;
        AbstractC6128u<K, V, T> abstractC6128u = abstractC6128uArr[i10];
        if (abstractC6128u.f35958c < abstractC6128u.f35957b) {
            return;
        }
        while (-1 < i10) {
            int iM12615b = m12615b(i10);
            if (iM12615b == -1) {
                AbstractC6128u<K, V, T> abstractC6128u2 = abstractC6128uArr[i10];
                int i11 = abstractC6128u2.f35958c;
                Object[] objArr = abstractC6128u2.f35956a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    abstractC6128u2.f35958c = i11 + 1;
                    iM12615b = m12615b(i10);
                }
            }
            if (iM12615b != -1) {
                this.f35928b = iM12615b;
                return;
            }
            if (i10 > 0) {
                AbstractC6128u<K, V, T> abstractC6128u3 = abstractC6128uArr[i10 - 1];
                int i12 = abstractC6128u3.f35958c;
                int length2 = abstractC6128u3.f35956a.length;
                abstractC6128u3.f35958c = i12 + 1;
            }
            AbstractC6128u<K, V, T> abstractC6128u4 = abstractC6128uArr[i10];
            Object[] objArr2 = C6127t.f35949e.f35953d;
            abstractC6128u4.getClass();
            C5207g.m11111f(objArr2, "buffer");
            abstractC6128u4.f35956a = objArr2;
            abstractC6128u4.f35957b = 0;
            abstractC6128u4.f35958c = 0;
            i10--;
        }
        this.f35929c = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m12615b(int i10) {
        AbstractC6128u<K, V, T>[] abstractC6128uArr = this.f35927a;
        AbstractC6128u<K, V, T> abstractC6128u = abstractC6128uArr[i10];
        int i11 = abstractC6128u.f35958c;
        if (i11 < abstractC6128u.f35957b) {
            return i10;
        }
        Object[] objArr = abstractC6128u.f35956a;
        if (!(i11 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        C5207g.m11109d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C6127t c6127t = (C6127t) obj;
        if (i10 == 6) {
            AbstractC6128u<K, V, T> abstractC6128u2 = abstractC6128uArr[i10 + 1];
            Object[] objArr2 = c6127t.f35953d;
            int length2 = objArr2.length;
            abstractC6128u2.getClass();
            abstractC6128u2.f35956a = objArr2;
            abstractC6128u2.f35957b = length2;
            abstractC6128u2.f35958c = 0;
        } else {
            AbstractC6128u<K, V, T> abstractC6128u3 = abstractC6128uArr[i10 + 1];
            Object[] objArr3 = c6127t.f35953d;
            int iBitCount = Integer.bitCount(c6127t.f35950a) * 2;
            abstractC6128u3.getClass();
            C5207g.m11111f(objArr3, "buffer");
            abstractC6128u3.f35956a = objArr3;
            abstractC6128u3.f35957b = iBitCount;
            abstractC6128u3.f35958c = 0;
        }
        return m12615b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35929c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f35929c) {
            throw new NoSuchElementException();
        }
        T next = this.f35927a[this.f35928b].next();
        m12614a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
