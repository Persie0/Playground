package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbi {

    /* JADX INFO: renamed from: a */
    public static final char[] f4955a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f4956b = new char[64];

    /* JADX INFO: renamed from: c */
    private static volatile Handler f4957c;

    private cbi() {
    }

    /* JADX INFO: renamed from: a */
    public static int m3380a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + String.valueOf(bitmap) + hsSUWRJfoeC.vSEKVGG + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()));
    }

    /* JADX INFO: renamed from: b */
    public static int m3381b(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        switch (cbh.f4954a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 8;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3382c(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: d */
    public static int m3383d(Object obj, int i) {
        return m3382c(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: e */
    public static Handler m3384e() {
        if (f4957c == null) {
            synchronized (cbi.class) {
                if (f4957c == null) {
                    f4957c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f4957c;
    }

    /* JADX INFO: renamed from: f */
    public static List m3385f(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static Queue m3386g(int i) {
        return new ArrayDeque(i);
    }

    /* JADX INFO: renamed from: h */
    public static void m3387h() {
        if (!m3391l()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3388i(Runnable runnable) {
        m3384e().post(runnable);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3389j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3390k() {
        return !m3391l();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3391l() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3392m(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3393n(int i, int i2) {
        return m3392m(i) && m3392m(i2);
    }
}
