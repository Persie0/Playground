package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e77 extends k8b {
    @Override // p000.k8b
    /* JADX INFO: renamed from: b */
    public final l8b mo10910b() {
        if (this.f46871a && this.f46873c.f55781j.f755d) {
            C3386nv.m17626m("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        p8b p8bVar = this.f46873c;
        if (!p8bVar.f55788q) {
            return new f77(this.f46872b, p8bVar, this.f46874d);
        }
        C3386nv.m17626m("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // p000.k8b
    /* JADX INFO: renamed from: c */
    public final k8b mo10911c() {
        return this;
    }
}
