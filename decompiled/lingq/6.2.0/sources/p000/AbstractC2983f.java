package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.size.Precision;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2983f {

    /* JADX INFO: renamed from: a */
    public static final s72 f38126a = new s72();

    /* JADX INFO: renamed from: a */
    public static final boolean m11406a(e04 e04Var) {
        Precision precision = e04Var.f36506e;
        lr9 lr9Var = e04Var.f36504c;
        i99 i99Var = e04Var.f36523v;
        int i = AbstractC2946e.f36477a[precision.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    gm5.m12750e();
                    return false;
                }
                if ((e04Var.f36527z.f8213a != null || !(i99Var instanceof uh2)) && (!(lr9Var instanceof t04) || !(i99Var instanceof t18) || ((t04) lr9Var).f61703b != ((t18) i99Var).f61746a)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final Drawable m11407b(e04 e04Var, Integer num) {
        if (num == null || num.intValue() == 0) {
            return null;
        }
        Context context = e04Var.f36502a;
        int iIntValue = num.intValue();
        Drawable drawableM3932U = bna.m3932U(context, iIntValue);
        if (drawableM3932U != null) {
            return drawableM3932U;
        }
        gm5.m12751g(ux5.m22988k(iIntValue, "Invalid resource ID: "));
        return null;
    }
}
