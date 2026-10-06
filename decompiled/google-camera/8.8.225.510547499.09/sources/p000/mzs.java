package p000;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzs extends mws {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mzt f41860a;

    public mzs(mzt mztVar) {
        this.f41860a = mztVar;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lku.m15620O(i, this.f41860a.f41863c);
        mzt mztVar = this.f41860a;
        Object[] objArr = mztVar.f41861a;
        int i2 = mztVar.f41862b;
        int i3 = i + i;
        Object obj = objArr[i3 + i2];
        obj.getClass();
        Object obj2 = objArr[i3 + (i2 ^ 1)];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41860a.f41863c;
    }
}
