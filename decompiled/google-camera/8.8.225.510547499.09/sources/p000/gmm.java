package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gmm implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f25602a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gmn f25603b;

    /* JADX INFO: renamed from: c */
    private String f25604c;

    public gmm(gmn gmnVar, Map map) {
        this.f25603b = gmnVar;
        this.f25602a = map;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        kho khoVar;
        String str = (String) obj;
        if (str.equals(this.f25604c) || (khoVar = (kho) this.f25602a.get(str)) == null) {
            return;
        }
        synchronized (this.f25603b) {
            this.f25604c = str;
            this.f25603b.f25605a = khoVar;
        }
    }
}
