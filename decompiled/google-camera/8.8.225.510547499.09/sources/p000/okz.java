package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okz implements Iterator {

    /* JADX INFO: renamed from: a */
    public boolean f46220a;

    /* JADX INFO: renamed from: b */
    private final int f46221b;

    /* JADX INFO: renamed from: c */
    private final int f46222c;

    /* JADX INFO: renamed from: d */
    private int f46223d;

    public okz() {
    }

    public okz(int i, int i2) {
        this.f46221b = 1;
        this.f46222c = i2;
        boolean z = i <= i2;
        this.f46220a = z;
        this.f46223d = true != z ? i2 : i;
    }

    /* JADX INFO: renamed from: a */
    public final int m18604a() {
        int i = this.f46223d;
        if (i != this.f46222c) {
            this.f46223d = this.f46221b + i;
        } else {
            if (!this.f46220a) {
                throw new NoSuchElementException();
            }
            this.f46220a = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46220a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m18604a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
