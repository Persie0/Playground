package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxc extends naz {

    /* JADX INFO: renamed from: a */
    final naz f41753a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mxf f41754b;

    public mxc(mxf mxfVar) {
        this.f41754b = mxfVar;
        this.f41753a = mxfVar.f41757a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41753a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f41753a.next()).getValue();
    }
}
