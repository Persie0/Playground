package p258m6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: m6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7492l {

    /* JADX INFO: renamed from: a */
    public static final char[] f41383a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f41384b = new char[64];

    /* JADX INFO: renamed from: c */
    public static volatile Handler f41385c;

    /* JADX INFO: renamed from: m6.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41386a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f41386a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41386a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41386a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41386a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41386a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m14880a() {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14881b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public static int m14882c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m14883d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        while (true) {
            for (Object obj : set) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static Handler m14884e() {
        if (f41385c == null) {
            synchronized (C7492l.class) {
                if (f41385c == null) {
                    f41385c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f41385c;
    }

    /* JADX INFO: renamed from: f */
    public static int m14885f(int i10, Object obj) {
        return (i10 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static int m14886g(int i10, boolean z10) {
        return (i10 * 31) + (z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14887h() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14888i(int i10, int i11) {
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }
        return false;
    }
}
