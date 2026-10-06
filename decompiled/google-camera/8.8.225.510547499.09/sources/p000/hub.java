package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hub implements hju {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f29568a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29569b;

    public /* synthetic */ hub(BottomBarController bottomBarController, int i) {
        this.f29569b = i;
        this.f29568a = bottomBarController;
    }

    public /* synthetic */ hub(ebw ebwVar, int i) {
        this.f29569b = i;
        this.f29568a = ebwVar;
    }

    public /* synthetic */ hub(eoq eoqVar, int i) {
        this.f29569b = i;
        this.f29568a = eoqVar;
    }

    public /* synthetic */ hub(gfa gfaVar, int i) {
        this.f29569b = i;
        this.f29568a = gfaVar;
    }

    public /* synthetic */ hub(hue hueVar, int i) {
        this.f29569b = i;
        this.f29568a = hueVar;
    }

    public /* synthetic */ hub(hxp hxpVar, int i) {
        this.f29569b = i;
        this.f29568a = hxpVar;
    }

    public /* synthetic */ hub(icx icxVar, int i) {
        this.f29569b = i;
        this.f29568a = icxVar;
    }

    public /* synthetic */ hub(igb igbVar, int i) {
        this.f29569b = i;
        this.f29568a = igbVar;
    }

    public /* synthetic */ hub(iuj iujVar, int i) {
        this.f29569b = i;
        this.f29568a = iujVar;
    }

    public /* synthetic */ hub(Runnable runnable, int i) {
        this.f29569b = i;
        this.f29568a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [icx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [icx, java.lang.Object] */
    @Override // p000.hju
    /* JADX INFO: renamed from: a */
    public final kba mo10393a() {
        int i = 20;
        int i2 = 0;
        switch (this.f29569b) {
            case 0:
                return this.f29568a.mo11232d();
            case 1:
                this.f29568a.run();
                return gog.f25850c;
            case 2:
                eoq eoqVar = (eoq) this.f29568a;
                eoqVar.m7600g(1);
                return new eds(eoqVar, 5);
            case 3:
                return ((BottomBarController) this.f29568a).makeClickableAwhile();
            case 4:
                ebw ebwVar = (ebw) this.f29568a;
                ebwVar.m7088b();
                return new dev(ebwVar, i);
            case 5:
                return ((hue) this.f29568a).f29570b.f29583n.mo7483e(ely.FIRST_RUN_TOAST);
            case 6:
                hue hueVar = (hue) this.f29568a;
                ((dpx) hueVar.f29570b.f29576g.get()).m6560b();
                return new hcu(hueVar, 6);
            case 7:
                hue hueVar2 = (hue) this.f29568a;
                jww jwwVarMo10030b = hueVar2.f29570b.f29581l.mo10030b(gzy.f27063v);
                String str = (String) ((jwf) jwwVarMo10030b).f34942d;
                ikw ikwVar = (ikw) hueVar2.f29570b.f29582m.mo3831be();
                if (!hueVar2.f29570b.f29580k.m5900i() || !"torch".equals(str) || (!ikw.SLOW_MOTION.equals(ikwVar) && !ikw.VIDEO.equals(ikwVar) && !ikw.AMBER.equals(ikwVar))) {
                    return gog.f25853f;
                }
                jwwVarMo10030b.mo3415bf("off");
                return new hcu(jwwVarMo10030b, 7);
            case 8:
                eoq eoqVar2 = (eoq) this.f29568a;
                int i3 = eoqVar2.f14896f;
                eoqVar2.m7600g(3);
                return new eon(eoqVar2, i3, i2);
            case 9:
                return this.f29568a.mo9117c();
            case 10:
                hxp hxpVar = (hxp) this.f29568a;
                hxpVar.m10837d(false);
                return new hcu(hxpVar, 11);
            case 11:
                ite iteVar = (ite) this.f29568a;
                ZoomUi zoomUi = iteVar.f32064O;
                if (zoomUi != null && zoomUi.getVisibility() == 8) {
                    return new hcu(iteVar, i);
                }
                iteVar.mo11728I(false);
                return new kap(iteVar, 1);
            case 12:
                return this.f29568a.mo11081e();
            case 13:
                return this.f29568a.mo11231c();
            case 14:
                return ((BottomBarController) this.f29568a).disableCameraSwitchAwhile();
            case 15:
                return ((BottomBarController) this.f29568a).lowerAccessibilityImportanceAwhile();
            default:
                return this.f29568a.mo11082h();
        }
    }
}
