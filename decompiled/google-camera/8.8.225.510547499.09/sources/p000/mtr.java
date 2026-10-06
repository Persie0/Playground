package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtr extends mzc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mts f41605a;

    public mtr(mts mtsVar) {
        this.f41605a = mtsVar;
    }

    @Override // p000.mzc
    /* JADX INFO: renamed from: a */
    public final myy mo16917a() {
        return this.f41605a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f41605a.mo16910c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41605a.mo16909b();
    }
}
