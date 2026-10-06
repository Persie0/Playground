package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyv implements mrf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f23942a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fyw f23943b;

    public fyv(fyw fywVar, List list) {
        this.f23943b = fywVar;
        this.f23942a = list;
    }

    @Override // p000.mrf
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        lku.m15620O(num.intValue(), this.f23942a.size());
        this.f23943b.f23944a.m19488p(((Long) this.f23942a.get(num.intValue())).longValue());
        return num;
    }
}
