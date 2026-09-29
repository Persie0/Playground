package p000;

import androidx.compose.p002ui.platform.AbstractC0402n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c6a {

    /* JADX INFO: renamed from: a */
    public static final float f9644a;

    static {
        AbstractC3584sr.m21614a(16.0f, 8.0f);
        f9644a = 200.0f;
    }

    /* JADX INFO: renamed from: a */
    public static u6a m4357a(ye1 ye1Var) {
        x17 x17Var = s6a.f60435a;
        tj3 tj3Var = (tj3) ye1Var;
        int iMo916w0 = ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo916w0(4.0f);
        long jM17654a = ((nw4) ((a5b) tj3Var.m22128k(AbstractC0402n.f4830v))).m17654a();
        boolean zM22116e = tj3Var.m22116e(iMo916w0) | tj3Var.m22118f(jM17654a);
        Object objM22097O = tj3Var.m22097O();
        if (zM22116e || objM22097O == we1.f66679a) {
            objM22097O = new u6a(iMo916w0, jM17654a);
            tj3Var.m22131l0(objM22097O);
        }
        return (u6a) objM22097O;
    }
}
