package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxb implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f26705a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f26706b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f26707c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f26708d;

    public gxb(eqh eqhVar, kcc kccVar, ept eptVar, int i) {
        this.f26708d = i;
        this.f26705a = eqhVar;
        this.f26706b = kccVar;
        this.f26707c = eptVar;
    }

    public gxb(gyh gyhVar, gyi gyiVar, cjc cjcVar, int i) {
        this.f26708d = i;
        this.f26705a = gyhVar;
        this.f26706b = gyiVar;
        this.f26707c = cjcVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kcc] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f26708d) {
            case 0:
                ((nbe) ((nbe) ((nbe) gxc.f26709a.m17251b()).mo17283h(th)).mo17276G(3330)).mo17293r("Failed to get MediaStoreRecord for %s, skipping.", this.f26705a);
                Object obj = this.f26707c;
                obj.getClass();
                ((cjc) obj).m3819a();
                break;
            default:
                this.f26706b.mo13952a();
                eqh.m7684m((ept) this.f26707c, pIeXJQLZLfgIN.leEjKhAh, th);
                if (th instanceof dop) {
                    ((ept) this.f26707c).m7646e();
                }
                ((eqh) this.f26705a).m7685k(((ept) this.f26707c).f15040b, mqu.f41450a);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [gyh, java.lang.Object] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        switch (this.f26708d) {
            case 0:
                gyp gypVar = (gyp) obj;
                if (gypVar != null) {
                    ?? r0 = this.f26706b;
                    gyu gyuVarMo9902h = this.f26705a.mo9902h();
                    gyuVarMo9902h.getClass();
                    r0.mo3964q(gyuVarMo9902h, gypVar, this.f26705a.mo9904j());
                    this.f26705a.mo9902h().getClass();
                    this.f26705a.mo9651a();
                    Object obj2 = this.f26707c;
                    obj2.getClass();
                    ((cjc) obj2).m3819a();
                } else {
                    ((nbe) ((nbe) gxc.f26709a.m17251b()).mo17276G(3331)).mo17293r("Failed to get MediaStoreRecord for %s, skipping.", this.f26705a);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                this.f26706b.mo13952a();
                if (bool == null || !bool.booleanValue()) {
                    eqh.m7684m((ept) this.f26707c, "Error processing primary shot", new IllegalStateException("Processing success state was not valid."));
                }
                ((eqh) this.f26705a).m7685k(((ept) this.f26707c).f15040b, mqu.f41450a);
                break;
        }
    }
}
