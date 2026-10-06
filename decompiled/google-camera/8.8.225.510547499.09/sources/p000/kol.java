package p000;

import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kol implements koh {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f36698a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public volatile koh f36699b = null;

    /* JADX INFO: renamed from: d */
    private final ktz m14622d(String str, koc[] kocVarArr, ktz ktzVar) {
        ktz ktzVar2 = (ktz) this.f36698a.putIfAbsent(str, ktzVar);
        if (ktzVar2 == null) {
            return ktzVar;
        }
        kot.m14638c(str, (koc[]) ktzVar2.f37200c, kocVarArr);
        return ktzVar2;
    }

    @Override // p000.koh
    /* JADX INFO: renamed from: a */
    public final void mo14619a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final ktz m14623b(String str, koc... kocVarArr) {
        ktz ktzVar = (ktz) this.f36698a.get(str);
        if (ktzVar == null) {
            return m14622d(str, kocVarArr, new ktz(str, kocVarArr, this, koa.m14613c(kocVarArr, kof.f36681b)));
        }
        kot.m14638c(str, (koc[]) ktzVar.f37200c, kocVarArr);
        return ktzVar;
    }

    /* JADX INFO: renamed from: c */
    public final ktz m14624c(String str, koc... kocVarArr) {
        ktz ktzVar = (ktz) this.f36698a.get(str);
        if (ktzVar == null) {
            return m14622d(str, kocVarArr, new ktz(str, kocVarArr, this, koa.m14613c(kocVarArr, kof.f36680a)));
        }
        kot.m14638c(str, (koc[]) ktzVar.f37200c, kocVarArr);
        return ktzVar;
    }
}
