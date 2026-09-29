package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: loaded from: classes2.dex */
public final class pi8 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f56253a;

    /* JADX INFO: renamed from: b */
    public final int f56254b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f56257e;

    /* JADX INFO: renamed from: g */
    public float f56259g;

    /* JADX INFO: renamed from: k */
    public boolean f56263k;

    /* JADX INFO: renamed from: l */
    public final int f56264l;

    /* JADX INFO: renamed from: m */
    public final int f56265m;

    /* JADX INFO: renamed from: c */
    public final int f56255c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f56256d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f56258f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f56260h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f56261i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f56262j = true;

    public pi8(Resources resources, Bitmap bitmap) {
        this.f56254b = 160;
        if (resources != null) {
            this.f56254b = resources.getDisplayMetrics().densityDpi;
        }
        this.f56253a = bitmap;
        int i = this.f56254b;
        this.f56264l = bitmap.getScaledWidth(i);
        this.f56265m = bitmap.getScaledHeight(i);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f56257e = new BitmapShader(bitmap, tileMode, tileMode);
    }

    /* JADX INFO: renamed from: a */
    public final void m19179a(boolean z) {
        this.f56263k = z;
        this.f56262j = true;
        Paint paint = this.f56256d;
        if (z) {
            this.f56259g = Math.min(this.f56265m, this.f56264l) / 2;
            paint.setShader(this.f56257e);
            invalidateSelf();
        } else {
            if (this.f56259g == 0.0f) {
                return;
            }
            this.f56263k = false;
            paint.setShader(null);
            this.f56259g = 0.0f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19180b() {
        if (this.f56262j) {
            boolean z = this.f56263k;
            Rect rect = this.f56260h;
            if (z) {
                int iMin = Math.min(this.f56264l, this.f56265m);
                Gravity.apply(this.f56255c, iMin, iMin, getBounds(), this.f56260h, 0);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f56259g = iMin2 * 0.5f;
            } else {
                Gravity.apply(this.f56255c, this.f56264l, this.f56265m, getBounds(), this.f56260h, 0);
            }
            RectF rectF = this.f56261i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f56257e;
            if (bitmapShader != null) {
                float f = rectF.left;
                float f2 = rectF.top;
                Matrix matrix = this.f56258f;
                matrix.setTranslate(f, f2);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f56253a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f56256d.setShader(bitmapShader);
            }
            this.f56262j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f56253a;
        if (bitmap == null) {
            return;
        }
        m19180b();
        Paint paint = this.f56256d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f56260h, paint);
            return;
        }
        RectF rectF = this.f56261i;
        float f = this.f56259g;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f56256d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f56256d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f56265m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f56264l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f56255c != 119 || this.f56263k || (bitmap = this.f56253a) == null || bitmap.hasAlpha() || this.f56256d.getAlpha() < 255 || this.f56259g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        m19180b();
        outline.setRoundRect(this.f56260h, this.f56259g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f56263k) {
            this.f56259g = Math.min(this.f56265m, this.f56264l) / 2;
        }
        this.f56262j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f56256d;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f56256d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f56256d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f56256d.setFilterBitmap(z);
        invalidateSelf();
    }
}
