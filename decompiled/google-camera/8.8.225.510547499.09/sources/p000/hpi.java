package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hpi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f28868a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28869b;

    public /* synthetic */ hpi(hpm hpmVar, int i) {
        this.f28869b = i;
        this.f28868a = hpmVar;
    }

    public /* synthetic */ hpi(hpp hppVar, int i) {
        this.f28869b = i;
        this.f28868a = hppVar;
    }

    public /* synthetic */ hpi(hpu hpuVar, int i) {
        this.f28869b = i;
        this.f28868a = hpuVar;
    }

    public /* synthetic */ hpi(hqb hqbVar, int i) {
        this.f28869b = i;
        this.f28868a = hqbVar;
    }

    public /* synthetic */ hpi(iey ieyVar, int i) {
        this.f28869b = i;
        this.f28868a = ieyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hjn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [hpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [hpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [hpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [hpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [iey, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28869b) {
            case 0:
                this.f28868a.mo5712g();
                break;
            case 1:
                hpm hpmVar = (hpm) this.f28868a;
                hpmVar.f28884C.mo5712g();
                hpmVar.f28883B.m10581h();
                hpmVar.f28925j.mo3415bf(hor.STATE_UNINITIALIZED);
                break;
            case 2:
                this.f28868a.mo11164g();
                break;
            case 3:
                ((hpm) this.f28868a).f28882A.m10553d(true);
                break;
            case 4:
                hpm hpmVar2 = (hpm) this.f28868a;
                hpmVar2.f28940y.registerListener(hpmVar2.f28939x, hpmVar2.f28889H, 3);
                break;
            case 5:
                ((hqb) this.f28868a).mo5711f();
                break;
            case 6:
                ((hpm) this.f28868a).m10591i(true);
                break;
            case 7:
                ((hpm) this.f28868a).m10591i(false);
                break;
            case 8:
                hpm hpmVar3 = (hpm) this.f28868a;
                if (((hor) hpmVar3.f28925j.f34942d).equals(hor.STATE_PRE_RECORDING)) {
                    ((nbe) ((nbe) hpm.f28881a.m17252c()).mo17276G((char) 3844)).mo17290o("Pre-recording state, set statechart back to stop recording.");
                    hpmVar3.f28925j.mo3415bf(hor.STATE_RECORDING_ERROR);
                    hpmVar3.f28884C.mo10543b();
                }
                hqk hqkVar = hpmVar3.f28886E;
                hqkVar.m10597c(true);
                hqkVar.f29084g.m10837d(false);
                hqkVar.f29091n.mo5816g(hqkVar.f29061I);
                break;
            case 9:
                hpm hpmVar4 = (hpm) this.f28868a;
                hpmVar4.f28940y.unregisterListener(hpmVar4.f28939x, hpmVar4.f28889H);
                break;
            case 10:
                hpm hpmVar5 = (hpm) this.f28868a;
                hpmVar5.f28891J.m5468d();
                hpmVar5.f28884C.mo10543b();
                hpmVar5.f28938w.mo11165i();
                break;
            case 11:
                ((hpm) this.f28868a).m10591i(true);
                break;
            case 12:
                this.f28868a.mo10545d();
                break;
            case 13:
                this.f28868a.mo10547i();
                break;
            case 14:
                this.f28868a.mo10542a();
                break;
            case 15:
                hpm hpmVar6 = (hpm) this.f28868a;
                hpmVar6.f28924i.mo10739g(ilj.VIDEO);
                hpmVar6.f28924i.mo10741i(hpmVar6.f28926k.getResources().getString(C0100R.string.video_accessibility_peek));
                break;
            case 16:
                hpm hpmVar7 = (hpm) this.f28868a;
                int i = ((hor) hpmVar7.f28925j.f34942d).f28650k;
                hor horVar = hor.STATE_PREPARING_ON_PREVIEW_STARTED;
                int i2 = i | horVar.f28650k;
                hor horVar2 = hor.STATE_IDLE;
                if (i2 == horVar2.f28650k) {
                    hpmVar7.f28925j.mo3415bf(horVar2);
                } else {
                    hpmVar7.f28925j.mo3415bf(horVar);
                }
                hpmVar7.f28888G.mo3415bf(fnb.f22776b);
                hpmVar7.f28884C.mo5711f();
                break;
            case 17:
                this.f28868a.mo10544c();
                break;
            case 18:
                ((hpp) this.f28868a).f28987c.mo8564b(ikw.TIME_LAPSE);
                break;
            case 19:
                ((hpu) this.f28868a).f29001g.m11116a(idk.POOR_VIDEO_QUALITY);
                break;
            default:
                Object obj = this.f28868a;
                ((nbe) ((nbe) hpu.f28995a.m17252c()).mo17276G((char) 3873)).mo17290o("Device temperature is too high that may impact video quality.");
                ((hpu) obj).f29001g.m11119d(idk.POOR_VIDEO_QUALITY);
                break;
        }
    }
}
