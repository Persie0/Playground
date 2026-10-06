package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cqd implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jyx f8815a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f8816b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ cqg f8817c;

    public cqd(cqg cqgVar, jyx jyxVar, nqf nqfVar) {
        this.f8817c = cqgVar;
        this.f8815a = jyxVar;
        this.f8816b = nqfVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        this.f8817c.m5354j(cqf.STOPPED);
        this.f8816b.mo8566a(th);
        this.f8817c.f8833H.mo13952a();
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        synchronized (this.f8817c.f8854f) {
            this.f8817c.f8868t.m10437h(hlh.VIDEO_RECORDER_STARTED);
            if (this.f8817c.f8830E == cqf.STOPPED) {
                this.f8815a.mo13750i();
                return;
            }
            this.f8817c.f8861m.m5463a(csj.RECORDING_SESSION_ACTIVE);
            cqg cqgVar = this.f8817c;
            cqgVar.f8855g.m5529b(cqgVar.m5346b().f9424b);
            cqg cqgVar2 = this.f8817c;
            cqgVar2.f8855g.f9644e = mrm.m16829i(cqgVar2.f8860l.f9338c);
            this.f8817c.f8855g.m5532e();
            cqg cqgVar3 = this.f8817c;
            if (cqgVar3.f8856h.mo5406l()) {
                kxk.m14975U(cqgVar3.f8864p.mo5693b(cqgVar3.f8860l.f9359x, cqgVar3.f8859k.mo9216f()), new cmo(cqgVar3, 6), not.INSTANCE);
            }
            mrm mrmVar = this.f8817c.f8867s;
            if (mrmVar.mo16813g()) {
                ((ckr) mrmVar.mo16809c()).mo3845b();
            }
            cqg cqgVar4 = this.f8817c;
            if (cqgVar4.f8860l.f9330B) {
                cqgVar4.f8870v.m5745c(true);
                this.f8817c.f8834I.m6416d();
            }
            this.f8817c.m5354j(cqf.RECORDING);
            this.f8816b.mo14894e(null);
        }
    }
}
