package p021j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.concurrent.h */
/* JADX INFO: loaded from: classes3.dex */
final class C0530h extends AbstractC0523a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f33205k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0530h(C0533k[] c0533kArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(c0533kArr, i, i2, concurrentHashMap);
        this.f33205k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33205k) {
            case 0:
                C0533k c0533k = this.f33220b;
                if (c0533k == null) {
                    throw new NoSuchElementException();
                }
                this.f33200j = c0533k;
                m12566a();
                return c0533k.f33212b;
            default:
                C0533k c0533k2 = this.f33220b;
                if (c0533k2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c0533k2.f33213c;
                this.f33200j = c0533k2;
                m12566a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f33205k) {
            case 0:
                break;
            default:
                break;
        }
        return next();
    }
}
