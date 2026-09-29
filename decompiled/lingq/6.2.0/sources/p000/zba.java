package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zba implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public Object[] f71319a = yba.f69611e.f69615d;

    /* JADX INFO: renamed from: b */
    public int f71320b;

    /* JADX INFO: renamed from: c */
    public int f71321c;

    /* JADX INFO: renamed from: a */
    public final void m25541a(Object[] objArr, int i, int i2) {
        this.f71319a = objArr;
        this.f71320b = i;
        this.f71321c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71321c < this.f71320b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
