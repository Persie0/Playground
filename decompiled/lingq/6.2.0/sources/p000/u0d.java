package p000;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import com.lingq.core.p012ui.library.CollectionLoadingItemType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0d {
    /* JADX INFO: renamed from: a */
    public static final void m22381a(yq8 yq8Var, ye1 ye1Var, int i) {
        yq8Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(783973101);
        int i2 = (tj3Var.m22120g(yq8Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e8d.m10944c(yq8Var instanceof wq8 ? CollectionLoadingItemType.Lesson : CollectionLoadingItemType.Course, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ht6(yq8Var, i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m22382b(Drawable drawable, Outline outline) {
        drawable.getOutline(outline);
    }
}
