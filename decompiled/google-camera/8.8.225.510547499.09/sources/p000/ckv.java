package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ckv implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6016a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6017b;

    public /* synthetic */ ckv(ckw ckwVar, int i) {
        this.f6017b = i;
        this.f6016a = ckwVar;
    }

    public /* synthetic */ ckv(clh clhVar, int i) {
        this.f6017b = i;
        this.f6016a = clhVar;
    }

    public /* synthetic */ ckv(clo cloVar, int i) {
        this.f6017b = i;
        this.f6016a = cloVar;
    }

    public /* synthetic */ ckv(cmg cmgVar, int i) {
        this.f6017b = i;
        this.f6016a = cmgVar;
    }

    public /* synthetic */ ckv(cms cmsVar, int i) {
        this.f6017b = i;
        this.f6016a = cmsVar;
    }

    public /* synthetic */ ckv(cqv cqvVar, int i) {
        this.f6017b = i;
        this.f6016a = cqvVar;
    }

    public /* synthetic */ ckv(crl crlVar, int i) {
        this.f6017b = i;
        this.f6016a = crlVar;
    }

    public /* synthetic */ ckv(csm csmVar, int i) {
        this.f6017b = i;
        this.f6016a = csmVar;
    }

    public /* synthetic */ ckv(cso csoVar, int i) {
        this.f6017b = i;
        this.f6016a = csoVar;
    }

    public /* synthetic */ ckv(cva cvaVar, int i) {
        this.f6017b = i;
        this.f6016a = cvaVar;
    }

    public /* synthetic */ ckv(cvn cvnVar, int i) {
        this.f6017b = i;
        this.f6016a = cvnVar;
    }

    public /* synthetic */ ckv(jww jwwVar, int i) {
        this.f6017b = i;
        this.f6016a = jwwVar;
    }

    public /* synthetic */ ckv(kfk kfkVar, int i) {
        this.f6017b = i;
        this.f6016a = kfkVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kfk] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        switch (this.f6017b) {
            case 0:
                Object obj2 = this.f6016a;
                if (((Boolean) obj).booleanValue()) {
                    ckw ckwVar = (ckw) obj2;
                    if (((Boolean) ckwVar.f6043b.m7093d().mo3831be()).booleanValue()) {
                        ckwVar.m3887r();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ckw) this.f6016a).m3894y();
                return;
            case 2:
                Object obj3 = this.f6016a;
                if (!((Boolean) obj).booleanValue()) {
                    ckw ckwVar2 = (ckw) obj3;
                    ckwVar2.mo3879j();
                    ckwVar2.m3880k();
                    return;
                } else {
                    ckw ckwVar3 = (ckw) obj3;
                    ckwVar3.m3884o(true, true);
                    ckwVar3.m3887r();
                    ckwVar3.m3886q(ckwVar3.f6058q);
                    return;
                }
            case 3:
                Boolean bool = (Boolean) obj;
                BaseCurator baseCurator = ((clh) this.f6016a).f6113m;
                if (baseCurator != null) {
                    baseCurator.mo4037b(bool.booleanValue());
                    return;
                }
                return;
            case 4:
                ((clo) this.f6016a).f6150d = false;
                return;
            case 5:
                Float f = (Float) obj;
                cmg cmgVar = (cmg) this.f6016a;
                if (cmgVar.f6220d) {
                    cmgVar.f6219c.m4039a(f.floatValue());
                    return;
                }
                return;
            case 6:
                Object obj4 = this.f6016a;
                dci dciVar = (dci) obj;
                synchronized (obj4) {
                    if (dciVar.m5923a() != ((cms) obj4).f6312a) {
                        ((cms) obj4).f6312a = dciVar.m5923a();
                        ((cms) obj4).f6314c = dciVar.f10511c;
                        ((cms) obj4).f6315d = new oyo(((cms) obj4).f6314c.mo14553f());
                    }
                    break;
                }
                return;
            case 7:
                ((cqv) this.f6016a).m5383c();
                return;
            case 8:
                Object obj5 = this.f6016a;
                if (((gzo) obj).equals(gzo.ON)) {
                    crl crlVar = (crl) obj5;
                    if (crlVar.f9127b.mo16813g()) {
                        crlVar.m5422j((hiu) crlVar.f9127b.mo16809c());
                        return;
                    }
                    return;
                }
                return;
            case 9:
                this.f6016a.mo3415bf((Boolean) obj);
                return;
            case 10:
                this.f6016a.mo3415bf(true);
                return;
            case 11:
                Object obj6 = this.f6016a;
                if (((csj) obj) == csj.ERROR) {
                    csm csmVar = (csm) obj6;
                    csmVar.f9303a.mo11199G(false);
                    csmVar.f9304b.m11118c(idj.CAPTURE_SESSION_ERROR);
                    return;
                }
                return;
            case 12:
                Object obj7 = this.f6016a;
                synchronized (((cso) obj7).f9365d) {
                    Integer numM5466b = ((cso) obj7).m5466b(((cso) obj7).f9362a.mo9215c());
                    ((cso) obj7).f9363b.mo3415bf(numM5466b);
                    ((cso) obj7).f9364c.mo3415bf(kay.m13889b(numM5466b.intValue()));
                    break;
                }
                return;
            case 13:
                this.f6016a.mo14122i(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj);
                return;
            case 14:
                gmg gmgVar = (gmg) obj;
                this.f6016a.mo14123j(mxk.m17137I(kgq.m14215e(ivw.f32415a, Integer.valueOf(gmgVar.f25591a)), kgq.m14215e(ivw.f32416b, kxk.m14990ah(gmgVar.f25592b))));
                return;
            case 15:
                ?? r0 = this.f6016a;
                kew kewVarMo14115b = r0.mo14115b();
                ((kgo) kewVarMo14115b).f35935f = (Integer) obj;
                r0.mo14127n(kewVarMo14115b.mo14090a());
                return;
            case 16:
                ?? r1 = this.f6016a;
                int i = true == ((Boolean) obj).booleanValue() ? 2 : 0;
                kew kewVarMo14115b2 = r1.mo14115b();
                ((kgo) kewVarMo14115b2).f35936g = Integer.valueOf(i);
                r1.mo14127n(kewVarMo14115b2.mo14090a());
                return;
            case 17:
                ?? r2 = this.f6016a;
                gef gefVar = (gef) obj;
                r2.mo14122i(CaptureRequest.SCALER_CROP_REGION, gefVar.f24363a);
                r2.mo14122i(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(gefVar.f24365c));
                return;
            case 18:
                Object obj8 = this.f6016a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                synchronized (((cva) obj8).f9751e) {
                    if (((cva) obj8).f9754h) {
                        return;
                    }
                    if (zBooleanValue) {
                        ((cva) obj8).m5558a(((cva) obj8).f9752f.m10006c(gyy.EXT_BLUETOOTH));
                    } else {
                        ((cva) obj8).m5559b();
                    }
                    return;
                }
            case 19:
                Object obj9 = this.f6016a;
                synchronized (((cva) obj9).f9751e) {
                    if (((cva) obj9).f9754h) {
                        return;
                    }
                    String strM10006c = ((cva) obj9).f9752f.m10006c(gyy.EXT_BLUETOOTH);
                    if (((cva) obj9).f9753g && ((gzn) ((cva) obj9).f9752f.f26912a.mo3831be()).equals(gzn.EXT_BLUETOOTH) && !strM10006c.isEmpty()) {
                        ((cva) obj9).m5558a(strM10006c);
                    }
                    return;
                }
            default:
                Long l = (Long) obj;
                cvn cvnVar = (cvn) this.f6016a;
                if (cvnVar.f9800c) {
                    cvnVar.f9800c = false;
                    return;
                } else {
                    cvnVar.f9799b.compareAndSet(-1L, l.longValue());
                    return;
                }
        }
    }
}
