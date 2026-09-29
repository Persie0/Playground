package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import androidx.compose.runtime.AbstractC0278f;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pxc {

    /* JADX INFO: renamed from: a */
    public static final int[] f56964a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static final void m19566a(ug8 ug8Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        b16 b16Var;
        boolean z;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1835187727);
        int i2 = i | (tj3Var.m22120g(ug8Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM3912B0 = bna.m3912B0(vz1.m23624c0(e16Var, "unscrambleContent"), bna.m3972r0(tj3Var), false, 14);
            ec0 ec0Var = nj0.f52792K;
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28)), ec0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM3912B0);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String str = ug8Var.f63893b;
            if (vk9.m23391n0(str)) {
                str = null;
            }
            String str2 = str;
            b16 b16Var2 = b16.f7762a;
            if (str2 == null) {
                tj3Var.m22111b0(-1194960156);
                tj3Var.m22139q(false);
                b16Var = b16Var2;
                z = false;
            } else {
                tj3Var.m22111b0(-1194960155);
                b16Var = b16Var2;
                z = false;
                lw9.m16554b(str2, AbstractC3584sr.m21609V(bna.m3912B0(c99.m4416i(c99.m4412e(b16Var2, 1.0f), 0.0f, 160.0f, 1), bna.m3972r0(tj3Var), false, 14), ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2), ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e(), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var, 0, 0, 130040);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1257g(-1);
                tj3Var.m22131l0(objM22097O);
            }
            sc9 sc9Var = (sc9) objM22097O;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32 ? true : z) | (i3 == 4 ? true : z);
            Object objM22097O2 = tj3Var.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new sx7(16, ug8Var, vi3Var);
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var2 = (vi3) objM22097O2;
            boolean z3 = i3 == 4 ? true : z;
            Object objM22097O3 = tj3Var.m22097O();
            if (z3 || objM22097O3 == p84Var) {
                objM22097O3 = new sx7(17, ug8Var, sc9Var);
                tj3Var.m22131l0(objM22097O3);
            }
            AbstractC0443c.m1891b(vi3Var2, e16VarM4412e, (vi3) objM22097O3, tj3Var, 48, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 15, ug8Var, vi3Var, e16Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19567b(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(R$integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, R$attr.state_liftable, -R$attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
