package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kke implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jvb f36337a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kjo f36338b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f36339c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ List f36340d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ kkf f36341e;

    public kke(kkf kkfVar, jvb jvbVar, kjo kjoVar, List list, List list2) {
        this.f36341e = kkfVar;
        this.f36337a = jvbVar;
        this.f36338b = kjoVar;
        this.f36339c = list;
        this.f36340d = list2;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        this.f36341e.f36343b.mo13948j("Failed to finalize outputs for " + String.valueOf(this.f36338b) + " using " + this.f36339c.toString(), th);
        this.f36338b.m14389h();
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        List list = (List) obj;
        if (this.f36337a.mo8995b()) {
            this.f36341e.f36343b.mo13944f("Refusing to finalize outputs for " + String.valueOf(this.f36338b) + " using " + this.f36339c.toString());
            return;
        }
        if (list != null && !list.isEmpty()) {
            this.f36341e.f36343b.mo13944f("Finalizing outputs for " + String.valueOf(this.f36338b) + " using " + this.f36339c.toString());
            this.f36338b.m14384c(this.f36340d);
            return;
        }
        this.f36341e.f36343b.mo13947i("Failed to finalize outputs for " + String.valueOf(this.f36338b) + " using " + this.f36339c.toString() + ". The list of outputs was null or empty!");
        this.f36338b.m14389h();
    }
}
