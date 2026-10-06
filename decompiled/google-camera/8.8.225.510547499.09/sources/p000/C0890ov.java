package p000;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: ov */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0890ov {

    /* JADX INFO: renamed from: a */
    public final float f46614a;

    /* JADX INFO: renamed from: b */
    public final float f46615b;

    /* JADX INFO: renamed from: c */
    public float f46616c;

    /* JADX INFO: renamed from: d */
    private final int[] f46617d = {-16777216, 0};

    /* JADX INFO: renamed from: e */
    private final float[] f46618e = {0.6f, 1.0f};

    /* JADX INFO: renamed from: f */
    private final RectF f46619f = new RectF();

    /* JADX INFO: renamed from: g */
    private final Paint f46620g;

    /* JADX INFO: renamed from: h */
    private float f46621h;

    /* JADX INFO: renamed from: i */
    private final float f46622i;

    public C0890ov(float f, float f2, float f3) {
        Paint paint = new Paint();
        this.f46620g = paint;
        this.f46614a = f;
        this.f46615b = 0.0f;
        this.f46616c = f2;
        this.f46622i = f3;
        this.f46621h = f2 + f3 + (f * 0.0f);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        m19083b();
    }

    /* JADX INFO: renamed from: a */
    public final void m19082a(int i, int i2, int i3, int i4) {
        this.f46619f.set(i, i2, i3, i4);
        m19083b();
    }

    /* JADX INFO: renamed from: b */
    public final void m19083b() {
        float f = this.f46616c + this.f46622i + (this.f46614a * 0.0f);
        this.f46621h = f;
        if (f > 0.0f) {
            this.f46620g.setShader(new RadialGradient(this.f46619f.centerX(), this.f46619f.centerY(), this.f46621h, this.f46617d, this.f46618e, Shader.TileMode.MIRROR));
        }
    }
}
