package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.compose.p002ui.platform.AbstractC0394f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j8d {
    /* JADX INFO: renamed from: a */
    public static final long m14343a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        Resources resources = (Resources) tj3Var.m22128k(AbstractC0394f.f4762c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = f88.f38630a;
        return d32.m10035e(resources.getColor(i, theme));
    }

    /* JADX INFO: renamed from: b */
    public abstract Rect m14344b();
}
