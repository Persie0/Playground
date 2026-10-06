package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ejl implements ejc {

    /* JADX INFO: renamed from: a */
    public elt f14339a;

    /* JADX INFO: renamed from: b */
    public final ejd f14340b;

    /* JADX INFO: renamed from: c */
    private final float[] f14341c = new float[16];

    public ejl(ejd ejdVar) {
        this.f14340b = ejdVar;
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: a */
    public final void mo7390a() {
        elt eltVar = this.f14339a;
        if (eltVar != null) {
            eltVar.m7473a();
            this.f14339a = null;
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: b */
    public final void mo7391b() {
        float fMax;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        if (this.f14340b.f14318n) {
            Matrix.setIdentityM(this.f14341c, 0);
            ejd ejdVar = this.f14340b;
            ejdVar.getClass();
            float fMax2 = 0.9f;
            if (ejdVar.f14312h) {
                Matrix.rotateM(this.f14341c, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(this.f14341c, 0, 0.05f, 0.0f, 0.0f);
                ejd ejdVar2 = this.f14340b;
                if (!ejdVar2.f14317m) {
                    Matrix.translateM(this.f14341c, 0, 0.0f, ejdVar2.f14311g, 0.0f);
                }
                ejd ejdVar3 = this.f14340b;
                float f = ejdVar3.f14311g;
                float f2 = ejdVar3.f14321q;
                fMax = f + (f2 * Math.max(1.0f, 2.0f - (f / f2)));
            } else {
                Matrix.translateM(this.f14341c, 0, 0.0f, 0.05f, 0.0f);
                ejd ejdVar4 = this.f14340b;
                if (!ejdVar4.f14317m) {
                    Matrix.translateM(this.f14341c, 0, -ejdVar4.f14311g, 0.0f, 0.0f);
                }
                ejd ejdVar5 = this.f14340b;
                float f3 = ejdVar5.f14311g;
                float f4 = ejdVar5.f14320p;
                fMax2 = f3 + (f4 * Math.max(1.0f, 2.0f - (f3 / f4)));
                fMax = 0.9f;
            }
            Matrix.scaleM(this.f14341c, 0, fMax2, fMax, 1.0f);
            ejd ejdVar6 = this.f14340b;
            if (ejdVar6.f14312h) {
                Matrix.translateM(this.f14341c, 0, 0.0f, (-0.75f) - (Math.min(1.0f, ejdVar6.f14311g / ejdVar6.f14321q) * 0.25f), 0.0f);
            } else {
                Matrix.translateM(this.f14341c, 0, (Math.min(1.0f, ejdVar6.f14311g / ejdVar6.f14320p) * 0.25f) - 0.25f, 0.0f, 0.0f);
            }
            elt eltVar = this.f14339a;
            eltVar.getClass();
            eltVar.m7477e(this.f14341c);
            ejd ejdVar7 = this.f14340b;
            if (ejdVar7.f14312h) {
                elt eltVar2 = this.f14339a;
                eltVar2.getClass();
                eltVar2.m7476d(ejdVar7.f14308d, 2.0f);
            } else {
                elt eltVar3 = this.f14339a;
                eltVar3.getClass();
                float f5 = ejdVar7.f14305a;
                eltVar3.m7476d(f5 + f5, ejdVar7.f14309e);
            }
            elt eltVar4 = this.f14339a;
            lku.m15662p(eltVar4);
            eltVar4.m7474b();
            this.f14340b.f14319o.unbind();
        }
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: c */
    public final void mo7392c(int i, int i2) {
    }
}
