package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ghv implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24825a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24826b;

    public /* synthetic */ ghv(ckp ckpVar, int i) {
        this.f24826b = i;
        this.f24825a = ckpVar;
    }

    public /* synthetic */ ghv(ghq ghqVar, int i) {
        this.f24826b = i;
        this.f24825a = ghqVar;
    }

    public /* synthetic */ ghv(ghx ghxVar, int i) {
        this.f24826b = i;
        this.f24825a = ghxVar;
    }

    public /* synthetic */ ghv(ghy ghyVar, int i) {
        this.f24826b = i;
        this.f24825a = ghyVar;
    }

    public ghv(ghy ghyVar, int i, byte[] bArr) {
        this.f24826b = i;
        this.f24825a = ghyVar;
    }

    public /* synthetic */ ghv(gio gioVar, int i) {
        this.f24826b = i;
        this.f24825a = gioVar;
    }

    public /* synthetic */ ghv(gmt gmtVar, int i) {
        this.f24826b = i;
        this.f24825a = gmtVar;
    }

    public /* synthetic */ ghv(gox goxVar, int i) {
        this.f24826b = i;
        this.f24825a = goxVar;
    }

    public /* synthetic */ ghv(gpl gplVar, int i) {
        this.f24826b = i;
        this.f24825a = gplVar;
    }

    public /* synthetic */ ghv(jwf jwfVar, int i) {
        this.f24826b = i;
        this.f24825a = jwfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nqf nqfVar;
        switch (this.f24826b) {
            case 0:
                ghy ghyVar = (ghy) this.f24825a;
                if (ghyVar.f24841g.f5194a != ikw.LONG_EXPOSURE) {
                    ghyVar.f24841g.m3465b(ghyVar.f24849o);
                    return;
                } else {
                    ghyVar.f24842h.m3429d();
                    ghyVar.f24842h.m3427b(ghyVar.f24849o);
                    return;
                }
            case 1:
                ghq ghqVar = (ghq) this.f24825a;
                if (((Boolean) ((jwf) ghqVar.f24789c).f34942d).booleanValue() || (nqfVar = ghqVar.f24790d) == null) {
                    return;
                }
                nqfVar.mo14894e(null);
                return;
            case 2:
                ghx ghxVar = (ghx) this.f24825a;
                ((hrx) ghxVar.f24832d.f24835a.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                ghxVar.f24832d.f24837c.mo14124k(bzq.m3268h());
                return;
            case 3:
                ((hrx) ((ghx) this.f24825a).f24832d.f24835a.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                return;
            case 4:
                ((hrx) ((ghx) this.f24825a).f24832d.f24835a.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                return;
            case 5:
                ((ghx) this.f24825a).f24832d.f24837c.mo14124k(bzq.m3269i());
                return;
            case 6:
                ghx ghxVar2 = (ghx) this.f24825a;
                ((hrx) ghxVar2.f24832d.f24835a.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                ghxVar2.f24832d.f24837c.mo14124k(bzq.m3270j());
                return;
            case 7:
                jwn jwnVar = ((ghy) this.f24825a).f24836b;
                jwnVar.getClass();
                ((Boolean) jwnVar.mo3831be()).booleanValue();
                ((ghy) this.f24825a).m9264c();
                nqf nqfVar2 = ((ghy) this.f24825a).f24843i;
                if (nqfVar2 != null) {
                    nqfVar2.mo14894e(null);
                    return;
                }
                return;
            case 8:
                kxk.m14975U(((gio) this.f24825a).f24898a.mo9849a(), new gil(0), not.INSTANCE);
                return;
            case 9:
                ((jwf) this.f24825a).mo3415bf(gjy.f25200a);
                return;
            case 10:
                Object obj = this.f24825a;
                gmt gmtVar = (gmt) obj;
                gmtVar.f25617c.mo13944f("Closing one camera.");
                jwc.m13621a(gmtVar.f25618d, gmtVar.f25615a, "Low Priority OneCameraLifetime");
                jwc.m13621a(gmtVar.f25618d, gmtVar.f25616b, "Critical Path OneCameraLifetime");
                synchronized (obj) {
                    nps npsVar = ((gmt) obj).f25619e;
                    if (npsVar != null) {
                        npsVar.cancel(true);
                    }
                    break;
                }
                gmtVar.f25617c.mo13944f("OneCamera closed.");
                return;
            case 11:
                ((gox) this.f24825a).f25906a.mo8564b(ikw.PORTRAIT);
                return;
            case 12:
                ((ckp) this.f24825a).m3842b();
                return;
            default:
                Object obj2 = this.f24825a;
                synchronized (((gpl) obj2).f25962h) {
                    if (((gpl) obj2).f25965k) {
                        ((nbe) ((nbe) gpl.f25955a.m17252c()).mo17276G(3153)).mo17290o("init() called on an already initialized PortraitController.");
                        return;
                    }
                    synchronized (((gpl) obj2).f25961g) {
                        gpx gpxVar = ((gpl) obj2).f25966l;
                        if (gpxVar != null && ((gpl) obj2).f25967m != null) {
                            if (gpxVar.mo9617a() == 0) {
                                ((nbe) ((nbe) gpl.f25955a.m17252c()).mo17276G(3152)).mo17290o("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                                ((gpl) obj2).f25966l.mo9618b();
                            }
                            if (((gpl) obj2).f25967m.mo9611a() == 0 && ((gpl) obj2).f25960f.mo6184l(dio.f11648E)) {
                                ((nbe) ((nbe) gpl.f25955a.m17252c()).mo17276G(3151)).mo17290o("Expected portrait relighting processor to be initialized, but it wasn't. Initializing again.");
                                ((gpl) obj2).f25967m.mo9612d();
                            }
                            ((gpl) obj2).f25965k = true;
                        }
                        break;
                    }
                    return;
                }
        }
    }
}
