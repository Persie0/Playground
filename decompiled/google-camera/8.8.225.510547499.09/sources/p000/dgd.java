package p000;

import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dgd {

    /* JADX INFO: renamed from: a */
    public static final float f10866a = ill.m11431b(18.0f);

    /* JADX INFO: renamed from: b */
    public static final float f10867b = ill.m11431b(2.0f);

    /* JADX INFO: renamed from: c */
    public static final float f10868c = ill.m11431b(12.0f);

    /* JADX INFO: renamed from: d */
    public static final float f10869d = ill.m11431b(7.0f);

    /* JADX INFO: renamed from: e */
    public final CameraCoachHudView f10870e;

    /* JADX INFO: renamed from: f */
    public final Paint f10871f;

    /* JADX INFO: renamed from: g */
    public final Paint f10872g;

    /* JADX INFO: renamed from: h */
    public final Paint f10873h;

    /* JADX INFO: renamed from: i */
    public boolean f10874i;

    /* JADX INFO: renamed from: j */
    public boolean f10875j;

    /* JADX INFO: renamed from: k */
    public float f10876k;

    /* JADX INFO: renamed from: l */
    public float f10877l;

    /* JADX INFO: renamed from: m */
    public float f10878m = 9.424778f;

    /* JADX INFO: renamed from: n */
    public float f10879n = 9.424778f;

    /* JADX INFO: renamed from: o */
    public float f10880o = 4.0f;

    public dgd(CameraCoachHudView cameraCoachHudView) {
        this.f10870e = cameraCoachHudView;
        Paint paint = new Paint();
        this.f10871f = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(ill.m11431b(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(153);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint2 = new Paint();
        this.f10872g = paint2;
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setAlpha(153);
        Paint paint3 = new Paint();
        this.f10873h = paint3;
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setAlpha(153);
    }

    /* JADX INFO: renamed from: a */
    public final void m6097a() {
        boolean z = this.f10874i;
        this.f10874i = false;
        if (z) {
            this.f10878m = 9.424778f;
            this.f10879n = 9.424778f;
            this.f10870e.invalidate();
        }
    }
}
