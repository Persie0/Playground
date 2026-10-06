package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cur implements hnu {

    /* JADX INFO: renamed from: a */
    public final hnw f9666a;

    /* JADX INFO: renamed from: b */
    public final dhv f9667b;

    /* JADX INFO: renamed from: c */
    public final cut f9668c;

    /* JADX INFO: renamed from: d */
    public final cut f9669d;

    /* JADX INFO: renamed from: e */
    public final cut f9670e;

    /* JADX INFO: renamed from: f */
    public final cut f9671f;

    /* JADX INFO: renamed from: g */
    public final cut f9672g;

    /* JADX INFO: renamed from: h */
    public final idl f9673h;

    /* JADX INFO: renamed from: i */
    public cuo f9674i;

    /* JADX INFO: renamed from: j */
    public czd f9675j;

    /* JADX INFO: renamed from: k */
    public mws f9676k;

    /* JADX INFO: renamed from: l */
    public kba f9677l;

    /* JADX INFO: renamed from: m */
    public Runnable f9678m;

    /* JADX INFO: renamed from: n */
    public final cvy f9679n;

    /* JADX INFO: renamed from: o */
    private final hai f9680o;

    public cur(Resources resources, idl idlVar, cvy cvyVar, gfa gfaVar, csx csxVar, hnw hnwVar, final hnx hnxVar, final hnx hnxVar2, hnv hnvVar, jvd jvdVar, hah hahVar, hai haiVar, dhv dhvVar, byte[] bArr) {
        this.f9673h = idlVar;
        this.f9679n = cvyVar;
        this.f9666a = hnwVar;
        this.f9680o = haiVar;
        this.f9667b = dhvVar;
        egi egiVarM5543a = cut.m5543a();
        egiVarM5543a.m7302f(jvdVar);
        egiVarM5543a.f13957a = "VideoRecording";
        egiVarM5543a.m7305i(hnxVar2.f28548b);
        final int i = 0;
        egiVarM5543a.f13960d = new cus(this) { // from class: cup

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cur f9660a;

            {
                this.f9660a = this;
            }

            @Override // p000.cus
            /* JADX INFO: renamed from: a */
            public final hnv mo5535a(csn csnVar) {
                switch (i) {
                    case 0:
                        cur curVar = this.f9660a;
                        hnx hnxVar3 = hnxVar2;
                        return curVar.m5541f(csnVar) ? hnxVar3.f28547a : hnxVar3.f28548b;
                    default:
                        cur curVar2 = this.f9660a;
                        hnx hnxVar4 = hnxVar2;
                        return curVar2.m5541f(csnVar) ? hnxVar4.f28547a : hnxVar4.f28548b;
                }
            }
        };
        final int i2 = 1;
        egiVarM5543a.m7303g(new cuq(this, idlVar, 1));
        egiVarM5543a.m7304h(new cuq(this, idlVar, 0));
        this.f9668c = egiVarM5543a.m7301e();
        egi egiVarM5543a2 = cut.m5543a();
        egiVarM5543a2.m7302f(jvdVar);
        egiVarM5543a2.f13957a = "PoorVideoQualityWarning";
        egiVarM5543a2.m7305i(hnv.HEAT_CRITICAL);
        egiVarM5543a2.m7303g(new cui(idlVar, 6));
        egiVarM5543a2.m7304h(new cui(idlVar, 7));
        this.f9669d = egiVarM5543a2.m7301e();
        egi egiVarM5543a3 = cut.m5543a();
        egiVarM5543a3.m7302f(jvdVar);
        egiVarM5543a3.f13957a = "VideoTorch";
        egiVarM5543a3.m7305i(hnvVar);
        egiVarM5543a3.m7303g(new cgg(this, hahVar, resources, gfaVar, idlVar, 3));
        egiVarM5543a3.m7304h(new cgl(this, idlVar, 19));
        this.f9670e = egiVarM5543a3.m7301e();
        egi egiVarM5543a4 = cut.m5543a();
        egiVarM5543a4.m7302f(jvdVar);
        egiVarM5543a4.f13957a = "VideoRecordingEarlyStoppedWarning";
        egiVarM5543a4.m7305i(hnv.HEAT_SEVERE);
        egiVarM5543a4.m7303g(new cgl(this, idlVar, 20));
        egiVarM5543a4.m7304h(new cui(idlVar, 3));
        this.f9671f = egiVarM5543a4.m7301e();
        egi egiVarM5543a5 = cut.m5543a();
        egiVarM5543a5.m7302f(jvdVar);
        egiVarM5543a5.f13957a = "VideoDisplay";
        egiVarM5543a5.m7305i(hnxVar.f28548b);
        egiVarM5543a5.f13960d = new cus(this) { // from class: cup

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ cur f9660a;

            {
                this.f9660a = this;
            }

            @Override // p000.cus
            /* JADX INFO: renamed from: a */
            public final hnv mo5535a(csn csnVar) {
                switch (i2) {
                    case 0:
                        cur curVar = this.f9660a;
                        hnx hnxVar3 = hnxVar;
                        return curVar.m5541f(csnVar) ? hnxVar3.f28547a : hnxVar3.f28548b;
                    default:
                        cur curVar2 = this.f9660a;
                        hnx hnxVar4 = hnxVar;
                        return curVar2.m5541f(csnVar) ? hnxVar4.f28547a : hnxVar4.f28548b;
                }
            }
        };
        egiVarM5543a5.m7303g(new cui(csxVar, 4));
        egiVarM5543a5.m7304h(new cui(csxVar, 5));
        this.f9672g = egiVarM5543a5.m7301e();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized hnv m5536a() {
        return this.f9666a.mo10518e();
    }

    /* JADX INFO: renamed from: b */
    public final void m5537b(boolean z) {
        this.f9680o.mo10033e(gzy.f27066y, Boolean.valueOf(z));
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final synchronized void mo5538by(hnv hnvVar) {
        mws mwsVar = this.f9676k;
        int size = mwsVar.size();
        for (int i = 0; i < size; i++) {
            ((hnu) mwsVar.get(i)).mo5538by(hnvVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5539d() {
        kba kbaVar = this.f9677l;
        if (kbaVar != null) {
            kbaVar.close();
            this.f9677l = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5540e() {
        return this.f9675j.mo5734l();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5541f(csn csnVar) {
        if (this.f9667b.mo6184l(dhh.f11056I) && csnVar.f9339d.m13663d() && csnVar.f9338c == jxn.FPS_60) {
            return true;
        }
        return (this.f9667b.mo6184l(dhh.f11082ah) && csnVar.f9339d.m13662c() && csnVar.f9338c == jxn.FPS_60) || csnVar.f9333E;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5542g(csn csnVar) {
        return this.f9667b.mo6184l(dhh.f11088an) && csnVar.f9339d.m13663d() && csnVar.f9338c == jxn.FPS_60;
    }
}
