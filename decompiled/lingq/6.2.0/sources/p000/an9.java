package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class an9 {

    /* JADX INFO: renamed from: A */
    public int f896A;

    /* JADX INFO: renamed from: B */
    public int f897B;

    /* JADX INFO: renamed from: C */
    public int f898C;

    /* JADX INFO: renamed from: D */
    public int f899D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f900E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f901F;

    /* JADX INFO: renamed from: G */
    public int f902G;

    /* JADX INFO: renamed from: H */
    public int f903H;

    /* JADX INFO: renamed from: I */
    public int f904I;

    /* JADX INFO: renamed from: J */
    public Rect f905J;

    /* JADX INFO: renamed from: a */
    public final float f906a;

    /* JADX INFO: renamed from: b */
    public final float f907b;

    /* JADX INFO: renamed from: c */
    public final float f908c;

    /* JADX INFO: renamed from: d */
    public final float f909d;

    /* JADX INFO: renamed from: e */
    public final float f910e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f911f;

    /* JADX INFO: renamed from: g */
    public final Paint f912g;

    /* JADX INFO: renamed from: h */
    public final Paint f913h;

    /* JADX INFO: renamed from: i */
    public CharSequence f914i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f915j;

    /* JADX INFO: renamed from: k */
    public Bitmap f916k;

    /* JADX INFO: renamed from: l */
    public float f917l;

    /* JADX INFO: renamed from: m */
    public int f918m;

    /* JADX INFO: renamed from: n */
    public int f919n;

    /* JADX INFO: renamed from: o */
    public float f920o;

    /* JADX INFO: renamed from: p */
    public int f921p;

    /* JADX INFO: renamed from: q */
    public float f922q;

    /* JADX INFO: renamed from: r */
    public float f923r;

    /* JADX INFO: renamed from: s */
    public int f924s;

    /* JADX INFO: renamed from: t */
    public int f925t;

    /* JADX INFO: renamed from: u */
    public int f926u;

    /* JADX INFO: renamed from: v */
    public int f927v;

    /* JADX INFO: renamed from: w */
    public int f928w;

    /* JADX INFO: renamed from: x */
    public float f929x;

    /* JADX INFO: renamed from: y */
    public float f930y;

    /* JADX INFO: renamed from: z */
    public float f931z;

    public an9(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f910e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f909d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f906a = fRound;
        this.f907b = fRound;
        this.f908c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f911f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f912g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f913h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m616a(Canvas canvas, boolean z) {
        Canvas canvas2;
        if (!z) {
            this.f905J.getClass();
            this.f916k.getClass();
            canvas.drawBitmap(this.f916k, (Rect) null, this.f905J, this.f913h);
            return;
        }
        StaticLayout staticLayout = this.f900E;
        StaticLayout staticLayout2 = this.f901F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f902G, this.f903H);
        if (Color.alpha(this.f926u) > 0) {
            int i = this.f926u;
            Paint paint = this.f912g;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.f904I, 0.0f, staticLayout.getWidth() + this.f904I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.f928w;
        TextPaint textPaint = this.f911f;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f906a);
            textPaint.setColor(this.f927v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f907b;
            if (i2 == 2) {
                float f2 = this.f908c;
                textPaint.setShadowLayer(f, f2, f2, this.f927v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f927v;
                int i4 = z2 ? this.f927v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f924s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f924s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
