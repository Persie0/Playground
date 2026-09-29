package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class g49 extends k49 {

    /* JADX INFO: renamed from: c */
    public final i49 f40188c;

    /* JADX INFO: renamed from: d */
    public final float f40189d;

    /* JADX INFO: renamed from: e */
    public final float f40190e;

    public g49(i49 i49Var, float f, float f2) {
        this.f40188c = i49Var;
        this.f40189d = f;
        this.f40190e = f2;
    }

    @Override // p000.k49
    /* JADX INFO: renamed from: b */
    public final void mo10846b(Matrix matrix, m39 m39Var, int i, Canvas canvas) {
        i49 i49Var = this.f40188c;
        float f = i49Var.f43521c;
        float f2 = this.f40190e;
        float f3 = i49Var.f43520b;
        float f4 = this.f40189d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f46704a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m12358c());
        m39Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = m39Var.f50522f;
        int[] iArr = m39.f50513i;
        iArr[0] = i2;
        iArr[1] = m39Var.f50521e;
        iArr[2] = m39Var.f50520d;
        Paint paint = m39Var.f50519c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, m39.f50514j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public final float m12358c() {
        i49 i49Var = this.f40188c;
        return (float) Math.toDegrees(Math.atan((i49Var.f43521c - this.f40190e) / (i49Var.f43520b - this.f40189d)));
    }
}
