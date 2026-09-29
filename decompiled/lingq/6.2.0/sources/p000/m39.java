package p000;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m39 {

    /* JADX INFO: renamed from: i */
    public static final int[] f50513i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f50514j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f50515k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f50516l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f50517a;

    /* JADX INFO: renamed from: b */
    public final Paint f50518b;

    /* JADX INFO: renamed from: c */
    public final Paint f50519c;

    /* JADX INFO: renamed from: d */
    public int f50520d;

    /* JADX INFO: renamed from: e */
    public int f50521e;

    /* JADX INFO: renamed from: f */
    public int f50522f;

    /* JADX INFO: renamed from: g */
    public final Path f50523g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f50524h;

    public m39() {
        Paint paint = new Paint();
        this.f50524h = paint;
        this.f50517a = new Paint();
        m16614a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f50518b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f50519c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m16614a(int i) {
        this.f50520d = ya1.m25016i(i, 68);
        this.f50521e = ya1.m25016i(i, 20);
        this.f50522f = ya1.m25016i(i, 0);
        this.f50517a.setColor(this.f50520d);
    }
}
