package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bld {

    /* JADX INFO: renamed from: a */
    static final dsx f3685a = dsx.m6674J("k");

    /* JADX INFO: renamed from: a */
    public static List m2646a(blt bltVar, bgm bgmVar, float f, blq blqVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (bltVar.mo2665q() == 6) {
            bgmVar.m2418d("Lottie doesn't support expressions.");
            return arrayList;
        }
        bltVar.mo2657i();
        while (bltVar.mo2663o()) {
            switch (bltVar.mo2666r(f3685a)) {
                case 0:
                    if (bltVar.mo2665q() != 1) {
                        arrayList.add(blc.m2644a(bltVar, bgmVar, f, blqVar, false, z));
                    } else {
                        bltVar.mo2656h();
                        if (bltVar.mo2665q() != 7) {
                            while (bltVar.mo2663o()) {
                                arrayList.add(blc.m2644a(bltVar, bgmVar, f, blqVar, true, z));
                            }
                        } else {
                            arrayList.add(blc.m2644a(bltVar, bgmVar, f, blqVar, false, z));
                        }
                        bltVar.mo2658j();
                    }
                    break;
                default:
                    bltVar.mo2662n();
                    break;
            }
        }
        bltVar.mo2659k();
        m2647b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m2647b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bmf bmfVar = (bmf) list.get(i2);
            i2++;
            bmf bmfVar2 = (bmf) list.get(i2);
            bmfVar.f3765h = Float.valueOf(bmfVar2.f3764g);
            if (bmfVar.f3760c == null && (obj = bmfVar2.f3759b) != null) {
                bmfVar.f3760c = obj;
                if (bmfVar instanceof bik) {
                    ((bik) bmfVar).m2503a();
                }
            }
        }
        bmf bmfVar3 = (bmf) list.get(i);
        if ((bmfVar3.f3759b == null || bmfVar3.f3760c == null) && list.size() > 1) {
            list.remove(bmfVar3);
        }
    }
}
