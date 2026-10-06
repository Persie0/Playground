package p021j$.nio.file;

import java.util.Iterator;

/* JADX INFO: renamed from: j$.nio.file.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C0412y implements Iterator {

    /* JADX INFO: renamed from: a */
    private final Iterator f32899a;

    public C0412y(Iterator it) {
        this.f32899a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32899a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC0335a.m12109h(this.f32899a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f32899a.remove();
    }
}
