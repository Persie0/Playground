package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b5c {

    /* JADX INFO: renamed from: a */
    public static final Logger f7979a = Logger.getLogger(b5c.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f7980b;

    /* JADX INFO: renamed from: c */
    public static final Class f7981c;

    /* JADX INFO: renamed from: d */
    public static final w4c f7982d;

    /* JADX INFO: renamed from: e */
    public static final boolean f7983e;

    /* JADX INFO: renamed from: f */
    public static final boolean f7984f;

    /* JADX INFO: renamed from: g */
    public static final long f7985g;

    /* JADX INFO: renamed from: h */
    public static final boolean f7986h;

    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x0159 A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #3 {all -> 0x01a8, blocks: (B:34:0x0106, B:37:0x0159), top: B:77:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:4:0x0026  */
    /* JADX WARN: Code duplicated, block: B:58:0x0231  */
    /* JADX WARN: Code duplicated, block: B:66:0x0244  */
    /* JADX WARN: Code duplicated, block: B:67:0x0246  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        w4c v4cVar;
        Class cls;
        boolean z;
        Unsafe unsafe;
        Class<?> cls2;
        boolean z2;
        Field fieldM3316g;
        boolean z3;
        Field declaredField;
        Field field;
        boolean z4;
        w4c w4cVar;
        w4c w4cVar2;
        Unsafe unsafeM3315f = m3315f();
        f7980b = unsafeM3315f;
        f7981c = onb.f54625a;
        Class cls3 = Long.TYPE;
        boolean zM3319j = m3319j(cls3);
        Class cls4 = Integer.TYPE;
        boolean zM3319j2 = m3319j(cls4);
        if (unsafeM3315f == null) {
            v4cVar = null;
        } else if (!onb.m18176a()) {
            v4cVar = new v4c(unsafeM3315f);
        } else if (zM3319j) {
            v4cVar = new u4c(unsafeM3315f, 1);
        } else if (zM3319j2) {
            v4cVar = new u4c(unsafeM3315f, 0);
        } else {
            v4cVar = null;
        }
        f7982d = v4cVar;
        Class cls5 = Byte.TYPE;
        String str = "putByte";
        try {
            try {
                if (unsafeM3315f != null) {
                    try {
                        Class<?> cls6 = unsafeM3315f.getClass();
                        cls = Field.class;
                        try {
                            cls6.getMethod("objectFieldOffset", cls);
                            cls6.getMethod("getLong", Object.class, cls3);
                            if (m3316g() != null) {
                                if (!onb.m18176a()) {
                                    cls6.getMethod("getByte", cls3);
                                    cls6.getMethod("putByte", cls3, cls5);
                                    cls6.getMethod("getInt", cls3);
                                    cls6.getMethod("putInt", cls3, cls4);
                                    cls6.getMethod("getLong", cls3);
                                    cls6.getMethod("putLong", cls3, cls3);
                                    cls6.getMethod("copyMemory", cls3, cls3, cls3);
                                    cls6.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                                }
                                cls5 = cls5;
                                str = "putByte";
                                z = true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            Logger logger = f7979a;
                            Level level = Level.WARNING;
                            String strValueOf = String.valueOf(th);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
                            sb.append("platform method missing - proto runtime falling back to safer methods: ");
                            sb.append(strValueOf);
                            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cls = Field.class;
                    }
                    f7983e = z;
                    unsafe = f7980b;
                    if (unsafe == null) {
                        z2 = false;
                    } else {
                        try {
                            cls2 = unsafe.getClass();
                            cls2.getMethod("objectFieldOffset", cls);
                            cls2.getMethod("arrayBaseOffset", Class.class);
                            cls2.getMethod("arrayIndexScale", Class.class);
                            cls2.getMethod("getInt", Object.class, cls3);
                            cls2.getMethod("putInt", Object.class, cls3, cls4);
                            cls2.getMethod("getLong", Object.class, cls3);
                            cls2.getMethod("putLong", Object.class, cls3, cls3);
                            cls2.getMethod("getObject", Object.class, cls3);
                            cls2.getMethod("putObject", Object.class, cls3, Object.class);
                            if (!onb.m18176a()) {
                                cls2.getMethod("getByte", Object.class, cls3);
                                cls2.getMethod(str, Object.class, cls3, cls5);
                                cls2.getMethod("getBoolean", Object.class, cls3);
                                cls2.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                                cls2.getMethod("getFloat", Object.class, cls3);
                                cls2.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                                cls2.getMethod("getDouble", Object.class, cls3);
                                cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                            }
                            z2 = true;
                        } catch (Throwable th3) {
                            Logger logger2 = f7979a;
                            Level level2 = Level.WARNING;
                            String strValueOf2 = String.valueOf(th3);
                            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 71);
                            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                            sb2.append(strValueOf2);
                            logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                            z2 = false;
                        }
                    }
                    f7984f = z2;
                    f7985g = m3317h(byte[].class);
                    m3317h(boolean[].class);
                    m3318i(boolean[].class);
                    m3317h(int[].class);
                    m3318i(int[].class);
                    m3317h(long[].class);
                    m3318i(long[].class);
                    m3317h(float[].class);
                    m3318i(float[].class);
                    m3317h(double[].class);
                    m3318i(double[].class);
                    m3317h(Object[].class);
                    m3318i(Object[].class);
                    fieldM3316g = m3316g();
                    if (fieldM3316g != null && (w4cVar2 = f7982d) != null) {
                        w4cVar2.m23753a(fieldM3316g);
                    }
                    declaredField = String.class.getDeclaredField("value");
                    z3 = true;
                    declaredField.setAccessible(true);
                    if (declaredField == null && declaredField.getType() == char[].class) {
                        field = declaredField;
                    } else {
                        field = null;
                    }
                    if (field != null && (w4cVar = f7982d) != null) {
                        w4cVar.m23753a(field);
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    f7986h = z4;
                }
                cls = Field.class;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                declaredField = null;
            }
            declaredField = String.class.getDeclaredField("value");
            z3 = true;
        } catch (Throwable unused2) {
            z3 = true;
        }
        z = false;
        f7983e = z;
        unsafe = f7980b;
        if (unsafe == null) {
            z2 = false;
        } else {
            cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", cls);
            cls2.getMethod("arrayBaseOffset", Class.class);
            cls2.getMethod("arrayIndexScale", Class.class);
            cls2.getMethod("getInt", Object.class, cls3);
            cls2.getMethod("putInt", Object.class, cls3, cls4);
            cls2.getMethod("getLong", Object.class, cls3);
            cls2.getMethod("putLong", Object.class, cls3, cls3);
            cls2.getMethod("getObject", Object.class, cls3);
            cls2.getMethod("putObject", Object.class, cls3, Object.class);
            if (!onb.m18176a()) {
                cls2.getMethod("getByte", Object.class, cls3);
                cls2.getMethod(str, Object.class, cls3, cls5);
                cls2.getMethod("getBoolean", Object.class, cls3);
                cls2.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                cls2.getMethod("getFloat", Object.class, cls3);
                cls2.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                cls2.getMethod("getDouble", Object.class, cls3);
                cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
            }
            z2 = true;
        }
        f7984f = z2;
        f7985g = m3317h(byte[].class);
        m3317h(boolean[].class);
        m3318i(boolean[].class);
        m3317h(int[].class);
        m3318i(int[].class);
        m3317h(long[].class);
        m3318i(long[].class);
        m3317h(float[].class);
        m3318i(float[].class);
        m3317h(double[].class);
        m3318i(double[].class);
        m3317h(Object[].class);
        m3318i(Object[].class);
        fieldM3316g = m3316g();
        if (fieldM3316g != null) {
            w4cVar2.m23753a(fieldM3316g);
        }
        if (declaredField == null) {
            field = null;
        } else {
            field = null;
        }
        if (field != null) {
            w4cVar.m23753a(field);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z4 = z3;
        } else {
            z4 = false;
        }
        f7986h = z4;
    }

    /* JADX INFO: renamed from: a */
    public static byte m3310a(byte[] bArr, long j) {
        return f7982d.mo22465l(bArr, f7985g + j);
    }

    /* JADX INFO: renamed from: b */
    public static void m3311b(long j, Object obj, int i) {
        f7982d.m23754b(j, obj, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m3312c(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM23756g = f7982d.m23756g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m3311b(j2, obj, ((255 & b) << i) | (iM23756g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: d */
    public static void m3313d(Object obj, long j, Object obj2) {
        f7982d.f66399a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: e */
    public static void m3314e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m3311b(j2, obj, ((255 & b) << i) | (f7982d.m23756g(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: f */
    public static Unsafe m3315f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j5c());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m3316g() {
        Field declaredField;
        Field declaredField2;
        if (onb.m18176a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                declaredField2.setAccessible(true);
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: h */
    public static int m3317h(Class cls) {
        if (f7984f) {
            return f7982d.f66399a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static void m3318i(Class cls) {
        if (f7984f) {
            f7982d.f66399a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3319j(Class cls) {
        if (!onb.m18176a()) {
            return false;
        }
        try {
            Class cls2 = f7981c;
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

    /* JADX INFO: renamed from: k */
    public static Object m3320k(Object obj, long j) {
        return f7982d.f66399a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public static byte m3321l(Object obj, long j) {
        return (byte) (f7982d.m23756g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: renamed from: m */
    public static byte m3322m(Object obj, long j) {
        return (byte) (f7982d.m23756g(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
