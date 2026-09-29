package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xnd implements Iterator {

    /* JADX INFO: renamed from: a */
    public final end f68416a;

    /* JADX INFO: renamed from: b */
    public int f68417b;

    /* JADX INFO: renamed from: c */
    public int f68418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ynd f68419d;

    public /* synthetic */ xnd(ynd yndVar, end endVar, int i) {
        this.f68419d = yndVar;
        this.f68416a = endVar;
        int i2 = i & 31;
        this.f68417b = i2;
        this.f68418c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68417b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f68417b;
        ynd yndVar = this.f68419d;
        afa afaVar = yndVar.f70131b;
        int iMo357g = afaVar.mo357g();
        Object objCast = this.f68416a.f37585b.cast(i >= iMo357g ? yndVar.f70132c.mo359i(i - iMo357g) : afaVar.mo359i(i));
        int i2 = this.f68418c;
        if (i2 == 0) {
            this.f68417b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f68418c >>>= iNumberOfTrailingZeros;
        this.f68417b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
