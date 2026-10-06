package p000;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hct implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oju f27267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f27269c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f27270d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f27271e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f27272f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f27273g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f27274h;

    public /* synthetic */ hct(kfk kfkVar, mrm mrmVar, htb htbVar, jvb jvbVar, oju ojuVar, gva gvaVar, gjj gjjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f27274h = i;
        this.f27268b = kfkVar;
        this.f27269c = mrmVar;
        this.f27270d = htbVar;
        this.f27271e = jvbVar;
        this.f27267a = ojuVar;
        this.f27272f = gvaVar;
        this.f27273g = gjjVar;
    }

    public /* synthetic */ hct(oju ojuVar, Object obj, ExecutorService executorService, oju ojuVar2, oju ojuVar3, jvb jvbVar, mrm mrmVar, int i) {
        this.f27274h = i;
        this.f27268b = ojuVar;
        this.f27270d = obj;
        this.f27271e = executorService;
        this.f27269c = ojuVar2;
        this.f27267a = ojuVar3;
        this.f27273g = jvbVar;
        this.f27272f = mrmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, oju] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27274h) {
            case 0:
                ?? r0 = this.f27268b;
                Object obj = this.f27269c;
                Object obj2 = this.f27270d;
                Object obj3 = this.f27271e;
                oju ojuVar = this.f27267a;
                Object obj4 = this.f27272f;
                Object obj5 = this.f27273g;
                mrm mrmVar = (mrm) obj;
                kfc kfcVarMo14131r = r0.mo14131r(r0.mo14132s((kgg) mrmVar.mo16809c()), 3);
                htb htbVar = (htb) obj2;
                kfcVarMo14131r.mo9411k(new ctr(htbVar, mrmVar, 5, null));
                jvb jvbVar = (jvb) obj3;
                jvbVar.m13537d(kfcVarMo14131r);
                jvbVar.m13537d(new hcu(htbVar, 0, null));
                htbVar.m10729g(mrm.m16829i(new hcv(ojuVar, r0, (gva) obj4, null)));
                htbVar.m10730h(mrm.m16829i(obj5));
                break;
            default:
                ?? r1 = this.f27268b;
                final Object obj6 = this.f27270d;
                final ?? r4 = this.f27271e;
                final ?? r5 = this.f27269c;
                oju ojuVar2 = this.f27267a;
                Object obj7 = this.f27273g;
                Object obj8 = this.f27272f;
                ((fgy) r1.get()).mo8332g(new fgx() { // from class: gtn
                    @Override // p000.fgx
                    /* JADX INFO: renamed from: f */
                    public final void mo6927f(long j) {
                        Object obj9 = obj6;
                        ExecutorService executorService = r4;
                        oju ojuVar3 = r5;
                        synchronized (obj9) {
                            if (!executorService.isShutdown()) {
                                ((gtk) ojuVar3.get()).m9761c(j);
                            }
                        }
                    }
                }, not.INSTANCE);
                ((dxx) ojuVar2.get()).m6887c((dxy) r5.get(), r4);
                jvb jvbVar2 = (jvb) obj7;
                jvbVar2.m13537d(new gto(ojuVar2, (oju) r5, 0));
                mrm mrmVar2 = (mrm) obj8;
                if (mrmVar2.mo16813g()) {
                    ((dyo) mrmVar2.mo16809c()).mo6924c((dyn) r5.get(), r4);
                    jvbVar2.m13537d(new gto(mrmVar2, (oju) r5, 2));
                }
                jvbVar2.m13537d(new gto(obj6, (ExecutorService) r4, 3));
                break;
        }
    }
}
