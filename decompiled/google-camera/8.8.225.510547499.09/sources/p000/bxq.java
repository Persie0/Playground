package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxq {

    /* JADX INFO: renamed from: b */
    public static final Paint f4716b;

    /* JADX INFO: renamed from: c */
    public static final Lock f4717c;

    /* JADX INFO: renamed from: e */
    private static final Set f4719e;

    /* JADX INFO: renamed from: d */
    private static final Paint f4718d = new Paint(6);

    /* JADX INFO: renamed from: a */
    public static final Paint f4715a = new Paint(7);

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", IuyLAqNmW.iwAWoWpnLUWa, "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", aJFPpVSaoDO.JBWdxOwCzTtqZX, "XT1033", hIAHJKEnGsNbz.MnpavtVK, wUzNh.Pfc, "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", JrxsYuVZZqnFC.ASFJbROwnsUZzG, "XT1077", "XT1078", "XT1079"));
        f4719e = hashSet;
        f4717c = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new bxp();
        Paint paint = new Paint(7);
        f4716b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap.Config m3167a(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap.Config m3168b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m3169c(bti btiVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapMo3042a = btiVar.mo3042a((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m3168b(bitmap));
        m3172f(bitmap, bitmapMo3042a);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m3170d(bitmap, bitmapMo3042a, matrix);
        return bitmapMo3042a;
    }

    /* JADX INFO: renamed from: d */
    public static void m3170d(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f4717c.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4718d);
            m3171e(canvas);
        } finally {
            f4717c.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3171e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* JADX INFO: renamed from: f */
    public static void m3172f(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3173g(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }
}
