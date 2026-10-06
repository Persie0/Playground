package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class euo implements hxa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ chw f20129a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20130b;

    public euo(euf eufVar, int i) {
        this.f20130b = i;
        this.f20129a = eufVar;
    }

    public euo(eus eusVar, int i) {
        this.f20130b = i;
        this.f20129a = eusVar;
    }

    public euo(eva evaVar, int i) {
        this.f20130b = i;
        this.f20129a = evaVar;
    }

    public euo(ewa ewaVar, int i) {
        this.f20130b = i;
        this.f20129a = ewaVar;
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: bK */
    public final void mo7906bK(int i) {
        int i2 = this.f20130b;
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: b */
    public final void mo7905b() {
        switch (this.f20130b) {
            case 2:
                if (((eva) this.f20129a).f20322p.mo16813g()) {
                    ((era) ((eva) this.f20129a).f20322p.mo16809c()).mo7654a(false);
                    ((era) ((eva) this.f20129a).f20322p.mo16809c()).mo7657d();
                }
                ((eva) this.f20129a).f20290K.m10874a();
                break;
        }
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: a */
    public final void mo7904a() {
        switch (this.f20130b) {
            case 0:
                dpx dpxVar = ((eus) this.f20129a).f20203u;
                if (dpxVar != null) {
                    dpxVar.m6561c();
                }
                iuj iujVar = ((eus) this.f20129a).f20193k;
                iujVar.getClass();
                iujVar.mo11730K(false);
                break;
            case 1:
                dpx dpxVar2 = ((euf) this.f20129a).f19918E;
                if (dpxVar2 != null) {
                    dpxVar2.m6561c();
                }
                break;
            case 2:
                chw chwVar = this.f20129a;
                if (!chwVar.f5764a) {
                    ((nbe) ((nbe) eva.f20279b.m17252c()).mo17276G((char) 1964)).mo17290o("Skipping re-showing UI since mode is stopped.");
                } else {
                    if (((eva) chwVar).f20322p.mo16813g()) {
                        ((era) ((eva) this.f20129a).f20322p.mo16809c()).mo7654a(true);
                        ((era) ((eva) this.f20129a).f20322p.mo16809c()).mo7658e();
                    }
                    ((eva) this.f20129a).f20290K.m10875b();
                }
                break;
            default:
                dpx dpxVar3 = ((ewa) this.f20129a).f20559q;
                if (dpxVar3 != null) {
                    dpxVar3.m6561c();
                }
                break;
        }
    }
}
