package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Size;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mfd {
    /* JADX INFO: renamed from: a */
    public static Bitmap m16809a(Context context, Uri uri, int i, int i2) {
        int i3;
        int i4;
        uri.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i5 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
                if (bitmapDecodeStream != null && (i3 = options.outWidth) > 0 && (i4 = options.outHeight) > 0) {
                    int i6 = i4 / 2;
                    int i7 = i3 / 2;
                    while (i6 / i5 >= i2 && i7 / i5 >= i) {
                        i5 *= 2;
                    }
                    options.inSampleSize = i5;
                    options.inJustDecodeBounds = false;
                    InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream2 != null) {
                        try {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                            inputStreamOpenInputStream2.close();
                            return bitmapDecodeStream2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC3584sr.m21646y(inputStreamOpenInputStream2, th);
                                throw th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3584sr.m21646y(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Size m16810b(int i, int i2) {
        if (i2 > 0) {
            int iMax = Math.max(1, (int) Math.sqrt(((i / 4) / i2) / 4));
            return new Size(Math.max(1, ss5.m21692S(((double) iMax) * 1.0d)), iMax);
        }
        C3386nv.m17626m("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m16811c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Size size = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        return size.getHeight() * size.getWidth() * 6;
    }
}
