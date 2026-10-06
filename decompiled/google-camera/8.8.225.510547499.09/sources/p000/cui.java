package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cui implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9637a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f9638b;

    public /* synthetic */ cui(csx csxVar, int i) {
        this.f9638b = i;
        this.f9637a = csxVar;
    }

    public /* synthetic */ cui(cuj cujVar, int i) {
        this.f9638b = i;
        this.f9637a = cujVar;
    }

    public /* synthetic */ cui(cuk cukVar, int i) {
        this.f9638b = i;
        this.f9637a = cukVar;
    }

    public /* synthetic */ cui(cur curVar, int i) {
        this.f9638b = i;
        this.f9637a = curVar;
    }

    public /* synthetic */ cui(cwz cwzVar, int i) {
        this.f9638b = i;
        this.f9637a = cwzVar;
    }

    public /* synthetic */ cui(czs czsVar, int i) {
        this.f9638b = i;
        this.f9637a = czsVar;
    }

    public /* synthetic */ cui(czt cztVar, int i) {
        this.f9638b = i;
        this.f9637a = cztVar;
    }

    public /* synthetic */ cui(czv czvVar, int i) {
        this.f9638b = i;
        this.f9637a = czvVar;
    }

    public /* synthetic */ cui(czw czwVar, int i) {
        this.f9638b = i;
        this.f9637a = czwVar;
    }

    public /* synthetic */ cui(czy czyVar, int i) {
        this.f9638b = i;
        this.f9637a = czyVar;
    }

    public /* synthetic */ cui(dfn dfnVar, int i, byte[] bArr) {
        this.f9638b = i;
        this.f9637a = dfnVar;
    }

    public /* synthetic */ cui(idl idlVar, int i) {
        this.f9638b = i;
        this.f9637a = idlVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [csx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [csx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, jww] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f9638b) {
            case 0:
                cuj cujVar = (cuj) this.f9637a;
                long jM16857a = cujVar.f9639a.f9643d.m16857a(TimeUnit.MILLISECONDS) + 10;
                cujVar.f9639a.f9640a.mo10855h(jM16857a);
                cujVar.f9639a.f9641b.mo11610l("/video_state_recording", jM16857a);
                if (cujVar.f9639a.f9644e.mo16813g()) {
                    int iM13655a = ((jxn) cujVar.f9639a.f9644e.mo16809c()).m13655a();
                    long j = ((long) iM13655a) * jM16857a;
                    cujVar.f9639a.f9640a.mo10854g(j);
                    if (iM13655a != 1) {
                        cujVar.f9639a.f9641b.mo11610l("/video_state_recording_output", j);
                    }
                }
                break;
            case 1:
                ((cuk) this.f9637a).f9640a.mo10850c();
                break;
            case 2:
                cur curVar = (cur) this.f9637a;
                if (curVar.m5536a().m10520a(hnv.HEAT_SEVERE)) {
                    curVar.f9673h.m11119d(idk.RECORDING_EARLY_STOPPED);
                }
                break;
            case 3:
                ((idl) this.f9637a).m11116a(idk.RECORDING_EARLY_STOPPED);
                break;
            case 4:
                this.f9637a.mo5485c(true);
                break;
            case 5:
                this.f9637a.mo5485c(false);
                break;
            case 6:
                ((idl) this.f9637a).m11119d(idk.POOR_VIDEO_QUALITY);
                break;
            case 7:
                ((idl) this.f9637a).m11116a(idk.POOR_VIDEO_QUALITY);
                break;
            case 8:
                ((cwz) this.f9637a).m5695c();
                break;
            case 9:
                ((cwz) this.f9637a).m5695c();
                break;
            case 10:
                ((dfn) this.f9637a).f10791d.mo3415bf(true);
                break;
            case 11:
                ((dfn) this.f9637a).f10791d.mo3415bf(false);
                break;
            case 12:
                ((czs) this.f9637a).m5748b();
                break;
            case 13:
                czt cztVar = (czt) this.f9637a;
                cztVar.f10159m = true;
                if (cztVar.f10158l) {
                    cztVar.f10154h.m5756d();
                    cztVar.m5749a();
                }
                break;
            case 14:
                czt cztVar2 = (czt) this.f9637a;
                cztVar2.f10158l = true;
                if (cztVar2.f10159m) {
                    cztVar2.f10156j.m5756d();
                    cztVar2.m5749a();
                }
                break;
            case 15:
                czt cztVar3 = (czt) this.f9637a;
                cztVar3.f10151e.execute(new cui(cztVar3, 13));
                break;
            case 16:
                czt cztVar4 = (czt) this.f9637a;
                cztVar4.f10151e.execute(new cui(cztVar4, 14));
                break;
            case 17:
                ((czv) this.f9637a).m5755c();
                break;
            case 18:
                ((czw) this.f9637a).f10174b.mo10030b(gzy.f27003O).mo3415bf(true);
                break;
            case 19:
                czy czyVar = (czy) this.f9637a;
                czyVar.f10187d = true;
                if (czyVar.f10188e) {
                    czyVar.f10186c.m5756d();
                    czyVar.m5764b();
                }
                break;
            default:
                czy czyVar2 = (czy) this.f9637a;
                czyVar2.f10184a.execute(new czx(czyVar2, i));
                break;
        }
    }
}
