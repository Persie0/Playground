package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghx implements cdj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f24829a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f24830b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nqf f24831c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ghy f24832d;

    public ghx(ghy ghyVar, nqf nqfVar, nqf nqfVar2, nqf nqfVar3) {
        this.f24832d = ghyVar;
        this.f24829a = nqfVar;
        this.f24830b = nqfVar2;
        this.f24831c = nqfVar3;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: a */
    public final nps mo3436a() {
        return this.f24831c;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: b */
    public final nps mo3437b() {
        return this.f24829a;
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: c */
    public final nps mo3438c() {
        return this.f24830b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: d */
    public final void mo3439d() {
        this.f24832d.f24850p.f12398d.mo3415bf(true);
        ((Executor) this.f24832d.f24838d.mo16809c()).execute(new ghv(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: e */
    public final void mo3440e() {
        this.f24832d.f24850p.f12398d.mo3415bf(true);
        this.f24832d.f24853s.f3651a.mo3415bf(true);
        ((Executor) this.f24832d.f24838d.mo16809c()).execute(new ghv(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jww] */
    @Override // p000.cdj
    /* JADX INFO: renamed from: f */
    public final void mo3441f() {
        this.f24832d.f24853s.f3651a.mo3415bf(true);
        ((Executor) this.f24832d.f24838d.mo16809c()).execute(new ghv(this, 6));
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: g */
    public final void mo3442g() {
        this.f24832d.f24846l.mo9463g();
        this.f24832d.f24850p.m6626f();
        this.f24832d.m9262h(true, false, true);
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: h */
    public final void mo3443h() {
        ((Executor) this.f24832d.f24838d.mo16809c()).execute(new ghv(this, 4));
        this.f24832d.f24846l.mo9463g();
        this.f24832d.m9264c();
        this.f24832d.f24850p.m6626f();
        this.f24832d.m9262h(true, true, true);
    }

    @Override // p000.cdj
    /* JADX INFO: renamed from: i */
    public final void mo3444i() {
        ((Executor) this.f24832d.f24838d.mo16809c()).execute(new ghv(this, 3));
        this.f24832d.m9264c();
        this.f24832d.m9262h(true, true, false);
    }
}
