package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class f49 extends k49 {

    /* JADX INFO: renamed from: c */
    public final h49 f38415c;

    public f49(h49 h49Var) {
        this.f38415c = h49Var;
    }

    @Override // p000.k49
    /* JADX INFO: renamed from: b */
    public final void mo10846b(Matrix matrix, m39 m39Var, int i, Canvas canvas) {
        h49 h49Var = this.f38415c;
        float f = h49Var.f41791f;
        float f2 = h49Var.f41792g;
        RectF rectF = new RectF(h49Var.f41787b, h49Var.f41788c, h49Var.f41789d, h49Var.f41790e);
        Paint paint = m39Var.f50518b;
        boolean z = f2 < 0.0f;
        Path path = m39Var.f50523g;
        int[] iArr = m39.f50515k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = m39Var.f50522f;
            iArr[2] = m39Var.f50521e;
            iArr[3] = m39Var.f50520d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = m39Var.f50520d;
            iArr[2] = m39Var.f50521e;
            iArr[3] = m39Var.f50522f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = m39.f50516l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, m39Var.f50524h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
