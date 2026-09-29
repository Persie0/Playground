package p117fd;

import android.graphics.Paint;
import android.graphics.Path;
import p312p2.C8169a;

/* JADX INFO: renamed from: fd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5507a {

    /* JADX INFO: renamed from: i */
    public static final int[] f34135i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f34136j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f34137k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f34138l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f34139a;

    /* JADX INFO: renamed from: b */
    public final Paint f34140b;

    /* JADX INFO: renamed from: c */
    public final Paint f34141c;

    /* JADX INFO: renamed from: d */
    public int f34142d;

    /* JADX INFO: renamed from: e */
    public int f34143e;

    /* JADX INFO: renamed from: f */
    public int f34144f;

    /* JADX INFO: renamed from: g */
    public final Path f34145g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f34146h;

    public C5507a() {
        Paint paint = new Paint();
        this.f34146h = paint;
        this.f34139a = new Paint();
        m11738a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f34140b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f34141c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m11738a(int i10) {
        this.f34142d = C8169a.m16216h(i10, 68);
        this.f34143e = C8169a.m16216h(i10, 20);
        this.f34144f = C8169a.m16216h(i10, 0);
        this.f34139a.setColor(this.f34142d);
    }
}
