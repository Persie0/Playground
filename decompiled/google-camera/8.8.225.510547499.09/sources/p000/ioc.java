package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ioc extends iob {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ioe f31628a;

    public ioc(ioe ioeVar) {
        this.f31628a = ioeVar;
    }

    @Override // p000.iob
    /* JADX INFO: renamed from: a */
    public void mo11559a() {
    }

    @Override // p000.iob
    /* JADX INFO: renamed from: c */
    public void mo11561c() {
    }

    @Override // p000.iob, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        ipb ipbVar = (ipb) this.f31628a.f31630a.get();
        ipbVar.f31685n = false;
        ipbVar.f31683l.animate().alpha(0.0f).setDuration(ipbVar.f31676e).withEndAction(new idd(ipbVar, 17)).start();
        ipbVar.f31678g.animate().alpha(0.0f).setDuration(ipbVar.f31676e).withEndAction(new idd(ipbVar, 18)).start();
        ipbVar.f31679h.animate().alpha(0.0f).setDuration(ipbVar.f31676e).withEndAction(new idd(ipbVar, 19)).start();
    }
}
