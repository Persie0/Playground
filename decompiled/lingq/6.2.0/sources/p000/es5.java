package p000;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class es5 extends AbstractC3184kh {

    /* JADX INFO: renamed from: y */
    public final int f37774y;

    public es5(int i) {
        super(14);
        this.f37774y = i;
    }

    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: H */
    public final void mo11327H(Object obj, float f) {
        fs5 fs5Var = (fs5) obj;
        float[] fArr = fs5Var.f39574X;
        if (fArr != null) {
            int i = this.f37774y;
            if (fArr[i] != f) {
                fArr[i] = f;
                C3487q7 c3487q7 = fs5Var.f39576Z;
                if (c3487q7 != null) {
                    float fM12066j = fs5Var.m12066j();
                    MaterialButton materialButton = (MaterialButton) c3487q7.f57333b;
                    int i2 = (int) (fM12066j * 0.11f);
                    if (materialButton.f12775c0 != i2) {
                        materialButton.f12775c0 = i2;
                        materialButton.m6072v();
                        materialButton.invalidate();
                    }
                }
                fs5Var.invalidateSelf();
            }
        }
    }

    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: u */
    public final float mo11328u(Object obj) {
        float[] fArr = ((fs5) obj).f39574X;
        if (fArr != null) {
            return fArr[this.f37774y];
        }
        return 0.0f;
    }
}
