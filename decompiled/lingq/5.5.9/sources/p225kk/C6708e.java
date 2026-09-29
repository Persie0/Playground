package p225kk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import dm.C5207g;
import p192j6.C6413b;
import p329q2.C8489b;

/* JADX INFO: renamed from: kk.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6708e extends C6413b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f37924d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f37925e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f37926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6708e(ImageView imageView, float f3, int i10) {
        super(imageView);
        this.f37924d = imageView;
        this.f37925e = f3;
        this.f37926f = i10;
    }

    @Override // p192j6.C6413b, p192j6.AbstractC6417f
    /* JADX INFO: renamed from: d */
    public final void mo13035c(Bitmap bitmap) {
        C8489b c8489b = null;
        ImageView imageView = this.f37924d;
        if (bitmap != null) {
            Resources resources = imageView.getResources();
            float f3 = this.f37925e;
            if (f3 > 0.0f) {
                int i10 = (int) (2 * f3);
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                float fMin = Math.min(width, height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + i10, bitmap.getHeight() + i10, Bitmap.Config.ARGB_8888);
                float f10 = width + f3;
                float f11 = height + f3;
                Paint paint = new Paint();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f10, f11, fMin, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, f3, f3, paint);
                paint.setXfermode(null);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.f37926f);
                paint.setStrokeWidth(f3);
                canvas.drawCircle(f10, f11, fMin, paint);
                C5207g.m11110e(bitmapCreateBitmap, "newBitmap");
                bitmap = bitmapCreateBitmap;
            }
            c8489b = new C8489b(resources, bitmap);
            c8489b.m16575b(true);
        }
        imageView.setImageDrawable(c8489b);
    }

    @Override // p192j6.AbstractC6417f, p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public final void mo12737k(Drawable drawable) {
        super.mo12737k(drawable);
        this.f37924d.setImageBitmap(null);
    }
}
