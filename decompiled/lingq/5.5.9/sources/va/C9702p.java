package va;

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

/* JADX INFO: renamed from: va.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9702p {

    /* JADX INFO: renamed from: A */
    public int f49678A;

    /* JADX INFO: renamed from: B */
    public int f49679B;

    /* JADX INFO: renamed from: C */
    public int f49680C;

    /* JADX INFO: renamed from: D */
    public int f49681D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f49682E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f49683F;

    /* JADX INFO: renamed from: G */
    public int f49684G;

    /* JADX INFO: renamed from: H */
    public int f49685H;

    /* JADX INFO: renamed from: I */
    public int f49686I;

    /* JADX INFO: renamed from: J */
    public Rect f49687J;

    /* JADX INFO: renamed from: a */
    public final float f49688a;

    /* JADX INFO: renamed from: b */
    public final float f49689b;

    /* JADX INFO: renamed from: c */
    public final float f49690c;

    /* JADX INFO: renamed from: d */
    public final float f49691d;

    /* JADX INFO: renamed from: e */
    public final float f49692e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f49693f;

    /* JADX INFO: renamed from: g */
    public final Paint f49694g;

    /* JADX INFO: renamed from: h */
    public final Paint f49695h;

    /* JADX INFO: renamed from: i */
    public CharSequence f49696i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f49697j;

    /* JADX INFO: renamed from: k */
    public Bitmap f49698k;

    /* JADX INFO: renamed from: l */
    public float f49699l;

    /* JADX INFO: renamed from: m */
    public int f49700m;

    /* JADX INFO: renamed from: n */
    public int f49701n;

    /* JADX INFO: renamed from: o */
    public float f49702o;

    /* JADX INFO: renamed from: p */
    public int f49703p;

    /* JADX INFO: renamed from: q */
    public float f49704q;

    /* JADX INFO: renamed from: r */
    public float f49705r;

    /* JADX INFO: renamed from: s */
    public int f49706s;

    /* JADX INFO: renamed from: t */
    public int f49707t;

    /* JADX INFO: renamed from: u */
    public int f49708u;

    /* JADX INFO: renamed from: v */
    public int f49709v;

    /* JADX INFO: renamed from: w */
    public int f49710w;

    /* JADX INFO: renamed from: x */
    public float f49711x;

    /* JADX INFO: renamed from: y */
    public float f49712y;

    /* JADX INFO: renamed from: z */
    public float f49713z;

    public C9702p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f49692e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f49691d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f49688a = fRound;
        this.f49689b = fRound;
        this.f49690c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f49693f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f49694g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f49695h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m18213a(Canvas canvas, boolean z10) {
        if (!z10) {
            this.f49687J.getClass();
            this.f49698k.getClass();
            canvas.drawBitmap(this.f49698k, (Rect) null, this.f49687J, this.f49695h);
            return;
        }
        StaticLayout staticLayout = this.f49682E;
        StaticLayout staticLayout2 = this.f49683F;
        if (staticLayout != null && staticLayout2 != null) {
            int iSave = canvas.save();
            canvas.translate(this.f49684G, this.f49685H);
            if (Color.alpha(this.f49708u) > 0) {
                Paint paint = this.f49694g;
                paint.setColor(this.f49708u);
                canvas.drawRect(-this.f49686I, 0.0f, staticLayout.getWidth() + this.f49686I, staticLayout.getHeight(), paint);
            }
            int i10 = this.f49710w;
            TextPaint textPaint = this.f49693f;
            boolean z11 = true;
            if (i10 == 1) {
                textPaint.setStrokeJoin(Paint.Join.ROUND);
                textPaint.setStrokeWidth(this.f49688a);
                textPaint.setColor(this.f49709v);
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else {
                float f3 = this.f49689b;
                if (i10 == 2) {
                    float f10 = this.f49690c;
                    textPaint.setShadowLayer(f3, f10, f10, this.f49709v);
                } else if (i10 == 3 || i10 == 4) {
                    if (i10 != 3) {
                        z11 = false;
                    }
                    int i11 = -1;
                    int i12 = z11 ? -1 : this.f49709v;
                    if (z11) {
                        i11 = this.f49709v;
                    }
                    float f11 = f3 / 2.0f;
                    textPaint.setColor(this.f49706s);
                    textPaint.setStyle(Paint.Style.FILL);
                    float f12 = -f11;
                    textPaint.setShadowLayer(f3, f12, f12, i12);
                    staticLayout2.draw(canvas);
                    textPaint.setShadowLayer(f3, f11, f11, i11);
                }
            }
            textPaint.setColor(this.f49706s);
            textPaint.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(iSave);
        }
    }
}
