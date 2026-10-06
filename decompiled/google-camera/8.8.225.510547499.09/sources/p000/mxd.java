package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mxd extends mws {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mws f41755a;

    public mxd(mws mwsVar) {
        this.f41755a = mwsVar;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.f41755a.get(i)).getValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41755a.size();
    }
}
