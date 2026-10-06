package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class cqy implements cdj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f9056a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ cra f9057b;

    public cqy(cra craVar, nqf nqfVar) {
        this.f9057b = craVar;
        this.f9056a = nqfVar;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: a */
    public final nps mo3436a() {
        return this.f9056a;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: b */
    public final nps mo3437b() {
        nqf nqfVar = this.f9057b.f9075j;
        nqfVar.getClass();
        return nqfVar;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: c */
    public final nps mo3438c() {
        nqf nqfVar = this.f9057b.f9074i;
        nqfVar.getClass();
        return nqfVar;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: d */
    public final void mo3439d() {
        this.f9057b.f9070e.f9274d.mo3415bf(true);
        this.f9057b.f9071f.mo14124k(bzq.m3269i());
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: e */
    public final void mo3440e() {
        this.f9057b.f9070e.f9274d.mo3415bf(true);
        this.f9057b.f9070e.f9275e.mo3415bf(true);
        ((Executor) this.f9057b.f9068c.mo16809c()).execute(new cqr(this, 5));
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: f */
    public final void mo3441f() {
        this.f9057b.f9070e.f9275e.mo3415bf(true);
        ((Executor) this.f9057b.f9068c.mo16809c()).execute(new cqr(this, 6));
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: g */
    public final void mo3442g() {
        this.f9057b.f9080o.m6626f();
        this.f9057b.m5389j(true, false, true);
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: h */
    public final void mo3443h() {
        cra craVar = this.f9057b;
        craVar.m5390b((hrx) craVar.f9067b.mo16809c());
        this.f9057b.m5391c();
        this.f9057b.f9080o.m6626f();
        this.f9057b.m5389j(true, true, true);
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: i */
    public final void mo3444i() {
        cra craVar = this.f9057b;
        craVar.m5390b((hrx) craVar.f9067b.mo16809c());
        this.f9057b.m5391c();
        this.f9057b.m5389j(true, true, false);
    }
}
