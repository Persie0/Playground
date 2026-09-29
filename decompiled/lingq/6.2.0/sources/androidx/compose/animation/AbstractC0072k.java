package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import p000.aa1;
import p000.bg9;
import p000.dh9;
import p000.jda;
import p000.l43;
import p000.ss5;
import p000.tj3;
import p000.we1;
import p000.ye1;

/* JADX INFO: renamed from: androidx.compose.animation.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0072k {

    /* JADX INFO: renamed from: a */
    public static final bg9 f1592a = ss5.m21698Y(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: a */
    public static final C0059a m784a(long j) {
        return new C0059a(new aa1(j), (jda) ColorVectorConverterKt$ColorToVector$1.f1409b.invoke(aa1.m202f(j)), null, 12);
    }

    /* JADX INFO: renamed from: b */
    public static final dh9 m785b(long j, l43 l43Var, String str, ye1 ye1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            l43Var = f1592a;
        }
        l43 l43Var2 = l43Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22120g = tj3Var.m22120g(aa1.m202f(j));
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = (jda) ColorVectorConverterKt$ColorToVector$1.f1409b.invoke(aa1.m202f(j));
            tj3Var.m22131l0(objM22097O);
        }
        return AbstractC0060b.m751c(new aa1(j), (jda) objM22097O, l43Var2, null, str2, null, tj3Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
