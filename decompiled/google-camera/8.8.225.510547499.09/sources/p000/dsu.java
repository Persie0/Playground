package p000;

import android.content.Intent;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.googlex.gcam.StaticMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dsu implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12515a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12516b;

    public /* synthetic */ dsu(cvy cvyVar, int i, byte[] bArr) {
        this.f12516b = i;
        this.f12515a = cvyVar;
    }

    public /* synthetic */ dsu(eby ebyVar, int i) {
        this.f12516b = i;
        this.f12515a = ebyVar;
    }

    public /* synthetic */ dsu(eco ecoVar, int i) {
        this.f12516b = i;
        this.f12515a = ecoVar;
    }

    public /* synthetic */ dsu(eja ejaVar, int i) {
        this.f12516b = i;
        this.f12515a = ejaVar;
    }

    public /* synthetic */ dsu(enn ennVar, int i) {
        this.f12516b = i;
        this.f12515a = ennVar;
    }

    public /* synthetic */ dsu(eog eogVar, int i, byte[] bArr) {
        this.f12516b = i;
        this.f12515a = eogVar;
    }

    public /* synthetic */ dsu(epr eprVar, int i) {
        this.f12516b = i;
        this.f12515a = eprVar;
    }

    public /* synthetic */ dsu(epx epxVar, int i) {
        this.f12516b = i;
        this.f12515a = epxVar;
    }

    public /* synthetic */ dsu(epz epzVar, int i) {
        this.f12516b = i;
        this.f12515a = epzVar;
    }

    public /* synthetic */ dsu(eqp eqpVar, int i) {
        this.f12516b = i;
        this.f12515a = eqpVar;
    }

    public /* synthetic */ dsu(esl eslVar, int i) {
        this.f12516b = i;
        this.f12515a = eslVar;
    }

    public /* synthetic */ dsu(euf eufVar, int i) {
        this.f12516b = i;
        this.f12515a = eufVar;
    }

    public /* synthetic */ dsu(eus eusVar, int i) {
        this.f12516b = i;
        this.f12515a = eusVar;
    }

    public /* synthetic */ dsu(AtomicReference atomicReference, int i) {
        this.f12516b = i;
        this.f12515a = atomicReference;
    }

    public /* synthetic */ dsu(jwf jwfVar, int i) {
        this.f12516b = i;
        this.f12515a = jwfVar;
    }

    public /* synthetic */ dsu(jwn jwnVar, int i) {
        this.f12516b = i;
        this.f12515a = jwnVar;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x027a  */
    /* JADX WARN: Code duplicated, block: B:125:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [elx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r11v23, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [hah, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        hye hyeVar;
        iay iayVar = null;
        switch (this.f12516b) {
            case 0:
                ((AtomicReference) ((cvy) this.f12515a).f9844a).set(((dci) obj).m5923a());
                return;
            case 1:
                ((AtomicReference) this.f12515a).set((ikw) obj);
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                eby ebyVar = (eby) this.f12515a;
                if (!((Boolean) ebyVar.f13317c.f34942d).booleanValue()) {
                    ebyVar.f13315a.mo3415bf(false);
                    return;
                } else {
                    if (bool.equals(((jwf) ebyVar.f13315a).f34942d) || ebyVar.f13318d) {
                        return;
                    }
                    ebyVar.f13315a.mo3415bf(bool);
                    return;
                }
            case 3:
                Object obj2 = this.f12515a;
                igp igpVar = (igp) obj;
                HashMap map = new HashMap();
                for (Face face : (Face[]) igpVar.f30851c) {
                    Long l = (Long) ((eco) obj2).f13391b.get(Integer.valueOf(face.getId()));
                    map.put(Integer.valueOf(face.getId()), Long.valueOf((l != null ? l.longValue() : 0L) + igpVar.f30849a));
                }
                ((eco) obj2).f13391b = map;
                return;
            case 4:
                Object obj3 = this.f12515a;
                if (((Boolean) obj).booleanValue()) {
                    eja ejaVar = (eja) obj3;
                    if (cds.m3518q(ejaVar.f14234K)) {
                        ejaVar.m7387f();
                        if (ejaVar.f14234K.m2611e() != null) {
                            Intent intentM2611e = ejaVar.f14234K.m2611e();
                            intentM2611e.getClass();
                            cds.m3507f(intentM2611e);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Object obj4 = this.f12515a;
                if (((Boolean) obj).booleanValue()) {
                    ((enn) obj4).f14764a.startJupiterSession();
                    return;
                } else {
                    ((enn) obj4).f14764a.exitJupiterSession();
                    return;
                }
            case 6:
                Object obj5 = this.f12515a;
                if (!((dci) obj).m5924b()) {
                    ((enn) obj5).f14768e.m7868a();
                    return;
                }
                enn ennVar = (enn) obj5;
                etn etnVar = ennVar.f14768e;
                View viewM7563a = ennVar.m7563a();
                if (((Boolean) etnVar.f19838c.mo10031c(gzy.f27016aA)).booleanValue()) {
                    return;
                }
                int iIntValue = ((Integer) etnVar.f19838c.mo10031c(gzy.f27041ay)).intValue();
                int i = 3;
                if (iIntValue >= 3 || viewM7563a.getVisibility() != 0) {
                    return;
                }
                etnVar.m7868a();
                igt igtVar = new igt(viewM7563a.getResources().getString(C0100R.string.jupiter_entry_hint));
                igtVar.m11313q(viewM7563a);
                igtVar.mo11305i();
                igtVar.mo11307k();
                igtVar.f30869d = 1000;
                igtVar.f30872g = true;
                igtVar.mo11308l();
                igtVar.mo11302f(new elu(etnVar, i, null == true ? 1 : 0, null == true ? 1 : 0), not.INSTANCE);
                igtVar.f30874i = etnVar.f19837b;
                igtVar.f30878m = 4;
                igtVar.f30871f = true;
                etnVar.f19839d = igtVar.mo11297a();
                etnVar.f19836a.mo10033e(gzy.f27041ay, Integer.valueOf(iIntValue + 1));
                return;
            case 7:
                ((jwf) this.f12515a).mo3415bf(false);
                return;
            case 8:
                this.f12515a.mo3831be();
                return;
            case 9:
                ((epr) this.f12515a).f15028q = (eqz) obj;
                return;
            case 10:
                eqz eqzVar = (eqz) obj;
                epx epxVar = (epx) this.f12515a;
                for (iay iayVar2 : epxVar.f15059c.f30188j) {
                    if (((eqz) iayVar2.f30189a).equals(eqzVar)) {
                        iayVar = iayVar2;
                        if (iayVar == null) {
                            epxVar.mo7657d();
                            return;
                        } else {
                            epxVar.f15058b.m4384b().m4381k(epxVar.f15058b.m4384b().m4377b(iayVar));
                            return;
                        }
                    }
                }
                if (iayVar == null) {
                    epxVar.mo7657d();
                    return;
                } else {
                    epxVar.f15058b.m4384b().m4381k(epxVar.f15058b.m4384b().m4377b(iayVar));
                    return;
                }
            case 11:
                Object obj6 = this.f12515a;
                List list = (List) obj;
                gzq gzqVar = (gzq) list.get(0);
                epz epzVar = (epz) obj6;
                StaticMetadata staticMetadata = (StaticMetadata) epzVar.f15076i.get((String) list.get(1));
                int i2 = gzqVar.f26965d;
                if (staticMetadata == null) {
                    staticMetadata = new StaticMetadata();
                }
                epzVar.f15070c.m7681f(new RunnableC0904pi(epzVar, staticMetadata, i2, 9));
                return;
            case 12:
                Object obj7 = this.f12515a;
                Float f = (Float) obj;
                synchronized (obj7) {
                    ((eqp) obj7).f15204d = f;
                    break;
                }
                return;
            case 13:
                Object obj8 = this.f12515a;
                if (((fnb) obj).f22777c) {
                    chm chmVar = ((esl) obj8).f15411o;
                    lku.m15662p(chmVar);
                    ikw ikwVar = ikw.UNINITIALIZED;
                    chmVar.mo3724n();
                    return;
                }
                return;
            case 14:
                Object obj9 = this.f12515a;
                fvu fvuVar = ((dci) obj).f10511c;
                if (fvuVar.mo14558k() == kmq.BACK) {
                    ((esl) obj9).f15397b.resetCameraSwitch(false);
                } else {
                    ((esl) obj9).f15397b.resetCameraSwitch(true);
                }
                esl eslVar = (esl) obj9;
                eslVar.f15417u.mo9111J(fvuVar);
                ite iteVar = (ite) eslVar.f15334P;
                boolean z = (iteVar.f32055F == fvuVar.mo14558k() && iteVar.f32077aa == fvuVar.mo14549b()) ? iteVar.f32067R != (fvuVar.mo14544M() && fvuVar.mo14535D()) : true;
                if (iteVar.f32055F != fvuVar.mo14558k()) {
                    iteVar.f32065P.f32000e = false;
                }
                iteVar.f32055F = fvuVar.mo14558k();
                iteVar.f32067R = fvuVar.mo14544M() && fvuVar.mo14535D();
                if (z) {
                    if (iteVar.f32099d.mo6184l(dib.f11276aj)) {
                        iteVar.f32065P.m11707f();
                        iteVar.mo11763n();
                    }
                    if (iteVar.f32110o.mo3831be() != ikw.PORTRAIT) {
                        iteVar.mo11725F(fvuVar.mo14550c());
                    }
                    if (iteVar.f32099d.mo6184l(dib.f11285as)) {
                        iteVar.f32119x.set(true);
                    } else {
                        iteVar.mo11774y();
                        iteVar.mo11721B(false);
                    }
                }
                if (eslVar.f15338T.mo16813g()) {
                    ((clc) eslVar.f15338T.mo16809c()).mo3868F(fvuVar);
                    return;
                }
                return;
            case 15:
                hyd hydVar = (hyd) obj;
                esl eslVar2 = (esl) this.f12515a;
                if (eslVar2.f15409m.mo6184l(dib.f11307bN)) {
                    if (hydVar.f29901a.equals(hye.JARVIS) || ((hyeVar = eslVar2.f15319A) != null && hyeVar.equals(hye.JARVIS))) {
                        MainActivityLayout mainActivityLayout = eslVar2.f15410n.f31066c;
                        mainActivityLayout.invalidate();
                        mainActivityLayout.requestLayout();
                    }
                    eslVar2.f15319A = hydVar.f29901a;
                    return;
                }
                return;
            case 16:
                gzp gzpVar = (gzp) obj;
                euf eufVar = (euf) this.f12515a;
                eufVar.f20002i.mo11227ai(gzpVar);
                if (eufVar.f19968ac.mo6184l(dib.f11357ck) && eufVar.f19920G.m10885h()) {
                    ((nbe) ((nbe) euf.f19913b.m17252c()).mo17276G((char) 1922)).mo17293r("Switch Hotshot due to timer changed to %s", gzpVar);
                    if (gzpVar.equals(gzp.OFF)) {
                        eufVar.f19998e.execute(new esc(eufVar, 11));
                        return;
                    } else {
                        eufVar.f19920G.m10883f();
                        return;
                    }
                }
                return;
            case 17:
                ((euf) this.f12515a).m7892B(((Boolean) obj).booleanValue());
                return;
            case 18:
                Object obj10 = this.f12515a;
                if (!((Boolean) obj).booleanValue()) {
                    ((euf) obj10).f19982aq.m9705c();
                    return;
                }
                gsh gshVar = ((euf) obj10).f19982aq;
                gshVar.f26218b = SystemClock.uptimeMillis();
                gsm gsmVar = gshVar.f26217a;
                lku.m15662p(gsmVar);
                gsmVar.mo9699a();
                gshVar.m9707e();
                gshVar.m9708f();
                return;
            case 19:
                Object obj11 = this.f12515a;
                gzp gzpVar2 = (gzp) obj;
                if (gzp.OFF.equals(gzpVar2)) {
                    eus eusVar = (eus) obj11;
                    eusVar.f20201s.mo11227ai(gzpVar2);
                    if (eusVar.f20146H) {
                        eusVar.f20201s.mo11235g();
                    }
                } else {
                    eus eusVar2 = (eus) obj11;
                    if (eusVar2.f20146H) {
                        eusVar2.f20201s.mo11238j();
                    }
                    eusVar2.f20201s.mo11227ai(gzpVar2);
                }
                eus eusVar3 = (eus) obj11;
                if (eusVar3.f20199q.mo6184l(dib.f11357ck) && eusVar3.f20142D.m10885h()) {
                    ((nbe) ((nbe) eus.f20137b.m17252c()).mo17276G((char) 1950)).mo17293r("Switch Hotshot due to timer changed to %s", gzpVar2);
                    if (gzpVar2.equals(gzp.OFF)) {
                        eusVar3.f20142D.m10882e();
                        return;
                    } else {
                        eusVar3.f20142D.m10883f();
                        return;
                    }
                }
                return;
            default:
                ((eus) ((eog) this.f12515a).f14852a).m7915y(((Boolean) obj).booleanValue());
                return;
        }
    }
}
