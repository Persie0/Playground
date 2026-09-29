package p232l2;

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

/* JADX INFO: renamed from: l2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7234m extends AbstractC7237p {

    /* JADX INFO: renamed from: d */
    public IconCompat f40637d;

    /* JADX INFO: renamed from: e */
    public IconCompat f40638e;

    /* JADX INFO: renamed from: f */
    public boolean f40639f;

    /* JADX INFO: renamed from: l2.m$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m14569a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        /* JADX INFO: renamed from: b */
        public static void m14570b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* JADX INFO: renamed from: l2.m$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m14571a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* JADX INFO: renamed from: l2.m$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static void m14572a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        /* JADX INFO: renamed from: b */
        public static void m14573b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: c */
        public static void m14574c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // p232l2.AbstractC7237p
    /* JADX INFO: renamed from: b */
    public final void mo60b(C7238q c7238q) {
        Bitmap bitmap;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(c7238q.f40670b).setBigContentTitle(null);
        IconCompat iconCompat = this.f40637d;
        Context context = c7238q.f40669a;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.m14572a(bigContentTitle, IconCompat.C0778a.m2971f(iconCompat, context));
            } else {
                int iM2968c = iconCompat.f5582a;
                if (iM2968c == -1) {
                    iM2968c = IconCompat.C0778a.m2968c(iconCompat.f5583b);
                }
                if (iM2968c == 1) {
                    IconCompat iconCompat2 = this.f40637d;
                    int i11 = iconCompat2.f5582a;
                    if (i11 == -1) {
                        Object obj = iconCompat2.f5583b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i11 == 1) {
                        bitmap = (Bitmap) iconCompat2.f5583b;
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f5583b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f3 = iMin;
                        float f10 = 0.5f * f3;
                        float f11 = 0.9166667f * f10;
                        float f12 = 0.010416667f * f3;
                        paint.setColor(0);
                        paint.setShadowLayer(f12, 0.0f, f3 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f10, f10, f11, paint);
                        paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f10, f10, f11, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f10, f10, f11, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f40639f) {
            IconCompat iconCompat3 = this.f40638e;
            if (iconCompat3 == null) {
                a.m14569a(bigContentTitle, null);
            } else {
                b.m14571a(bigContentTitle, IconCompat.C0778a.m2971f(iconCompat3, context));
            }
        }
        if (this.f40668c) {
            a.m14570b(bigContentTitle, this.f40667b);
        }
        if (i10 >= 31) {
            c.m14574c(bigContentTitle, false);
            c.m14573b(bigContentTitle, null);
        }
    }

    @Override // p232l2.AbstractC7237p
    /* JADX INFO: renamed from: c */
    public final String mo14568c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
