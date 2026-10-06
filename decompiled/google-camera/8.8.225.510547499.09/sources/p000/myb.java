package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myb extends naz {

    /* JADX INFO: renamed from: a */
    boolean f41795a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f41796b;

    public myb(Object obj) {
        this.f41796b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f41795a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41795a) {
            throw new NoSuchElementException();
        }
        this.f41795a = true;
        return this.f41796b;
    }
}
