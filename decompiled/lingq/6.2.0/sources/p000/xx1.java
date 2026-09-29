package p000;

import android.R;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.core.AbstractC0060b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xx1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f68917a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f68918b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f68919c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f68920d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f68921e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f68922f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: a */
    public static final void m24789a(boolean z, float f, ye1 ye1Var, final int i) {
        final boolean z2;
        final float f2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1020542825);
        int i2 = 2;
        int i3 = (tj3Var.m22122h(z) ? 4 : 2) | i | (tj3Var.m22114d(f) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            f2 = f;
            z2 = z;
            AbstractC0054a.m729d(z2, null, AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d()), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(-560230847, new lo3(AbstractC0060b.m750b(f, x74.f67879b, null, null, tj3Var, (i3 >> 3) & 14, 28), i2), tj3Var), tj3Var, (i3 & 14) | 200064, 18);
            tj3Var = tj3Var;
        } else {
            z2 = z;
            f2 = f;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(f2, i, z2) { // from class: pe5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f56004a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ float f56005b;

                {
                    this.f56004a = z2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    xx1.m24789a(this.f56004a, this.f56005b, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
