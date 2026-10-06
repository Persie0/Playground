package p021j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.concurrent.d */
/* JADX INFO: loaded from: classes3.dex */
final class C0526d extends AbstractC0523a implements Iterator {
    C0526d(C0533k[] c0533kArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c0533kArr, i, i2, concurrentHashMap);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0533k c0533k = this.f33220b;
        if (c0533k == null) {
            throw new NoSuchElementException();
        }
        Object obj = c0533k.f33212b;
        Object obj2 = c0533k.f33213c;
        this.f33200j = c0533k;
        m12566a();
        return new C0532j(obj, obj2, this.f33199i);
    }
}
