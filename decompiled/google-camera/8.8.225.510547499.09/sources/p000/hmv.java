package p000;

import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hmv implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f28362a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28363b;

    public /* synthetic */ hmv(gfa gfaVar, int i) {
        this.f28363b = i;
        this.f28362a = gfaVar;
    }

    public /* synthetic */ hmv(hje hjeVar, int i) {
        this.f28363b = i;
        this.f28362a = hjeVar;
    }

    public /* synthetic */ hmv(hmw hmwVar, int i) {
        this.f28363b = i;
        this.f28362a = hmwVar;
    }

    public /* synthetic */ hmv(hng hngVar, int i) {
        this.f28363b = i;
        this.f28362a = hngVar;
    }

    public /* synthetic */ hmv(hpm hpmVar, int i) {
        this.f28363b = i;
        this.f28362a = hpmVar;
    }

    public /* synthetic */ hmv(hsk hskVar, int i) {
        this.f28363b = i;
        this.f28362a = hskVar;
    }

    public /* synthetic */ hmv(hst hstVar, int i) {
        this.f28363b = i;
        this.f28362a = hstVar;
    }

    public /* synthetic */ hmv(hxy hxyVar, int i) {
        this.f28363b = i;
        this.f28362a = hxyVar;
    }

    public /* synthetic */ hmv(icr icrVar, int i) {
        this.f28363b = i;
        this.f28362a = icrVar;
    }

    public /* synthetic */ hmv(igb igbVar, int i) {
        this.f28363b = i;
        this.f28362a = igbVar;
    }

    public /* synthetic */ hmv(ijq ijqVar, int i) {
        this.f28363b = i;
        this.f28362a = ijqVar;
    }

    public /* synthetic */ hmv(kfk kfkVar, int i) {
        this.f28363b = i;
        this.f28362a = kfkVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v33, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [gfa, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        switch (this.f28363b) {
            case 0:
                Object obj2 = this.f28362a;
                Boolean bool = (Boolean) obj;
                synchronized (obj2) {
                    if (bool.booleanValue() && ((hmw) obj2).f28365b) {
                        ((hmw) obj2).m10479d();
                    }
                    break;
                }
                return;
            case 1:
                hje hjeVar = (hje) this.f28362a;
                if (hjeVar.m10374j()) {
                    View viewMo9114a = hjeVar.f28021b.mo9114a();
                    igt igtVar = new igt(hjeVar.f28020a.getString(C0100R.string.try_speech_enhancement_tooltip));
                    igtVar.m11314r(viewMo9114a);
                    igtVar.mo11305i();
                    igtVar.mo11307k();
                    igtVar.mo11300d(new fff(hjeVar, 4));
                    igtVar.mo11303g(new hfr(hjeVar, 19), hjeVar.f28022c);
                    igtVar.f30869d = 300;
                    igtVar.mo11308l();
                    igtVar.f30870e = 5000;
                    igtVar.f30871f = false;
                    igtVar.f30873h = true;
                    igtVar.f30874i = hjeVar.f28023d;
                    igtVar.f30878m = 4;
                    hjeVar.f28026g = igtVar.mo11297a();
                    return;
                }
                return;
            case 2:
                this.f28362a.mo9129o(false, null);
                return;
            case 3:
                hng hngVar = (hng) this.f28362a;
                hngVar.m10512u(mqu.f41450a, (hno) obj, ((Boolean) hngVar.f28436c.mo3831be()).booleanValue());
                return;
            case 4:
                hng hngVar2 = (hng) this.f28362a;
                hngVar2.m10512u(mqu.f41450a, (hno) hngVar2.f28435b.mo3831be(), ((Boolean) hngVar2.f28436c.mo3831be()).booleanValue());
                return;
            case 5:
                Object obj3 = this.f28362a;
                float fFloatValue = ((Float) obj).floatValue();
                hng hngVar3 = (hng) obj3;
                float fFloatValue2 = ((Float) hngVar3.f28443j.mo6180h(dib.f11352cf).get()).floatValue();
                boolean z = hngVar3.f28451r;
                boolean z2 = fFloatValue > fFloatValue2;
                if (z2 == z) {
                    return;
                }
                hngVar3.f28434a.mo3415bf(z2 ? hnp.OFF : hngVar3.f28459z);
                if (z2) {
                    hngVar3.mo10500i();
                    hngVar3.m10499h();
                    hngVar3.m10496e();
                } else {
                    hngVar3.m10512u(mqu.f41450a, (hno) hngVar3.f28435b.mo3831be(), ((Boolean) hngVar3.f28436c.mo3831be()).booleanValue());
                }
                hngVar3.f28451r = z2;
                return;
            case 6:
                Boolean bool2 = (Boolean) obj;
                hng hngVar4 = (hng) this.f28362a;
                if (hngVar4.f28447n.f6698h.getVisibility() != 0) {
                    return;
                }
                hngVar4.f28447n.m4163u(true != bool2.booleanValue() ? 1.0f : 0.5f);
                return;
            case 7:
                this.f28362a.mo14121h(kgq.m14215e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj));
                return;
            case 8:
                gmg gmgVar = (gmg) obj;
                this.f28362a.mo14123j(mxk.m17137I(kgq.m14215e(ivw.f32415a, Integer.valueOf(gmgVar.f25591a)), kgq.m14215e(ivw.f32416b, kxk.m14990ah(gmgVar.f25592b))));
                return;
            case 9:
                gef gefVar = (gef) obj;
                this.f28362a.mo14123j(jpd.m13438s(gefVar.f24363a, gefVar.f24365c));
                return;
            case 10:
                Object obj4 = this.f28362a;
                if (((Boolean) obj).booleanValue()) {
                    hpm hpmVar = (hpm) obj4;
                    if (cds.m3519r(hpmVar.f28902U)) {
                        hpmVar.m10587e();
                        if (hpmVar.f28902U.m2611e() != null) {
                            Intent intentM2611e = hpmVar.f28902U.m2611e();
                            intentM2611e.getClass();
                            cds.m3507f(intentM2611e);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                hpm hpmVar2 = (hpm) this.f28362a;
                if (hpmVar2.f28925j.f34942d != hor.STATE_IDLE) {
                    return;
                }
                jpd.m13439t(hpmVar2.f28922g, hpmVar2.f28929n, hpmVar2.f28901T, hpmVar2.f28900S);
                ((iig) hpmVar2.f28934s).get().f31068e.m4501m(ikw.TIME_LAPSE, new hpi(hpmVar2, 7));
                return;
            case 12:
                Object obj5 = this.f28362a;
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                hsk hskVar = (hsk) obj5;
                if (hskVar.f29410a.get() != zBooleanValue2) {
                    hskVar.f29410a.set(zBooleanValue2);
                }
                hskVar.f29411b.set(zBooleanValue);
                if (list.size() > 2) {
                    boolean zBooleanValue3 = ((Boolean) list.get(2)).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) list.get(3)).booleanValue();
                    if (hskVar.f29412c.get() != zBooleanValue4) {
                        hskVar.f29412c.set(zBooleanValue4);
                    }
                    hskVar.f29413d.set(zBooleanValue3);
                }
                hskVar.f29414e.mo6481q(hskVar.m10696a());
                if (hskVar.f29415f.mo16813g()) {
                    ((isb) hskVar.f29415f.mo16809c()).mo11668j(hskVar.m10696a());
                    return;
                }
                return;
            case 13:
                Object obj6 = this.f28362a;
                if (Collection$EL.stream((List) obj).allMatch(fjv.f22325s)) {
                    hsk hskVar2 = (hsk) obj6;
                    ArrayList arrayListM16501I = mkv.m16501I(hskVar2.f29414e.mo6465a(), hskVar2.f29414e.mo6467c());
                    if (hskVar2.f29415f.mo16813g()) {
                        arrayListM16501I.add(((isb) hskVar2.f29415f.mo16809c()).mo11660b());
                        arrayListM16501I.add(((isb) hskVar2.f29415f.mo16809c()).mo11661c());
                    }
                    hskVar2.f29416g.m3529i().m13537d(jwr.m13631a(arrayListM16501I).mo3830a(new hmv(hskVar2, 12), not.INSTANCE));
                    return;
                }
                return;
            case 14:
                hst hstVar = (hst) this.f28362a;
                mhc mhcVar = hstVar.f29440d;
                if (mhcVar != null) {
                    if (((hyd) hstVar.f29439c.mo3831be()).f29901a.equals(hye.JARVIS)) {
                        mhcVar.m16369a().f8109e = hstVar.m10704c();
                    } else {
                        mhcVar.m16369a().f8109e = -1;
                        mhcVar.m16369a().m4808C(3);
                    }
                    if (mhcVar.isShowing()) {
                        mhcVar.dismiss();
                        mhcVar.show();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                this.f28362a.mo11227ai((gzp) obj);
                return;
            case 16:
                ((hxy) this.f28362a).m10859j();
                return;
            case 17:
                icr icrVar = (icr) this.f28362a;
                icrVar.m11098x(icrVar.f30375d.f7070k);
                return;
            case 18:
                icr icrVar2 = (icr) this.f28362a;
                icrVar2.m11098x(icrVar2.f30375d.f7070k);
                return;
            case 19:
                Object obj7 = this.f28362a;
                if (((Boolean) obj).booleanValue()) {
                    idg idgVar = ((ijq) obj7).f31215c;
                    if (idgVar.f30444l) {
                        idgVar.f30444l = false;
                        idgVar.f30435c.mo7482d(idgVar.f30442j);
                        return;
                    }
                    return;
                }
                return;
            default:
                Object obj8 = this.f28362a;
                if (((Boolean) obj).booleanValue()) {
                    ijq ijqVar = (ijq) obj8;
                    ijqVar.f31213a.mo6475k();
                    ijqVar.f31213a.mo6477m(false);
                    return;
                }
                return;
        }
    }
}
