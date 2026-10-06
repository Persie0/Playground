package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itu extends itg {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32160b;

    public itu(itx itxVar) {
        this.f32160b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public void mo11674a() {
        this.f32160b.m11779A(true);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: c */
    public void mo11676c() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: d */
    public void mo11677d(float f, int i) {
        itx itxVar = this.f32160b;
        itxVar.m11787J(itx.m11776I(i), ((Float) itxVar.f32198j.mo3831be()).floatValue(), f);
        itx itxVar2 = this.f32160b;
        itxVar2.f32204p.setFloatValues(((Float) itxVar2.f32198j.mo3831be()).floatValue(), f);
        this.f32160b.f32204p.start();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f32160b.m11789L(3);
        this.f32160b.m11786H();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: j */
    public void mo11680j() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: l */
    public final void mo11682l(int i) {
        this.f32160b.m11790M(i);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: m */
    public void mo11683m() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: n */
    public void mo11684n() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: o */
    public void mo11685o(boolean z) {
        this.f32160b.f32168D = z;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: p */
    public final void mo11686p() {
        if (!this.f32160b.f32212x.mo6184l(dib.f11279am)) {
            this.f32160b.f32200l.m4528c(false);
        }
        itx itxVar = this.f32160b;
        if (itxVar.f32171G) {
            itxVar.m11795z();
            this.f32160b.m11784F();
        }
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: q */
    public final void mo11687q() {
        itx itxVar = this.f32160b;
        if (itxVar.f32171G) {
            float fFloatValue = ((Float) itxVar.f32198j.mo3831be()).floatValue();
            itx itxVar2 = this.f32160b;
            float f = itxVar2.f32170F;
            if (fFloatValue < f) {
                itxVar2.f32198j.mo3415bf(Float.valueOf(f));
            }
            this.f32160b.m11795z();
            this.f32160b.m11784F();
        }
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: s */
    public final void mo11689s() {
        this.f32160b.m11782D();
        this.f32160b.f32200l.m4528c(true);
        this.f32160b.f32200l.setAccessibilityLiveRegion(2);
        itx itxVar = this.f32160b;
        itxVar.m11787J(10, itxVar.f32170F, ((Float) itxVar.f32198j.mo3831be()).floatValue());
    }
}
