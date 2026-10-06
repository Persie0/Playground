package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjw extends mzh {

    /* JADX INFO: renamed from: a */
    private final mwx f36314a;

    public kjw(List list) {
        mwt mwtVarM17116j = mwx.m17116j(((mzr) list).f41859c);
        nba it = ((mws) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            mwtVarM17116j.mo17110e(it.next(), Integer.valueOf(i));
            i++;
        }
        this.f36314a = mwtVarM17116j.mo17059b();
    }

    /* JADX INFO: renamed from: h */
    private final int m14399h(Object obj) {
        Integer num = (Integer) this.f36314a.get(obj);
        return num == null ? ((mzw) this.f36314a).f41872c : num.intValue();
    }

    @Override // p000.mzh, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return m14399h(obj) - m14399h(obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof kjw) {
            return this.f36314a.equals(((kjw) obj).f36314a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36314a.hashCode();
    }
}
