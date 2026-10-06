package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oaa implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f45117a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oab f45118b;

    public oaa(oab oabVar) {
        this.f45118b = oabVar;
        this.f45117a = oabVar.f45119a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45117a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f45117a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
