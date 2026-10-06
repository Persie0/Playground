package p000;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkv implements blq {

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f3668g;

    /* JADX INFO: renamed from: f */
    public static final bkv f3667f = new bkv(5);

    /* JADX INFO: renamed from: e */
    public static final bkv f3666e = new bkv(4);

    /* JADX INFO: renamed from: d */
    public static final bkv f3665d = new bkv(3);

    /* JADX INFO: renamed from: c */
    public static final bkv f3664c = new bkv(2);

    /* JADX INFO: renamed from: b */
    public static final bkv f3663b = new bkv(1);

    /* JADX INFO: renamed from: a */
    public static final bkv f3662a = new bkv(0);

    private bkv(int i) {
        this.f3668g = i;
    }

    @Override // p000.blq
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2637a(blt bltVar, float f) {
        boolean z;
        switch (this.f3668g) {
            case 0:
                return Float.valueOf(blb.m2640a(bltVar) * f);
            case 1:
                z = bltVar.mo2665q() == 1;
                if (z) {
                    bltVar.mo2656h();
                }
                double dMo2650a = bltVar.mo2650a();
                double dMo2650a2 = bltVar.mo2650a();
                double dMo2650a3 = bltVar.mo2650a();
                double dMo2650a4 = bltVar.mo2665q() == 7 ? bltVar.mo2650a() : 1.0d;
                if (z) {
                    bltVar.mo2658j();
                }
                if (dMo2650a <= 1.0d && dMo2650a2 <= 1.0d && dMo2650a3 <= 1.0d) {
                    dMo2650a *= 255.0d;
                    dMo2650a2 *= 255.0d;
                    dMo2650a3 *= 255.0d;
                    if (dMo2650a4 <= 1.0d) {
                        dMo2650a4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dMo2650a4, (int) dMo2650a, (int) dMo2650a2, (int) dMo2650a3));
            case 2:
                return Integer.valueOf(Math.round(blb.m2640a(bltVar) * f));
            case 3:
                return blb.m2642c(bltVar, f);
            case 4:
                int iMo2665q = bltVar.mo2665q();
                if (iMo2665q == 1) {
                    return blb.m2642c(bltVar, f);
                }
                if (iMo2665q == 3) {
                    return blb.m2642c(bltVar, f);
                }
                if (iMo2665q != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(bzq.m3237J(iMo2665q)));
                }
                PointF pointF = new PointF(((float) bltVar.mo2650a()) * f, ((float) bltVar.mo2650a()) * f);
                while (bltVar.mo2663o()) {
                    bltVar.mo2662n();
                }
                return pointF;
            default:
                z = bltVar.mo2665q() == 1;
                if (z) {
                    bltVar.mo2656h();
                }
                float fMo2650a = (float) bltVar.mo2650a();
                float fMo2650a2 = (float) bltVar.mo2650a();
                while (bltVar.mo2663o()) {
                    bltVar.mo2662n();
                }
                if (z) {
                    bltVar.mo2658j();
                }
                return new bmg((fMo2650a / 100.0f) * f, (fMo2650a2 / 100.0f) * f);
        }
    }
}
