package p021j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.S */
/* JADX INFO: loaded from: classes3.dex */
class C0515S implements Spliterator {

    /* JADX INFO: renamed from: a */
    private final Collection f33150a;

    /* JADX INFO: renamed from: b */
    private Iterator f33151b;

    /* JADX INFO: renamed from: c */
    private final int f33152c;

    /* JADX INFO: renamed from: d */
    private long f33153d;

    /* JADX INFO: renamed from: e */
    private int f33154e;

    public C0515S(Collection collection, int i) {
        this.f33150a = collection;
        this.f33151b = null;
        this.f33152c = (i & 4096) == 0 ? i | 64 | 16384 : i;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return this.f33152c;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        if (this.f33151b != null) {
            return this.f33153d;
        }
        Collection collection = this.f33150a;
        this.f33151b = collection.iterator();
        long size = collection.size();
        this.f33153d = size;
        return size;
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f33151b;
        if (it == null) {
            Collection collection = this.f33150a;
            Iterator it2 = collection.iterator();
            this.f33151b = it2;
            this.f33153d = collection.size();
            it = it2;
        }
        if (it instanceof InterfaceC0559h) {
            ((InterfaceC0559h) it).forEachRemaining(consumer);
        } else {
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    @Override // p021j$.util.Spliterator
    public Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f33151b == null) {
            Collection collection = this.f33150a;
            this.f33151b = collection.iterator();
            this.f33153d = collection.size();
        }
        if (!this.f33151b.hasNext()) {
            return false;
        }
        consumer.accept(this.f33151b.next());
        return true;
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f33151b;
        if (it == null) {
            Collection collection = this.f33150a;
            Iterator it2 = collection.iterator();
            this.f33151b = it2;
            size = collection.size();
            this.f33153d = size;
            it = it2;
        } else {
            size = this.f33153d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f33154e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f33154e = i2;
        long j = this.f33153d;
        if (j != Long.MAX_VALUE) {
            this.f33153d = j - ((long) i2);
        }
        return new C0508K(objArr, 0, i2, this.f33152c);
    }

    public C0515S(Iterator it) {
        this.f33150a = null;
        this.f33151b = it;
        this.f33153d = Long.MAX_VALUE;
        this.f33152c = 0;
    }
}
