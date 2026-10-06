package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itw extends itg {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32163b;

    public itw(itx itxVar) {
        this.f32163b = itxVar;
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        lku.m15670x(this.f32163b.f32169E != 0.0f, "max zoom value hasn't been initialized properly");
        if (!this.f32163b.f32212x.mo6184l(dib.f11273ag)) {
            lku.m15670x(this.f32163b.f32170F >= 1.0f, "min zoom value hasn't been initialized properly");
        }
        itx itxVar = this.f32163b;
        if (itxVar.f32171G && !itxVar.f32172H) {
            itxVar.m11782D();
        }
        this.f32163b.m11789L(2);
        this.f32163b.f32200l.setAccessibilityLiveRegion(2);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: m */
    public void mo11683m() {
        itx itxVar = this.f32163b;
        if (itxVar.f32171G) {
            itxVar.m11795z();
            this.f32163b.m11784F();
        }
        this.f32163b.m11785G();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: p */
    public void mo11686p() {
        itx itxVar = this.f32163b;
        if (itxVar.f32171G) {
            itxVar.m11795z();
            this.f32163b.m11784F();
        }
        this.f32163b.m11785G();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: q */
    public void mo11687q() {
        itx itxVar = this.f32163b;
        if (itxVar.f32171G) {
            itxVar.m11795z();
            this.f32163b.m11784F();
        }
        this.f32163b.m11785G();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: t */
    public final void mo11690t(float f) {
        float fM13831s = jzn.m13831s(f, ((Float) this.f32163b.f32198j.mo3831be()).floatValue());
        itx itxVar = this.f32163b;
        float f2 = itxVar.f32169E;
        if (fM13831s > f2) {
            fM13831s = f2;
        } else {
            float f3 = itxVar.f32170F;
            if (fM13831s < f3) {
                fM13831s = f3;
            }
        }
        itxVar.f32198j.mo3415bf(Float.valueOf(fM13831s));
        this.f32163b.m11795z();
    }
}
