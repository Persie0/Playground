package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class blb {

    /* JADX INFO: renamed from: a */
    private static final dsx f3680a = dsx.m6674J("x", "y");

    /* JADX INFO: renamed from: a */
    static float m2640a(blt bltVar) {
        int iMo2665q = bltVar.mo2665q();
        switch (iMo2665q - 1) {
            case 0:
                bltVar.mo2656h();
                float fMo2650a = (float) bltVar.mo2650a();
                while (bltVar.mo2663o()) {
                    bltVar.mo2662n();
                }
                bltVar.mo2658j();
                return fMo2650a;
            case 6:
                return (float) bltVar.mo2650a();
            default:
                throw new IllegalArgumentException("Unknown value for token of type ".concat(bzq.m3237J(iMo2665q)));
        }
    }

    /* JADX INFO: renamed from: b */
    static int m2641b(blt bltVar) {
        bltVar.mo2656h();
        double dMo2650a = bltVar.mo2650a() * 255.0d;
        double dMo2650a2 = bltVar.mo2650a() * 255.0d;
        double dMo2650a3 = bltVar.mo2650a() * 255.0d;
        while (bltVar.mo2663o()) {
            bltVar.mo2662n();
        }
        int i = (int) dMo2650a2;
        int i2 = (int) dMo2650a;
        bltVar.mo2658j();
        return Color.argb(255, i2, i, (int) dMo2650a3);
    }

    /* JADX INFO: renamed from: c */
    static PointF m2642c(blt bltVar, float f) {
        switch (bltVar.mo2665q() - 1) {
            case 0:
                bltVar.mo2656h();
                float fMo2650a = (float) bltVar.mo2650a();
                float fMo2650a2 = (float) bltVar.mo2650a();
                while (bltVar.mo2665q() != 2) {
                    bltVar.mo2662n();
                }
                bltVar.mo2658j();
                return new PointF(fMo2650a * f, fMo2650a2 * f);
            case 2:
                bltVar.mo2657i();
                float fM2640a = 0.0f;
                float fM2640a2 = 0.0f;
                while (bltVar.mo2663o()) {
                    switch (bltVar.mo2666r(f3680a)) {
                        case 0:
                            fM2640a = m2640a(bltVar);
                            break;
                        case 1:
                            fM2640a2 = m2640a(bltVar);
                            break;
                        default:
                            bltVar.mo2661m();
                            bltVar.mo2662n();
                            break;
                    }
                }
                bltVar.mo2659k();
                return new PointF(fM2640a * f, fM2640a2 * f);
            case 6:
                float fMo2650a3 = (float) bltVar.mo2650a();
                float fMo2650a4 = (float) bltVar.mo2650a();
                while (bltVar.mo2663o()) {
                    bltVar.mo2662n();
                }
                return new PointF(fMo2650a3 * f, fMo2650a4 * f);
            default:
                throw new IllegalArgumentException("Unknown point starts with ".concat(bzq.m3237J(bltVar.mo2665q())));
        }
    }

    /* JADX INFO: renamed from: d */
    static List m2643d(blt bltVar, float f) {
        ArrayList arrayList = new ArrayList();
        bltVar.mo2656h();
        while (bltVar.mo2665q() == 1) {
            bltVar.mo2656h();
            arrayList.add(m2642c(bltVar, f));
            bltVar.mo2658j();
        }
        bltVar.mo2658j();
        return arrayList;
    }
}
