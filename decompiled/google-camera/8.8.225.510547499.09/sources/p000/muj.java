package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class muj implements Iterator {

    /* JADX INFO: renamed from: b */
    int f41636b;

    /* JADX INFO: renamed from: c */
    int f41637c;

    /* JADX INFO: renamed from: d */
    int f41638d = -1;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ mun f41639e;

    public muj(mun munVar) {
        this.f41639e = munVar;
        this.f41636b = munVar.f41649e;
        this.f41637c = munVar.m16945a();
    }

    /* JADX INFO: renamed from: b */
    private final void m16940b() {
        if (this.f41639e.f41649e != this.f41636b) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo16939a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41637c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m16940b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41637c;
        this.f41638d = i;
        Object objMo16939a = mo16939a(i);
        this.f41637c = this.f41639e.m16946b(this.f41637c);
        return objMo16939a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m16940b();
        lku.m15654h(this.f41638d >= 0);
        this.f41636b += 32;
        mun munVar = this.f41639e;
        munVar.remove(munVar.m16949f(this.f41638d));
        this.f41637c--;
        this.f41638d = -1;
    }
}
