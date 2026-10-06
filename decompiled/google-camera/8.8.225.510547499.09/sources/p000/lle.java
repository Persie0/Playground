package p000;

import android.os.Binder;
import android.os.Looper;
import android.util.Log;
import com.google.lens.sdk.LensApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lle {
    public lle() {
    }

    public lle(byte[] bArr) {
    }

    public lle(char[] cArr) {
    }

    /* JADX INFO: renamed from: a */
    private static void m15684a(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }

    /* JADX INFO: renamed from: e */
    public static String m15685e(String str) {
        return new String(str);
    }

    /* JADX INFO: renamed from: f */
    public static Object m15686f(lpb lpbVar) {
        try {
            return lpbVar.mo15792a();
        } catch (SecurityException e) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lpbVar.mo15792a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static nzw m15687g(ksi ksiVar) {
        nzw nzwVarM18392b = oaq.m18392b(ksiVar.mo14815a());
        nzwVarM18392b.getClass();
        return nzwVarM18392b;
    }

    /* JADX INFO: renamed from: h */
    public static String m15688h(nzw nzwVar) {
        String str;
        oaq.m18393c(nzwVar);
        long j = nzwVar.f45103a;
        int i = nzwVar.f45104b;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) oaq.f45171d.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            if (i % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i / 1000000));
            } else {
                str = i % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
            }
            sb.append(str);
        }
        sb.append("Z");
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m15689i(float f, float f2) {
        return Math.abs(f - f2) <= 0.0f;
    }

    /* JADX INFO: renamed from: j */
    public static FloatBuffer m15690j(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: k */
    public static int m15691k(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
            default:
                return 0;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m15692l() {
        m15693m(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    /* JADX INFO: renamed from: m */
    public static void m15693m(boolean z, String str) {
        if (z) {
            return;
        }
        m15684a(new IllegalStateException(str));
    }

    /* JADX INFO: renamed from: n */
    public static void m15694n(Object obj) {
        if (obj == null) {
            m15684a(new NullPointerException());
        }
    }

    /* JADX INFO: renamed from: o */
    public static nps m15695o(jpp jppVar) {
        kuj kujVar = new kuj(jppVar);
        jppVar.mo13455h(not.INSTANCE, new fbu(kujVar, 2));
        return kujVar;
    }

    /* JADX INFO: renamed from: p */
    public static Executor m15696p(ksr ksrVar) {
        if (kua.m14865d(ksrVar.f37126a)) {
            jmv jmvVar = jmw.f34379a;
            return jmv.m13374a(10, Executors.defaultThreadFactory());
        }
        return new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), kue.f37214a);
    }

    /* JADX INFO: renamed from: q */
    public static String m15697q(kpz kpzVar) {
        return m15698r(kpzVar.mo14507b(), kpzVar.mo14509d());
    }

    /* JADX INFO: renamed from: r */
    public static String m15698r(int i, int i2) {
        return lme.m15725k(i) + "w" + i2;
    }

    /* JADX INFO: renamed from: s */
    public static kmh m15699s(String str, Throwable th) {
        return new kmh(str, th);
    }

    /* JADX INFO: renamed from: t */
    public static long m15700t(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            kky kkyVar = (kky) ((kgg) it.next());
            long jMo14451f = kkyVar.mo14451f();
            lku.m15659m(jMo14451f >= 0, "bytesPerImage() must be >= 0", new Object[0]);
            if (!kkyVar.mo14454i()) {
                j += jMo14451f;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m15702v(int i) {
        switch (i) {
            case 1:
                return "ERROR";
            case 2:
                return "DONE";
            case 3:
                return "NEEDS_MORE_INPUT";
            case 4:
                return "NEEDS_MORE_OUTPUT";
            case 5:
                return "OK";
            default:
                return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: w */
    public static int m15703w(pbf pbfVar, int i) {
        int i2;
        int[] iArr = pbfVar.f47325f;
        int length = pbfVar.f47324e.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = i + 1;
            i2 = (i3 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i4) {
                i3 = i2 + 1;
            } else {
                if (i5 <= i4) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return i2 ^ (-1);
                }
                length = i2 - 1;
            }
        }
        i2 = (-i3) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return i2 ^ (-1);
    }
}
