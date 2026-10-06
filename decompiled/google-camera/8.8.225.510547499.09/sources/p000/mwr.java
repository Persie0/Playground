package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwr extends mws {

    /* JADX INFO: renamed from: a */
    final transient int f41735a;

    /* JADX INFO: renamed from: b */
    final transient int f41736b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mws f41737c;

    public mwr(mws mwsVar, int i, int i2) {
        this.f41737c = mwsVar;
        this.f41735a = i;
        this.f41736b = i2;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: A */
    public final Object[] mo17074A() {
        return this.f41737c.mo17074A();
    }

    @Override // p000.mws
    /* JADX INFO: renamed from: b */
    public final mws subList(int i, int i2) {
        lku.m15612G(i, i2, this.f41736b);
        mws mwsVar = this.f41737c;
        int i3 = this.f41735a;
        return mwsVar.subList(i + i3, i2 + i3);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lku.m15620O(i, this.f41736b);
        return this.f41737c.get(i + this.f41735a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41736b;
    }

    @Override // p000.mws, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: y */
    public final int mo17076y() {
        return this.f41737c.mo17077z() + this.f41735a + this.f41736b;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: z */
    public final int mo17077z() {
        return this.f41737c.mo17077z() + this.f41735a;
    }
}
