package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;
import android.media.AudioRouting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cdb implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5259b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f5260c;

    public /* synthetic */ cdb(cch cchVar, fcp fcpVar, int i) {
        this.f5260c = i;
        this.f5259b = cchVar;
        this.f5258a = fcpVar;
    }

    public /* synthetic */ cdb(cdd cddVar, PointF pointF, int i) {
        this.f5260c = i;
        this.f5258a = cddVar;
        this.f5259b = pointF;
    }

    public /* synthetic */ cdb(ckw ckwVar, gcx gcxVar, int i) {
        this.f5260c = i;
        this.f5259b = ckwVar;
        this.f5258a = gcxVar;
    }

    public /* synthetic */ cdb(ckw ckwVar, ikw ikwVar, int i) {
        this.f5260c = i;
        this.f5259b = ckwVar;
        this.f5258a = ikwVar;
    }

    public /* synthetic */ cdb(ckx ckxVar, ikw ikwVar, int i) {
        this.f5260c = i;
        this.f5259b = ckxVar;
        this.f5258a = ikwVar;
    }

    public /* synthetic */ cdb(clo cloVar, jww jwwVar, int i) {
        this.f5260c = i;
        this.f5259b = cloVar;
        this.f5258a = jwwVar;
    }

    public /* synthetic */ cdb(csl cslVar, kfk kfkVar, int i) {
        this.f5260c = i;
        this.f5259b = cslVar;
        this.f5258a = kfkVar;
    }

    public /* synthetic */ cdb(csm csmVar, jww jwwVar, int i) {
        this.f5260c = i;
        this.f5259b = csmVar;
        this.f5258a = jwwVar;
    }

    public /* synthetic */ cdb(csn csnVar, kfk kfkVar, int i) {
        this.f5260c = i;
        this.f5259b = csnVar;
        this.f5258a = kfkVar;
    }

    public /* synthetic */ cdb(cvg cvgVar, AudioRouting audioRouting, int i) {
        this.f5260c = i;
        this.f5258a = cvgVar;
        this.f5259b = audioRouting;
    }

    public /* synthetic */ cdb(czz czzVar, gfa gfaVar, int i) {
        this.f5260c = i;
        this.f5259b = czzVar;
        this.f5258a = gfaVar;
    }

    public /* synthetic */ cdb(dal dalVar, gfa gfaVar, int i) {
        this.f5260c = i;
        this.f5259b = dalVar;
        this.f5258a = gfaVar;
    }

    public /* synthetic */ cdb(dar darVar, gfa gfaVar, int i) {
        this.f5260c = i;
        this.f5259b = darVar;
        this.f5258a = gfaVar;
    }

    public /* synthetic */ cdb(dfn dfnVar, kfk kfkVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5260c = i;
        this.f5259b = dfnVar;
        this.f5258a = kfkVar;
    }

    public /* synthetic */ cdb(Predicate predicate, gfa gfaVar, int i) {
        this.f5260c = i;
        this.f5258a = predicate;
        this.f5259b = gfaVar;
    }

    public /* synthetic */ cdb(jww jwwVar, jww jwwVar2, int i) {
        this.f5260c = i;
        this.f5259b = jwwVar;
        this.f5258a = jwwVar2;
    }

    public /* synthetic */ cdb(kfk kfkVar, csl cslVar, int i) {
        this.f5260c = i;
        this.f5258a = kfkVar;
        this.f5259b = cslVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.media.AudioRouting, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r9v53, types: [dhv, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        int i = 1;
        int i2 = 1;
        boolean z = false;
        z = false;
        switch (this.f5260c) {
            case 0:
                Object obj2 = this.f5258a;
                Object obj3 = this.f5259b;
                if (((Boolean) obj).booleanValue()) {
                    ((cdd) obj2).m3485c(mrm.m16829i(obj3));
                    return;
                }
                return;
            case 1:
                Object obj4 = this.f5259b;
                ?? r1 = this.f5258a;
                gzk gzkVarM10013a = gzk.m10013a(((Integer) obj).intValue());
                cch cchVar = (cch) obj4;
                gzk gzkVar = cchVar.f5128c;
                if (gzkVarM10013a == gzkVar) {
                    return;
                }
                r1.mo8172aq(gzkVar.m10014b(), gzkVarM10013a.m10014b(), cchVar.f5127b, cchVar.f5126a);
                cchVar.f5128c = gzkVarM10013a;
                return;
            case 2:
                gzp gzpVar = (gzp) obj;
                ckw ckwVar = (ckw) this.f5259b;
                boolean zM3851C = ckw.m3851C((gcy) ((jxc) this.f5258a).mo3831be(), gzpVar, ((Boolean) ckwVar.f6051j.m10476a().mo3831be()).booleanValue());
                ckwVar.f6046e.mo3415bf(Boolean.valueOf(zM3851C));
                if (!zM3851C && ckwVar.m3865B()) {
                    z = true;
                }
                ckwVar.f6058q = z;
                ckwVar.m3867E(gzpVar, ((Boolean) ckwVar.f6051j.m10476a().mo3831be()).booleanValue(), 1);
                return;
            case 3:
                Object obj5 = this.f5259b;
                Object obj6 = this.f5258a;
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                cle cleVar = (cle) list.get(1);
                cleVar.name();
                ((ckw) obj5).f6055n.mo10831t(ckw.m3852H(zBooleanValue, cleVar, (ikw) obj6));
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ckw ckwVar2 = (ckw) this.f5259b;
                boolean zM3851C2 = ckw.m3851C((gcy) ((jxc) this.f5258a).mo3831be(), (gzp) ckwVar2.f6049h.mo3831be(), bool.booleanValue());
                ckwVar2.f6046e.mo3415bf(Boolean.valueOf(zM3851C2));
                ckwVar2.f6058q = !zM3851C2 && ckwVar2.m3865B();
                ckwVar2.m3867E((gzp) ckwVar2.f6049h.mo3831be(), bool.booleanValue(), 2);
                return;
            case 5:
                Object obj7 = this.f5259b;
                Boolean bool2 = (Boolean) obj;
                ikw ikwVar = (ikw) this.f5258a;
                if (ikwVar.equals(ikw.PHOTO) && ((ffl) ((ckx) obj7).f6070d.get()).f21669o) {
                    return;
                }
                if (!bool2.booleanValue()) {
                    ckx ckxVar = (ckx) obj7;
                    if (ckxVar.f6067a.m10792e()) {
                        return;
                    }
                    ckxVar.f6069c.mo11224af(ikwVar);
                    return;
                }
                ckx ckxVar2 = (ckx) obj7;
                switch (ckxVar2.f6071e.ordinal()) {
                    case 1:
                        ckxVar2.f6069c.mo11236h();
                        return;
                    case 6:
                        ckxVar2.f6069c.mo11237i();
                        return;
                    default:
                        throw new IllegalArgumentException("Auto Night Sight shutter is not supported in mode ".concat(String.valueOf(String.valueOf(ckxVar2.f6071e))));
                }
            case 6:
                Object obj8 = this.f5259b;
                ?? r2 = this.f5258a;
                if (((Boolean) obj).booleanValue()) {
                    if (((clo) obj8).f6150d) {
                        r2.mo3415bf(gzp.AUTO);
                        return;
                    }
                    return;
                } else {
                    if (gzp.AUTO.equals(r2.mo3831be())) {
                        r2.mo3415bf(gzp.f26957e);
                        ((clo) obj8).f6150d = true;
                        return;
                    }
                    return;
                }
            case 7:
                this.f5258a.mo3415bf(Boolean.valueOf(((String) obj).equals(((csm) this.f5259b).f9305c)));
                return;
            case 8:
                ?? r0 = this.f5259b;
                ?? r3 = this.f5258a;
                r0.mo3415bf(true);
                r3.mo3415bf(true);
                return;
            case 9:
                ?? r4 = this.f5259b;
                ?? r5 = this.f5258a;
                r4.mo3415bf(true);
                r5.mo3415bf(true);
                return;
            case 10:
                ?? r6 = this.f5259b;
                ?? r7 = this.f5258a;
                r6.mo3415bf(true);
                r7.mo3415bf(true);
                return;
            case 11:
                Object obj9 = this.f5259b;
                ?? r8 = this.f5258a;
                List list2 = (List) obj;
                if (list2.get(0) == cxk.ACTIVE) {
                    return;
                }
                cxk cxkVar = (cxk) ((csl) obj9).f9280j.mo3831be();
                boolean zBooleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                switch (cxkVar.ordinal()) {
                    case 1:
                    case 2:
                        i2 = true == zBooleanValue2 ? 5 : 0;
                        break;
                    case 3:
                        break;
                    case 4:
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                byte[] bArrArray = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(i2).array();
                Arrays.toString(bArrArray);
                r8.mo14121h(kgq.m14215e(ivv.f32396e, bArrArray));
                return;
            case 12:
                Object obj10 = this.f5259b;
                ?? r9 = this.f5258a;
                csj csjVar = (csj) obj;
                csj csjVar2 = csj.RECORDING_SESSION_ACTIVE;
                CaptureRequest.Key key = ivx.f32443f;
                boolean z2 = csjVar == csjVar2;
                if (key == null) {
                    r9.mo14122i(ivv.f32404m, Boolean.valueOf(z2));
                    return;
                }
                dfn dfnVar = (dfn) obj10;
                ?? r10 = dfnVar.f10792e;
                dhx dhxVar = dhh.f11074a;
                r10.mo6177e();
                if (z2) {
                    dfnVar.f10792e.mo6177e();
                } else {
                    i = 0;
                }
                r9.mo14122i(ivx.f32443f, Integer.valueOf(i));
                r9.mo14122i(ivt.f32365s, false);
                return;
            case 13:
                ?? r11 = this.f5258a;
                Object obj11 = this.f5259b;
                r11.mo14122i(CaptureRequest.CONTROL_ZOOM_RATIO, (Float) obj);
                r11.mo14122i(CaptureRequest.SCALER_CROP_REGION, ((gef) ((csl) obj11).f9290t.mo3831be()).f24364b);
                return;
            case 14:
                this.f5258a.mo14122i(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf((((csn) this.f5259b).f9355t && ((Boolean) obj).booleanValue()) ? 2 : 1));
                return;
            case 15:
                ((cvg) this.f5258a).m5565a(this.f5259b);
                return;
            case 16:
                Object obj12 = this.f5259b;
                ?? r12 = this.f5258a;
                if (((czz) obj12).mo5778n(r12)) {
                    r12.mo9129o(false, gev.AMETHYST);
                    return;
                }
                return;
            case 17:
                Object obj13 = this.f5259b;
                ?? r13 = this.f5258a;
                if (((dal) obj13).mo5778n(r13)) {
                    r13.mo9129o(false, gev.FPS);
                    return;
                }
                return;
            case 18:
                ?? r14 = this.f5258a;
                ?? r15 = this.f5259b;
                if (r14.test(r15)) {
                    r15.mo9129o(false, gev.BACK_VIDEO_FLASH);
                    return;
                }
                return;
            case 19:
                Object obj14 = this.f5259b;
                ?? r16 = this.f5258a;
                dar darVar = (dar) obj14;
                darVar.f10293a.m10006c(gyy.EXT_BLUETOOTH);
                Object obj15 = ((jwf) darVar.f10298f).f34942d;
                r16.mo9115b();
                darVar.m5838t(r16);
                if (darVar.m5839w(r16)) {
                    r16.mo9129o(false, gev.MICROPHONE);
                    int i3 = darVar.mo5778n(r16) ? ((mzr) darVar.mo5774j()).f41859c : 0;
                    if (i3 > darVar.f10303k) {
                        if (!((Boolean) darVar.f10294b.mo3831be()).booleanValue()) {
                            Object obj16 = ((jwf) darVar.f10298f).f34942d;
                            darVar.f10293a.m10006c(gyy.EXT_BLUETOOTH);
                            boolean zBooleanValue3 = ((Boolean) ((jwf) darVar.f10298f).f34942d).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) ((jwf) darVar.f10299g).f34942d).booleanValue();
                            synchronized (obj14) {
                                ((dar) obj14).m5837p();
                                if (zBooleanValue3) {
                                    ((dar) obj14).f10296d.m13541c(new dap((dar) obj14, zBooleanValue3, zBooleanValue4, true ? 1 : 0));
                                } else if (zBooleanValue4) {
                                    zBooleanValue4 = true;
                                    ((dar) obj14).f10296d.m13541c(new dap((dar) obj14, zBooleanValue3, zBooleanValue4, true ? 1 : 0));
                                }
                            }
                        } else {
                            Object obj17 = ((jwf) darVar.f10298f).f34942d;
                            darVar.f10293a.m10006c(gyy.EXT_BLUETOOTH);
                        }
                        break;
                    }
                    darVar.f10303k = i3;
                    return;
                }
                return;
            default:
                Object obj18 = this.f5259b;
                ?? r17 = this.f5258a;
                dar darVar2 = (dar) obj18;
                if (darVar2.f10300h) {
                    darVar2.f10300h = false;
                    if (darVar2.mo5778n(r17)) {
                        r17.mo9129o(false, gev.MICROPHONE);
                    }
                }
                darVar2.m5838t(r17);
                return;
        }
    }
}
