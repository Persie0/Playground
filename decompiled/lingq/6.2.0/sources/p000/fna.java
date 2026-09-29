package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.provider.Settings;
import com.airbnb.lottie.AsyncUpdates;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fna {

    /* JADX INFO: renamed from: a */
    public static final Matrix f39347a = new Matrix();

    /* JADX INFO: renamed from: b */
    public static final C3490qa f39348b = new C3490qa(4);

    /* JADX INFO: renamed from: c */
    public static final C3490qa f39349c = new C3490qa(5);

    /* JADX INFO: renamed from: d */
    public static final C3490qa f39350d = new C3490qa(6);

    /* JADX INFO: renamed from: e */
    public static final C3490qa f39351e = new C3490qa(7);

    /* JADX INFO: renamed from: f */
    public static final float f39352f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: a */
    public static void m11955a(Path path, float f, float f2, float f3) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        PathMeasure pathMeasure = (PathMeasure) f39348b.get();
        Path path2 = (Path) f39349c.get();
        Path path3 = (Path) f39350d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = f06.m11423d(fMin, length);
                fMax = f06.m11423d(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = f06.m11423d(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = f06.m11423d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11956b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m11957c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static float m11958d(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m11959e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: f */
    public static void m11960f(Canvas canvas, RectF rectF, Paint paint) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        canvas.saveLayer(rectF, paint);
    }
}
