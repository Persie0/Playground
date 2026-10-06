package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itv extends itg {

    /* JADX INFO: renamed from: a */
    private float f32161a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32162b;

    public itv(itx itxVar) {
        this.f32162b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public void mo11674a() {
        this.f32162b.m11779A(true);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        lku.m15670x(this.f32162b.f32169E != 0.0f, "max zoom value hasn't been initialized properly");
        this.f32162b.m11789L(4);
        this.f32162b.m11795z();
        if (!this.f32162b.f32212x.mo6184l(dib.f11279am)) {
            this.f32162b.f32200l.m4528c(true);
            this.f32162b.f32200l.m4529d(true);
        }
        this.f32161a = ((Float) this.f32162b.f32198j.mo3831be()).floatValue();
        this.f32162b.f32200l.setAccessibilityLiveRegion(2);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f32162b.f32200l.m4528c(false);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: p */
    public void mo11686p() {
        if (!this.f32162b.f32212x.mo6184l(dib.f11279am)) {
            this.f32162b.f32200l.m4528c(false);
        }
        itx itxVar = this.f32162b;
        if (itxVar.f32171G) {
            itxVar.m11795z();
            this.f32162b.m11784F();
        }
        itx itxVar2 = this.f32162b;
        itxVar2.m11787J(5, this.f32161a, ((Float) itxVar2.f32198j.mo3831be()).floatValue());
        this.f32162b.m11785G();
    }
}
