package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvw extends mwa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mwb f41695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvw(mwb mwbVar) {
        super(mwbVar);
        this.f41695a = mwbVar;
    }

    @Override // p000.mwa
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17039a(int i) {
        return new mvv(this.f41695a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM17049b = this.f41695a.m17049b(key);
            if (iM17049b != -1 && mpw.m16768g(value, this.f41695a.f41707b[iM17049b])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iM16523ae = mkv.m16523ae(key);
        int iM17050c = this.f41695a.m17050c(key, iM16523ae);
        if (iM17050c == -1 || !mpw.m16768g(value, this.f41695a.f41707b[iM17050c])) {
            return false;
        }
        this.f41695a.m17053h(iM17050c, iM16523ae);
        return true;
    }
}
