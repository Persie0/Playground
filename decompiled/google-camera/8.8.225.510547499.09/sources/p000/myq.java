package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myq extends naz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Iterator f41819a;

    public myq(Iterator it) {
        this.f41819a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41819a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return mkv.m16497E((Map.Entry) this.f41819a.next());
    }
}
