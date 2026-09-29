package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0d {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f38158a;

    /* JADX INFO: renamed from: b */
    public static final Class f38159b;

    /* JADX INFO: renamed from: c */
    public static final b0d f38160c;

    /* JADX INFO: renamed from: d */
    public static final boolean f38161d;

    /* JADX INFO: renamed from: e */
    public static final boolean f38162e;

    /* JADX INFO: renamed from: f */
    public static final long f38163f;

    /* JADX INFO: renamed from: g */
    public static final boolean f38164g;

    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0158 A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #1 {all -> 0x01a7, blocks: (B:34:0x0104, B:37:0x0158), top: B:55:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0225  */
    /* JADX WARN: Code duplicated, block: B:50:0x0227  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class cls;
        boolean z;
        Unsafe unsafe;
        Class<?> cls2;
        boolean z2;
        Field fieldM11446m;
        boolean z3;
        b0d b0dVar;
        Unsafe unsafeM11440g = m11440g();
        f38158a = unsafeM11440g;
        f38159b = wfc.f66783a;
        Class cls3 = Long.TYPE;
        boolean zM11444k = m11444k(cls3);
        Class cls4 = Integer.TYPE;
        boolean zM11444k2 = m11444k(cls4);
        b0d a0dVar = null;
        if (unsafeM11440g != null) {
            if (!wfc.m23932a()) {
                a0dVar = new a0d(unsafeM11440g);
            } else if (zM11444k) {
                a0dVar = new zzc(unsafeM11440g, 1);
            } else if (zM11444k2) {
                a0dVar = new zzc(unsafeM11440g, 0);
            }
        }
        f38160c = a0dVar;
        Class cls5 = Byte.TYPE;
        String str = "putByte";
        if (unsafeM11440g != null) {
            try {
                Class<?> cls6 = unsafeM11440g.getClass();
                cls = Field.class;
                try {
                    cls6.getMethod("objectFieldOffset", cls);
                    cls6.getMethod("getLong", Object.class, cls3);
                    if (m11446m() != null) {
                        if (!wfc.m23932a()) {
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
                    Logger logger = Logger.getLogger(f0d.class.getName());
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
            f38161d = z;
            unsafe = f38158a;
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
                    if (!wfc.m23932a()) {
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
                    Logger logger2 = Logger.getLogger(f0d.class.getName());
                    Level level2 = Level.WARNING;
                    String strValueOf2 = String.valueOf(th3);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 71);
                    sb2.append("platform method missing - proto runtime falling back to safer methods: ");
                    sb2.append(strValueOf2);
                    logger2.logp(level2, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
                    z2 = false;
                }
            }
            f38162e = z2;
            f38163f = m11439f(byte[].class);
            m11439f(boolean[].class);
            m11441h(boolean[].class);
            m11439f(int[].class);
            m11441h(int[].class);
            m11439f(long[].class);
            m11441h(long[].class);
            m11439f(float[].class);
            m11441h(float[].class);
            m11439f(double[].class);
            m11441h(double[].class);
            m11439f(Object[].class);
            m11441h(Object[].class);
            fieldM11446m = m11446m();
            if (fieldM11446m != null && (b0dVar = f38160c) != null) {
                b0dVar.f7743a.objectFieldOffset(fieldM11446m);
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z3 = true;
            } else {
                z3 = false;
            }
            f38164g = z3;
        }
        cls = Field.class;
        z = false;
        f38161d = z;
        unsafe = f38158a;
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
            if (!wfc.m23932a()) {
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
        f38162e = z2;
        f38163f = m11439f(byte[].class);
        m11439f(boolean[].class);
        m11441h(boolean[].class);
        m11439f(int[].class);
        m11441h(int[].class);
        m11439f(long[].class);
        m11441h(long[].class);
        m11439f(float[].class);
        m11441h(float[].class);
        m11439f(double[].class);
        m11441h(double[].class);
        m11439f(Object[].class);
        m11441h(Object[].class);
        fieldM11446m = m11446m();
        if (fieldM11446m != null) {
            b0dVar.f7743a.objectFieldOffset(fieldM11446m);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        } else {
            z3 = false;
        }
        f38164g = z3;
    }

    /* JADX INFO: renamed from: a */
    public static byte m11434a(byte[] bArr, long j) {
        return f38160c.mo25a(bArr, f38163f + j);
    }

    /* JADX INFO: renamed from: b */
    public static Object m11435b(Class cls) {
        try {
            return f38158a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11436c(long j, Object obj, int i) {
        f38160c.m3150b(j, obj, i);
    }

    /* JADX INFO: renamed from: d */
    public static void m11437d(Object obj, long j, Object obj2) {
        f38160c.f7743a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: e */
    public static void m11438e(byte[] bArr, long j, byte b) {
        f38160c.mo26c(bArr, f38163f + j, b);
    }

    /* JADX INFO: renamed from: f */
    public static int m11439f(Class cls) {
        if (f38162e) {
            return f38160c.f7743a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static Unsafe m11440g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0d());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m11441h(Class cls) {
        if (f38162e) {
            f38160c.f7743a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m11442i(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM3152k = f38160c.m3152k(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m11436c(j2, obj, ((255 & b) << i) | (iM3152k & (~(255 << i))));
    }

    /* JADX INFO: renamed from: j */
    public static void m11443j(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m11436c(j2, obj, ((255 & b) << i) | (f38160c.m3152k(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11444k(Class cls) {
        if (!wfc.m23932a()) {
            return false;
        }
        try {
            Class cls2 = f38159b;
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

    /* JADX INFO: renamed from: l */
    public static Object m11445l(Object obj, long j) {
        return f38160c.f7743a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: m */
    public static Field m11446m() {
        Field declaredField;
        Field declaredField2;
        if (wfc.m23932a()) {
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

    /* JADX INFO: renamed from: n */
    public static byte m11447n(Object obj, long j) {
        return (byte) (f38160c.m3152k(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: renamed from: o */
    public static byte m11448o(Object obj, long j) {
        return (byte) (f38160c.m3152k(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }
}
