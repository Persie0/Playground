package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ctr implements kfb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9492b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f9493c;

    public /* synthetic */ ctr(ctx ctxVar, kgg kggVar, int i) {
        this.f9493c = i;
        this.f9491a = ctxVar;
        this.f9492b = kggVar;
    }

    public /* synthetic */ ctr(czp czpVar, kgg kggVar, int i) {
        this.f9493c = i;
        this.f9491a = czpVar;
        this.f9492b = kggVar;
    }

    public /* synthetic */ ctr(eim eimVar, kbg kbgVar, int i) {
        this.f9493c = i;
        this.f9491a = eimVar;
        this.f9492b = kbgVar;
    }

    public /* synthetic */ ctr(htb htbVar, mrm mrmVar, int i, byte[] bArr) {
        this.f9493c = i;
        this.f9491a = htbVar;
        this.f9492b = mrmVar;
    }

    public /* synthetic */ ctr(mrm mrmVar, mrm mrmVar2, int i) {
        this.f9493c = i;
        this.f9491a = mrmVar;
        this.f9492b = mrmVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kbg] */
    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        switch (this.f9493c) {
            case 0:
                kfv.m14174w(kiqVar, new cts((ctx) this.f9491a, (kgg) this.f9492b, 1));
                break;
            case 1:
                kfv.m14174w(kiqVar, new cts((ctx) this.f9491a, (kgg) this.f9492b, 0));
                break;
            case 2:
                kfv.m14174w(kiqVar, new cts((czp) this.f9491a, (kgg) this.f9492b, 2));
                break;
            case 3:
                Object obj = this.f9491a;
                ?? r1 = this.f9492b;
                key keyVarM14357a = kiqVar.m14357a();
                if (keyVarM14357a != null) {
                    keyVarM14357a.mo7050k(new eik((eim) obj, keyVarM14357a, r1));
                    break;
                }
                break;
            case 4:
                kfv.m14174w(kiqVar, new cts((mrm) this.f9491a, (mrm) this.f9492b, 4));
                break;
            default:
                ((htb) this.f9491a).m10731i(kiqVar, (kgg) ((mrm) this.f9492b).mo16809c());
                break;
        }
    }
}
