package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a9d {

    /* JADX INFO: renamed from: b */
    public static final Charset f392b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final k58 f393c;

    /* JADX INFO: renamed from: d */
    public static final k58 f394d;

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f395e;

    /* JADX INFO: renamed from: f */
    public static final HashMap f396f;

    /* JADX INFO: renamed from: g */
    public static Boolean f397g;

    /* JADX INFO: renamed from: h */
    public static Long f398h;

    /* JADX INFO: renamed from: i */
    public static final plb f399i;

    /* JADX INFO: renamed from: a */
    public final Context f400a;

    static {
        String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        k58 k58Var = new k58(Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        f393c = k58Var;
        String strValueOf2 = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        f394d = new k58(Uri.parse(strValueOf2.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf2) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:sampling_", "LogSampling__");
        f395e = new ConcurrentHashMap();
        f396f = new HashMap();
        f397g = null;
        f398h = null;
        f399i = new plb(k58Var, "enable_log_sampling_rules", Boolean.FALSE, 0);
    }

    public a9d(Context context) {
        Context applicationContext;
        this.f400a = context;
        if (context == null || aib.f714g != null) {
            return;
        }
        synchronized (aib.f713f) {
            try {
                if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (aib.f714g != context) {
                    aib.f715h = null;
                }
                aib.f714g = context;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m192a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return ied.m13857d(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f392b);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j);
        return ied.m13857d(byteBufferAllocate.array());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m193b(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        if (j < 0) {
            j = ((j & Long.MAX_VALUE) % j3) + (Long.MAX_VALUE % j3) + 1;
        }
        return j % j3 < j2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m194c(Context context) {
        if (f397g == null) {
            f397g = Boolean.valueOf(m9b.m16702a(context).f66813a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f397g.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static long m195d(Context context) {
        Object obj;
        long jLongValue = 0;
        if (f398h == null) {
            if (context == null) {
                return 0L;
            }
            if (m194c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = xmd.f68367a;
                synchronized (xmd.class) {
                    xmd.m24617c(contentResolver);
                    obj = xmd.f68377k;
                }
                HashMap map = xmd.f68375i;
                Long lValueOf = (Long) xmd.m24615a(map, "android_id", 0L);
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    String strM24616b = xmd.m24616b(contentResolver, "android_id");
                    if (strM24616b != null) {
                        try {
                            long j = Long.parseLong(strM24616b);
                            lValueOf = Long.valueOf(j);
                            jLongValue = j;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    xmd.m24618d(obj, map, "android_id", lValueOf);
                }
                f398h = Long.valueOf(jLongValue);
            } else {
                f398h = 0L;
            }
        }
        return f398h.longValue();
    }
}
