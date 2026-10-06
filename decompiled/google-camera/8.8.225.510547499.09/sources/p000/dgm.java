package p000;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.function.BooleanSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgm {

    /* JADX INFO: renamed from: e */
    public final Paint f10925e;

    /* JADX INFO: renamed from: f */
    public final CameraCoachHudView f10926f;

    /* JADX INFO: renamed from: g */
    public final BooleanSupplier f10927g;

    /* JADX INFO: renamed from: k */
    public fhs f10931k;

    /* JADX INFO: renamed from: l */
    public fhs f10932l;

    /* JADX INFO: renamed from: m */
    public final dsx f10933m;

    /* JADX INFO: renamed from: n */
    public final dsx f10934n;

    /* JADX INFO: renamed from: o */
    public final dsx f10935o;

    /* JADX INFO: renamed from: p */
    public final dsx f10936p;

    /* JADX INFO: renamed from: a */
    public final float f10921a = ill.m11431b(8.0f);

    /* JADX INFO: renamed from: b */
    public final float f10922b = ill.m11431b(2.0f);

    /* JADX INFO: renamed from: c */
    public final float f10923c = ill.m11431b(56.0f);

    /* JADX INFO: renamed from: d */
    public final float f10924d = ill.m11431b(4.0f);

    /* JADX INFO: renamed from: h */
    public boolean f10928h = false;

    /* JADX INFO: renamed from: i */
    public boolean f10929i = false;

    /* JADX INFO: renamed from: j */
    public boolean f10930j = false;

    public dgm(CameraCoachHudView cameraCoachHudView, BooleanSupplier booleanSupplier) {
        this.f10926f = cameraCoachHudView;
        this.f10927g = booleanSupplier;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth(ill.m11431b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth(ill.m11431b(1.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStrokeWidth(ill.m11431b(2.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint4 = new Paint();
        paint4.setColor(Color.parseColor("#FDD663"));
        paint4.setStrokeWidth(ill.m11431b(2.0f));
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.SQUARE);
        paint4.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint5 = new Paint();
        paint5.setColor(-1);
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint5.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        Paint paint6 = new Paint();
        paint6.setColor(Color.parseColor("#FDD663"));
        paint6.setAntiAlias(true);
        paint6.setAlpha(255);
        paint6.setTextAlign(Paint.Align.CENTER);
        paint6.setTextSize(cameraCoachHudView.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint6.setShadowLayer(ill.m11431b(4.0f), 0.0f, ill.m11431b(1.0f), -16777216);
        this.f10933m = new dsx(paint2, paint6);
        this.f10934n = new dsx(paint4, paint6);
        this.f10935o = new dsx(paint, paint5);
        this.f10936p = new dsx(paint3, paint5);
        Paint paint7 = new Paint();
        this.f10925e = paint7;
        paint7.setColor(Color.parseColor("#FDD663"));
        paint7.setStrokeWidth(ill.m11431b(1.0f));
        paint7.setAntiAlias(true);
        paint7.setAlpha(255);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeCap(Paint.Cap.SQUARE);
    }

    /* JADX INFO: renamed from: a */
    public final void m6108a() {
        boolean z = this.f10928h;
        this.f10928h = false;
        if (z) {
            this.f10931k = null;
            this.f10932l = null;
            this.f10930j = false;
            this.f10926f.invalidate();
        }
    }
}
