package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxy extends mvk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Iterable f41784a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f41785b;

    public mxy(Iterable iterable, int i) {
        this.f41784a = iterable;
        this.f41785b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.f41784a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.f41785b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        mkv.m16506N(it, this.f41785b);
        return new mxx(it);
    }
}
