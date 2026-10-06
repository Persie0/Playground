package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkr {

    /* JADX INFO: renamed from: a */
    private static final dsx f3656a = dsx.m6674J(rmwTRjObXLGH.xnRLANMG, "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    private static final dsx f3657b = dsx.m6674J("k");

    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    /* JADX INFO: renamed from: a */
    public static bjk m2635a(blt bltVar, bgm bgmVar) {
        bjb bjbVar;
        bjb bjbVarM3240M;
        bje bjeVarM2633a;
        bjl bjlVarM2634b;
        bjg bjgVar;
        bjb bjbVarM3240M2;
        bjd bjdVarM3242O;
        bjb bjbVarM3240M3;
        bjb bjbVarM3240M4;
        bje bjeVar;
        bjl bjlVar;
        bjg bjgVar2;
        bjb bjbVar2;
        bjb bjbVar3;
        bjb bjbVar4;
        int iMo2665q = bltVar.mo2665q();
        if (iMo2665q == 3) {
            bltVar.mo2657i();
            bjbVar = null;
            bjbVarM3240M = null;
            bjeVarM2633a = null;
            bjlVarM2634b = null;
            bjgVar = null;
            bjbVarM3240M2 = null;
            bjdVarM3242O = null;
            bjbVarM3240M3 = null;
            bjbVarM3240M4 = null;
        } else {
            bjbVar = null;
            bjbVarM3240M = null;
            bjeVarM2633a = null;
            bjlVarM2634b = null;
            bjgVar = null;
            bjbVarM3240M2 = null;
            bjdVarM3242O = null;
            bjbVarM3240M3 = null;
            bjbVarM3240M4 = null;
        }
        while (bltVar.mo2663o()) {
            switch (bltVar.mo2666r(f3656a)) {
                case 0:
                    bjb bjbVar5 = bjbVarM3240M;
                    bltVar.mo2657i();
                    while (bltVar.mo2663o()) {
                        switch (bltVar.mo2666r(f3657b)) {
                            case 0:
                                bjeVarM2633a = bkp.m2633a(bltVar, bgmVar);
                                break;
                            default:
                                bltVar.mo2661m();
                                bltVar.mo2662n();
                                break;
                        }
                    }
                    bltVar.mo2659k();
                    bjbVarM3240M = bjbVar5;
                    continue;
                case 1:
                    bjlVarM2634b = bkp.m2634b(bltVar, bgmVar);
                    continue;
                case 2:
                    bjgVar = new bjg(bzq.m3245R(bltVar, bgmVar, bkv.f3667f));
                    continue;
                case 3:
                    bgmVar.m2418d("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    bjdVarM3242O = bzq.m3242O(bltVar, bgmVar);
                    continue;
                case 6:
                    bjbVarM3240M3 = bzq.m3240M(bltVar, bgmVar, false);
                    continue;
                case 7:
                    bjbVarM3240M4 = bzq.m3240M(bltVar, bgmVar, false);
                    continue;
                case 8:
                    bjbVarM3240M2 = bzq.m3240M(bltVar, bgmVar, false);
                    continue;
                case 9:
                    bjbVarM3240M = bzq.m3240M(bltVar, bgmVar, false);
                    continue;
                default:
                    bltVar.mo2661m();
                    bltVar.mo2662n();
                    continue;
            }
            bjb bjbVarM3240M5 = bzq.m3240M(bltVar, bgmVar, false);
            if (bjbVarM3240M5.f3484a.isEmpty()) {
                List list = bjbVarM3240M5.f3484a;
                Float fValueOf = Float.valueOf(0.0f);
                bjbVar3 = bjbVarM3240M;
                list.add(new bmf(bgmVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(bgmVar.f3180i)));
                bjbVar4 = bjbVarM3240M5;
            } else {
                bjbVar3 = bjbVarM3240M;
                if (((bmf) bjbVarM3240M5.f3484a.get(0)).f3759b == null) {
                    List list2 = bjbVarM3240M5.f3484a;
                    Float fValueOf2 = Float.valueOf(0.0f);
                    bjbVar4 = bjbVarM3240M5;
                    list2.set(0, new bmf(bgmVar, fValueOf2, fValueOf2, (Interpolator) null, 0.0f, Float.valueOf(bgmVar.f3180i)));
                } else {
                    bjbVar4 = bjbVarM3240M5;
                }
            }
            bjbVar = bjbVar4;
            bjbVarM3240M = bjbVar3;
        }
        bjb bjbVar6 = bjbVarM3240M;
        if (iMo2665q == 3) {
            bltVar.mo2659k();
        }
        if (bjeVarM2633a != null) {
            bjeVar = (bjeVarM2633a.mo2526c() && ((PointF) ((bmf) bjeVarM2633a.f3472a.get(0)).f3759b).equals(0.0f, 0.0f)) ? null : bjeVarM2633a;
        } else {
            bjeVar = null;
        }
        if (bjlVarM2634b != null) {
            bjlVar = (!(bjlVarM2634b instanceof bji) && bjlVarM2634b.mo2526c() && ((PointF) ((bmf) bjlVarM2634b.mo2525b().get(0)).f3759b).equals(0.0f, 0.0f)) ? null : bjlVarM2634b;
        } else {
            bjlVar = null;
        }
        if (bjbVar == null) {
            bjbVar = null;
        } else if (bjbVar.mo2526c() && ((Float) ((bmf) bjbVar.f3484a.get(0)).f3759b).floatValue() == 0.0f) {
            bjbVar = null;
        }
        if (bjgVar == null) {
            bjgVar2 = null;
        } else if (bjgVar.mo2526c()) {
            bmg bmgVar = (bmg) ((bmf) bjgVar.f3484a.get(0)).f3759b;
            if (bmgVar.f3774a == 1.0f && bmgVar.f3775b == 1.0f) {
                bjgVar2 = null;
            } else {
                bjgVar2 = bjgVar;
            }
        } else {
            bjgVar2 = bjgVar;
        }
        if (bjbVarM3240M2 != null) {
            bjbVar2 = (bjbVarM3240M2.mo2526c() && ((Float) ((bmf) bjbVarM3240M2.f3484a.get(0)).f3759b).floatValue() == 0.0f) ? null : bjbVarM3240M2;
        } else {
            bjbVar2 = null;
        }
        return new bjk(bjeVar, bjlVar, bjgVar2, bjbVar, bjdVarM3242O, bjbVarM3240M3, bjbVarM3240M4, bjbVar2, (bjbVar6 == null || (bjbVar6.mo2526c() && ((Float) ((bmf) bjbVar6.f3484a.get(0)).f3759b).floatValue() == 0.0f)) ? null : bjbVar6);
    }
}
