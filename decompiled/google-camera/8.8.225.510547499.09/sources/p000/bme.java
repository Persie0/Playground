package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bme {

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f3753b = new bma();

    /* JADX INFO: renamed from: c */
    private static final ThreadLocal f3754c = new bmb();

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f3755d = new bmc();

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3752a = new bmd();

    /* JADX INFO: renamed from: e */
    private static final float f3756e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: f */
    private static float f3757f = -1.0f;

    /* JADX INFO: renamed from: a */
    public static float m2701a() {
        float f = f3757f;
        if (f != -1.0f) {
            return f;
        }
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        f3757f = f2;
        return f2;
    }

    /* JADX INFO: renamed from: b */
    public static float m2702b(Matrix matrix) {
        float[] fArr = (float[]) f3752a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f3756e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m2703c(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static void m2704d(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f3753b.get();
        Path path2 = (Path) f3754c.get();
        Path path3 = (Path) f3755d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            bgh.m2413a();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            bgh.m2413a();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = blz.m2694b(fMin, length);
            fMax = blz.m2694b(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = blz.m2694b(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = blz.m2694b(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            bgh.m2413a();
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
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: e */
    public static void m2705e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2706f(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        bgh.m2413a();
    }
}
