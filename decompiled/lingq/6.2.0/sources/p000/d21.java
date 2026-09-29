package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes2.dex */
public final class d21 implements l9a {

    /* JADX INFO: renamed from: a */
    public final String f34864a = d21.class.getName();

    @Override // p000.l9a
    /* JADX INFO: renamed from: a */
    public final Bitmap mo9995a(Bitmap bitmap, w89 w89Var) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }

    @Override // p000.l9a
    /* JADX INFO: renamed from: b */
    public final String mo9996b() {
        return this.f34864a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof d21;
    }

    public final int hashCode() {
        return d21.class.hashCode();
    }
}
