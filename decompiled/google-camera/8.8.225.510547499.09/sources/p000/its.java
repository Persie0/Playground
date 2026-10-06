package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class its extends itg {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32158b;

    public its(itx itxVar) {
        this.f32158b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public void mo11674a() {
        this.f32158b.m11779A(true);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        float fFloatValue;
        lku.m15670x(this.f32158b.f32169E != 0.0f, "max zoom value hasn't been initialized properly");
        lku.m15670x(this.f32158b.f32170F != 0.0f, "min zoom value hasn't been initialized properly");
        itx itxVar = this.f32158b;
        if (itxVar.f32171G && !itxVar.f32172H) {
            itxVar.m11782D();
        }
        float f = ((ikw) this.f32158b.f32211w.mo3831be()).equals(ikw.PORTRAIT) ? this.f32158b.f32170F : this.f32158b.f32206r;
        if (!this.f32158b.f32174J.mo16813g()) {
            fFloatValue = 7.5f;
        } else if (((Float) this.f32158b.f32174J.mo16809c()).floatValue() > 0.0f) {
            fFloatValue = ((Float) this.f32158b.f32174J.mo16809c()).floatValue();
        } else {
            fFloatValue = ((ikw) this.f32158b.f32211w.mo3831be()).equals(ikw.PORTRAIT) ? ((Float) this.f32158b.f32212x.mo6180h(dio.f11665g).get()).floatValue() : f + f;
        }
        if (this.f32158b.f32197i.mo5895d().equals(kmq.f36557a)) {
            float fFloatValue2 = ((Float) this.f32158b.f32198j.mo3831be()).floatValue();
            itx itxVar2 = this.f32158b;
            float f2 = itxVar2.f32175K;
            if (fFloatValue2 != f2) {
                fFloatValue = f2;
            } else if (itxVar2.f32174J.mo16813g()) {
                float fFloatValue3 = ((Float) this.f32158b.f32174J.mo16809c()).floatValue();
                itx itxVar3 = this.f32158b;
                if (fFloatValue3 <= itxVar3.f32175K * 1.2f) {
                    float fFloatValue4 = ((Float) itxVar3.f32174J.mo16809c()).floatValue();
                    itx itxVar4 = this.f32158b;
                    fFloatValue = ((fFloatValue4 >= itxVar4.f32175K * 1.2f || ((Float) itxVar4.f32174J.mo16809c()).floatValue() <= this.f32158b.f32175K) && ((Float) this.f32158b.f32174J.mo16809c()).floatValue() != 0.0f) ? this.f32158b.f32170F : fFloatValue * this.f32158b.f32175K;
                }
            } else {
                fFloatValue = this.f32158b.f32170F;
            }
        } else {
            float fFloatValue5 = ((Float) this.f32158b.f32198j.mo3831be()).floatValue();
            itx itxVar5 = this.f32158b;
            float f3 = itxVar5.f32175K;
            if (fFloatValue5 != f3) {
                fFloatValue = f3;
            } else {
                fFloatValue = itxVar5.f32174J.mo16813g() ? fFloatValue * this.f32158b.f32175K : this.f32158b.f32170F;
            }
        }
        if (this.f32158b.f32210v.mo16813g()) {
            ((hfd) this.f32158b.f32210v.mo16809c()).mo10174k(fFloatValue);
            ((hfd) this.f32158b.f32210v.mo16809c()).mo10173j(this.f32158b.f32175K);
        }
        itx itxVar6 = this.f32158b;
        float f4 = itxVar6.f32169E;
        if (fFloatValue > f4) {
            fFloatValue = f4;
        } else if (fFloatValue < itxVar6.f32170F) {
            fFloatValue = 2.0f;
        }
        if (fFloatValue == itxVar6.f32175K) {
            itxVar6.m11787J(3, ((Float) itxVar6.f32198j.mo3831be()).floatValue(), fFloatValue);
            this.f32158b.f32199k.mo8157ab(3, fFloatValue);
        } else {
            itxVar6.m11787J(2, ((Float) itxVar6.f32198j.mo3831be()).floatValue(), fFloatValue);
            this.f32158b.f32199k.mo8157ab(2, fFloatValue);
        }
        itx itxVar7 = this.f32158b;
        itxVar7.f32202n.setFloatValues(((Float) itxVar7.f32198j.mo3831be()).floatValue(), fFloatValue);
        this.f32158b.f32202n.start();
        this.f32158b.m11789L(6);
        this.f32158b.f32200l.setAccessibilityLiveRegion(2);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f32158b.f32202n.cancel();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: i */
    public void mo11679i() {
        this.f32158b.m11785G();
    }
}
