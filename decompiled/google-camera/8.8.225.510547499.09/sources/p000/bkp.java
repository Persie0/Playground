package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkp {

    /* JADX INFO: renamed from: a */
    private static final dsx f3653a = dsx.m6674J("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static bje m2633a(blt bltVar, bgm bgmVar) {
        ArrayList arrayList = new ArrayList();
        if (bltVar.mo2665q() == 1) {
            bltVar.mo2656h();
            while (bltVar.mo2663o()) {
                arrayList.add(new bik(bgmVar, blc.m2644a(bltVar, bgmVar, bme.m2701a(), bkv.f3665d, bltVar.mo2665q() == 3, false)));
            }
            bltVar.mo2658j();
            bld.m2647b(arrayList);
        } else {
            arrayList.add(new bmf(blb.m2642c(bltVar, bme.m2701a())));
        }
        return new bje(arrayList);
    }

    /* JADX INFO: renamed from: b */
    static bjl m2634b(blt bltVar, bgm bgmVar) {
        bltVar.mo2657i();
        boolean z = false;
        bje bjeVarM2633a = null;
        bjb bjbVarM3239L = null;
        bjb bjbVarM3239L2 = null;
        while (bltVar.mo2665q() != 4) {
            switch (bltVar.mo2666r(f3653a)) {
                case 0:
                    bjeVarM2633a = m2633a(bltVar, bgmVar);
                    break;
                case 1:
                    if (bltVar.mo2665q() != 6) {
                        bjbVarM3239L = bzq.m3239L(bltVar, bgmVar);
                    } else {
                        bltVar.mo2662n();
                        z = true;
                    }
                    break;
                case 2:
                    if (bltVar.mo2665q() != 6) {
                        bjbVarM3239L2 = bzq.m3239L(bltVar, bgmVar);
                    } else {
                        bltVar.mo2662n();
                        z = true;
                    }
                    break;
                default:
                    bltVar.mo2661m();
                    bltVar.mo2662n();
                    break;
            }
        }
        bltVar.mo2659k();
        if (z) {
            bgmVar.m2418d("Lottie doesn't support expressions.");
        }
        return bjeVarM2633a != null ? bjeVarM2633a : new bji(bjbVarM3239L, bjbVarM3239L2);
    }
}
