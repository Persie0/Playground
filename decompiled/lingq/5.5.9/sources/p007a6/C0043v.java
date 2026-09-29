package p007a6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0043v {

    /* JADX INFO: renamed from: a */
    public static final Paint f51a = new Paint(6);

    /* JADX INFO: renamed from: b */
    public static final Paint f52b = new Paint(7);

    /* JADX INFO: renamed from: c */
    public static final Paint f53c;

    /* JADX INFO: renamed from: d */
    public static final Lock f54d;

    /* JADX INFO: renamed from: a6.v$a */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }
    }

    static {
        f54d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f53c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static void m170a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f54d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f51a);
            canvas.setBitmap(null);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m171b(InterfaceC9452c interfaceC9452c, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapMo17857e = interfaceC9452c.mo17857e((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo17857e.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapMo17857e.getWidth() + "x" + bitmapMo17857e.getHeight());
            StringBuilder sb2 = new StringBuilder("minPct:   ");
            sb2.append(fMin);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m170a(bitmap, bitmapMo17857e, matrix);
        return bitmapMo17857e;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m172c(Bitmap bitmap, InterfaceC9452c interfaceC9452c) {
        Bitmap.Config configM173d = m173d(bitmap);
        if (configM173d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(bitmap.getWidth(), bitmap.getHeight(), configM173d);
        new Canvas(bitmapMo17857e).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo17857e;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap.Config m173d(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }
}
