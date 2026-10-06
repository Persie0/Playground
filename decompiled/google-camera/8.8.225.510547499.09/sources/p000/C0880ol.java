package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p021j$.util.Objects;

/* JADX INFO: renamed from: ol */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880ol extends Drawable {

    /* JADX INFO: renamed from: a */
    final Paint f46224a;

    /* JADX INFO: renamed from: b */
    public int f46225b;

    /* JADX INFO: renamed from: c */
    private Drawable f46226c;

    /* JADX INFO: renamed from: d */
    private final RectF f46227d = new RectF();

    public C0880ol() {
        Paint paint = new Paint();
        this.f46224a = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: b */
    private final void m18605b() {
        if (this.f46226c == null) {
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        Drawable drawable = this.f46226c;
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > intrinsicHeight) {
            int i = (((int) (iWidth * (intrinsicWidth / intrinsicHeight))) - iWidth) / 2;
            drawable.setBounds(-i, 0, iWidth + i, iHeight);
        } else {
            int i2 = (((int) (iHeight * (intrinsicHeight / intrinsicWidth))) - iHeight) / 2;
            drawable.setBounds(0, -i2, iWidth, iHeight + i2);
        }
        drawable.draw(canvas);
        this.f46224a.setShader(new BitmapShader(bitmapCreateBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: a */
    public final void m18606a(Drawable drawable) {
        if (Objects.equals(this.f46226c, drawable)) {
            return;
        }
        this.f46226c = drawable;
        m18605b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.f46226c == null || bounds.isEmpty()) {
            return;
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        RectF rectF = this.f46227d;
        float f = this.f46225b;
        canvas.drawRoundRect(rectF, f, f, this.f46224a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f46227d.right = rect.width();
        this.f46227d.bottom = rect.height();
        m18605b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f46224a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46224a.setColorFilter(colorFilter);
    }
}
