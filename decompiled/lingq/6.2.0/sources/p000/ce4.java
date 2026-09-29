package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class ce4 {

    /* JADX INFO: renamed from: a */
    public long f9966a;

    /* JADX INFO: renamed from: b */
    public Object f9967b;

    /* JADX INFO: renamed from: c */
    public Object f9968c;

    /* JADX INFO: renamed from: d */
    public Object f9969d;

    /* JADX INFO: renamed from: e */
    public Object f9970e;

    /* JADX INFO: renamed from: f */
    public Object f9971f;

    /* JADX INFO: renamed from: g */
    public final Object f9972g;

    public ce4(LayoutDirection layoutDirection, fb2 fb2Var, wa3 wa3Var, vx9 vx9Var, Object obj) {
        this.f9967b = layoutDirection;
        this.f9968c = fb2Var;
        this.f9969d = wa3Var;
        this.f9970e = vx9Var;
        this.f9971f = obj;
        this.f9972g = AbstractC0278f.m1260j(Boolean.TRUE);
        this.f9966a = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static void m4570a(ce4 ce4Var, LayoutDirection layoutDirection, fb2 fb2Var, vx9 vx9Var, int i) {
        if ((i & 1) != 0) {
            layoutDirection = (LayoutDirection) ce4Var.f9967b;
        }
        if ((i & 2) != 0) {
            fb2Var = (fb2) ce4Var.f9968c;
        }
        wa3 wa3Var = (wa3) ce4Var.f9969d;
        if ((i & 8) != 0) {
            vx9Var = (vx9) ce4Var.f9970e;
        }
        Object obj = ce4Var.f9971f;
        LayoutDirection layoutDirection2 = (LayoutDirection) ce4Var.f9967b;
        t66 t66Var = (t66) ce4Var.f9972g;
        if (layoutDirection == layoutDirection2 && fa4.m11650l(fb2Var, (fb2) ce4Var.f9968c) && fa4.m11650l(wa3Var, (wa3) ce4Var.f9969d) && fa4.m11650l(vx9Var, (vx9) ce4Var.f9970e)) {
            if (fa4.m11650l(obj, ce4Var.f9971f)) {
                return;
            }
            ce4Var.f9971f = obj;
            ((xc9) t66Var).setValue(Boolean.TRUE);
            return;
        }
        ce4Var.f9967b = layoutDirection;
        ce4Var.f9968c = fb2Var;
        ce4Var.f9969d = wa3Var;
        ce4Var.f9970e = vx9Var;
        ((xc9) t66Var).setValue(Boolean.TRUE);
    }

    public ce4(rl7 rl7Var, d74 d74Var, g02 g02Var, hz8 hz8Var, rk7 rk7Var, qq7 qq7Var) {
        this.f9966a = d74Var.f35078b;
        this.f9967b = rl7Var;
        this.f9968c = d74Var;
        this.f9969d = g02Var;
        this.f9970e = hz8Var;
        this.f9971f = rk7Var;
        this.f9972g = qq7Var;
    }
}
