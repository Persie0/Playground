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
public abstract class lkc {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f49784a;

    /* JADX INFO: renamed from: b */
    public static final Class f49785b;

    /* JADX INFO: renamed from: c */
    public static final sjb f49786c;

    /* JADX INFO: renamed from: d */
    public static final boolean f49787d;

    /* JADX INFO: renamed from: e */
    public static final boolean f49788e;

    /* JADX INFO: renamed from: f */
    public static final long f49789f;

    /* JADX INFO: renamed from: g */
    public static final boolean f49790g;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        sjb sjbVar;
        Unsafe unsafeM16340i = m16340i();
        f49784a = unsafeM16340i;
        int i = w1c.f66234a;
        f49785b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM16346o = m16346o(cls);
        Class cls2 = Integer.TYPE;
        boolean zM16346o2 = m16346o(cls2);
        sjb yjcVar = null;
        if (unsafeM16340i != null) {
            if (zM16346o) {
                yjcVar = new ckc(unsafeM16340i);
            } else if (zM16346o2) {
                yjcVar = new yjc(unsafeM16340i);
            }
        }
        f49786c = yjcVar;
        if (yjcVar == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = yjcVar.f60943a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m16333b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(lkc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f49787d = z;
        sjb sjbVar2 = f49786c;
        if (sjbVar2 == null) {
            z2 = false;
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
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(lkc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f49788e = z2;
        f49789f = m16347p(byte[].class);
        m16347p(boolean[].class);
        m16332a(boolean[].class);
        m16347p(int[].class);
        m16332a(int[].class);
        m16347p(long[].class);
        m16332a(long[].class);
        m16347p(float[].class);
        m16332a(float[].class);
        m16347p(double[].class);
        m16332a(double[].class);
        m16347p(Object[].class);
        m16332a(Object[].class);
        Field fieldM16333b = m16333b();
        if (fieldM16333b != null && (sjbVar = f49786c) != null) {
            sjbVar.f60943a.objectFieldOffset(fieldM16333b);
        }
        f49790g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m16332a(Class cls) {
        if (f49788e) {
            f49786c.f60943a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m16333b() {
        Field declaredField;
        Field declaredField2;
        int i = w1c.f66234a;
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

    /* JADX INFO: renamed from: c */
    public static void m16334c(Object obj, long j, byte b) {
        Unsafe unsafe = f49786c.f60943a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static void m16335d(Object obj, long j, byte b) {
        Unsafe unsafe = f49786c.f60943a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static int m16336e(Object obj, long j) {
        return f49786c.f60943a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static long m16337f(Object obj, long j) {
        return f49786c.f60943a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static Object m16338g(Class cls) {
        try {
            return f49784a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m16339h(Object obj, long j) {
        return f49786c.f60943a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m16340i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new tjc());
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
            Logger.getLogger(lkc.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m16341j(long j, Object obj, int i) {
        f49786c.f60943a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: k */
    public static void m16342k(Object obj, long j, long j2) {
        f49786c.f60943a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: l */
    public static void m16343l(Object obj, long j, Object obj2) {
        f49786c.f60943a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m16344m(Object obj, long j) {
        return ((byte) ((f49786c.f60943a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m16345n(Object obj, long j) {
        return ((byte) ((f49786c.f60943a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m16346o(Class cls) {
        int i = w1c.f66234a;
        try {
            Class cls2 = f49785b;
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

    /* JADX INFO: renamed from: p */
    public static int m16347p(Class cls) {
        if (f49788e) {
            return f49786c.f60943a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
