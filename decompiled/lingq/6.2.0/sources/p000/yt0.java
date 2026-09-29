package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class yt0 {

    /* JADX INFO: renamed from: a */
    public final Matrix f70433a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final View f70434b;

    /* JADX INFO: renamed from: c */
    public final float[] f70435c;

    /* JADX INFO: renamed from: d */
    public float f70436d;

    /* JADX INFO: renamed from: e */
    public float f70437e;

    public yt0(View view, float[] fArr) {
        this.f70434b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.f70435c = fArr2;
        this.f70436d = fArr2[2];
        this.f70437e = fArr2[5];
        m25310a();
    }

    /* JADX INFO: renamed from: a */
    public final void m25310a() {
        float f = this.f70436d;
        float[] fArr = this.f70435c;
        fArr[2] = f;
        fArr[5] = this.f70437e;
        Matrix matrix = this.f70433a;
        matrix.setValues(fArr);
        r90 r90Var = awa.f7627a;
        this.f70434b.setAnimationMatrix(matrix);
    }
}
