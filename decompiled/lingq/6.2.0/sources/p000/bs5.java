package p000;

import android.animation.TimeInterpolator;
import com.google.android.material.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class bs5 extends rs5 {

    /* JADX INFO: renamed from: j0 */
    public static final int f8942j0 = R$attr.motionDurationMedium4;

    /* JADX INFO: renamed from: k0 */
    public static final int f8943k0 = R$attr.motionDurationShort3;

    /* JADX INFO: renamed from: l0 */
    public static final int f8944l0 = R$attr.motionEasingEmphasizedDecelerateInterpolator;

    /* JADX INFO: renamed from: m0 */
    public static final int f8945m0 = R$attr.motionEasingEmphasizedAccelerateInterpolator;

    public bs5() {
        fz2 fz2Var = new fz2();
        fz2Var.f39951a = 0.3f;
        mm8 mm8Var = new mm8(true);
        mm8Var.f51534c = false;
        mm8Var.f51532a = 0.8f;
        super(fz2Var, mm8Var);
    }

    @Override // p000.rs5
    /* JADX INFO: renamed from: e0 */
    public final TimeInterpolator mo4158e0() {
        return AbstractC0853cn.f10296a;
    }

    @Override // p000.rs5
    /* JADX INFO: renamed from: f0 */
    public final int mo4159f0(boolean z) {
        return z ? f8942j0 : f8943k0;
    }

    @Override // p000.rs5
    /* JADX INFO: renamed from: g0 */
    public final int mo4160g0(boolean z) {
        return z ? f8944l0 : f8945m0;
    }
}
