package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class msp implements Iterator {

    /* JADX INFO: renamed from: a */
    Map.Entry f41553a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Iterator f41554b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ msv f41555c;

    public msp(msv msvVar, Iterator it) {
        this.f41555c = msvVar;
        this.f41554b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41554b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f41553a = (Map.Entry) this.f41554b.next();
        return new msq(this.f41555c, this.f41553a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f41553a;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Object value = entry.getValue();
        this.f41554b.remove();
        this.f41555c.m16880h(value);
        this.f41553a = null;
    }
}
