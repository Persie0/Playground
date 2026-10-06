package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itr extends itg {

    /* JADX INFO: renamed from: a */
    private float f32156a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32157b;

    public itr(itx itxVar) {
        this.f32157b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public void mo11674a() {
        this.f32157b.m11779A(true);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: ci */
    public void mo11678ci() {
        this.f32157b.m11785G();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        lku.m15670x(this.f32157b.f32169E != 0.0f, "max zoom value hasn't been initialized properly");
        this.f32156a = ((Float) this.f32157b.f32198j.mo3831be()).floatValue();
        itx itxVar = this.f32157b;
        float f = itxVar.f32168D ? itxVar.f32169E : itxVar.f32170F;
        itxVar.f32203o.setFloatValues(((Float) itxVar.f32198j.mo3831be()).floatValue(), f);
        float fAbs = Math.abs(f - ((Float) this.f32157b.f32198j.mo3831be()).floatValue());
        itx itxVar2 = this.f32157b;
        itxVar2.f32203o.setDuration((int) ((fAbs / (itxVar2.f32169E - itxVar2.f32170F)) * 2000.0f));
        this.f32157b.f32203o.start();
        this.f32157b.m11789L(5);
        this.f32157b.f32200l.setAccessibilityLiveRegion(2);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        itx itxVar = this.f32157b;
        itxVar.m11787J(7, this.f32156a, ((Float) itxVar.f32198j.mo3831be()).floatValue());
        this.f32157b.f32203o.cancel();
    }
}
