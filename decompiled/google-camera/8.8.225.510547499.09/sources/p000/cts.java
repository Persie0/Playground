package p000;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cts implements kfu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9495b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f9496c;

    public /* synthetic */ cts(ctx ctxVar, kgg kggVar, int i) {
        this.f9496c = i;
        this.f9494a = ctxVar;
        this.f9495b = kggVar;
    }

    public /* synthetic */ cts(czp czpVar, kgg kggVar, int i) {
        this.f9496c = i;
        this.f9494a = czpVar;
        this.f9495b = kggVar;
    }

    public /* synthetic */ cts(gdf gdfVar, kfd kfdVar, int i) {
        this.f9496c = i;
        this.f9494a = gdfVar;
        this.f9495b = kfdVar;
    }

    public /* synthetic */ cts(hdk hdkVar, kgg kggVar, int i) {
        this.f9496c = i;
        this.f9494a = hdkVar;
        this.f9495b = kggVar;
    }

    public /* synthetic */ cts(hdp hdpVar, kgg kggVar, int i) {
        this.f9496c = i;
        this.f9494a = hdpVar;
        this.f9495b = kggVar;
    }

    public /* synthetic */ cts(mrm mrmVar, mrm mrmVar2, int i) {
        this.f9496c = i;
        this.f9494a = mrmVar;
        this.f9495b = mrmVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kgg] */
    @Override // p000.kfu
    /* JADX INFO: renamed from: a */
    public final void mo3915a(key keyVar) {
        switch (this.f9496c) {
            case 0:
                Object obj = this.f9494a;
                ?? r1 = this.f9495b;
                synchronized (((ctx) obj).f9521c) {
                    kpw kpwVarMo7043d = keyVar.mo7043d(r1);
                    if (kpwVarMo7043d != null) {
                        ((hrx) ((ctx) obj).f9524f.mo16809c()).mo10660f(kpwVarMo7043d);
                    }
                    keyVar.close();
                    break;
                }
                return;
            case 1:
                Object obj2 = this.f9494a;
                ?? r2 = this.f9495b;
                synchronized (((ctx) obj2).f9521c) {
                    kpw kpwVarMo7043d2 = keyVar.mo7043d(r2);
                    if (kpwVarMo7043d2 != null) {
                        ((ctx) obj2).f9525g.mo5414c(kpwVarMo7043d2, keyVar.mo7042c());
                    } else {
                        ((nbe) ((nbe) ctx.f9507a.m17252c()).mo17276G(620)).mo17293r("No image available from %s.", keyVar);
                    }
                    keyVar.close();
                    break;
                }
                return;
            case 2:
                Object obj3 = this.f9494a;
                ?? r3 = this.f9495b;
                synchronized (((czp) obj3).f10125b) {
                    ExecutorService executorService = ((czp) obj3).f10126c;
                    if (executorService == null) {
                        return;
                    }
                    executorService.execute(new bmj((czp) obj3, keyVar, (kgg) r3, 10));
                    return;
                }
            case 3:
                Object obj4 = this.f9494a;
                gdf gdfVar = (gdf) obj4;
                gdfVar.f24287c.f24297e.execute(new epm(gdfVar, (kfd) this.f9495b, keyVar, 18));
                return;
            case 4:
                Object obj5 = this.f9494a;
                Object obj6 = this.f9495b;
                kpw kpwVarMo7043d3 = keyVar.mo7043d((kgg) ((mrm) obj5).mo16809c());
                if (kpwVarMo7043d3 != null) {
                    ((hrx) ((mrm) obj6).mo16809c()).mo10660f(kpwVarMo7043d3);
                }
                keyVar.close();
                return;
            case 5:
                Object obj7 = this.f9494a;
                kpw kpwVarMo7043d4 = keyVar.mo7043d(this.f9495b);
                if (kpwVarMo7043d4 != null) {
                    hdk hdkVar = (hdk) obj7;
                    hdkVar.f27326b.m13541c(new gqn(hdkVar, kpwVarMo7043d4, 19));
                }
                keyVar.close();
                return;
            default:
                Object obj8 = this.f9494a;
                kpw kpwVarMo7043d5 = keyVar.mo7043d(this.f9495b);
                if (kpwVarMo7043d5 != null) {
                    hdp hdpVar = (hdp) obj8;
                    hdpVar.f27367c.execute(new gqn(hdpVar, kpwVarMo7043d5, 20));
                }
                keyVar.close();
                return;
        }
    }
}
