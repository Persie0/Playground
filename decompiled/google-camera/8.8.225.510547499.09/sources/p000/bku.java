package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bku implements blq {

    /* JADX INFO: renamed from: a */
    public static final bku f3660a = new bku();

    /* JADX INFO: renamed from: b */
    private static final dsx f3661b = dsx.m6674J("t", "f", "s", "j", "tr", qQLA.BjQkqMAjVhLvOk, "ls", "fc", "sc", "sw", "of");

    private bku() {
    }

    @Override // p000.blq
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2637a(blt bltVar, float f) {
        bltVar.mo2657i();
        String strMo2655g = null;
        String strMo2655g2 = null;
        float fMo2650a = 0.0f;
        int i = 3;
        int iMo2651b = 0;
        float fMo2650a2 = 0.0f;
        float fMo2650a3 = 0.0f;
        int iM2641b = 0;
        int iM2641b2 = 0;
        float fMo2650a4 = 0.0f;
        boolean zMo2664p = true;
        while (bltVar.mo2663o()) {
            switch (bltVar.mo2666r(f3661b)) {
                case 0:
                    strMo2655g = bltVar.mo2655g();
                    break;
                case 1:
                    strMo2655g2 = bltVar.mo2655g();
                    break;
                case 2:
                    fMo2650a = (float) bltVar.mo2650a();
                    break;
                case 3:
                    int iMo2651b2 = bltVar.mo2651b();
                    i = (iMo2651b2 <= 2 && iMo2651b2 >= 0) ? new int[]{1, 2, 3}[iMo2651b2] : 3;
                    break;
                case 4:
                    iMo2651b = bltVar.mo2651b();
                    break;
                case 5:
                    fMo2650a2 = (float) bltVar.mo2650a();
                    break;
                case 6:
                    fMo2650a3 = (float) bltVar.mo2650a();
                    break;
                case 7:
                    iM2641b = blb.m2641b(bltVar);
                    break;
                case 8:
                    iM2641b2 = blb.m2641b(bltVar);
                    break;
                case 9:
                    fMo2650a4 = (float) bltVar.mo2650a();
                    break;
                case 10:
                    zMo2664p = bltVar.mo2664p();
                    break;
                default:
                    bltVar.mo2661m();
                    bltVar.mo2662n();
                    break;
            }
        }
        bltVar.mo2659k();
        return new biu(strMo2655g, strMo2655g2, fMo2650a, i, iMo2651b, fMo2650a2, fMo2650a3, iM2641b, iM2641b2, fMo2650a4, zMo2664p);
    }
}
