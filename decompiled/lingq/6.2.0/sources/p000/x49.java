package p000;

import androidx.compose.material3.tokens.ShapeKeyTokens;

/* JADX INFO: loaded from: classes.dex */
public abstract class x49 {
    static {
        new lw4(new b98(17));
    }

    /* JADX INFO: renamed from: a */
    public static final o39 m24270a(v49 v49Var, ShapeKeyTokens shapeKeyTokens) {
        switch (w49.f66387a[shapeKeyTokens.ordinal()]) {
            case 1:
                return v49Var.f64859e;
            case 2:
                return v49Var.f64861g;
            case 3:
                return v49Var.f64862h;
            case 4:
                return m24272c(v49Var.f64859e);
            case 5:
                return v49Var.f64855a;
            case 6:
                return m24272c(v49Var.f64855a);
            case 7:
                return ui8.f63972a;
            case 8:
                return v49Var.f64858d;
            case 9:
                return v49Var.f64860f;
            case 10:
                si8 si8Var = v49Var.f64858d;
                yj2 yj2Var = w39.f66340i;
                return si8.m21397c(si8Var, yj2Var, null, null, yj2Var, 6);
            case 11:
                return m24272c(v49Var.f64858d);
            case 12:
                return v49Var.f64857c;
            case 13:
                return ss5.f61356d;
            case 14:
                return v49Var.f64856b;
            case 15:
                si8 si8Var2 = v49Var.f64858d;
                yj2 yj2Var2 = w39.f66340i;
                return si8.m21397c(si8Var2, null, yj2Var2, yj2Var2, null, 9);
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final o39 m24271b(ShapeKeyTokens shapeKeyTokens, ye1 ye1Var) {
        return m24270a(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51801c, shapeKeyTokens);
    }

    /* JADX INFO: renamed from: c */
    public static si8 m24272c(si8 si8Var) {
        yj2 yj2Var = w39.f66340i;
        return si8.m21397c(si8Var, null, null, yj2Var, yj2Var, 3);
    }
}
