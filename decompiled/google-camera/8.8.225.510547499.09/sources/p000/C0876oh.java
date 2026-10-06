package p000;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import android.text.TextPaint;

/* JADX INFO: renamed from: oh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876oh {

    /* JADX INFO: renamed from: a */
    public final TextPaint f45992a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f45993b;

    /* JADX INFO: renamed from: c */
    public final Paint f45994c;

    /* JADX INFO: renamed from: d */
    public final Paint f45995d;

    /* JADX INFO: renamed from: e */
    public final Paint f45996e;

    /* JADX INFO: renamed from: f */
    public final Paint f45997f;

    /* JADX INFO: renamed from: g */
    public final Paint f45998g;

    /* JADX INFO: renamed from: h */
    public final C0878oj f45999h;

    /* JADX INFO: renamed from: i */
    public final boolean f46000i;

    /* JADX INFO: renamed from: j */
    public final boolean f46001j;

    /* JADX INFO: renamed from: k */
    public final boolean f46002k;

    /* JADX INFO: renamed from: l */
    public final ColorFilter f46003l;

    public C0876oh(C0878oj c0878oj, boolean z, boolean z2, boolean z3) {
        ColorFilter colorMatrixColorFilter;
        this.f45999h = c0878oj;
        this.f46000i = z;
        this.f46001j = z2;
        this.f46002k = z3;
        boolean z4 = (z && z2) ? false : true;
        if (z2) {
            ComplicationStyle$Builder complicationStyle$Builder = new ComplicationStyle$Builder(c0878oj);
            if (c0878oj.f46139b != -16777216) {
                complicationStyle$Builder.f1331a = 0;
            }
            complicationStyle$Builder.f1333c = -1;
            complicationStyle$Builder.f1334d = -1;
            complicationStyle$Builder.f1340j = -1;
            int i = c0878oj.f46149l;
            if (i != -16777216 && i != 0) {
                complicationStyle$Builder.f1341k = -1;
            }
            complicationStyle$Builder.f1347q = -1;
            if (c0878oj.f46157t != -16777216) {
                complicationStyle$Builder.f1348r = 0;
            }
            c0878oj = complicationStyle$Builder.m1391a();
        }
        TextPaint textPaint = new TextPaint();
        this.f45992a = textPaint;
        textPaint.setColor(c0878oj.f46141d);
        textPaint.setAntiAlias(z4);
        textPaint.setTypeface(c0878oj.f46143f);
        textPaint.setTextSize(c0878oj.f46145h);
        textPaint.setAntiAlias(z4);
        if (z4) {
            colorMatrixColorFilter = new PorterDuffColorFilter(c0878oj.f46148k, PorterDuff.Mode.SRC_IN);
        } else {
            int i2 = c0878oj.f46148k;
            colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(i2), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(i2), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(i2), 0.0f, 0.0f, 0.0f, 255.0f, -32385.0f}));
        }
        this.f46003l = colorMatrixColorFilter;
        TextPaint textPaint2 = new TextPaint();
        this.f45993b = textPaint2;
        textPaint2.setColor(c0878oj.f46142e);
        textPaint2.setAntiAlias(z4);
        textPaint2.setTypeface(c0878oj.f46144g);
        textPaint2.setTextSize(c0878oj.f46146i);
        textPaint2.setAntiAlias(z4);
        Paint paint = new Paint();
        this.f45994c = paint;
        paint.setColor(c0878oj.f46156s);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(z4);
        paint.setStrokeWidth(c0878oj.f46155r);
        Paint paint2 = new Paint();
        this.f45995d = paint2;
        paint2.setColor(c0878oj.f46157t);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(z4);
        paint2.setStrokeWidth(c0878oj.f46155r);
        Paint paint3 = new Paint();
        this.f45996e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(c0878oj.f46149l);
        if (c0878oj.f46150m == 2) {
            paint3.setPathEffect(new DashPathEffect(new float[]{c0878oj.f46151n, c0878oj.f46152o}, 0.0f));
        }
        if (c0878oj.f46150m == 0) {
            paint3.setAlpha(0);
        }
        paint3.setStrokeWidth(c0878oj.f46154q);
        paint3.setAntiAlias(z4);
        Paint paint4 = new Paint();
        this.f45997f = paint4;
        paint4.setColor(c0878oj.f46139b);
        paint4.setAntiAlias(z4);
        Paint paint5 = new Paint();
        this.f45998g = paint5;
        paint5.setColor(c0878oj.f46158u);
        paint5.setAntiAlias(z4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18482a() {
        return this.f46000i && this.f46002k;
    }
}
