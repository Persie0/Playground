package p000;

import android.hardware.camera2.params.Face;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class euz implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20272a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20273b;

    public /* synthetic */ euz(ccs ccsVar, int i) {
        this.f20273b = i;
        this.f20272a = ccsVar;
    }

    public /* synthetic */ euz(eog eogVar, int i, byte[] bArr) {
        this.f20273b = i;
        this.f20272a = eogVar;
    }

    public /* synthetic */ euz(eog eogVar, int i, char[] cArr) {
        this.f20273b = i;
        this.f20272a = eogVar;
    }

    public /* synthetic */ euz(eva evaVar, int i) {
        this.f20273b = i;
        this.f20272a = evaVar;
    }

    public /* synthetic */ euz(evf evfVar, int i) {
        this.f20273b = i;
        this.f20272a = evfVar;
    }

    public /* synthetic */ euz(evo evoVar, int i) {
        this.f20273b = i;
        this.f20272a = evoVar;
    }

    public /* synthetic */ euz(ewa ewaVar, int i) {
        this.f20273b = i;
        this.f20272a = ewaVar;
    }

    public /* synthetic */ euz(ewq ewqVar, int i) {
        this.f20273b = i;
        this.f20272a = ewqVar;
    }

    public /* synthetic */ euz(ezi eziVar, int i) {
        this.f20273b = i;
        this.f20272a = eziVar;
    }

    public /* synthetic */ euz(fdp fdpVar, int i) {
        this.f20273b = i;
        this.f20272a = fdpVar;
    }

    public /* synthetic */ euz(fgk fgkVar, int i) {
        this.f20273b = i;
        this.f20272a = fgkVar;
    }

    public /* synthetic */ euz(fme fmeVar, int i) {
        this.f20273b = i;
        this.f20272a = fmeVar;
    }

    public /* synthetic */ euz(fmz fmzVar, int i) {
        this.f20273b = i;
        this.f20272a = fmzVar;
    }

    public /* synthetic */ euz(foc focVar, int i) {
        this.f20273b = i;
        this.f20272a = focVar;
    }

    public /* synthetic */ euz(gkz gkzVar, int i, byte[] bArr) {
        this.f20273b = i;
        this.f20272a = gkzVar;
    }

    public /* synthetic */ euz(igb igbVar, int i) {
        this.f20273b = i;
        this.f20272a = igbVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [igb, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        ewa ewaVar;
        fmd fmdVar;
        float f;
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.f20273b) {
            case 0:
                ((eva) ((eog) this.f20272a).f14852a).m7921w(((Boolean) obj).booleanValue());
                return;
            case 1:
                eqz eqzVar = (eqz) obj;
                eva evaVar = (eva) this.f20272a;
                if (!evaVar.f20318l.mo16813g() || evaVar.f20331y.f26433a) {
                    return;
                }
                eqz eqzVar2 = eqz.AUTO;
                switch (eqzVar.ordinal()) {
                    case 1:
                        if (evaVar.f20294O.m13088X("lasagna_edu_landscape") == 0) {
                            ((eqs) evaVar.f20318l.mo16809c()).mo7611b(eqzVar, 2);
                            return;
                        }
                        return;
                    case 2:
                        if (evaVar.f20294O.m13088X("lasagna_edu_action") == 0) {
                            ((eqs) evaVar.f20318l.mo16809c()).mo7611b(eqzVar, 2);
                            return;
                        }
                        return;
                    default:
                        ((nbe) ((nbe) eva.f20279b.m17252c()).mo17276G((char) 1969)).mo17293r("No education for option %s", eqzVar);
                        return;
                }
            case 2:
                this.f20272a.mo11227ai((gzp) obj);
                return;
            case 3:
                ((chw) this.f20272a).mo3777k();
                return;
            case 4:
                ((evf) this.f20272a).m7924a(((Boolean) obj).booleanValue());
                return;
            case 5:
                Object obj2 = this.f20272a;
                if (((Boolean) obj).booleanValue() && (fmdVar = (ewaVar = (ewa) obj2).f20517T) != null && fmdVar.f22543c.mo14544M() && fmdVar.f22543c.mo14535D()) {
                    ewaVar.m7935w(false);
                    synchronized (ewaVar.f20512O) {
                        kxk.m14958D(((ewa) obj2).f20512O).m17607c(new evu((ewa) obj2, z ? 1 : 0), ((ewa) obj2).f20548f);
                        break;
                    }
                    return;
                }
                return;
            case 6:
                gzp gzpVar = (gzp) obj;
                ewa ewaVar2 = (ewa) this.f20272a;
                ewaVar2.f20565w.mo11227ai(gzpVar);
                if (ewaVar2.f20561s.mo6184l(dib.f11357ck) && ewaVar2.f20502E.m10885h()) {
                    ((nbe) ((nbe) ewa.f20497b.m17252c()).mo17276G((char) 1990)).mo17293r("Switch Hotshot due to timer changed to %s", gzpVar);
                    if (gzpVar.equals(gzp.OFF)) {
                        ewaVar2.f20549g.execute(new evu(ewaVar2, i));
                        return;
                    } else {
                        ewaVar2.f20502E.m10883f();
                        return;
                    }
                }
                return;
            case 7:
                Object obj3 = this.f20272a;
                int length = ((Face[]) ((igp) obj).f30851c).length;
                ewa ewaVar3 = (ewa) obj3;
                ewaVar3.f20504G.mo3415bf(Boolean.valueOf(length > 0));
                ((imw) ewaVar3.f20520W.f3651a).m11498a(length);
                if (ewaVar3.f20509L != null && ewaVar3.f20546d.m5900i()) {
                    int i2 = ewaVar3.f20510M;
                    if (i2 < 5) {
                        ewaVar3.f20510M = i2 + 1;
                        f = 0.0f;
                    } else {
                        imw imwVar = ewaVar3.f20562t;
                        jwn jwnVar = ewaVar3.f20509L;
                        jwnVar.getClass();
                        Float f2 = ((gam) jwnVar.mo3831be()).f24031a;
                        f2.getClass();
                        imwVar.m11498a(f2.floatValue());
                        f = ewaVar3.f20562t.f31556a;
                    }
                    if (((int) (((imw) ewaVar3.f20520W.f3651a).f31556a + 0.5f)) == 0 && f > 3.0f) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    gps gpsVar = ewaVar3.f20507J;
                    if (boolValueOf.booleanValue()) {
                        synchronized (gpsVar.f26016d) {
                            if (gpsVar.f26018f) {
                                if (gpsVar.f26019g != 2) {
                                    gpsVar.f26019g = 2;
                                    gpsVar.f26013a.mo7482d(gpsVar.f26014b);
                                    gpsVar.m9621c(800L);
                                }
                            }
                        }
                    }
                    gpsVar.f26017e = boolValueOf;
                    return;
                }
                return;
            case 8:
                ((ewa) ((eog) this.f20272a).f14852a).m7935w(((Boolean) obj).booleanValue());
                return;
            case 9:
                Object obj4 = this.f20272a;
                if (((fuo) ((gtd) obj).f26334a).f23596b == gst.ACTIVE_SCAN) {
                    ((ewa) ((eog) obj4).f14852a).f20507J.m9620b();
                    return;
                }
                return;
            case 10:
                Object obj5 = this.f20272a;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((jxd) ((gkz) obj5).f25445n).mo3415bf(gdb.AUTO);
                return;
            case 11:
                Object obj6 = this.f20272a;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((jxd) ((ewq) obj6).f20669c).mo3415bf(gdb.AUTO);
                return;
            case 12:
                Object obj7 = this.f20272a;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    ezi eziVar = (ezi) obj7;
                    eziVar.f21048d.execute(new evu(eziVar, 10));
                } else {
                    ezi eziVar2 = (ezi) obj7;
                    eziVar2.f21048d.execute(new evu(eziVar2, 13));
                }
                ezi eziVar3 = (ezi) obj7;
                fcp fcpVar = eziVar3.f21056l;
                nxl nxlVarM18137O = nke.f43182f.m18137O();
                String str = eziVar3.f21065u;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nke nkeVar = (nke) nxlVarM18137O.f44974b;
                str.getClass();
                nkeVar.f43184a |= 8;
                nkeVar.f43188e = str;
                nxl nxlVarM18137O2 = nkg.f43196c.m18137O();
                boolean zBooleanValue = bool.booleanValue();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nkg nkgVar = (nkg) nxlVarM18137O2.f44974b;
                nkgVar.f43198a = 1 | nkgVar.f43198a;
                nkgVar.f43199b = zBooleanValue;
                nkg nkgVar2 = (nkg) nxlVarM18137O2.mo18103l();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nke nkeVar2 = (nke) nxlVarM18137O.f44974b;
                nkgVar2.getClass();
                nkeVar2.f43187d = nkgVar2;
                nkeVar2.f43184a |= 4;
                fcpVar.mo8203w((nke) nxlVarM18137O.mo18103l());
                return;
            case 13:
                Object obj8 = this.f20272a;
                jvd.m13538a();
                ((ccs) obj8).f5194a = (ikw) obj;
                return;
            case 14:
                idb idbVar = (idb) obj;
                fdp fdpVar = (fdp) this.f20272a;
                if (fdpVar.f21462d) {
                    return;
                }
                fdpVar.f21462d = true;
                if (fdpVar.f21465g.m13093ac("long_exposure_promote_smarts_chip")) {
                    hew hewVar = fdpVar.f21463e;
                    Date date = fdpVar.f21464f;
                    if (date == null || idbVar.mo11108r() == null || idbVar.mo11108r().before(date) || !((String) fdpVar.f21461c.mo10031c(gzy.f27061t)).equals("on") || hewVar == null) {
                        return;
                    }
                    hewVar.mo10131b(fdpVar.f21459a);
                    return;
                }
                return;
            case 15:
                Object obj9 = this.f20272a;
                if (((String) obj).equals("on")) {
                    return;
                }
                ((fdp) obj9).m8276c();
                return;
            case 16:
                ((fgk) this.f20272a).m8390a();
                return;
            case 17:
                ((fme) this.f20272a).m8578e();
                return;
            case 18:
                ((fme) this.f20272a).m8578e();
                return;
            case 19:
                fmz fmzVar = (fmz) this.f20272a;
                fmzVar.f22756c.mo3415bf(Boolean.valueOf(fmzVar.m8597a((hyd) fmzVar.f22754a.mo3831be(), ((Integer) obj).intValue())));
                return;
            default:
                ((foc) this.f20272a).f22823B.sendEmptyMessage(105);
                return;
        }
    }
}
