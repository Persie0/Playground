package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class huw extends huv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ huy f29620a;

    public huw(huy huyVar) {
        this.f29620a = huyVar;
    }

    @Override // p000.huv
    /* JADX INFO: renamed from: b */
    public void mo10780b() {
    }

    @Override // p000.huv, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29620a.f29622b.mo3415bf(true);
        huy huyVar = this.f29620a;
        huyVar.f29630j = huyVar.f29621a.mo11019r();
        this.f29620a.f29621a.mo11013l(false);
        this.f29620a.f29629i.m10697b(false);
        this.f29620a.f29628h.mo11728I(false);
        this.f29620a.f29623c.startCountdown();
        this.f29620a.f29621a.mo11023v(false);
        this.f29620a.f29624d.mo11201I();
        this.f29620a.f29625e.m10837d(false);
        this.f29620a.f29626f.mo9127m();
        iqh.m11599c();
    }

    @Override // p000.huv, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f29620a.f29622b.mo3415bf(false);
        huy huyVar = this.f29620a;
        huyVar.f29621a.mo11013l(huyVar.f29630j);
        this.f29620a.f29623c.stopCountdown();
        huy huyVar2 = this.f29620a;
        icf icfVar = huyVar2.f29621a;
        icfVar.mo11023v(icfVar.mo11020s((ikw) huyVar2.f29627g.mo3831be()));
        this.f29620a.f29624d.mo11218Z();
        this.f29620a.f29625e.m10837d(true);
        this.f29620a.f29626f.mo9126l();
        this.f29620a.f29628h.mo11728I(true);
        iqh.m11600d();
        if (((Boolean) ((jwf) this.f29620a.f29631k.f3651a).f34942d).booleanValue()) {
            this.f29620a.f29629i.m10700e();
        }
        iuj iujVar = this.f29620a.f29628h;
        if (!((ite) iujVar).f32068S && !iujVar.mo11746aa()) {
            huy huyVar3 = this.f29620a;
            if (!huyVar3.f29628h.mo11745Z((ikw) huyVar3.f29627g.mo3831be())) {
                return;
            }
        }
        this.f29620a.f29628h.mo11765p();
    }
}
