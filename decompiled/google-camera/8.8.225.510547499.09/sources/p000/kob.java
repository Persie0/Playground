package p000;

import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kob implements koi {

    /* JADX INFO: renamed from: a */
    private long f36672a = 0;

    @Override // p000.koi
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14614a(Object obj) {
        this.f36672a += ((Long) obj).longValue();
    }

    @Override // p000.koi
    /* JADX INFO: renamed from: b */
    public final void mo14615b(kon konVar, Object[] objArr) {
        long j = this.f36672a;
        Object obj = konVar.f36702b;
        obj.getClass();
        kod kodVarM14618a = kod.m14618a(objArr);
        lpe lpeVar = (lpe) obj;
        Object kopVar = (kor) ((TreeMap) lpeVar.f38883b).get(kodVarM14618a);
        if (kopVar == null) {
            kopVar = new kop();
            ((TreeMap) lpeVar.f38883b).put(kodVarM14618a, kopVar);
        }
        ((kop) kopVar).f36706a += j;
    }
}
