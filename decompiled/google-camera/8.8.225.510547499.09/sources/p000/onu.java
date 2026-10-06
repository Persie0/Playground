package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class onu implements Iterator {

    /* JADX INFO: renamed from: a */
    private int f46327a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46328b;

    /* JADX INFO: renamed from: c */
    private final Object f46329c;

    public onu(jgl jglVar, int i) {
        this.f46328b = i;
        this.f46329c = jglVar;
        this.f46327a = -1;
    }

    public onu(Object[] objArr, int i) {
        this.f46328b = i;
        this.f46329c = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, jgl] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f46328b) {
            case 0:
                if (this.f46327a < ((Object[]) this.f46329c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f46327a < this.f46329c.mo13134b() - 1) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jgl] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f46328b) {
            case 0:
                try {
                    Object obj = this.f46329c;
                    int i = this.f46327a;
                    this.f46327a = i + 1;
                    return ((Object[]) obj)[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f46327a--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                if (hasNext()) {
                    ?? r0 = this.f46329c;
                    int i2 = this.f46327a + 1;
                    this.f46327a = i2;
                    return r0.mo13135c(i2);
                }
                throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f46327a);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f46328b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
    }
}
