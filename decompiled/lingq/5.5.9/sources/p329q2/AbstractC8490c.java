package p329q2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8490c extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f45673a;

    /* JADX INFO: renamed from: b */
    public final int f45674b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f45677e;

    /* JADX INFO: renamed from: g */
    public float f45679g;

    /* JADX INFO: renamed from: k */
    public boolean f45683k;

    /* JADX INFO: renamed from: l */
    public int f45684l;

    /* JADX INFO: renamed from: m */
    public int f45685m;

    /* JADX INFO: renamed from: c */
    public final int f45675c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f45676d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f45678f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f45680h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f45681i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f45682j = true;

    public AbstractC8490c(Resources resources, Bitmap bitmap) {
        this.f45674b = 160;
        if (resources != null) {
            this.f45674b = resources.getDisplayMetrics().densityDpi;
        }
        this.f45673a = bitmap;
        int i10 = this.f45674b;
        this.f45684l = bitmap.getScaledWidth(i10);
        this.f45685m = bitmap.getScaledHeight(i10);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f45677e = new BitmapShader(bitmap, tileMode, tileMode);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16574a(int i10, int i11, int i12, Rect rect, Rect rect2);

    /* JADX INFO: renamed from: b */
    public final void m16575b(boolean z10) {
        this.f45683k = z10;
        this.f45682j = true;
        BitmapShader bitmapShader = this.f45677e;
        Paint paint = this.f45676d;
        if (z10) {
            this.f45679g = Math.min(this.f45685m, this.f45684l) / 2;
            paint.setShader(bitmapShader);
            invalidateSelf();
        } else {
            if (this.f45679g == 0.0f) {
                return;
            }
            this.f45683k = false;
            paint.setShader(null);
            this.f45679g = 0.0f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16576c() {
        if (this.f45682j) {
            boolean z10 = this.f45683k;
            Rect rect = this.f45680h;
            if (z10) {
                int iMin = Math.min(this.f45684l, this.f45685m);
                mo16574a(this.f45675c, iMin, iMin, getBounds(), this.f45680h);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f45679g = iMin2 * 0.5f;
            } else {
                mo16574a(this.f45675c, this.f45684l, this.f45685m, getBounds(), this.f45680h);
            }
            RectF rectF = this.f45681i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f45677e;
            if (bitmapShader != null) {
                Matrix matrix = this.f45678f;
                matrix.setTranslate(rectF.left, rectF.top);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f45673a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f45676d.setShader(bitmapShader);
            }
            this.f45682j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f45673a;
        if (bitmap == null) {
            return;
        }
        m16576c();
        Paint paint = this.f45676d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f45680h, paint);
            return;
        }
        RectF rectF = this.f45681i;
        float f3 = this.f45679g;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f45676d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f45676d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f45685m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f45684l;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f45675c == 119) {
            if (!this.f45683k) {
                Bitmap bitmap = this.f45673a;
                if (bitmap != null && !bitmap.hasAlpha() && this.f45676d.getAlpha() >= 255) {
                    if (!(this.f45679g > 0.05f)) {
                        return -1;
                    }
                }
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f45683k) {
            this.f45679g = Math.min(this.f45685m, this.f45684l) / 2;
        }
        this.f45682j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f45676d;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f45676d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f45676d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f45676d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
