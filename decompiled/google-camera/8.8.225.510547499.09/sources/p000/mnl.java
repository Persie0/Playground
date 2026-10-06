package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mnl extends mnh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mnq f41114a;

    public mnl(mnq mnqVar) {
        this.f41114a = mnqVar;
    }

    @Override // p000.mnh
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        synchronized (this.f41114a.f41124d) {
            if (this.f41114a.f41129i.get() > 0 && this.f41114a.f41129i.decrementAndGet() > 0) {
                return;
            }
            mnq mnqVar = this.f41114a;
            if (mnqVar.f41131k != null) {
                mnqVar.f41121a.unbindService(mnqVar.f41130j);
                this.f41114a.f41125e = false;
                mnq mnqVar2 = this.f41114a;
                mnqVar2.f41131k = null;
                mnqVar2.f41130j = null;
            }
            this.f41114a.m16661b();
        }
    }
}
