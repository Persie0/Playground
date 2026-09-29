package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class tjb {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f62427a;

    /* JADX INFO: renamed from: b */
    public static final Class f62428b;

    /* JADX INFO: renamed from: c */
    public static final sjb f62429c;

    /* JADX INFO: renamed from: d */
    public static final boolean f62430d;

    /* JADX INFO: renamed from: e */
    public static final long f62431e;

    /* JADX INFO: renamed from: f */
    public static final boolean f62432f;

    static {
        boolean z;
        sjb sjbVar;
        Unsafe unsafeM22164l = m22164l();
        f62427a = unsafeM22164l;
        int i = dhb.f35664a;
        f62428b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM22165m = m22165m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM22165m2 = m22165m(cls2);
        sjb qjbVar = null;
        if (unsafeM22164l != null) {
            if (zM22165m) {
                qjbVar = new rjb(unsafeM22164l);
            } else if (zM22165m2) {
                qjbVar = new qjb(unsafeM22164l);
            }
        }
        f62429c = qjbVar;
        if (qjbVar != null) {
            try {
                Class<?> cls3 = qjbVar.f60943a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m22153a();
            } catch (Throwable th) {
                Logger.getLogger(tjb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        sjb sjbVar2 = f62429c;
        if (sjbVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = sjbVar2.f60943a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(tjb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f62430d = z;
        f62431e = m22168p(byte[].class);
        m22168p(boolean[].class);
        m22169q(boolean[].class);
        m22168p(int[].class);
        m22169q(int[].class);
        m22168p(long[].class);
        m22169q(long[].class);
        m22168p(float[].class);
        m22169q(float[].class);
        m22168p(double[].class);
        m22169q(double[].class);
        m22168p(Object[].class);
        m22169q(Object[].class);
        Field fieldM22153a = m22153a();
        if (fieldM22153a != null && (sjbVar = f62429c) != null) {
            sjbVar.f60943a.objectFieldOffset(fieldM22153a);
        }
        f62432f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Field m22153a() {
        Field declaredField;
        Field declaredField2;
        int i = dhb.f35664a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX INFO: renamed from: b */
    public static void m22154b(Object obj, long j, byte b) {
        Unsafe unsafe = f62429c.f60943a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: c */
    public static void m22155c(Object obj, long j, byte b) {
        Unsafe unsafe = f62429c.f60943a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: d */
    public static Object m22156d(Class cls) {
        try {
            return f62427a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m22157e(Object obj, long j) {
        return f62429c.f60943a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m22158f(long j, Object obj, int i) {
        f62429c.f60943a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: g */
    public static long m22159g(Object obj, long j) {
        return f62429c.f60943a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static void m22160h(Object obj, long j, long j2) {
        f62429c.f60943a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: i */
    public static Object m22161i(Object obj, long j) {
        return f62429c.f60943a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public static void m22162j(Object obj, long j, Object obj2) {
        f62429c.f60943a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static void m22163k(byte[] bArr, long j, byte b) {
        f62429c.mo20004b(bArr, f62431e + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m22164l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pjb());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(tjb.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m22165m(Class cls) {
        int i = dhb.f35664a;
        try {
            Class cls2 = f62428b;
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

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m22166n(Object obj, long j) {
        return ((byte) ((f62429c.f60943a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m22167o(Object obj, long j) {
        return ((byte) ((f62429c.f60943a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static int m22168p(Class cls) {
        if (f62430d) {
            return f62429c.f60943a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m22169q(Class cls) {
        if (f62430d) {
            f62429c.f60943a.arrayIndexScale(cls);
        }
    }
}
