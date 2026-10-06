package p000;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.p014ui.modeslider.ModeSliderUi;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class czq implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10133a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10134b;

    public /* synthetic */ czq(cxo cxoVar, int i) {
        this.f10134b = i;
        this.f10133a = cxoVar;
    }

    public /* synthetic */ czq(czr czrVar, int i) {
        this.f10134b = i;
        this.f10133a = czrVar;
    }

    public /* synthetic */ czq(dab dabVar, int i) {
        this.f10134b = i;
        this.f10133a = dabVar;
    }

    public /* synthetic */ czq(dal dalVar, int i) {
        this.f10134b = i;
        this.f10133a = dalVar;
    }

    public /* synthetic */ czq(dep depVar, int i) {
        this.f10134b = i;
        this.f10133a = depVar;
    }

    public /* synthetic */ czq(dfo dfoVar, int i) {
        this.f10134b = i;
        this.f10133a = dfoVar;
    }

    public /* synthetic */ czq(dgb dgbVar, int i) {
        this.f10134b = i;
        this.f10133a = dgbVar;
    }

    public /* synthetic */ czq(dgi dgiVar, int i) {
        this.f10134b = i;
        this.f10133a = dgiVar;
    }

    public /* synthetic */ czq(dgu dguVar, int i) {
        this.f10134b = i;
        this.f10133a = dguVar;
    }

    public /* synthetic */ czq(dlc dlcVar, int i) {
        this.f10134b = i;
        this.f10133a = dlcVar;
    }

    public /* synthetic */ czq(dpc dpcVar, int i) {
        this.f10134b = i;
        this.f10133a = dpcVar;
    }

    public /* synthetic */ czq(dqv dqvVar, int i) {
        this.f10134b = i;
        this.f10133a = dqvVar;
    }

    public /* synthetic */ czq(gfa gfaVar, int i) {
        this.f10134b = i;
        this.f10133a = gfaVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [dlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gfa, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        gzm gzmVar;
        switch (this.f10134b) {
            case 0:
                Object obj2 = this.f10133a;
                ((Boolean) obj).booleanValue();
                ((czr) obj2).m5746d();
                return;
            case 1:
                ikw ikwVar = (ikw) obj;
                cxo cxoVar = (cxo) this.f10133a;
                if (cxoVar.f9994g) {
                    cxoVar.f9994g = false;
                    return;
                } else {
                    if (ikwVar.equals(ikw.VIDEO) || cxoVar.f9993f.get()) {
                        return;
                    }
                    cxoVar.m5718c(false);
                    return;
                }
            case 2:
                this.f10133a.mo9129o(false, gev.AMETHYST);
                return;
            case 3:
                this.f10133a.mo9129o(false, gev.AMETHYST);
                return;
            case 4:
                Object obj3 = this.f10133a;
                ikw ikwVar2 = (ikw) obj;
                dab dabVar = (dab) obj3;
                if (dabVar.m5799k(ikwVar2)) {
                    if (dabVar.m5800l(ikwVar2)) {
                        dabVar.m5797i(ikwVar2);
                        return;
                    }
                    return;
                }
                synchronized (dabVar.f10214i) {
                    ((dab) obj3).f10217l = ikwVar2;
                    Iterator it = ((dab) obj3).f10208c.iterator();
                    while (it.hasNext()) {
                        ((AmbientModeSupport.AmbientController) it.next()).m1654d(ikwVar2);
                    }
                    break;
                }
                dabVar.mo5792d(false);
                return;
            case 5:
                Object obj4 = this.f10133a;
                if (((fnb) obj).f22777c) {
                    dab dabVar2 = (dab) obj4;
                    if (dabVar2.f10210e.f10237h.containsKey(dabVar2.f10206a.mo3831be())) {
                        dabVar2.m5791a();
                        dabVar2.mo5794f(true);
                        dabVar2.f10215j.mo5815f();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dci dciVar = (dci) obj;
                dab dabVar3 = (dab) this.f10133a;
                ModeSliderUi modeSliderUi = dabVar3.f10218m;
                if (modeSliderUi == null || modeSliderUi.getVisibility() != 0) {
                    return;
                }
                dabVar3.m5798j(dciVar.m5923a());
                return;
            case 7:
                ((dal) this.f10133a).m5832t();
                return;
            case 8:
                gfc gfcVar = (gfc) obj;
                dal dalVar = (dal) this.f10133a;
                if (gfcVar.equals(dalVar.m5828o())) {
                    return;
                }
                jww jwwVarM5829q = dalVar.m5829q();
                gzm gzmVar2 = gzm.FPS_AUTO;
                switch (gfcVar.ordinal()) {
                    case 26:
                        gzmVar = gzm.FPS_AUTO;
                        break;
                    case 27:
                        gzmVar = gzm.FPS_24;
                        break;
                    case 28:
                        gzmVar = gzm.FPS_30;
                        break;
                    case 29:
                        gzmVar = gzm.FPS_60;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid menu option: ".concat(String.valueOf(String.valueOf(gfcVar))));
                }
                jwwVarM5829q.mo3415bf(gzmVar);
                return;
            case 9:
                ((dal) this.f10133a).f10276g = true;
                return;
            case 10:
                this.f10133a.mo9129o(false, gev.BACK_VIDEO_FLASH);
                return;
            case 11:
                ?? r0 = this.f10133a;
                if (ikw.VIDEO.equals(r0.mo9115b())) {
                    r0.mo9129o(false, gev.MICROPHONE);
                    return;
                }
                return;
            case 12:
                Object obj5 = this.f10133a;
                if (((Boolean) obj).booleanValue()) {
                    dep depVar = (dep) obj5;
                    depVar.f10703v = true;
                    depVar.m6013i();
                    return;
                } else {
                    dep depVar2 = (dep) obj5;
                    depVar2.f10703v = false;
                    depVar2.m6012h();
                    return;
                }
            case 13:
                Object obj6 = this.f10133a;
                if (((hno) obj).equals(hno.INACTIVE)) {
                    ((dfo) obj6).m6078b();
                    return;
                } else {
                    ((dfo) obj6).m6077a();
                    return;
                }
            case 14:
                ((dgb) this.f10133a).m6090c();
                return;
            case 15:
                ((dgi) this.f10133a).m6101c();
                return;
            case 16:
                ((dgu) this.f10133a).m6124c();
                return;
            case 17:
                this.f10133a.mo6331d((ikw) obj);
                return;
            case 18:
                ((dpc) this.f10133a).f12177a.m4111i(((Float) obj).floatValue());
                return;
            case 19:
                ((dqv) this.f10133a).m6607d();
                return;
            default:
                ((dqv) this.f10133a).m6607d();
                return;
        }
    }
}
