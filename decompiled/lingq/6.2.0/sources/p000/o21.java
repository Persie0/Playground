package p000;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class o21 {

    /* JADX INFO: renamed from: a */
    public final RectF f53627a = new RectF();

    /* JADX INFO: renamed from: b */
    public final Paint f53628b;

    /* JADX INFO: renamed from: c */
    public final Paint f53629c;

    /* JADX INFO: renamed from: d */
    public final Paint f53630d;

    /* JADX INFO: renamed from: e */
    public float f53631e;

    /* JADX INFO: renamed from: f */
    public float f53632f;

    /* JADX INFO: renamed from: g */
    public float f53633g;

    /* JADX INFO: renamed from: h */
    public float f53634h;

    /* JADX INFO: renamed from: i */
    public int[] f53635i;

    /* JADX INFO: renamed from: j */
    public int f53636j;

    /* JADX INFO: renamed from: k */
    public float f53637k;

    /* JADX INFO: renamed from: l */
    public float f53638l;

    /* JADX INFO: renamed from: m */
    public float f53639m;

    /* JADX INFO: renamed from: n */
    public boolean f53640n;

    /* JADX INFO: renamed from: o */
    public Path f53641o;

    /* JADX INFO: renamed from: p */
    public float f53642p;

    /* JADX INFO: renamed from: q */
    public float f53643q;

    /* JADX INFO: renamed from: r */
    public int f53644r;

    /* JADX INFO: renamed from: s */
    public int f53645s;

    /* JADX INFO: renamed from: t */
    public int f53646t;

    /* JADX INFO: renamed from: u */
    public int f53647u;

    public o21() {
        Paint paint = new Paint();
        this.f53628b = paint;
        Paint paint2 = new Paint();
        this.f53629c = paint2;
        Paint paint3 = new Paint();
        this.f53630d = paint3;
        this.f53631e = 0.0f;
        this.f53632f = 0.0f;
        this.f53633g = 0.0f;
        this.f53634h = 5.0f;
        this.f53642p = 1.0f;
        this.f53646t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m17769a(int i) {
        this.f53636j = i;
        this.f53647u = this.f53635i[i];
    }
}
