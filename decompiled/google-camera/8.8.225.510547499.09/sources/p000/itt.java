package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itt extends itg {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32159b;

    public itt(itx itxVar) {
        this.f32159b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public final void mo11674a() {
        this.f32159b.m11779A(false);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: c */
    public void mo11676c() {
        itx itxVar = this.f32159b;
        if (itxVar.f32172H) {
            return;
        }
        itxVar.m11783E();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: d */
    public final void mo11677d(float f, int i) {
        itx itxVar = this.f32159b;
        itxVar.m11787J(itx.m11776I(i), ((Float) itxVar.f32198j.mo3831be()).floatValue(), f);
        if (i != 1) {
            itx itxVar2 = this.f32159b;
            if (itxVar2.f32171G) {
                itxVar2.m11783E();
            }
        }
        itx itxVar3 = this.f32159b;
        itxVar3.f32205q.setFloatValues(((Float) itxVar3.f32198j.mo3831be()).floatValue(), f);
        this.f32159b.f32205q.start();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f32159b.f32201m.setEnabled(false);
        if (this.f32159b.f32212x.mo6184l(dib.f11279am)) {
            this.f32159b.f32208t.setEnabled(false);
        }
        this.f32159b.f32200l.setEnabled(false);
        this.f32159b.m11789L(1);
        this.f32159b.m11786H();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f32159b.f32201m.setEnabled(true);
        if (this.f32159b.f32212x.mo6184l(dib.f11279am)) {
            this.f32159b.f32208t.setEnabled(true);
        }
        this.f32159b.f32200l.setEnabled(true);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: j */
    public void mo11680j() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: k */
    public void mo11681k() {
        this.f32159b.m11783E();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: l */
    public void mo11682l(int i) {
        this.f32159b.m11790M(i);
    }
}
