package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ijp implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31211a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31212b;

    public /* synthetic */ ijp(ijq ijqVar, int i) {
        this.f31212b = i;
        this.f31211a = ijqVar;
    }

    public /* synthetic */ ijp(ika ikaVar, int i) {
        this.f31212b = i;
        this.f31211a = ikaVar;
    }

    public /* synthetic */ ijp(iph iphVar, int i) {
        this.f31212b = i;
        this.f31211a = iphVar;
    }

    public /* synthetic */ ijp(irg irgVar, int i) {
        this.f31212b = i;
        this.f31211a = irgVar;
    }

    public /* synthetic */ ijp(irs irsVar, int i) {
        this.f31212b = i;
        this.f31211a = irsVar;
    }

    public /* synthetic */ ijp(ite iteVar, int i) {
        this.f31212b = i;
        this.f31211a = iteVar;
    }

    public /* synthetic */ ijp(Runnable runnable, int i) {
        this.f31212b = i;
        this.f31211a = runnable;
    }

    public /* synthetic */ ijp(jxa jxaVar, int i) {
        this.f31212b = i;
        this.f31211a = jxaVar;
    }

    public /* synthetic */ ijp(jzd jzdVar, int i) {
        this.f31212b = i;
        this.f31211a = jzdVar;
    }

    public /* synthetic */ ijp(kjr kjrVar, int i) {
        this.f31212b = i;
        this.f31211a = kjrVar;
    }

    public /* synthetic */ ijp(kot kotVar, int i, byte[] bArr) {
        this.f31212b = i;
        this.f31211a = kotVar;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r9v95, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        hnp hnpVar;
        int i = 3;
        switch (this.f31212b) {
            case 0:
                Object obj2 = this.f31211a;
                if (((Boolean) obj).booleanValue()) {
                    ((ijq) obj2).f31216d.f12398d.mo3415bf(true);
                    return;
                }
                return;
            case 1:
                Object obj3 = this.f31211a;
                gly glyVar = (gly) obj;
                if (!glyVar.f25570b) {
                    ijq ijqVar = (ijq) obj3;
                    ijqVar.f31213a.mo6476l(false);
                    ijqVar.f31213a.mo6478n(dot.SINGLE);
                    return;
                } else {
                    if (glyVar.f25569a) {
                        ijq ijqVar2 = (ijq) obj3;
                        ijqVar2.f31213a.mo6476l(false);
                        if (ijqVar2.f31214b.mo6184l(dho.f11141a)) {
                            ijqVar2.f31213a.mo6478n(dot.SINGLE);
                            return;
                        } else {
                            ijqVar2.f31213a.mo6478n(dot.DUAL_INDEPENDENT);
                            return;
                        }
                    }
                    ijq ijqVar3 = (ijq) obj3;
                    ijqVar3.f31213a.mo6478n(dot.SINGLE);
                    if (!ijqVar3.f31214b.mo6184l(did.f11414Y) || ijqVar3.f31214b.mo6184l(dho.f11141a)) {
                        return;
                    }
                    ijqVar3.f31213a.mo6476l(true);
                    return;
                }
            case 2:
                gzp gzpVar = (gzp) obj;
                ika ikaVar = (ika) this.f31211a;
                if (ikaVar.f31302y.m3526f()) {
                    return;
                }
                if (gzpVar == gzp.AUTO) {
                    if (((clo) ikaVar.f31287j.get()).m3927f()) {
                        return;
                    }
                    clo cloVar = (clo) ikaVar.f31287j.get();
                    lku.m15616K(cloVar.f6147a.f34942d == clv.DISABLED, "Cannot transition to IDLE from %s", cloVar.f6147a.f34942d);
                    cloVar.m3925d(clv.IDLE);
                    if (ikaVar.f31285h.mo9108G()) {
                        return;
                    }
                    ((clo) ikaVar.f31287j.get()).m3924c();
                    return;
                }
                if (((clo) ikaVar.f31287j.get()).m3927f()) {
                    clo cloVar2 = (clo) ikaVar.f31287j.get();
                    lku.m15616K(cloVar2.f6147a.f34942d == clv.IDLE, "Cannot transition to DISABLED from %s", cloVar2.f6147a.f34942d);
                    cloVar2.m3925d(clv.DISABLED);
                    if (ikaVar.f31285h.mo9108G()) {
                        return;
                    }
                    ((clo) ikaVar.f31287j.get()).m3922a();
                    return;
                }
                return;
            case 3:
                Object obj4 = this.f31211a;
                switch (((Integer) obj).intValue()) {
                    case 0:
                        hnpVar = hnp.OFF;
                        break;
                    case 1:
                        hnpVar = hnp.AUTO;
                        break;
                    case 2:
                        hnpVar = hnp.ON;
                        break;
                    default:
                        throw new AssertionError("Invalid Macro Focus state.");
                }
                ika ikaVar2 = (ika) obj4;
                if (((hnp) ikaVar2.f31299v.mo3831be()).equals(hnpVar)) {
                    return;
                }
                ikaVar2.f31299v.mo3415bf(hnpVar);
                fcp fcpVar = ikaVar2.f31301x;
                nxl nxlVarM18137O = nly.f43704e.m18137O();
                switch (hnpVar.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        i = 4;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 1;
                        break;
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nly nlyVar = (nly) nxlVarM18137O.f44974b;
                nlyVar.f43707b = i - 1;
                nlyVar.f43706a |= 1;
                int iM11411e = iku.m11411e((ikw) ikaVar2.f31295r.mo3831be());
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nly nlyVar2 = (nly) nxqVar;
                nlyVar2.f43708c = iM11411e - 1;
                nlyVar2.f43706a |= 2;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nly nlyVar3 = (nly) nxlVarM18137O.f44974b;
                nlyVar3.f43709d = 2;
                nlyVar3.f43706a |= 4;
                fcpVar.mo8204x(mws.m17097l((nly) nxlVarM18137O.mo18103l()));
                if (hnpVar.equals(hnp.ON)) {
                    return;
                }
                ikaVar2.f31293p.mo10033e(gzy.f27055n, Boolean.valueOf(hnp.m10515b(hnpVar)));
                return;
            case 4:
                fgk fgkVar = (fgk) ((ika) this.f31211a).f31280c.mo16809c();
                int iM12986j = jeu.m12986j(((Integer) obj).intValue());
                hnp hnpVar2 = hnp.OFF;
                switch (iM12986j - 1) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                }
                fgkVar.f21914a = i;
                fgkVar.m8390a();
                return;
            case 5:
                ((iph) this.f31211a).m11591b();
                return;
            case 6:
                ((irg) this.f31211a).m11644q();
                return;
            case 7:
                ((irg) this.f31211a).m11641n();
                return;
            case 8:
                Boolean bool = (Boolean) obj;
                irs irsVar = (irs) this.f31211a;
                if (irsVar.f31939f == null) {
                    ((nbe) ((nbe) irs.f31934a.m17252c()).mo17276G((char) 4417)).mo17290o("UI has not inflated");
                    return;
                } else {
                    if (bool.booleanValue()) {
                        irsVar.m11664f();
                        return;
                    }
                    return;
                }
            case 9:
                irs irsVar2 = (irs) this.f31211a;
                if (irsVar2.f31939f == null) {
                    ((nbe) ((nbe) irs.f31934a.m17252c()).mo17276G((char) 4419)).mo17290o("UI has not inflated");
                    return;
                } else {
                    if (irsVar2.f31937d) {
                        return;
                    }
                    irsVar2.mo11662d(false, true);
                    return;
                }
            case 10:
                irs irsVar3 = (irs) this.f31211a;
                if (irsVar3.f31939f == null) {
                    ((nbe) ((nbe) irs.f31934a.m17252c()).mo17276G((char) 4420)).mo17290o("UI haven't not inflated");
                    return;
                } else {
                    irsVar3.mo11662d(false, true);
                    return;
                }
            case 11:
                Object obj5 = this.f31211a;
                if (((Boolean) obj).booleanValue()) {
                    ite iteVar = (ite) obj5;
                    if (iteVar.f32109n.f36779l) {
                        ZoomSliderView zoomSliderView = iteVar.f32062M;
                        float fFloatValue = ((Float) iteVar.f32099d.mo6180h(dib.f11352cf).get()).floatValue();
                        if (fFloatValue < 1.0f) {
                            fFloatValue = 1.0f;
                        } else if (fFloatValue > 7.9f) {
                            fFloatValue = 7.9f;
                        }
                        zoomSliderView.f7385g = fFloatValue;
                        iteVar.f32062M.m4540i();
                        if (iteVar.f32062M.getVisibility() == 0) {
                            iteVar.f32054E.mo11674a();
                            iteVar.f32054E.mo11681k();
                        }
                        iteVar.m11737R();
                        return;
                    }
                }
                ite iteVar2 = (ite) obj5;
                iteVar2.f32062M.m4542k(iteVar2.mo11753d());
                iteVar2.m11737R();
                return;
            case 12:
                Float f = (Float) obj;
                ite iteVar3 = (ite) this.f31211a;
                if (!iteVar3.f32074Y) {
                    iteVar3.f32060K.m4530e(iteVar3.m11759j(f.floatValue()), f.floatValue(), ((Float) ((jwf) iteVar3.f32102g).f34942d).floatValue(), iteVar3.m11751b());
                    return;
                } else {
                    iteVar3.m11750ae(f.floatValue());
                    iteVar3.f32064O.m4578z(iteVar3.f32060K.m4527b(f.floatValue(), ((Float) ((jwf) iteVar3.f32102g).f34942d).floatValue(), iteVar3.m11751b()));
                    return;
                }
            case 13:
                Float f2 = (Float) obj;
                ite iteVar4 = (ite) this.f31211a;
                Optional optionalMo6173a = iteVar4.f32099d.mo6173a(dib.f11240a);
                if (!optionalMo6173a.isPresent() || f2.floatValue() <= ((Integer) optionalMo6173a.get()).intValue()) {
                    ZoomSliderView zoomSliderView2 = iteVar4.f32062M;
                    int i2 = mws.f41739d;
                    zoomSliderView2.f7397s = mzr.f41857a;
                } else {
                    iteVar4.f32062M.f7397s = mws.m17097l(Float.valueOf(((Integer) optionalMo6173a.get()).intValue()));
                }
                iteVar4.mo11765p();
                iteVar4.f32062M.f7392n = iteVar4.mo11756g();
                if (iteVar4.f32108m) {
                    iteVar4.f32060K.m4530e(iteVar4.m11759j(((Float) iteVar4.f32103h.mo3831be()).floatValue()), ((Float) iteVar4.f32103h.mo3831be()).floatValue(), ((Float) ((jwf) iteVar4.f32102g).f34942d).floatValue(), iteVar4.m11751b());
                    return;
                }
                return;
            case 14:
                this.f31211a.run();
                return;
            case 15:
                ((jwf) this.f31211a).mo3415bf(obj);
                return;
            case 16:
                Object obj6 = this.f31211a;
                Long l = (Long) obj;
                if (l.longValue() > 0) {
                    ((jzd) obj6).m13786h();
                    return;
                } else {
                    if (l.longValue() == -1) {
                        Log.w("AudioEncoder", "Empty video recording detected, not adding audio.");
                        ((jzd) obj6).f35231O.mo14894e(null);
                        return;
                    }
                    return;
                }
            case 17:
                ((jzd) this.f31211a).m13786h();
                return;
            case 18:
                Object obj7 = this.f31211a;
                mrm mrmVar = (mrm) obj;
                if (mrmVar.mo16813g()) {
                    ((kjr) obj7).mo14394b((Surface) mrmVar.mo16809c());
                    return;
                }
                return;
            default:
                Object obj8 = this.f31211a;
                if (((Rect) ((kpl) obj).mo9517d(CaptureResult.SCALER_CROP_REGION)) == null) {
                    return;
                }
                ((kot) obj8).m14646h();
                return;
        }
    }
}
