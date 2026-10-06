package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class muo implements Iterator {

    /* JADX INFO: renamed from: a */
    int f41655a;

    /* JADX INFO: renamed from: b */
    int f41656b;

    /* JADX INFO: renamed from: c */
    int f41657c = -1;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mup f41658d;

    public muo(mup mupVar) {
        this.f41658d = mupVar;
        this.f41655a = mupVar.f41660b;
        this.f41656b = mupVar.m16970a();
    }

    /* JADX INFO: renamed from: a */
    private final void m16963a() {
        if (this.f41658d.f41660b != this.f41655a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41656b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m16963a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41656b;
        this.f41657c = i;
        Object objM16972c = this.f41658d.m16972c(i);
        this.f41656b = this.f41658d.m16971b(this.f41656b);
        return objM16972c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m16963a();
        lku.m15654h(this.f41657c >= 0);
        this.f41655a += 32;
        mup mupVar = this.f41658d;
        mupVar.remove(mupVar.m16972c(this.f41657c));
        this.f41656b--;
        this.f41657c = -1;
    }
}
