package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvy extends mwa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mwb f41697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvy(mwb mwbVar) {
        super(mwbVar);
        this.f41697a = mwbVar;
    }

    @Override // p000.mwa
    /* JADX INFO: renamed from: a */
    public final Object mo17039a(int i) {
        return this.f41697a.f41707b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41697a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM16523ae = mkv.m16523ae(obj);
        int iM17051d = this.f41697a.m17051d(obj, iM16523ae);
        if (iM17051d == -1) {
            return false;
        }
        this.f41697a.m17054i(iM17051d, iM16523ae);
        return true;
    }
}
