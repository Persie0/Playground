package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final class qd9 extends o90 {

    /* JADX INFO: renamed from: C */
    public final RectF f57621C;

    /* JADX INFO: renamed from: D */
    public final yk4 f57622D;

    /* JADX INFO: renamed from: E */
    public final float[] f57623E;

    /* JADX INFO: renamed from: F */
    public final Path f57624F;

    /* JADX INFO: renamed from: G */
    public final tp4 f57625G;

    /* JADX INFO: renamed from: H */
    public wna f57626H;

    /* JADX INFO: renamed from: I */
    public wna f57627I;

    public qd9(C0868b c0868b, tp4 tp4Var) {
        super(c0868b, tp4Var);
        this.f57621C = new RectF();
        yk4 yk4Var = new yk4();
        this.f57622D = yk4Var;
        this.f57623E = new float[8];
        this.f57624F = new Path();
        this.f57625G = tp4Var;
        yk4Var.setAlpha(0);
        yk4Var.setStyle(Paint.Style.FILL);
        yk4Var.setColor(tp4Var.f62682l);
    }

    @Override // p000.o90, p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        super.mo555d(rectF, matrix, z);
        tp4 tp4Var = this.f57625G;
        float f = tp4Var.f62680j;
        float f2 = tp4Var.f62681k;
        RectF rectF2 = this.f57621C;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.f54058n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // p000.o90, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        if (obj == yl5.f69999I) {
            this.f57626H = new wna(p33Var, null);
        } else if (obj == 1) {
            this.f57627I = new wna(p33Var, null);
        }
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: j */
    public final void mo10091j(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        tp4 tp4Var = this.f57625G;
        int iAlpha = Color.alpha(tp4Var.f62682l);
        if (iAlpha == 0) {
            return;
        }
        wna wnaVar = this.f57627I;
        Integer num = wnaVar == null ? null : (Integer) wnaVar.mo16692f();
        yk4 yk4Var = this.f57622D;
        if (num != null) {
            yk4Var.setColor(num.intValue());
        } else {
            yk4Var.setColor(tp4Var.f62682l);
        }
        m90 m90Var = this.f54067w.f45257p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (m90Var == null ? 100 : ((Integer) m90Var.mo16692f()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        yk4Var.setAlpha(iIntValue);
        if (qm2Var == null || Color.alpha(qm2Var.f57941d) <= 0) {
            yk4Var.clearShadowLayer();
        } else {
            yk4Var.setShadowLayer(Math.max(qm2Var.f57938a, Float.MIN_VALUE), qm2Var.f57939b, qm2Var.f57940c, qm2Var.f57941d);
        }
        wna wnaVar2 = this.f57626H;
        if (wnaVar2 != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar2.mo16692f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f57623E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = tp4Var.f62680j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = tp4Var.f62681k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.f57624F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, yk4Var);
        }
    }
}
