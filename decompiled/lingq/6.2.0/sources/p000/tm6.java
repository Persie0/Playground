package p000;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class tm6 extends xm6 {

    /* JADX INFO: renamed from: d */
    public IconCompat f62527d;

    /* JADX INFO: renamed from: e */
    public IconCompat f62528e;

    /* JADX INFO: renamed from: f */
    public boolean f62529f;

    @Override // p000.xm6
    /* JADX INFO: renamed from: a */
    public final void mo22233a(C3329mb c3329mb) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) c3329mb.f50861c;
        Context context = (Context) c3329mb.f50860b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f62527d;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                sm6.m21474a(bigContentTitle, iconCompat.m1997d(context));
            } else {
                int type = iconCompat.f5504a;
                if (type == -1) {
                    type = ((Icon) iconCompat.f5505b).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.f62527d;
                    int i = iconCompat2.f5504a;
                    if (i == -1) {
                        Object obj = iconCompat2.f5505b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.f5505b;
                    } else {
                        if (i != 5) {
                            ij6.m13966x(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f5505b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f62529f) {
            IconCompat iconCompat3 = this.f62528e;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.m1997d(context));
            }
        }
        if (this.f68351c) {
            bigContentTitle.setSummaryText(this.f68350b);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            sm6.m21476c(bigContentTitle, false);
            sm6.m21475b(bigContentTitle, null);
        }
    }

    @Override // p000.xm6
    /* JADX INFO: renamed from: b */
    public final String mo22234b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
