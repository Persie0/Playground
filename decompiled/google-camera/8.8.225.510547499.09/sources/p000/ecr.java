package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ecr implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f13395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13396b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f13397c;

    public /* synthetic */ ecr(Gcam gcam, eet eetVar, int i) {
        this.f13397c = i;
        this.f13395a = gcam;
        this.f13396b = eetVar;
    }

    public /* synthetic */ ecr(dar darVar, gfa gfaVar, int i) {
        this.f13397c = i;
        this.f13396b = darVar;
        this.f13395a = gfaVar;
    }

    public /* synthetic */ ecr(eax eaxVar, jww jwwVar, int i) {
        this.f13397c = i;
        this.f13396b = eaxVar;
        this.f13395a = jwwVar;
    }

    public /* synthetic */ ecr(ffo ffoVar, kfo kfoVar, int i) {
        this.f13397c = i;
        this.f13396b = ffoVar;
        this.f13395a = kfoVar;
    }

    public /* synthetic */ ecr(fmz fmzVar, jwn jwnVar, int i) {
        this.f13397c = i;
        this.f13396b = fmzVar;
        this.f13395a = jwnVar;
    }

    public /* synthetic */ ecr(gda gdaVar, kbg kbgVar, int i) {
        this.f13397c = i;
        this.f13396b = gdaVar;
        this.f13395a = kbgVar;
    }

    public /* synthetic */ ecr(gdw gdwVar, drj drjVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13397c = i;
        this.f13395a = gdwVar;
        this.f13396b = drjVar;
    }

    public /* synthetic */ ecr(geo geoVar, gev gevVar, int i) {
        this.f13397c = i;
        this.f13396b = geoVar;
        this.f13395a = gevVar;
    }

    public /* synthetic */ ecr(gga ggaVar, gfa gfaVar, int i) {
        this.f13397c = i;
        this.f13395a = ggaVar;
        this.f13396b = gfaVar;
    }

    public /* synthetic */ ecr(glu gluVar, kfk kfkVar, int i) {
        this.f13397c = i;
        this.f13396b = gluVar;
        this.f13395a = kfkVar;
    }

    public /* synthetic */ ecr(Map map, jwf jwfVar, int i) {
        this.f13397c = i;
        this.f13395a = map;
        this.f13396b = jwfVar;
    }

    public /* synthetic */ ecr(AtomicBoolean atomicBoolean, oju ojuVar, int i) {
        this.f13397c = i;
        this.f13396b = atomicBoolean;
        this.f13395a = ojuVar;
    }

    public /* synthetic */ ecr(Predicate predicate, gfa gfaVar, int i) {
        this.f13397c = i;
        this.f13395a = predicate;
        this.f13396b = gfaVar;
    }

    public /* synthetic */ ecr(jww jwwVar, idg idgVar, int i) {
        this.f13397c = i;
        this.f13395a = jwwVar;
        this.f13396b = idgVar;
    }

    public /* synthetic */ ecr(kbo kboVar, gbi gbiVar, int i) {
        this.f13397c = i;
        this.f13395a = kboVar;
        this.f13396b = gbiVar;
    }

    public /* synthetic */ ecr(kfk kfkVar, gmh gmhVar, int i) {
        this.f13397c = i;
        this.f13395a = kfkVar;
        this.f13396b = gmhVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a9 A[Catch: all -> 0x02b4, InterruptedException | ExecutionException -> 0x02b6, InterruptedException -> 0x02b8, TryCatch #1 {all -> 0x02b4, blocks: (B:74:0x01e0, B:75:0x01ee, B:77:0x0211, B:80:0x0217, B:82:0x0220, B:84:0x022a, B:86:0x022f, B:88:0x0239, B:103:0x02a6, B:105:0x02ab, B:94:0x024d, B:96:0x027c, B:98:0x028d, B:100:0x0297, B:104:0x02a9, B:113:0x02b9), top: B:139:0x01de }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kfo] */
    /* JADX WARN: Type inference failed for: r1v27, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r1v41, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v45, types: [gmh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ecq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ecq, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        ees eesVar;
        float[] fArr;
        int i = 6;
        switch (this.f13397c) {
            case 0:
                Object obj2 = this.f13395a;
                Object obj3 = this.f13396b;
                kbc kbcVar = ect.f13400b;
                ((Gcam) obj2).m4974d(((eet) obj3).mo6051a());
                return;
            case 1:
                Object obj4 = this.f13396b;
                ?? r1 = this.f13395a;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((dar) obj4).m5838t(r1);
                return;
            case 2:
                Object obj5 = this.f13395a;
                Object obj6 = this.f13396b;
                kbc kbcVar2 = ect.f13400b;
                ((Gcam) obj5).m4974d(((eet) obj6).mo6051a());
                return;
            case 3:
                Object obj7 = this.f13396b;
                ?? r2 = this.f13395a;
                float fFloatValue = ((Float) obj).floatValue();
                r2.mo3415bf(Boolean.valueOf(fFloatValue != -999.0f && fFloatValue < (((Boolean) r2.mo3831be()).booleanValue() ? ((eax) obj7).f13148b : ((eax) obj7).f13147a)));
                return;
            case 4:
                Object obj8 = this.f13395a;
                Object obj9 = this.f13396b;
                fxn fxnVar = (fxn) obj;
                nps npsVarM8924k = fxnVar.m8924k();
                try {
                    try {
                        if (npsVarM8924k == null) {
                            ((jwf) ((gdw) obj8).f24346a).mo3415bf(ees.UNKNOWN);
                        } else {
                            Object obj10 = ((gdw) obj8).f24346a;
                            kpp kppVar = (kpp) npsVarM8924k.get();
                            gdb gdbVar = (gdb) ((drj) obj9).f12395a.mo3831be();
                            if (((jvb) ((drj) obj9).f12398d).mo8995b() || gdbVar == gdb.OFF) {
                                eesVar = ees.OFF;
                            } else if (ivu.f32373a == null || (fArr = (float[]) kppVar.mo9517d(ivu.f32373a)) == null || fArr.length < 13) {
                                edl edlVarMo7138e = ((drj) obj9).f12396b.mo7138e(fxnVar, kppVar, ((Boolean) ((eby) ((drj) obj9).f12397c).f13316b.mo3831be()).booleanValue(), new kbc(fxnVar.mo7247c(), fxnVar.mo7246b()));
                                if (edlVarMo7138e.f13499e >= 140.0f) {
                                    AeResults aeResultsMo7139f = ((drj) obj9).f12396b.mo7139f(edlVarMo7138e);
                                    if (GcamModuleJNI.AeResults_Check(aeResultsMo7139f.f8224a, aeResultsMo7139f)) {
                                        float fAeResults_LogSceneBrightness = GcamModuleJNI.AeResults_LogSceneBrightness(aeResultsMo7139f.f8224a, aeResultsMo7139f);
                                        if (fAeResults_LogSceneBrightness != -999.0f) {
                                            ((drj) obj9).f12399e.mo3415bf(Float.valueOf(fAeResults_LogSceneBrightness));
                                        }
                                        if (fAeResults_LogSceneBrightness < -2.86f) {
                                            eesVar = ees.ON;
                                        }
                                    }
                                }
                                eesVar = ees.OFF;
                            } else {
                                float f = fArr[12];
                                float f2 = fArr[6];
                                if (f2 != -999.0f) {
                                    ((drj) obj9).f12399e.mo3415bf(Float.valueOf(f2));
                                }
                                if (f <= 140.0f || f2 >= -2.86f) {
                                    eesVar = ees.OFF;
                                } else {
                                    eesVar = ees.ON;
                                }
                            }
                            ((jwf) obj10).mo3415bf(eesVar);
                        }
                    } catch (Throwable th) {
                        fxnVar.close();
                        throw th;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    ((jwf) ((gdw) obj8).f24346a).mo3415bf(ees.UNKNOWN);
                }
                fxnVar.close();
                return;
            case 5:
                ?? r0 = this.f13395a;
                Object obj11 = this.f13396b;
                if (ehi.m7322d((ikw) r0.mo3831be())) {
                    return;
                }
                ((idg) obj11).m11114b();
                return;
            case 6:
                Object obj12 = this.f13396b;
                ?? r3 = this.f13395a;
                if (!((Boolean) obj).booleanValue() || ((AtomicBoolean) obj12).getAndSet(true)) {
                    return;
                }
                ((epz) r3.get()).m7668a();
                return;
            case 7:
                Object obj13 = this.f13396b;
                ?? r4 = this.f13395a;
                if (((Boolean) obj).booleanValue()) {
                    r4.close();
                    ((ffo) obj13).f21710c.set(false);
                    return;
                }
                return;
            case 8:
                ?? r5 = this.f13395a;
                ?? r6 = this.f13396b;
                if (r5.test(r6)) {
                    r6.mo9129o(false, gev.MICROVIDEO);
                    return;
                }
                return;
            case 9:
                fmz fmzVar = (fmz) this.f13396b;
                fmzVar.f22756c.mo3415bf(Boolean.valueOf(fmzVar.m8597a((hyd) obj, ((Integer) this.f13395a.mo3831be()).intValue())));
                return;
            case 10:
                fmz fmzVar2 = (fmz) this.f13396b;
                fmzVar2.f22756c.mo3415bf(Boolean.valueOf(fmzVar2.m8597a((hyd) fmzVar2.f22754a.mo3831be(), ((Integer) this.f13395a.mo3831be()).intValue())));
                return;
            case 11:
                this.f13395a.mo13940b("ImageCaptureCommand: availability=" + ((Boolean) obj) + " rootCommand=" + String.valueOf(this.f13396b));
                return;
            case 12:
                Object obj14 = this.f13396b;
                ?? r7 = this.f13395a;
                gcy gcyVar = (gcy) obj;
                if (((gda) obj14).f24260a.mo14558k() == kmq.BACK) {
                    r7.mo3415bf(gcyVar);
                    return;
                }
                return;
            case 13:
                Object obj15 = this.f13396b;
                ?? r8 = this.f13395a;
                gcy gcyVar2 = (gcy) obj;
                if (((gda) obj15).f24260a.mo14558k() == kmq.f36557a) {
                    r8.mo3415bf(gcyVar2);
                    return;
                }
                return;
            case 14:
                Object obj16 = this.f13396b;
                Object obj17 = this.f13395a;
                gfc gfcVar = (gfc) obj;
                if (gfcVar.equals(gfc.UNKNOWN)) {
                    ((nbe) ((nbe) geo.f24397a.m17252c()).mo17276G((char) 2601)).mo17293r("Property value %s is not associated with a MenuOption.", gfcVar);
                }
                OptionsMenuView optionsMenuView = ((geo) obj16).f24404h;
                synchronized (optionsMenuView) {
                    Collection$EL.stream(optionsMenuView.f6842b).filter(new gek((gev) obj17, gfcVar, i)).forEach(new fvi(gfcVar, 15));
                    break;
                }
                return;
            case 15:
                ?? r9 = this.f13395a;
                ?? r10 = this.f13396b;
                nbh nbhVar = gfy.f24631a;
                if (r9.test(r10)) {
                    r10.mo9129o(false, gev.f24452l);
                    return;
                }
                return;
            case 16:
                ?? r11 = this.f13395a;
                ?? r12 = this.f13396b;
                nbh nbhVar2 = gfy.f24631a;
                if (r11.test(r12)) {
                    r12.mo9129o(false, gev.f24452l);
                    return;
                }
                return;
            case 17:
                Object obj18 = this.f13395a;
                ?? r13 = this.f13396b;
                if (((gga) obj18).mo5778n(r13)) {
                    r13.mo9129o(false, gev.TIMER);
                    return;
                }
                return;
            case 18:
                Object obj19 = this.f13396b;
                ?? r14 = this.f13395a;
                Integer num = (Integer) obj;
                if (((glu) obj19).mo9467k()) {
                    return;
                }
                r14.mo14121h(kgq.m14215e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num));
                return;
            case 19:
                this.f13395a.mo14123j(this.f13396b.mo9506d((gmg) obj));
                return;
            default:
                ?? r15 = this.f13395a;
                Object obj20 = this.f13396b;
                List list = (List) obj;
                String str = (String) list.get(0);
                Boolean bool = (Boolean) list.get(1);
                String strValueOf = String.valueOf(str);
                if (bool != null && !bool.booleanValue()) {
                    String strConcat = strValueOf.concat("_t");
                    if (r15.containsKey(strConcat)) {
                        str = strConcat;
                    }
                }
                ((jwf) obj20).mo3415bf(str);
                return;
        }
    }
}
