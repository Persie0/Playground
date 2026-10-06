package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class mth implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f41587a;

    /* JADX INFO: renamed from: b */
    final Collection f41588b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mti f41589c;

    public mth(mti mtiVar) {
        this.f41589c = mtiVar;
        this.f41588b = mtiVar.f41591b;
        Collection collection = mtiVar.f41591b;
        this.f41587a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public mth(mti mtiVar, Iterator it) {
        this.f41589c = mtiVar;
        this.f41588b = mtiVar.f41591b;
        this.f41587a = it;
    }

    /* JADX INFO: renamed from: a */
    final void m16891a() {
        this.f41589c.m16893b();
        if (this.f41589c.f41591b != this.f41588b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m16891a();
        return this.f41587a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m16891a();
        return this.f41587a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f41587a.remove();
        mtm.m16898m(this.f41589c.f41594e);
        this.f41589c.m16894c();
    }
}
