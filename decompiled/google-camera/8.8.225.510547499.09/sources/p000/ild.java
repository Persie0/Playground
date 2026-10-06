package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ild {

    /* JADX INFO: renamed from: a */
    private static final nbh f31427a = nbh.m17259h(voNZjxiJou.zlmSOeXlmbUv);

    /* JADX INFO: renamed from: b */
    private final ggm f31428b;

    public ild(ggm ggmVar) {
        this.f31428b = ggmVar;
    }

    /* JADX INFO: renamed from: b */
    private static final float m11422b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* JADX INFO: renamed from: a */
    public final PointF m11423a(PointF pointF, RectF rectF, boolean z) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            ((nbe) ((nbe) f31427a.m17252c()).mo17276G((char) 4303)).mo17293r("Negative focus point: %s", pointF);
        }
        float[] fArr = {m11422b(pointF.x / rectF.width()), m11422b(pointF.y / rectF.height())};
        int iM13893a = this.f31428b.mo9216f().m13893a();
        Matrix matrix = new Matrix();
        matrix.setRotate(iM13893a, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        if (z) {
            fArr[0] = 1.0f - fArr[0];
        }
        return new PointF(fArr[0], fArr[1]);
    }
}
