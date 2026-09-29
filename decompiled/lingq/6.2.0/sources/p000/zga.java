package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class zga {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f71554a;

    /* JADX INFO: renamed from: b */
    public static final Class f71555b;

    /* JADX INFO: renamed from: c */
    public static final wga f71556c;

    /* JADX INFO: renamed from: d */
    public static final boolean f71557d;

    /* JADX INFO: renamed from: e */
    public static final boolean f71558e;

    /* JADX INFO: renamed from: f */
    public static final long f71559f;

    /* JADX INFO: renamed from: g */
    public static final boolean f71560g;

    static {
        Unsafe unsafeM25610j = m25610j();
        f71554a = unsafeM25610j;
        f71555b = AbstractC3037gg.f40753a;
        boolean zM25606f = m25606f(Long.TYPE);
        boolean zM25606f2 = m25606f(Integer.TYPE);
        wga tgaVar = null;
        if (unsafeM25610j != null) {
            if (!AbstractC3037gg.m12571a()) {
                tgaVar = new tga(unsafeM25610j);
            } else if (zM25606f) {
                tgaVar = new rga(unsafeM25610j);
            } else if (zM25606f2) {
                tgaVar = new oga(unsafeM25610j);
            }
        }
        f71556c = tgaVar;
        f71557d = tgaVar == null ? false : tgaVar.mo17990s();
        f71558e = tgaVar == null ? false : tgaVar.mo22028r();
        f71559f = m25603c(byte[].class);
        m25603c(boolean[].class);
        m25604d(boolean[].class);
        m25603c(int[].class);
        m25604d(int[].class);
        m25603c(long[].class);
        m25604d(long[].class);
        m25603c(float[].class);
        m25604d(float[].class);
        m25603c(double[].class);
        m25604d(double[].class);
        m25603c(Object[].class);
        m25604d(Object[].class);
        Field fieldM25605e = m25605e();
        if (fieldM25605e != null && tgaVar != null) {
            tgaVar.m23939j(fieldM25605e);
        }
        f71560g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m25601a(Throwable th) {
        Logger.getLogger(zga.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m25602b(Class cls) {
        try {
            return f71554a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m25603c(Class cls) {
        if (f71558e) {
            return f71556c.m23934a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m25604d(Class cls) {
        if (f71558e) {
            f71556c.m23935b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m25605e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC3037gg.m12571a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m25606f(Class cls) {
        if (!AbstractC3037gg.m12571a()) {
            return false;
        }
        try {
            Class cls2 = f71555b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte m25607g(byte[] bArr, long j) {
        return f71556c.mo17983d(bArr, f71559f + j);
    }

    /* JADX INFO: renamed from: h */
    public static byte m25608h(Object obj, long j) {
        return (byte) ((f71556c.m23936g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m25609i(Object obj, long j) {
        return (byte) ((f71556c.m23936g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m25610j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new lga());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m25611k(byte[] bArr, long j, byte b) {
        f71556c.mo17987l(bArr, f71559f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m25612l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM23936g = f71556c.m23936g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m25614n(obj, j2, ((255 & b) << i) | (iM23936g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m25613m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m25614n(obj, j2, ((255 & b) << i) | (f71556c.m23936g(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m25614n(Object obj, long j, int i) {
        f71556c.m23940o(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m25615o(Object obj, long j, Object obj2) {
        f71556c.m23942q(obj, j, obj2);
    }
}
