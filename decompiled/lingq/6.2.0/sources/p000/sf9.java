package p000;

import android.view.ViewConfiguration;
import androidx.compose.p002ui.platform.AbstractC0402n;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf9 {

    /* JADX INFO: renamed from: a */
    public static final float f60797a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final f32 m21341a(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
        boolean zM22114d = tj3Var.m22114d(fb2Var.mo594a());
        Object objM22097O = tj3Var.m22097O();
        if (zM22114d || objM22097O == we1.f66679a) {
            objM22097O = new f32(new or3(fb2Var));
            tj3Var.m22131l0(objM22097O);
        }
        return (f32) objM22097O;
    }
}
