package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ux1 extends ds5 {

    /* JADX INFO: renamed from: s */
    public final RectF f64484s;

    public ux1(ux1 ux1Var) {
        super(ux1Var);
        this.f64484s = ux1Var.f64484s;
    }

    @Override // p000.ds5, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        vx1 vx1Var = new vx1(this);
        vx1Var.f66041c0 = this;
        vx1Var.invalidateSelf();
        return vx1Var;
    }

    public ux1(r39 r39Var, RectF rectF) {
        super(r39Var);
        this.f64484s = rectF;
    }
}
