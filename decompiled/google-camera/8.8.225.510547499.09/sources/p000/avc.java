package p000;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avc {

    /* JADX INFO: renamed from: a */
    public final float f2477a;

    /* JADX INFO: renamed from: b */
    public final float f2478b;

    /* JADX INFO: renamed from: c */
    public float f2479c;

    /* JADX INFO: renamed from: d */
    private final int[] f2480d = {-16777216, 0};

    /* JADX INFO: renamed from: e */
    private final float[] f2481e = {0.6f, 1.0f};

    /* JADX INFO: renamed from: f */
    private final RectF f2482f = new RectF();

    /* JADX INFO: renamed from: g */
    private final Paint f2483g;

    /* JADX INFO: renamed from: h */
    private float f2484h;

    /* JADX INFO: renamed from: i */
    private final float f2485i;

    public avc(float f, float f2, float f3) {
        Paint paint = new Paint();
        this.f2483g = paint;
        this.f2477a = f;
        this.f2478b = 0.0f;
        this.f2479c = f2;
        this.f2485i = f3;
        this.f2484h = f2 + f3 + (f * 0.0f);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        m2049b();
    }

    /* JADX INFO: renamed from: a */
    public final void m2048a(int i, int i2, int i3, int i4) {
        this.f2482f.set(i, i2, i3, i4);
        m2049b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2049b() {
        float f = this.f2479c + this.f2485i + (this.f2477a * 0.0f);
        this.f2484h = f;
        if (f > 0.0f) {
            this.f2483g.setShader(new RadialGradient(this.f2482f.centerX(), this.f2482f.centerY(), this.f2484h, this.f2480d, this.f2481e, Shader.TileMode.MIRROR));
        }
    }
}
