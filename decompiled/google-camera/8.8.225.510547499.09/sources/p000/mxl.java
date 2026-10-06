package p000;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxl extends mws {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mxm f41766a;

    public mxl(mxm mxmVar) {
        this.f41766a = mxmVar;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.f41766a.f41767a.f41773a.f41882d.get(i), this.f41766a.f41767a.f41774b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41766a.f41767a.size();
    }
}
