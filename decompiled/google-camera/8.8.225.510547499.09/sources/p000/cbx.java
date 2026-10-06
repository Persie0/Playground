package p000;

import android.graphics.PointF;
import java.util.List;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cbx implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f4976a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4977b;

    public /* synthetic */ cbx(cbv cbvVar, int i) {
        this.f4977b = i;
        this.f4976a = cbvVar;
    }

    public /* synthetic */ cbx(cby cbyVar, int i) {
        this.f4977b = i;
        this.f4976a = cbyVar;
    }

    public /* synthetic */ cbx(ccc cccVar, int i) {
        this.f4977b = i;
        this.f4976a = cccVar;
    }

    public /* synthetic */ cbx(ccm ccmVar, int i) {
        this.f4977b = i;
        this.f4976a = ccmVar;
    }

    public /* synthetic */ cbx(cdd cddVar, int i) {
        this.f4977b = i;
        this.f4976a = cddVar;
    }

    public /* synthetic */ cbx(cdj cdjVar, int i) {
        this.f4977b = i;
        this.f4976a = cdjVar;
    }

    public /* synthetic */ cbx(cet cetVar, int i) {
        this.f4977b = i;
        this.f4976a = cetVar;
    }

    public /* synthetic */ cbx(cgm cgmVar, int i) {
        this.f4977b = i;
        this.f4976a = cgmVar;
    }

    public /* synthetic */ cbx(cgp cgpVar, int i) {
        this.f4977b = i;
        this.f4976a = cgpVar;
    }

    public /* synthetic */ cbx(ckt cktVar, int i) {
        this.f4977b = i;
        this.f4976a = cktVar;
    }

    public /* synthetic */ cbx(ckw ckwVar, int i) {
        this.f4977b = i;
        this.f4976a = ckwVar;
    }

    public /* synthetic */ cbx(dmy dmyVar, int i, byte[] bArr) {
        this.f4977b = i;
        this.f4976a = dmyVar;
    }

    public /* synthetic */ cbx(jwf jwfVar, int i) {
        this.f4977b = i;
        this.f4976a = jwfVar;
    }

    public /* synthetic */ cbx(kbg kbgVar, int i) {
        this.f4977b = i;
        this.f4976a = kbgVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [cdj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [cet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r6v31, types: [cgu, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        boolean z = false;
        switch (this.f4977b) {
            case 0:
                ((cby) this.f4976a).f4985a.mo4161s(!((Boolean) obj).booleanValue());
                return;
            case 1:
                Object obj2 = this.f4976a;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    cbv cbvVar = (cbv) obj2;
                    if (cbvVar.f4971b) {
                        cbvVar.f4970a = System.currentTimeMillis();
                    }
                }
                ((cbv) obj2).f4971b = bool.booleanValue();
                return;
            case 2:
                ((ccc) this.f4976a).m3425e();
                return;
            case 3:
                Object obj3 = this.f4976a;
                cdg cdgVar = cdg.INITIAL;
                switch (((cdg) obj).ordinal()) {
                    case 1:
                        ((ccc) obj3).f5103u.mo3439d();
                        return;
                    case 2:
                        ((ccc) obj3).f5103u.mo3441f();
                        return;
                    case 3:
                        ((ccc) obj3).f5103u.mo3440e();
                        return;
                    case 4:
                        ((ccc) obj3).f5103u.mo3442g();
                        return;
                    default:
                        return;
                }
            case 4:
                Object obj4 = this.f4976a;
                hsg hsgVar = (hsg) obj;
                synchronized (obj4) {
                    if (hsgVar.m10694c() && ((ccm) obj4).f5148g && ((ccm) obj4).f5147f) {
                        ((ccm) obj4).m3450d(mrm.m16829i(((ccm) obj4).f5150i.m19204h(new PointF(hsgVar.f29404b.centerX(), hsgVar.f29404b.centerY()))), (int) ((ccm) obj4).f5149h.f31556a);
                        return;
                    }
                    return;
                }
            case 5:
                ?? r0 = this.f4976a;
                cdg cdgVar2 = (cdg) obj;
                if (cdgVar2.equals(cdg.AE_LOCKED)) {
                    r0.mo3439d();
                    return;
                } else {
                    if (cdgVar2.equals(cdg.AE_UNLOCKED)) {
                        r0.mo3442g();
                        return;
                    }
                    return;
                }
            case 6:
                Object obj5 = this.f4976a;
                PointF pointF = (PointF) obj;
                if (pointF.x < 0.0f || pointF.y < 0.0f) {
                    return;
                }
                cdd cddVar = (cdd) obj5;
                if (((Boolean) cddVar.f5266c.mo3831be()).booleanValue()) {
                    return;
                }
                if (cddVar.f5265b == kmq.f36557a) {
                    pointF.x = 1.0f - pointF.x;
                }
                cddVar.f5264a.mo4166x(pointF);
                return;
            case 7:
                Object obj6 = this.f4976a;
                cdg cdgVar3 = (cdg) obj;
                if (cdgVar3.equals(cdg.AE_LOCKED)) {
                    ((cdd) obj6).f5267d.mo3439d();
                    return;
                } else {
                    if (cdgVar3.equals(cdg.AE_UNLOCKED)) {
                        ((cdd) obj6).f5267d.mo3442g();
                        return;
                    }
                    return;
                }
            case 8:
                this.f4976a.mo3579e((dci) obj);
                return;
            case 9:
                Object obj7 = this.f4976a;
                if (((cgs) obj) != cgs.ACTIVE) {
                    ((dmy) obj7).m6419g(true);
                    return;
                }
                nbz nbzVar = nch.f41987a;
                dmy dmyVar = (dmy) obj7;
                ((cgj) dmyVar.f12066d).m3623a();
                dmyVar.f12063a.mo3646i();
                return;
            case 10:
                Object obj8 = this.f4976a;
                nbz nbzVar2 = nch.f41987a;
                ((cgm) obj8).m3641d(((Boolean) obj).booleanValue());
                return;
            case 11:
                Boolean bool2 = (Boolean) obj;
                cgm cgmVar = (cgm) this.f4976a;
                if (((cgs) cgmVar.f5626a.mo3831be()).equals(cgs.ACTIVE)) {
                    if (bool2.booleanValue()) {
                        cgmVar.mo3644g();
                        return;
                    } else {
                        cgmVar.mo3646i();
                        return;
                    }
                }
                return;
            case 12:
                Object obj9 = this.f4976a;
                cgs cgsVar = (cgs) obj;
                nbz nbzVar3 = nch.f41987a;
                if (cgsVar == cgs.INACTIVE_THROTTLED) {
                    cgp cgpVar = (cgp) obj9;
                    cgpVar.f5651a.mo7482d(cgpVar.f5652b);
                    return;
                }
                return;
            case 13:
                ((jwf) this.f4976a).mo3415bf(obj);
                return;
            case 14:
                ?? r1 = this.f4976a;
                if (obj != null) {
                    r1.mo3415bf(obj);
                    return;
                }
                return;
            case 15:
                ((ckt) this.f4976a).m3848e();
                return;
            case 16:
                Object obj10 = this.f4976a;
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
                ckw ckwVar = (ckw) obj10;
                jww jwwVar = ckwVar.f6044c;
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                jwwVar.mo3415bf(Boolean.valueOf(z));
                ckwVar.m3895z(zBooleanValue, zBooleanValue2);
                return;
            case 17:
                ((ckw) this.f4976a).m3864A();
                return;
            case 18:
                ((ckw) this.f4976a).m3885p(((Boolean) obj).booleanValue());
                return;
            case 19:
                Duration duration = (Duration) obj;
                ckw ckwVar2 = (ckw) this.f4976a;
                ckwVar2.f6053l.mo3415bf(duration);
                ckwVar2.m3892w(duration);
                return;
            default:
                ckw ckwVar3 = (ckw) this.f4976a;
                boolean zM3851C = ckw.m3851C((gcy) obj, (gzp) ckwVar3.f6049h.mo3831be(), ((Boolean) ckwVar3.f6051j.m10476a().mo3831be()).booleanValue());
                ckwVar3.f6046e.mo3415bf(Boolean.valueOf(zM3851C));
                if (!zM3851C && ckwVar3.m3865B()) {
                    z = true;
                }
                ckwVar3.f6058q = z;
                return;
        }
    }
}
