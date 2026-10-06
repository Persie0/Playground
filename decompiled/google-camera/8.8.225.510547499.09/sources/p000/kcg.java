package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcg {

    /* JADX INFO: renamed from: a */
    public RectF f35560a;

    /* JADX INFO: renamed from: b */
    public int f35561b;

    /* JADX INFO: renamed from: c */
    public Matrix f35562c;

    /* JADX INFO: renamed from: d */
    public Rect f35563d;

    /* JADX INFO: renamed from: e */
    public kbc f35564e;

    /* JADX INFO: renamed from: f */
    private kay f35565f;

    /* JADX INFO: renamed from: g */
    private boolean f35566g;

    /* JADX INFO: renamed from: a */
    public final Matrix m13966a() {
        Matrix matrix = this.f35562c;
        matrix.getClass();
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public final void m13967b(boolean z) {
        this.f35566g = z;
        m13969d();
    }

    /* JADX INFO: renamed from: c */
    public final void m13968c(int i, int i2, int i3, int i4, kay kayVar) {
        this.f35560a = new RectF(i, i2, i3, i4);
        this.f35565f = kayVar;
        m13969d();
        this.f35563d = null;
        m13969d();
    }

    /* JADX INFO: renamed from: d */
    public final void m13969d() {
        int iWidth;
        int iWidth2;
        Rect rect = this.f35563d;
        if (rect == null || this.f35564e == null || this.f35565f == null || this.f35560a == null) {
            return;
        }
        Matrix matrix = new Matrix();
        this.f35562c = matrix;
        matrix.postTranslate(-rect.centerX(), -rect.centerY());
        if (rect.width() / rect.height() > this.f35564e.m13904a()) {
            float fHeight = rect.height() * this.f35564e.m13904a();
            iWidth2 = rect.height();
            iWidth = (int) fHeight;
        } else {
            iWidth = rect.width();
            iWidth2 = (int) (rect.width() / this.f35564e.m13904a());
        }
        this.f35562c.postRotate(this.f35561b - this.f35565f.m13893a());
        kay kayVar = this.f35565f;
        if (kayVar == kay.CLOCKWISE_0 || kayVar == kay.CLOCKWISE_180) {
            this.f35562c.postScale(true != this.f35566g ? 1.0f : -1.0f, 1.0f);
        } else {
            this.f35562c.postScale(1.0f, true != this.f35566g ? 1.0f : -1.0f);
        }
        RectF rectF = new RectF(0.0f, 0.0f, iWidth, iWidth2);
        this.f35562c.mapRect(rectF);
        this.f35562c.postScale(this.f35560a.width() / rectF.width(), this.f35560a.height() / rectF.height());
        this.f35562c.postTranslate(this.f35560a.width() / 2.0f, this.f35560a.height() / 2.0f);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13970e() {
        return this.f35562c != null;
    }
}
