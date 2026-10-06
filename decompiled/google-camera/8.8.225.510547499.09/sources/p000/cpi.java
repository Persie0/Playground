package p000;

import android.content.Intent;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpi implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kcc f8572a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nps f8573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cpj f8574c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f8575d;

    public cpi(cpj cpjVar, int i, kcc kccVar, nps npsVar) {
        this.f8574c = cpjVar;
        this.f8575d = i;
        this.f8572a = kccVar;
        this.f8573b = npsVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        synchronized (this.f8574c.f8608t) {
            this.f8574c.f8602n = null;
            if (!this.f8573b.isCancelled()) {
                ((nbe) ((nbe) ((nbe) cpj.f8576a.m17251b()).mo17283h(th)).mo17276G(395)).mo17290o("Failed to create capture session.");
                this.f8574c.f8603o.m5463a(csj.ERROR);
                dbn dbnVar = this.f8574c.f8606r;
                dbnVar.getClass();
                dbnVar.f10400h = 3;
            }
            if (th instanceof dof) {
                dof dofVar = (dof) th;
                long j = dofVar.f12155c;
                long jM5669q = this.f8574c.f8613y.m5669q();
                if (!kcl.m13982e(dofVar.f12153a) || j >= jM5669q || !this.f8574c.f8613y.m5672t() || this.f8574c.f8611w.m8908a() == ikw.SLOW_MOTION || this.f8574c.f8611w.m8908a() == ikw.AMBER) {
                    this.f8574c.f8596h.mo6458f(dofVar);
                } else {
                    cpj cpjVar = this.f8574c;
                    cpjVar.f8597i.mo5948h(cpjVar.f8591c.mo5895d());
                    this.f8574c.f8590b.execute(new cmd(this, 10));
                }
            }
            this.f8572a.mo13952a();
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        cpw cpwVar = (cpw) obj;
        synchronized (this.f8574c.f8608t) {
            int i = cpwVar.f8704t;
            cpj cpjVar = this.f8574c;
            if (i != cpjVar.f8607s) {
                ((nbe) ((nbe) cpj.f8576a.m17252c()).mo17276G(398)).mo17294s("Capture session %d doesn't match expected session %d", cpwVar.f8704t, this.f8574c.f8607s);
                return;
            }
            if (((jwf) cpjVar.f8603o.f9277g).f34942d != csj.INITIATING) {
                ((nbe) ((nbe) cpj.f8576a.m17252c()).mo17276G(397)).mo17301z("Expecting %s but got %s", csj.INITIATING, ((jwf) this.f8574c.f8603o.f9277g).f34942d);
                return;
            }
            if (this.f8575d == 7) {
                cpj cpjVar2 = this.f8574c;
                cpjVar2.f8610v.m6066a(cpjVar2.f8591c.mo5895d() == kmq.BACK ? kmq.f36557a : kmq.BACK, 2, 3);
            }
            cpj cpjVar3 = this.f8574c;
            cpjVar3.f8602n = cpwVar;
            cpw cpwVar2 = cpjVar3.f8602n;
            if (cpwVar2 != null) {
                cpwVar2.f8690f.addAll(cpjVar3.f8592d);
            }
            cpj cpjVar4 = this.f8574c;
            cpjVar4.f8602n.f8675A = cpjVar4.f8609u;
            Collection$EL.stream(cpjVar4.f8592d).forEach(cpf.f8551c);
            this.f8574c.f8603o.m5463a(csj.f9247c);
            this.f8574c.f8595g.m10437h(hld.CAPTURE_SESSION_STARTED);
            cpj cpjVar5 = this.f8574c;
            dbn dbnVar = cpjVar5.f8606r;
            dbnVar.getClass();
            dbnVar.f10400h = 2;
            dbnVar.m5882c(cpjVar5.f8595g.m10441c(hld.f28244a, hld.CAPTURE_SESSION_STARTED));
            cpj cpjVar6 = this.f8574c;
            cpjVar6.f8604p = cds.m3519r(cpjVar6.f8612x);
            cpj cpjVar7 = this.f8574c;
            if ((cpjVar7.f8605q || cpjVar7.f8604p) && !((Boolean) ((jwf) cpjVar7.f8603o.f9279i).f34942d).booleanValue()) {
                Intent intentM2611e = this.f8574c.f8612x.m2611e();
                if (intentM2611e != null) {
                    cds.m3507f(intentM2611e);
                }
                this.f8574c.f8590b.execute(new cmd(this, 9));
            }
            this.f8572a.mo13952a();
        }
    }
}
