package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2812q8 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f14399a;

    /* JADX INFO: renamed from: b */
    public static final Class f14400b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2799p8 f14401c;

    /* JADX INFO: renamed from: d */
    public static final boolean f14402d;

    /* JADX INFO: renamed from: e */
    public static final boolean f14403e;

    /* JADX INFO: renamed from: f */
    public static final long f14404f;

    /* JADX INFO: renamed from: g */
    public static final boolean f14405g;

    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x0167  */
    static {
        AbstractC2799p8 c2773n8;
        boolean z10;
        boolean z11;
        AbstractC2799p8 abstractC2799p8;
        boolean z12;
        Field fieldM8214b;
        AbstractC2799p8 abstractC2799p9;
        Unsafe unsafeM8223k = m8223k();
        f14399a = unsafeM8223k;
        int i10 = C2783o5.f14362a;
        f14400b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zM8233u = m8233u(cls);
        boolean zM8233u2 = m8233u(Integer.TYPE);
        if (unsafeM8223k != null) {
            if (zM8233u) {
                c2773n8 = new C2786o8(unsafeM8223k);
            } else if (zM8233u2) {
                c2773n8 = new C2773n8(unsafeM8223k);
            }
            f14401c = c2773n8;
            z10 = true;
            if (c2773n8 == null) {
                z11 = false;
            } else {
                try {
                    Class<?> cls2 = c2773n8.f14391a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                    if (m8214b() == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    m8224l(th2);
                }
            }
            f14402d = z11;
            abstractC2799p8 = f14401c;
            if (abstractC2799p8 == null) {
                try {
                    Class<?> cls3 = abstractC2799p8.f14391a.getClass();
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("arrayBaseOffset", Class.class);
                    cls3.getMethod("arrayIndexScale", Class.class);
                    Class<?> cls4 = Long.TYPE;
                    cls3.getMethod("getInt", Object.class, cls4);
                    cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                    cls3.getMethod("getLong", Object.class, cls4);
                    cls3.getMethod("putLong", Object.class, cls4, cls4);
                    cls3.getMethod("getObject", Object.class, cls4);
                    cls3.getMethod("putObject", Object.class, cls4, Object.class);
                    z12 = true;
                } catch (Throwable th3) {
                    m8224l(th3);
                    z12 = false;
                }
                f14403e = z12;
                f14404f = m8235w(byte[].class);
                m8235w(boolean[].class);
                m8213a(boolean[].class);
                m8235w(int[].class);
                m8213a(int[].class);
                m8235w(long[].class);
                m8213a(long[].class);
                m8235w(float[].class);
                m8213a(float[].class);
                m8235w(double[].class);
                m8213a(double[].class);
                m8235w(Object[].class);
                m8213a(Object[].class);
                fieldM8214b = m8214b();
                if (fieldM8214b != null && (abstractC2799p9 = f14401c) != null) {
                    abstractC2799p9.f14391a.objectFieldOffset(fieldM8214b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                    z10 = false;
                }
                f14405g = z10;
            }
            z12 = false;
            f14403e = z12;
            f14404f = m8235w(byte[].class);
            m8235w(boolean[].class);
            m8213a(boolean[].class);
            m8235w(int[].class);
            m8213a(int[].class);
            m8235w(long[].class);
            m8213a(long[].class);
            m8235w(float[].class);
            m8213a(float[].class);
            m8235w(double[].class);
            m8213a(double[].class);
            m8235w(Object[].class);
            m8213a(Object[].class);
            fieldM8214b = m8214b();
            if (fieldM8214b != null) {
                abstractC2799p9.f14391a.objectFieldOffset(fieldM8214b);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z10 = false;
            }
            f14405g = z10;
        }
        c2773n8 = null;
        f14401c = c2773n8;
        z10 = true;
        if (c2773n8 == null) {
            z11 = false;
        } else {
            Class<?> cls5 = c2773n8.f14391a.getClass();
            cls5.getMethod("objectFieldOffset", Field.class);
            cls5.getMethod("getLong", Object.class, cls);
            if (m8214b() == null) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        f14402d = z11;
        abstractC2799p8 = f14401c;
        if (abstractC2799p8 == null) {
            Class<?> cls6 = abstractC2799p8.f14391a.getClass();
            cls6.getMethod("objectFieldOffset", Field.class);
            cls6.getMethod("arrayBaseOffset", Class.class);
            cls6.getMethod("arrayIndexScale", Class.class);
            Class<?> cls7 = Long.TYPE;
            cls6.getMethod("getInt", Object.class, cls7);
            cls6.getMethod("putInt", Object.class, cls7, Integer.TYPE);
            cls6.getMethod("getLong", Object.class, cls7);
            cls6.getMethod("putLong", Object.class, cls7, cls7);
            cls6.getMethod("getObject", Object.class, cls7);
            cls6.getMethod("putObject", Object.class, cls7, Object.class);
            z12 = true;
            f14403e = z12;
            f14404f = m8235w(byte[].class);
            m8235w(boolean[].class);
            m8213a(boolean[].class);
            m8235w(int[].class);
            m8213a(int[].class);
            m8235w(long[].class);
            m8213a(long[].class);
            m8235w(float[].class);
            m8213a(float[].class);
            m8235w(double[].class);
            m8213a(double[].class);
            m8235w(Object[].class);
            m8213a(Object[].class);
            fieldM8214b = m8214b();
            if (fieldM8214b != null) {
                abstractC2799p9.f14391a.objectFieldOffset(fieldM8214b);
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                z10 = false;
            }
            f14405g = z10;
        }
        z12 = false;
        f14403e = z12;
        f14404f = m8235w(byte[].class);
        m8235w(boolean[].class);
        m8213a(boolean[].class);
        m8235w(int[].class);
        m8213a(int[].class);
        m8235w(long[].class);
        m8213a(long[].class);
        m8235w(float[].class);
        m8213a(float[].class);
        m8235w(double[].class);
        m8213a(double[].class);
        m8235w(Object[].class);
        m8213a(Object[].class);
        fieldM8214b = m8214b();
        if (fieldM8214b != null) {
            abstractC2799p9.f14391a.objectFieldOffset(fieldM8214b);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z10 = false;
        }
        f14405g = z10;
    }

    /* JADX INFO: renamed from: a */
    public static void m8213a(Class cls) {
        if (f14403e) {
            f14401c.f14391a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m8214b() {
        Field declaredField;
        Field declaredField2;
        int i10 = C2783o5.f14362a;
        Field field = null;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                declaredField2 = null;
            }
            if (declaredField2 != null && declaredField2.getType() == Long.TYPE) {
                return declaredField2;
            }
        } else {
            field = declaredField;
        }
        return field;
    }

    /* JADX INFO: renamed from: c */
    public static void m8215c(Object obj, long j10, byte b10) {
        AbstractC2799p8 abstractC2799p8 = f14401c;
        long j11 = (-4) & j10;
        int i10 = abstractC2799p8.f14391a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC2799p8.f14391a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: renamed from: d */
    public static void m8216d(Object obj, long j10, byte b10) {
        AbstractC2799p8 abstractC2799p8 = f14401c;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC2799p8.f14391a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC2799p8.f14391a.getInt(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: renamed from: e */
    public static double m8217e(long j10, Object obj) {
        return f14401c.mo8127a(j10, obj);
    }

    /* JADX INFO: renamed from: f */
    public static float m8218f(long j10, Object obj) {
        return f14401c.mo8128b(j10, obj);
    }

    /* JADX INFO: renamed from: g */
    public static int m8219g(long j10, Object obj) {
        return f14401c.f14391a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: h */
    public static long m8220h(long j10, Object obj) {
        return f14401c.f14391a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: i */
    public static Object m8221i(Class cls) {
        try {
            return f14399a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m8222j(long j10, Object obj) {
        return f14401c.f14391a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: k */
    public static Unsafe m8223k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2759m8());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m8224l(Throwable th2) {
        Logger.getLogger(C2812q8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* JADX INFO: renamed from: m */
    public static void m8225m(Object obj, long j10, boolean z10) {
        f14401c.mo8129c(obj, j10, z10);
    }

    /* JADX INFO: renamed from: n */
    public static void m8226n(Object obj, long j10, double d10) {
        f14401c.mo8131e(obj, j10, d10);
    }

    /* JADX INFO: renamed from: o */
    public static void m8227o(Object obj, long j10, float f3) {
        f14401c.mo8132f(obj, j10, f3);
    }

    /* JADX INFO: renamed from: p */
    public static void m8228p(int i10, long j10, Object obj) {
        f14401c.f14391a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: q */
    public static void m8229q(Object obj, long j10, long j11) {
        f14401c.f14391a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: r */
    public static void m8230r(long j10, Object obj, Object obj2) {
        f14401c.f14391a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m8231s(long j10, Object obj) {
        return ((byte) ((f14401c.f14391a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m8232t(long j10, Object obj) {
        return ((byte) ((f14401c.f14391a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static boolean m8233u(Class cls) {
        int i10 = C2783o5.f14362a;
        try {
            Class cls2 = f14400b;
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

    /* JADX INFO: renamed from: v */
    public static boolean m8234v(long j10, Object obj) {
        return f14401c.mo8133g(j10, obj);
    }

    /* JADX INFO: renamed from: w */
    public static int m8235w(Class cls) {
        if (f14403e) {
            return f14401c.f14391a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
