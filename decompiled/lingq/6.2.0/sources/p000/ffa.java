package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class ffa implements lr9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageView f39022a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f39023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f39024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f39025d;

    public ffa(ImageView imageView, float f, int i, ImageView imageView2) {
        this.f39022a = imageView;
        this.f39023b = f;
        this.f39024c = i;
        this.f39025d = imageView2;
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: p */
    public final void mo11812p(Drawable drawable) {
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        ImageView imageView = this.f39025d;
        if (bitmap == null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        float f = this.f39023b;
        if (f > 0.0f) {
            int i = (int) (2.0f * f);
            int width = bitmap.getWidth() / 2;
            int height = bitmap.getHeight() / 2;
            float fMin = Math.min(width, height);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + i, bitmap.getHeight() + i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            float f2 = width + f;
            float f3 = height + f;
            Paint paint = new Paint();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f2, f3, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, f, f, paint);
            paint.setXfermode(null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.f39024c);
            paint.setStrokeWidth(f);
            canvas.drawCircle(f2, f3, fMin, paint);
            bitmap = bitmapCreateBitmap;
        }
        pi8 pi8Var = new pi8(imageView.getResources(), bitmap);
        pi8Var.m19179a(true);
        imageView.setImageDrawable(pi8Var);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: s */
    public final void mo11813s(Drawable drawable) {
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: u */
    public final void mo11814u(Drawable drawable) {
        this.f39022a.setImageBitmap(null);
    }
}
