package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class gsl extends gsi {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gsm f26222b;

    public gsl(gsm gsmVar) {
        this.f26222b = gsmVar;
    }

    @Override // p000.gsi
    /* JADX INFO: renamed from: b */
    public void mo9700b() {
    }

    @Override // p000.gsi, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f26222b.f26223a.setVisibility(0);
        gsm gsmVar = this.f26222b;
        gsmVar.f26224b = true;
        gsmVar.f26225c.start();
    }

    @Override // p000.gsi, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        gsm gsmVar = this.f26222b;
        gsmVar.f26224b = false;
        gsmVar.f26225c.stop();
        this.f26222b.f26223a.setVisibility(8);
    }
}
