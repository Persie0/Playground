package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.function.BooleanSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgy {

    /* JADX INFO: renamed from: n */
    private static final float f11001n = ill.m11431b(18.0f);

    /* JADX INFO: renamed from: o */
    private static final float f11002o = ill.m11431b(2.0f);

    /* JADX INFO: renamed from: a */
    public final CameraCoachHudView f11003a;

    /* JADX INFO: renamed from: b */
    public final Paint f11004b;

    /* JADX INFO: renamed from: c */
    public final Paint f11005c;

    /* JADX INFO: renamed from: d */
    public final Paint f11006d;

    /* JADX INFO: renamed from: e */
    public final Paint f11007e;

    /* JADX INFO: renamed from: f */
    public final Paint f11008f;

    /* JADX INFO: renamed from: g */
    public final BooleanSupplier f11009g;

    /* JADX INFO: renamed from: h */
    public boolean f11010h;

    /* JADX INFO: renamed from: i */
    public float f11011i;

    /* JADX INFO: renamed from: j */
    public float f11012j;

    /* JADX INFO: renamed from: k */
    public float f11013k = 9.424778f;

    /* JADX INFO: renamed from: l */
    public float f11014l = 9.424778f;

    /* JADX INFO: renamed from: m */
    public boolean f11015m = false;

    public dgy(CameraCoachHudView cameraCoachHudView, BooleanSupplier booleanSupplier) {
        this.f11003a = cameraCoachHudView;
        this.f11009g = booleanSupplier;
        Paint paint = new Paint();
        this.f11004b = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(ill.m11431b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint2 = new Paint();
        this.f11006d = paint2;
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth(ill.m11431b(2.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint3 = new Paint();
        this.f11007e = paint3;
        paint3.setColor(Color.parseColor("#FDD663"));
        paint3.setStrokeWidth(ill.m11431b(1.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint4 = new Paint();
        this.f11005c = paint4;
        paint4.setColor(-1);
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        Paint paint5 = new Paint();
        this.f11008f = paint5;
        paint5.setColor(Color.parseColor("#FDD663"));
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
    }

    /* JADX INFO: renamed from: a */
    public static void m6131a(float f, float f2, Paint paint, Paint paint2, Canvas canvas) {
        float f3 = f11002o;
        canvas.drawCircle(f, f2, f3, paint2);
        float f4 = f11001n;
        canvas.drawLine(f - (f4 / 2.0f), f2, f - f3, f2, paint);
        canvas.drawLine(f + (f4 / 2.0f), f2, f + f3, f2, paint);
        canvas.drawLine(f, f2 - (f4 / 2.0f), f, f2 - f3, paint);
        canvas.drawLine(f, f2 + (f4 / 2.0f), f, f2 + f3, paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m6132b() {
        boolean z = this.f11010h;
        this.f11010h = false;
        if (z) {
            this.f11013k = 9.424778f;
            this.f11014l = 9.424778f;
            this.f11015m = false;
            this.f11003a.invalidate();
        }
    }
}
