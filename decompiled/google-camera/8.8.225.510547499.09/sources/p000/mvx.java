package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvx extends mwa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mwb f41696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvx(mwb mwbVar) {
        super(mwbVar);
        this.f41696a = mwbVar;
    }

    @Override // p000.mwa
    /* JADX INFO: renamed from: a */
    public final Object mo17039a(int i) {
        return this.f41696a.f41706a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41696a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM16523ae = mkv.m16523ae(obj);
        int iM17050c = this.f41696a.m17050c(obj, iM16523ae);
        if (iM17050c == -1) {
            return false;
        }
        this.f41696a.m17053h(iM17050c, iM16523ae);
        return true;
    }
}
