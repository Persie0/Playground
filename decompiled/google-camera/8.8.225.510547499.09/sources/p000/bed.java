package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bed implements Runnable {

    /* JADX INFO: renamed from: a */
    private final azp f3028a;

    /* JADX INFO: renamed from: b */
    private final boolean f3029b;

    /* JADX INFO: renamed from: c */
    private final bkn f3030c;

    static {
        ayc.m2100b("StopWorkRunnable");
    }

    public bed(azp azpVar, bkn bknVar, boolean z, byte[] bArr) {
        this.f3028a = azpVar;
        this.f3030c = bknVar;
        this.f3029b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azs azsVar;
        if (this.f3029b) {
            azb azbVar = this.f3028a.f2784f;
            String str = ((bcj) this.f3030c.f3651a).f2946a;
            synchronized (azbVar.f2752f) {
                ayc.m2099a();
                azsVar = (azs) azbVar.f2748b.remove(str);
                if (azsVar != null) {
                    azbVar.f2750d.remove(str);
                }
            }
            azb.m2110f(azsVar);
        } else {
            azb azbVar2 = this.f3028a.f2784f;
            bkn bknVar = this.f3030c;
            String str2 = ((bcj) bknVar.f3651a).f2946a;
            synchronized (azbVar2.f2752f) {
                azs azsVar2 = (azs) azbVar2.f2749c.remove(str2);
                if (azsVar2 == null) {
                    ayc.m2099a();
                } else {
                    Set set = (Set) azbVar2.f2750d.get(str2);
                    if (set != null && set.contains(bknVar)) {
                        ayc.m2099a();
                        azbVar2.f2750d.remove(str2);
                        azb.m2110f(azsVar2);
                    }
                }
            }
        }
        ayc.m2099a();
        Object obj = this.f3030c.f3651a;
    }
}
