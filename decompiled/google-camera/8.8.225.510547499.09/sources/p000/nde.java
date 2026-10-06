package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nde implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ndf f42035a;

    /* JADX INFO: renamed from: b */
    private final nbz f42036b;

    /* JADX INFO: renamed from: c */
    private int f42037c;

    /* JADX INFO: renamed from: d */
    private int f42038d;

    public nde(ndf ndfVar, nbz nbzVar, int i) {
        this.f42035a = ndfVar;
        this.f42036b = nbzVar;
        int i2 = i & 31;
        this.f42037c = i2;
        this.f42038d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42037c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM17310d = this.f42036b.m17310d(this.f42035a.m17355e(this.f42037c));
        int i = this.f42038d;
        if (i != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.f42038d >>>= iNumberOfTrailingZeros;
            this.f42037c += iNumberOfTrailingZeros;
        } else {
            this.f42037c = -1;
        }
        return objM17310d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
